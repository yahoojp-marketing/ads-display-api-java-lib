// DO NOT EDIT THIS FILE, THIS FILE IS AUTO GENERATED!
package jp.co.yahoo.adsdisplayapi.v16.oauth2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OAuth2TokenServiceTest {

  static {
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel","DEBUG");
  }

  @Mock
  private Cache mockCache;

  @Mock
  private RestTemplate mockRestTemplate;

  private OAuth2AccessTokenResponse cachedOAuth2AccessTokenResponse;

  private OAuth2AccessTokenResponse refreshedOAuth2AccessTokenResponse;

  private OAuth2TokenService target;

  @BeforeEach
  void init() {
    cachedOAuth2AccessTokenResponse = new OAuth2AccessTokenResponse();
    cachedOAuth2AccessTokenResponse.setAccessToken("cachedAccessToken");
    cachedOAuth2AccessTokenResponse.setExpiresIn(3600L);

    refreshedOAuth2AccessTokenResponse = new OAuth2AccessTokenResponse();
    refreshedOAuth2AccessTokenResponse.setAccessToken("refreshedAccessToken");
    refreshedOAuth2AccessTokenResponse.setExpiresIn(3600L);

    target = new OAuth2TokenService("testClientId", "testClientSecret", "testRefreshToken");
    target.setCache(this.mockCache);
    target.setRestTemplate(this.mockRestTemplate);
  }

  @Test
  void getAccessTokenNotFoundInCache() {
    // setup
    when(this.mockCache.get("testRefreshToken")).thenReturn(null);
    String url = "https://biz-oauth.yahoo.co.jp/oauth/v1/token?grant_type=refresh_token&client_id=testClientId&client_secret=testClientSecret&refresh_token=testRefreshToken";
    when(this.mockRestTemplate.getForObject(url, OAuth2AccessTokenResponse.class)).thenReturn(refreshedOAuth2AccessTokenResponse);

    assertEquals("refreshedAccessToken", target.getAccessToken());

    verify(this.mockCache, times(1)).get("testRefreshToken");
    verify(this.mockRestTemplate, times(1)).getForObject(url, OAuth2AccessTokenResponse.class);
    verify(this.mockCache, times(1)).put(eq("testRefreshToken"), argThat(oAuth2AccessTokenResponse ->
          "refreshedAccessToken".equals(oAuth2AccessTokenResponse.getAccessToken())
          && 3600 == oAuth2AccessTokenResponse.getExpiresIn()
          && System.currentTimeMillis() / 1000L >= oAuth2AccessTokenResponse.getIssuedAt()
          && (System.currentTimeMillis() / 1000L) - 1 <= oAuth2AccessTokenResponse.getIssuedAt() // Ensure in case assertions are delayed.
          )
        );
  }

  @Test
  void getAccessTokenIsExpired () {
    // setup
    cachedOAuth2AccessTokenResponse.setIssuedAt((System.currentTimeMillis() / 1000L) - 1801); // Expired.
    when(this.mockCache.get("testRefreshToken")).thenReturn(cachedOAuth2AccessTokenResponse);
    String url = "https://biz-oauth.yahoo.co.jp/oauth/v1/token?grant_type=refresh_token&client_id=testClientId&client_secret=testClientSecret&refresh_token=testRefreshToken";
    when(this.mockRestTemplate.getForObject(url, OAuth2AccessTokenResponse.class))
      .thenThrow(new RuntimeException())
      .thenThrow(new RuntimeException())
      .thenReturn(refreshedOAuth2AccessTokenResponse); // Retry 3 times with retryTemplate.

    assertEquals("refreshedAccessToken", target.getAccessToken());

    verify(this.mockCache, times(1)).get("testRefreshToken");
    verify(this.mockRestTemplate, times(3)).getForObject(url, OAuth2AccessTokenResponse.class);
    verify(this.mockCache, times(1)).put(eq("testRefreshToken"), argThat(oAuth2AccessTokenResponse ->
          "refreshedAccessToken".equals(oAuth2AccessTokenResponse.getAccessToken())
          && 3600 == oAuth2AccessTokenResponse.getExpiresIn()
          && System.currentTimeMillis() / 1000L >= oAuth2AccessTokenResponse.getIssuedAt()
          && (System.currentTimeMillis() / 1000L) - 1 <= oAuth2AccessTokenResponse.getIssuedAt() // Ensure in case assertions are delayed.
          )
        );
  }

  @Test
  void getAccessTokenNotExpired () {
    // setup
    cachedOAuth2AccessTokenResponse.setIssuedAt((System.currentTimeMillis() / 1000L) - 1799); // Not expired.
    when(this.mockCache.get("testRefreshToken")).thenReturn(cachedOAuth2AccessTokenResponse);

    assertEquals("cachedAccessToken", target.getAccessToken());

    verify(this.mockCache, times(1)).get("testRefreshToken");
  }

}

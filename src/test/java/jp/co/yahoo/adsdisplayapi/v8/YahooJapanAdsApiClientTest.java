// DO NOT EDIT THIS FILE, THIS FILE IS AUTO GENERATED!
package jp.co.yahoo.adsdisplayapi.v8;

import jp.co.yahoo.adsdisplayapi.v8.oauth2.OAuth2TokenService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.function.Try;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.platform.commons.util.ReflectionUtils.tryToReadFieldValue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class YahooJapanAdsApiClientTest {

  @Mock
  private OAuth2TokenService mockOAuth2TokenService;

  @Mock
  private HttpHeaders mockHttpHeaders;

  @Test
  void constructor() {
    // setup
    OAuth2TokenService oAuth2TokenService = new OAuth2TokenService(null, null, null);

    YahooJapanAdsApiClient target = new YahooJapanAdsApiClient(oAuth2TokenService);

    assertEquals(Try.success("Java/jp.co.yahoo.api-ads:ads-display-api-lib:3.1.1"),
        tryToReadFieldValue(YahooJapanAdsApiClient.class, "USER_AGENT", target)
    );
    assertEquals(Try.success(oAuth2TokenService),
        tryToReadFieldValue(YahooJapanAdsApiClient.class, "oAuth2TokenService", target)
    );
  }

  @Test
  void constructorWithRestTemplate() {
    // setup
    OAuth2TokenService oAuth2TokenService = new OAuth2TokenService(null, null, null);
    RestTemplate restTemplate = new RestTemplate();

    YahooJapanAdsApiClient target = new YahooJapanAdsApiClient(oAuth2TokenService, restTemplate);

    assertEquals(Try.success("Java/jp.co.yahoo.api-ads:ads-display-api-lib:3.1.1"),
        tryToReadFieldValue(YahooJapanAdsApiClient.class, "USER_AGENT", target)
    );
    assertEquals(Try.success(oAuth2TokenService),
        tryToReadFieldValue(YahooJapanAdsApiClient.class, "oAuth2TokenService", target)
    );
    assertEquals(Try.success(restTemplate),
        tryToReadFieldValue(ApiClient.class, "restTemplate", target)
    );
  }

  @Test
  void updateParamsForAuth() {
    // setup
    when(this.mockOAuth2TokenService.getAccessToken()).thenReturn("testAccessToken");
    YahooJapanAdsApiClient target = new YahooJapanAdsApiClient(this.mockOAuth2TokenService);

    assertDoesNotThrow(() -> target.updateParamsForAuth(null, null, this.mockHttpHeaders, null));

    verify(this.mockOAuth2TokenService, times(1)).getAccessToken();
    verify(this.mockHttpHeaders, times(1)).add(eq(HttpHeaders.AUTHORIZATION), eq("Bearer testAccessToken"));
  }

}

// DO NOT EDIT THIS FILE, THIS FILE IS AUTO GENERATED!
package jp.co.yahoo.adsdisplayapi.v6.oauth2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class OAuth2TokenService {

  private static final Logger log = LoggerFactory.getLogger(OAuth2TokenService.class);

  private static final String PROP_MAX_ATTEMPTS     = "jp.co.yahoo.adsdisplayapi.oauth2.retry.max_attempts";
  private static final String PROP_INITIAL_INTERVAL = "jp.co.yahoo.adsdisplayapi.oauth2.retry.initial_interval";
  private static final String PROP_MULTIPLIER       = "jp.co.yahoo.adsdisplayapi.oauth2.retry.multiplier";
  private static final String PROP_MAX_INTERVAL     = "jp.co.yahoo.adsdisplayapi.oauth2.retry.max_interval";

  private static final String DEFAULT_MAX_ATTEMPTS     = "3";
  private static final String DEFAULT_INITIAL_INTERVAL = "1000";
  private static final String DEFAULT_MULTIPLIER       = "2";
  private static final String DEFAULT_MAX_INTERVAL     = "2000";

  private final String clientId;
  private final String clientSecret;
  private final String refreshToken;

  private Cache cache = Cache.getInstance();

  private String oAuthTokenUrl = "https://biz-oauth.yahoo.co.jp/oauth/v1/token";

  private RetryTemplate retryTemplate = RetryTemplate.builder()
    .maxAttempts(Integer.parseInt(System.getProperty(PROP_MAX_ATTEMPTS, DEFAULT_MAX_ATTEMPTS)))
    .exponentialBackoff(
        Integer.parseInt(System.getProperty(PROP_INITIAL_INTERVAL, DEFAULT_INITIAL_INTERVAL)),
        Double.parseDouble(System.getProperty(PROP_MULTIPLIER, DEFAULT_MULTIPLIER)),
        Integer.parseInt(System.getProperty(PROP_MAX_INTERVAL, DEFAULT_MAX_INTERVAL))
        )
    .build();

  private RestTemplate restTemplate = new RestTemplate();

  public OAuth2TokenService(String clientId, String clientSecret, String refreshToken) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.refreshToken = refreshToken;
  }

  public Cache getCache() {
    return cache;
  }

  public void setCache(Cache cache) {
    this.cache = cache;
  }

  public String getOAuthTokenUrl() {
    return oAuthTokenUrl;
  }

  public void setOAuthTokenUrl(String oAuthTokenUrl) {
    this.oAuthTokenUrl = oAuthTokenUrl;
  }

  public RetryTemplate getRetryTemplate() {
    return retryTemplate;
  }

  public void setRetryTemplate(RetryTemplate retryTemplate) {
    this.retryTemplate = retryTemplate;
  }

  public RestTemplate getRestTemplate() {
    return restTemplate;
  }

  public void setRestTemplate(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  /**
   * Retrieve access token from cache or API.
   * Update cache if retrieved from API.
   * @return Access token
   */
  public String getAccessToken() {
    synchronized (Cache.class) {
      log.debug("Try retrieve access token from cache.");
      OAuth2AccessTokenResponse oAuth2AccessTokenResponse = this.cache.get(this.refreshToken);
      if (oAuth2AccessTokenResponse == null || isExpired(oAuth2AccessTokenResponse)) {
        log.debug("Access token not found in cache or access token was expired. Refresh access token.");
        OAuth2AccessTokenResponse refreshedOAuth2AccessTokenResponse = refresh();
        return refreshedOAuth2AccessTokenResponse.getAccessToken();
      }
      log.debug("Access token found in cache. Use cache data.");
      return oAuth2AccessTokenResponse.getAccessToken();
    }
  }

  /**
   * Check access token has expired or not.
   *
   * @param oAuth2AccessTokenResponse
   * @return if access token has expired, return true
   */
  private boolean isExpired(OAuth2AccessTokenResponse oAuth2AccessTokenResponse) {
    long bufferSec = 1800L;
    long expiresAt = oAuth2AccessTokenResponse.getIssuedAt() + (oAuth2AccessTokenResponse.getExpiresIn() - bufferSec);
    long now = System.currentTimeMillis() / 1000L;

    return expiresAt < now;
  }

  /**
   * Retrieve access token from API and store it in cache.
   *
   * @return retrieved token
   */
  private OAuth2AccessTokenResponse refresh() {
    // Retrieve access token from API.
    OAuth2AccessTokenResponse oAuth2AccessTokenResponse = getAccessTokenFromAPI();

    // Store in cache.
    oAuth2AccessTokenResponse.setIssuedAt(System.currentTimeMillis() / 1000L); // set current unixtime to check expiration.
    this.cache.put(this.refreshToken, oAuth2AccessTokenResponse);

    return oAuth2AccessTokenResponse;
  }

  /**
   * Retrieve access token from API.
   *
   * @see https://ads-developers.yahoo.co.jp/developercenter/ja/startup-guide/api-call.html
   * @return retrieved token
   */
  private OAuth2AccessTokenResponse getAccessTokenFromAPI() {
    String url = UriComponentsBuilder.fromUriString(this.oAuthTokenUrl)
      .queryParam("grant_type", "refresh_token")
      .queryParam("client_id", this.clientId)
      .queryParam("client_secret", this.clientSecret)
      .queryParam("refresh_token", this.refreshToken)
      .toUriString();
    return retryTemplate.execute(retryContext -> restTemplate.getForObject(url, OAuth2AccessTokenResponse.class));
  }

}

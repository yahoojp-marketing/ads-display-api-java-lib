// DO NOT EDIT THIS FILE, THIS FILE IS AUTO GENERATED!
package jp.co.yahoo.adsdisplayapi.v12.oauth2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Cache {

  private static final Cache instance = new Cache();

  private final ConcurrentMap<String, OAuth2AccessTokenResponse> cacheMap;

  private Cache() {
    this.cacheMap = new ConcurrentHashMap<>();
  }

  // Singleton
  public static Cache getInstance() {
    return instance;
  }

  public OAuth2AccessTokenResponse get(String key) {
    return this.cacheMap.get(key);
  }

  public void put(String key, OAuth2AccessTokenResponse value) {
    this.cacheMap.put(key, value);
  }

}

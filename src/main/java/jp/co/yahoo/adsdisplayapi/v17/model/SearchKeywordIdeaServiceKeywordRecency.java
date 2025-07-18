/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordIdeaServiceKeywordRecencyは、サーチキーワードの有効期間を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordIdeaServiceKeywordRecency is an object for storing the effective period information of Search Keyword.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WITHIN_1DAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;1日以内です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;within one day&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WITHIN_3DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;3日以内です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;for three days&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WITHIN_7DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;7日以内です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;for seven days&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WITHIN_14DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;14日以内です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;for fourteen days&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WITHIN_30DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;30日以内です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;for thirty days&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum SearchKeywordIdeaServiceKeywordRecency {
  
  WITHIN_1DAY("WITHIN_1DAY"),
  
  WITHIN_3DAYS("WITHIN_3DAYS"),
  
  WITHIN_7DAYS("WITHIN_7DAYS"),
  
  WITHIN_14DAYS("WITHIN_14DAYS"),
  
  WITHIN_30DAYS("WITHIN_30DAYS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordIdeaServiceKeywordRecency(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SearchKeywordIdeaServiceKeywordRecency fromValue(String value) {
    for (SearchKeywordIdeaServiceKeywordRecency b : SearchKeywordIdeaServiceKeywordRecency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


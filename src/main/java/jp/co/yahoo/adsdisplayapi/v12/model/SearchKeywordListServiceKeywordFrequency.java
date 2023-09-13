/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; SearchKeywordListServiceKeywordFrequencyは、サーチキーワードの検索回数を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※ADD時のデフォルト設定値はONCE_OR_MOREとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; SearchKeywordListServiceKeywordFrequency is an object for storing the search frequency information on Search Keyword.&lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *The default value in ADD operation will be ONCE_OR_MORE. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ONCE_OR_MORE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;1回以上。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;once or more&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TWICE_OR_MORE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;2回以上。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;twice or more&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;THREE_TIMES_OR_MORE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;3回以上。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;three times or more&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum SearchKeywordListServiceKeywordFrequency {
  
  ONCE_OR_MORE("ONCE_OR_MORE"),
  
  TWICE_OR_MORE("TWICE_OR_MORE"),
  
  THREE_TIMES_OR_MORE("THREE_TIMES_OR_MORE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordListServiceKeywordFrequency(String value) {
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
  public static SearchKeywordListServiceKeywordFrequency fromValue(String value) {
    for (SearchKeywordListServiceKeywordFrequency b : SearchKeywordListServiceKeywordFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


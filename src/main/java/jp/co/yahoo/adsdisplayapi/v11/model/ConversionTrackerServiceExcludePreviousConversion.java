/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceExcludePreviousConversionは、コンバージョンラベルが設定されていないコンバージョンタグを含むコンバージョン設定を除外するかどうかを表すフラグです。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。GET時のデフォルト設定値はFALSEとなります。&lt;br&gt; *コンバージョンラベルが設定されていないコンバージョンタグを含むコンバージョン設定は、キャンペーンに紐づけることはできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceExcludePreviousConversion is a flag that indicates whether to include conversion tracker information that includes conversion tag which conversion label is not set.&lt;br&gt; This field is optional in requests. The default value in GET operation will be FALSE.&lt;br&gt; Conversion tracker information including previous conversion tags cannot be linked to a campaign. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンラベルが設定されていないコンバージョンタグを除外します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Exclude conversion tags which conversion label is not set.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンラベルが設定されていないコンバージョンタグを除外しません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Does not Exclude conversion tags which conversion label is not set.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ConversionTrackerServiceExcludePreviousConversion {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceExcludePreviousConversion(String value) {
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
  public static ConversionTrackerServiceExcludePreviousConversion fromValue(String value) {
    for (ConversionTrackerServiceExcludePreviousConversion b : ConversionTrackerServiceExcludePreviousConversion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


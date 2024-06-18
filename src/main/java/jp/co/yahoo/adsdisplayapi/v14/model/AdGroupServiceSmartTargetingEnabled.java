/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceSmartTargetingEnabledは、スマートターゲティングのフラグです。&lt;br&gt; 設定値が「TRUE」の場合、有効になります。&lt;br&gt; ADD時およびSET時、このフィールドは省略可能となります。その際、ADD時のデフォルト設定値はFALSEとなります。&lt;br&gt; スマートターゲティングの詳細については、&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000047178?language&#x3D;ja\&quot;&gt;ヘルプ&lt;/a&gt;を参照してください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceSmartTargetingEnabled is a flag for smart targeting.&lt;br&gt; If the set value is &#39;TRUE&#39;, the value will be valid.&lt;br&gt; This field is optional in ADD and SET operation. The default value in ADD operation will be FALSE.&lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000047178?language&#x3D;en_US\&quot;&gt;Help page&lt;/a&gt; for more details about smart targeting. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;有効&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Valid.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;無効&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Invalid.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupServiceSmartTargetingEnabled {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceSmartTargetingEnabled(String value) {
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
  public static AdGroupServiceSmartTargetingEnabled fromValue(String value) {
    for (AdGroupServiceSmartTargetingEnabled b : AdGroupServiceSmartTargetingEnabled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


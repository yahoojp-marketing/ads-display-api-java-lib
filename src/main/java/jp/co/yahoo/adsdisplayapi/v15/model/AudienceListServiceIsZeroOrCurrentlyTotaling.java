/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceIsZeroOrCurrentlyTotalingはリーチが0もしくはリストが集計中かどうかを表します。&lt;br&gt; このフラグがTRUEかつdeliveryStatusがPAUSEDの場合に&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044408?language&#x3D;ja#c03\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ヘルプ&lt;/a&gt;に記載の「リストが未連携の状態」の可能性があります。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceIsZeroOrCurrentlyTotaling displays whether the reach is 0 or the list is currently being counted.&lt;br&gt; When this flag is TRUE and the deliveryStatus is PAUSED, there is a possibility that the &#39;list is in an unlinked state&#39; as mentioned in &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044408?language&#x3D;en_US#c03\&quot; target&#x3D;\&quot;_blank\&quot;&gt;the help documentation&lt;/a&gt;.&lt;br&gt; Although this field will be returned in the response, it will be ignored on request. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;リーチが0もしくはリストが集計中です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The reach is 0 or the list is currently being counted.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;リーチが蓄積されています。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The reach is being accumulated.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AudienceListServiceIsZeroOrCurrentlyTotaling {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceIsZeroOrCurrentlyTotaling(String value) {
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
  public static AudienceListServiceIsZeroOrCurrentlyTotaling fromValue(String value) {
    for (AudienceListServiceIsZeroOrCurrentlyTotaling b : AudienceListServiceIsZeroOrCurrentlyTotaling.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

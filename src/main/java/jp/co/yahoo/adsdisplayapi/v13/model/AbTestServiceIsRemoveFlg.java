/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AbTestServiceIsRemoveFlgは、項目を削除するフラグです。&lt;br&gt; 設定値が「TRUE」の場合、設定されている値が無効になります。&lt;br&gt; このフィールドは、ADD時は無視され、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AbTestServiceIsRemoveFlg is a flag for removing an information item.&lt;br&gt; If the set value is &#39;TRUE&#39;, the set value will be invalid.&lt;br&gt; This field will be ignored in ADD operation, and will be optional in SET operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;項目の削除。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Removes the information item.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;項目の削除なし。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Not remove the information item.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AbTestServiceIsRemoveFlg {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AbTestServiceIsRemoveFlg(String value) {
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
  public static AbTestServiceIsRemoveFlg fromValue(String value) {
    for (AbTestServiceIsRemoveFlg b : AbTestServiceIsRemoveFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


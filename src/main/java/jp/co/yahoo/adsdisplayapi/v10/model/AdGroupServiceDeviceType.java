/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceDeviceTypeは、配信先デバイスの種類を表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ただし、キャンペーン目的「アプリ訴求」の場合は、NONEとDESKTOPを指定することはできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceDeviceType displays types of devices to be posted on.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; If campaignGoal is APP_PROMOTION, \&quot;NONE\&quot; and \&quot;DESKTOP\&quot; cannot be specified. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DESKTOP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;PC&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;PC&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WAP_MOBILE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;従来型携帯電話（フィーチャーフォン）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Contemporary mobile phones (Feature Phone)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SMARTPHONE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;スマートフォン&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Smartphones&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TABLET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;タブレット&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Tablet device&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NONE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;すべてのデバイスに配信&lt;br&gt;※AdGroupServiceのみ設定可能&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Deliver to all usable devices.&lt;br&gt;*Setting NONE is only available for AdGroupService.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupServiceDeviceType {
  
  DESKTOP("DESKTOP"),
  
  WAP_MOBILE("WAP_MOBILE"),
  
  SMARTPHONE("SMARTPHONE"),
  
  TABLET("TABLET"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceDeviceType(String value) {
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
  public static AdGroupServiceDeviceType fromValue(String value) {
    for (AdGroupServiceDeviceType b : AdGroupServiceDeviceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


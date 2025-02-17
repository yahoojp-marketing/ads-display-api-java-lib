/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョン単価の計算に使用するコンバージョン（SKAdNetwork計測）です。&lt;br&gt; ADDおよびSET時、このフィールドは任意で指定できます。&lt;br&gt; ADD時デフォルト値はSKAN_INSTALLSを指定します。&lt;br&gt; ※skanOptimaizeAdDeliveryEnabledがTRUEかつ、targetCpaが指定されている場合に設定が可能となります。&lt;br&gt; 詳細は、「&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044265?language&#x3D;ja\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;iOSアプリのSKAdNetwork計測対応について&lt;/a&gt;」を参照してください。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversions to adjust target value (SKAdNetwork)&lt;br&gt; This field can be optionally specified in ADD and SET operation.&lt;br&gt; If not specified during ADD, the default setting is SKAN_INSTALLS.&lt;br&gt; *This setting can only be configured if skanOptimaizeAdDeliveryEnabled is set to TRUE and a targetCpa has been specified.&lt;br&gt; More details are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044265?language&#x3D;en_US\&quot;&gt;SKAdNetwork tracking support for iOS app&lt;/a&gt;.&lt;br&gt; &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SKAN_INSTALLS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;インストール数（SKAN）&lt;span lang&#x3D;\&quot;ja\&quot;&gt;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Installs (SKAN)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SKAN_INSTALLS_VIA_CLICK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;インストール数（SKANクリック経由）&lt;span lang&#x3D;\&quot;ja\&quot;&gt;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Installs (SKAN via click)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt;
 */
public enum CampaignServiceSkanTcpaTargetType {
  
  SKAN_INSTALLS("SKAN_INSTALLS"),
  
  SKAN_INSTALLS_VIA_CLICK("SKAN_INSTALLS_VIA_CLICK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceSkanTcpaTargetType(String value) {
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
  public static CampaignServiceSkanTcpaTargetType fromValue(String value) {
    for (CampaignServiceSkanTcpaTargetType b : CampaignServiceSkanTcpaTargetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


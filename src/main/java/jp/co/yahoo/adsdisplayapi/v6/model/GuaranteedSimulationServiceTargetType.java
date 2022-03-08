/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceTargetTypeは、ターゲティングの種別を表します。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceTargetType serves types of targets.&lt;br&gt; This field is required in requests. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_SCHEDULE_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;曜日・時間帯ターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Day of Week / Hours Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GEO_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;地域ターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Geographic Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AGE_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;年齢ターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Age Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GENDER_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;性別ターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Gender Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEVICE_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;デバイスターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Device Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ウェブ/アプリターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Web/App Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;OS_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;OSターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;OS Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AUDIENCE_CATEGORY_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスカテゴリターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Audience Category Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLACEMENT_CATEGORY_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;プレイスメントカテゴリターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Placement Category Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLACEMENT_CATEGORY_DETAIL_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;プレイスメントカテゴリ詳細ターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Placement Category Detail Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;POSITION_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ポジションターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Position Targeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SITE_RETARGETING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;サイトリターゲティング&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Site Retargeting&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum GuaranteedSimulationServiceTargetType {
  
  AD_SCHEDULE_TARGET("AD_SCHEDULE_TARGET"),
  
  GEO_TARGET("GEO_TARGET"),
  
  AGE_TARGET("AGE_TARGET"),
  
  GENDER_TARGET("GENDER_TARGET"),
  
  DEVICE_TARGET("DEVICE_TARGET"),
  
  APP_TARGET("APP_TARGET"),
  
  OS_TARGET("OS_TARGET"),
  
  AUDIENCE_CATEGORY_TARGET("AUDIENCE_CATEGORY_TARGET"),
  
  PLACEMENT_CATEGORY_TARGET("PLACEMENT_CATEGORY_TARGET"),
  
  PLACEMENT_CATEGORY_DETAIL_TARGET("PLACEMENT_CATEGORY_DETAIL_TARGET"),
  
  POSITION_TARGET("POSITION_TARGET"),
  
  SITE_RETARGETING("SITE_RETARGETING"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceTargetType(String value) {
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
  public static GuaranteedSimulationServiceTargetType fromValue(String value) {
    for (GuaranteedSimulationServiceTargetType b : GuaranteedSimulationServiceTargetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceAgeは、年代を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceAge displays ages.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE13_14&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;13歳から14歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 13 to 14. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE15_17&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;15歳から17歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 15 to 17. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE18_19&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;18歳から19歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 18 to 19. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE20_21&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;20歳から21歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 20 to 21. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE22_29&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;22歳から29歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 22 to 29. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE30_39&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;30歳から39歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 30 to 39. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE40_49&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;40歳から49歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 40 to 49. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE50_59&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;50歳から59歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 50 to 59. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE60_69&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;60歳から69歳です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 60 to 69. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE70_UL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;70歳以上です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;70 and up. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;年齢不明です。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;GuaranteedInventoryServiceAge unknown. * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE15_19&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;15歳から19歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 15 to 19.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE20_24&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;20歳から24歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 20 to 24.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE25_29&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;25歳から29歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 25 to 29.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE30_34&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;30歳から34歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 30 to 34.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE35_39&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;35歳から39歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 35 to 39.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE40_44&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;40歳から44歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 40 to 44.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE45_49&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;45歳から49歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 45 to 49.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE50_54&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;50歳から54歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 50 to 54.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE55_59&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;55歳から59歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 55 to 59.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE60_64&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;60歳から64歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 60 to 64.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE65_69&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;65歳から69歳です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;From 65 to 69.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_RANGE70_UL2&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;70歳以上です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;70 and up.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GT_UNKNOWN2&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;年齢不明です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceAge unknown.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum GuaranteedInventoryServiceAge {
  
  GT_RANGE13_14("GT_RANGE13_14"),
  
  GT_RANGE15_17("GT_RANGE15_17"),
  
  GT_RANGE18_19("GT_RANGE18_19"),
  
  GT_RANGE20_21("GT_RANGE20_21"),
  
  GT_RANGE22_29("GT_RANGE22_29"),
  
  GT_RANGE30_39("GT_RANGE30_39"),
  
  GT_RANGE40_49("GT_RANGE40_49"),
  
  GT_RANGE50_59("GT_RANGE50_59"),
  
  GT_RANGE60_69("GT_RANGE60_69"),
  
  GT_RANGE70_UL("GT_RANGE70_UL"),
  
  GT_UNKNOWN("GT_UNKNOWN"),
  
  GT_RANGE15_19("GT_RANGE15_19"),
  
  GT_RANGE20_24("GT_RANGE20_24"),
  
  GT_RANGE25_29("GT_RANGE25_29"),
  
  GT_RANGE30_34("GT_RANGE30_34"),
  
  GT_RANGE35_39("GT_RANGE35_39"),
  
  GT_RANGE40_44("GT_RANGE40_44"),
  
  GT_RANGE45_49("GT_RANGE45_49"),
  
  GT_RANGE50_54("GT_RANGE50_54"),
  
  GT_RANGE55_59("GT_RANGE55_59"),
  
  GT_RANGE60_64("GT_RANGE60_64"),
  
  GT_RANGE65_69("GT_RANGE65_69"),
  
  GT_RANGE70_UL2("GT_RANGE70_UL2"),
  
  GT_UNKNOWN2("GT_UNKNOWN2"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceAge(String value) {
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
  public static GuaranteedInventoryServiceAge fromValue(String value) {
    for (GuaranteedInventoryServiceAge b : GuaranteedInventoryServiceAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


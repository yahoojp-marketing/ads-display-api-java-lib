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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceReportTypeは、レポートタイプを表します。&lt;br&gt;   ADD時、ReportDefinitionServiceReportTypeの指定は不要です。ただし、以下のレポートを取得する場合は、対応するReportDefinitionServiceReportTypeをReportDefinitionServiceReportTypeConditionで指定する必要があります。&lt;br&gt;   - コンバージョン経路レポートの場合: &lt;code&gt;CONVERSION_PATH&lt;/code&gt;&lt;br&gt;   - 横断リーチレポートの場合: &lt;code&gt;CROSS_CAMPAIGN_REACHES&lt;/code&gt;&lt;br&gt;   - リーチレポートの場合: &lt;code&gt;REACH&lt;/code&gt;&lt;br&gt;   - アトリビューションモデル比較レポートの場合: &lt;code&gt;MODEL_COMPARISON&lt;/code&gt;&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceReportType serves category type of report.&lt;br&gt;   No need to specify ReportDefinitionServiceReportType in ADD operation. However, if you want to get the following report, you need to specify the corresponding ReportDefinitionServiceReportType in ReportDefinitionServiceReportTypeCondition.&lt;br&gt;   - Conversion Path Report: &lt;code&gt;CONVERSION_PATH&lt;/code&gt;&lt;br&gt;   - Cross-campaign Reach Report: &lt;code&gt;CROSS_CAMPAIGN_REACHES&lt;/code&gt;&lt;br&gt;   - Reach Report: &lt;code&gt;REACH&lt;/code&gt;&lt;br&gt;   - Attribution Model Comparison Report: &lt;code&gt;MODEL_COMPARISON&lt;/code&gt;&lt;br&gt;   Only &lt;code&gt;CONVERSION_PATH&lt;/code&gt;,&lt;code&gt;CROSS_CAMPAIGN_REACHES&lt;/code&gt;,&lt;code&gt;REACH&lt;/code&gt; and &lt;code&gt;MODEL_COMPARISON&lt;/code&gt; can be specified in ADD operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;以下のレポートを表します：&lt;br&gt;・アカウントレポート&lt;br&gt;・キャンペーンレポート&lt;br&gt;・広告グループレポート&lt;br&gt;・広告レポート&lt;br&gt;・リンク先URLレポート&lt;br&gt;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Represents the type of report below:&lt;br&gt;・Account Report&lt;br&gt;・Campaign Report&lt;br&gt;・Ad Group Report&lt;br&gt;・Ad Report&lt;br&gt;・Destination URL Report&lt;br&gt;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AUDIENCE_CATEGORY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスカテゴリーレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Audience Category Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONVERSION_PATH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン経路レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Conversion Path Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CROSS_CAMPAIGN_REACHES&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;横断リーチレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Cross-campaign Reach Report. &lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AUDIENCE_LIST_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスリストターゲティングレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Audience List Targeting Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SEARCH_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;サーチターゲティングレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Search Targeting Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLACEMENT_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;プレイスメントターゲティングレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Placement Targeting Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LABEL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ラベルレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Label Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SITE_CATEGORY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;サイトカテゴリーレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Site Category Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REACH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;リーチレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reach Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;配信先URLレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad Delivery URL Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MODEL_COMPARISON&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アトリビューションモデル比較レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Attribution Model Comparison Report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ReportDefinitionServiceReportType {
  
  AD("AD"),
  
  AUDIENCE_CATEGORY("AUDIENCE_CATEGORY"),
  
  CONVERSION_PATH("CONVERSION_PATH"),
  
  CROSS_CAMPAIGN_REACHES("CROSS_CAMPAIGN_REACHES"),
  
  AUDIENCE_LIST_TARGET("AUDIENCE_LIST_TARGET"),
  
  SEARCH_TARGET("SEARCH_TARGET"),
  
  PLACEMENT_TARGET("PLACEMENT_TARGET"),
  
  LABEL("LABEL"),
  
  REACH("REACH"),
  
  SITE_CATEGORY("SITE_CATEGORY"),
  
  URL("URL"),
  
  MODEL_COMPARISON("MODEL_COMPARISON"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportType(String value) {
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
  public static ReportDefinitionServiceReportType fromValue(String value) {
    for (ReportDefinitionServiceReportType b : ReportDefinitionServiceReportType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


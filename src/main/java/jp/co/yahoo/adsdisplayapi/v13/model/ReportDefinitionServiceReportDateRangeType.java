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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceReportDateRangeTypeは、レポートの集計対象期間を表します。&lt;br&gt; このフィールドは、ADD時に必須となり、REMOVE時に無視されます。&lt;br&gt; 本日分を含む実績値を取得する(TODAY/CUSTOM_DATEで本日を含む)場合、以下の制約があります。&lt;br&gt; - 本日分の実績値は、その時点での速報値です。取得タイミングによって速報値は変動するため、4〜5時間前の実績値となる可能性があります。&lt;br&gt; - StatsServiceや広告管理ツールによる本日分の実績値とは、数値が異なる可能性があります。&lt;br&gt; - フリークエンシーレポートとリーチレポートでは、本日分の実績値は取得できません。&lt;br&gt; - 本日分の実績値は、翌朝5時(JST)前後に確定します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceReportDateRangeType displays a date range of the report.&lt;br&gt; This field is required in ADD operation, and will be ignored in REMOVE operation.&lt;br&gt; If you want actual value including today (specifying TODAY/CUSTOM_DATE to include today), confirm the following restrictions.&lt;br&gt; - Today&#39;s actual value on the report is preliminary figures at a particular time. It may be the value at the time 4 to 5 hours ago, since the preliminary figure varies depending on when it&#39;s acquired.&lt;br&gt; - The actual value including today on the report may be different from the value acquired by StatsService or the value displayed on the Campaign Management Tool.&lt;br&gt; - Frequency Report and Reach Report don&#39;t provide today&#39;s actual value. &lt;br&gt; - The value will be determined around 5 AM the next morning (JST).&lt;br&gt; &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_7_DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を除く、過去7日間です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the last 7 days not including today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_MONTH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;前月です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for all days in the previous month.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;THIS_MONTH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を含む、当月です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for all days in the current month including today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;THIS_MONTH_EXCEPT_TODAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を除く、当月です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for all days in the current month not including today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TODAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YESTERDAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;昨日です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for yesterday only.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_30_DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を除く、過去30日間です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the last 30 days not including today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_14_DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を除く、過去14日間です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the last 14 days not including today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOM_DATE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ユーザーにより指定される期間です。CUSTOM_DATEを指定した場合、集計対象期間の指定が必要です。&lt;br&gt;※ReportType : REACHでは指定不可&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the date range specified byDateRange. If select CUSTOM_DATE, DateRange must be input.&lt;br&gt;* CUSTOM_DATE cannot be specified if ReportType &#x3D; REACH.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_WEEK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;先週の月曜日から日曜日です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the seven-day period starting with previous Monday.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_BUSINESS_WEEK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;先週の月曜日から5営業日です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the 5 day business week starting with previous Monday.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GUARANTEED_CAMPAIGN_PERIOD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;   &lt;span lang&#x3D;\&quot;ja\&quot;&gt;     通期です。&lt;br&gt;     リーチレポートでのみ指定可能です。&lt;br&gt;     通期を指定する場合は、frequencyRangeでもGUARANTEED_CAMPAIGN_PERIODを指定する必要があります。&lt;br&gt;     ※この「通期」は、予約型キャンペーンの開始から終了までの全期間を意味します。   &lt;/span&gt;   &lt;span lang&#x3D;\&quot;en\&quot;&gt;     Lifetime.&lt;br&gt;     Can be specified only in the reach report.&lt;br&gt;     If specified this, \&quot;GUARANTEED_CAMPAIGN_PERIOD\&quot; must be specified for frequencyRange as well.&lt;br&gt;     * \&quot;lifetime\&quot; means the entire period from the start to the end of the guaranteed campaign.   &lt;/span&gt; &lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ReportDefinitionServiceReportDateRangeType {
  
  CUSTOM_DATE("CUSTOM_DATE"),
  
  TODAY("TODAY"),
  
  YESTERDAY("YESTERDAY"),
  
  LAST_7_DAYS("LAST_7_DAYS"),
  
  LAST_WEEK("LAST_WEEK"),
  
  LAST_BUSINESS_WEEK("LAST_BUSINESS_WEEK"),
  
  LAST_14_DAYS("LAST_14_DAYS"),
  
  LAST_30_DAYS("LAST_30_DAYS"),
  
  THIS_MONTH("THIS_MONTH"),
  
  THIS_MONTH_EXCEPT_TODAY("THIS_MONTH_EXCEPT_TODAY"),
  
  LAST_MONTH("LAST_MONTH"),
  
  GUARANTEED_CAMPAIGN_PERIOD("GUARANTEED_CAMPAIGN_PERIOD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportDateRangeType(String value) {
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
  public static ReportDefinitionServiceReportDateRangeType fromValue(String value) {
    for (ReportDefinitionServiceReportDateRangeType b : ReportDefinitionServiceReportDateRangeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


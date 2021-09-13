package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ReportDefinitionServiceReportDateRangeTypeは、レポートの集計対象期間を表します。<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。<br> 本日分を含む実績値を取得する(TODAY/CUSTOM_DATEで本日を含む)場合、以下の制約があります。<br> - 本日分の実績値は、その時点での速報値です。取得タイミングによって速報値は変動するため、4〜5時間前の実績値となる可能性があります。<br> - StatsServiceや広告管理ツールによる本日分の実績値とは、数値が異なる可能性があります。<br> - フリークエンシーレポートとリーチレポートでは、本日分の実績値は取得できません。<br> - 本日分の実績値は、翌朝5時(JST)前後に確定します。<br> </div> <div lang=\"en\"> ReportDefinitionServiceReportDateRangeType displays a date range of the report.<br> This field is required in ADD operation, and will be ignored in REMOVE operation.<br> If you want actual value including today (specifying TODAY/CUSTOM_DATE to include today), confirm the following restrictions.<br> - Today's actual value on the report is preliminary figures at a particular time. It may be the value at the time 4 to 5 hours ago, since the preliminary figure varies depending on when it's acquired.<br> - The actual value including today on the report may be different from the value acquired by StatsService or the value displayed on the Campaign Management Tool.<br> - Frequency Report and Reach Report don't provide today's actual value. <br> - The value will be determined around 5 AM the next morning (JST).<br> </div> <dl class=term>   <dt class=\"term__item\">LAST_7_DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日を除く、過去7日間です。</span><span lang=\"en\">Reports are generated for the last 7 days not including today.</span></dd>   <dt class=\"term__item\">LAST_MONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">前月です。</span><span lang=\"en\">Reports are generated for all days in the previous month.</span></dd>   <dt class=\"term__item\">THIS_MONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日を除く、当月です。</span><span lang=\"en\">Reports are generated for all days in the current month not including today.</span></dd>   <dt class=\"term__item\">TODAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日です。</span><span lang=\"en\">Reports are generated for today.</span></dd>   <dt class=\"term__item\">YESTERDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">昨日です。</span><span lang=\"en\">Reports are generated for yesterday only.</span></dd>   <dt class=\"term__item\">LAST_30_DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日を除く、過去30日間です。</span><span lang=\"en\">Reports are generated for the last 30 days not including today.</span></dd>   <dt class=\"term__item\">LAST_14_DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日を除く、過去14日間です。</span><span lang=\"en\">Reports are generated for the last 14 days not including today.</span></dd>   <dt class=\"term__item\">CUSTOM_DATE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ユーザーにより指定される期間です。CUSTOM_DATEを指定した場合、集計対象期間の指定が必要です。<br>※ReportType : REACHでは指定不可</span><span lang=\"en\">Reports are generated for the date range specified byDateRange. If select CUSTOM_DATE, DateRange must be input.<br>* CUSTOM_DATE cannot be specified if ReportType = REACH.</span></dd>   <dt class=\"term__item\">LAST_WEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">先週の月曜日から日曜日です。</span><span lang=\"en\">Reports are generated for the seven-day period starting with previous Monday.</span></dd>   <dt class=\"term__item\">LAST_BUSINESS_WEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">先週の月曜日から5営業日です。</span><span lang=\"en\">Reports are generated for the 5 day business week starting with previous Monday.</span></dd>   <dt class=\"term__item\">GUARANTEED_CAMPAIGN_PERIOD</dt>   <dd class=\"term__desc\">   <span lang=\"ja\">     通期です。<br>     リーチレポートでのみ指定可能です。<br>     通期を指定する場合は、frequencyRangeでもGUARANTEED_CAMPAIGN_PERIODを指定する必要があります。<br>     ※この「通期」は、予約型キャンペーンの開始から終了までの全期間を意味します。   </span>   <span lang=\"en\">     Lifetime.<br>     Can be specified only in the reach report.<br>     If specified this, \"GUARANTEED_CAMPAIGN_PERIOD\" must be specified for frequencyRange as well.<br>     * \"lifetime\" means the entire period from the start to the end of the guaranteed campaign.   </span> </dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
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


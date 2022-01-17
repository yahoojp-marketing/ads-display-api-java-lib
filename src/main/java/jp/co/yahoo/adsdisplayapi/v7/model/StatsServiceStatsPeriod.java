package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">StatsServiceStatsPeriodは、統計情報の集計期間を表します。</div> <div lang=\"en\">StatsServiceStatsPeriod displays the summarized period of statistics.</div> <dl class=term>   <dt class=\"term__item\">REALTIME_TODAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">今日 / 速報値</span><span lang=\"en\">Today / Quick estimation</span></dd>   <dt class=\"term__item\">DEFINITE_VALUE_YESTERDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">昨日 / 確定値</span><span lang=\"en\">Yesterday / Definite Value</span></dd>   <dt class=\"term__item\">DEFINITE_VALUE_LASTWEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">先週（月-日）/ 確定値</span><span lang=\"en\">Last week (All days) / Definite Value</span></dd>   <dt class=\"term__item\">DEFINITE_VALUE_LASTBSDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">先週（月-金）/ 確定値</span><span lang=\"en\">Last week (Business days) / Definite Value</span></dd>   <dt class=\"term__item\">DEFINITE_VALUE_WEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">過去7日間（今日を含まない）/ 確定値</span><span lang=\"en\">Past 7 days (not including today) / Definite Value</span></dd>   <dt class=\"term__item\">DEFINITE_VALUE_TWOWEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">過去14日間（今日>を含まない）/ 確定値</span><span lang=\"en\">Past 14 days (not including today) / Definite Value</span></dd>   <dt class=\"term__item\">DEFINITE_VALUE_THIRTYDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">過去30日間（今日を含まない）/ 確定値</span><span lang=\"en\">Past 30 days (not including today) / Definite Value</span></dd>   <dt class=\"term__item\">REALTIME_MONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">今月（今日を含む）/ 速報値</span><span lang=\"en\">This month (including today) / Quick estimation</span></dd>   <dt class=\"term__item\">DEFINITE_VALUE_LASTMONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">先月 / 確定値</span><span lang=\"en\">Last month / Definite Value</span></dd>   <dt class=\"term__item\">DEFINITE_VALUE_LAST25MONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">過去25ヶ月間 / 確定値</span><span lang=\"en\">Past 25 months / Definite Value</span></dd>   <dt class=\"term__item\">CUSTOM_DATE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">任意日付の指定</span><span lang=\"en\">Specify any date</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum StatsServiceStatsPeriod {
  
  REALTIME_TODAY("REALTIME_TODAY"),
  
  DEFINITE_VALUE_YESTERDAY("DEFINITE_VALUE_YESTERDAY"),
  
  DEFINITE_VALUE_LASTWEEK("DEFINITE_VALUE_LASTWEEK"),
  
  DEFINITE_VALUE_LASTBSDAY("DEFINITE_VALUE_LASTBSDAY"),
  
  DEFINITE_VALUE_WEEK("DEFINITE_VALUE_WEEK"),
  
  DEFINITE_VALUE_TWOWEEK("DEFINITE_VALUE_TWOWEEK"),
  
  DEFINITE_VALUE_THIRTYDAY("DEFINITE_VALUE_THIRTYDAY"),
  
  REALTIME_MONTH("REALTIME_MONTH"),
  
  DEFINITE_VALUE_LASTMONTH("DEFINITE_VALUE_LASTMONTH"),
  
  DEFINITE_VALUE_LAST25MONTH("DEFINITE_VALUE_LAST25MONTH"),
  
  CUSTOM_DATE("CUSTOM_DATE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  StatsServiceStatsPeriod(String value) {
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
  public static StatsServiceStatsPeriod fromValue(String value) {
    for (StatsServiceStatsPeriod b : StatsServiceStatsPeriod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


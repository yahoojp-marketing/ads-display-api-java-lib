/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceStatsPeriodは、統計情報の集計期間を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceStatsPeriod displays the summarized period of statistics.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFINITE_VALUE_YESTERDAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;昨日 / 確定値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Yesterday / Definite Value&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFINITE_VALUE_LASTBSDAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;先週（月-金）/ 確定値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Last week (Business days) / Definite Value&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFINITE_VALUE_LASTWEEK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;先週（月-日）/ 確定値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Last week (All days) / Definite Value&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFINITE_VALUE_WEEK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;過去7日間（今日を含まない）/ 確定値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Past 7 days (not including today) / Definite Value&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFINITE_VALUE_TWOWEEK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;過去14日間（今日を含まない）/ 確定値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Past 14 days (not including today) / Definite Value&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFINITE_VALUE_THIRTYDAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;過去30日間（今日を含まない）/ 確定値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Past 30 days (not including today) / Definite Value&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFINITE_VALUE_LASTMONTH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;先月 / 確定値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Last month / Definite Value&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REALTIME_TODAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;今日 / 速報値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Today / Quick estimation&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REALTIME_MONTH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;今月（今日を含む）/ 速報値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;This month (including today) / Quick estimation&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFINITE_VALUE_LAST13MONTH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;過去13ヶ月間 / 確定値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Past 13 months / Definite Value&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOM_DATE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;任意日付の指定&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Specify custom date&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ConversionTrackerServiceStatsPeriod {
  
  DEFINITE_VALUE_YESTERDAY("DEFINITE_VALUE_YESTERDAY"),
  
  DEFINITE_VALUE_LASTBSDAY("DEFINITE_VALUE_LASTBSDAY"),
  
  DEFINITE_VALUE_LASTWEEK("DEFINITE_VALUE_LASTWEEK"),
  
  DEFINITE_VALUE_WEEK("DEFINITE_VALUE_WEEK"),
  
  DEFINITE_VALUE_TWOWEEK("DEFINITE_VALUE_TWOWEEK"),
  
  DEFINITE_VALUE_THIRTYDAY("DEFINITE_VALUE_THIRTYDAY"),
  
  DEFINITE_VALUE_LASTMONTH("DEFINITE_VALUE_LASTMONTH"),
  
  REALTIME_TODAY("REALTIME_TODAY"),
  
  REALTIME_MONTH("REALTIME_MONTH"),
  
  DEFINITE_VALUE_LAST13MONTH("DEFINITE_VALUE_LAST13MONTH"),
  
  CUSTOM_DATE("CUSTOM_DATE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceStatsPeriod(String value) {
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
  public static ConversionTrackerServiceStatsPeriod fromValue(String value) {
    for (ConversionTrackerServiceStatsPeriod b : ConversionTrackerServiceStatsPeriod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


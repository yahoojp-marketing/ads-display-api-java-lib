package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ReportDefinitionServiceFrequencyRangeは、フリークエンシーの計測期間を表します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> ReportDefinitionServiceFrequencyRange serves measurement range of reach frequency. <br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">DAILY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1日単位です。</span><span lang=\"en\">Daily range.</span></dd>   <dt class=\"term__item\">WEEKLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1週間単位です。</span><span lang=\"en\">Weekly range.</span></dd>   <dt class=\"term__item\">MONTHLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1ヶ月単位です。</span><span lang=\"en\">Monthly range.</span></dd>   <dt class=\"term__item\">GUARANTEED_CAMPAIGN_PERIOD</dt>   <dd class=\"term__desc\">   <span lang=\"ja\">     通期です。<br>     リーチレポートでのみ指定可能です。<br>     通期を指定する場合は、reportDateRangeTypeでもGUARANTEED_CAMPAIGN_PERIODを指定する必要があります。<br>     ※この「通期」は、予約型キャンペーンの開始から終了までの全期間を意味します。   </span>   <span lang=\"en\">     Lifetime.<br>     Can be specified only in the reach report.<br>     If specified this, \"GUARANTEED_CAMPAIGN_PERIOD\" must be specified for reportDateRangeType as well.<br>     * \"lifetime\" means the entire period from the start to the end of the guaranteed campaign.   </span> </dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceFrequencyRange {
  
  DAILY("DAILY"),
  
  WEEKLY("WEEKLY"),
  
  MONTHLY("MONTHLY"),
  
  GUARANTEED_CAMPAIGN_PERIOD("GUARANTEED_CAMPAIGN_PERIOD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceFrequencyRange(String value) {
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
  public static ReportDefinitionServiceFrequencyRange fromValue(String value) {
    for (ReportDefinitionServiceFrequencyRange b : ReportDefinitionServiceFrequencyRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


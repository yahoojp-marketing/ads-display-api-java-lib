package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> フリークエンシー制御期間を表します。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Frequency setting period.<br> In ADD operation, this field will be required. </div> <dl class=term>   <dt class=\"term__item\">DAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日単位でのフリークエンシー設定です。</span><span lang=\"en\">Frequency Setting per Day.</span></dd>   <dt class=\"term__item\">WEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">週単位でのフリークエンシー設定です。</span><span lang=\"en\">Frequency Setting per Week.</span></dd>   <dt class=\"term__item\">MONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">月単位でのフリークエンシー設定です。</span><span lang=\"en\">Frequency Setting per Month.</span></dd>   <dt class=\"term__item\">LIFETIME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通期でのフリークエンシー設定です。</span><span lang=\"en\">Frequency Setting per Lifetime of campaign.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceFrequencyTimeUnit {
  
  DAY("DAY"),
  
  WEEK("WEEK"),
  
  MONTH("MONTH"),
  
  LIFETIME("LIFETIME"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceFrequencyTimeUnit(String value) {
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
  public static GuaranteedSimulationServiceFrequencyTimeUnit fromValue(String value) {
    for (GuaranteedSimulationServiceFrequencyTimeUnit b : GuaranteedSimulationServiceFrequencyTimeUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


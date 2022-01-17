package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedSimulationServiceAudienceListDeliverTypeは、オーディエンスリストが配信対象か配信除外対象かを表します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAudienceListDeliverType describes whether the audience list is delivery target or excluded from delivery target.<br> This field is optional in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">INCLUDE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信対象です。</span><span lang=\"en\">Target.</span></dd>   <dt class=\"term__item\">EXCLUDE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信除外です。</span><span lang=\"en\">Exclude.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceAudienceListDeliverType {
  
  INCLUDE("INCLUDE"),
  
  EXCLUDE("EXCLUDE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceAudienceListDeliverType(String value) {
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
  public static GuaranteedSimulationServiceAudienceListDeliverType fromValue(String value) {
    for (GuaranteedSimulationServiceAudienceListDeliverType b : GuaranteedSimulationServiceAudienceListDeliverType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


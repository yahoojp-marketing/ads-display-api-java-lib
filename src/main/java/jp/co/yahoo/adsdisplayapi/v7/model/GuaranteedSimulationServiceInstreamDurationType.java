package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedSimulationServiceInstreamDurationTypeは、インストリーム広告の尺の種類を表します。</div> <div lang=\"en\">GuaranteedSimulationServiceInstreamDurationType describes the duration type of in-stream ads.</div> <dl class=term>   <dt class=\"term__item\">MAX_6_SECONDS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大6秒です。</span><span lang=\"en\">Max 6 seconds.</span></dd>   <dt class=\"term__item\">MAX_15_SECONDS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大15秒です。</span><span lang=\"en\">Max 15 seconds.</span></dd>   <dt class=\"term__item\">MAX_30_SECONDS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大30秒です。</span><span lang=\"en\">Max 30 seconds.</span></dd>   <dt class=\"term__item\">UNLIMITED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">上限なしです。</span><span lang=\"en\">No upper limit.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceInstreamDurationType {
  
  MAX_6_SECONDS("MAX_6_SECONDS"),
  
  MAX_15_SECONDS("MAX_15_SECONDS"),
  
  MAX_30_SECONDS("MAX_30_SECONDS"),
  
  UNLIMITED("UNLIMITED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceInstreamDurationType(String value) {
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
  public static GuaranteedSimulationServiceInstreamDurationType fromValue(String value) {
    for (GuaranteedSimulationServiceInstreamDurationType b : GuaranteedSimulationServiceInstreamDurationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


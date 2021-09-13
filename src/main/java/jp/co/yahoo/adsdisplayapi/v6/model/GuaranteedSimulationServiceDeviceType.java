package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedSimulationServiceDeviceTypeは、配信先デバイスの種類を表します。</div> <div lang=\"en\">GuaranteedSimulationServiceDeviceType displays types of devices to be posted on.</div> <dl class=term>   <dt class=\"term__item\">DESKTOP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">PC</span><span lang=\"en\">PC</span></dd>   <dt class=\"term__item\">SMARTPHONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォン</span><span lang=\"en\">Smartphones</span></dd>   <dt class=\"term__item\">TABLET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タブレット</span><span lang=\"en\">Tablet device</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceDeviceType {
  
  DESKTOP("DESKTOP"),
  
  SMARTPHONE("SMARTPHONE"),
  
  TABLET("TABLET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceDeviceType(String value) {
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
  public static GuaranteedSimulationServiceDeviceType fromValue(String value) {
    for (GuaranteedSimulationServiceDeviceType b : GuaranteedSimulationServiceDeviceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


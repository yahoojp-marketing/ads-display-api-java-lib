package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedSimulationServiceDeviceOsTypeは、配信先デバイスのOSの種類を表します。</div> <div lang=\"en\">GuaranteedSimulationServiceDeviceOsType serves OS types for devices to be posted on.</div> <dl class=term>   <dt class=\"term__item\">IOS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">iOS向けに配信されます。</span><span lang=\"en\">Deliver to iOS.</span></dd>   <dt class=\"term__item\">ANDROID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Android向けに配信されます。</span><span lang=\"en\">Deliver to Android.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceDeviceOsType {
  
  IOS("IOS"),
  
  ANDROID("ANDROID"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceDeviceOsType(String value) {
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
  public static GuaranteedSimulationServiceDeviceOsType fromValue(String value) {
    for (GuaranteedSimulationServiceDeviceOsType b : GuaranteedSimulationServiceDeviceOsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


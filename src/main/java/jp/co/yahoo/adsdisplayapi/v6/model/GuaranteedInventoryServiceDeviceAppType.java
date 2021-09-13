package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedInventoryServiceDeviceAppTypeは、配信先のアプリケーション種別を表します。</div> <div lang=\"en\">GuaranteedInventoryServiceDeviceAppType serves application types for devices.</div> <dl class=term>   <dt class=\"term__item\">APP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリ向けに配信されます。</span><span lang=\"en\">Deliver to apps.</span></dd>   <dt class=\"term__item\">WEB</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブサイト向けに配信されます。</span><span lang=\"en\">Deliver to the Web.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceDeviceAppType {
  
  APP("APP"),
  
  WEB("WEB"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceDeviceAppType(String value) {
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
  public static GuaranteedInventoryServiceDeviceAppType fromValue(String value) {
    for (GuaranteedInventoryServiceDeviceAppType b : GuaranteedInventoryServiceDeviceAppType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


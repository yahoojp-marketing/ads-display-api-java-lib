package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">DictionaryServiceDeviceOsTypeは、配信先デバイスのOSの種類を表します。</div> <div lang=\"en\">DictionaryServiceDeviceOsType serves OS types for devices to be posted on.</div> <dl class=term>   <dt class=\"term__item\">ANDROID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Android向けに配信されます。</span><span lang=\"en\">Deliver to Android.</span></dd>   <dt class=\"term__item\">IOS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">iOS向けに配信されます。</span><span lang=\"en\">Deliver to iOS.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum DictionaryServiceDeviceOsType {
  
  ANDROID("ANDROID"),
  
  IOS("IOS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  DictionaryServiceDeviceOsType(String value) {
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
  public static DictionaryServiceDeviceOsType fromValue(String value) {
    for (DictionaryServiceDeviceOsType b : DictionaryServiceDeviceOsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


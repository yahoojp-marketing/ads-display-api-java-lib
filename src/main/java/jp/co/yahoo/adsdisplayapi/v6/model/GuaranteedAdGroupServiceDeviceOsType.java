package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedAdGroupServiceDeviceOsTypeは、配信先デバイスのOSの種類を表します。<br> このフィールドは、ADD時は省略可能で、SET時は無視されます。 </div> <div lang=\"en\"> GuaranteedAdGroupServiceDeviceOsType serves OS types for devices to be posted on.<br> This field is optional in ADD operation, and will be ignored in SET operation. </div> <dl class=term>   <dt class=\"term__item\">IOS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">iOS向けに配信されます。</span><span lang=\"en\">Deliver to iOS.</span></dd>   <dt class=\"term__item\">ANDROID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Android向けに配信されます。</span><span lang=\"en\">Deliver to Android.</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべてのOSに配信されます。</span><span lang=\"en\">Deliver to all OS.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedAdGroupServiceDeviceOsType {
  
  IOS("IOS"),
  
  ANDROID("ANDROID"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedAdGroupServiceDeviceOsType(String value) {
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
  public static GuaranteedAdGroupServiceDeviceOsType fromValue(String value) {
    for (GuaranteedAdGroupServiceDeviceOsType b : GuaranteedAdGroupServiceDeviceOsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


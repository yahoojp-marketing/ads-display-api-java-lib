package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedAdGroupServiceDeviceTypeは、配信先デバイスの種類を表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> GuaranteedAdGroupServiceDeviceType displays types of devices to be posted on.<br> This field is required in ADD operation, and will be optional in SET operation. </div> <dl class=term>   <dt class=\"term__item\">DESKTOP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">PC</span><span lang=\"en\">PC</span></dd>   <dt class=\"term__item\">SMARTPHONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォン</span><span lang=\"en\">Smartphones</span></dd>   <dt class=\"term__item\">TABLET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タブレット</span><span lang=\"en\">Tablet device</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべてのデバイスに配信</span><span lang=\"en\">Deliver to all usable devices.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedAdGroupServiceDeviceType {
  
  DESKTOP("DESKTOP"),
  
  SMARTPHONE("SMARTPHONE"),
  
  TABLET("TABLET"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedAdGroupServiceDeviceType(String value) {
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
  public static GuaranteedAdGroupServiceDeviceType fromValue(String value) {
    for (GuaranteedAdGroupServiceDeviceType b : GuaranteedAdGroupServiceDeviceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupServiceSmartDeviceCarrierは、スマートデバイスのモバイルキャリアを表します。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupServiceSmartDeviceCarrier serves the carrier type of smart device.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> <dl class=term>   <dt class=\"term__item\">DOCOMO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">NTTドコモです。</span><span lang=\"en\">NTT Docomo</span></dd>   <dt class=\"term__item\">KDDI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">au KDDIです。</span><span lang=\"en\">au KDDI</span></dd>   <dt class=\"term__item\">SOFTBANK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ソフトバンクモバイルです。</span><span lang=\"en\">SoftBank Mobile</span></dd>   <dt class=\"term__item\">YMOBILE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Y!mobileです。</span><span lang=\"en\">Y!mobile</span></dd>   <dt class=\"term__item\">OTHERS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">その他のモバイルキャリアです。</span><span lang=\"en\">Other mobile carriers.</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未設定です。</span><span lang=\"en\">no setting</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceSmartDeviceCarrier {
  
  DOCOMO("DOCOMO"),
  
  KDDI("KDDI"),
  
  SOFTBANK("SOFTBANK"),
  
  YMOBILE("YMOBILE"),
  
  OTHERS("OTHERS"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceSmartDeviceCarrier(String value) {
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
  public static AdGroupServiceSmartDeviceCarrier fromValue(String value) {
    for (AdGroupServiceSmartDeviceCarrier b : AdGroupServiceSmartDeviceCarrier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


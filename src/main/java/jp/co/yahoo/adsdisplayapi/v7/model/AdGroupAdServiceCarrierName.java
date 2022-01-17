package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupAdServiceCarrierNameは、モバイルキャリアを表します。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> AdGroupAdServiceCarrierName serves carrier types.<br> This field is required in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">DOCOMO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">NTTドコモです。</span><span lang=\"en\">NTT Docomo</span></dd>   <dt class=\"term__item\">KDDI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">au KDDIです。</span><span lang=\"en\">au KDDI</span></dd>   <dt class=\"term__item\">SOFTBANK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ソフトバンクモバイルです。</span><span lang=\"en\">SoftBank Mobile</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべてのモバイルキャリアです。</span><span lang=\"en\">This setting is mobile all carriers.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceCarrierName {
  
  DOCOMO("DOCOMO"),
  
  KDDI("KDDI"),
  
  SOFTBANK("SOFTBANK"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceCarrierName(String value) {
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
  public static AdGroupAdServiceCarrierName fromValue(String value) {
    for (AdGroupAdServiceCarrierName b : AdGroupAdServiceCarrierName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


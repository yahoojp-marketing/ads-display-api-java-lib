package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupTargetServiceCarrierTypeは、スマートフォン、タブレットのキャリアの種別を表します。<br> ※deviceTypeがDESKTOP、WAP_MOBILEの場合は設定できません。 </div> <div lang=\"en\"> AdGroupTargetServiceCarrierType serves carrier type of Smartphone and Tablet.<br> *Cannot be set when deviceType is DESKTOP/WAP_MOBILE. </div> <dl class=term>   <dt class=\"term__item\">DOCOMO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">NTTドコモ</span><span lang=\"en\">NTT docomo</span></dd>   <dt class=\"term__item\">KDDI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">KDDI</span><span lang=\"en\">KDDI</span></dd>   <dt class=\"term__item\">SOFTBANK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ソフトバンク</span><span lang=\"en\">SoftBank</span></dd>   <dt class=\"term__item\">YMOBILE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ワイモバイル</span><span lang=\"en\">Y!mobile</span></dd>   <dt class=\"term__item\">OTHERS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">その他のモバイルキャリア</span><span lang=\"en\">Other mobile carriers</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupTargetServiceCarrierType {
  
  DOCOMO("DOCOMO"),
  
  KDDI("KDDI"),
  
  SOFTBANK("SOFTBANK"),
  
  YMOBILE("YMOBILE"),
  
  OTHERS("OTHERS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupTargetServiceCarrierType(String value) {
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
  public static AdGroupTargetServiceCarrierType fromValue(String value) {
    for (AdGroupTargetServiceCarrierType b : AdGroupTargetServiceCarrierType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


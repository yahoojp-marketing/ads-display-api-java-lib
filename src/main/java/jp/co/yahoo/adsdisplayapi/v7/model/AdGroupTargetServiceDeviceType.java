package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupTargetServiceDeviceTypeは、配信先デバイスの種類を表します。 </div> <div lang=\"en\"> AdGroupTargetServiceDeviceType displays types of devices to be posted on. </div> <dl class=term>   <dt class=\"term__item\">DESKTOP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">PC</span><span lang=\"en\">PC</span></dd>   <dt class=\"term__item\">WAP_MOBILE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">従来型携帯電話（フィーチャーフォン）</span><span lang=\"en\">Contemporary mobile phones (Feature Phone)</span></dd>   <dt class=\"term__item\">SMARTPHONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォン</span><span lang=\"en\">Smartphones</span></dd>   <dt class=\"term__item\">TABLET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タブレット</span><span lang=\"en\">Tablet device</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupTargetServiceDeviceType {
  
  DESKTOP("DESKTOP"),
  
  WAP_MOBILE("WAP_MOBILE"),
  
  SMARTPHONE("SMARTPHONE"),
  
  TABLET("TABLET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupTargetServiceDeviceType(String value) {
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
  public static AdGroupTargetServiceDeviceType fromValue(String value) {
    for (AdGroupTargetServiceDeviceType b : AdGroupTargetServiceDeviceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


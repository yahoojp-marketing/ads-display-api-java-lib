package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupServiceDynamicImageExtensionsは、画像自動付与の設定を表します。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupServiceDynamicImageExtensions serves setting of Dynamic Image Extensions.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> <dl class=term>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">画像自動付与を設定します。</span><span lang=\"en\">Dynamic Image Extension is active.</span></dd>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">画像自動付与を設定しません。</span><span lang=\"en\">Dynamic Image Extension is not active.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceDynamicImageExtensions {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceDynamicImageExtensions(String value) {
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
  public static AdGroupServiceDynamicImageExtensions fromValue(String value) {
    for (AdGroupServiceDynamicImageExtensions b : AdGroupServiceDynamicImageExtensions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


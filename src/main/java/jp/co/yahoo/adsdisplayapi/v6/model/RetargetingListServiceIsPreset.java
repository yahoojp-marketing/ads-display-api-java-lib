package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> RetargetingListServiceIsPresetは、過去の訪問履歴の対象の有無を表します。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> RetargetingListServiceIsPreset display the setting of history of past visit.<br> This field is required in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">過去の訪問履歴を含みます。</span><span lang=\"en\">Includes the past visit.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">過去の訪問履歴を含みません。</span><span lang=\"en\">Do not include the past visit.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceIsPreset {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceIsPreset(String value) {
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
  public static RetargetingListServiceIsPreset fromValue(String value) {
    for (RetargetingListServiceIsPreset b : RetargetingListServiceIsPreset.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


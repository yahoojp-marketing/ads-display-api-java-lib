package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedPreviewServiceMaterialTypeは、プレビュー素材の種別を表します。<br> このフィールドは、リクエストの場合は必須です。<br> </div> <div lang=\"en\"> GuaranteedPreviewServiceMaterialType describes the type of the preview material.<br> This field is required in requests. </div> <dl class=term>   <dt class=\"term__item\">AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ADのプレビュー素材です。</span><span lang=\"en\">Preview material of AD.</span></dd>   <dt class=\"term__item\">MEDIA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">MEDIAのプレビュー素材です。</span><span lang=\"en\">Preview material of MEDIA.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedPreviewServiceMaterialType {
  
  AD("AD"),
  
  MEDIA("MEDIA"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedPreviewServiceMaterialType(String value) {
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
  public static GuaranteedPreviewServiceMaterialType fromValue(String value) {
    for (GuaranteedPreviewServiceMaterialType b : GuaranteedPreviewServiceMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


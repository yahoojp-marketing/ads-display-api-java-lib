package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   GuaranteedSimulationServicePackagePermissionTypeは、商品設定の制限を表します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServicePackagePermissionType describes the restriction of the package setting.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">FORBIDDEN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">設定不可です。</span><span lang=\"en\">Cannot be set.</span></dd>   <dt class=\"term__item\">PERMITTED_NON_TARGET_ENABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲティング設定は任意です。</span><span lang=\"en\">Targeting setting is optional.</span></dd>   <dt class=\"term__item\">PERMITTED_NON_TARGET_DISABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲティング設定は必須です。</span><span lang=\"en\">Targeting setting is required.</span></dd>   <dt class=\"term__item\">FIXED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">固定値です。</span><span lang=\"en\">Fixed value.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServicePackagePermissionType {
  
  FORBIDDEN("FORBIDDEN"),
  
  PERMITTED_NON_TARGET_ENABLE("PERMITTED_NON_TARGET_ENABLE"),
  
  PERMITTED_NON_TARGET_DISABLE("PERMITTED_NON_TARGET_DISABLE"),
  
  FIXED("FIXED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServicePackagePermissionType(String value) {
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
  public static GuaranteedSimulationServicePackagePermissionType fromValue(String value) {
    for (GuaranteedSimulationServicePackagePermissionType b : GuaranteedSimulationServicePackagePermissionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


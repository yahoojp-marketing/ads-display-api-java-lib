package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   GuaranteedSimulationServicePackagePublicLevelは、商品設定の公開レベルを表します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServicePackagePublicLevel describes the public level of package setting.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">PUBLIC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">一般公開されている商品です。</span><span lang=\"en\">Public package.</span></dd>   <dt class=\"term__item\">LIMITED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">限定公開の商品です。</span><span lang=\"en\">Limited release package.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServicePackagePublicLevel {
  
  PUBLIC("PUBLIC"),
  
  LIMITED("LIMITED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServicePackagePublicLevel(String value) {
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
  public static GuaranteedSimulationServicePackagePublicLevel fromValue(String value) {
    for (GuaranteedSimulationServicePackagePublicLevel b : GuaranteedSimulationServicePackagePublicLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


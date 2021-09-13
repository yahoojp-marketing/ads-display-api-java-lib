package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   GuaranteedSimulationServicePriceTypeは、商品の購入タイプを表します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServicePriceType describes the purchase type of the package.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">VIMPS_CUSTOM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">vimps購入型（変動）です。</span><span lang=\"en\">Vimps purchase type (variable).</span></dd>   <dt class=\"term__item\">VIMPS_SOV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">vimps購入型（SOV）です。</span><span lang=\"en\">Vimps purchase type (share of voice).</span></dd>   <dt class=\"term__item\">VIMPS_REACH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">vimps購入型（リーチ固定）です。</span><span lang=\"en\">Vimps purchase type (fixed reach).</span></dd>   <dt class=\"term__item\">SLOTS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">枠購入型です。</span><span lang=\"en\">Slots purchase type.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServicePriceType {
  
  VIMPS_CUSTOM("VIMPS_CUSTOM"),
  
  VIMPS_SOV("VIMPS_SOV"),
  
  VIMPS_REACH("VIMPS_REACH"),
  
  SLOTS("SLOTS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServicePriceType(String value) {
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
  public static GuaranteedSimulationServicePriceType fromValue(String value) {
    for (GuaranteedSimulationServicePriceType b : GuaranteedSimulationServicePriceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


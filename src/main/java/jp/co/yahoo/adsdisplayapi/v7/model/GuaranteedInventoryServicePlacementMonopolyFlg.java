package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   GuaranteedInventoryServicePlacementMonopolyFlgは、専売枠へ配信可能かを表します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedInventoryServicePlacementMonopolyFlg describes whether it can be delivered to a monopoly place.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">専売枠商品です。</span><span lang=\"en\">Monopoly goods.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">非専売枠商品です。</span><span lang=\"en\">Non-monopoly goods.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServicePlacementMonopolyFlg {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServicePlacementMonopolyFlg(String value) {
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
  public static GuaranteedInventoryServicePlacementMonopolyFlg fromValue(String value) {
    for (GuaranteedInventoryServicePlacementMonopolyFlg b : GuaranteedInventoryServicePlacementMonopolyFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


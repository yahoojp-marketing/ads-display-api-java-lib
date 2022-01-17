package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedInventoryServicePlacementCategoryTypeは、プレイスメントカテゴリーの種類を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">GuaranteedInventoryServicePlacementCategoryType describes the type of placement category. <br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">PAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ページです。</span><span lang=\"en\">Page</span></dd>   <dt class=\"term__item\">STATION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">駅です。</span><span lang=\"en\">Station</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServicePlacementCategoryType {
  
  PAGE("PAGE"),
  
  STATION("STATION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServicePlacementCategoryType(String value) {
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
  public static GuaranteedInventoryServicePlacementCategoryType fromValue(String value) {
    for (GuaranteedInventoryServicePlacementCategoryType b : GuaranteedInventoryServicePlacementCategoryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

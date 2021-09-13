package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupTargetServicePlacementUrlListTypeは、プレイスメントURLリストの種別を表します。<br> ADDおよびREPLACE時、このフィールドは必須となります。 </div> <div lang=\"en\"> AdGroupTargetServicePlacementUrlListType describes type of Placement URL list.<br> This field is required in ADD and REPLACE operation. </div> <dl class=term>   <dt class=\"term__item\">WHITE_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ホワイトリスト</span><span lang=\"en\">White list.</span></dd>   <dt class=\"term__item\">BLACK_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ブラックリスト</span><span lang=\"en\">Black list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupTargetServicePlacementUrlListType {
  
  WHITE_LIST("WHITE_LIST"),
  
  BLACK_LIST("BLACK_LIST"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupTargetServicePlacementUrlListType(String value) {
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
  public static AdGroupTargetServicePlacementUrlListType fromValue(String value) {
    for (AdGroupTargetServicePlacementUrlListType b : AdGroupTargetServicePlacementUrlListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


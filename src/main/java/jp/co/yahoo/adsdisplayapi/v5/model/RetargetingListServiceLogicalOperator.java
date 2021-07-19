package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> RetargetingListServiceLogicalOperatorは、条件の種類を表示します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> RetargetingListServiceLogicalOperator displays the type of conditions. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">OR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">いずれかのターゲットリストに一致していることを表します。</span><span lang=\"en\">Matches either of the target list.</span></dd>   <dt class=\"term__item\">AND</dt>   <dd class=\"term__desc\"><span lang=\"ja\">それぞれのターゲットリストに一致していることを表します。</span><span lang=\"en\">Matches both of the target list</span></dd>   <dt class=\"term__item\">NOTIN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">選択したターゲットリスト以外に一致していることを表します。</span><span lang=\"en\">Matches neither of the selected target list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceLogicalOperator {
  
  OR("OR"),
  
  AND("AND"),
  
  NOTIN("NOTIN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceLogicalOperator(String value) {
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
  public static RetargetingListServiceLogicalOperator fromValue(String value) {
    for (RetargetingListServiceLogicalOperator b : RetargetingListServiceLogicalOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


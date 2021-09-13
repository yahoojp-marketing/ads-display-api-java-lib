package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> RetargetingListServiceCompareOperatorは、ルールタイプの条件の種類を表示します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> RetargetingListServiceCompareOperator displays the types of rule conditions.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">EQUAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">次と等しい条件を表します。</span><span lang=\"en\">Equals to the next conditions.</span></dd>   <dt class=\"term__item\">INCLUDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">次を含む条件を表します。</span><span lang=\"en\">Include to the next conditions.</span></dd>   <dt class=\"term__item\">START_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">次から始まる条件を表します。</span><span lang=\"en\">Start with the next conditions.</span></dd>   <dt class=\"term__item\">END_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最後が一致する条件を表します。</span><span lang=\"en\">End with the next conditions.</span></dd>   <dt class=\"term__item\">NOT_EQUAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">次と等しくない条件を表します。</span><span lang=\"en\">Do not equal to the next conditions.</span></dd>   <dt class=\"term__item\">NOT_INCLUDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">次を含まない条件を表します。</span><span lang=\"en\">Do not include to the next conditions.</span></dd>   <dt class=\"term__item\">NOT_START_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最初が不一致な条件を表します。</span><span lang=\"en\">Do not start with the next conditions.</span></dd>   <dt class=\"term__item\">NOT_END_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最後が不一致な条件を表します。</span><span lang=\"en\">Do not ends with the next conditions.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceCompareOperator {
  
  EQUAL("EQUAL"),
  
  INCLUDED("INCLUDED"),
  
  START_WITH("START_WITH"),
  
  END_WITH("END_WITH"),
  
  NOT_EQUAL("NOT_EQUAL"),
  
  NOT_INCLUDED("NOT_INCLUDED"),
  
  NOT_START_WITH("NOT_START_WITH"),
  
  NOT_END_WITH("NOT_END_WITH"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceCompareOperator(String value) {
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
  public static RetargetingListServiceCompareOperator fromValue(String value) {
    for (RetargetingListServiceCompareOperator b : RetargetingListServiceCompareOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


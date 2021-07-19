package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> RetargetingListServiceTargetListTypeは、ターゲティングの種別を表します。<br> このフィールドは、ADDおよびSET時に必須となります。<br> ただし、ADD時にDEFAULT_LISTを指定することはできません。 </div> <div lang=\"en\"> RetargetingListServiceTargetListType serves types of targets. <br> This field is required in ADD and SET operation.<br> However, DEFAULT_LIST cannot be specified in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">DEFAULT_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">デフォルトリストです。</span><span lang=\"en\">Default List.</span></dd>   <dt class=\"term__item\">RULE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ルール(条件)です。</span><span lang=\"en\">Rules (conditions).</span></dd>   <dt class=\"term__item\">COMBINATION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">組み合わせです。</span><span lang=\"en\">Combination.</span></dd>   <dt class=\"term__item\">SIMILARITY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似ユーザーリストです。</span><span lang=\"en\">Similar User List.</span></dd>   <dt class=\"term__item\">CUSTOM_AUDIENCE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムオーディエンスリストです。</span><span lang=\"en\">Custom Audience List.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceTargetListType {
  
  DEFAULT_LIST("DEFAULT_LIST"),
  
  RULE("RULE"),
  
  COMBINATION("COMBINATION"),
  
  SIMILARITY("SIMILARITY"),
  
  CUSTOM_AUDIENCE("CUSTOM_AUDIENCE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceTargetListType(String value) {
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
  public static RetargetingListServiceTargetListType fromValue(String value) {
    for (RetargetingListServiceTargetListType b : RetargetingListServiceTargetListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


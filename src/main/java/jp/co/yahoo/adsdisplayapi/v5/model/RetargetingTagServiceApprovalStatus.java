package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingTagServiceApprovalStatusは、サイトリターゲティング のタグ承認のステータスを表示します。</div> <div lang=\"en\">RetargetingTagServiceApprovalStatus displays the status of tag approval for site retargeting.</div> <dl class=term>   <dt class=\"term__item\">AVAILABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲティングのタグを利用可能です。</span><span lang=\"en\">It was approved, and can use the tag .</span></dd>   <dt class=\"term__item\">DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査で否認されました。</span><span lang=\"en\">It was disapproved.</span></dd>   <dt class=\"term__item\">DISAPPROVED_WITH_REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">再審査依頼中です。</span><span lang=\"en\">It is requesting review.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingTagServiceApprovalStatus {
  
  AVAILABLE("AVAILABLE"),
  
  DISAPPROVED("DISAPPROVED"),
  
  DISAPPROVED_WITH_REVIEW("DISAPPROVED_WITH_REVIEW"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingTagServiceApprovalStatus(String value) {
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
  public static RetargetingTagServiceApprovalStatus fromValue(String value) {
    for (RetargetingTagServiceApprovalStatus b : RetargetingTagServiceApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


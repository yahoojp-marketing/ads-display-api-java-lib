package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">MediaServiceApprovalStatusは、画像の審査の状況です。</div> <div lang=\"en\">MediaServiceApprovalStatus serves the approval status of media.</div> <dl class=term>   <dt class=\"term__item\">POST_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">事後審査否認のため掲載停止です。</span><span lang=\" en\">The item was taken offline due to a post review.</span></dd>   <dt class=\"term__item\">APPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査済みです。</span><span lang=\"en\">The item was approved.</span></dd>   <dt class=\"term__item\">REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中です。</span><span lang=\"en\">Under editorial review.</span></dd>   <dt class=\"term__item\">PRE_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">事前審査否認のため掲載不可です。</span><span lang=\"en\">The item was rejected.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum MediaServiceApprovalStatus {
  
  APPROVED("APPROVED"),
  
  REVIEW("REVIEW"),
  
  PRE_DISAPPROVED("PRE_DISAPPROVED"),
  
  POST_DISAPPROVED("POST_DISAPPROVED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  MediaServiceApprovalStatus(String value) {
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
  public static MediaServiceApprovalStatus fromValue(String value) {
    for (MediaServiceApprovalStatus b : MediaServiceApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


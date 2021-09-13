package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> BrandLiftServiceApprovalStatusは、調査情報の審査状況を表します。 </div> <div lang=\"en\"> BrandLiftServiceApprovalStatus describes approval status of survey information. </div> <dl class=term>   <dt class=\"term__item\">APPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">承認済みです。</span><span lang=\"en\">Approved.</span></dd>   <dt class=\"term__item\">APPROVED_WITH_REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">承認済です。<br>すでに掲載中の調査内容を再編集し、審査中となり、編集前の調査内容が掲載されています。</span><span lang=\"en\">Approved with review. <br>The survey currently published has been edited and are under review, so the survey contents before the editing have been published.</span></dd>   <dt class=\"term__item\">REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中です。</span><span lang=\"en\">Under review.</span></dd>   <dt class=\"term__item\">PRE_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">掲載不可です。<br>新しく追加した調査内容が審査で承認されず非掲載です。</span><span lang=\"en\">Cannot be published. <br> The newly added survey content is disapproved, therefore it is not published.</span></dd>   <dt class=\"term__item\">POST_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">掲載停止です。<br>すでに掲載中の調査内容について審査が行われた結果、承認されず非掲載です。</span><span lang=\"en\">Publication is suspended. <br> The current survey content has been reviewed, and the content is disapproved to publish.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum BrandLiftServiceApprovalStatus {
  
  APPROVED("APPROVED"),
  
  APPROVED_WITH_REVIEW("APPROVED_WITH_REVIEW"),
  
  REVIEW("REVIEW"),
  
  PRE_DISAPPROVED("PRE_DISAPPROVED"),
  
  POST_DISAPPROVED("POST_DISAPPROVED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BrandLiftServiceApprovalStatus(String value) {
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
  public static BrandLiftServiceApprovalStatus fromValue(String value) {
    for (BrandLiftServiceApprovalStatus b : BrandLiftServiceApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


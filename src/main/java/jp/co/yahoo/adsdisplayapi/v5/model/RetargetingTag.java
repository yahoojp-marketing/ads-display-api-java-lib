package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingTagServiceApprovalStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingTagオブジェクトは、サイトリターゲティングのタグ情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingTag objects displays tag information for site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingTagオブジェクトは、サイトリターゲティングのタグ情報を表します。</div> <div lang=\"en\">RetargetingTag objects displays tag information for site retargeting.</div> ")

public class RetargetingTag   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("approvalStatus")
  private JsonNullable<RetargetingTagServiceApprovalStatus> approvalStatus = JsonNullable.undefined();

  @JsonProperty("retargetingTagId")
  private JsonNullable<String> retargetingTagId = JsonNullable.undefined();

  @JsonProperty("tag")
  private JsonNullable<String> tag = JsonNullable.undefined();

  @JsonProperty("advancedTag")
  private JsonNullable<String> advancedTag = JsonNullable.undefined();

  public RetargetingTag accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public RetargetingTag approvalStatus(RetargetingTagServiceApprovalStatus approvalStatus) {
    this.approvalStatus = JsonNullable.of(approvalStatus);
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingTagServiceApprovalStatus> getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(JsonNullable<RetargetingTagServiceApprovalStatus> approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public RetargetingTag retargetingTagId(String retargetingTagId) {
    this.retargetingTagId = JsonNullable.of(retargetingTagId);
    return this;
  }

  /**
   * <div lang=\"ja\">サイトリターゲティングのタグIDです。</div> <div lang=\"en\">Tag ID for site retargeting.</div> 
   * @return retargetingTagId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイトリターゲティングのタグIDです。</div> <div lang=\"en\">Tag ID for site retargeting.</div> ")


  public JsonNullable<String> getRetargetingTagId() {
    return retargetingTagId;
  }

  public void setRetargetingTagId(JsonNullable<String> retargetingTagId) {
    this.retargetingTagId = retargetingTagId;
  }

  public RetargetingTag tag(String tag) {
    this.tag = JsonNullable.of(tag);
    return this;
  }

  /**
   * <div lang=\"ja\">サイトリターゲティングタグです。</div> <div lang=\"en\">Tag of site retargeting.</div> 
   * @return tag
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイトリターゲティングタグです。</div> <div lang=\"en\">Tag of site retargeting.</div> ")


  public JsonNullable<String> getTag() {
    return tag;
  }

  public void setTag(JsonNullable<String> tag) {
    this.tag = tag;
  }

  public RetargetingTag advancedTag(String advancedTag) {
    this.advancedTag = JsonNullable.of(advancedTag);
    return this;
  }

  /**
   * <div lang=\"ja\"> リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br> 詳細は、「<a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=ja&aid=1397\">サイトリターゲティングタグの取得とサイトへの設置</a>」を参照してください。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The new format of site retargeting tag avoids the impacts such as changes made to the browser. <br> More details are described on <a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=en&aid=581\">Acquire Site Retargeting Tag and Tagging on Site</a>.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return advancedTag
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br> 詳細は、「<a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=ja&aid=1397\">サイトリターゲティングタグの取得とサイトへの設置</a>」を参照してください。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The new format of site retargeting tag avoids the impacts such as changes made to the browser. <br> More details are described on <a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=en&aid=581\">Acquire Site Retargeting Tag and Tagging on Site</a>.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getAdvancedTag() {
    return advancedTag;
  }

  public void setAdvancedTag(JsonNullable<String> advancedTag) {
    this.advancedTag = advancedTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingTag retargetingTag = (RetargetingTag) o;
    return Objects.equals(this.accountId, retargetingTag.accountId) &&
        Objects.equals(this.approvalStatus, retargetingTag.approvalStatus) &&
        Objects.equals(this.retargetingTagId, retargetingTag.retargetingTagId) &&
        Objects.equals(this.tag, retargetingTag.tag) &&
        Objects.equals(this.advancedTag, retargetingTag.advancedTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatus, retargetingTagId, tag, advancedTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingTag {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    retargetingTagId: ").append(toIndentedString(retargetingTagId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    advancedTag: ").append(toIndentedString(advancedTag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


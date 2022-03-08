/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingTagServiceApprovalStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingTagオブジェクトは、サイトリターゲティングのタグ情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingTag objects displays tag information for site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingTagオブジェクトは、サイトリターゲティングのタグ情報を表します。</div> <div lang=\"en\">RetargetingTag objects displays tag information for site retargeting.</div> ")
@JsonPropertyOrder({
  RetargetingTag.JSON_PROPERTY_ACCOUNT_ID,
  RetargetingTag.JSON_PROPERTY_APPROVAL_STATUS,
  RetargetingTag.JSON_PROPERTY_RETARGETING_TAG_ID,
  RetargetingTag.JSON_PROPERTY_TAG,
  RetargetingTag.JSON_PROPERTY_ADVANCED_TAG
})
@JsonTypeName("RetargetingTag")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingTag {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private RetargetingTagServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_RETARGETING_TAG_ID = "retargetingTagId";
  private String retargetingTagId;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_ADVANCED_TAG = "advancedTag";
  private String advancedTag;

  public RetargetingTag() { 
  }

  public RetargetingTag accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public RetargetingTag approvalStatus(RetargetingTagServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingTagServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(RetargetingTagServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public RetargetingTag retargetingTagId(String retargetingTagId) {
    
    this.retargetingTagId = retargetingTagId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サイトリターゲティングのタグIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tag ID for site retargeting.&lt;/div&gt; 
   * @return retargetingTagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サイトリターゲティングのタグIDです。</div> <div lang=\"en\">Tag ID for site retargeting.</div> ")
  @JsonProperty(JSON_PROPERTY_RETARGETING_TAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRetargetingTagId() {
    return retargetingTagId;
  }


  @JsonProperty(JSON_PROPERTY_RETARGETING_TAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetargetingTagId(String retargetingTagId) {
    this.retargetingTagId = retargetingTagId;
  }


  public RetargetingTag tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サイトリターゲティングタグです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tag of site retargeting.&lt;/div&gt; 
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サイトリターゲティングタグです。</div> <div lang=\"en\">Tag of site retargeting.</div> ")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public RetargetingTag advancedTag(String advancedTag) {
    
    this.advancedTag = advancedTag;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。&lt;br&gt; 詳細は、「&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan&#x3D;ja&amp;aid&#x3D;1397\&quot;&gt;サイトリターゲティングタグの取得とサイトへの設置&lt;/a&gt;」を参照してください。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The new format of site retargeting tag avoids the impacts such as changes made to the browser. &lt;br&gt; More details are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan&#x3D;en&amp;aid&#x3D;581\&quot;&gt;Acquire Site Retargeting Tag and Tagging on Site&lt;/a&gt;.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return advancedTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br> 詳細は、「<a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=ja&aid=1397\">サイトリターゲティングタグの取得とサイトへの設置</a>」を参照してください。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The new format of site retargeting tag avoids the impacts such as changes made to the browser. <br> More details are described on <a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=en&aid=581\">Acquire Site Retargeting Tag and Tagging on Site</a>.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_ADVANCED_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdvancedTag() {
    return advancedTag;
  }


  @JsonProperty(JSON_PROPERTY_ADVANCED_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdvancedTag(String advancedTag) {
    this.advancedTag = advancedTag;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


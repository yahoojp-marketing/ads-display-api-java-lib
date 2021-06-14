package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignLabelオブジェクトは、キャンペーンラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignLabel object describes campaign label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignLabelオブジェクトは、キャンペーンラベルの情報を表します。</div> <div lang=\"en\">CampaignLabel object describes campaign label information.</div> ")

public class CampaignLabel   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("labelId")
  private JsonNullable<Long> labelId = JsonNullable.undefined();

  public CampaignLabel accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public CampaignLabel campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in requests. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignLabel labelId(Long labelId) {
    this.labelId = JsonNullable.of(labelId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベルIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Label ID.<br> This field is required in requests. </div> 
   * @return labelId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベルIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Label ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getLabelId() {
    return labelId;
  }

  public void setLabelId(JsonNullable<Long> labelId) {
    this.labelId = labelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignLabel campaignLabel = (CampaignLabel) o;
    return Objects.equals(this.accountId, campaignLabel.accountId) &&
        Objects.equals(this.campaignId, campaignLabel.campaignId) &&
        Objects.equals(this.labelId, campaignLabel.labelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, labelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignLabel {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceAudienceListDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAUDIENCE_LIST_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceAudienceListTarget object is a container for storing audience list targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is AUDIENCE_LIST_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAUDIENCE_LIST_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceAudienceListTarget object is a container for storing audience list targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is AUDIENCE_LIST_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceAudienceListTarget   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("audienceListName")
  private String audienceListName = null;

  @JsonProperty("deliverType")
  private GuaranteedInventoryServiceAudienceListDeliverType deliverType = null;

  public GuaranteedInventoryServiceAudienceListTarget accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、ADD時は必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in ADD operation. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、ADD時は必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in ADD operation. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedInventoryServiceAudienceListTarget accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウント名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウント名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public GuaranteedInventoryServiceAudienceListTarget audienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return audienceListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAudienceListName() {
    return audienceListName;
  }

  public void setAudienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
  }

  public GuaranteedInventoryServiceAudienceListTarget deliverType(GuaranteedInventoryServiceAudienceListDeliverType deliverType) {
    this.deliverType = deliverType;
    return this;
  }

  /**
   * Get deliverType
   * @return deliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceAudienceListDeliverType getDeliverType() {
    return deliverType;
  }

  public void setDeliverType(GuaranteedInventoryServiceAudienceListDeliverType deliverType) {
    this.deliverType = deliverType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceAudienceListTarget guaranteedInventoryServiceAudienceListTarget = (GuaranteedInventoryServiceAudienceListTarget) o;
    return Objects.equals(this.accountId, guaranteedInventoryServiceAudienceListTarget.accountId) &&
        Objects.equals(this.accountName, guaranteedInventoryServiceAudienceListTarget.accountName) &&
        Objects.equals(this.audienceListName, guaranteedInventoryServiceAudienceListTarget.audienceListName) &&
        Objects.equals(this.deliverType, guaranteedInventoryServiceAudienceListTarget.deliverType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, audienceListName, deliverType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceAudienceListTarget {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
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


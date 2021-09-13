package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedInventoryServiceTargetListDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがSITE_RETARGETINGの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceSiteRetargetingTarget object is a container for storing site retargeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is SITE_RETARGETING, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがSITE_RETARGETINGの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceSiteRetargetingTarget object is a container for storing site retargeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is SITE_RETARGETING, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceSiteRetargetingTarget   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("targetListName")
  private String targetListName = null;

  @JsonProperty("deliverType")
  private GuaranteedInventoryServiceTargetListDeliverType deliverType = null;

  public GuaranteedInventoryServiceSiteRetargetingTarget accountId(Long accountId) {
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

  public GuaranteedInventoryServiceSiteRetargetingTarget accountName(String accountName) {
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

  public GuaranteedInventoryServiceSiteRetargetingTarget targetListName(String targetListName) {
    this.targetListName = targetListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Target list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Target list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getTargetListName() {
    return targetListName;
  }

  public void setTargetListName(String targetListName) {
    this.targetListName = targetListName;
  }

  public GuaranteedInventoryServiceSiteRetargetingTarget deliverType(GuaranteedInventoryServiceTargetListDeliverType deliverType) {
    this.deliverType = deliverType;
    return this;
  }

  /**
   * Get deliverType
   * @return deliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceTargetListDeliverType getDeliverType() {
    return deliverType;
  }

  public void setDeliverType(GuaranteedInventoryServiceTargetListDeliverType deliverType) {
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
    GuaranteedInventoryServiceSiteRetargetingTarget guaranteedInventoryServiceSiteRetargetingTarget = (GuaranteedInventoryServiceSiteRetargetingTarget) o;
    return Objects.equals(this.accountId, guaranteedInventoryServiceSiteRetargetingTarget.accountId) &&
        Objects.equals(this.accountName, guaranteedInventoryServiceSiteRetargetingTarget.accountName) &&
        Objects.equals(this.targetListName, guaranteedInventoryServiceSiteRetargetingTarget.targetListName) &&
        Objects.equals(this.deliverType, guaranteedInventoryServiceSiteRetargetingTarget.deliverType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, targetListName, deliverType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceSiteRetargetingTarget {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
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


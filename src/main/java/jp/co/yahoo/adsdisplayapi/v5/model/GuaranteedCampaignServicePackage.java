package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServicePackageオブジェクトは、予約型のキャンペーンの商品に関する情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The GuaranteedCampaignServicePackage object serves package of guaranteed campaign.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServicePackageオブジェクトは、予約型のキャンペーンの商品に関する情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The GuaranteedCampaignServicePackage object serves package of guaranteed campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedCampaignServicePackage   {
  @JsonProperty("packageId")
  private Long packageId = null;

  @JsonProperty("packageHistoryId")
  private Long packageHistoryId = null;

  @JsonProperty("packageName")
  private String packageName = null;

  public GuaranteedCampaignServicePackage packageId(Long packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return packageId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getPackageId() {
    return packageId;
  }

  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }

  public GuaranteedCampaignServicePackage packageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品履歴IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package history ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return packageHistoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品履歴IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package history ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getPackageHistoryId() {
    return packageHistoryId;
  }

  public void setPackageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
  }

  public GuaranteedCampaignServicePackage packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return packageName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServicePackage guaranteedCampaignServicePackage = (GuaranteedCampaignServicePackage) o;
    return Objects.equals(this.packageId, guaranteedCampaignServicePackage.packageId) &&
        Objects.equals(this.packageHistoryId, guaranteedCampaignServicePackage.packageHistoryId) &&
        Objects.equals(this.packageName, guaranteedCampaignServicePackage.packageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageId, packageHistoryId, packageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServicePackage {\n");
    
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageHistoryId: ").append(toIndentedString(packageHistoryId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServicePackageオブジェクトは、予約型のキャンペーンの商品に関する情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The GuaranteedCampaignServicePackage object serves package of guaranteed campaign.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServicePackageオブジェクトは、予約型のキャンペーンの商品に関する情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The GuaranteedCampaignServicePackage object serves package of guaranteed campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  GuaranteedCampaignServicePackage.JSON_PROPERTY_PACKAGE_ID,
  GuaranteedCampaignServicePackage.JSON_PROPERTY_PACKAGE_HISTORY_ID,
  GuaranteedCampaignServicePackage.JSON_PROPERTY_PACKAGE_NAME
})
@JsonTypeName("GuaranteedCampaignServicePackage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedCampaignServicePackage {
  public static final String JSON_PROPERTY_PACKAGE_ID = "packageId";
  private Long packageId;

  public static final String JSON_PROPERTY_PACKAGE_HISTORY_ID = "packageHistoryId";
  private Long packageHistoryId;

  public static final String JSON_PROPERTY_PACKAGE_NAME = "packageName";
  private String packageName;

  public GuaranteedCampaignServicePackage() { 
  }

  public GuaranteedCampaignServicePackage packageId(Long packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 商品IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Package ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return packageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPackageId() {
    return packageId;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }


  public GuaranteedCampaignServicePackage packageHistoryId(Long packageHistoryId) {
    
    this.packageHistoryId = packageHistoryId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 商品履歴IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Package history ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return packageHistoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品履歴IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package history ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_PACKAGE_HISTORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPackageHistoryId() {
    return packageHistoryId;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_HISTORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
  }


  public GuaranteedCampaignServicePackage packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 商品名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Package Name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return packageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPackageName() {
    return packageName;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


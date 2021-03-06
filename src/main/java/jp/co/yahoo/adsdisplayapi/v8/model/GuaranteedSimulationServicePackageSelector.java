/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServiceAdType;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServiceDeviceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackageSelectorオブジェクトは、getPackageメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedSimulationServicePackageSelector object is a container for storing a set of criteria (parameters) for getPackage method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackageSelectorオブジェクトは、getPackageメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The GuaranteedSimulationServicePackageSelector object is a container for storing a set of criteria (parameters) for getPackage method.</div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePackageSelector.JSON_PROPERTY_ACCOUNT_ID,
  GuaranteedSimulationServicePackageSelector.JSON_PROPERTY_PACKAGE_NAME,
  GuaranteedSimulationServicePackageSelector.JSON_PROPERTY_PACKAGE_IDS,
  GuaranteedSimulationServicePackageSelector.JSON_PROPERTY_DEVICE_TYPES,
  GuaranteedSimulationServicePackageSelector.JSON_PROPERTY_AD_TYPES,
  GuaranteedSimulationServicePackageSelector.JSON_PROPERTY_NUMBER_RESULTS,
  GuaranteedSimulationServicePackageSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("GuaranteedSimulationServicePackageSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePackageSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_PACKAGE_NAME = "packageName";
  private String packageName;

  public static final String JSON_PROPERTY_PACKAGE_IDS = "packageIds";
  private List<Long> packageIds = null;

  public static final String JSON_PROPERTY_DEVICE_TYPES = "deviceTypes";
  private List<GuaranteedSimulationServiceDeviceType> deviceTypes = null;

  public static final String JSON_PROPERTY_AD_TYPES = "adTypes";
  private List<GuaranteedSimulationServiceAdType> adTypes = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 10;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public GuaranteedSimulationServicePackageSelector() { 
  }

  public GuaranteedSimulationServicePackageSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public GuaranteedSimulationServicePackageSelector packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : 商品名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Package name&lt;/div&gt; 
   * @return packageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 商品名</div> <div lang=\"en\">Search Condition: Package name</div> ")
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


  public GuaranteedSimulationServicePackageSelector packageIds(List<Long> packageIds) {
    
    this.packageIds = packageIds;
    return this;
  }

  public GuaranteedSimulationServicePackageSelector addPackageIdsItem(Long packageIdsItem) {
    if (this.packageIds == null) {
      this.packageIds = new ArrayList<>();
    }
    this.packageIds.add(packageIdsItem);
    return this;
  }

   /**
   * Get packageIds
   * @return packageIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPackageIds() {
    return packageIds;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageIds(List<Long> packageIds) {
    this.packageIds = packageIds;
  }


  public GuaranteedSimulationServicePackageSelector deviceTypes(List<GuaranteedSimulationServiceDeviceType> deviceTypes) {
    
    this.deviceTypes = deviceTypes;
    return this;
  }

  public GuaranteedSimulationServicePackageSelector addDeviceTypesItem(GuaranteedSimulationServiceDeviceType deviceTypesItem) {
    if (this.deviceTypes == null) {
      this.deviceTypes = new ArrayList<>();
    }
    this.deviceTypes.add(deviceTypesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : 配信先デバイス&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Devices&lt;/div&gt; 
   * @return deviceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 配信先デバイス</div> <div lang=\"en\">Search Condition: Devices</div> ")
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedSimulationServiceDeviceType> getDeviceTypes() {
    return deviceTypes;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceTypes(List<GuaranteedSimulationServiceDeviceType> deviceTypes) {
    this.deviceTypes = deviceTypes;
  }


  public GuaranteedSimulationServicePackageSelector adTypes(List<GuaranteedSimulationServiceAdType> adTypes) {
    
    this.adTypes = adTypes;
    return this;
  }

  public GuaranteedSimulationServicePackageSelector addAdTypesItem(GuaranteedSimulationServiceAdType adTypesItem) {
    if (this.adTypes == null) {
      this.adTypes = new ArrayList<>();
    }
    this.adTypes.add(adTypesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : 広告タイプ&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Ad Types&lt;/div&gt; 
   * @return adTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 広告タイプ</div> <div lang=\"en\">Search Condition: Ad Types</div> ")
  @JsonProperty(JSON_PROPERTY_AD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedSimulationServiceAdType> getAdTypes() {
    return adTypes;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdTypes(List<GuaranteedSimulationServiceAdType> adTypes) {
    this.adTypes = adTypes;
  }


  public GuaranteedSimulationServicePackageSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 10
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public GuaranteedSimulationServicePackageSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePackageSelector guaranteedSimulationServicePackageSelector = (GuaranteedSimulationServicePackageSelector) o;
    return Objects.equals(this.accountId, guaranteedSimulationServicePackageSelector.accountId) &&
        Objects.equals(this.packageName, guaranteedSimulationServicePackageSelector.packageName) &&
        Objects.equals(this.packageIds, guaranteedSimulationServicePackageSelector.packageIds) &&
        Objects.equals(this.deviceTypes, guaranteedSimulationServicePackageSelector.deviceTypes) &&
        Objects.equals(this.adTypes, guaranteedSimulationServicePackageSelector.adTypes) &&
        Objects.equals(this.numberResults, guaranteedSimulationServicePackageSelector.numberResults) &&
        Objects.equals(this.startIndex, guaranteedSimulationServicePackageSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, packageName, packageIds, deviceTypes, adTypes, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackageSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    packageIds: ").append(toIndentedString(packageIds)).append("\n");
    sb.append("    deviceTypes: ").append(toIndentedString(deviceTypes)).append("\n");
    sb.append("    adTypes: ").append(toIndentedString(adTypes)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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


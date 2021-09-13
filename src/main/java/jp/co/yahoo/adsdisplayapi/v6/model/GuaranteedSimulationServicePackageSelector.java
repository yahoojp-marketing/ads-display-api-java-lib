package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceAdPlaceType;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceAdType;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceDeviceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackageSelectorオブジェクトは、getPackageメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedSimulationServicePackageSelector object is a container for storing a set of criteria (parameters) for getPackage method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackageSelectorオブジェクトは、getPackageメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The GuaranteedSimulationServicePackageSelector object is a container for storing a set of criteria (parameters) for getPackage method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePackageSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("packageName")
  private String packageName = null;

  @JsonProperty("packageIds")
  @Valid
  private List<Long> packageIds = null;

  @JsonProperty("adPlaceTypes")
  @Valid
  private List<GuaranteedSimulationServiceAdPlaceType> adPlaceTypes = null;

  @JsonProperty("deviceTypes")
  @Valid
  private List<GuaranteedSimulationServiceDeviceType> deviceTypes = null;

  @JsonProperty("adTypes")
  @Valid
  private List<GuaranteedSimulationServiceAdType> adTypes = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public GuaranteedSimulationServicePackageSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedSimulationServicePackageSelector packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : 商品名</div> <div lang=\"en\">Search Condition: Package name</div> 
   * @return packageName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 商品名</div> <div lang=\"en\">Search Condition: Package name</div> ")


  public String getPackageName() {
    return packageName;
  }

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
  */
  @ApiModelProperty(value = "")


  public List<Long> getPackageIds() {
    return packageIds;
  }

  public void setPackageIds(List<Long> packageIds) {
    this.packageIds = packageIds;
  }

  public GuaranteedSimulationServicePackageSelector adPlaceTypes(List<GuaranteedSimulationServiceAdPlaceType> adPlaceTypes) {
    this.adPlaceTypes = adPlaceTypes;
    return this;
  }

  public GuaranteedSimulationServicePackageSelector addAdPlaceTypesItem(GuaranteedSimulationServiceAdPlaceType adPlaceTypesItem) {
    if (this.adPlaceTypes == null) {
      this.adPlaceTypes = new ArrayList<>();
    }
    this.adPlaceTypes.add(adPlaceTypesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : 掲載面</div> <div lang=\"en\">Search Condition: Ad placements</div> 
   * @return adPlaceTypes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 掲載面</div> <div lang=\"en\">Search Condition: Ad placements</div> ")

  @Valid

  public List<GuaranteedSimulationServiceAdPlaceType> getAdPlaceTypes() {
    return adPlaceTypes;
  }

  public void setAdPlaceTypes(List<GuaranteedSimulationServiceAdPlaceType> adPlaceTypes) {
    this.adPlaceTypes = adPlaceTypes;
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
   * <div lang=\"ja\">検索条件 : 配信先デバイス</div> <div lang=\"en\">Search Condition: Devices</div> 
   * @return deviceTypes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 配信先デバイス</div> <div lang=\"en\">Search Condition: Devices</div> ")

  @Valid

  public List<GuaranteedSimulationServiceDeviceType> getDeviceTypes() {
    return deviceTypes;
  }

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
   * <div lang=\"ja\">検索条件 : 広告タイプ</div> <div lang=\"en\">Search Condition: Ad Types</div> 
   * @return adTypes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 広告タイプ</div> <div lang=\"en\">Search Condition: Ad Types</div> ")

  @Valid

  public List<GuaranteedSimulationServiceAdType> getAdTypes() {
    return adTypes;
  }

  public void setAdTypes(List<GuaranteedSimulationServiceAdType> adTypes) {
    this.adTypes = adTypes;
  }

  public GuaranteedSimulationServicePackageSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 10
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(10) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public GuaranteedSimulationServicePackageSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

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
        Objects.equals(this.adPlaceTypes, guaranteedSimulationServicePackageSelector.adPlaceTypes) &&
        Objects.equals(this.deviceTypes, guaranteedSimulationServicePackageSelector.deviceTypes) &&
        Objects.equals(this.adTypes, guaranteedSimulationServicePackageSelector.adTypes) &&
        Objects.equals(this.numberResults, guaranteedSimulationServicePackageSelector.numberResults) &&
        Objects.equals(this.startIndex, guaranteedSimulationServicePackageSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, packageName, packageIds, adPlaceTypes, deviceTypes, adTypes, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackageSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    packageIds: ").append(toIndentedString(packageIds)).append("\n");
    sb.append("    adPlaceTypes: ").append(toIndentedString(adPlaceTypes)).append("\n");
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


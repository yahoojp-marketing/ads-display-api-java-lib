package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceAppConversionPlatform;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceCountingType;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceExcludePreviousConversion;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceStatsPeriod;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceStatsPeriodCustomDate;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceSelector object contains a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">ConversionTrackerServiceSelector object contains a set of criteria (parameters) for get method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("appConversionPlatform")
  private ConversionTrackerServiceAppConversionPlatform appConversionPlatform = null;

  @JsonProperty("appIds")
  @Valid
  private List<String> appIds = null;

  @JsonProperty("categories")
  @Valid
  private List<ConversionTrackerServiceCategory> categories = null;

  @JsonProperty("conversionTrackerIds")
  @Valid
  private List<Long> conversionTrackerIds = null;

  @JsonProperty("conversionTrackerTypes")
  @Valid
  private List<ConversionTrackerServiceType> conversionTrackerTypes = null;

  @JsonProperty("countingType")
  private ConversionTrackerServiceCountingType countingType = null;

  @JsonProperty("excludeFromBidding")
  private ConversionTrackerServiceExcludeFromBidding excludeFromBidding = null;

  @JsonProperty("excludePreviousConversion")
  private ConversionTrackerServiceExcludePreviousConversion excludePreviousConversion = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("statsPeriod")
  private ConversionTrackerServiceStatsPeriod statsPeriod = null;

  @JsonProperty("statsPeriodCustomDate")
  private ConversionTrackerServiceStatsPeriodCustomDate statsPeriodCustomDate = null;

  @JsonProperty("statuses")
  @Valid
  private List<ConversionTrackerServiceStatus> statuses = null;

  public ConversionTrackerServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ConversionTrackerServiceSelector appConversionPlatform(ConversionTrackerServiceAppConversionPlatform appConversionPlatform) {
    this.appConversionPlatform = appConversionPlatform;
    return this;
  }

  /**
   * Get appConversionPlatform
   * @return appConversionPlatform
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppConversionPlatform getAppConversionPlatform() {
    return appConversionPlatform;
  }

  public void setAppConversionPlatform(ConversionTrackerServiceAppConversionPlatform appConversionPlatform) {
    this.appConversionPlatform = appConversionPlatform;
  }

  public ConversionTrackerServiceSelector appIds(List<String> appIds) {
    this.appIds = appIds;
    return this;
  }

  public ConversionTrackerServiceSelector addAppIdsItem(String appIdsItem) {
    if (this.appIds == null) {
      this.appIds = new ArrayList<>();
    }
    this.appIds.add(appIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリID。</div> <div lang=\"en\">App ID.</div> 
   * @return appIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリID。</div> <div lang=\"en\">App ID.</div> ")

@Size(max=1000) 
  public List<String> getAppIds() {
    return appIds;
  }

  public void setAppIds(List<String> appIds) {
    this.appIds = appIds;
  }

  public ConversionTrackerServiceSelector categories(List<ConversionTrackerServiceCategory> categories) {
    this.categories = categories;
    return this;
  }

  public ConversionTrackerServiceSelector addCategoriesItem(ConversionTrackerServiceCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=7) 
  public List<ConversionTrackerServiceCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<ConversionTrackerServiceCategory> categories) {
    this.categories = categories;
  }

  public ConversionTrackerServiceSelector conversionTrackerIds(List<Long> conversionTrackerIds) {
    this.conversionTrackerIds = conversionTrackerIds;
    return this;
  }

  public ConversionTrackerServiceSelector addConversionTrackerIdsItem(Long conversionTrackerIdsItem) {
    if (this.conversionTrackerIds == null) {
      this.conversionTrackerIds = new ArrayList<>();
    }
    this.conversionTrackerIds.add(conversionTrackerIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョントラッカーのID。</div> <div lang=\"en\">Conversion Tracker ID.</div> 
   * @return conversionTrackerIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーのID。</div> <div lang=\"en\">Conversion Tracker ID.</div> ")

@Size(max=1000) 
  public List<Long> getConversionTrackerIds() {
    return conversionTrackerIds;
  }

  public void setConversionTrackerIds(List<Long> conversionTrackerIds) {
    this.conversionTrackerIds = conversionTrackerIds;
  }

  public ConversionTrackerServiceSelector conversionTrackerTypes(List<ConversionTrackerServiceType> conversionTrackerTypes) {
    this.conversionTrackerTypes = conversionTrackerTypes;
    return this;
  }

  public ConversionTrackerServiceSelector addConversionTrackerTypesItem(ConversionTrackerServiceType conversionTrackerTypesItem) {
    if (this.conversionTrackerTypes == null) {
      this.conversionTrackerTypes = new ArrayList<>();
    }
    this.conversionTrackerTypes.add(conversionTrackerTypesItem);
    return this;
  }

  /**
   * Get conversionTrackerTypes
   * @return conversionTrackerTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<ConversionTrackerServiceType> getConversionTrackerTypes() {
    return conversionTrackerTypes;
  }

  public void setConversionTrackerTypes(List<ConversionTrackerServiceType> conversionTrackerTypes) {
    this.conversionTrackerTypes = conversionTrackerTypes;
  }

  public ConversionTrackerServiceSelector countingType(ConversionTrackerServiceCountingType countingType) {
    this.countingType = countingType;
    return this;
  }

  /**
   * Get countingType
   * @return countingType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceCountingType getCountingType() {
    return countingType;
  }

  public void setCountingType(ConversionTrackerServiceCountingType countingType) {
    this.countingType = countingType;
  }

  public ConversionTrackerServiceSelector excludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
    return this;
  }

  /**
   * Get excludeFromBidding
   * @return excludeFromBidding
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceExcludeFromBidding getExcludeFromBidding() {
    return excludeFromBidding;
  }

  public void setExcludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
  }

  public ConversionTrackerServiceSelector excludePreviousConversion(ConversionTrackerServiceExcludePreviousConversion excludePreviousConversion) {
    this.excludePreviousConversion = excludePreviousConversion;
    return this;
  }

  /**
   * Get excludePreviousConversion
   * @return excludePreviousConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceExcludePreviousConversion getExcludePreviousConversion() {
    return excludePreviousConversion;
  }

  public void setExcludePreviousConversion(ConversionTrackerServiceExcludePreviousConversion excludePreviousConversion) {
    this.excludePreviousConversion = excludePreviousConversion;
  }

  public ConversionTrackerServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(1000) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public ConversionTrackerServiceSelector startIndex(Integer startIndex) {
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

  public ConversionTrackerServiceSelector statsPeriod(ConversionTrackerServiceStatsPeriod statsPeriod) {
    this.statsPeriod = statsPeriod;
    return this;
  }

  /**
   * Get statsPeriod
   * @return statsPeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceStatsPeriod getStatsPeriod() {
    return statsPeriod;
  }

  public void setStatsPeriod(ConversionTrackerServiceStatsPeriod statsPeriod) {
    this.statsPeriod = statsPeriod;
  }

  public ConversionTrackerServiceSelector statsPeriodCustomDate(ConversionTrackerServiceStatsPeriodCustomDate statsPeriodCustomDate) {
    this.statsPeriodCustomDate = statsPeriodCustomDate;
    return this;
  }

  /**
   * Get statsPeriodCustomDate
   * @return statsPeriodCustomDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceStatsPeriodCustomDate getStatsPeriodCustomDate() {
    return statsPeriodCustomDate;
  }

  public void setStatsPeriodCustomDate(ConversionTrackerServiceStatsPeriodCustomDate statsPeriodCustomDate) {
    this.statsPeriodCustomDate = statsPeriodCustomDate;
  }

  public ConversionTrackerServiceSelector statuses(List<ConversionTrackerServiceStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ConversionTrackerServiceSelector addStatusesItem(ConversionTrackerServiceStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<ConversionTrackerServiceStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<ConversionTrackerServiceStatus> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceSelector conversionTrackerServiceSelector = (ConversionTrackerServiceSelector) o;
    return Objects.equals(this.accountId, conversionTrackerServiceSelector.accountId) &&
        Objects.equals(this.appConversionPlatform, conversionTrackerServiceSelector.appConversionPlatform) &&
        Objects.equals(this.appIds, conversionTrackerServiceSelector.appIds) &&
        Objects.equals(this.categories, conversionTrackerServiceSelector.categories) &&
        Objects.equals(this.conversionTrackerIds, conversionTrackerServiceSelector.conversionTrackerIds) &&
        Objects.equals(this.conversionTrackerTypes, conversionTrackerServiceSelector.conversionTrackerTypes) &&
        Objects.equals(this.countingType, conversionTrackerServiceSelector.countingType) &&
        Objects.equals(this.excludeFromBidding, conversionTrackerServiceSelector.excludeFromBidding) &&
        Objects.equals(this.excludePreviousConversion, conversionTrackerServiceSelector.excludePreviousConversion) &&
        Objects.equals(this.numberResults, conversionTrackerServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, conversionTrackerServiceSelector.startIndex) &&
        Objects.equals(this.statsPeriod, conversionTrackerServiceSelector.statsPeriod) &&
        Objects.equals(this.statsPeriodCustomDate, conversionTrackerServiceSelector.statsPeriodCustomDate) &&
        Objects.equals(this.statuses, conversionTrackerServiceSelector.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, appConversionPlatform, appIds, categories, conversionTrackerIds, conversionTrackerTypes, countingType, excludeFromBidding, excludePreviousConversion, numberResults, startIndex, statsPeriod, statsPeriodCustomDate, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    appConversionPlatform: ").append(toIndentedString(appConversionPlatform)).append("\n");
    sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    conversionTrackerIds: ").append(toIndentedString(conversionTrackerIds)).append("\n");
    sb.append("    conversionTrackerTypes: ").append(toIndentedString(conversionTrackerTypes)).append("\n");
    sb.append("    countingType: ").append(toIndentedString(countingType)).append("\n");
    sb.append("    excludeFromBidding: ").append(toIndentedString(excludeFromBidding)).append("\n");
    sb.append("    excludePreviousConversion: ").append(toIndentedString(excludePreviousConversion)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    statsPeriod: ").append(toIndentedString(statsPeriod)).append("\n");
    sb.append("    statsPeriodCustomDate: ").append(toIndentedString(statsPeriodCustomDate)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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


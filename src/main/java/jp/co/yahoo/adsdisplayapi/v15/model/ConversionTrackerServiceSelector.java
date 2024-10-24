/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

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
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceAppConversionPlatform;
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceCountingType;
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceExcludePreviousConversion;
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceStatsPeriod;
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceStatsPeriodCustomDate;
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adsdisplayapi.v15.model.ConversionTrackerServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceSelector object contains a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">ConversionTrackerServiceSelector object contains a set of criteria (parameters) for get method.</div> ")
@JsonPropertyOrder({
  ConversionTrackerServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  ConversionTrackerServiceSelector.JSON_PROPERTY_APP_CONVERSION_PLATFORM,
  ConversionTrackerServiceSelector.JSON_PROPERTY_APP_IDS,
  ConversionTrackerServiceSelector.JSON_PROPERTY_CATEGORIES,
  ConversionTrackerServiceSelector.JSON_PROPERTY_CONVERSION_TRACKER_IDS,
  ConversionTrackerServiceSelector.JSON_PROPERTY_CONVERSION_TRACKER_TYPES,
  ConversionTrackerServiceSelector.JSON_PROPERTY_COUNTING_TYPE,
  ConversionTrackerServiceSelector.JSON_PROPERTY_EXCLUDE_FROM_BIDDING,
  ConversionTrackerServiceSelector.JSON_PROPERTY_EXCLUDE_PREVIOUS_CONVERSION,
  ConversionTrackerServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  ConversionTrackerServiceSelector.JSON_PROPERTY_START_INDEX,
  ConversionTrackerServiceSelector.JSON_PROPERTY_STATS_PERIOD,
  ConversionTrackerServiceSelector.JSON_PROPERTY_STATS_PERIOD_CUSTOM_DATE,
  ConversionTrackerServiceSelector.JSON_PROPERTY_STATUSES
})
@JsonTypeName("ConversionTrackerServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APP_CONVERSION_PLATFORM = "appConversionPlatform";
  private ConversionTrackerServiceAppConversionPlatform appConversionPlatform;

  public static final String JSON_PROPERTY_APP_IDS = "appIds";
  private List<String> appIds = null;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<ConversionTrackerServiceCategory> categories = null;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_IDS = "conversionTrackerIds";
  private List<Long> conversionTrackerIds = null;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_TYPES = "conversionTrackerTypes";
  private List<ConversionTrackerServiceType> conversionTrackerTypes = null;

  public static final String JSON_PROPERTY_COUNTING_TYPE = "countingType";
  private ConversionTrackerServiceCountingType countingType;

  public static final String JSON_PROPERTY_EXCLUDE_FROM_BIDDING = "excludeFromBidding";
  private ConversionTrackerServiceExcludeFromBidding excludeFromBidding;

  public static final String JSON_PROPERTY_EXCLUDE_PREVIOUS_CONVERSION = "excludePreviousConversion";
  private ConversionTrackerServiceExcludePreviousConversion excludePreviousConversion;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_STATS_PERIOD = "statsPeriod";
  private ConversionTrackerServiceStatsPeriod statsPeriod;

  public static final String JSON_PROPERTY_STATS_PERIOD_CUSTOM_DATE = "statsPeriodCustomDate";
  private ConversionTrackerServiceStatsPeriodCustomDate statsPeriodCustomDate;

  public static final String JSON_PROPERTY_STATUSES = "statuses";
  private List<ConversionTrackerServiceStatus> statuses = null;

  public ConversionTrackerServiceSelector() { 
  }

  public ConversionTrackerServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID。</div> <div lang=\"en\">Account ID.</div> ")
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


  public ConversionTrackerServiceSelector appConversionPlatform(ConversionTrackerServiceAppConversionPlatform appConversionPlatform) {
    
    this.appConversionPlatform = appConversionPlatform;
    return this;
  }

   /**
   * Get appConversionPlatform
   * @return appConversionPlatform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_CONVERSION_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppConversionPlatform getAppConversionPlatform() {
    return appConversionPlatform;
  }


  @JsonProperty(JSON_PROPERTY_APP_CONVERSION_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリID。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App ID.&lt;/div&gt; 
   * @return appIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリID。</div> <div lang=\"en\">App ID.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAppIds() {
    return appIds;
  }


  @JsonProperty(JSON_PROPERTY_APP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceCategory> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカーのID。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion tracker ID.&lt;/div&gt; 
   * @return conversionTrackerIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーのID。</div> <div lang=\"en\">Conversion tracker ID.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConversionTrackerIds() {
    return conversionTrackerIds;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceType> getConversionTrackerTypes() {
    return conversionTrackerTypes;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceCountingType getCountingType() {
    return countingType;
  }


  @JsonProperty(JSON_PROPERTY_COUNTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_FROM_BIDDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceExcludeFromBidding getExcludeFromBidding() {
    return excludeFromBidding;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_FROM_BIDDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_PREVIOUS_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceExcludePreviousConversion getExcludePreviousConversion() {
    return excludePreviousConversion;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_PREVIOUS_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludePreviousConversion(ConversionTrackerServiceExcludePreviousConversion excludePreviousConversion) {
    this.excludePreviousConversion = excludePreviousConversion;
  }


  public ConversionTrackerServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.</div> ")
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


  public ConversionTrackerServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 0.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。</div> <div lang=\"en\">The position within the result set where retrieval begins. This field must be greater than or equal to 0.</div> ")
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


  public ConversionTrackerServiceSelector statsPeriod(ConversionTrackerServiceStatsPeriod statsPeriod) {
    
    this.statsPeriod = statsPeriod;
    return this;
  }

   /**
   * Get statsPeriod
   * @return statsPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATS_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceStatsPeriod getStatsPeriod() {
    return statsPeriod;
  }


  @JsonProperty(JSON_PROPERTY_STATS_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATS_PERIOD_CUSTOM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceStatsPeriodCustomDate getStatsPeriodCustomDate() {
    return statsPeriodCustomDate;
  }


  @JsonProperty(JSON_PROPERTY_STATS_PERIOD_CUSTOM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceStatus> getStatuses() {
    return statuses;
  }


  @JsonProperty(JSON_PROPERTY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


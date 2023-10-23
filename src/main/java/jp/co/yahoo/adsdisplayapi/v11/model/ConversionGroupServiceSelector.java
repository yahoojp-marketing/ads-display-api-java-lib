/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionGroupServiceSelector object contains a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ConversionGroupServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  ConversionGroupServiceSelector.JSON_PROPERTY_CONVERSION_GROUP_IDS,
  ConversionGroupServiceSelector.JSON_PROPERTY_CONVERSION_GROUP_NAME,
  ConversionGroupServiceSelector.JSON_PROPERTY_CONVERSION_TRACKER_IDS,
  ConversionGroupServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  ConversionGroupServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionGroupServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CONVERSION_GROUP_IDS = "conversionGroupIds";
  private List<Long> conversionGroupIds;

  public static final String JSON_PROPERTY_CONVERSION_GROUP_NAME = "conversionGroupName";
  private String conversionGroupName;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_IDS = "conversionTrackerIds";
  private List<Long> conversionTrackerIds;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public ConversionGroupServiceSelector() {
  }

  public ConversionGroupServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nonnull
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


  public ConversionGroupServiceSelector conversionGroupIds(List<Long> conversionGroupIds) {
    
    this.conversionGroupIds = conversionGroupIds;
    return this;
  }

  public ConversionGroupServiceSelector addConversionGroupIdsItem(Long conversionGroupIdsItem) {
    if (this.conversionGroupIds == null) {
      this.conversionGroupIds = new ArrayList<>();
    }
    this.conversionGroupIds.add(conversionGroupIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョングループのID。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion Group ID.&lt;/div&gt; 
   * @return conversionGroupIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConversionGroupIds() {
    return conversionGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionGroupIds(List<Long> conversionGroupIds) {
    this.conversionGroupIds = conversionGroupIds;
  }


  public ConversionGroupServiceSelector conversionGroupName(String conversionGroupName) {
    
    this.conversionGroupName = conversionGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   コンバージョングループ名。&lt;br&gt;   この検索条件では、大文字と小文字は区別されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Conversion group name.&lt;br&gt;   This searching condition is case-insensitive. &lt;/div&gt; 
   * @return conversionGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversionGroupName() {
    return conversionGroupName;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionGroupName(String conversionGroupName) {
    this.conversionGroupName = conversionGroupName;
  }


  public ConversionGroupServiceSelector conversionTrackerIds(List<Long> conversionTrackerIds) {
    
    this.conversionTrackerIds = conversionTrackerIds;
    return this;
  }

  public ConversionGroupServiceSelector addConversionTrackerIdsItem(Long conversionTrackerIdsItem) {
    if (this.conversionTrackerIds == null) {
      this.conversionTrackerIds = new ArrayList<>();
    }
    this.conversionTrackerIds.add(conversionTrackerIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカーのID。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion Tracker ID.&lt;/div&gt; 
   * @return conversionTrackerIds
  **/
  @jakarta.annotation.Nullable
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


  public ConversionGroupServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
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


  public ConversionGroupServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
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
    ConversionGroupServiceSelector conversionGroupServiceSelector = (ConversionGroupServiceSelector) o;
    return Objects.equals(this.accountId, conversionGroupServiceSelector.accountId) &&
        Objects.equals(this.conversionGroupIds, conversionGroupServiceSelector.conversionGroupIds) &&
        Objects.equals(this.conversionGroupName, conversionGroupServiceSelector.conversionGroupName) &&
        Objects.equals(this.conversionTrackerIds, conversionGroupServiceSelector.conversionTrackerIds) &&
        Objects.equals(this.numberResults, conversionGroupServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, conversionGroupServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, conversionGroupIds, conversionGroupName, conversionTrackerIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionGroupServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    conversionGroupIds: ").append(toIndentedString(conversionGroupIds)).append("\n");
    sb.append("    conversionGroupName: ").append(toIndentedString(conversionGroupName)).append("\n");
    sb.append("    conversionTrackerIds: ").append(toIndentedString(conversionTrackerIds)).append("\n");
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


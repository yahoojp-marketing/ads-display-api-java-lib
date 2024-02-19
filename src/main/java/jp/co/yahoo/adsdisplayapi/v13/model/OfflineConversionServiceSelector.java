/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

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
import jp.co.yahoo.adsdisplayapi.v13.model.OfflineConversionServiceSort;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;OfflineConversionServiceSelectorオブジェクトは、登録したオフラインコンバージョンデータを照会するための検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;OfflineConversionServiceSelector object contains search condition to inquire about registered offline conversion data.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">OfflineConversionServiceSelectorオブジェクトは、登録したオフラインコンバージョンデータを照会するための検索条件を格納します。</div> <div lang=\"en\">OfflineConversionServiceSelector object contains search condition to inquire about registered offline conversion data.</div> ")
@JsonPropertyOrder({
  OfflineConversionServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  OfflineConversionServiceSelector.JSON_PROPERTY_UPLOAD_IDS,
  OfflineConversionServiceSelector.JSON_PROPERTY_SORTS,
  OfflineConversionServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  OfflineConversionServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("OfflineConversionServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OfflineConversionServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_UPLOAD_IDS = "uploadIds";
  private List<Long> uploadIds = null;

  public static final String JSON_PROPERTY_SORTS = "sorts";
  private List<OfflineConversionServiceSort> sorts = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public OfflineConversionServiceSelector() { 
  }

  public OfflineConversionServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
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


  public OfflineConversionServiceSelector uploadIds(List<Long> uploadIds) {
    
    this.uploadIds = uploadIds;
    return this;
  }

  public OfflineConversionServiceSelector addUploadIdsItem(Long uploadIdsItem) {
    if (this.uploadIds == null) {
      this.uploadIds = new ArrayList<>();
    }
    this.uploadIds.add(uploadIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アップロードIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Upload ID.&lt;/div&gt; 
   * @return uploadIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アップロードIDです。</div> <div lang=\"en\">Search condition: Upload ID.</div> ")
  @JsonProperty(JSON_PROPERTY_UPLOAD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getUploadIds() {
    return uploadIds;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadIds(List<Long> uploadIds) {
    this.uploadIds = uploadIds;
  }


  public OfflineConversionServiceSelector sorts(List<OfflineConversionServiceSort> sorts) {
    
    this.sorts = sorts;
    return this;
  }

  public OfflineConversionServiceSelector addSortsItem(OfflineConversionServiceSort sortsItem) {
    if (this.sorts == null) {
      this.sorts = new ArrayList<>();
    }
    this.sorts.add(sortsItem);
    return this;
  }

   /**
   * Get sorts
   * @return sorts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OfflineConversionServiceSort> getSorts() {
    return sorts;
  }


  @JsonProperty(JSON_PROPERTY_SORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSorts(List<OfflineConversionServiceSort> sorts) {
    this.sorts = sorts;
  }


  public OfflineConversionServiceSelector numberResults(Integer numberResults) {
    
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


  public OfflineConversionServiceSelector startIndex(Integer startIndex) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionServiceSelector offlineConversionServiceSelector = (OfflineConversionServiceSelector) o;
    return Objects.equals(this.accountId, offlineConversionServiceSelector.accountId) &&
        Objects.equals(this.uploadIds, offlineConversionServiceSelector.uploadIds) &&
        Objects.equals(this.sorts, offlineConversionServiceSelector.sorts) &&
        Objects.equals(this.numberResults, offlineConversionServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, offlineConversionServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, uploadIds, sorts, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    uploadIds: ").append(toIndentedString(uploadIds)).append("\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
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


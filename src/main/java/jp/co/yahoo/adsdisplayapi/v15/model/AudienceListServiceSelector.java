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
import jp.co.yahoo.adsdisplayapi.v15.model.AudienceListServiceSharingStatusFilterType;
import jp.co.yahoo.adsdisplayapi.v15.model.AudienceListServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceSelectorオブジェクトは、オーディエンスリストを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceListServiceSelector object specifies audience list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AudienceListServiceSelectorオブジェクトは、オーディエンスリストを指定します。</div> <div lang=\"en\">AudienceListServiceSelector object specifies audience list.</div> ")
@JsonPropertyOrder({
  AudienceListServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  AudienceListServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AudienceListServiceSelector.JSON_PROPERTY_START_INDEX,
  AudienceListServiceSelector.JSON_PROPERTY_AUDIENCE_LIST_IDS,
  AudienceListServiceSelector.JSON_PROPERTY_AUDIENCE_LIST_TYPES,
  AudienceListServiceSelector.JSON_PROPERTY_SHARING_STATUS_FILTER_TYPE
})
@JsonTypeName("AudienceListServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 1000;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_IDS = "audienceListIds";
  private List<Long> audienceListIds = null;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_TYPES = "audienceListTypes";
  private List<AudienceListServiceType> audienceListTypes = null;

  public static final String JSON_PROPERTY_SHARING_STATUS_FILTER_TYPE = "sharingStatusFilterType";
  private AudienceListServiceSharingStatusFilterType sharingStatusFilterType;

  public AudienceListServiceSelector() { 
  }

  public AudienceListServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
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


  public AudienceListServiceSelector numberResults(Integer numberResults) {
    
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


  public AudienceListServiceSelector startIndex(Integer startIndex) {
    
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


  public AudienceListServiceSelector audienceListIds(List<Long> audienceListIds) {
    
    this.audienceListIds = audienceListIds;
    return this;
  }

  public AudienceListServiceSelector addAudienceListIdsItem(Long audienceListIdsItem) {
    if (this.audienceListIds == null) {
      this.audienceListIds = new ArrayList<>();
    }
    this.audienceListIds.add(audienceListIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスリストIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Audience list ID.&lt;/div&gt; 
   * @return audienceListIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">オーディエンスリストIDです。</div> <div lang=\"en\">Audience list ID.</div> ")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAudienceListIds() {
    return audienceListIds;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListIds(List<Long> audienceListIds) {
    this.audienceListIds = audienceListIds;
  }


  public AudienceListServiceSelector audienceListTypes(List<AudienceListServiceType> audienceListTypes) {
    
    this.audienceListTypes = audienceListTypes;
    return this;
  }

  public AudienceListServiceSelector addAudienceListTypesItem(AudienceListServiceType audienceListTypesItem) {
    if (this.audienceListTypes == null) {
      this.audienceListTypes = new ArrayList<>();
    }
    this.audienceListTypes.add(audienceListTypesItem);
    return this;
  }

   /**
   * Get audienceListTypes
   * @return audienceListTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AudienceListServiceType> getAudienceListTypes() {
    return audienceListTypes;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListTypes(List<AudienceListServiceType> audienceListTypes) {
    this.audienceListTypes = audienceListTypes;
  }


  public AudienceListServiceSelector sharingStatusFilterType(AudienceListServiceSharingStatusFilterType sharingStatusFilterType) {
    
    this.sharingStatusFilterType = sharingStatusFilterType;
    return this;
  }

   /**
   * Get sharingStatusFilterType
   * @return sharingStatusFilterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARING_STATUS_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceSharingStatusFilterType getSharingStatusFilterType() {
    return sharingStatusFilterType;
  }


  @JsonProperty(JSON_PROPERTY_SHARING_STATUS_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharingStatusFilterType(AudienceListServiceSharingStatusFilterType sharingStatusFilterType) {
    this.sharingStatusFilterType = sharingStatusFilterType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceSelector audienceListServiceSelector = (AudienceListServiceSelector) o;
    return Objects.equals(this.accountId, audienceListServiceSelector.accountId) &&
        Objects.equals(this.numberResults, audienceListServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, audienceListServiceSelector.startIndex) &&
        Objects.equals(this.audienceListIds, audienceListServiceSelector.audienceListIds) &&
        Objects.equals(this.audienceListTypes, audienceListServiceSelector.audienceListTypes) &&
        Objects.equals(this.sharingStatusFilterType, audienceListServiceSelector.sharingStatusFilterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, numberResults, startIndex, audienceListIds, audienceListTypes, sharingStatusFilterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    audienceListIds: ").append(toIndentedString(audienceListIds)).append("\n");
    sb.append("    audienceListTypes: ").append(toIndentedString(audienceListTypes)).append("\n");
    sb.append("    sharingStatusFilterType: ").append(toIndentedString(sharingStatusFilterType)).append("\n");
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


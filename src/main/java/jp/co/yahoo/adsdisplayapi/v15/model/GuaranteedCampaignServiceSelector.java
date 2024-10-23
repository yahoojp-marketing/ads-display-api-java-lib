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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedCampaignServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedCampaignServiceSelector object is a container for storing a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedCampaignServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The GuaranteedCampaignServiceSelector object is a container for storing a set of criteria (parameters) for get method.</div> ")
@JsonPropertyOrder({
  GuaranteedCampaignServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  GuaranteedCampaignServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  GuaranteedCampaignServiceSelector.JSON_PROPERTY_CONTAINS_LABEL_ID_FLG,
  GuaranteedCampaignServiceSelector.JSON_PROPERTY_LABEL_IDS,
  GuaranteedCampaignServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  GuaranteedCampaignServiceSelector.JSON_PROPERTY_START_INDEX,
  GuaranteedCampaignServiceSelector.JSON_PROPERTY_CONVERSION_GROUP_IDS,
  GuaranteedCampaignServiceSelector.JSON_PROPERTY_CONVERSION_TRACKER_IDS
})
@JsonTypeName("GuaranteedCampaignServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedCampaignServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_CONTAINS_LABEL_ID_FLG = "containsLabelIdFlg";
  private Boolean containsLabelIdFlg;

  public static final String JSON_PROPERTY_LABEL_IDS = "labelIds";
  private List<Long> labelIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_CONVERSION_GROUP_IDS = "conversionGroupIds";
  private List<Long> conversionGroupIds = null;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_IDS = "conversionTrackerIds";
  private List<Long> conversionTrackerIds = null;

  public GuaranteedCampaignServiceSelector() { 
  }

  public GuaranteedCampaignServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search condition: Account ID</div> ")
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


  public GuaranteedCampaignServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public GuaranteedCampaignServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   検索条件 : キャンペーンID &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Search Condition: Campaign ID &lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   検索条件 : キャンペーンID </div> <div lang=\"en\">   Search Condition: Campaign ID </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public GuaranteedCampaignServiceSelector containsLabelIdFlg(Boolean containsLabelIdFlg) {
    
    this.containsLabelIdFlg = containsLabelIdFlg;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベルID取得フラグです。&lt;br&gt; このフィールドは省略可能となります。その際、デフォルト値はfalseとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Flag of contains label ID.&lt;br&gt; This field is optional. The default value will be false. &lt;/div&gt; 
   * @return containsLabelIdFlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルID取得フラグです。<br> このフィールドは省略可能となります。その際、デフォルト値はfalseとなります。 </div> <div lang=\"en\">Flag of contains label ID.<br> This field is optional. The default value will be false. </div> ")
  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsLabelIdFlg() {
    return containsLabelIdFlg;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsLabelIdFlg(Boolean containsLabelIdFlg) {
    this.containsLabelIdFlg = containsLabelIdFlg;
  }


  public GuaranteedCampaignServiceSelector labelIds(List<Long> labelIds) {
    
    this.labelIds = labelIds;
    return this;
  }

  public GuaranteedCampaignServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : ラベルID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Label ID&lt;/div&gt; 
   * @return labelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : ラベルID</div> <div lang=\"en\">Search condition: Label ID</div> ")
  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getLabelIds() {
    return labelIds;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }


  public GuaranteedCampaignServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
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


  public GuaranteedCampaignServiceSelector startIndex(Integer startIndex) {
    
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


  public GuaranteedCampaignServiceSelector conversionGroupIds(List<Long> conversionGroupIds) {
    
    this.conversionGroupIds = conversionGroupIds;
    return this;
  }

  public GuaranteedCampaignServiceSelector addConversionGroupIdsItem(Long conversionGroupIdsItem) {
    if (this.conversionGroupIds == null) {
      this.conversionGroupIds = new ArrayList<>();
    }
    this.conversionGroupIds.add(conversionGroupIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : コンバージョングループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Conversion Group ID&lt;/div&gt; 
   * @return conversionGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : コンバージョングループID</div> <div lang=\"en\">Search condition: Conversion Group ID</div> ")
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


  public GuaranteedCampaignServiceSelector conversionTrackerIds(List<Long> conversionTrackerIds) {
    
    this.conversionTrackerIds = conversionTrackerIds;
    return this;
  }

  public GuaranteedCampaignServiceSelector addConversionTrackerIdsItem(Long conversionTrackerIdsItem) {
    if (this.conversionTrackerIds == null) {
      this.conversionTrackerIds = new ArrayList<>();
    }
    this.conversionTrackerIds.add(conversionTrackerIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : コンバージョントラッカーID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Conversion Tracking ID&lt;/div&gt;  title: GuaranteedCampaignServiceSelector 
   * @return conversionTrackerIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : コンバージョントラッカーID</div> <div lang=\"en\">Search condition: Conversion Tracking ID</div>  title: GuaranteedCampaignServiceSelector ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceSelector guaranteedCampaignServiceSelector = (GuaranteedCampaignServiceSelector) o;
    return Objects.equals(this.accountId, guaranteedCampaignServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, guaranteedCampaignServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabelIdFlg, guaranteedCampaignServiceSelector.containsLabelIdFlg) &&
        Objects.equals(this.labelIds, guaranteedCampaignServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, guaranteedCampaignServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, guaranteedCampaignServiceSelector.startIndex) &&
        Objects.equals(this.conversionGroupIds, guaranteedCampaignServiceSelector.conversionGroupIds) &&
        Objects.equals(this.conversionTrackerIds, guaranteedCampaignServiceSelector.conversionTrackerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, containsLabelIdFlg, labelIds, numberResults, startIndex, conversionGroupIds, conversionTrackerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabelIdFlg: ").append(toIndentedString(containsLabelIdFlg)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    conversionGroupIds: ").append(toIndentedString(conversionGroupIds)).append("\n");
    sb.append("    conversionTrackerIds: ").append(toIndentedString(conversionTrackerIds)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

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
import jp.co.yahoo.adsdisplayapi.v12.model.RecommendationServiceAdGroup;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroupオブジェクトは、特定の広告タイプと画像サイズを組み合わせた広告が3～5つ以外の広告グループに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup object describes detailed information of recommendations about the ad group that have other than 3-5 ads that combine a specific ad type and image size.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroupオブジェクトは、特定の広告タイプと画像サイズを組み合わせた広告が3～5つ以外の広告グループに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup object describes detailed information of recommendations about the ad group that have other than 3-5 ads that combine a specific ad type and image size.</div> ")
@JsonPropertyOrder({
  RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup.JSON_PROPERTY_RECOMMENDATION_ID,
  RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup.JSON_PROPERTY_CAMPAIGN_ID,
  RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup.JSON_PROPERTY_CAMPAIGN_NAME,
  RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup.JSON_PROPERTY_AD_GROUP_LIST
})
@JsonTypeName("RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup {
  public static final String JSON_PROPERTY_RECOMMENDATION_ID = "recommendationId";
  private Long recommendationId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_AD_GROUP_LIST = "adGroupList";
  private List<RecommendationServiceAdGroup> adGroupList = null;

  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup() { 
  }

  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup recommendationId(Long recommendationId) {
    
    this.recommendationId = recommendationId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 最適化提案IDです。&lt;br&gt; optimizationScoreLiftがnullでない場合は、1つのキャンペーンに関する提案に共通の最適化提案IDが割り当てられます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommendation ID.&lt;br&gt; When optimizationScoreLift isn&#39;t null, the system will assign a common recommendation ID to the suggestion for the campaign. &lt;/div&gt; 
   * @return recommendationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 最適化提案IDです。<br> optimizationScoreLiftがnullでない場合は、1つのキャンペーンに関する提案に共通の最適化提案IDが割り当てられます。 </div> <div lang=\"en\"> Recommendation ID.<br> When optimizationScoreLift isn't null, the system will assign a common recommendation ID to the suggestion for the campaign. </div> ")
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRecommendationId() {
    return recommendationId;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
  }


  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; &lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign name.&lt;br&gt; &lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign name.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup adGroupList(List<RecommendationServiceAdGroup> adGroupList) {
    
    this.adGroupList = adGroupList;
    return this;
  }

  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup addAdGroupListItem(RecommendationServiceAdGroup adGroupListItem) {
    if (this.adGroupList == null) {
      this.adGroupList = new ArrayList<>();
    }
    this.adGroupList.add(adGroupListItem);
    return this;
  }

   /**
   * Get adGroupList
   * @return adGroupList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceAdGroup> getAdGroupList() {
    return adGroupList;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupList(List<RecommendationServiceAdGroup> adGroupList) {
    this.adGroupList = adGroupList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup recommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup = (RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup) o;
    return Objects.equals(this.recommendationId, recommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup.recommendationId) &&
        Objects.equals(this.campaignId, recommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup.campaignId) &&
        Objects.equals(this.campaignName, recommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup.campaignName) &&
        Objects.equals(this.adGroupList, recommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup.adGroupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, adGroupList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup {\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adGroupList: ").append(toIndentedString(adGroupList)).append("\n");
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


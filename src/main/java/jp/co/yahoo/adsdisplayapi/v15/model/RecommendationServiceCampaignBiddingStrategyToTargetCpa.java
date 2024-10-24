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
import jp.co.yahoo.adsdisplayapi.v15.model.RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCampaignBiddingStrategyToTargetCpaオブジェクトは、自動入札（コンバージョン単価の目標値）に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCampaignBiddingStrategyToTargetCpa object describes recommendation information about the campaign that is suitable for using autobidding (target CPA).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceCampaignBiddingStrategyToTargetCpaオブジェクトは、自動入札（コンバージョン単価の目標値）に適しているキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceCampaignBiddingStrategyToTargetCpa object describes recommendation information about the campaign that is suitable for using autobidding (target CPA).</div> ")
@JsonPropertyOrder({
  RecommendationServiceCampaignBiddingStrategyToTargetCpa.JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceCampaignBiddingStrategyToTargetCpa")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceCampaignBiddingStrategyToTargetCpa {
  public static final String JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA_CAMPAIGN_LIST = "campaignBiddingStrategyToTargetCpaCampaignList";
  private List<RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign> campaignBiddingStrategyToTargetCpaCampaignList = null;

  public RecommendationServiceCampaignBiddingStrategyToTargetCpa() { 
  }

  public RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpaCampaignList(List<RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign> campaignBiddingStrategyToTargetCpaCampaignList) {
    
    this.campaignBiddingStrategyToTargetCpaCampaignList = campaignBiddingStrategyToTargetCpaCampaignList;
    return this;
  }

  public RecommendationServiceCampaignBiddingStrategyToTargetCpa addCampaignBiddingStrategyToTargetCpaCampaignListItem(RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign campaignBiddingStrategyToTargetCpaCampaignListItem) {
    if (this.campaignBiddingStrategyToTargetCpaCampaignList == null) {
      this.campaignBiddingStrategyToTargetCpaCampaignList = new ArrayList<>();
    }
    this.campaignBiddingStrategyToTargetCpaCampaignList.add(campaignBiddingStrategyToTargetCpaCampaignListItem);
    return this;
  }

   /**
   * Get campaignBiddingStrategyToTargetCpaCampaignList
   * @return campaignBiddingStrategyToTargetCpaCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign> getCampaignBiddingStrategyToTargetCpaCampaignList() {
    return campaignBiddingStrategyToTargetCpaCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBiddingStrategyToTargetCpaCampaignList(List<RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign> campaignBiddingStrategyToTargetCpaCampaignList) {
    this.campaignBiddingStrategyToTargetCpaCampaignList = campaignBiddingStrategyToTargetCpaCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceCampaignBiddingStrategyToTargetCpa recommendationServiceCampaignBiddingStrategyToTargetCpa = (RecommendationServiceCampaignBiddingStrategyToTargetCpa) o;
    return Objects.equals(this.campaignBiddingStrategyToTargetCpaCampaignList, recommendationServiceCampaignBiddingStrategyToTargetCpa.campaignBiddingStrategyToTargetCpaCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyToTargetCpaCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceCampaignBiddingStrategyToTargetCpa {\n");
    sb.append("    campaignBiddingStrategyToTargetCpaCampaignList: ").append(toIndentedString(campaignBiddingStrategyToTargetCpaCampaignList)).append("\n");
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


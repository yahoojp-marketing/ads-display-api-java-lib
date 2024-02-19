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
import jp.co.yahoo.adsdisplayapi.v13.model.RecommendationServiceImpsShareBudgetLossOverCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceImpsShareBudgetLossOverオブジェクトは、インプレッションシェア損失率（予算）が大きいキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceImpsShareBudgetLossOver object describes the Recommendations information of campaigns that have a large lost impression share (budget).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceImpsShareBudgetLossOverオブジェクトは、インプレッションシェア損失率（予算）が大きいキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceImpsShareBudgetLossOver object describes the Recommendations information of campaigns that have a large lost impression share (budget).</div> ")
@JsonPropertyOrder({
  RecommendationServiceImpsShareBudgetLossOver.JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceImpsShareBudgetLossOver")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceImpsShareBudgetLossOver {
  public static final String JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER_CAMPAIGN_LIST = "impsShareBudgetLossOverCampaignList";
  private List<RecommendationServiceImpsShareBudgetLossOverCampaign> impsShareBudgetLossOverCampaignList = null;

  public RecommendationServiceImpsShareBudgetLossOver() { 
  }

  public RecommendationServiceImpsShareBudgetLossOver impsShareBudgetLossOverCampaignList(List<RecommendationServiceImpsShareBudgetLossOverCampaign> impsShareBudgetLossOverCampaignList) {
    
    this.impsShareBudgetLossOverCampaignList = impsShareBudgetLossOverCampaignList;
    return this;
  }

  public RecommendationServiceImpsShareBudgetLossOver addImpsShareBudgetLossOverCampaignListItem(RecommendationServiceImpsShareBudgetLossOverCampaign impsShareBudgetLossOverCampaignListItem) {
    if (this.impsShareBudgetLossOverCampaignList == null) {
      this.impsShareBudgetLossOverCampaignList = new ArrayList<>();
    }
    this.impsShareBudgetLossOverCampaignList.add(impsShareBudgetLossOverCampaignListItem);
    return this;
  }

   /**
   * Get impsShareBudgetLossOverCampaignList
   * @return impsShareBudgetLossOverCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceImpsShareBudgetLossOverCampaign> getImpsShareBudgetLossOverCampaignList() {
    return impsShareBudgetLossOverCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpsShareBudgetLossOverCampaignList(List<RecommendationServiceImpsShareBudgetLossOverCampaign> impsShareBudgetLossOverCampaignList) {
    this.impsShareBudgetLossOverCampaignList = impsShareBudgetLossOverCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceImpsShareBudgetLossOver recommendationServiceImpsShareBudgetLossOver = (RecommendationServiceImpsShareBudgetLossOver) o;
    return Objects.equals(this.impsShareBudgetLossOverCampaignList, recommendationServiceImpsShareBudgetLossOver.impsShareBudgetLossOverCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impsShareBudgetLossOverCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceImpsShareBudgetLossOver {\n");
    sb.append("    impsShareBudgetLossOverCampaignList: ").append(toIndentedString(impsShareBudgetLossOverCampaignList)).append("\n");
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


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
import jp.co.yahoo.adsdisplayapi.v15.model.RecommendationServiceDailyBudgetOverCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceDailyBudgetOverオブジェクトは、1日の予算上限に達したキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceDailyBudgetOver object describes recommendation information about campaigns that reached the daily budget.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceDailyBudgetOverオブジェクトは、1日の予算上限に達したキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceDailyBudgetOver object describes recommendation information about campaigns that reached the daily budget.</div> ")
@JsonPropertyOrder({
  RecommendationServiceDailyBudgetOver.JSON_PROPERTY_DAILY_BUDGET_OVER_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceDailyBudgetOver")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceDailyBudgetOver {
  public static final String JSON_PROPERTY_DAILY_BUDGET_OVER_CAMPAIGN_LIST = "dailyBudgetOverCampaignList";
  private List<RecommendationServiceDailyBudgetOverCampaign> dailyBudgetOverCampaignList = null;

  public RecommendationServiceDailyBudgetOver() { 
  }

  public RecommendationServiceDailyBudgetOver dailyBudgetOverCampaignList(List<RecommendationServiceDailyBudgetOverCampaign> dailyBudgetOverCampaignList) {
    
    this.dailyBudgetOverCampaignList = dailyBudgetOverCampaignList;
    return this;
  }

  public RecommendationServiceDailyBudgetOver addDailyBudgetOverCampaignListItem(RecommendationServiceDailyBudgetOverCampaign dailyBudgetOverCampaignListItem) {
    if (this.dailyBudgetOverCampaignList == null) {
      this.dailyBudgetOverCampaignList = new ArrayList<>();
    }
    this.dailyBudgetOverCampaignList.add(dailyBudgetOverCampaignListItem);
    return this;
  }

   /**
   * Get dailyBudgetOverCampaignList
   * @return dailyBudgetOverCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAILY_BUDGET_OVER_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceDailyBudgetOverCampaign> getDailyBudgetOverCampaignList() {
    return dailyBudgetOverCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_BUDGET_OVER_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyBudgetOverCampaignList(List<RecommendationServiceDailyBudgetOverCampaign> dailyBudgetOverCampaignList) {
    this.dailyBudgetOverCampaignList = dailyBudgetOverCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceDailyBudgetOver recommendationServiceDailyBudgetOver = (RecommendationServiceDailyBudgetOver) o;
    return Objects.equals(this.dailyBudgetOverCampaignList, recommendationServiceDailyBudgetOver.dailyBudgetOverCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyBudgetOverCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceDailyBudgetOver {\n");
    sb.append("    dailyBudgetOverCampaignList: ").append(toIndentedString(dailyBudgetOverCampaignList)).append("\n");
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


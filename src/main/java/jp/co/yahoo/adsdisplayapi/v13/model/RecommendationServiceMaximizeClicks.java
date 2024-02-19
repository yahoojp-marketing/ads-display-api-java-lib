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
import jp.co.yahoo.adsdisplayapi.v13.model.RecommendationServiceMaximizeClicksCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMaximizeClicksオブジェクトは、自動入札（クリック数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMaximizeClicks object describes recommendation information about the campaign that is suitable for using autobidding (Maximize Clicks).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMaximizeClicksオブジェクトは、自動入札（クリック数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceMaximizeClicks object describes recommendation information about the campaign that is suitable for using autobidding (Maximize Clicks).</div> ")
@JsonPropertyOrder({
  RecommendationServiceMaximizeClicks.JSON_PROPERTY_MAXIMIZE_CLICKS_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceMaximizeClicks")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceMaximizeClicks {
  public static final String JSON_PROPERTY_MAXIMIZE_CLICKS_CAMPAIGN_LIST = "maximizeClicksCampaignList";
  private List<RecommendationServiceMaximizeClicksCampaign> maximizeClicksCampaignList = null;

  public RecommendationServiceMaximizeClicks() { 
  }

  public RecommendationServiceMaximizeClicks maximizeClicksCampaignList(List<RecommendationServiceMaximizeClicksCampaign> maximizeClicksCampaignList) {
    
    this.maximizeClicksCampaignList = maximizeClicksCampaignList;
    return this;
  }

  public RecommendationServiceMaximizeClicks addMaximizeClicksCampaignListItem(RecommendationServiceMaximizeClicksCampaign maximizeClicksCampaignListItem) {
    if (this.maximizeClicksCampaignList == null) {
      this.maximizeClicksCampaignList = new ArrayList<>();
    }
    this.maximizeClicksCampaignList.add(maximizeClicksCampaignListItem);
    return this;
  }

   /**
   * Get maximizeClicksCampaignList
   * @return maximizeClicksCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CLICKS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceMaximizeClicksCampaign> getMaximizeClicksCampaignList() {
    return maximizeClicksCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CLICKS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeClicksCampaignList(List<RecommendationServiceMaximizeClicksCampaign> maximizeClicksCampaignList) {
    this.maximizeClicksCampaignList = maximizeClicksCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMaximizeClicks recommendationServiceMaximizeClicks = (RecommendationServiceMaximizeClicks) o;
    return Objects.equals(this.maximizeClicksCampaignList, recommendationServiceMaximizeClicks.maximizeClicksCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximizeClicksCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMaximizeClicks {\n");
    sb.append("    maximizeClicksCampaignList: ").append(toIndentedString(maximizeClicksCampaignList)).append("\n");
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


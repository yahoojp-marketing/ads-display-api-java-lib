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
import jp.co.yahoo.adsdisplayapi.v11.model.RecommendationServiceMaximizeVideoViewsCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMaximizeVideoViewsオブジェクトは、自動入札（動画再生数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMaximizeVideoViews objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize video views).&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceMaximizeVideoViews.JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS_CAMPAIGN_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceMaximizeVideoViews {
  public static final String JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS_CAMPAIGN_LIST = "maximizeVideoViewsCampaignList";
  private List<RecommendationServiceMaximizeVideoViewsCampaign> maximizeVideoViewsCampaignList;

  public RecommendationServiceMaximizeVideoViews() {
  }

  public RecommendationServiceMaximizeVideoViews maximizeVideoViewsCampaignList(List<RecommendationServiceMaximizeVideoViewsCampaign> maximizeVideoViewsCampaignList) {
    
    this.maximizeVideoViewsCampaignList = maximizeVideoViewsCampaignList;
    return this;
  }

  public RecommendationServiceMaximizeVideoViews addMaximizeVideoViewsCampaignListItem(RecommendationServiceMaximizeVideoViewsCampaign maximizeVideoViewsCampaignListItem) {
    if (this.maximizeVideoViewsCampaignList == null) {
      this.maximizeVideoViewsCampaignList = new ArrayList<>();
    }
    this.maximizeVideoViewsCampaignList.add(maximizeVideoViewsCampaignListItem);
    return this;
  }

   /**
   * Get maximizeVideoViewsCampaignList
   * @return maximizeVideoViewsCampaignList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceMaximizeVideoViewsCampaign> getMaximizeVideoViewsCampaignList() {
    return maximizeVideoViewsCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeVideoViewsCampaignList(List<RecommendationServiceMaximizeVideoViewsCampaign> maximizeVideoViewsCampaignList) {
    this.maximizeVideoViewsCampaignList = maximizeVideoViewsCampaignList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMaximizeVideoViews recommendationServiceMaximizeVideoViews = (RecommendationServiceMaximizeVideoViews) o;
    return Objects.equals(this.maximizeVideoViewsCampaignList, recommendationServiceMaximizeVideoViews.maximizeVideoViewsCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximizeVideoViewsCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMaximizeVideoViews {\n");
    sb.append("    maximizeVideoViewsCampaignList: ").append(toIndentedString(maximizeVideoViewsCampaignList)).append("\n");
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


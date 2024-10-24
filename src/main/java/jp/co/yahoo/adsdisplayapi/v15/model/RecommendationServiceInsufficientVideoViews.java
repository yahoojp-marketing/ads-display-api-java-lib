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
import jp.co.yahoo.adsdisplayapi.v15.model.RecommendationServiceInsufficientVideoViewsCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceInsufficientVideoViewsオブジェクトは、動画再生数が少ないキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceInsufficientVideoViews object describes recommendation information about the campaign that need to increase video views&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceInsufficientVideoViewsオブジェクトは、動画再生数が少ないキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceInsufficientVideoViews object describes recommendation information about the campaign that need to increase video views</div> ")
@JsonPropertyOrder({
  RecommendationServiceInsufficientVideoViews.JSON_PROPERTY_INSUFFICIENT_VIDEO_VIEWS_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceInsufficientVideoViews")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceInsufficientVideoViews {
  public static final String JSON_PROPERTY_INSUFFICIENT_VIDEO_VIEWS_CAMPAIGN_LIST = "insufficientVideoViewsCampaignList";
  private List<RecommendationServiceInsufficientVideoViewsCampaign> insufficientVideoViewsCampaignList = null;

  public RecommendationServiceInsufficientVideoViews() { 
  }

  public RecommendationServiceInsufficientVideoViews insufficientVideoViewsCampaignList(List<RecommendationServiceInsufficientVideoViewsCampaign> insufficientVideoViewsCampaignList) {
    
    this.insufficientVideoViewsCampaignList = insufficientVideoViewsCampaignList;
    return this;
  }

  public RecommendationServiceInsufficientVideoViews addInsufficientVideoViewsCampaignListItem(RecommendationServiceInsufficientVideoViewsCampaign insufficientVideoViewsCampaignListItem) {
    if (this.insufficientVideoViewsCampaignList == null) {
      this.insufficientVideoViewsCampaignList = new ArrayList<>();
    }
    this.insufficientVideoViewsCampaignList.add(insufficientVideoViewsCampaignListItem);
    return this;
  }

   /**
   * Get insufficientVideoViewsCampaignList
   * @return insufficientVideoViewsCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_VIDEO_VIEWS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceInsufficientVideoViewsCampaign> getInsufficientVideoViewsCampaignList() {
    return insufficientVideoViewsCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_VIDEO_VIEWS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientVideoViewsCampaignList(List<RecommendationServiceInsufficientVideoViewsCampaign> insufficientVideoViewsCampaignList) {
    this.insufficientVideoViewsCampaignList = insufficientVideoViewsCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceInsufficientVideoViews recommendationServiceInsufficientVideoViews = (RecommendationServiceInsufficientVideoViews) o;
    return Objects.equals(this.insufficientVideoViewsCampaignList, recommendationServiceInsufficientVideoViews.insufficientVideoViewsCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insufficientVideoViewsCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceInsufficientVideoViews {\n");
    sb.append("    insufficientVideoViewsCampaignList: ").append(toIndentedString(insufficientVideoViewsCampaignList)).append("\n");
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


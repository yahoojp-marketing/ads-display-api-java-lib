/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

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
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceMaximizeConversionsCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMaximizeConversionsオブジェクトは、自動入札（コンバージョン数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMaximizeConversions objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize Conversions).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMaximizeConversionsオブジェクトは、自動入札（コンバージョン数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceMaximizeConversions objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize Conversions).</div> ")
@JsonPropertyOrder({
  RecommendationServiceMaximizeConversions.JSON_PROPERTY_MAXIMIZE_CONVERSIONS_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceMaximizeConversions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceMaximizeConversions {
  public static final String JSON_PROPERTY_MAXIMIZE_CONVERSIONS_CAMPAIGN_LIST = "maximizeConversionsCampaignList";
  private List<RecommendationServiceMaximizeConversionsCampaign> maximizeConversionsCampaignList = null;

  public RecommendationServiceMaximizeConversions() { 
  }

  public RecommendationServiceMaximizeConversions maximizeConversionsCampaignList(List<RecommendationServiceMaximizeConversionsCampaign> maximizeConversionsCampaignList) {
    
    this.maximizeConversionsCampaignList = maximizeConversionsCampaignList;
    return this;
  }

  public RecommendationServiceMaximizeConversions addMaximizeConversionsCampaignListItem(RecommendationServiceMaximizeConversionsCampaign maximizeConversionsCampaignListItem) {
    if (this.maximizeConversionsCampaignList == null) {
      this.maximizeConversionsCampaignList = new ArrayList<>();
    }
    this.maximizeConversionsCampaignList.add(maximizeConversionsCampaignListItem);
    return this;
  }

   /**
   * Get maximizeConversionsCampaignList
   * @return maximizeConversionsCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceMaximizeConversionsCampaign> getMaximizeConversionsCampaignList() {
    return maximizeConversionsCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeConversionsCampaignList(List<RecommendationServiceMaximizeConversionsCampaign> maximizeConversionsCampaignList) {
    this.maximizeConversionsCampaignList = maximizeConversionsCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMaximizeConversions recommendationServiceMaximizeConversions = (RecommendationServiceMaximizeConversions) o;
    return Objects.equals(this.maximizeConversionsCampaignList, recommendationServiceMaximizeConversions.maximizeConversionsCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximizeConversionsCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMaximizeConversions {\n");
    sb.append("    maximizeConversionsCampaignList: ").append(toIndentedString(maximizeConversionsCampaignList)).append("\n");
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


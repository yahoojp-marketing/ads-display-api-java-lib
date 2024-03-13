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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v13.model.RecommendationServiceEnhancedCpcCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceEnhancedCpcオブジェクトは、拡張クリック単価に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceEnhancedCpc object describes recommendation information about the campaign that is suitable for using enhanced CPC.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceEnhancedCpc.JSON_PROPERTY_ENHANCED_CPC_CAMPAIGN_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceEnhancedCpc {
  public static final String JSON_PROPERTY_ENHANCED_CPC_CAMPAIGN_LIST = "enhancedCpcCampaignList";
  private List<RecommendationServiceEnhancedCpcCampaign> enhancedCpcCampaignList;

  public RecommendationServiceEnhancedCpc() {
  }

  public RecommendationServiceEnhancedCpc enhancedCpcCampaignList(List<RecommendationServiceEnhancedCpcCampaign> enhancedCpcCampaignList) {
    
    this.enhancedCpcCampaignList = enhancedCpcCampaignList;
    return this;
  }

  public RecommendationServiceEnhancedCpc addEnhancedCpcCampaignListItem(RecommendationServiceEnhancedCpcCampaign enhancedCpcCampaignListItem) {
    if (this.enhancedCpcCampaignList == null) {
      this.enhancedCpcCampaignList = new ArrayList<>();
    }
    this.enhancedCpcCampaignList.add(enhancedCpcCampaignListItem);
    return this;
  }

   /**
   * Get enhancedCpcCampaignList
   * @return enhancedCpcCampaignList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENHANCED_CPC_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceEnhancedCpcCampaign> getEnhancedCpcCampaignList() {
    return enhancedCpcCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_CPC_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedCpcCampaignList(List<RecommendationServiceEnhancedCpcCampaign> enhancedCpcCampaignList) {
    this.enhancedCpcCampaignList = enhancedCpcCampaignList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceEnhancedCpc recommendationServiceEnhancedCpc = (RecommendationServiceEnhancedCpc) o;
    return Objects.equals(this.enhancedCpcCampaignList, recommendationServiceEnhancedCpc.enhancedCpcCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedCpcCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceEnhancedCpc {\n");
    sb.append("    enhancedCpcCampaignList: ").append(toIndentedString(enhancedCpcCampaignList)).append("\n");
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

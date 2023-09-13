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
import jp.co.yahoo.adsdisplayapi.v12.model.RecommendationServiceInsufficientConversionsCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceInsufficientConversionsオブジェクトは、コンバージョン数が少ないキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceInsufficientConversions object describes recommendation information about the campaign that need to increase conversions.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceInsufficientConversionsオブジェクトは、コンバージョン数が少ないキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceInsufficientConversions object describes recommendation information about the campaign that need to increase conversions.</div> ")
@JsonPropertyOrder({
  RecommendationServiceInsufficientConversions.JSON_PROPERTY_INSUFFICIENT_CONVERSIONS_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceInsufficientConversions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceInsufficientConversions {
  public static final String JSON_PROPERTY_INSUFFICIENT_CONVERSIONS_CAMPAIGN_LIST = "insufficientConversionsCampaignList";
  private List<RecommendationServiceInsufficientConversionsCampaign> insufficientConversionsCampaignList = null;

  public RecommendationServiceInsufficientConversions() { 
  }

  public RecommendationServiceInsufficientConversions insufficientConversionsCampaignList(List<RecommendationServiceInsufficientConversionsCampaign> insufficientConversionsCampaignList) {
    
    this.insufficientConversionsCampaignList = insufficientConversionsCampaignList;
    return this;
  }

  public RecommendationServiceInsufficientConversions addInsufficientConversionsCampaignListItem(RecommendationServiceInsufficientConversionsCampaign insufficientConversionsCampaignListItem) {
    if (this.insufficientConversionsCampaignList == null) {
      this.insufficientConversionsCampaignList = new ArrayList<>();
    }
    this.insufficientConversionsCampaignList.add(insufficientConversionsCampaignListItem);
    return this;
  }

   /**
   * Get insufficientConversionsCampaignList
   * @return insufficientConversionsCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_CONVERSIONS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceInsufficientConversionsCampaign> getInsufficientConversionsCampaignList() {
    return insufficientConversionsCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_CONVERSIONS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientConversionsCampaignList(List<RecommendationServiceInsufficientConversionsCampaign> insufficientConversionsCampaignList) {
    this.insufficientConversionsCampaignList = insufficientConversionsCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceInsufficientConversions recommendationServiceInsufficientConversions = (RecommendationServiceInsufficientConversions) o;
    return Objects.equals(this.insufficientConversionsCampaignList, recommendationServiceInsufficientConversions.insufficientConversionsCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insufficientConversionsCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceInsufficientConversions {\n");
    sb.append("    insufficientConversionsCampaignList: ").append(toIndentedString(insufficientConversionsCampaignList)).append("\n");
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


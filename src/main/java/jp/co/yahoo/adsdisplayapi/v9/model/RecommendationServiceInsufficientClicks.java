/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

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
import jp.co.yahoo.adsdisplayapi.v9.model.RecommendationServiceInsufficientClicksCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceInsufficientClicksオブジェクトは、クリック数が少ないキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceInsufficientClicks objects describes recommendation information about the campaign that need to increase clicks.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceInsufficientClicksオブジェクトは、クリック数が少ないキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceInsufficientClicks objects describes recommendation information about the campaign that need to increase clicks.</div> ")
@JsonPropertyOrder({
  RecommendationServiceInsufficientClicks.JSON_PROPERTY_INSUFFICIENT_CLICKS_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceInsufficientClicks")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceInsufficientClicks {
  public static final String JSON_PROPERTY_INSUFFICIENT_CLICKS_CAMPAIGN_LIST = "insufficientClicksCampaignList";
  private List<RecommendationServiceInsufficientClicksCampaign> insufficientClicksCampaignList = null;

  public RecommendationServiceInsufficientClicks() { 
  }

  public RecommendationServiceInsufficientClicks insufficientClicksCampaignList(List<RecommendationServiceInsufficientClicksCampaign> insufficientClicksCampaignList) {
    
    this.insufficientClicksCampaignList = insufficientClicksCampaignList;
    return this;
  }

  public RecommendationServiceInsufficientClicks addInsufficientClicksCampaignListItem(RecommendationServiceInsufficientClicksCampaign insufficientClicksCampaignListItem) {
    if (this.insufficientClicksCampaignList == null) {
      this.insufficientClicksCampaignList = new ArrayList<>();
    }
    this.insufficientClicksCampaignList.add(insufficientClicksCampaignListItem);
    return this;
  }

   /**
   * Get insufficientClicksCampaignList
   * @return insufficientClicksCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_CLICKS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceInsufficientClicksCampaign> getInsufficientClicksCampaignList() {
    return insufficientClicksCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_CLICKS_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientClicksCampaignList(List<RecommendationServiceInsufficientClicksCampaign> insufficientClicksCampaignList) {
    this.insufficientClicksCampaignList = insufficientClicksCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceInsufficientClicks recommendationServiceInsufficientClicks = (RecommendationServiceInsufficientClicks) o;
    return Objects.equals(this.insufficientClicksCampaignList, recommendationServiceInsufficientClicks.insufficientClicksCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insufficientClicksCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceInsufficientClicks {\n");
    sb.append("    insufficientClicksCampaignList: ").append(toIndentedString(insufficientClicksCampaignList)).append("\n");
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


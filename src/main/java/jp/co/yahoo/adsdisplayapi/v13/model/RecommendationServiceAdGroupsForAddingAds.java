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
import jp.co.yahoo.adsdisplayapi.v13.model.RecommendationServiceAdGroupsForAddingAdsList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceAdGroupForAddingAdsオブジェクトは、入稿を推奨する画像サイズがある広告グループに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceAdGroupForAddingAds object describes recommendation information about the ad group with recommended image sizes.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceAdGroupForAddingAdsオブジェクトは、入稿を推奨する画像サイズがある広告グループに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceAdGroupForAddingAds object describes recommendation information about the ad group with recommended image sizes.</div> ")
@JsonPropertyOrder({
  RecommendationServiceAdGroupsForAddingAds.JSON_PROPERTY_AD_GROUPS_FOR_ADDING_ADS_LIST
})
@JsonTypeName("RecommendationServiceAdGroupsForAddingAds")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceAdGroupsForAddingAds {
  public static final String JSON_PROPERTY_AD_GROUPS_FOR_ADDING_ADS_LIST = "adGroupsForAddingAdsList";
  private List<RecommendationServiceAdGroupsForAddingAdsList> adGroupsForAddingAdsList = null;

  public RecommendationServiceAdGroupsForAddingAds() { 
  }

  public RecommendationServiceAdGroupsForAddingAds adGroupsForAddingAdsList(List<RecommendationServiceAdGroupsForAddingAdsList> adGroupsForAddingAdsList) {
    
    this.adGroupsForAddingAdsList = adGroupsForAddingAdsList;
    return this;
  }

  public RecommendationServiceAdGroupsForAddingAds addAdGroupsForAddingAdsListItem(RecommendationServiceAdGroupsForAddingAdsList adGroupsForAddingAdsListItem) {
    if (this.adGroupsForAddingAdsList == null) {
      this.adGroupsForAddingAdsList = new ArrayList<>();
    }
    this.adGroupsForAddingAdsList.add(adGroupsForAddingAdsListItem);
    return this;
  }

   /**
   * Get adGroupsForAddingAdsList
   * @return adGroupsForAddingAdsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_GROUPS_FOR_ADDING_ADS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceAdGroupsForAddingAdsList> getAdGroupsForAddingAdsList() {
    return adGroupsForAddingAdsList;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUPS_FOR_ADDING_ADS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupsForAddingAdsList(List<RecommendationServiceAdGroupsForAddingAdsList> adGroupsForAddingAdsList) {
    this.adGroupsForAddingAdsList = adGroupsForAddingAdsList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceAdGroupsForAddingAds recommendationServiceAdGroupsForAddingAds = (RecommendationServiceAdGroupsForAddingAds) o;
    return Objects.equals(this.adGroupsForAddingAdsList, recommendationServiceAdGroupsForAddingAds.adGroupsForAddingAdsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupsForAddingAdsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceAdGroupsForAddingAds {\n");
    sb.append("    adGroupsForAddingAdsList: ").append(toIndentedString(adGroupsForAddingAdsList)).append("\n");
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


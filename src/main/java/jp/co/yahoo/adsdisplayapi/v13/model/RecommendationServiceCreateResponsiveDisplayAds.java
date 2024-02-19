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
import jp.co.yahoo.adsdisplayapi.v13.model.RecommendationServiceCreateResponsiveDisplayAdsList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCreateResponsiveDisplayAdsオブジェクトは、レスポンシブディスプレイ広告に関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCreateResponsiveDisplayAds object describes information about a recommendation for Responsive Ads for Display.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceCreateResponsiveDisplayAds.JSON_PROPERTY_CREATE_RESPONSIVE_DISPLAY_ADS_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceCreateResponsiveDisplayAds {
  public static final String JSON_PROPERTY_CREATE_RESPONSIVE_DISPLAY_ADS_LIST = "createResponsiveDisplayAdsList";
  private List<RecommendationServiceCreateResponsiveDisplayAdsList> createResponsiveDisplayAdsList;

  public RecommendationServiceCreateResponsiveDisplayAds() {
  }

  public RecommendationServiceCreateResponsiveDisplayAds createResponsiveDisplayAdsList(List<RecommendationServiceCreateResponsiveDisplayAdsList> createResponsiveDisplayAdsList) {
    
    this.createResponsiveDisplayAdsList = createResponsiveDisplayAdsList;
    return this;
  }

  public RecommendationServiceCreateResponsiveDisplayAds addCreateResponsiveDisplayAdsListItem(RecommendationServiceCreateResponsiveDisplayAdsList createResponsiveDisplayAdsListItem) {
    if (this.createResponsiveDisplayAdsList == null) {
      this.createResponsiveDisplayAdsList = new ArrayList<>();
    }
    this.createResponsiveDisplayAdsList.add(createResponsiveDisplayAdsListItem);
    return this;
  }

   /**
   * Get createResponsiveDisplayAdsList
   * @return createResponsiveDisplayAdsList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_RESPONSIVE_DISPLAY_ADS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceCreateResponsiveDisplayAdsList> getCreateResponsiveDisplayAdsList() {
    return createResponsiveDisplayAdsList;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_RESPONSIVE_DISPLAY_ADS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateResponsiveDisplayAdsList(List<RecommendationServiceCreateResponsiveDisplayAdsList> createResponsiveDisplayAdsList) {
    this.createResponsiveDisplayAdsList = createResponsiveDisplayAdsList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceCreateResponsiveDisplayAds recommendationServiceCreateResponsiveDisplayAds = (RecommendationServiceCreateResponsiveDisplayAds) o;
    return Objects.equals(this.createResponsiveDisplayAdsList, recommendationServiceCreateResponsiveDisplayAds.createResponsiveDisplayAdsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createResponsiveDisplayAdsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceCreateResponsiveDisplayAds {\n");
    sb.append("    createResponsiveDisplayAdsList: ").append(toIndentedString(createResponsiveDisplayAdsList)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v17.model.RecommendationServiceUpdateAdCreativeList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceUpdateAdCreativeオブジェクトは、画像・動画の更新を推奨する広告に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The RecommendationServiceUpdateAdCreative object contains ads that have recommendations for updating images or videos.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceUpdateAdCreative.JSON_PROPERTY_UPDATE_AD_CREATIVE_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceUpdateAdCreative {
  public static final String JSON_PROPERTY_UPDATE_AD_CREATIVE_LIST = "updateAdCreativeList";
  private List<RecommendationServiceUpdateAdCreativeList> updateAdCreativeList;

  public RecommendationServiceUpdateAdCreative() {
  }

  public RecommendationServiceUpdateAdCreative updateAdCreativeList(List<RecommendationServiceUpdateAdCreativeList> updateAdCreativeList) {
    
    this.updateAdCreativeList = updateAdCreativeList;
    return this;
  }

  public RecommendationServiceUpdateAdCreative addUpdateAdCreativeListItem(RecommendationServiceUpdateAdCreativeList updateAdCreativeListItem) {
    if (this.updateAdCreativeList == null) {
      this.updateAdCreativeList = new ArrayList<>();
    }
    this.updateAdCreativeList.add(updateAdCreativeListItem);
    return this;
  }

   /**
   * Get updateAdCreativeList
   * @return updateAdCreativeList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_AD_CREATIVE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceUpdateAdCreativeList> getUpdateAdCreativeList() {
    return updateAdCreativeList;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_AD_CREATIVE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateAdCreativeList(List<RecommendationServiceUpdateAdCreativeList> updateAdCreativeList) {
    this.updateAdCreativeList = updateAdCreativeList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceUpdateAdCreative recommendationServiceUpdateAdCreative = (RecommendationServiceUpdateAdCreative) o;
    return Objects.equals(this.updateAdCreativeList, recommendationServiceUpdateAdCreative.updateAdCreativeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateAdCreativeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceUpdateAdCreative {\n");
    sb.append("    updateAdCreativeList: ").append(toIndentedString(updateAdCreativeList)).append("\n");
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


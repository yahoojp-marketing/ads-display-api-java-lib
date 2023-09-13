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
import jp.co.yahoo.adsdisplayapi.v12.model.RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeオブジェクトは、特定の広告タイプと画像サイズを組み合わせた広告が3～5つ以外の広告グループに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize object describes recommendation information about the ad group that have other than 3-5 ads that combine a specific ad type and image size.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeオブジェクトは、特定の広告タイプと画像サイズを組み合わせた広告が3～5つ以外の広告グループに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize object describes recommendation information about the ad group that have other than 3-5 ads that combine a specific ad type and image size.</div> ")
@JsonPropertyOrder({
  RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize.JSON_PROPERTY_NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE_AD_GROUP_LIST
})
@JsonTypeName("RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize {
  public static final String JSON_PROPERTY_NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE_AD_GROUP_LIST = "notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList";
  private List<RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup> notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList = null;

  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize() { 
  }

  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList(List<RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup> notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList) {
    
    this.notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList = notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList;
    return this;
  }

  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize addNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroupListItem(RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupListItem) {
    if (this.notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList == null) {
      this.notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList = new ArrayList<>();
    }
    this.notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList.add(notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupListItem);
    return this;
  }

   /**
   * Get notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList
   * @return notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE_AD_GROUP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup> getNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList() {
    return notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList;
  }


  @JsonProperty(JSON_PROPERTY_NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE_AD_GROUP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList(List<RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSizeAdGroup> notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList) {
    this.notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList = notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize recommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize = (RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize) o;
    return Objects.equals(this.notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList, recommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize.notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize {\n");
    sb.append("    notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList: ").append(toIndentedString(notOptimalAdCountCombinedAdTypeAndImageSizeAdGroupList)).append("\n");
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


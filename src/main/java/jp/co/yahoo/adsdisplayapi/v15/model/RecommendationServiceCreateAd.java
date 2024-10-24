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
import jp.co.yahoo.adsdisplayapi.v15.model.RecommendationServiceCreateAdList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCreateAdオブジェクトは、広告の作成に関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCreateAd object describes information about a recommendation for creating ads.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceCreateAdオブジェクトは、広告の作成に関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceCreateAd object describes information about a recommendation for creating ads.</div> ")
@JsonPropertyOrder({
  RecommendationServiceCreateAd.JSON_PROPERTY_CREATE_AD_LIST
})
@JsonTypeName("RecommendationServiceCreateAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceCreateAd {
  public static final String JSON_PROPERTY_CREATE_AD_LIST = "createAdList";
  private List<RecommendationServiceCreateAdList> createAdList = null;

  public RecommendationServiceCreateAd() { 
  }

  public RecommendationServiceCreateAd createAdList(List<RecommendationServiceCreateAdList> createAdList) {
    
    this.createAdList = createAdList;
    return this;
  }

  public RecommendationServiceCreateAd addCreateAdListItem(RecommendationServiceCreateAdList createAdListItem) {
    if (this.createAdList == null) {
      this.createAdList = new ArrayList<>();
    }
    this.createAdList.add(createAdListItem);
    return this;
  }

   /**
   * Get createAdList
   * @return createAdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_AD_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceCreateAdList> getCreateAdList() {
    return createAdList;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_AD_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateAdList(List<RecommendationServiceCreateAdList> createAdList) {
    this.createAdList = createAdList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceCreateAd recommendationServiceCreateAd = (RecommendationServiceCreateAd) o;
    return Objects.equals(this.createAdList, recommendationServiceCreateAd.createAdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createAdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceCreateAd {\n");
    sb.append("    createAdList: ").append(toIndentedString(createAdList)).append("\n");
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


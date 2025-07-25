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
import jp.co.yahoo.adsdisplayapi.v17.model.RecommendationServiceCreateAdGroupList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCreateAdGroupオブジェクトは、広告グループの作成に関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCreateAdGroup object describes information about a recommendation for creating ad groups.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceCreateAdGroup.JSON_PROPERTY_CREATE_AD_GROUP_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceCreateAdGroup {
  public static final String JSON_PROPERTY_CREATE_AD_GROUP_LIST = "createAdGroupList";
  private List<RecommendationServiceCreateAdGroupList> createAdGroupList;

  public RecommendationServiceCreateAdGroup() {
  }

  public RecommendationServiceCreateAdGroup createAdGroupList(List<RecommendationServiceCreateAdGroupList> createAdGroupList) {
    
    this.createAdGroupList = createAdGroupList;
    return this;
  }

  public RecommendationServiceCreateAdGroup addCreateAdGroupListItem(RecommendationServiceCreateAdGroupList createAdGroupListItem) {
    if (this.createAdGroupList == null) {
      this.createAdGroupList = new ArrayList<>();
    }
    this.createAdGroupList.add(createAdGroupListItem);
    return this;
  }

   /**
   * Get createAdGroupList
   * @return createAdGroupList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_AD_GROUP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceCreateAdGroupList> getCreateAdGroupList() {
    return createAdGroupList;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_AD_GROUP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateAdGroupList(List<RecommendationServiceCreateAdGroupList> createAdGroupList) {
    this.createAdGroupList = createAdGroupList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceCreateAdGroup recommendationServiceCreateAdGroup = (RecommendationServiceCreateAdGroup) o;
    return Objects.equals(this.createAdGroupList, recommendationServiceCreateAdGroup.createAdGroupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createAdGroupList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceCreateAdGroup {\n");
    sb.append("    createAdGroupList: ").append(toIndentedString(createAdGroupList)).append("\n");
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


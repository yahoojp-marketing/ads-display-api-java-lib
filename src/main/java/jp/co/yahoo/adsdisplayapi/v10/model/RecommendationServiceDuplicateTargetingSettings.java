/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

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
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceDuplicateTargetingSettingsAdGroup;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceDuplicateTargetingSettingsオブジェクトは、ターゲティング設定が重複している広告グループに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceDuplicateTargetingSettings objects describes recommendation information about the ad group with duplicate targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceDuplicateTargetingSettingsオブジェクトは、ターゲティング設定が重複している広告グループに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceDuplicateTargetingSettings objects describes recommendation information about the ad group with duplicate targeting settings.</div> ")
@JsonPropertyOrder({
  RecommendationServiceDuplicateTargetingSettings.JSON_PROPERTY_DUPLICATE_TARGETING_SETTINGS_AD_GROUP_LIST
})
@JsonTypeName("RecommendationServiceDuplicateTargetingSettings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceDuplicateTargetingSettings {
  public static final String JSON_PROPERTY_DUPLICATE_TARGETING_SETTINGS_AD_GROUP_LIST = "duplicateTargetingSettingsAdGroupList";
  private List<RecommendationServiceDuplicateTargetingSettingsAdGroup> duplicateTargetingSettingsAdGroupList = null;

  public RecommendationServiceDuplicateTargetingSettings() { 
  }

  public RecommendationServiceDuplicateTargetingSettings duplicateTargetingSettingsAdGroupList(List<RecommendationServiceDuplicateTargetingSettingsAdGroup> duplicateTargetingSettingsAdGroupList) {
    
    this.duplicateTargetingSettingsAdGroupList = duplicateTargetingSettingsAdGroupList;
    return this;
  }

  public RecommendationServiceDuplicateTargetingSettings addDuplicateTargetingSettingsAdGroupListItem(RecommendationServiceDuplicateTargetingSettingsAdGroup duplicateTargetingSettingsAdGroupListItem) {
    if (this.duplicateTargetingSettingsAdGroupList == null) {
      this.duplicateTargetingSettingsAdGroupList = new ArrayList<>();
    }
    this.duplicateTargetingSettingsAdGroupList.add(duplicateTargetingSettingsAdGroupListItem);
    return this;
  }

   /**
   * Get duplicateTargetingSettingsAdGroupList
   * @return duplicateTargetingSettingsAdGroupList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DUPLICATE_TARGETING_SETTINGS_AD_GROUP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceDuplicateTargetingSettingsAdGroup> getDuplicateTargetingSettingsAdGroupList() {
    return duplicateTargetingSettingsAdGroupList;
  }


  @JsonProperty(JSON_PROPERTY_DUPLICATE_TARGETING_SETTINGS_AD_GROUP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuplicateTargetingSettingsAdGroupList(List<RecommendationServiceDuplicateTargetingSettingsAdGroup> duplicateTargetingSettingsAdGroupList) {
    this.duplicateTargetingSettingsAdGroupList = duplicateTargetingSettingsAdGroupList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceDuplicateTargetingSettings recommendationServiceDuplicateTargetingSettings = (RecommendationServiceDuplicateTargetingSettings) o;
    return Objects.equals(this.duplicateTargetingSettingsAdGroupList, recommendationServiceDuplicateTargetingSettings.duplicateTargetingSettingsAdGroupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duplicateTargetingSettingsAdGroupList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceDuplicateTargetingSettings {\n");
    sb.append("    duplicateTargetingSettingsAdGroupList: ").append(toIndentedString(duplicateTargetingSettingsAdGroupList)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServicePlacementUrlListType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServicePlacementTargetオブジェクトは、プレイスメントターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServicePlacementTarget object holds configuration information of placement targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServicePlacementTargetオブジェクトは、プレイスメントターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServicePlacementTarget object holds configuration information of placement targeting.</div> ")
@JsonPropertyOrder({
  StatsServicePlacementTarget.JSON_PROPERTY_PLACEMENT_URL_LIST_NAME,
  StatsServicePlacementTarget.JSON_PROPERTY_PLACEMENT_URL_LIST_TYPE
})
@JsonTypeName("StatsServicePlacementTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServicePlacementTarget {
  public static final String JSON_PROPERTY_PLACEMENT_URL_LIST_NAME = "placementUrlListName";
  private String placementUrlListName;

  public static final String JSON_PROPERTY_PLACEMENT_URL_LIST_TYPE = "placementUrlListType";
  private StatsServicePlacementUrlListType placementUrlListType;

  public StatsServicePlacementTarget() { 
  }

  public StatsServicePlacementTarget placementUrlListName(String placementUrlListName) {
    
    this.placementUrlListName = placementUrlListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;プレイスメントURLリスト名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Placement Url List Name&lt;/div&gt; 
   * @return placementUrlListName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">プレイスメントURLリスト名</div> <div lang=\"en\">Placement Url List Name</div> ")
  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlacementUrlListName() {
    return placementUrlListName;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementUrlListName(String placementUrlListName) {
    this.placementUrlListName = placementUrlListName;
  }


  public StatsServicePlacementTarget placementUrlListType(StatsServicePlacementUrlListType placementUrlListType) {
    
    this.placementUrlListType = placementUrlListType;
    return this;
  }

   /**
   * Get placementUrlListType
   * @return placementUrlListType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServicePlacementUrlListType getPlacementUrlListType() {
    return placementUrlListType;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementUrlListType(StatsServicePlacementUrlListType placementUrlListType) {
    this.placementUrlListType = placementUrlListType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServicePlacementTarget statsServicePlacementTarget = (StatsServicePlacementTarget) o;
    return Objects.equals(this.placementUrlListName, statsServicePlacementTarget.placementUrlListName) &&
        Objects.equals(this.placementUrlListType, statsServicePlacementTarget.placementUrlListType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementUrlListName, placementUrlListType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServicePlacementTarget {\n");
    sb.append("    placementUrlListName: ").append(toIndentedString(placementUrlListName)).append("\n");
    sb.append("    placementUrlListType: ").append(toIndentedString(placementUrlListType)).append("\n");
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


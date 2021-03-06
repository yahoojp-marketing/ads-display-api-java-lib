/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupTargetServicePlacementUrlListType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServicePlacementTargetオブジェクトは、プレイスメントターゲティングの設定情報を保持するオブジェクトです。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPLACEMENT_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServicePlacementTarget object is a container for storing placement targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is PLACEMENT_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServicePlacementTargetオブジェクトは、プレイスメントターゲティングの設定情報を保持するオブジェクトです。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがPLACEMENT_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServicePlacementTarget object is a container for storing placement targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is PLACEMENT_TARGET, this field is required. </div> ")
@JsonPropertyOrder({
  AdGroupTargetServicePlacementTarget.JSON_PROPERTY_PLACEMENT_URL_LIST_NAME,
  AdGroupTargetServicePlacementTarget.JSON_PROPERTY_PLACEMENT_URL_LIST_TYPE
})
@JsonTypeName("AdGroupTargetServicePlacementTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServicePlacementTarget {
  public static final String JSON_PROPERTY_PLACEMENT_URL_LIST_NAME = "placementUrlListName";
  private String placementUrlListName;

  public static final String JSON_PROPERTY_PLACEMENT_URL_LIST_TYPE = "placementUrlListType";
  private AdGroupTargetServicePlacementUrlListType placementUrlListType;

  public AdGroupTargetServicePlacementTarget() { 
  }

  public AdGroupTargetServicePlacementTarget placementUrlListName(String placementUrlListName) {
    
    this.placementUrlListName = placementUrlListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; プレイスメントリスト名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Placement List Name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return placementUrlListName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> プレイスメントリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Placement List Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public AdGroupTargetServicePlacementTarget placementUrlListType(AdGroupTargetServicePlacementUrlListType placementUrlListType) {
    
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

  public AdGroupTargetServicePlacementUrlListType getPlacementUrlListType() {
    return placementUrlListType;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementUrlListType(AdGroupTargetServicePlacementUrlListType placementUrlListType) {
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
    AdGroupTargetServicePlacementTarget adGroupTargetServicePlacementTarget = (AdGroupTargetServicePlacementTarget) o;
    return Objects.equals(this.placementUrlListName, adGroupTargetServicePlacementTarget.placementUrlListName) &&
        Objects.equals(this.placementUrlListType, adGroupTargetServicePlacementTarget.placementUrlListType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementUrlListName, placementUrlListType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServicePlacementTarget {\n");
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


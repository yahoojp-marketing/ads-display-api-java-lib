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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServicePlacementCategoryTargetオブジェクトは、プレイスメントカテゴリーターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPLACEMENT_CATEGORY_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServicePlacementCategoryTarget object contains information about placement category targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is PLACEMENT_CATEGORY_TARGET, this field is required. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupTargetServicePlacementCategoryTarget.JSON_PROPERTY_PLACEMENT_CATEGORY_LIST_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServicePlacementCategoryTarget {
  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_LIST_NAME = "placementCategoryListName";
  private String placementCategoryListName;

  public AdGroupTargetServicePlacementCategoryTarget() {
  }

  public AdGroupTargetServicePlacementCategoryTarget placementCategoryListName(String placementCategoryListName) {
    
    this.placementCategoryListName = placementCategoryListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; プレイスメントカテゴリリスト名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Placement category list name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return placementCategoryListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlacementCategoryListName() {
    return placementCategoryListName;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementCategoryListName(String placementCategoryListName) {
    this.placementCategoryListName = placementCategoryListName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServicePlacementCategoryTarget adGroupTargetServicePlacementCategoryTarget = (AdGroupTargetServicePlacementCategoryTarget) o;
    return Objects.equals(this.placementCategoryListName, adGroupTargetServicePlacementCategoryTarget.placementCategoryListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServicePlacementCategoryTarget {\n");
    sb.append("    placementCategoryListName: ").append(toIndentedString(placementCategoryListName)).append("\n");
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


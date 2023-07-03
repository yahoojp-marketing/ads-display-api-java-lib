/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v11.model.StatsServicePlacementCategoryType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; StatsServicePlacementCategoryDetailTargetオブジェクトは、プレイスメントカテゴリー詳細ターゲティングの設定情報を保持します。&lt;br&gt; ※targetTypeがPLACEMENT_CATEGORY_DETAIL_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; StatsServicePlacementCategoryDetailTarget object contains information about placement category detail targeting settings.&lt;br&gt; ∗If targetType is PLACEMENT_CATEGORY_DETAIL_TARGET, this field is required. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServicePlacementCategoryDetailTarget.JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_JA,
  StatsServicePlacementCategoryDetailTarget.JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_EN,
  StatsServicePlacementCategoryDetailTarget.JSON_PROPERTY_PLACEMENT_CATEGORY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServicePlacementCategoryDetailTarget {
  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_JA = "placementCategoryNameJa";
  private String placementCategoryNameJa;

  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_EN = "placementCategoryNameEn";
  private String placementCategoryNameEn;

  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_TYPE = "placementCategoryType";
  private StatsServicePlacementCategoryType placementCategoryType;

  public StatsServicePlacementCategoryDetailTarget() {
  }

  public StatsServicePlacementCategoryDetailTarget placementCategoryNameJa(String placementCategoryNameJa) {
    
    this.placementCategoryNameJa = placementCategoryNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カテゴリ名(日本語)です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Category name (Japanese).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return placementCategoryNameJa
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlacementCategoryNameJa() {
    return placementCategoryNameJa;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementCategoryNameJa(String placementCategoryNameJa) {
    this.placementCategoryNameJa = placementCategoryNameJa;
  }


  public StatsServicePlacementCategoryDetailTarget placementCategoryNameEn(String placementCategoryNameEn) {
    
    this.placementCategoryNameEn = placementCategoryNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カテゴリ名(英語)です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Category name (English).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return placementCategoryNameEn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlacementCategoryNameEn() {
    return placementCategoryNameEn;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementCategoryNameEn(String placementCategoryNameEn) {
    this.placementCategoryNameEn = placementCategoryNameEn;
  }


  public StatsServicePlacementCategoryDetailTarget placementCategoryType(StatsServicePlacementCategoryType placementCategoryType) {
    
    this.placementCategoryType = placementCategoryType;
    return this;
  }

   /**
   * Get placementCategoryType
   * @return placementCategoryType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServicePlacementCategoryType getPlacementCategoryType() {
    return placementCategoryType;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementCategoryType(StatsServicePlacementCategoryType placementCategoryType) {
    this.placementCategoryType = placementCategoryType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServicePlacementCategoryDetailTarget statsServicePlacementCategoryDetailTarget = (StatsServicePlacementCategoryDetailTarget) o;
    return Objects.equals(this.placementCategoryNameJa, statsServicePlacementCategoryDetailTarget.placementCategoryNameJa) &&
        Objects.equals(this.placementCategoryNameEn, statsServicePlacementCategoryDetailTarget.placementCategoryNameEn) &&
        Objects.equals(this.placementCategoryType, statsServicePlacementCategoryDetailTarget.placementCategoryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryNameJa, placementCategoryNameEn, placementCategoryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServicePlacementCategoryDetailTarget {\n");
    sb.append("    placementCategoryNameJa: ").append(toIndentedString(placementCategoryNameJa)).append("\n");
    sb.append("    placementCategoryNameEn: ").append(toIndentedString(placementCategoryNameEn)).append("\n");
    sb.append("    placementCategoryType: ").append(toIndentedString(placementCategoryType)).append("\n");
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


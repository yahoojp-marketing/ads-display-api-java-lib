/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; DictionaryServicePlacementCategoryオブジェクトは、駅情報を保持します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; DictionaryServicePlacementCategory object contains information about station.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> DictionaryServicePlacementCategoryオブジェクトは、駅情報を保持します。<br> </div> <div lang=\"en\"> DictionaryServicePlacementCategory object contains information about station.<br> </div> ")
@JsonPropertyOrder({
  DictionaryServicePlacementCategory.JSON_PROPERTY_PLACEMENT_CATEGORY_ID,
  DictionaryServicePlacementCategory.JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_JA,
  DictionaryServicePlacementCategory.JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_EN
})
@JsonTypeName("DictionaryServicePlacementCategory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServicePlacementCategory {
  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_ID = "placementCategoryId";
  private Long placementCategoryId;

  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_JA = "placementCategoryNameJa";
  private String placementCategoryNameJa;

  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_NAME_EN = "placementCategoryNameEn";
  private String placementCategoryNameEn;

  public DictionaryServicePlacementCategory() { 
  }

  public DictionaryServicePlacementCategory placementCategoryId(Long placementCategoryId) {
    
    this.placementCategoryId = placementCategoryId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; プレイスメントカテゴリーIDです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Placement category ID.&lt;br&gt; &lt;/div&gt; 
   * @return placementCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> プレイスメントカテゴリーIDです。<br> </div> <div lang=\"en\"> Placement category ID.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPlacementCategoryId() {
    return placementCategoryId;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementCategoryId(Long placementCategoryId) {
    this.placementCategoryId = placementCategoryId;
  }


  public DictionaryServicePlacementCategory placementCategoryNameJa(String placementCategoryNameJa) {
    
    this.placementCategoryNameJa = placementCategoryNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 駅名(日本語)です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Station name(Ja)&lt;br&gt; &lt;/div&gt; 
   * @return placementCategoryNameJa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 駅名(日本語)です。<br> </div> <div lang=\"en\"> Station name(Ja)<br> </div> ")
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


  public DictionaryServicePlacementCategory placementCategoryNameEn(String placementCategoryNameEn) {
    
    this.placementCategoryNameEn = placementCategoryNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 駅名(英語)です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Station name(Eng)&lt;br&gt; &lt;/div&gt; 
   * @return placementCategoryNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 駅名(英語)です。<br> </div> <div lang=\"en\"> Station name(Eng)<br> </div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServicePlacementCategory dictionaryServicePlacementCategory = (DictionaryServicePlacementCategory) o;
    return Objects.equals(this.placementCategoryId, dictionaryServicePlacementCategory.placementCategoryId) &&
        Objects.equals(this.placementCategoryNameJa, dictionaryServicePlacementCategory.placementCategoryNameJa) &&
        Objects.equals(this.placementCategoryNameEn, dictionaryServicePlacementCategory.placementCategoryNameEn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryId, placementCategoryNameJa, placementCategoryNameEn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServicePlacementCategory {\n");
    sb.append("    placementCategoryId: ").append(toIndentedString(placementCategoryId)).append("\n");
    sb.append("    placementCategoryNameJa: ").append(toIndentedString(placementCategoryNameJa)).append("\n");
    sb.append("    placementCategoryNameEn: ").append(toIndentedString(placementCategoryNameEn)).append("\n");
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


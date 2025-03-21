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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceSiteCategoryTargetオブジェクトは、サイトカテゴリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceSiteCategoryTarget object holds configuration information of Site category targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServiceSiteCategoryTarget.JSON_PROPERTY_CATEGORY_FULL_NAME_EN,
  StatsServiceSiteCategoryTarget.JSON_PROPERTY_CATEGORY_FULL_NAME_JA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceSiteCategoryTarget {
  public static final String JSON_PROPERTY_CATEGORY_FULL_NAME_EN = "categoryFullNameEn";
  private String categoryFullNameEn;

  public static final String JSON_PROPERTY_CATEGORY_FULL_NAME_JA = "categoryFullNameJa";
  private String categoryFullNameJa;

  public StatsServiceSiteCategoryTarget() {
  }

  public StatsServiceSiteCategoryTarget categoryFullNameEn(String categoryFullNameEn) {
    
    this.categoryFullNameEn = categoryFullNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ名（英語）&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Site category name (English)&lt;/div&gt; 
   * @return categoryFullNameEn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY_FULL_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryFullNameEn() {
    return categoryFullNameEn;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_FULL_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryFullNameEn(String categoryFullNameEn) {
    this.categoryFullNameEn = categoryFullNameEn;
  }


  public StatsServiceSiteCategoryTarget categoryFullNameJa(String categoryFullNameJa) {
    
    this.categoryFullNameJa = categoryFullNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ名（日本語）&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Site category name (Japanese)&lt;/div&gt; 
   * @return categoryFullNameJa
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY_FULL_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryFullNameJa() {
    return categoryFullNameJa;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_FULL_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryFullNameJa(String categoryFullNameJa) {
    this.categoryFullNameJa = categoryFullNameJa;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceSiteCategoryTarget statsServiceSiteCategoryTarget = (StatsServiceSiteCategoryTarget) o;
    return Objects.equals(this.categoryFullNameEn, statsServiceSiteCategoryTarget.categoryFullNameEn) &&
        Objects.equals(this.categoryFullNameJa, statsServiceSiteCategoryTarget.categoryFullNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryFullNameEn, categoryFullNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceSiteCategoryTarget {\n");
    sb.append("    categoryFullNameEn: ").append(toIndentedString(categoryFullNameEn)).append("\n");
    sb.append("    categoryFullNameJa: ").append(toIndentedString(categoryFullNameJa)).append("\n");
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


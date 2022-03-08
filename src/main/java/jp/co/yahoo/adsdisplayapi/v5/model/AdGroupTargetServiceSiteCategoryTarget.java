/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceSiteCategoryTargetオブジェクトは、サイトカテゴリーターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがSITE_CATEGORYの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceSiteCategoryTarget object is a container for storing site category targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is SITE_CATEGORY, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceSiteCategoryTargetオブジェクトは、サイトカテゴリーターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがSITE_CATEGORYの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceSiteCategoryTarget object is a container for storing site category targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is SITE_CATEGORY, this field is required. </div> ")
@JsonPropertyOrder({
  AdGroupTargetServiceSiteCategoryTarget.JSON_PROPERTY_CATEGORY_FULL_NAME_EN,
  AdGroupTargetServiceSiteCategoryTarget.JSON_PROPERTY_CATEGORY_FULL_NAME_JA
})
@JsonTypeName("AdGroupTargetServiceSiteCategoryTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServiceSiteCategoryTarget {
  public static final String JSON_PROPERTY_CATEGORY_FULL_NAME_EN = "categoryFullNameEn";
  private String categoryFullNameEn;

  public static final String JSON_PROPERTY_CATEGORY_FULL_NAME_JA = "categoryFullNameJa";
  private String categoryFullNameJa;

  public AdGroupTargetServiceSiteCategoryTarget() { 
  }

  public AdGroupTargetServiceSiteCategoryTarget categoryFullNameEn(String categoryFullNameEn) {
    
    this.categoryFullNameEn = categoryFullNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カテゴリー名（英語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Site category name (English).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return categoryFullNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリー名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Site category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public AdGroupTargetServiceSiteCategoryTarget categoryFullNameJa(String categoryFullNameJa) {
    
    this.categoryFullNameJa = categoryFullNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カテゴリー名（日本語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Site category name (Japanese).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return categoryFullNameJa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリー名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Site category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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
    AdGroupTargetServiceSiteCategoryTarget adGroupTargetServiceSiteCategoryTarget = (AdGroupTargetServiceSiteCategoryTarget) o;
    return Objects.equals(this.categoryFullNameEn, adGroupTargetServiceSiteCategoryTarget.categoryFullNameEn) &&
        Objects.equals(this.categoryFullNameJa, adGroupTargetServiceSiteCategoryTarget.categoryFullNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryFullNameEn, categoryFullNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceSiteCategoryTarget {\n");
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


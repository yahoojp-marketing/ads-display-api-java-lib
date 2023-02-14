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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAUDIENCE_CATEGORY_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceAudienceCategoryTarget object contains information about audience category targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is AUDIENCE_CATEGORY_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがAUDIENCE_CATEGORY_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceAudienceCategoryTarget object contains information about audience category targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is AUDIENCE_CATEGORY_TARGET, this field is required. </div> ")
@JsonPropertyOrder({
  AdGroupTargetServiceAudienceCategoryTarget.JSON_PROPERTY_AUDIENCE_CATEGORY_TYPE,
  AdGroupTargetServiceAudienceCategoryTarget.JSON_PROPERTY_CATEGORY_NAME_EN,
  AdGroupTargetServiceAudienceCategoryTarget.JSON_PROPERTY_CATEGORY_NAME_JA
})
@JsonTypeName("AdGroupTargetServiceAudienceCategoryTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServiceAudienceCategoryTarget {
  public static final String JSON_PROPERTY_AUDIENCE_CATEGORY_TYPE = "audienceCategoryType";
  private String audienceCategoryType;

  public static final String JSON_PROPERTY_CATEGORY_NAME_EN = "categoryNameEn";
  private String categoryNameEn;

  public static final String JSON_PROPERTY_CATEGORY_NAME_JA = "categoryNameJa";
  private String categoryNameJa;

  public AdGroupTargetServiceAudienceCategoryTarget() { 
  }

  public AdGroupTargetServiceAudienceCategoryTarget audienceCategoryType(String audienceCategoryType) {
    
    this.audienceCategoryType = audienceCategoryType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カテゴリ種別です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; *返却される値の詳細については、DictionaryServiceで取得されるDictionaryServiceAudienceCategoryオブジェクトのaudienceCategoryTypeフィールドをご参照ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Category type.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; *For details of the returned value, refer to the audienceCategoryType field of DictionaryServiceAudienceCategory object obtained via DictionaryService. &lt;/div&gt; 
   * @return audienceCategoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ種別です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> *返却される値の詳細については、DictionaryServiceで取得されるDictionaryServiceAudienceCategoryオブジェクトのaudienceCategoryTypeフィールドをご参照ください。 </div> <div lang=\"en\"> Category type.<br> Although this field will be returned in the response, it will be ignored on input.<br> *For details of the returned value, refer to the audienceCategoryType field of DictionaryServiceAudienceCategory object obtained via DictionaryService. </div> ")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_CATEGORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudienceCategoryType() {
    return audienceCategoryType;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_CATEGORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
  }


  public AdGroupTargetServiceAudienceCategoryTarget categoryNameEn(String categoryNameEn) {
    
    this.categoryNameEn = categoryNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カテゴリ名（英語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Category name (English).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return categoryNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryNameEn() {
    return categoryNameEn;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryNameEn(String categoryNameEn) {
    this.categoryNameEn = categoryNameEn;
  }


  public AdGroupTargetServiceAudienceCategoryTarget categoryNameJa(String categoryNameJa) {
    
    this.categoryNameJa = categoryNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カテゴリ名（日本語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Category name (Japanese).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return categoryNameJa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryNameJa() {
    return categoryNameJa;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryNameJa(String categoryNameJa) {
    this.categoryNameJa = categoryNameJa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceAudienceCategoryTarget adGroupTargetServiceAudienceCategoryTarget = (AdGroupTargetServiceAudienceCategoryTarget) o;
    return Objects.equals(this.audienceCategoryType, adGroupTargetServiceAudienceCategoryTarget.audienceCategoryType) &&
        Objects.equals(this.categoryNameEn, adGroupTargetServiceAudienceCategoryTarget.categoryNameEn) &&
        Objects.equals(this.categoryNameJa, adGroupTargetServiceAudienceCategoryTarget.categoryNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceCategoryType, categoryNameEn, categoryNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceAudienceCategoryTarget {\n");
    sb.append("    audienceCategoryType: ").append(toIndentedString(audienceCategoryType)).append("\n");
    sb.append("    categoryNameEn: ").append(toIndentedString(categoryNameEn)).append("\n");
    sb.append("    categoryNameJa: ").append(toIndentedString(categoryNameJa)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAudienceCategoryTarget object contains configuration information of Audience Category targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAudienceCategoryTarget object contains configuration information of Audience Category targeting.</div> ")
@JsonPropertyOrder({
  StatsServiceAudienceCategoryTarget.JSON_PROPERTY_AUDIENCE_CATEGORY_TYPE,
  StatsServiceAudienceCategoryTarget.JSON_PROPERTY_CATEGORY_NAME_EN,
  StatsServiceAudienceCategoryTarget.JSON_PROPERTY_CATEGORY_NAME_JA
})
@JsonTypeName("StatsServiceAudienceCategoryTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceAudienceCategoryTarget {
  public static final String JSON_PROPERTY_AUDIENCE_CATEGORY_TYPE = "audienceCategoryType";
  private String audienceCategoryType;

  public static final String JSON_PROPERTY_CATEGORY_NAME_EN = "categoryNameEn";
  private String categoryNameEn;

  public static final String JSON_PROPERTY_CATEGORY_NAME_JA = "categoryNameJa";
  private String categoryNameJa;

  public StatsServiceAudienceCategoryTarget() { 
  }

  public StatsServiceAudienceCategoryTarget audienceCategoryType(String audienceCategoryType) {
    
    this.audienceCategoryType = audienceCategoryType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 提供されるカテゴリの種別を表します。&lt;br&gt; *返却される値の詳細については、DictionaryServiceで取得されるDictionaryServiceAudienceCategoryオブジェクトのaudienceCategoryTypeフィールドをご参照ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience category information.&lt;br&gt; *For details of the returned value, refer to the audienceCategoryType field of DictionaryServiceAudienceCategory object obtained via DictionaryService. &lt;/div&gt; 
   * @return audienceCategoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 提供されるカテゴリの種別を表します。<br> *返却される値の詳細については、DictionaryServiceで取得されるDictionaryServiceAudienceCategoryオブジェクトのaudienceCategoryTypeフィールドをご参照ください。 </div> <div lang=\"en\"> Audience category information.<br> *For details of the returned value, refer to the audienceCategoryType field of DictionaryServiceAudienceCategory object obtained via DictionaryService. </div> ")
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


  public StatsServiceAudienceCategoryTarget categoryNameEn(String categoryNameEn) {
    
    this.categoryNameEn = categoryNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ名（英語）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Category name (English)&lt;/div&gt; 
   * @return categoryNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（英語）です。</div> <div lang=\"en\">Category name (English)</div> ")
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


  public StatsServiceAudienceCategoryTarget categoryNameJa(String categoryNameJa) {
    
    this.categoryNameJa = categoryNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ名（日本語）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Category name (Japanese)&lt;/div&gt; 
   * @return categoryNameJa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（日本語）です。</div> <div lang=\"en\">Category name (Japanese)</div> ")
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
    StatsServiceAudienceCategoryTarget statsServiceAudienceCategoryTarget = (StatsServiceAudienceCategoryTarget) o;
    return Objects.equals(this.audienceCategoryType, statsServiceAudienceCategoryTarget.audienceCategoryType) &&
        Objects.equals(this.categoryNameEn, statsServiceAudienceCategoryTarget.categoryNameEn) &&
        Objects.equals(this.categoryNameJa, statsServiceAudienceCategoryTarget.categoryNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceCategoryType, categoryNameEn, categoryNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAudienceCategoryTarget {\n");
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


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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedAudienceCategoryTarget object contains information about audience category targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedAudienceCategoryTarget object contains information about audience category targeting settings.</div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePermittedAudienceCategoryTarget.JSON_PROPERTY_TARGET_ID,
  GuaranteedSimulationServicePermittedAudienceCategoryTarget.JSON_PROPERTY_CATEGORY_FULL_NAME_EN,
  GuaranteedSimulationServicePermittedAudienceCategoryTarget.JSON_PROPERTY_CATEGORY_FULL_NAME_JA
})
@JsonTypeName("GuaranteedSimulationServicePermittedAudienceCategoryTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePermittedAudienceCategoryTarget {
  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private String targetId;

  public static final String JSON_PROPERTY_CATEGORY_FULL_NAME_EN = "categoryFullNameEn";
  private String categoryFullNameEn;

  public static final String JSON_PROPERTY_CATEGORY_FULL_NAME_JA = "categoryFullNameJa";
  private String categoryFullNameJa;

  public GuaranteedSimulationServicePermittedAudienceCategoryTarget() { 
  }

  public GuaranteedSimulationServicePermittedAudienceCategoryTarget targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target ID&lt;/div&gt; 
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public GuaranteedSimulationServicePermittedAudienceCategoryTarget categoryFullNameEn(String categoryFullNameEn) {
    
    this.categoryFullNameEn = categoryFullNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ名（英語）&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Site category name (English)&lt;/div&gt; 
   * @return categoryFullNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（英語）</div> <div lang=\"en\">Site category name (English)</div> ")
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


  public GuaranteedSimulationServicePermittedAudienceCategoryTarget categoryFullNameJa(String categoryFullNameJa) {
    
    this.categoryFullNameJa = categoryFullNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ名（日本語）&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Interest category name (Japanese)&lt;/div&gt; 
   * @return categoryFullNameJa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（日本語）</div> <div lang=\"en\">Interest category name (Japanese)</div> ")
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
    GuaranteedSimulationServicePermittedAudienceCategoryTarget guaranteedSimulationServicePermittedAudienceCategoryTarget = (GuaranteedSimulationServicePermittedAudienceCategoryTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedAudienceCategoryTarget.targetId) &&
        Objects.equals(this.categoryFullNameEn, guaranteedSimulationServicePermittedAudienceCategoryTarget.categoryFullNameEn) &&
        Objects.equals(this.categoryFullNameJa, guaranteedSimulationServicePermittedAudienceCategoryTarget.categoryFullNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, categoryFullNameEn, categoryFullNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedAudienceCategoryTarget {\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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


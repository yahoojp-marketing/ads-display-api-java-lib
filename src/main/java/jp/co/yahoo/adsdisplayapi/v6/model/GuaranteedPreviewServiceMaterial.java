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
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedPreviewServiceMaterialAd;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedPreviewServiceMaterialMedia;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedPreviewServiceMaterialType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewServiceMaterialオブジェクトは、プレビュー素材に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedPreviewServiceMaterial object describes information about the preview material.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewServiceMaterialオブジェクトは、プレビュー素材に関する情報を表します。</div> <div lang=\"en\">GuaranteedPreviewServiceMaterial object describes information about the preview material.</div> ")
@JsonPropertyOrder({
  GuaranteedPreviewServiceMaterial.JSON_PROPERTY_MATERIAL_TYPE,
  GuaranteedPreviewServiceMaterial.JSON_PROPERTY_MATERIAL_AD,
  GuaranteedPreviewServiceMaterial.JSON_PROPERTY_MATERIAL_MEDIA
})
@JsonTypeName("GuaranteedPreviewServiceMaterial")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedPreviewServiceMaterial {
  public static final String JSON_PROPERTY_MATERIAL_TYPE = "materialType";
  private GuaranteedPreviewServiceMaterialType materialType;

  public static final String JSON_PROPERTY_MATERIAL_AD = "materialAd";
  private GuaranteedPreviewServiceMaterialAd materialAd;

  public static final String JSON_PROPERTY_MATERIAL_MEDIA = "materialMedia";
  private GuaranteedPreviewServiceMaterialMedia materialMedia;

  public GuaranteedPreviewServiceMaterial() { 
  }

  public GuaranteedPreviewServiceMaterial materialType(GuaranteedPreviewServiceMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedPreviewServiceMaterialType getMaterialType() {
    return materialType;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialType(GuaranteedPreviewServiceMaterialType materialType) {
    this.materialType = materialType;
  }


  public GuaranteedPreviewServiceMaterial materialAd(GuaranteedPreviewServiceMaterialAd materialAd) {
    
    this.materialAd = materialAd;
    return this;
  }

   /**
   * Get materialAd
   * @return materialAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedPreviewServiceMaterialAd getMaterialAd() {
    return materialAd;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialAd(GuaranteedPreviewServiceMaterialAd materialAd) {
    this.materialAd = materialAd;
  }


  public GuaranteedPreviewServiceMaterial materialMedia(GuaranteedPreviewServiceMaterialMedia materialMedia) {
    
    this.materialMedia = materialMedia;
    return this;
  }

   /**
   * Get materialMedia
   * @return materialMedia
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedPreviewServiceMaterialMedia getMaterialMedia() {
    return materialMedia;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialMedia(GuaranteedPreviewServiceMaterialMedia materialMedia) {
    this.materialMedia = materialMedia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedPreviewServiceMaterial guaranteedPreviewServiceMaterial = (GuaranteedPreviewServiceMaterial) o;
    return Objects.equals(this.materialType, guaranteedPreviewServiceMaterial.materialType) &&
        Objects.equals(this.materialAd, guaranteedPreviewServiceMaterial.materialAd) &&
        Objects.equals(this.materialMedia, guaranteedPreviewServiceMaterial.materialMedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialType, materialAd, materialMedia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreviewServiceMaterial {\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    materialAd: ").append(toIndentedString(materialAd)).append("\n");
    sb.append("    materialMedia: ").append(toIndentedString(materialMedia)).append("\n");
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


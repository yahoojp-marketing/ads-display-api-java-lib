package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedPreviewServiceMaterialAd;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedPreviewServiceMaterialMedia;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedPreviewServiceMaterialType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewServiceMaterialオブジェクトは、プレビュー素材に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedPreviewServiceMaterial object describes information about the preview material.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewServiceMaterialオブジェクトは、プレビュー素材に関する情報を表します。</div> <div lang=\"en\">GuaranteedPreviewServiceMaterial object describes information about the preview material.</div> ")

public class GuaranteedPreviewServiceMaterial   {
  @JsonProperty("materialType")
  private JsonNullable<GuaranteedPreviewServiceMaterialType> materialType = JsonNullable.undefined();

  @JsonProperty("materialAd")
  private JsonNullable<GuaranteedPreviewServiceMaterialAd> materialAd = JsonNullable.undefined();

  @JsonProperty("materialMedia")
  private JsonNullable<GuaranteedPreviewServiceMaterialMedia> materialMedia = JsonNullable.undefined();

  public GuaranteedPreviewServiceMaterial materialType(GuaranteedPreviewServiceMaterialType materialType) {
    this.materialType = JsonNullable.of(materialType);
    return this;
  }

  /**
   * Get materialType
   * @return materialType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedPreviewServiceMaterialType> getMaterialType() {
    return materialType;
  }

  public void setMaterialType(JsonNullable<GuaranteedPreviewServiceMaterialType> materialType) {
    this.materialType = materialType;
  }

  public GuaranteedPreviewServiceMaterial materialAd(GuaranteedPreviewServiceMaterialAd materialAd) {
    this.materialAd = JsonNullable.of(materialAd);
    return this;
  }

  /**
   * Get materialAd
   * @return materialAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedPreviewServiceMaterialAd> getMaterialAd() {
    return materialAd;
  }

  public void setMaterialAd(JsonNullable<GuaranteedPreviewServiceMaterialAd> materialAd) {
    this.materialAd = materialAd;
  }

  public GuaranteedPreviewServiceMaterial materialMedia(GuaranteedPreviewServiceMaterialMedia materialMedia) {
    this.materialMedia = JsonNullable.of(materialMedia);
    return this;
  }

  /**
   * Get materialMedia
   * @return materialMedia
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedPreviewServiceMaterialMedia> getMaterialMedia() {
    return materialMedia;
  }

  public void setMaterialMedia(JsonNullable<GuaranteedPreviewServiceMaterialMedia> materialMedia) {
    this.materialMedia = materialMedia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


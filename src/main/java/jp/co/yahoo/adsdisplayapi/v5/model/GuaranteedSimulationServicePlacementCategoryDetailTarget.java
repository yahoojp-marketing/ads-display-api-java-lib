package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePlacementCategoryType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServicePlacementCategoryDetailTargetオブジェクトは、プレイスメントカテゴリー詳細ターゲティングの設定情報を保持します。&lt;br&gt; ADD時このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPLACEMENT_CATEGORY_DETAIL_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServicePlacementCategoryDetailTarget object contains information about placement category detail targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is PLACEMENT_CATEGORY_DETAIL_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServicePlacementCategoryDetailTargetオブジェクトは、プレイスメントカテゴリー詳細ターゲティングの設定情報を保持します。<br> ADD時このフィールドは省略可能となります。<br> ※targetTypeがPLACEMENT_CATEGORY_DETAIL_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServicePlacementCategoryDetailTarget object contains information about placement category detail targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is PLACEMENT_CATEGORY_DETAIL_TARGET, this field is required. </div> ")

public class GuaranteedSimulationServicePlacementCategoryDetailTarget   {
  @JsonProperty("placementCategoryNameJa")
  private JsonNullable<String> placementCategoryNameJa = JsonNullable.undefined();

  @JsonProperty("placementCategoryNameEn")
  private JsonNullable<String> placementCategoryNameEn = JsonNullable.undefined();

  @JsonProperty("placementCategoryType")
  private JsonNullable<GuaranteedSimulationServicePlacementCategoryType> placementCategoryType = JsonNullable.undefined();

  public GuaranteedSimulationServicePlacementCategoryDetailTarget placementCategoryNameJa(String placementCategoryNameJa) {
    this.placementCategoryNameJa = JsonNullable.of(placementCategoryNameJa);
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリ名(日本語)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return placementCategoryNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ名(日本語)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getPlacementCategoryNameJa() {
    return placementCategoryNameJa;
  }

  public void setPlacementCategoryNameJa(JsonNullable<String> placementCategoryNameJa) {
    this.placementCategoryNameJa = placementCategoryNameJa;
  }

  public GuaranteedSimulationServicePlacementCategoryDetailTarget placementCategoryNameEn(String placementCategoryNameEn) {
    this.placementCategoryNameEn = JsonNullable.of(placementCategoryNameEn);
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリ名(英語)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return placementCategoryNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ名(英語)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getPlacementCategoryNameEn() {
    return placementCategoryNameEn;
  }

  public void setPlacementCategoryNameEn(JsonNullable<String> placementCategoryNameEn) {
    this.placementCategoryNameEn = placementCategoryNameEn;
  }

  public GuaranteedSimulationServicePlacementCategoryDetailTarget placementCategoryType(GuaranteedSimulationServicePlacementCategoryType placementCategoryType) {
    this.placementCategoryType = JsonNullable.of(placementCategoryType);
    return this;
  }

  /**
   * Get placementCategoryType
   * @return placementCategoryType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePlacementCategoryType> getPlacementCategoryType() {
    return placementCategoryType;
  }

  public void setPlacementCategoryType(JsonNullable<GuaranteedSimulationServicePlacementCategoryType> placementCategoryType) {
    this.placementCategoryType = placementCategoryType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePlacementCategoryDetailTarget guaranteedSimulationServicePlacementCategoryDetailTarget = (GuaranteedSimulationServicePlacementCategoryDetailTarget) o;
    return Objects.equals(this.placementCategoryNameJa, guaranteedSimulationServicePlacementCategoryDetailTarget.placementCategoryNameJa) &&
        Objects.equals(this.placementCategoryNameEn, guaranteedSimulationServicePlacementCategoryDetailTarget.placementCategoryNameEn) &&
        Objects.equals(this.placementCategoryType, guaranteedSimulationServicePlacementCategoryDetailTarget.placementCategoryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryNameJa, placementCategoryNameEn, placementCategoryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePlacementCategoryDetailTarget {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


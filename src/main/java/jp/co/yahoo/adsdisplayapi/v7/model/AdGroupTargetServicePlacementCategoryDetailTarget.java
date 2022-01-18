package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServicePlacementCategoryType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServicePlacementCategoryDetailTargetオブジェクトは、プレイスメントカテゴリー詳細ターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPLACEMENT_CATEGORY_DETAIL_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServicePlacementCategoryDetailTarget object contains information about placement category detail targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is PLACEMENT_CATEGORY_DETAIL_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServicePlacementCategoryDetailTargetオブジェクトは、プレイスメントカテゴリー詳細ターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがPLACEMENT_CATEGORY_DETAIL_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServicePlacementCategoryDetailTarget object contains information about placement category detail targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is PLACEMENT_CATEGORY_DETAIL_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServicePlacementCategoryDetailTarget   {
  @JsonProperty("placementCategoryNameJa")
  private String placementCategoryNameJa = null;

  @JsonProperty("placementCategoryNameEn")
  private String placementCategoryNameEn = null;

  @JsonProperty("placementCategoryType")
  private AdGroupTargetServicePlacementCategoryType placementCategoryType = null;

  public AdGroupTargetServicePlacementCategoryDetailTarget placementCategoryNameJa(String placementCategoryNameJa) {
    this.placementCategoryNameJa = placementCategoryNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリ名(日本語)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return placementCategoryNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ名(日本語)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getPlacementCategoryNameJa() {
    return placementCategoryNameJa;
  }

  public void setPlacementCategoryNameJa(String placementCategoryNameJa) {
    this.placementCategoryNameJa = placementCategoryNameJa;
  }

  public AdGroupTargetServicePlacementCategoryDetailTarget placementCategoryNameEn(String placementCategoryNameEn) {
    this.placementCategoryNameEn = placementCategoryNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリ名(英語)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return placementCategoryNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ名(英語)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getPlacementCategoryNameEn() {
    return placementCategoryNameEn;
  }

  public void setPlacementCategoryNameEn(String placementCategoryNameEn) {
    this.placementCategoryNameEn = placementCategoryNameEn;
  }

  public AdGroupTargetServicePlacementCategoryDetailTarget placementCategoryType(AdGroupTargetServicePlacementCategoryType placementCategoryType) {
    this.placementCategoryType = placementCategoryType;
    return this;
  }

  /**
   * Get placementCategoryType
   * @return placementCategoryType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServicePlacementCategoryType getPlacementCategoryType() {
    return placementCategoryType;
  }

  public void setPlacementCategoryType(AdGroupTargetServicePlacementCategoryType placementCategoryType) {
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
    AdGroupTargetServicePlacementCategoryDetailTarget adGroupTargetServicePlacementCategoryDetailTarget = (AdGroupTargetServicePlacementCategoryDetailTarget) o;
    return Objects.equals(this.placementCategoryNameJa, adGroupTargetServicePlacementCategoryDetailTarget.placementCategoryNameJa) &&
        Objects.equals(this.placementCategoryNameEn, adGroupTargetServicePlacementCategoryDetailTarget.placementCategoryNameEn) &&
        Objects.equals(this.placementCategoryType, adGroupTargetServicePlacementCategoryDetailTarget.placementCategoryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryNameJa, placementCategoryNameEn, placementCategoryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServicePlacementCategoryDetailTarget {\n");
    
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


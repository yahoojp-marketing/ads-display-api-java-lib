package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAUDIENCE_CATEGORY_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceAudienceCategoryTarget object contains information about audience category targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is AUDIENCE_CATEGORY_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAUDIENCE_CATEGORY_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceAudienceCategoryTarget object contains information about audience category targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is AUDIENCE_CATEGORY_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceAudienceCategoryTarget   {
  @JsonProperty("audienceCategoryType")
  private String audienceCategoryType = null;

  @JsonProperty("categoryNameEn")
  private String categoryNameEn = null;

  @JsonProperty("categoryNameJa")
  private String categoryNameJa = null;

  public GuaranteedInventoryServiceAudienceCategoryTarget audienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリ種別です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category type.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return audienceCategoryType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ種別です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category type.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAudienceCategoryType() {
    return audienceCategoryType;
  }

  public void setAudienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
  }

  public GuaranteedInventoryServiceAudienceCategoryTarget categoryNameEn(String categoryNameEn) {
    this.categoryNameEn = categoryNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリ名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return categoryNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getCategoryNameEn() {
    return categoryNameEn;
  }

  public void setCategoryNameEn(String categoryNameEn) {
    this.categoryNameEn = categoryNameEn;
  }

  public GuaranteedInventoryServiceAudienceCategoryTarget categoryNameJa(String categoryNameJa) {
    this.categoryNameJa = categoryNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリ名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return categoryNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリ名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getCategoryNameJa() {
    return categoryNameJa;
  }

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
    GuaranteedInventoryServiceAudienceCategoryTarget guaranteedInventoryServiceAudienceCategoryTarget = (GuaranteedInventoryServiceAudienceCategoryTarget) o;
    return Objects.equals(this.audienceCategoryType, guaranteedInventoryServiceAudienceCategoryTarget.audienceCategoryType) &&
        Objects.equals(this.categoryNameEn, guaranteedInventoryServiceAudienceCategoryTarget.categoryNameEn) &&
        Objects.equals(this.categoryNameJa, guaranteedInventoryServiceAudienceCategoryTarget.categoryNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceCategoryType, categoryNameEn, categoryNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceAudienceCategoryTarget {\n");
    
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


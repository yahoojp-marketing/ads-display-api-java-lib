package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceInterestCategoryTargetオブジェクトは、インタレストカテゴリーターゲティング設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがINTEREST_CATEGORYの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceInterestCategoryTarget object is a container for storing interest category targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is INTEREST_CATEGORY, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceInterestCategoryTargetオブジェクトは、インタレストカテゴリーターゲティング設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがINTEREST_CATEGORYの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceInterestCategoryTarget object is a container for storing interest category targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is INTEREST_CATEGORY, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceInterestCategoryTarget   {
  @JsonProperty("categoryFullNameEn")
  private String categoryFullNameEn = null;

  @JsonProperty("categoryFullNameJa")
  private String categoryFullNameJa = null;

  public AdGroupTargetServiceInterestCategoryTarget categoryFullNameEn(String categoryFullNameEn) {
    this.categoryFullNameEn = categoryFullNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリー名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Interest category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return categoryFullNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリー名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Interest category name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getCategoryFullNameEn() {
    return categoryFullNameEn;
  }

  public void setCategoryFullNameEn(String categoryFullNameEn) {
    this.categoryFullNameEn = categoryFullNameEn;
  }

  public AdGroupTargetServiceInterestCategoryTarget categoryFullNameJa(String categoryFullNameJa) {
    this.categoryFullNameJa = categoryFullNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリー名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Interest category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return categoryFullNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリー名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Interest category name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getCategoryFullNameJa() {
    return categoryFullNameJa;
  }

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
    AdGroupTargetServiceInterestCategoryTarget adGroupTargetServiceInterestCategoryTarget = (AdGroupTargetServiceInterestCategoryTarget) o;
    return Objects.equals(this.categoryFullNameEn, adGroupTargetServiceInterestCategoryTarget.categoryFullNameEn) &&
        Objects.equals(this.categoryFullNameJa, adGroupTargetServiceInterestCategoryTarget.categoryFullNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryFullNameEn, categoryFullNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceInterestCategoryTarget {\n");
    
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

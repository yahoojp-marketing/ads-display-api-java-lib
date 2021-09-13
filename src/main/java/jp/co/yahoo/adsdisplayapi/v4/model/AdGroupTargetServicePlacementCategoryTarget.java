package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServicePlacementCategoryTargetオブジェクトは、プレイスメントカテゴリーターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPLACEMENT_CATEGORY_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServicePlacementCategoryTarget object contains information about placement category targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is PLACEMENT_CATEGORY_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServicePlacementCategoryTargetオブジェクトは、プレイスメントカテゴリーターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがPLACEMENT_CATEGORY_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServicePlacementCategoryTarget object contains information about placement category targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is PLACEMENT_CATEGORY_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServicePlacementCategoryTarget   {
  @JsonProperty("placementCategoryListName")
  private String placementCategoryListName = null;

  public AdGroupTargetServicePlacementCategoryTarget placementCategoryListName(String placementCategoryListName) {
    this.placementCategoryListName = placementCategoryListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> プレイスメントカテゴリリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Placement category list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return placementCategoryListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> プレイスメントカテゴリリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Placement category list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getPlacementCategoryListName() {
    return placementCategoryListName;
  }

  public void setPlacementCategoryListName(String placementCategoryListName) {
    this.placementCategoryListName = placementCategoryListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServicePlacementCategoryTarget adGroupTargetServicePlacementCategoryTarget = (AdGroupTargetServicePlacementCategoryTarget) o;
    return Objects.equals(this.placementCategoryListName, adGroupTargetServicePlacementCategoryTarget.placementCategoryListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServicePlacementCategoryTarget {\n");
    
    sb.append("    placementCategoryListName: ").append(toIndentedString(placementCategoryListName)).append("\n");
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


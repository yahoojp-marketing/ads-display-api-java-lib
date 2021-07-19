package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServicePlacementUrlListType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServicePlacementTargetオブジェクトは、プレイスメントターゲティングの設定情報を保持するオブジェクトです。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPLACEMENT_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServicePlacementTarget object is a container for storing placement targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is PLACEMENT_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServicePlacementTargetオブジェクトは、プレイスメントターゲティングの設定情報を保持するオブジェクトです。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがPLACEMENT_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServicePlacementTarget object is a container for storing placement targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is PLACEMENT_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServicePlacementTarget   {
  @JsonProperty("placementUrlListName")
  private String placementUrlListName = null;

  @JsonProperty("placementUrlListType")
  private AdGroupTargetServicePlacementUrlListType placementUrlListType = null;

  public AdGroupTargetServicePlacementTarget placementUrlListName(String placementUrlListName) {
    this.placementUrlListName = placementUrlListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> プレイスメントリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Placement List Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return placementUrlListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> プレイスメントリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Placement List Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getPlacementUrlListName() {
    return placementUrlListName;
  }

  public void setPlacementUrlListName(String placementUrlListName) {
    this.placementUrlListName = placementUrlListName;
  }

  public AdGroupTargetServicePlacementTarget placementUrlListType(AdGroupTargetServicePlacementUrlListType placementUrlListType) {
    this.placementUrlListType = placementUrlListType;
    return this;
  }

  /**
   * Get placementUrlListType
   * @return placementUrlListType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServicePlacementUrlListType getPlacementUrlListType() {
    return placementUrlListType;
  }

  public void setPlacementUrlListType(AdGroupTargetServicePlacementUrlListType placementUrlListType) {
    this.placementUrlListType = placementUrlListType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServicePlacementTarget adGroupTargetServicePlacementTarget = (AdGroupTargetServicePlacementTarget) o;
    return Objects.equals(this.placementUrlListName, adGroupTargetServicePlacementTarget.placementUrlListName) &&
        Objects.equals(this.placementUrlListType, adGroupTargetServicePlacementTarget.placementUrlListType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementUrlListName, placementUrlListType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServicePlacementTarget {\n");
    
    sb.append("    placementUrlListName: ").append(toIndentedString(placementUrlListName)).append("\n");
    sb.append("    placementUrlListType: ").append(toIndentedString(placementUrlListType)).append("\n");
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


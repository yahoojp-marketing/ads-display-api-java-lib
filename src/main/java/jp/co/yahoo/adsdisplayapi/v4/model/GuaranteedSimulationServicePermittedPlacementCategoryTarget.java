package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedPlacementCategoryTargetオブジェクトは、プレイスメントカテゴリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedPlacementCategoryTarget object holds configuration information of placement category targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedPlacementCategoryTargetオブジェクトは、プレイスメントカテゴリターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedPlacementCategoryTarget object holds configuration information of placement category targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePermittedPlacementCategoryTarget   {
  @JsonProperty("placementCategoryListId")
  private Long placementCategoryListId = null;

  @JsonProperty("placementCategoryListName")
  private String placementCategoryListName = null;

  public GuaranteedSimulationServicePermittedPlacementCategoryTarget placementCategoryListId(Long placementCategoryListId) {
    this.placementCategoryListId = placementCategoryListId;
    return this;
  }

  /**
   * <div lang=\"ja\">プレイスメントカテゴリリストIDです。</div> <div lang=\"en\">Placement category ID.</div> 
   * @return placementCategoryListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">プレイスメントカテゴリリストIDです。</div> <div lang=\"en\">Placement category ID.</div> ")


  public Long getPlacementCategoryListId() {
    return placementCategoryListId;
  }

  public void setPlacementCategoryListId(Long placementCategoryListId) {
    this.placementCategoryListId = placementCategoryListId;
  }

  public GuaranteedSimulationServicePermittedPlacementCategoryTarget placementCategoryListName(String placementCategoryListName) {
    this.placementCategoryListName = placementCategoryListName;
    return this;
  }

  /**
   * <div lang=\"ja\">プレイスメントカテゴリリスト名です。</div> <div lang=\"en\">Placement category name.</div> 
   * @return placementCategoryListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">プレイスメントカテゴリリスト名です。</div> <div lang=\"en\">Placement category name.</div> ")


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
    GuaranteedSimulationServicePermittedPlacementCategoryTarget guaranteedSimulationServicePermittedPlacementCategoryTarget = (GuaranteedSimulationServicePermittedPlacementCategoryTarget) o;
    return Objects.equals(this.placementCategoryListId, guaranteedSimulationServicePermittedPlacementCategoryTarget.placementCategoryListId) &&
        Objects.equals(this.placementCategoryListName, guaranteedSimulationServicePermittedPlacementCategoryTarget.placementCategoryListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryListId, placementCategoryListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedPlacementCategoryTarget {\n");
    
    sb.append("    placementCategoryListId: ").append(toIndentedString(placementCategoryListId)).append("\n");
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


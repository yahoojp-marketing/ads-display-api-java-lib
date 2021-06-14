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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedPlacementCategoryTargetオブジェクトは、プレイスメントカテゴリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedPlacementCategoryTarget object holds configuration information of placement category targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedPlacementCategoryTargetオブジェクトは、プレイスメントカテゴリターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedPlacementCategoryTarget object holds configuration information of placement category targeting.</div> ")

public class GuaranteedSimulationServicePermittedPlacementCategoryTarget   {
  @JsonProperty("placementCategoryListId")
  private JsonNullable<Long> placementCategoryListId = JsonNullable.undefined();

  @JsonProperty("placementCategoryListName")
  private JsonNullable<String> placementCategoryListName = JsonNullable.undefined();

  @JsonProperty("placementCategoryType")
  private JsonNullable<GuaranteedSimulationServicePlacementCategoryType> placementCategoryType = JsonNullable.undefined();

  public GuaranteedSimulationServicePermittedPlacementCategoryTarget placementCategoryListId(Long placementCategoryListId) {
    this.placementCategoryListId = JsonNullable.of(placementCategoryListId);
    return this;
  }

  /**
   * <div lang=\"ja\">プレイスメントカテゴリリストIDです。</div> <div lang=\"en\">Placement category ID.</div> 
   * @return placementCategoryListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">プレイスメントカテゴリリストIDです。</div> <div lang=\"en\">Placement category ID.</div> ")


  public JsonNullable<Long> getPlacementCategoryListId() {
    return placementCategoryListId;
  }

  public void setPlacementCategoryListId(JsonNullable<Long> placementCategoryListId) {
    this.placementCategoryListId = placementCategoryListId;
  }

  public GuaranteedSimulationServicePermittedPlacementCategoryTarget placementCategoryListName(String placementCategoryListName) {
    this.placementCategoryListName = JsonNullable.of(placementCategoryListName);
    return this;
  }

  /**
   * <div lang=\"ja\">プレイスメントカテゴリリスト名です。</div> <div lang=\"en\">Placement category name.</div> 
   * @return placementCategoryListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">プレイスメントカテゴリリスト名です。</div> <div lang=\"en\">Placement category name.</div> ")


  public JsonNullable<String> getPlacementCategoryListName() {
    return placementCategoryListName;
  }

  public void setPlacementCategoryListName(JsonNullable<String> placementCategoryListName) {
    this.placementCategoryListName = placementCategoryListName;
  }

  public GuaranteedSimulationServicePermittedPlacementCategoryTarget placementCategoryType(GuaranteedSimulationServicePlacementCategoryType placementCategoryType) {
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
    GuaranteedSimulationServicePermittedPlacementCategoryTarget guaranteedSimulationServicePermittedPlacementCategoryTarget = (GuaranteedSimulationServicePermittedPlacementCategoryTarget) o;
    return Objects.equals(this.placementCategoryListId, guaranteedSimulationServicePermittedPlacementCategoryTarget.placementCategoryListId) &&
        Objects.equals(this.placementCategoryListName, guaranteedSimulationServicePermittedPlacementCategoryTarget.placementCategoryListName) &&
        Objects.equals(this.placementCategoryType, guaranteedSimulationServicePermittedPlacementCategoryTarget.placementCategoryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryListId, placementCategoryListName, placementCategoryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedPlacementCategoryTarget {\n");
    
    sb.append("    placementCategoryListId: ").append(toIndentedString(placementCategoryListId)).append("\n");
    sb.append("    placementCategoryListName: ").append(toIndentedString(placementCategoryListName)).append("\n");
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


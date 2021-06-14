package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceFrequencyTimeUnit;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermissionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedViewableFrequencyCap object describes viewable frequency restriction.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedViewableFrequencyCap object describes viewable frequency restriction.</div> ")

public class GuaranteedSimulationServicePackagePermittedViewableFrequencyCap   {
  @JsonProperty("viewableFrequencyCapPermission")
  private JsonNullable<GuaranteedSimulationServicePackagePermissionType> viewableFrequencyCapPermission = JsonNullable.undefined();

  @JsonProperty("viewableFrequencyCapLevels")
  @Valid
  private List<GuaranteedSimulationServiceFrequencyLevel> viewableFrequencyCapLevels = null;

  @JsonProperty("permittedViewableFrequencyCapTimeUnits")
  @Valid
  private List<GuaranteedSimulationServiceFrequencyTimeUnit> permittedViewableFrequencyCapTimeUnits = null;

  @JsonProperty("permittedViewableFrequencyCapImpressionMin")
  private Long permittedViewableFrequencyCapImpressionMin;

  @JsonProperty("permittedViewableFrequencyCapImpressionMax")
  private Long permittedViewableFrequencyCapImpressionMax;

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap viewableFrequencyCapPermission(GuaranteedSimulationServicePackagePermissionType viewableFrequencyCapPermission) {
    this.viewableFrequencyCapPermission = JsonNullable.of(viewableFrequencyCapPermission);
    return this;
  }

  /**
   * Get viewableFrequencyCapPermission
   * @return viewableFrequencyCapPermission
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermissionType> getViewableFrequencyCapPermission() {
    return viewableFrequencyCapPermission;
  }

  public void setViewableFrequencyCapPermission(JsonNullable<GuaranteedSimulationServicePackagePermissionType> viewableFrequencyCapPermission) {
    this.viewableFrequencyCapPermission = viewableFrequencyCapPermission;
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap viewableFrequencyCapLevels(List<GuaranteedSimulationServiceFrequencyLevel> viewableFrequencyCapLevels) {
    this.viewableFrequencyCapLevels = viewableFrequencyCapLevels;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap addViewableFrequencyCapLevelsItem(GuaranteedSimulationServiceFrequencyLevel viewableFrequencyCapLevelsItem) {
    if (this.viewableFrequencyCapLevels == null) {
      this.viewableFrequencyCapLevels = new ArrayList<>();
    }
    this.viewableFrequencyCapLevels.add(viewableFrequencyCapLevelsItem);
    return this;
  }

  /**
   * Get viewableFrequencyCapLevels
   * @return viewableFrequencyCapLevels
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceFrequencyLevel> getViewableFrequencyCapLevels() {
    return viewableFrequencyCapLevels;
  }

  public void setViewableFrequencyCapLevels(List<GuaranteedSimulationServiceFrequencyLevel> viewableFrequencyCapLevels) {
    this.viewableFrequencyCapLevels = viewableFrequencyCapLevels;
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap permittedViewableFrequencyCapTimeUnits(List<GuaranteedSimulationServiceFrequencyTimeUnit> permittedViewableFrequencyCapTimeUnits) {
    this.permittedViewableFrequencyCapTimeUnits = permittedViewableFrequencyCapTimeUnits;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap addPermittedViewableFrequencyCapTimeUnitsItem(GuaranteedSimulationServiceFrequencyTimeUnit permittedViewableFrequencyCapTimeUnitsItem) {
    if (this.permittedViewableFrequencyCapTimeUnits == null) {
      this.permittedViewableFrequencyCapTimeUnits = new ArrayList<>();
    }
    this.permittedViewableFrequencyCapTimeUnits.add(permittedViewableFrequencyCapTimeUnitsItem);
    return this;
  }

  /**
   * Get permittedViewableFrequencyCapTimeUnits
   * @return permittedViewableFrequencyCapTimeUnits
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceFrequencyTimeUnit> getPermittedViewableFrequencyCapTimeUnits() {
    return permittedViewableFrequencyCapTimeUnits;
  }

  public void setPermittedViewableFrequencyCapTimeUnits(List<GuaranteedSimulationServiceFrequencyTimeUnit> permittedViewableFrequencyCapTimeUnits) {
    this.permittedViewableFrequencyCapTimeUnits = permittedViewableFrequencyCapTimeUnits;
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap permittedViewableFrequencyCapImpressionMin(Long permittedViewableFrequencyCapImpressionMin) {
    this.permittedViewableFrequencyCapImpressionMin = permittedViewableFrequencyCapImpressionMin;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルフリークエンシーキャップ表示回数（最小）です。</div> <div lang=\"en\">Display count of viewable frequency cap (minimum).</div> 
   * @return permittedViewableFrequencyCapImpressionMin
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルフリークエンシーキャップ表示回数（最小）です。</div> <div lang=\"en\">Display count of viewable frequency cap (minimum).</div> ")


  public Long getPermittedViewableFrequencyCapImpressionMin() {
    return permittedViewableFrequencyCapImpressionMin;
  }

  public void setPermittedViewableFrequencyCapImpressionMin(Long permittedViewableFrequencyCapImpressionMin) {
    this.permittedViewableFrequencyCapImpressionMin = permittedViewableFrequencyCapImpressionMin;
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap permittedViewableFrequencyCapImpressionMax(Long permittedViewableFrequencyCapImpressionMax) {
    this.permittedViewableFrequencyCapImpressionMax = permittedViewableFrequencyCapImpressionMax;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルフリークエンシーキャップ表示回数（最大）です。</div> <div lang=\"en\">Display count of viewable frequency cap (maximum).</div> 
   * @return permittedViewableFrequencyCapImpressionMax
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルフリークエンシーキャップ表示回数（最大）です。</div> <div lang=\"en\">Display count of viewable frequency cap (maximum).</div> ")


  public Long getPermittedViewableFrequencyCapImpressionMax() {
    return permittedViewableFrequencyCapImpressionMax;
  }

  public void setPermittedViewableFrequencyCapImpressionMax(Long permittedViewableFrequencyCapImpressionMax) {
    this.permittedViewableFrequencyCapImpressionMax = permittedViewableFrequencyCapImpressionMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePackagePermittedViewableFrequencyCap guaranteedSimulationServicePackagePermittedViewableFrequencyCap = (GuaranteedSimulationServicePackagePermittedViewableFrequencyCap) o;
    return Objects.equals(this.viewableFrequencyCapPermission, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.viewableFrequencyCapPermission) &&
        Objects.equals(this.viewableFrequencyCapLevels, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.viewableFrequencyCapLevels) &&
        Objects.equals(this.permittedViewableFrequencyCapTimeUnits, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.permittedViewableFrequencyCapTimeUnits) &&
        Objects.equals(this.permittedViewableFrequencyCapImpressionMin, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.permittedViewableFrequencyCapImpressionMin) &&
        Objects.equals(this.permittedViewableFrequencyCapImpressionMax, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.permittedViewableFrequencyCapImpressionMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewableFrequencyCapPermission, viewableFrequencyCapLevels, permittedViewableFrequencyCapTimeUnits, permittedViewableFrequencyCapImpressionMin, permittedViewableFrequencyCapImpressionMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackagePermittedViewableFrequencyCap {\n");
    
    sb.append("    viewableFrequencyCapPermission: ").append(toIndentedString(viewableFrequencyCapPermission)).append("\n");
    sb.append("    viewableFrequencyCapLevels: ").append(toIndentedString(viewableFrequencyCapLevels)).append("\n");
    sb.append("    permittedViewableFrequencyCapTimeUnits: ").append(toIndentedString(permittedViewableFrequencyCapTimeUnits)).append("\n");
    sb.append("    permittedViewableFrequencyCapImpressionMin: ").append(toIndentedString(permittedViewableFrequencyCapImpressionMin)).append("\n");
    sb.append("    permittedViewableFrequencyCapImpressionMax: ").append(toIndentedString(permittedViewableFrequencyCapImpressionMax)).append("\n");
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


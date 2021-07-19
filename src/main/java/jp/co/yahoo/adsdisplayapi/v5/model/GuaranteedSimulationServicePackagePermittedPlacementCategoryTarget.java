package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermissionType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePermittedPlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePlacementMonopolyFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedPlacementCategoryTargetオブジェクトは、プレイスメントカテゴリターゲット設定の制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget object holds the restriction information about the placement category target setting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedPlacementCategoryTargetオブジェクトは、プレイスメントカテゴリターゲット設定の制限情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget object holds the restriction information about the placement category target setting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget   {
  @JsonProperty("targetPermission")
  private GuaranteedSimulationServicePackagePermissionType targetPermission = null;

  @JsonProperty("permittedTargets")
  @Valid
  private List<GuaranteedSimulationServicePermittedPlacementCategoryTarget> permittedTargets = null;

  @JsonProperty("placementMonopolyFlg")
  private GuaranteedSimulationServicePlacementMonopolyFlg placementMonopolyFlg = null;

  @JsonProperty("placementCategoryDetailMax")
  private Long placementCategoryDetailMax = null;

  public GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget targetPermission(GuaranteedSimulationServicePackagePermissionType targetPermission) {
    this.targetPermission = targetPermission;
    return this;
  }

  /**
   * Get targetPermission
   * @return targetPermission
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermissionType getTargetPermission() {
    return targetPermission;
  }

  public void setTargetPermission(GuaranteedSimulationServicePackagePermissionType targetPermission) {
    this.targetPermission = targetPermission;
  }

  public GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget permittedTargets(List<GuaranteedSimulationServicePermittedPlacementCategoryTarget> permittedTargets) {
    this.permittedTargets = permittedTargets;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget addPermittedTargetsItem(GuaranteedSimulationServicePermittedPlacementCategoryTarget permittedTargetsItem) {
    if (this.permittedTargets == null) {
      this.permittedTargets = new ArrayList<>();
    }
    this.permittedTargets.add(permittedTargetsItem);
    return this;
  }

  /**
   * Get permittedTargets
   * @return permittedTargets
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServicePermittedPlacementCategoryTarget> getPermittedTargets() {
    return permittedTargets;
  }

  public void setPermittedTargets(List<GuaranteedSimulationServicePermittedPlacementCategoryTarget> permittedTargets) {
    this.permittedTargets = permittedTargets;
  }

  public GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget placementMonopolyFlg(GuaranteedSimulationServicePlacementMonopolyFlg placementMonopolyFlg) {
    this.placementMonopolyFlg = placementMonopolyFlg;
    return this;
  }

  /**
   * Get placementMonopolyFlg
   * @return placementMonopolyFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePlacementMonopolyFlg getPlacementMonopolyFlg() {
    return placementMonopolyFlg;
  }

  public void setPlacementMonopolyFlg(GuaranteedSimulationServicePlacementMonopolyFlg placementMonopolyFlg) {
    this.placementMonopolyFlg = placementMonopolyFlg;
  }

  public GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget placementCategoryDetailMax(Long placementCategoryDetailMax) {
    this.placementCategoryDetailMax = placementCategoryDetailMax;
    return this;
  }

  /**
   * <div lang=\"ja\">プレイスメントカテゴリ詳細の最大数です。</div> <div lang=\"en\">The maximum number of placement category details.</div> 
   * @return placementCategoryDetailMax
  */
  @ApiModelProperty(value = "<div lang=\"ja\">プレイスメントカテゴリ詳細の最大数です。</div> <div lang=\"en\">The maximum number of placement category details.</div> ")


  public Long getPlacementCategoryDetailMax() {
    return placementCategoryDetailMax;
  }

  public void setPlacementCategoryDetailMax(Long placementCategoryDetailMax) {
    this.placementCategoryDetailMax = placementCategoryDetailMax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget guaranteedSimulationServicePackagePermittedPlacementCategoryTarget = (GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget) o;
    return Objects.equals(this.targetPermission, guaranteedSimulationServicePackagePermittedPlacementCategoryTarget.targetPermission) &&
        Objects.equals(this.permittedTargets, guaranteedSimulationServicePackagePermittedPlacementCategoryTarget.permittedTargets) &&
        Objects.equals(this.placementMonopolyFlg, guaranteedSimulationServicePackagePermittedPlacementCategoryTarget.placementMonopolyFlg) &&
        Objects.equals(this.placementCategoryDetailMax, guaranteedSimulationServicePackagePermittedPlacementCategoryTarget.placementCategoryDetailMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPermission, permittedTargets, placementMonopolyFlg, placementCategoryDetailMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget {\n");
    
    sb.append("    targetPermission: ").append(toIndentedString(targetPermission)).append("\n");
    sb.append("    permittedTargets: ").append(toIndentedString(permittedTargets)).append("\n");
    sb.append("    placementMonopolyFlg: ").append(toIndentedString(placementMonopolyFlg)).append("\n");
    sb.append("    placementCategoryDetailMax: ").append(toIndentedString(placementCategoryDetailMax)).append("\n");
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

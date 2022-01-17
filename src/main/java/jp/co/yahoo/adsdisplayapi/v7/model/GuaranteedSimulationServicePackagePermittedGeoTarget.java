package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermissionType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePermittedGeoTarget;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedGeoTargetオブジェクトは、地域ターゲット設定の制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedGeoTarget object holds the restriction information about the setting of the geo target.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedGeoTargetオブジェクトは、地域ターゲット設定の制限情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedGeoTarget object holds the restriction information about the setting of the geo target.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePackagePermittedGeoTarget   {
  @JsonProperty("targetPermission")
  private GuaranteedSimulationServicePackagePermissionType targetPermission = null;

  @JsonProperty("permittedTargets")
  @Valid
  private List<GuaranteedSimulationServicePermittedGeoTarget> permittedTargets = null;

  public GuaranteedSimulationServicePackagePermittedGeoTarget targetPermission(GuaranteedSimulationServicePackagePermissionType targetPermission) {
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

  public GuaranteedSimulationServicePackagePermittedGeoTarget permittedTargets(List<GuaranteedSimulationServicePermittedGeoTarget> permittedTargets) {
    this.permittedTargets = permittedTargets;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedGeoTarget addPermittedTargetsItem(GuaranteedSimulationServicePermittedGeoTarget permittedTargetsItem) {
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

  public List<GuaranteedSimulationServicePermittedGeoTarget> getPermittedTargets() {
    return permittedTargets;
  }

  public void setPermittedTargets(List<GuaranteedSimulationServicePermittedGeoTarget> permittedTargets) {
    this.permittedTargets = permittedTargets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePackagePermittedGeoTarget guaranteedSimulationServicePackagePermittedGeoTarget = (GuaranteedSimulationServicePackagePermittedGeoTarget) o;
    return Objects.equals(this.targetPermission, guaranteedSimulationServicePackagePermittedGeoTarget.targetPermission) &&
        Objects.equals(this.permittedTargets, guaranteedSimulationServicePackagePermittedGeoTarget.permittedTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPermission, permittedTargets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackagePermittedGeoTarget {\n");
    
    sb.append("    targetPermission: ").append(toIndentedString(targetPermission)).append("\n");
    sb.append("    permittedTargets: ").append(toIndentedString(permittedTargets)).append("\n");
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


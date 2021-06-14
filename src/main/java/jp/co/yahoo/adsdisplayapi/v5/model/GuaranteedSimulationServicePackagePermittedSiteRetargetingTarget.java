package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermissionType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePermittedSiteRetargetingTarget;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedSiteRetargetingTargetオブジェクトは、サイトリターゲティング設定の制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget object holds limit information about the site retargeting setting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedSiteRetargetingTargetオブジェクトは、サイトリターゲティング設定の制限情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget object holds limit information about the site retargeting setting.</div> ")

public class GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget   {
  @JsonProperty("targetPermission")
  private JsonNullable<GuaranteedSimulationServicePackagePermissionType> targetPermission = JsonNullable.undefined();

  @JsonProperty("permittedTargets")
  @Valid
  private List<GuaranteedSimulationServicePermittedSiteRetargetingTarget> permittedTargets = null;

  public GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget targetPermission(GuaranteedSimulationServicePackagePermissionType targetPermission) {
    this.targetPermission = JsonNullable.of(targetPermission);
    return this;
  }

  /**
   * Get targetPermission
   * @return targetPermission
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermissionType> getTargetPermission() {
    return targetPermission;
  }

  public void setTargetPermission(JsonNullable<GuaranteedSimulationServicePackagePermissionType> targetPermission) {
    this.targetPermission = targetPermission;
  }

  public GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget permittedTargets(List<GuaranteedSimulationServicePermittedSiteRetargetingTarget> permittedTargets) {
    this.permittedTargets = permittedTargets;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget addPermittedTargetsItem(GuaranteedSimulationServicePermittedSiteRetargetingTarget permittedTargetsItem) {
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

  public List<GuaranteedSimulationServicePermittedSiteRetargetingTarget> getPermittedTargets() {
    return permittedTargets;
  }

  public void setPermittedTargets(List<GuaranteedSimulationServicePermittedSiteRetargetingTarget> permittedTargets) {
    this.permittedTargets = permittedTargets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget guaranteedSimulationServicePackagePermittedSiteRetargetingTarget = (GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget) o;
    return Objects.equals(this.targetPermission, guaranteedSimulationServicePackagePermittedSiteRetargetingTarget.targetPermission) &&
        Objects.equals(this.permittedTargets, guaranteedSimulationServicePackagePermittedSiteRetargetingTarget.permittedTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPermission, permittedTargets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget {\n");
    
    sb.append("    targetPermission: ").append(toIndentedString(targetPermission)).append("\n");
    sb.append("    permittedTargets: ").append(toIndentedString(permittedTargets)).append("\n");
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


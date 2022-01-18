package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermissionType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePermittedAudienceListTarget;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedAudienceListTargetオブジェクトは、オーディエンスリストターゲティング設定の制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedAudienceListTarget object holds limit information about the audience list targeting setting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedAudienceListTargetオブジェクトは、オーディエンスリストターゲティング設定の制限情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedAudienceListTarget object holds limit information about the audience list targeting setting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePackagePermittedAudienceListTarget   {
  @JsonProperty("targetPermission")
  private GuaranteedSimulationServicePackagePermissionType targetPermission = null;

  @JsonProperty("permittedTargets")
  @Valid
  private List<GuaranteedSimulationServicePermittedAudienceListTarget> permittedTargets = null;

  public GuaranteedSimulationServicePackagePermittedAudienceListTarget targetPermission(GuaranteedSimulationServicePackagePermissionType targetPermission) {
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

  public GuaranteedSimulationServicePackagePermittedAudienceListTarget permittedTargets(List<GuaranteedSimulationServicePermittedAudienceListTarget> permittedTargets) {
    this.permittedTargets = permittedTargets;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedAudienceListTarget addPermittedTargetsItem(GuaranteedSimulationServicePermittedAudienceListTarget permittedTargetsItem) {
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

  public List<GuaranteedSimulationServicePermittedAudienceListTarget> getPermittedTargets() {
    return permittedTargets;
  }

  public void setPermittedTargets(List<GuaranteedSimulationServicePermittedAudienceListTarget> permittedTargets) {
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
    GuaranteedSimulationServicePackagePermittedAudienceListTarget guaranteedSimulationServicePackagePermittedAudienceListTarget = (GuaranteedSimulationServicePackagePermittedAudienceListTarget) o;
    return Objects.equals(this.targetPermission, guaranteedSimulationServicePackagePermittedAudienceListTarget.targetPermission) &&
        Objects.equals(this.permittedTargets, guaranteedSimulationServicePackagePermittedAudienceListTarget.permittedTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPermission, permittedTargets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackagePermittedAudienceListTarget {\n");
    
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


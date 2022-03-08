/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermissionType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePermittedOsTarget;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedOsTargetオブジェクトは、OSターゲット設定の制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedOsTarget object holds the restriction information about the OS target setting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedOsTargetオブジェクトは、OSターゲット設定の制限情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedOsTarget object holds the restriction information about the OS target setting.</div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePackagePermittedOsTarget.JSON_PROPERTY_TARGET_PERMISSION,
  GuaranteedSimulationServicePackagePermittedOsTarget.JSON_PROPERTY_PERMITTED_TARGETS
})
@JsonTypeName("GuaranteedSimulationServicePackagePermittedOsTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePackagePermittedOsTarget {
  public static final String JSON_PROPERTY_TARGET_PERMISSION = "targetPermission";
  private GuaranteedSimulationServicePackagePermissionType targetPermission;

  public static final String JSON_PROPERTY_PERMITTED_TARGETS = "permittedTargets";
  private List<GuaranteedSimulationServicePermittedOsTarget> permittedTargets = null;

  public GuaranteedSimulationServicePackagePermittedOsTarget() { 
  }

  public GuaranteedSimulationServicePackagePermittedOsTarget targetPermission(GuaranteedSimulationServicePackagePermissionType targetPermission) {
    
    this.targetPermission = targetPermission;
    return this;
  }

   /**
   * Get targetPermission
   * @return targetPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServicePackagePermissionType getTargetPermission() {
    return targetPermission;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPermission(GuaranteedSimulationServicePackagePermissionType targetPermission) {
    this.targetPermission = targetPermission;
  }


  public GuaranteedSimulationServicePackagePermittedOsTarget permittedTargets(List<GuaranteedSimulationServicePermittedOsTarget> permittedTargets) {
    
    this.permittedTargets = permittedTargets;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedOsTarget addPermittedTargetsItem(GuaranteedSimulationServicePermittedOsTarget permittedTargetsItem) {
    if (this.permittedTargets == null) {
      this.permittedTargets = new ArrayList<>();
    }
    this.permittedTargets.add(permittedTargetsItem);
    return this;
  }

   /**
   * Get permittedTargets
   * @return permittedTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMITTED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedSimulationServicePermittedOsTarget> getPermittedTargets() {
    return permittedTargets;
  }


  @JsonProperty(JSON_PROPERTY_PERMITTED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermittedTargets(List<GuaranteedSimulationServicePermittedOsTarget> permittedTargets) {
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
    GuaranteedSimulationServicePackagePermittedOsTarget guaranteedSimulationServicePackagePermittedOsTarget = (GuaranteedSimulationServicePackagePermittedOsTarget) o;
    return Objects.equals(this.targetPermission, guaranteedSimulationServicePackagePermittedOsTarget.targetPermission) &&
        Objects.equals(this.permittedTargets, guaranteedSimulationServicePackagePermittedOsTarget.permittedTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPermission, permittedTargets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackagePermittedOsTarget {\n");
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


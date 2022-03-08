/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

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
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermissionType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePermittedGeoTarget;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedGeoTargetオブジェクトは、地域ターゲット設定の制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedGeoTarget object holds the restriction information about the setting of the geo target.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedGeoTargetオブジェクトは、地域ターゲット設定の制限情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedGeoTarget object holds the restriction information about the setting of the geo target.</div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePackagePermittedGeoTarget.JSON_PROPERTY_TARGET_PERMISSION,
  GuaranteedSimulationServicePackagePermittedGeoTarget.JSON_PROPERTY_PERMITTED_TARGETS
})
@JsonTypeName("GuaranteedSimulationServicePackagePermittedGeoTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePackagePermittedGeoTarget {
  public static final String JSON_PROPERTY_TARGET_PERMISSION = "targetPermission";
  private GuaranteedSimulationServicePackagePermissionType targetPermission;

  public static final String JSON_PROPERTY_PERMITTED_TARGETS = "permittedTargets";
  private List<GuaranteedSimulationServicePermittedGeoTarget> permittedTargets = null;

  public GuaranteedSimulationServicePackagePermittedGeoTarget() { 
  }

  public GuaranteedSimulationServicePackagePermittedGeoTarget targetPermission(GuaranteedSimulationServicePackagePermissionType targetPermission) {
    
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMITTED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedSimulationServicePermittedGeoTarget> getPermittedTargets() {
    return permittedTargets;
  }


  @JsonProperty(JSON_PROPERTY_PERMITTED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAgeTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAppTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAudienceCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceGenderTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceGeoTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceOsTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePlacementCategoryDetailTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePositionTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceSiteRetargetingTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceTargetType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceTargetオブジェクトは、ターゲティング設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceTarget object holds information of the target setting.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceTargetオブジェクトは、ターゲティング設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedSimulationServiceTarget object holds information of the target setting.<br> This field is optional in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceTarget   {
  @JsonProperty("adScheduleTarget")
  private GuaranteedSimulationServiceAdScheduleTarget adScheduleTarget = null;

  @JsonProperty("ageTarget")
  private GuaranteedSimulationServiceAgeTarget ageTarget = null;

  @JsonProperty("appTarget")
  private GuaranteedSimulationServiceAppTarget appTarget = null;

  @JsonProperty("audienceCategoryTarget")
  private GuaranteedSimulationServiceAudienceCategoryTarget audienceCategoryTarget = null;

  @JsonProperty("deviceTarget")
  private GuaranteedSimulationServiceDeviceTarget deviceTarget = null;

  @JsonProperty("genderTarget")
  private GuaranteedSimulationServiceGenderTarget genderTarget = null;

  @JsonProperty("geoTarget")
  private GuaranteedSimulationServiceGeoTarget geoTarget = null;

  @JsonProperty("osTarget")
  private GuaranteedSimulationServiceOsTarget osTarget = null;

  @JsonProperty("placementCategoryTarget")
  private GuaranteedSimulationServicePlacementCategoryTarget placementCategoryTarget = null;

  @JsonProperty("placementCategoryDetailTarget")
  private GuaranteedSimulationServicePlacementCategoryDetailTarget placementCategoryDetailTarget = null;

  @JsonProperty("positionTarget")
  private GuaranteedSimulationServicePositionTarget positionTarget = null;

  @JsonProperty("siteRetargetingTarget")
  private GuaranteedSimulationServiceSiteRetargetingTarget siteRetargetingTarget = null;

  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("targetType")
  private GuaranteedSimulationServiceTargetType targetType = null;

  public GuaranteedSimulationServiceTarget adScheduleTarget(GuaranteedSimulationServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
    return this;
  }

  /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAdScheduleTarget getAdScheduleTarget() {
    return adScheduleTarget;
  }

  public void setAdScheduleTarget(GuaranteedSimulationServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
  }

  public GuaranteedSimulationServiceTarget ageTarget(GuaranteedSimulationServiceAgeTarget ageTarget) {
    this.ageTarget = ageTarget;
    return this;
  }

  /**
   * Get ageTarget
   * @return ageTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAgeTarget getAgeTarget() {
    return ageTarget;
  }

  public void setAgeTarget(GuaranteedSimulationServiceAgeTarget ageTarget) {
    this.ageTarget = ageTarget;
  }

  public GuaranteedSimulationServiceTarget appTarget(GuaranteedSimulationServiceAppTarget appTarget) {
    this.appTarget = appTarget;
    return this;
  }

  /**
   * Get appTarget
   * @return appTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAppTarget getAppTarget() {
    return appTarget;
  }

  public void setAppTarget(GuaranteedSimulationServiceAppTarget appTarget) {
    this.appTarget = appTarget;
  }

  public GuaranteedSimulationServiceTarget audienceCategoryTarget(GuaranteedSimulationServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
    return this;
  }

  /**
   * Get audienceCategoryTarget
   * @return audienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAudienceCategoryTarget getAudienceCategoryTarget() {
    return audienceCategoryTarget;
  }

  public void setAudienceCategoryTarget(GuaranteedSimulationServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
  }

  public GuaranteedSimulationServiceTarget deviceTarget(GuaranteedSimulationServiceDeviceTarget deviceTarget) {
    this.deviceTarget = deviceTarget;
    return this;
  }

  /**
   * Get deviceTarget
   * @return deviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceDeviceTarget getDeviceTarget() {
    return deviceTarget;
  }

  public void setDeviceTarget(GuaranteedSimulationServiceDeviceTarget deviceTarget) {
    this.deviceTarget = deviceTarget;
  }

  public GuaranteedSimulationServiceTarget genderTarget(GuaranteedSimulationServiceGenderTarget genderTarget) {
    this.genderTarget = genderTarget;
    return this;
  }

  /**
   * Get genderTarget
   * @return genderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceGenderTarget getGenderTarget() {
    return genderTarget;
  }

  public void setGenderTarget(GuaranteedSimulationServiceGenderTarget genderTarget) {
    this.genderTarget = genderTarget;
  }

  public GuaranteedSimulationServiceTarget geoTarget(GuaranteedSimulationServiceGeoTarget geoTarget) {
    this.geoTarget = geoTarget;
    return this;
  }

  /**
   * Get geoTarget
   * @return geoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceGeoTarget getGeoTarget() {
    return geoTarget;
  }

  public void setGeoTarget(GuaranteedSimulationServiceGeoTarget geoTarget) {
    this.geoTarget = geoTarget;
  }

  public GuaranteedSimulationServiceTarget osTarget(GuaranteedSimulationServiceOsTarget osTarget) {
    this.osTarget = osTarget;
    return this;
  }

  /**
   * Get osTarget
   * @return osTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceOsTarget getOsTarget() {
    return osTarget;
  }

  public void setOsTarget(GuaranteedSimulationServiceOsTarget osTarget) {
    this.osTarget = osTarget;
  }

  public GuaranteedSimulationServiceTarget placementCategoryTarget(GuaranteedSimulationServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
    return this;
  }

  /**
   * Get placementCategoryTarget
   * @return placementCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePlacementCategoryTarget getPlacementCategoryTarget() {
    return placementCategoryTarget;
  }

  public void setPlacementCategoryTarget(GuaranteedSimulationServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
  }

  public GuaranteedSimulationServiceTarget placementCategoryDetailTarget(GuaranteedSimulationServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
    return this;
  }

  /**
   * Get placementCategoryDetailTarget
   * @return placementCategoryDetailTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePlacementCategoryDetailTarget getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }

  public void setPlacementCategoryDetailTarget(GuaranteedSimulationServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
  }

  public GuaranteedSimulationServiceTarget positionTarget(GuaranteedSimulationServicePositionTarget positionTarget) {
    this.positionTarget = positionTarget;
    return this;
  }

  /**
   * Get positionTarget
   * @return positionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePositionTarget getPositionTarget() {
    return positionTarget;
  }

  public void setPositionTarget(GuaranteedSimulationServicePositionTarget positionTarget) {
    this.positionTarget = positionTarget;
  }

  public GuaranteedSimulationServiceTarget siteRetargetingTarget(GuaranteedSimulationServiceSiteRetargetingTarget siteRetargetingTarget) {
    this.siteRetargetingTarget = siteRetargetingTarget;
    return this;
  }

  /**
   * Get siteRetargetingTarget
   * @return siteRetargetingTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceSiteRetargetingTarget getSiteRetargetingTarget() {
    return siteRetargetingTarget;
  }

  public void setSiteRetargetingTarget(GuaranteedSimulationServiceSiteRetargetingTarget siteRetargetingTarget) {
    this.siteRetargetingTarget = siteRetargetingTarget;
  }

  public GuaranteedSimulationServiceTarget targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADD時は省略可能となります。 </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD operation. </div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADD時は省略可能となります。 </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD operation. </div> ")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServiceTarget targetType(GuaranteedSimulationServiceTargetType targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   * @return targetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(GuaranteedSimulationServiceTargetType targetType) {
    this.targetType = targetType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceTarget guaranteedSimulationServiceTarget = (GuaranteedSimulationServiceTarget) o;
    return Objects.equals(this.adScheduleTarget, guaranteedSimulationServiceTarget.adScheduleTarget) &&
        Objects.equals(this.ageTarget, guaranteedSimulationServiceTarget.ageTarget) &&
        Objects.equals(this.appTarget, guaranteedSimulationServiceTarget.appTarget) &&
        Objects.equals(this.audienceCategoryTarget, guaranteedSimulationServiceTarget.audienceCategoryTarget) &&
        Objects.equals(this.deviceTarget, guaranteedSimulationServiceTarget.deviceTarget) &&
        Objects.equals(this.genderTarget, guaranteedSimulationServiceTarget.genderTarget) &&
        Objects.equals(this.geoTarget, guaranteedSimulationServiceTarget.geoTarget) &&
        Objects.equals(this.osTarget, guaranteedSimulationServiceTarget.osTarget) &&
        Objects.equals(this.placementCategoryTarget, guaranteedSimulationServiceTarget.placementCategoryTarget) &&
        Objects.equals(this.placementCategoryDetailTarget, guaranteedSimulationServiceTarget.placementCategoryDetailTarget) &&
        Objects.equals(this.positionTarget, guaranteedSimulationServiceTarget.positionTarget) &&
        Objects.equals(this.siteRetargetingTarget, guaranteedSimulationServiceTarget.siteRetargetingTarget) &&
        Objects.equals(this.targetId, guaranteedSimulationServiceTarget.targetId) &&
        Objects.equals(this.targetType, guaranteedSimulationServiceTarget.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adScheduleTarget, ageTarget, appTarget, audienceCategoryTarget, deviceTarget, genderTarget, geoTarget, osTarget, placementCategoryTarget, placementCategoryDetailTarget, positionTarget, siteRetargetingTarget, targetId, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceTarget {\n");
    
    sb.append("    adScheduleTarget: ").append(toIndentedString(adScheduleTarget)).append("\n");
    sb.append("    ageTarget: ").append(toIndentedString(ageTarget)).append("\n");
    sb.append("    appTarget: ").append(toIndentedString(appTarget)).append("\n");
    sb.append("    audienceCategoryTarget: ").append(toIndentedString(audienceCategoryTarget)).append("\n");
    sb.append("    deviceTarget: ").append(toIndentedString(deviceTarget)).append("\n");
    sb.append("    genderTarget: ").append(toIndentedString(genderTarget)).append("\n");
    sb.append("    geoTarget: ").append(toIndentedString(geoTarget)).append("\n");
    sb.append("    osTarget: ").append(toIndentedString(osTarget)).append("\n");
    sb.append("    placementCategoryTarget: ").append(toIndentedString(placementCategoryTarget)).append("\n");
    sb.append("    placementCategoryDetailTarget: ").append(toIndentedString(placementCategoryDetailTarget)).append("\n");
    sb.append("    positionTarget: ").append(toIndentedString(positionTarget)).append("\n");
    sb.append("    siteRetargetingTarget: ").append(toIndentedString(siteRetargetingTarget)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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


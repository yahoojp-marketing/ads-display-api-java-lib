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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceTargetオブジェクトは、ターゲティング設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceTarget object holds information of the target setting.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceTargetオブジェクトは、ターゲティング設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedSimulationServiceTarget object holds information of the target setting.<br> This field is optional in ADD operation. </div> ")

public class GuaranteedSimulationServiceTarget   {
  @JsonProperty("adScheduleTarget")
  private JsonNullable<GuaranteedSimulationServiceAdScheduleTarget> adScheduleTarget = JsonNullable.undefined();

  @JsonProperty("ageTarget")
  private JsonNullable<GuaranteedSimulationServiceAgeTarget> ageTarget = JsonNullable.undefined();

  @JsonProperty("appTarget")
  private JsonNullable<GuaranteedSimulationServiceAppTarget> appTarget = JsonNullable.undefined();

  @JsonProperty("audienceCategoryTarget")
  private JsonNullable<GuaranteedSimulationServiceAudienceCategoryTarget> audienceCategoryTarget = JsonNullable.undefined();

  @JsonProperty("deviceTarget")
  private JsonNullable<GuaranteedSimulationServiceDeviceTarget> deviceTarget = JsonNullable.undefined();

  @JsonProperty("genderTarget")
  private JsonNullable<GuaranteedSimulationServiceGenderTarget> genderTarget = JsonNullable.undefined();

  @JsonProperty("geoTarget")
  private JsonNullable<GuaranteedSimulationServiceGeoTarget> geoTarget = JsonNullable.undefined();

  @JsonProperty("osTarget")
  private JsonNullable<GuaranteedSimulationServiceOsTarget> osTarget = JsonNullable.undefined();

  @JsonProperty("placementCategoryTarget")
  private JsonNullable<GuaranteedSimulationServicePlacementCategoryTarget> placementCategoryTarget = JsonNullable.undefined();

  @JsonProperty("placementCategoryDetailTarget")
  private JsonNullable<GuaranteedSimulationServicePlacementCategoryDetailTarget> placementCategoryDetailTarget = JsonNullable.undefined();

  @JsonProperty("positionTarget")
  private JsonNullable<GuaranteedSimulationServicePositionTarget> positionTarget = JsonNullable.undefined();

  @JsonProperty("siteRetargetingTarget")
  private JsonNullable<GuaranteedSimulationServiceSiteRetargetingTarget> siteRetargetingTarget = JsonNullable.undefined();

  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("targetType")
  private JsonNullable<GuaranteedSimulationServiceTargetType> targetType = JsonNullable.undefined();

  public GuaranteedSimulationServiceTarget adScheduleTarget(GuaranteedSimulationServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = JsonNullable.of(adScheduleTarget);
    return this;
  }

  /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceAdScheduleTarget> getAdScheduleTarget() {
    return adScheduleTarget;
  }

  public void setAdScheduleTarget(JsonNullable<GuaranteedSimulationServiceAdScheduleTarget> adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
  }

  public GuaranteedSimulationServiceTarget ageTarget(GuaranteedSimulationServiceAgeTarget ageTarget) {
    this.ageTarget = JsonNullable.of(ageTarget);
    return this;
  }

  /**
   * Get ageTarget
   * @return ageTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceAgeTarget> getAgeTarget() {
    return ageTarget;
  }

  public void setAgeTarget(JsonNullable<GuaranteedSimulationServiceAgeTarget> ageTarget) {
    this.ageTarget = ageTarget;
  }

  public GuaranteedSimulationServiceTarget appTarget(GuaranteedSimulationServiceAppTarget appTarget) {
    this.appTarget = JsonNullable.of(appTarget);
    return this;
  }

  /**
   * Get appTarget
   * @return appTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceAppTarget> getAppTarget() {
    return appTarget;
  }

  public void setAppTarget(JsonNullable<GuaranteedSimulationServiceAppTarget> appTarget) {
    this.appTarget = appTarget;
  }

  public GuaranteedSimulationServiceTarget audienceCategoryTarget(GuaranteedSimulationServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = JsonNullable.of(audienceCategoryTarget);
    return this;
  }

  /**
   * Get audienceCategoryTarget
   * @return audienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceAudienceCategoryTarget> getAudienceCategoryTarget() {
    return audienceCategoryTarget;
  }

  public void setAudienceCategoryTarget(JsonNullable<GuaranteedSimulationServiceAudienceCategoryTarget> audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
  }

  public GuaranteedSimulationServiceTarget deviceTarget(GuaranteedSimulationServiceDeviceTarget deviceTarget) {
    this.deviceTarget = JsonNullable.of(deviceTarget);
    return this;
  }

  /**
   * Get deviceTarget
   * @return deviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceDeviceTarget> getDeviceTarget() {
    return deviceTarget;
  }

  public void setDeviceTarget(JsonNullable<GuaranteedSimulationServiceDeviceTarget> deviceTarget) {
    this.deviceTarget = deviceTarget;
  }

  public GuaranteedSimulationServiceTarget genderTarget(GuaranteedSimulationServiceGenderTarget genderTarget) {
    this.genderTarget = JsonNullable.of(genderTarget);
    return this;
  }

  /**
   * Get genderTarget
   * @return genderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceGenderTarget> getGenderTarget() {
    return genderTarget;
  }

  public void setGenderTarget(JsonNullable<GuaranteedSimulationServiceGenderTarget> genderTarget) {
    this.genderTarget = genderTarget;
  }

  public GuaranteedSimulationServiceTarget geoTarget(GuaranteedSimulationServiceGeoTarget geoTarget) {
    this.geoTarget = JsonNullable.of(geoTarget);
    return this;
  }

  /**
   * Get geoTarget
   * @return geoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceGeoTarget> getGeoTarget() {
    return geoTarget;
  }

  public void setGeoTarget(JsonNullable<GuaranteedSimulationServiceGeoTarget> geoTarget) {
    this.geoTarget = geoTarget;
  }

  public GuaranteedSimulationServiceTarget osTarget(GuaranteedSimulationServiceOsTarget osTarget) {
    this.osTarget = JsonNullable.of(osTarget);
    return this;
  }

  /**
   * Get osTarget
   * @return osTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceOsTarget> getOsTarget() {
    return osTarget;
  }

  public void setOsTarget(JsonNullable<GuaranteedSimulationServiceOsTarget> osTarget) {
    this.osTarget = osTarget;
  }

  public GuaranteedSimulationServiceTarget placementCategoryTarget(GuaranteedSimulationServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = JsonNullable.of(placementCategoryTarget);
    return this;
  }

  /**
   * Get placementCategoryTarget
   * @return placementCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePlacementCategoryTarget> getPlacementCategoryTarget() {
    return placementCategoryTarget;
  }

  public void setPlacementCategoryTarget(JsonNullable<GuaranteedSimulationServicePlacementCategoryTarget> placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
  }

  public GuaranteedSimulationServiceTarget placementCategoryDetailTarget(GuaranteedSimulationServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = JsonNullable.of(placementCategoryDetailTarget);
    return this;
  }

  /**
   * Get placementCategoryDetailTarget
   * @return placementCategoryDetailTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePlacementCategoryDetailTarget> getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }

  public void setPlacementCategoryDetailTarget(JsonNullable<GuaranteedSimulationServicePlacementCategoryDetailTarget> placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
  }

  public GuaranteedSimulationServiceTarget positionTarget(GuaranteedSimulationServicePositionTarget positionTarget) {
    this.positionTarget = JsonNullable.of(positionTarget);
    return this;
  }

  /**
   * Get positionTarget
   * @return positionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePositionTarget> getPositionTarget() {
    return positionTarget;
  }

  public void setPositionTarget(JsonNullable<GuaranteedSimulationServicePositionTarget> positionTarget) {
    this.positionTarget = positionTarget;
  }

  public GuaranteedSimulationServiceTarget siteRetargetingTarget(GuaranteedSimulationServiceSiteRetargetingTarget siteRetargetingTarget) {
    this.siteRetargetingTarget = JsonNullable.of(siteRetargetingTarget);
    return this;
  }

  /**
   * Get siteRetargetingTarget
   * @return siteRetargetingTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceSiteRetargetingTarget> getSiteRetargetingTarget() {
    return siteRetargetingTarget;
  }

  public void setSiteRetargetingTarget(JsonNullable<GuaranteedSimulationServiceSiteRetargetingTarget> siteRetargetingTarget) {
    this.siteRetargetingTarget = siteRetargetingTarget;
  }

  public GuaranteedSimulationServiceTarget targetId(String targetId) {
    this.targetId = JsonNullable.of(targetId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADD時は省略可能となります。 </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD operation. </div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADD時は省略可能となります。 </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD operation. </div> ")


  public JsonNullable<String> getTargetId() {
    return targetId;
  }

  public void setTargetId(JsonNullable<String> targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServiceTarget targetType(GuaranteedSimulationServiceTargetType targetType) {
    this.targetType = JsonNullable.of(targetType);
    return this;
  }

  /**
   * Get targetType
   * @return targetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceTargetType> getTargetType() {
    return targetType;
  }

  public void setTargetType(JsonNullable<GuaranteedSimulationServiceTargetType> targetType) {
    this.targetType = targetType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


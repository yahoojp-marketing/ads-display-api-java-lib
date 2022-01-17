package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceAgeTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceAppTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceAudienceCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceAudienceListTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceGenderTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceGeoTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceOsTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServicePlacementCategoryDetailTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServicePlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServicePositionTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceTargetType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceTargetオブジェクトは、ターゲティング設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceTarget object holds information of the target setting.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceTargetオブジェクトは、ターゲティング設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedInventoryServiceTarget object holds information of the target setting.<br> This field is optional in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceTarget   {
  @JsonProperty("adScheduleTarget")
  private GuaranteedInventoryServiceAdScheduleTarget adScheduleTarget = null;

  @JsonProperty("ageTarget")
  private GuaranteedInventoryServiceAgeTarget ageTarget = null;

  @JsonProperty("appTarget")
  private GuaranteedInventoryServiceAppTarget appTarget = null;

  @JsonProperty("audienceCategoryTarget")
  private GuaranteedInventoryServiceAudienceCategoryTarget audienceCategoryTarget = null;

  @JsonProperty("deviceTarget")
  private GuaranteedInventoryServiceDeviceTarget deviceTarget = null;

  @JsonProperty("genderTarget")
  private GuaranteedInventoryServiceGenderTarget genderTarget = null;

  @JsonProperty("geoTarget")
  private GuaranteedInventoryServiceGeoTarget geoTarget = null;

  @JsonProperty("osTarget")
  private GuaranteedInventoryServiceOsTarget osTarget = null;

  @JsonProperty("placementCategoryTarget")
  private GuaranteedInventoryServicePlacementCategoryTarget placementCategoryTarget = null;

  @JsonProperty("placementCategoryDetailTarget")
  private GuaranteedInventoryServicePlacementCategoryDetailTarget placementCategoryDetailTarget = null;

  @JsonProperty("positionTarget")
  private GuaranteedInventoryServicePositionTarget positionTarget = null;

  @JsonProperty("audienceListTarget")
  private GuaranteedInventoryServiceAudienceListTarget audienceListTarget = null;

  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("targetType")
  private GuaranteedInventoryServiceTargetType targetType = null;

  public GuaranteedInventoryServiceTarget adScheduleTarget(GuaranteedInventoryServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
    return this;
  }

  /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceAdScheduleTarget getAdScheduleTarget() {
    return adScheduleTarget;
  }

  public void setAdScheduleTarget(GuaranteedInventoryServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
  }

  public GuaranteedInventoryServiceTarget ageTarget(GuaranteedInventoryServiceAgeTarget ageTarget) {
    this.ageTarget = ageTarget;
    return this;
  }

  /**
   * Get ageTarget
   * @return ageTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceAgeTarget getAgeTarget() {
    return ageTarget;
  }

  public void setAgeTarget(GuaranteedInventoryServiceAgeTarget ageTarget) {
    this.ageTarget = ageTarget;
  }

  public GuaranteedInventoryServiceTarget appTarget(GuaranteedInventoryServiceAppTarget appTarget) {
    this.appTarget = appTarget;
    return this;
  }

  /**
   * Get appTarget
   * @return appTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceAppTarget getAppTarget() {
    return appTarget;
  }

  public void setAppTarget(GuaranteedInventoryServiceAppTarget appTarget) {
    this.appTarget = appTarget;
  }

  public GuaranteedInventoryServiceTarget audienceCategoryTarget(GuaranteedInventoryServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
    return this;
  }

  /**
   * Get audienceCategoryTarget
   * @return audienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceAudienceCategoryTarget getAudienceCategoryTarget() {
    return audienceCategoryTarget;
  }

  public void setAudienceCategoryTarget(GuaranteedInventoryServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
  }

  public GuaranteedInventoryServiceTarget deviceTarget(GuaranteedInventoryServiceDeviceTarget deviceTarget) {
    this.deviceTarget = deviceTarget;
    return this;
  }

  /**
   * Get deviceTarget
   * @return deviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceDeviceTarget getDeviceTarget() {
    return deviceTarget;
  }

  public void setDeviceTarget(GuaranteedInventoryServiceDeviceTarget deviceTarget) {
    this.deviceTarget = deviceTarget;
  }

  public GuaranteedInventoryServiceTarget genderTarget(GuaranteedInventoryServiceGenderTarget genderTarget) {
    this.genderTarget = genderTarget;
    return this;
  }

  /**
   * Get genderTarget
   * @return genderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceGenderTarget getGenderTarget() {
    return genderTarget;
  }

  public void setGenderTarget(GuaranteedInventoryServiceGenderTarget genderTarget) {
    this.genderTarget = genderTarget;
  }

  public GuaranteedInventoryServiceTarget geoTarget(GuaranteedInventoryServiceGeoTarget geoTarget) {
    this.geoTarget = geoTarget;
    return this;
  }

  /**
   * Get geoTarget
   * @return geoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceGeoTarget getGeoTarget() {
    return geoTarget;
  }

  public void setGeoTarget(GuaranteedInventoryServiceGeoTarget geoTarget) {
    this.geoTarget = geoTarget;
  }

  public GuaranteedInventoryServiceTarget osTarget(GuaranteedInventoryServiceOsTarget osTarget) {
    this.osTarget = osTarget;
    return this;
  }

  /**
   * Get osTarget
   * @return osTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceOsTarget getOsTarget() {
    return osTarget;
  }

  public void setOsTarget(GuaranteedInventoryServiceOsTarget osTarget) {
    this.osTarget = osTarget;
  }

  public GuaranteedInventoryServiceTarget placementCategoryTarget(GuaranteedInventoryServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
    return this;
  }

  /**
   * Get placementCategoryTarget
   * @return placementCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServicePlacementCategoryTarget getPlacementCategoryTarget() {
    return placementCategoryTarget;
  }

  public void setPlacementCategoryTarget(GuaranteedInventoryServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
  }

  public GuaranteedInventoryServiceTarget placementCategoryDetailTarget(GuaranteedInventoryServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
    return this;
  }

  /**
   * Get placementCategoryDetailTarget
   * @return placementCategoryDetailTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServicePlacementCategoryDetailTarget getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }

  public void setPlacementCategoryDetailTarget(GuaranteedInventoryServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
  }

  public GuaranteedInventoryServiceTarget positionTarget(GuaranteedInventoryServicePositionTarget positionTarget) {
    this.positionTarget = positionTarget;
    return this;
  }

  /**
   * Get positionTarget
   * @return positionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServicePositionTarget getPositionTarget() {
    return positionTarget;
  }

  public void setPositionTarget(GuaranteedInventoryServicePositionTarget positionTarget) {
    this.positionTarget = positionTarget;
  }

  public GuaranteedInventoryServiceTarget audienceListTarget(GuaranteedInventoryServiceAudienceListTarget audienceListTarget) {
    this.audienceListTarget = audienceListTarget;
    return this;
  }

  /**
   * Get audienceListTarget
   * @return audienceListTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceAudienceListTarget getAudienceListTarget() {
    return audienceListTarget;
  }

  public void setAudienceListTarget(GuaranteedInventoryServiceAudienceListTarget audienceListTarget) {
    this.audienceListTarget = audienceListTarget;
  }

  public GuaranteedInventoryServiceTarget targetId(String targetId) {
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

  public GuaranteedInventoryServiceTarget targetType(GuaranteedInventoryServiceTargetType targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   * @return targetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(GuaranteedInventoryServiceTargetType targetType) {
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
    GuaranteedInventoryServiceTarget guaranteedInventoryServiceTarget = (GuaranteedInventoryServiceTarget) o;
    return Objects.equals(this.adScheduleTarget, guaranteedInventoryServiceTarget.adScheduleTarget) &&
        Objects.equals(this.ageTarget, guaranteedInventoryServiceTarget.ageTarget) &&
        Objects.equals(this.appTarget, guaranteedInventoryServiceTarget.appTarget) &&
        Objects.equals(this.audienceCategoryTarget, guaranteedInventoryServiceTarget.audienceCategoryTarget) &&
        Objects.equals(this.deviceTarget, guaranteedInventoryServiceTarget.deviceTarget) &&
        Objects.equals(this.genderTarget, guaranteedInventoryServiceTarget.genderTarget) &&
        Objects.equals(this.geoTarget, guaranteedInventoryServiceTarget.geoTarget) &&
        Objects.equals(this.osTarget, guaranteedInventoryServiceTarget.osTarget) &&
        Objects.equals(this.placementCategoryTarget, guaranteedInventoryServiceTarget.placementCategoryTarget) &&
        Objects.equals(this.placementCategoryDetailTarget, guaranteedInventoryServiceTarget.placementCategoryDetailTarget) &&
        Objects.equals(this.positionTarget, guaranteedInventoryServiceTarget.positionTarget) &&
        Objects.equals(this.audienceListTarget, guaranteedInventoryServiceTarget.audienceListTarget) &&
        Objects.equals(this.targetId, guaranteedInventoryServiceTarget.targetId) &&
        Objects.equals(this.targetType, guaranteedInventoryServiceTarget.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adScheduleTarget, ageTarget, appTarget, audienceCategoryTarget, deviceTarget, genderTarget, geoTarget, osTarget, placementCategoryTarget, placementCategoryDetailTarget, positionTarget, audienceListTarget, targetId, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceTarget {\n");
    
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
    sb.append("    audienceListTarget: ").append(toIndentedString(audienceListTarget)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceAgeTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceAppTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceAudienceCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceGenderTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceGeoTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceOsTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServicePlacementCategoryDetailTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServicePlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServicePositionTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceSiteRetargetingTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceTargetType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceTargetオブジェクトは、ターゲティング設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceTarget object holds information of the target setting.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceTargetオブジェクトは、ターゲティング設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedInventoryServiceTarget object holds information of the target setting.<br> This field is optional in ADD operation. </div> ")

public class GuaranteedInventoryServiceTarget   {
  @JsonProperty("adScheduleTarget")
  private JsonNullable<GuaranteedInventoryServiceAdScheduleTarget> adScheduleTarget = JsonNullable.undefined();

  @JsonProperty("ageTarget")
  private JsonNullable<GuaranteedInventoryServiceAgeTarget> ageTarget = JsonNullable.undefined();

  @JsonProperty("appTarget")
  private JsonNullable<GuaranteedInventoryServiceAppTarget> appTarget = JsonNullable.undefined();

  @JsonProperty("audienceCategoryTarget")
  private JsonNullable<GuaranteedInventoryServiceAudienceCategoryTarget> audienceCategoryTarget = JsonNullable.undefined();

  @JsonProperty("deviceTarget")
  private JsonNullable<GuaranteedInventoryServiceDeviceTarget> deviceTarget = JsonNullable.undefined();

  @JsonProperty("genderTarget")
  private JsonNullable<GuaranteedInventoryServiceGenderTarget> genderTarget = JsonNullable.undefined();

  @JsonProperty("geoTarget")
  private JsonNullable<GuaranteedInventoryServiceGeoTarget> geoTarget = JsonNullable.undefined();

  @JsonProperty("osTarget")
  private JsonNullable<GuaranteedInventoryServiceOsTarget> osTarget = JsonNullable.undefined();

  @JsonProperty("placementCategoryTarget")
  private JsonNullable<GuaranteedInventoryServicePlacementCategoryTarget> placementCategoryTarget = JsonNullable.undefined();

  @JsonProperty("placementCategoryDetailTarget")
  private JsonNullable<GuaranteedInventoryServicePlacementCategoryDetailTarget> placementCategoryDetailTarget = JsonNullable.undefined();

  @JsonProperty("positionTarget")
  private JsonNullable<GuaranteedInventoryServicePositionTarget> positionTarget = JsonNullable.undefined();

  @JsonProperty("siteRetargetingTarget")
  private JsonNullable<GuaranteedInventoryServiceSiteRetargetingTarget> siteRetargetingTarget = JsonNullable.undefined();

  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("targetType")
  private JsonNullable<GuaranteedInventoryServiceTargetType> targetType = JsonNullable.undefined();

  public GuaranteedInventoryServiceTarget adScheduleTarget(GuaranteedInventoryServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = JsonNullable.of(adScheduleTarget);
    return this;
  }

  /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceAdScheduleTarget> getAdScheduleTarget() {
    return adScheduleTarget;
  }

  public void setAdScheduleTarget(JsonNullable<GuaranteedInventoryServiceAdScheduleTarget> adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
  }

  public GuaranteedInventoryServiceTarget ageTarget(GuaranteedInventoryServiceAgeTarget ageTarget) {
    this.ageTarget = JsonNullable.of(ageTarget);
    return this;
  }

  /**
   * Get ageTarget
   * @return ageTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceAgeTarget> getAgeTarget() {
    return ageTarget;
  }

  public void setAgeTarget(JsonNullable<GuaranteedInventoryServiceAgeTarget> ageTarget) {
    this.ageTarget = ageTarget;
  }

  public GuaranteedInventoryServiceTarget appTarget(GuaranteedInventoryServiceAppTarget appTarget) {
    this.appTarget = JsonNullable.of(appTarget);
    return this;
  }

  /**
   * Get appTarget
   * @return appTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceAppTarget> getAppTarget() {
    return appTarget;
  }

  public void setAppTarget(JsonNullable<GuaranteedInventoryServiceAppTarget> appTarget) {
    this.appTarget = appTarget;
  }

  public GuaranteedInventoryServiceTarget audienceCategoryTarget(GuaranteedInventoryServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = JsonNullable.of(audienceCategoryTarget);
    return this;
  }

  /**
   * Get audienceCategoryTarget
   * @return audienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceAudienceCategoryTarget> getAudienceCategoryTarget() {
    return audienceCategoryTarget;
  }

  public void setAudienceCategoryTarget(JsonNullable<GuaranteedInventoryServiceAudienceCategoryTarget> audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
  }

  public GuaranteedInventoryServiceTarget deviceTarget(GuaranteedInventoryServiceDeviceTarget deviceTarget) {
    this.deviceTarget = JsonNullable.of(deviceTarget);
    return this;
  }

  /**
   * Get deviceTarget
   * @return deviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceDeviceTarget> getDeviceTarget() {
    return deviceTarget;
  }

  public void setDeviceTarget(JsonNullable<GuaranteedInventoryServiceDeviceTarget> deviceTarget) {
    this.deviceTarget = deviceTarget;
  }

  public GuaranteedInventoryServiceTarget genderTarget(GuaranteedInventoryServiceGenderTarget genderTarget) {
    this.genderTarget = JsonNullable.of(genderTarget);
    return this;
  }

  /**
   * Get genderTarget
   * @return genderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceGenderTarget> getGenderTarget() {
    return genderTarget;
  }

  public void setGenderTarget(JsonNullable<GuaranteedInventoryServiceGenderTarget> genderTarget) {
    this.genderTarget = genderTarget;
  }

  public GuaranteedInventoryServiceTarget geoTarget(GuaranteedInventoryServiceGeoTarget geoTarget) {
    this.geoTarget = JsonNullable.of(geoTarget);
    return this;
  }

  /**
   * Get geoTarget
   * @return geoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceGeoTarget> getGeoTarget() {
    return geoTarget;
  }

  public void setGeoTarget(JsonNullable<GuaranteedInventoryServiceGeoTarget> geoTarget) {
    this.geoTarget = geoTarget;
  }

  public GuaranteedInventoryServiceTarget osTarget(GuaranteedInventoryServiceOsTarget osTarget) {
    this.osTarget = JsonNullable.of(osTarget);
    return this;
  }

  /**
   * Get osTarget
   * @return osTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceOsTarget> getOsTarget() {
    return osTarget;
  }

  public void setOsTarget(JsonNullable<GuaranteedInventoryServiceOsTarget> osTarget) {
    this.osTarget = osTarget;
  }

  public GuaranteedInventoryServiceTarget placementCategoryTarget(GuaranteedInventoryServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = JsonNullable.of(placementCategoryTarget);
    return this;
  }

  /**
   * Get placementCategoryTarget
   * @return placementCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServicePlacementCategoryTarget> getPlacementCategoryTarget() {
    return placementCategoryTarget;
  }

  public void setPlacementCategoryTarget(JsonNullable<GuaranteedInventoryServicePlacementCategoryTarget> placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
  }

  public GuaranteedInventoryServiceTarget placementCategoryDetailTarget(GuaranteedInventoryServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = JsonNullable.of(placementCategoryDetailTarget);
    return this;
  }

  /**
   * Get placementCategoryDetailTarget
   * @return placementCategoryDetailTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServicePlacementCategoryDetailTarget> getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }

  public void setPlacementCategoryDetailTarget(JsonNullable<GuaranteedInventoryServicePlacementCategoryDetailTarget> placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
  }

  public GuaranteedInventoryServiceTarget positionTarget(GuaranteedInventoryServicePositionTarget positionTarget) {
    this.positionTarget = JsonNullable.of(positionTarget);
    return this;
  }

  /**
   * Get positionTarget
   * @return positionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServicePositionTarget> getPositionTarget() {
    return positionTarget;
  }

  public void setPositionTarget(JsonNullable<GuaranteedInventoryServicePositionTarget> positionTarget) {
    this.positionTarget = positionTarget;
  }

  public GuaranteedInventoryServiceTarget siteRetargetingTarget(GuaranteedInventoryServiceSiteRetargetingTarget siteRetargetingTarget) {
    this.siteRetargetingTarget = JsonNullable.of(siteRetargetingTarget);
    return this;
  }

  /**
   * Get siteRetargetingTarget
   * @return siteRetargetingTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceSiteRetargetingTarget> getSiteRetargetingTarget() {
    return siteRetargetingTarget;
  }

  public void setSiteRetargetingTarget(JsonNullable<GuaranteedInventoryServiceSiteRetargetingTarget> siteRetargetingTarget) {
    this.siteRetargetingTarget = siteRetargetingTarget;
  }

  public GuaranteedInventoryServiceTarget targetId(String targetId) {
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

  public GuaranteedInventoryServiceTarget targetType(GuaranteedInventoryServiceTargetType targetType) {
    this.targetType = JsonNullable.of(targetType);
    return this;
  }

  /**
   * Get targetType
   * @return targetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceTargetType> getTargetType() {
    return targetType;
  }

  public void setTargetType(JsonNullable<GuaranteedInventoryServiceTargetType> targetType) {
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
        Objects.equals(this.siteRetargetingTarget, guaranteedInventoryServiceTarget.siteRetargetingTarget) &&
        Objects.equals(this.targetId, guaranteedInventoryServiceTarget.targetId) &&
        Objects.equals(this.targetType, guaranteedInventoryServiceTarget.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adScheduleTarget, ageTarget, appTarget, audienceCategoryTarget, deviceTarget, genderTarget, geoTarget, osTarget, placementCategoryTarget, placementCategoryDetailTarget, positionTarget, siteRetargetingTarget, targetId, targetType);
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


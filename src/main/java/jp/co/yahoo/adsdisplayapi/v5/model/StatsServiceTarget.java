package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceAgeTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceAppTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceAudienceCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceCarrierTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceGenderTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceGeoTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceInterestCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceOsTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceOsVersionTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServicePlacementCategoryDetailTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServicePlacementTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceSearchTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceSiteCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceSiteRetargetingTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceTargetSetting;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceTargetType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceTargetオブジェクトは、ターゲット設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceTarget object holds configuration information of StatsServiceTargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceTargetオブジェクトは、ターゲット設定情報を保持します。</div> <div lang=\"en\">StatsServiceTarget object holds configuration information of StatsServiceTargeting.</div> ")

public class StatsServiceTarget   {
  @JsonProperty("adScheduleTarget")
  private JsonNullable<StatsServiceAdScheduleTarget> adScheduleTarget = JsonNullable.undefined();

  @JsonProperty("ageTarget")
  private JsonNullable<StatsServiceAgeTarget> ageTarget = JsonNullable.undefined();

  @JsonProperty("appTarget")
  private JsonNullable<StatsServiceAppTarget> appTarget = JsonNullable.undefined();

  @JsonProperty("audienceCategoryTarget")
  private JsonNullable<StatsServiceAudienceCategoryTarget> audienceCategoryTarget = JsonNullable.undefined();

  @JsonProperty("carrierTarget")
  private JsonNullable<StatsServiceCarrierTarget> carrierTarget = JsonNullable.undefined();

  @JsonProperty("deviceTarget")
  private JsonNullable<StatsServiceDeviceTarget> deviceTarget = JsonNullable.undefined();

  @JsonProperty("genderTarget")
  private JsonNullable<StatsServiceGenderTarget> genderTarget = JsonNullable.undefined();

  @JsonProperty("geoTarget")
  private JsonNullable<StatsServiceGeoTarget> geoTarget = JsonNullable.undefined();

  @JsonProperty("interestCategoryTarget")
  private JsonNullable<StatsServiceInterestCategoryTarget> interestCategoryTarget = JsonNullable.undefined();

  @JsonProperty("osTarget")
  private JsonNullable<StatsServiceOsTarget> osTarget = JsonNullable.undefined();

  @JsonProperty("osVersionTarget")
  private JsonNullable<StatsServiceOsVersionTarget> osVersionTarget = JsonNullable.undefined();

  @JsonProperty("placementTarget")
  private JsonNullable<StatsServicePlacementTarget> placementTarget = JsonNullable.undefined();

  @JsonProperty("searchTarget")
  private JsonNullable<StatsServiceSearchTarget> searchTarget = JsonNullable.undefined();

  @JsonProperty("siteCategoryTarget")
  private JsonNullable<StatsServiceSiteCategoryTarget> siteCategoryTarget = JsonNullable.undefined();

  @JsonProperty("siteRetargetingTarget")
  private JsonNullable<StatsServiceSiteRetargetingTarget> siteRetargetingTarget = JsonNullable.undefined();

  @JsonProperty("placementCategoryDetailTarget")
  private JsonNullable<StatsServicePlacementCategoryDetailTarget> placementCategoryDetailTarget = JsonNullable.undefined();

  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("targetSetting")
  private JsonNullable<StatsServiceTargetSetting> targetSetting = JsonNullable.undefined();

  @JsonProperty("targetType")
  private JsonNullable<StatsServiceTargetType> targetType = JsonNullable.undefined();

  public StatsServiceTarget adScheduleTarget(StatsServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = JsonNullable.of(adScheduleTarget);
    return this;
  }

  /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceAdScheduleTarget> getAdScheduleTarget() {
    return adScheduleTarget;
  }

  public void setAdScheduleTarget(JsonNullable<StatsServiceAdScheduleTarget> adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
  }

  public StatsServiceTarget ageTarget(StatsServiceAgeTarget ageTarget) {
    this.ageTarget = JsonNullable.of(ageTarget);
    return this;
  }

  /**
   * Get ageTarget
   * @return ageTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceAgeTarget> getAgeTarget() {
    return ageTarget;
  }

  public void setAgeTarget(JsonNullable<StatsServiceAgeTarget> ageTarget) {
    this.ageTarget = ageTarget;
  }

  public StatsServiceTarget appTarget(StatsServiceAppTarget appTarget) {
    this.appTarget = JsonNullable.of(appTarget);
    return this;
  }

  /**
   * Get appTarget
   * @return appTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceAppTarget> getAppTarget() {
    return appTarget;
  }

  public void setAppTarget(JsonNullable<StatsServiceAppTarget> appTarget) {
    this.appTarget = appTarget;
  }

  public StatsServiceTarget audienceCategoryTarget(StatsServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = JsonNullable.of(audienceCategoryTarget);
    return this;
  }

  /**
   * Get audienceCategoryTarget
   * @return audienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceAudienceCategoryTarget> getAudienceCategoryTarget() {
    return audienceCategoryTarget;
  }

  public void setAudienceCategoryTarget(JsonNullable<StatsServiceAudienceCategoryTarget> audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
  }

  public StatsServiceTarget carrierTarget(StatsServiceCarrierTarget carrierTarget) {
    this.carrierTarget = JsonNullable.of(carrierTarget);
    return this;
  }

  /**
   * Get carrierTarget
   * @return carrierTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceCarrierTarget> getCarrierTarget() {
    return carrierTarget;
  }

  public void setCarrierTarget(JsonNullable<StatsServiceCarrierTarget> carrierTarget) {
    this.carrierTarget = carrierTarget;
  }

  public StatsServiceTarget deviceTarget(StatsServiceDeviceTarget deviceTarget) {
    this.deviceTarget = JsonNullable.of(deviceTarget);
    return this;
  }

  /**
   * Get deviceTarget
   * @return deviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceDeviceTarget> getDeviceTarget() {
    return deviceTarget;
  }

  public void setDeviceTarget(JsonNullable<StatsServiceDeviceTarget> deviceTarget) {
    this.deviceTarget = deviceTarget;
  }

  public StatsServiceTarget genderTarget(StatsServiceGenderTarget genderTarget) {
    this.genderTarget = JsonNullable.of(genderTarget);
    return this;
  }

  /**
   * Get genderTarget
   * @return genderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceGenderTarget> getGenderTarget() {
    return genderTarget;
  }

  public void setGenderTarget(JsonNullable<StatsServiceGenderTarget> genderTarget) {
    this.genderTarget = genderTarget;
  }

  public StatsServiceTarget geoTarget(StatsServiceGeoTarget geoTarget) {
    this.geoTarget = JsonNullable.of(geoTarget);
    return this;
  }

  /**
   * Get geoTarget
   * @return geoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceGeoTarget> getGeoTarget() {
    return geoTarget;
  }

  public void setGeoTarget(JsonNullable<StatsServiceGeoTarget> geoTarget) {
    this.geoTarget = geoTarget;
  }

  public StatsServiceTarget interestCategoryTarget(StatsServiceInterestCategoryTarget interestCategoryTarget) {
    this.interestCategoryTarget = JsonNullable.of(interestCategoryTarget);
    return this;
  }

  /**
   * Get interestCategoryTarget
   * @return interestCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceInterestCategoryTarget> getInterestCategoryTarget() {
    return interestCategoryTarget;
  }

  public void setInterestCategoryTarget(JsonNullable<StatsServiceInterestCategoryTarget> interestCategoryTarget) {
    this.interestCategoryTarget = interestCategoryTarget;
  }

  public StatsServiceTarget osTarget(StatsServiceOsTarget osTarget) {
    this.osTarget = JsonNullable.of(osTarget);
    return this;
  }

  /**
   * Get osTarget
   * @return osTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceOsTarget> getOsTarget() {
    return osTarget;
  }

  public void setOsTarget(JsonNullable<StatsServiceOsTarget> osTarget) {
    this.osTarget = osTarget;
  }

  public StatsServiceTarget osVersionTarget(StatsServiceOsVersionTarget osVersionTarget) {
    this.osVersionTarget = JsonNullable.of(osVersionTarget);
    return this;
  }

  /**
   * Get osVersionTarget
   * @return osVersionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceOsVersionTarget> getOsVersionTarget() {
    return osVersionTarget;
  }

  public void setOsVersionTarget(JsonNullable<StatsServiceOsVersionTarget> osVersionTarget) {
    this.osVersionTarget = osVersionTarget;
  }

  public StatsServiceTarget placementTarget(StatsServicePlacementTarget placementTarget) {
    this.placementTarget = JsonNullable.of(placementTarget);
    return this;
  }

  /**
   * Get placementTarget
   * @return placementTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServicePlacementTarget> getPlacementTarget() {
    return placementTarget;
  }

  public void setPlacementTarget(JsonNullable<StatsServicePlacementTarget> placementTarget) {
    this.placementTarget = placementTarget;
  }

  public StatsServiceTarget searchTarget(StatsServiceSearchTarget searchTarget) {
    this.searchTarget = JsonNullable.of(searchTarget);
    return this;
  }

  /**
   * Get searchTarget
   * @return searchTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceSearchTarget> getSearchTarget() {
    return searchTarget;
  }

  public void setSearchTarget(JsonNullable<StatsServiceSearchTarget> searchTarget) {
    this.searchTarget = searchTarget;
  }

  public StatsServiceTarget siteCategoryTarget(StatsServiceSiteCategoryTarget siteCategoryTarget) {
    this.siteCategoryTarget = JsonNullable.of(siteCategoryTarget);
    return this;
  }

  /**
   * Get siteCategoryTarget
   * @return siteCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceSiteCategoryTarget> getSiteCategoryTarget() {
    return siteCategoryTarget;
  }

  public void setSiteCategoryTarget(JsonNullable<StatsServiceSiteCategoryTarget> siteCategoryTarget) {
    this.siteCategoryTarget = siteCategoryTarget;
  }

  public StatsServiceTarget siteRetargetingTarget(StatsServiceSiteRetargetingTarget siteRetargetingTarget) {
    this.siteRetargetingTarget = JsonNullable.of(siteRetargetingTarget);
    return this;
  }

  /**
   * Get siteRetargetingTarget
   * @return siteRetargetingTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceSiteRetargetingTarget> getSiteRetargetingTarget() {
    return siteRetargetingTarget;
  }

  public void setSiteRetargetingTarget(JsonNullable<StatsServiceSiteRetargetingTarget> siteRetargetingTarget) {
    this.siteRetargetingTarget = siteRetargetingTarget;
  }

  public StatsServiceTarget placementCategoryDetailTarget(StatsServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = JsonNullable.of(placementCategoryDetailTarget);
    return this;
  }

  /**
   * Get placementCategoryDetailTarget
   * @return placementCategoryDetailTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServicePlacementCategoryDetailTarget> getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }

  public void setPlacementCategoryDetailTarget(JsonNullable<StatsServicePlacementCategoryDetailTarget> placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
  }

  public StatsServiceTarget targetId(String targetId) {
    this.targetId = JsonNullable.of(targetId);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットID</div> <div lang=\"en\">StatsServiceTarget ID</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットID</div> <div lang=\"en\">StatsServiceTarget ID</div> ")


  public JsonNullable<String> getTargetId() {
    return targetId;
  }

  public void setTargetId(JsonNullable<String> targetId) {
    this.targetId = targetId;
  }

  public StatsServiceTarget targetSetting(StatsServiceTargetSetting targetSetting) {
    this.targetSetting = JsonNullable.of(targetSetting);
    return this;
  }

  /**
   * Get targetSetting
   * @return targetSetting
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceTargetSetting> getTargetSetting() {
    return targetSetting;
  }

  public void setTargetSetting(JsonNullable<StatsServiceTargetSetting> targetSetting) {
    this.targetSetting = targetSetting;
  }

  public StatsServiceTarget targetType(StatsServiceTargetType targetType) {
    this.targetType = JsonNullable.of(targetType);
    return this;
  }

  /**
   * Get targetType
   * @return targetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceTargetType> getTargetType() {
    return targetType;
  }

  public void setTargetType(JsonNullable<StatsServiceTargetType> targetType) {
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
    StatsServiceTarget statsServiceTarget = (StatsServiceTarget) o;
    return Objects.equals(this.adScheduleTarget, statsServiceTarget.adScheduleTarget) &&
        Objects.equals(this.ageTarget, statsServiceTarget.ageTarget) &&
        Objects.equals(this.appTarget, statsServiceTarget.appTarget) &&
        Objects.equals(this.audienceCategoryTarget, statsServiceTarget.audienceCategoryTarget) &&
        Objects.equals(this.carrierTarget, statsServiceTarget.carrierTarget) &&
        Objects.equals(this.deviceTarget, statsServiceTarget.deviceTarget) &&
        Objects.equals(this.genderTarget, statsServiceTarget.genderTarget) &&
        Objects.equals(this.geoTarget, statsServiceTarget.geoTarget) &&
        Objects.equals(this.interestCategoryTarget, statsServiceTarget.interestCategoryTarget) &&
        Objects.equals(this.osTarget, statsServiceTarget.osTarget) &&
        Objects.equals(this.osVersionTarget, statsServiceTarget.osVersionTarget) &&
        Objects.equals(this.placementTarget, statsServiceTarget.placementTarget) &&
        Objects.equals(this.searchTarget, statsServiceTarget.searchTarget) &&
        Objects.equals(this.siteCategoryTarget, statsServiceTarget.siteCategoryTarget) &&
        Objects.equals(this.siteRetargetingTarget, statsServiceTarget.siteRetargetingTarget) &&
        Objects.equals(this.placementCategoryDetailTarget, statsServiceTarget.placementCategoryDetailTarget) &&
        Objects.equals(this.targetId, statsServiceTarget.targetId) &&
        Objects.equals(this.targetSetting, statsServiceTarget.targetSetting) &&
        Objects.equals(this.targetType, statsServiceTarget.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adScheduleTarget, ageTarget, appTarget, audienceCategoryTarget, carrierTarget, deviceTarget, genderTarget, geoTarget, interestCategoryTarget, osTarget, osVersionTarget, placementTarget, searchTarget, siteCategoryTarget, siteRetargetingTarget, placementCategoryDetailTarget, targetId, targetSetting, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceTarget {\n");
    
    sb.append("    adScheduleTarget: ").append(toIndentedString(adScheduleTarget)).append("\n");
    sb.append("    ageTarget: ").append(toIndentedString(ageTarget)).append("\n");
    sb.append("    appTarget: ").append(toIndentedString(appTarget)).append("\n");
    sb.append("    audienceCategoryTarget: ").append(toIndentedString(audienceCategoryTarget)).append("\n");
    sb.append("    carrierTarget: ").append(toIndentedString(carrierTarget)).append("\n");
    sb.append("    deviceTarget: ").append(toIndentedString(deviceTarget)).append("\n");
    sb.append("    genderTarget: ").append(toIndentedString(genderTarget)).append("\n");
    sb.append("    geoTarget: ").append(toIndentedString(geoTarget)).append("\n");
    sb.append("    interestCategoryTarget: ").append(toIndentedString(interestCategoryTarget)).append("\n");
    sb.append("    osTarget: ").append(toIndentedString(osTarget)).append("\n");
    sb.append("    osVersionTarget: ").append(toIndentedString(osVersionTarget)).append("\n");
    sb.append("    placementTarget: ").append(toIndentedString(placementTarget)).append("\n");
    sb.append("    searchTarget: ").append(toIndentedString(searchTarget)).append("\n");
    sb.append("    siteCategoryTarget: ").append(toIndentedString(siteCategoryTarget)).append("\n");
    sb.append("    siteRetargetingTarget: ").append(toIndentedString(siteRetargetingTarget)).append("\n");
    sb.append("    placementCategoryDetailTarget: ").append(toIndentedString(placementCategoryDetailTarget)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetSetting: ").append(toIndentedString(targetSetting)).append("\n");
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


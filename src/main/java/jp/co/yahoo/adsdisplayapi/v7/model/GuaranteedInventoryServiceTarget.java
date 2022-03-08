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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceTargetオブジェクトは、ターゲティング設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceTarget object holds information of the target setting.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceTargetオブジェクトは、ターゲティング設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedInventoryServiceTarget object holds information of the target setting.<br> This field is optional in ADD operation. </div> ")
@JsonPropertyOrder({
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_AD_SCHEDULE_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_AGE_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_APP_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_AUDIENCE_CATEGORY_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_DEVICE_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_GENDER_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_GEO_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_OS_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_PLACEMENT_CATEGORY_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_PLACEMENT_CATEGORY_DETAIL_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_POSITION_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_AUDIENCE_LIST_TARGET,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_TARGET_ID,
  GuaranteedInventoryServiceTarget.JSON_PROPERTY_TARGET_TYPE
})
@JsonTypeName("GuaranteedInventoryServiceTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedInventoryServiceTarget {
  public static final String JSON_PROPERTY_AD_SCHEDULE_TARGET = "adScheduleTarget";
  private GuaranteedInventoryServiceAdScheduleTarget adScheduleTarget;

  public static final String JSON_PROPERTY_AGE_TARGET = "ageTarget";
  private GuaranteedInventoryServiceAgeTarget ageTarget;

  public static final String JSON_PROPERTY_APP_TARGET = "appTarget";
  private GuaranteedInventoryServiceAppTarget appTarget;

  public static final String JSON_PROPERTY_AUDIENCE_CATEGORY_TARGET = "audienceCategoryTarget";
  private GuaranteedInventoryServiceAudienceCategoryTarget audienceCategoryTarget;

  public static final String JSON_PROPERTY_DEVICE_TARGET = "deviceTarget";
  private GuaranteedInventoryServiceDeviceTarget deviceTarget;

  public static final String JSON_PROPERTY_GENDER_TARGET = "genderTarget";
  private GuaranteedInventoryServiceGenderTarget genderTarget;

  public static final String JSON_PROPERTY_GEO_TARGET = "geoTarget";
  private GuaranteedInventoryServiceGeoTarget geoTarget;

  public static final String JSON_PROPERTY_OS_TARGET = "osTarget";
  private GuaranteedInventoryServiceOsTarget osTarget;

  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_TARGET = "placementCategoryTarget";
  private GuaranteedInventoryServicePlacementCategoryTarget placementCategoryTarget;

  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_DETAIL_TARGET = "placementCategoryDetailTarget";
  private GuaranteedInventoryServicePlacementCategoryDetailTarget placementCategoryDetailTarget;

  public static final String JSON_PROPERTY_POSITION_TARGET = "positionTarget";
  private GuaranteedInventoryServicePositionTarget positionTarget;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_TARGET = "audienceListTarget";
  private GuaranteedInventoryServiceAudienceListTarget audienceListTarget;

  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private String targetId;

  public static final String JSON_PROPERTY_TARGET_TYPE = "targetType";
  private GuaranteedInventoryServiceTargetType targetType;

  public GuaranteedInventoryServiceTarget() { 
  }

  public GuaranteedInventoryServiceTarget adScheduleTarget(GuaranteedInventoryServiceAdScheduleTarget adScheduleTarget) {
    
    this.adScheduleTarget = adScheduleTarget;
    return this;
  }

   /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_SCHEDULE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceAdScheduleTarget getAdScheduleTarget() {
    return adScheduleTarget;
  }


  @JsonProperty(JSON_PROPERTY_AD_SCHEDULE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceAgeTarget getAgeTarget() {
    return ageTarget;
  }


  @JsonProperty(JSON_PROPERTY_AGE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceAppTarget getAppTarget() {
    return appTarget;
  }


  @JsonProperty(JSON_PROPERTY_APP_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_CATEGORY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceAudienceCategoryTarget getAudienceCategoryTarget() {
    return audienceCategoryTarget;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_CATEGORY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceDeviceTarget getDeviceTarget() {
    return deviceTarget;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENDER_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceGenderTarget getGenderTarget() {
    return genderTarget;
  }


  @JsonProperty(JSON_PROPERTY_GENDER_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEO_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceGeoTarget getGeoTarget() {
    return geoTarget;
  }


  @JsonProperty(JSON_PROPERTY_GEO_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OS_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceOsTarget getOsTarget() {
    return osTarget;
  }


  @JsonProperty(JSON_PROPERTY_OS_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServicePlacementCategoryTarget getPlacementCategoryTarget() {
    return placementCategoryTarget;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_DETAIL_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServicePlacementCategoryDetailTarget getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_DETAIL_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServicePositionTarget getPositionTarget() {
    return positionTarget;
  }


  @JsonProperty(JSON_PROPERTY_POSITION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceAudienceListTarget getAudienceListTarget() {
    return audienceListTarget;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListTarget(GuaranteedInventoryServiceAudienceListTarget audienceListTarget) {
    this.audienceListTarget = audienceListTarget;
  }


  public GuaranteedInventoryServiceTarget targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ターゲットIDです。&lt;br&gt; このフィールドは、ADD時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target ID.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADD時は省略可能となります。 </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD operation. </div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceTargetType getTargetType() {
    return targetType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


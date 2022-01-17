package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceAgeTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceAppTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceAudienceCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceAudienceListTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceContentsTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceGenderTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceGeoTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceOsTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceOsVersionTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServicePlacementCategoryDetailTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServicePlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServicePlacementTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServicePositionTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceSearchTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceSiteCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceTargetSetting;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceTargetType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceTargetオブジェクトは、ターゲティング設定情報を保持します。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceTarget object is a container for storing targeting settings.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceTargetオブジェクトは、ターゲティング設定情報を保持します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceTarget object is a container for storing targeting settings.<br> This field is required in requests. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceTarget   {
  @JsonProperty("adScheduleTarget")
  private AdGroupTargetServiceAdScheduleTarget adScheduleTarget = null;

  @JsonProperty("ageTarget")
  private AdGroupTargetServiceAgeTarget ageTarget = null;

  @JsonProperty("appTarget")
  private AdGroupTargetServiceAppTarget appTarget = null;

  @JsonProperty("audienceCategoryTarget")
  private AdGroupTargetServiceAudienceCategoryTarget audienceCategoryTarget = null;

  @JsonProperty("deviceTarget")
  private AdGroupTargetServiceDeviceTarget deviceTarget = null;

  @JsonProperty("genderTarget")
  private AdGroupTargetServiceGenderTarget genderTarget = null;

  @JsonProperty("geoTarget")
  private AdGroupTargetServiceGeoTarget geoTarget = null;

  @JsonProperty("isRemove")
  private Boolean isRemove = null;

  @JsonProperty("osTarget")
  private AdGroupTargetServiceOsTarget osTarget = null;

  @JsonProperty("osVersionTarget")
  private AdGroupTargetServiceOsVersionTarget osVersionTarget = null;

  @JsonProperty("placementTarget")
  private AdGroupTargetServicePlacementTarget placementTarget = null;

  @JsonProperty("searchTarget")
  private AdGroupTargetServiceSearchTarget searchTarget = null;

  @JsonProperty("siteCategoryTarget")
  private AdGroupTargetServiceSiteCategoryTarget siteCategoryTarget = null;

  @JsonProperty("audienceListTarget")
  private AdGroupTargetServiceAudienceListTarget audienceListTarget = null;

  @JsonProperty("positionTarget")
  private AdGroupTargetServicePositionTarget positionTarget = null;

  @JsonProperty("placementCategoryTarget")
  private AdGroupTargetServicePlacementCategoryTarget placementCategoryTarget = null;

  @JsonProperty("placementCategoryDetailTarget")
  private AdGroupTargetServicePlacementCategoryDetailTarget placementCategoryDetailTarget = null;

  @JsonProperty("contentsTarget")
  private AdGroupTargetServiceContentsTarget contentsTarget = null;

  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("targetSetting")
  private AdGroupTargetServiceTargetSetting targetSetting = null;

  @JsonProperty("targetType")
  private AdGroupTargetServiceTargetType targetType = null;

  public AdGroupTargetServiceTarget adScheduleTarget(AdGroupTargetServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
    return this;
  }

  /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceAdScheduleTarget getAdScheduleTarget() {
    return adScheduleTarget;
  }

  public void setAdScheduleTarget(AdGroupTargetServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
  }

  public AdGroupTargetServiceTarget ageTarget(AdGroupTargetServiceAgeTarget ageTarget) {
    this.ageTarget = ageTarget;
    return this;
  }

  /**
   * Get ageTarget
   * @return ageTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceAgeTarget getAgeTarget() {
    return ageTarget;
  }

  public void setAgeTarget(AdGroupTargetServiceAgeTarget ageTarget) {
    this.ageTarget = ageTarget;
  }

  public AdGroupTargetServiceTarget appTarget(AdGroupTargetServiceAppTarget appTarget) {
    this.appTarget = appTarget;
    return this;
  }

  /**
   * Get appTarget
   * @return appTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceAppTarget getAppTarget() {
    return appTarget;
  }

  public void setAppTarget(AdGroupTargetServiceAppTarget appTarget) {
    this.appTarget = appTarget;
  }

  public AdGroupTargetServiceTarget audienceCategoryTarget(AdGroupTargetServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
    return this;
  }

  /**
   * Get audienceCategoryTarget
   * @return audienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceAudienceCategoryTarget getAudienceCategoryTarget() {
    return audienceCategoryTarget;
  }

  public void setAudienceCategoryTarget(AdGroupTargetServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
  }

  public AdGroupTargetServiceTarget deviceTarget(AdGroupTargetServiceDeviceTarget deviceTarget) {
    this.deviceTarget = deviceTarget;
    return this;
  }

  /**
   * Get deviceTarget
   * @return deviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceDeviceTarget getDeviceTarget() {
    return deviceTarget;
  }

  public void setDeviceTarget(AdGroupTargetServiceDeviceTarget deviceTarget) {
    this.deviceTarget = deviceTarget;
  }

  public AdGroupTargetServiceTarget genderTarget(AdGroupTargetServiceGenderTarget genderTarget) {
    this.genderTarget = genderTarget;
    return this;
  }

  /**
   * Get genderTarget
   * @return genderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceGenderTarget getGenderTarget() {
    return genderTarget;
  }

  public void setGenderTarget(AdGroupTargetServiceGenderTarget genderTarget) {
    this.genderTarget = genderTarget;
  }

  public AdGroupTargetServiceTarget geoTarget(AdGroupTargetServiceGeoTarget geoTarget) {
    this.geoTarget = geoTarget;
    return this;
  }

  /**
   * Get geoTarget
   * @return geoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceGeoTarget getGeoTarget() {
    return geoTarget;
  }

  public void setGeoTarget(AdGroupTargetServiceGeoTarget geoTarget) {
    this.geoTarget = geoTarget;
  }

  public AdGroupTargetServiceTarget isRemove(Boolean isRemove) {
    this.isRemove = isRemove;
    return this;
  }

  /**
   * <div lang=\"ja\"> trueの場合、ターゲティング種別をすべて削除します。<br> このフィールドは、ADD、SETおよびREMOVE時は無視され、REPLACE時は省略可能となります。 </div> <div lang=\"en\"> If true, delete all targeting types.<br> This field will be ignored in ADD, SET and REMOVE operation, and will be optional in REPLACE operation. </div> 
   * @return isRemove
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> trueの場合、ターゲティング種別をすべて削除します。<br> このフィールドは、ADD、SETおよびREMOVE時は無視され、REPLACE時は省略可能となります。 </div> <div lang=\"en\"> If true, delete all targeting types.<br> This field will be ignored in ADD, SET and REMOVE operation, and will be optional in REPLACE operation. </div> ")


  public Boolean getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(Boolean isRemove) {
    this.isRemove = isRemove;
  }

  public AdGroupTargetServiceTarget osTarget(AdGroupTargetServiceOsTarget osTarget) {
    this.osTarget = osTarget;
    return this;
  }

  /**
   * Get osTarget
   * @return osTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceOsTarget getOsTarget() {
    return osTarget;
  }

  public void setOsTarget(AdGroupTargetServiceOsTarget osTarget) {
    this.osTarget = osTarget;
  }

  public AdGroupTargetServiceTarget osVersionTarget(AdGroupTargetServiceOsVersionTarget osVersionTarget) {
    this.osVersionTarget = osVersionTarget;
    return this;
  }

  /**
   * Get osVersionTarget
   * @return osVersionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceOsVersionTarget getOsVersionTarget() {
    return osVersionTarget;
  }

  public void setOsVersionTarget(AdGroupTargetServiceOsVersionTarget osVersionTarget) {
    this.osVersionTarget = osVersionTarget;
  }

  public AdGroupTargetServiceTarget placementTarget(AdGroupTargetServicePlacementTarget placementTarget) {
    this.placementTarget = placementTarget;
    return this;
  }

  /**
   * Get placementTarget
   * @return placementTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServicePlacementTarget getPlacementTarget() {
    return placementTarget;
  }

  public void setPlacementTarget(AdGroupTargetServicePlacementTarget placementTarget) {
    this.placementTarget = placementTarget;
  }

  public AdGroupTargetServiceTarget searchTarget(AdGroupTargetServiceSearchTarget searchTarget) {
    this.searchTarget = searchTarget;
    return this;
  }

  /**
   * Get searchTarget
   * @return searchTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceSearchTarget getSearchTarget() {
    return searchTarget;
  }

  public void setSearchTarget(AdGroupTargetServiceSearchTarget searchTarget) {
    this.searchTarget = searchTarget;
  }

  public AdGroupTargetServiceTarget siteCategoryTarget(AdGroupTargetServiceSiteCategoryTarget siteCategoryTarget) {
    this.siteCategoryTarget = siteCategoryTarget;
    return this;
  }

  /**
   * Get siteCategoryTarget
   * @return siteCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceSiteCategoryTarget getSiteCategoryTarget() {
    return siteCategoryTarget;
  }

  public void setSiteCategoryTarget(AdGroupTargetServiceSiteCategoryTarget siteCategoryTarget) {
    this.siteCategoryTarget = siteCategoryTarget;
  }

  public AdGroupTargetServiceTarget audienceListTarget(AdGroupTargetServiceAudienceListTarget audienceListTarget) {
    this.audienceListTarget = audienceListTarget;
    return this;
  }

  /**
   * Get audienceListTarget
   * @return audienceListTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceAudienceListTarget getAudienceListTarget() {
    return audienceListTarget;
  }

  public void setAudienceListTarget(AdGroupTargetServiceAudienceListTarget audienceListTarget) {
    this.audienceListTarget = audienceListTarget;
  }

  public AdGroupTargetServiceTarget positionTarget(AdGroupTargetServicePositionTarget positionTarget) {
    this.positionTarget = positionTarget;
    return this;
  }

  /**
   * Get positionTarget
   * @return positionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServicePositionTarget getPositionTarget() {
    return positionTarget;
  }

  public void setPositionTarget(AdGroupTargetServicePositionTarget positionTarget) {
    this.positionTarget = positionTarget;
  }

  public AdGroupTargetServiceTarget placementCategoryTarget(AdGroupTargetServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
    return this;
  }

  /**
   * Get placementCategoryTarget
   * @return placementCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServicePlacementCategoryTarget getPlacementCategoryTarget() {
    return placementCategoryTarget;
  }

  public void setPlacementCategoryTarget(AdGroupTargetServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
  }

  public AdGroupTargetServiceTarget placementCategoryDetailTarget(AdGroupTargetServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
    return this;
  }

  /**
   * Get placementCategoryDetailTarget
   * @return placementCategoryDetailTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServicePlacementCategoryDetailTarget getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }

  public void setPlacementCategoryDetailTarget(AdGroupTargetServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
  }

  public AdGroupTargetServiceTarget contentsTarget(AdGroupTargetServiceContentsTarget contentsTarget) {
    this.contentsTarget = contentsTarget;
    return this;
  }

  /**
   * Get contentsTarget
   * @return contentsTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceContentsTarget getContentsTarget() {
    return contentsTarget;
  }

  public void setContentsTarget(AdGroupTargetServiceContentsTarget contentsTarget) {
    this.contentsTarget = contentsTarget;
  }

  public AdGroupTargetServiceTarget targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADDおよびREPLACE時は省略可能となり、SETおよびREMOVE時は必須となります。<br> ※ADD時、targetTypeが以下のいずれかの場合は必須です。<br> ‐AUDIENCE_LIST_TARGET<br> ‐PLACEMENT_TARGET<br> ‐SEARCH_TARGET<br> ‐GEO_TARGET<br> ‐SITE_CATEGORY<br> ‐AUDIENCE_CATEGORY_TARGET<br> ‐PLACEMENT_CATEGORY_TARGET<br> -PLACEMENT_CATEGORY_DETAIL_TARGET<br> -CONTENTS_TARGET<br> ※REPLACE時、isRemoveがtrueの場合は設定不要です。<br> <br> ‐AUDIENCE_LIST_TARGET: audienceListId<br> ‐PLACEMENT_TARGET: placementUrlListId<br> ‐SEARCH_TARGET: searchKeywordListId<br> ‐GEO_TARGET: IM地域コード(geo)<br> ‐SITE_CATEGORY: カテゴリーコード(category)<br> ‐OS_VERSION_TARGET: osVersion<br> ‐AUDIENCE_CATEGORY_TARGET: オーディエンスカテゴリーコード(audience category)<br> ‐POSITION_TARGET: PositionTypeのコード値<br> ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId<br> -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId<br> -CONTENTS_TARGET: contentsKeywordListId </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD and REPLACE operation, and is required in SET and REMOVE operation.<br> *If targetType is any of the following, this field is required in ADD operation.<br> ‐AUDIENCE_LIST_TARGET<br> ‐PLACEMENT_TARGET<br> ‐SEARCH_TARGET<br> ‐GEO_TARGET<br> ‐SITE_CATEGORY<br> ‐AUDIENCE_CATEGORY_TARGET<br> ‐PLACEMENT_CATEGORY_TARGET<br> -PLACEMENT_CATEGORY_DETAIL_TARGET<br> -CONTENTS_TARGET<br> *If isRemove is true, this field does not need to be set in REPLACE operation.<br> <br> ‐AUDIENCE_LIST_TARGET: audienceListId<br> ‐PLACEMENT_TARGET: placementUrlListId<br> ‐SEARCH_TARGET: searchKeywordListId<br> ‐GEO_TARGET: IM area code(geo)<br> ‐SITE_CATEGORY: category code(category)<br> ‐OS_VERSION_TARGET: osVersion<br> ‐AUDIENCE_CATEGORY_TARGET: audience category code(audience category)<br> ‐POSITION_TARGET: PositionType code.<br> ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId<br> -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId<br> -CONTENTS_TARGET: contentsKeywordListId </div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADDおよびREPLACE時は省略可能となり、SETおよびREMOVE時は必須となります。<br> ※ADD時、targetTypeが以下のいずれかの場合は必須です。<br> ‐AUDIENCE_LIST_TARGET<br> ‐PLACEMENT_TARGET<br> ‐SEARCH_TARGET<br> ‐GEO_TARGET<br> ‐SITE_CATEGORY<br> ‐AUDIENCE_CATEGORY_TARGET<br> ‐PLACEMENT_CATEGORY_TARGET<br> -PLACEMENT_CATEGORY_DETAIL_TARGET<br> -CONTENTS_TARGET<br> ※REPLACE時、isRemoveがtrueの場合は設定不要です。<br> <br> ‐AUDIENCE_LIST_TARGET: audienceListId<br> ‐PLACEMENT_TARGET: placementUrlListId<br> ‐SEARCH_TARGET: searchKeywordListId<br> ‐GEO_TARGET: IM地域コード(geo)<br> ‐SITE_CATEGORY: カテゴリーコード(category)<br> ‐OS_VERSION_TARGET: osVersion<br> ‐AUDIENCE_CATEGORY_TARGET: オーディエンスカテゴリーコード(audience category)<br> ‐POSITION_TARGET: PositionTypeのコード値<br> ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId<br> -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId<br> -CONTENTS_TARGET: contentsKeywordListId </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD and REPLACE operation, and is required in SET and REMOVE operation.<br> *If targetType is any of the following, this field is required in ADD operation.<br> ‐AUDIENCE_LIST_TARGET<br> ‐PLACEMENT_TARGET<br> ‐SEARCH_TARGET<br> ‐GEO_TARGET<br> ‐SITE_CATEGORY<br> ‐AUDIENCE_CATEGORY_TARGET<br> ‐PLACEMENT_CATEGORY_TARGET<br> -PLACEMENT_CATEGORY_DETAIL_TARGET<br> -CONTENTS_TARGET<br> *If isRemove is true, this field does not need to be set in REPLACE operation.<br> <br> ‐AUDIENCE_LIST_TARGET: audienceListId<br> ‐PLACEMENT_TARGET: placementUrlListId<br> ‐SEARCH_TARGET: searchKeywordListId<br> ‐GEO_TARGET: IM area code(geo)<br> ‐SITE_CATEGORY: category code(category)<br> ‐OS_VERSION_TARGET: osVersion<br> ‐AUDIENCE_CATEGORY_TARGET: audience category code(audience category)<br> ‐POSITION_TARGET: PositionType code.<br> ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId<br> -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId<br> -CONTENTS_TARGET: contentsKeywordListId </div> ")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public AdGroupTargetServiceTarget targetSetting(AdGroupTargetServiceTargetSetting targetSetting) {
    this.targetSetting = targetSetting;
    return this;
  }

  /**
   * Get targetSetting
   * @return targetSetting
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceTargetSetting getTargetSetting() {
    return targetSetting;
  }

  public void setTargetSetting(AdGroupTargetServiceTargetSetting targetSetting) {
    this.targetSetting = targetSetting;
  }

  public AdGroupTargetServiceTarget targetType(AdGroupTargetServiceTargetType targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   * @return targetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(AdGroupTargetServiceTargetType targetType) {
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
    AdGroupTargetServiceTarget adGroupTargetServiceTarget = (AdGroupTargetServiceTarget) o;
    return Objects.equals(this.adScheduleTarget, adGroupTargetServiceTarget.adScheduleTarget) &&
        Objects.equals(this.ageTarget, adGroupTargetServiceTarget.ageTarget) &&
        Objects.equals(this.appTarget, adGroupTargetServiceTarget.appTarget) &&
        Objects.equals(this.audienceCategoryTarget, adGroupTargetServiceTarget.audienceCategoryTarget) &&
        Objects.equals(this.deviceTarget, adGroupTargetServiceTarget.deviceTarget) &&
        Objects.equals(this.genderTarget, adGroupTargetServiceTarget.genderTarget) &&
        Objects.equals(this.geoTarget, adGroupTargetServiceTarget.geoTarget) &&
        Objects.equals(this.isRemove, adGroupTargetServiceTarget.isRemove) &&
        Objects.equals(this.osTarget, adGroupTargetServiceTarget.osTarget) &&
        Objects.equals(this.osVersionTarget, adGroupTargetServiceTarget.osVersionTarget) &&
        Objects.equals(this.placementTarget, adGroupTargetServiceTarget.placementTarget) &&
        Objects.equals(this.searchTarget, adGroupTargetServiceTarget.searchTarget) &&
        Objects.equals(this.siteCategoryTarget, adGroupTargetServiceTarget.siteCategoryTarget) &&
        Objects.equals(this.audienceListTarget, adGroupTargetServiceTarget.audienceListTarget) &&
        Objects.equals(this.positionTarget, adGroupTargetServiceTarget.positionTarget) &&
        Objects.equals(this.placementCategoryTarget, adGroupTargetServiceTarget.placementCategoryTarget) &&
        Objects.equals(this.placementCategoryDetailTarget, adGroupTargetServiceTarget.placementCategoryDetailTarget) &&
        Objects.equals(this.contentsTarget, adGroupTargetServiceTarget.contentsTarget) &&
        Objects.equals(this.targetId, adGroupTargetServiceTarget.targetId) &&
        Objects.equals(this.targetSetting, adGroupTargetServiceTarget.targetSetting) &&
        Objects.equals(this.targetType, adGroupTargetServiceTarget.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adScheduleTarget, ageTarget, appTarget, audienceCategoryTarget, deviceTarget, genderTarget, geoTarget, isRemove, osTarget, osVersionTarget, placementTarget, searchTarget, siteCategoryTarget, audienceListTarget, positionTarget, placementCategoryTarget, placementCategoryDetailTarget, contentsTarget, targetId, targetSetting, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceTarget {\n");
    
    sb.append("    adScheduleTarget: ").append(toIndentedString(adScheduleTarget)).append("\n");
    sb.append("    ageTarget: ").append(toIndentedString(ageTarget)).append("\n");
    sb.append("    appTarget: ").append(toIndentedString(appTarget)).append("\n");
    sb.append("    audienceCategoryTarget: ").append(toIndentedString(audienceCategoryTarget)).append("\n");
    sb.append("    deviceTarget: ").append(toIndentedString(deviceTarget)).append("\n");
    sb.append("    genderTarget: ").append(toIndentedString(genderTarget)).append("\n");
    sb.append("    geoTarget: ").append(toIndentedString(geoTarget)).append("\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    osTarget: ").append(toIndentedString(osTarget)).append("\n");
    sb.append("    osVersionTarget: ").append(toIndentedString(osVersionTarget)).append("\n");
    sb.append("    placementTarget: ").append(toIndentedString(placementTarget)).append("\n");
    sb.append("    searchTarget: ").append(toIndentedString(searchTarget)).append("\n");
    sb.append("    siteCategoryTarget: ").append(toIndentedString(siteCategoryTarget)).append("\n");
    sb.append("    audienceListTarget: ").append(toIndentedString(audienceListTarget)).append("\n");
    sb.append("    positionTarget: ").append(toIndentedString(positionTarget)).append("\n");
    sb.append("    placementCategoryTarget: ").append(toIndentedString(placementCategoryTarget)).append("\n");
    sb.append("    placementCategoryDetailTarget: ").append(toIndentedString(placementCategoryDetailTarget)).append("\n");
    sb.append("    contentsTarget: ").append(toIndentedString(contentsTarget)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


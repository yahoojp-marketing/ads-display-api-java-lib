package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceAgeTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceAppTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceAudienceCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceCarrierTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceContentsTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceGenderTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceGeoTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceInterestCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceOsTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceOsVersionTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServicePlacementCategoryDetailTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServicePlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServicePlacementTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServicePositionTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceSearchTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceSiteCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceSiteRetargetingTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceTargetType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceTargetオブジェクトは、ターゲティング設定情報を保持します。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceTarget object is a container for storing targeting settings.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceTargetオブジェクトは、ターゲティング設定情報を保持します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceTarget object is a container for storing targeting settings.<br> This field is required in requests. </div> ")

public class AdGroupTargetServiceTarget   {
  @JsonProperty("adScheduleTarget")
  private JsonNullable<AdGroupTargetServiceAdScheduleTarget> adScheduleTarget = JsonNullable.undefined();

  @JsonProperty("ageTarget")
  private JsonNullable<AdGroupTargetServiceAgeTarget> ageTarget = JsonNullable.undefined();

  @JsonProperty("appTarget")
  private JsonNullable<AdGroupTargetServiceAppTarget> appTarget = JsonNullable.undefined();

  @JsonProperty("audienceCategoryTarget")
  private JsonNullable<AdGroupTargetServiceAudienceCategoryTarget> audienceCategoryTarget = JsonNullable.undefined();

  @JsonProperty("carrierTarget")
  private JsonNullable<AdGroupTargetServiceCarrierTarget> carrierTarget = JsonNullable.undefined();

  @JsonProperty("deviceTarget")
  private JsonNullable<AdGroupTargetServiceDeviceTarget> deviceTarget = JsonNullable.undefined();

  @JsonProperty("genderTarget")
  private JsonNullable<AdGroupTargetServiceGenderTarget> genderTarget = JsonNullable.undefined();

  @JsonProperty("geoTarget")
  private JsonNullable<AdGroupTargetServiceGeoTarget> geoTarget = JsonNullable.undefined();

  @JsonProperty("interestCategoryTarget")
  private JsonNullable<AdGroupTargetServiceInterestCategoryTarget> interestCategoryTarget = JsonNullable.undefined();

  @JsonProperty("isRemove")
  private JsonNullable<Boolean> isRemove = JsonNullable.undefined();

  @JsonProperty("osTarget")
  private JsonNullable<AdGroupTargetServiceOsTarget> osTarget = JsonNullable.undefined();

  @JsonProperty("osVersionTarget")
  private JsonNullable<AdGroupTargetServiceOsVersionTarget> osVersionTarget = JsonNullable.undefined();

  @JsonProperty("placementTarget")
  private JsonNullable<AdGroupTargetServicePlacementTarget> placementTarget = JsonNullable.undefined();

  @JsonProperty("searchTarget")
  private JsonNullable<AdGroupTargetServiceSearchTarget> searchTarget = JsonNullable.undefined();

  @JsonProperty("siteCategoryTarget")
  private JsonNullable<AdGroupTargetServiceSiteCategoryTarget> siteCategoryTarget = JsonNullable.undefined();

  @JsonProperty("siteRetargetingTarget")
  private JsonNullable<AdGroupTargetServiceSiteRetargetingTarget> siteRetargetingTarget = JsonNullable.undefined();

  @JsonProperty("positionTarget")
  private JsonNullable<AdGroupTargetServicePositionTarget> positionTarget = JsonNullable.undefined();

  @JsonProperty("placementCategoryTarget")
  private JsonNullable<AdGroupTargetServicePlacementCategoryTarget> placementCategoryTarget = JsonNullable.undefined();

  @JsonProperty("placementCategoryDetailTarget")
  private JsonNullable<AdGroupTargetServicePlacementCategoryDetailTarget> placementCategoryDetailTarget = JsonNullable.undefined();

  @JsonProperty("contentsTarget")
  private JsonNullable<AdGroupTargetServiceContentsTarget> contentsTarget = JsonNullable.undefined();

  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("targetType")
  private JsonNullable<AdGroupTargetServiceTargetType> targetType = JsonNullable.undefined();

  public AdGroupTargetServiceTarget adScheduleTarget(AdGroupTargetServiceAdScheduleTarget adScheduleTarget) {
    this.adScheduleTarget = JsonNullable.of(adScheduleTarget);
    return this;
  }

  /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceAdScheduleTarget> getAdScheduleTarget() {
    return adScheduleTarget;
  }

  public void setAdScheduleTarget(JsonNullable<AdGroupTargetServiceAdScheduleTarget> adScheduleTarget) {
    this.adScheduleTarget = adScheduleTarget;
  }

  public AdGroupTargetServiceTarget ageTarget(AdGroupTargetServiceAgeTarget ageTarget) {
    this.ageTarget = JsonNullable.of(ageTarget);
    return this;
  }

  /**
   * Get ageTarget
   * @return ageTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceAgeTarget> getAgeTarget() {
    return ageTarget;
  }

  public void setAgeTarget(JsonNullable<AdGroupTargetServiceAgeTarget> ageTarget) {
    this.ageTarget = ageTarget;
  }

  public AdGroupTargetServiceTarget appTarget(AdGroupTargetServiceAppTarget appTarget) {
    this.appTarget = JsonNullable.of(appTarget);
    return this;
  }

  /**
   * Get appTarget
   * @return appTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceAppTarget> getAppTarget() {
    return appTarget;
  }

  public void setAppTarget(JsonNullable<AdGroupTargetServiceAppTarget> appTarget) {
    this.appTarget = appTarget;
  }

  public AdGroupTargetServiceTarget audienceCategoryTarget(AdGroupTargetServiceAudienceCategoryTarget audienceCategoryTarget) {
    this.audienceCategoryTarget = JsonNullable.of(audienceCategoryTarget);
    return this;
  }

  /**
   * Get audienceCategoryTarget
   * @return audienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceAudienceCategoryTarget> getAudienceCategoryTarget() {
    return audienceCategoryTarget;
  }

  public void setAudienceCategoryTarget(JsonNullable<AdGroupTargetServiceAudienceCategoryTarget> audienceCategoryTarget) {
    this.audienceCategoryTarget = audienceCategoryTarget;
  }

  public AdGroupTargetServiceTarget carrierTarget(AdGroupTargetServiceCarrierTarget carrierTarget) {
    this.carrierTarget = JsonNullable.of(carrierTarget);
    return this;
  }

  /**
   * Get carrierTarget
   * @return carrierTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceCarrierTarget> getCarrierTarget() {
    return carrierTarget;
  }

  public void setCarrierTarget(JsonNullable<AdGroupTargetServiceCarrierTarget> carrierTarget) {
    this.carrierTarget = carrierTarget;
  }

  public AdGroupTargetServiceTarget deviceTarget(AdGroupTargetServiceDeviceTarget deviceTarget) {
    this.deviceTarget = JsonNullable.of(deviceTarget);
    return this;
  }

  /**
   * Get deviceTarget
   * @return deviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceDeviceTarget> getDeviceTarget() {
    return deviceTarget;
  }

  public void setDeviceTarget(JsonNullable<AdGroupTargetServiceDeviceTarget> deviceTarget) {
    this.deviceTarget = deviceTarget;
  }

  public AdGroupTargetServiceTarget genderTarget(AdGroupTargetServiceGenderTarget genderTarget) {
    this.genderTarget = JsonNullable.of(genderTarget);
    return this;
  }

  /**
   * Get genderTarget
   * @return genderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceGenderTarget> getGenderTarget() {
    return genderTarget;
  }

  public void setGenderTarget(JsonNullable<AdGroupTargetServiceGenderTarget> genderTarget) {
    this.genderTarget = genderTarget;
  }

  public AdGroupTargetServiceTarget geoTarget(AdGroupTargetServiceGeoTarget geoTarget) {
    this.geoTarget = JsonNullable.of(geoTarget);
    return this;
  }

  /**
   * Get geoTarget
   * @return geoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceGeoTarget> getGeoTarget() {
    return geoTarget;
  }

  public void setGeoTarget(JsonNullable<AdGroupTargetServiceGeoTarget> geoTarget) {
    this.geoTarget = geoTarget;
  }

  public AdGroupTargetServiceTarget interestCategoryTarget(AdGroupTargetServiceInterestCategoryTarget interestCategoryTarget) {
    this.interestCategoryTarget = JsonNullable.of(interestCategoryTarget);
    return this;
  }

  /**
   * Get interestCategoryTarget
   * @return interestCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceInterestCategoryTarget> getInterestCategoryTarget() {
    return interestCategoryTarget;
  }

  public void setInterestCategoryTarget(JsonNullable<AdGroupTargetServiceInterestCategoryTarget> interestCategoryTarget) {
    this.interestCategoryTarget = interestCategoryTarget;
  }

  public AdGroupTargetServiceTarget isRemove(Boolean isRemove) {
    this.isRemove = JsonNullable.of(isRemove);
    return this;
  }

  /**
   * <div lang=\"ja\"> trueの場合、ターゲティング種別をすべて削除します。<br> このフィールドは、ADD、SETおよびREMOVE時は無視され、REPLACE時は省略可能となります。 </div> <div lang=\"en\"> If true, delete all targeting types.<br> This field will be ignored in ADD, SET and REMOVE operation, and will be optional in REPLACE operation. </div> 
   * @return isRemove
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> trueの場合、ターゲティング種別をすべて削除します。<br> このフィールドは、ADD、SETおよびREMOVE時は無視され、REPLACE時は省略可能となります。 </div> <div lang=\"en\"> If true, delete all targeting types.<br> This field will be ignored in ADD, SET and REMOVE operation, and will be optional in REPLACE operation. </div> ")


  public JsonNullable<Boolean> getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(JsonNullable<Boolean> isRemove) {
    this.isRemove = isRemove;
  }

  public AdGroupTargetServiceTarget osTarget(AdGroupTargetServiceOsTarget osTarget) {
    this.osTarget = JsonNullable.of(osTarget);
    return this;
  }

  /**
   * Get osTarget
   * @return osTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceOsTarget> getOsTarget() {
    return osTarget;
  }

  public void setOsTarget(JsonNullable<AdGroupTargetServiceOsTarget> osTarget) {
    this.osTarget = osTarget;
  }

  public AdGroupTargetServiceTarget osVersionTarget(AdGroupTargetServiceOsVersionTarget osVersionTarget) {
    this.osVersionTarget = JsonNullable.of(osVersionTarget);
    return this;
  }

  /**
   * Get osVersionTarget
   * @return osVersionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceOsVersionTarget> getOsVersionTarget() {
    return osVersionTarget;
  }

  public void setOsVersionTarget(JsonNullable<AdGroupTargetServiceOsVersionTarget> osVersionTarget) {
    this.osVersionTarget = osVersionTarget;
  }

  public AdGroupTargetServiceTarget placementTarget(AdGroupTargetServicePlacementTarget placementTarget) {
    this.placementTarget = JsonNullable.of(placementTarget);
    return this;
  }

  /**
   * Get placementTarget
   * @return placementTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServicePlacementTarget> getPlacementTarget() {
    return placementTarget;
  }

  public void setPlacementTarget(JsonNullable<AdGroupTargetServicePlacementTarget> placementTarget) {
    this.placementTarget = placementTarget;
  }

  public AdGroupTargetServiceTarget searchTarget(AdGroupTargetServiceSearchTarget searchTarget) {
    this.searchTarget = JsonNullable.of(searchTarget);
    return this;
  }

  /**
   * Get searchTarget
   * @return searchTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceSearchTarget> getSearchTarget() {
    return searchTarget;
  }

  public void setSearchTarget(JsonNullable<AdGroupTargetServiceSearchTarget> searchTarget) {
    this.searchTarget = searchTarget;
  }

  public AdGroupTargetServiceTarget siteCategoryTarget(AdGroupTargetServiceSiteCategoryTarget siteCategoryTarget) {
    this.siteCategoryTarget = JsonNullable.of(siteCategoryTarget);
    return this;
  }

  /**
   * Get siteCategoryTarget
   * @return siteCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceSiteCategoryTarget> getSiteCategoryTarget() {
    return siteCategoryTarget;
  }

  public void setSiteCategoryTarget(JsonNullable<AdGroupTargetServiceSiteCategoryTarget> siteCategoryTarget) {
    this.siteCategoryTarget = siteCategoryTarget;
  }

  public AdGroupTargetServiceTarget siteRetargetingTarget(AdGroupTargetServiceSiteRetargetingTarget siteRetargetingTarget) {
    this.siteRetargetingTarget = JsonNullable.of(siteRetargetingTarget);
    return this;
  }

  /**
   * Get siteRetargetingTarget
   * @return siteRetargetingTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceSiteRetargetingTarget> getSiteRetargetingTarget() {
    return siteRetargetingTarget;
  }

  public void setSiteRetargetingTarget(JsonNullable<AdGroupTargetServiceSiteRetargetingTarget> siteRetargetingTarget) {
    this.siteRetargetingTarget = siteRetargetingTarget;
  }

  public AdGroupTargetServiceTarget positionTarget(AdGroupTargetServicePositionTarget positionTarget) {
    this.positionTarget = JsonNullable.of(positionTarget);
    return this;
  }

  /**
   * Get positionTarget
   * @return positionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServicePositionTarget> getPositionTarget() {
    return positionTarget;
  }

  public void setPositionTarget(JsonNullable<AdGroupTargetServicePositionTarget> positionTarget) {
    this.positionTarget = positionTarget;
  }

  public AdGroupTargetServiceTarget placementCategoryTarget(AdGroupTargetServicePlacementCategoryTarget placementCategoryTarget) {
    this.placementCategoryTarget = JsonNullable.of(placementCategoryTarget);
    return this;
  }

  /**
   * Get placementCategoryTarget
   * @return placementCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServicePlacementCategoryTarget> getPlacementCategoryTarget() {
    return placementCategoryTarget;
  }

  public void setPlacementCategoryTarget(JsonNullable<AdGroupTargetServicePlacementCategoryTarget> placementCategoryTarget) {
    this.placementCategoryTarget = placementCategoryTarget;
  }

  public AdGroupTargetServiceTarget placementCategoryDetailTarget(AdGroupTargetServicePlacementCategoryDetailTarget placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = JsonNullable.of(placementCategoryDetailTarget);
    return this;
  }

  /**
   * Get placementCategoryDetailTarget
   * @return placementCategoryDetailTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServicePlacementCategoryDetailTarget> getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }

  public void setPlacementCategoryDetailTarget(JsonNullable<AdGroupTargetServicePlacementCategoryDetailTarget> placementCategoryDetailTarget) {
    this.placementCategoryDetailTarget = placementCategoryDetailTarget;
  }

  public AdGroupTargetServiceTarget contentsTarget(AdGroupTargetServiceContentsTarget contentsTarget) {
    this.contentsTarget = JsonNullable.of(contentsTarget);
    return this;
  }

  /**
   * Get contentsTarget
   * @return contentsTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceContentsTarget> getContentsTarget() {
    return contentsTarget;
  }

  public void setContentsTarget(JsonNullable<AdGroupTargetServiceContentsTarget> contentsTarget) {
    this.contentsTarget = contentsTarget;
  }

  public AdGroupTargetServiceTarget targetId(String targetId) {
    this.targetId = JsonNullable.of(targetId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADDおよびREPLACE時は省略可能となり、SETおよびREMOVE時は必須となります。<br> ※ADD時、targetTypeが以下のいずれかの場合は必須です。<br> ‐SITE_RETARGETING<br> ‐PLACEMENT_TARGET<br> ‐SEARCH_TARGET<br> ‐GEO_TARGET<br> ‐INTEREST_CATEGORY<br> ‐SITE_CATEGORY<br> ‐AUDIENCE_CATEGORY_TARGET<br> ‐PLACEMENT_CATEGORY_TARGET<br> -PLACEMENT_CATEGORY_DETAIL_TARGET<br> -CONTENTS_TARGET<br> ※REPLACE時、isRemoveがtrueの場合は設定不要です。<br> <br> ‐SITE_RETARGETING: targetListId<br> ‐PLACEMENT_TARGET: placementUrlListId<br> ‐SEARCH_TARGET: searchKeywordListId<br> ‐GEO_TARGET: IM地域コード(geo)<br> ‐INTEREST_CATEGORY: カテゴリーコード(category)<br> ‐SITE_CATEGORY: カテゴリーコード(category)<br> ‐OS_VERSION_TARGET: osVersion<br> ‐AUDIENCE_CATEGORY_TARGET: オーディエンスカテゴリーコード(audience category)<br> ‐POSITION_TARGET: PositionTypeのコード値<br> ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId<br> -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId<br> -CONTENTS_TARGET: contentsKeywordListId </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD and REPLACE operation, and is required in SET and REMOVE operation.<br> *If targetType is any of the following, this field is required in ADD operation.<br> ‐SITE_RETARGETING<br> ‐PLACEMENT_TARGET<br> ‐SEARCH_TARGET<br> ‐GEO_TARGET<br> ‐INTEREST_CATEGORY<br> ‐SITE_CATEGORY<br> ‐AUDIENCE_CATEGORY_TARGET<br> ‐PLACEMENT_CATEGORY_TARGET<br> -PLACEMENT_CATEGORY_DETAIL_TARGET<br> -CONTENTS_TARGET<br> *If isRemove is true, this field does not need to be set in REPLACE operation.<br> <br> ‐SITE_RETARGETING: targetListId<br> ‐PLACEMENT_TARGET: placementUrlListId<br> ‐SEARCH_TARGET: searchKeywordListId<br> ‐GEO_TARGET: IM area code(geo)<br> ‐INTEREST_CATEGORY: category code(category)<br> ‐SITE_CATEGORY: category code(category)<br> ‐OS_VERSION_TARGET: osVersion<br> ‐AUDIENCE_CATEGORY_TARGET: audience category code(audience category)<br> ‐POSITION_TARGET: PositionType code.<br> ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId<br> -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId<br> -CONTENTS_TARGET: contentsKeywordListId </div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットIDです。<br> このフィールドは、ADDおよびREPLACE時は省略可能となり、SETおよびREMOVE時は必須となります。<br> ※ADD時、targetTypeが以下のいずれかの場合は必須です。<br> ‐SITE_RETARGETING<br> ‐PLACEMENT_TARGET<br> ‐SEARCH_TARGET<br> ‐GEO_TARGET<br> ‐INTEREST_CATEGORY<br> ‐SITE_CATEGORY<br> ‐AUDIENCE_CATEGORY_TARGET<br> ‐PLACEMENT_CATEGORY_TARGET<br> -PLACEMENT_CATEGORY_DETAIL_TARGET<br> -CONTENTS_TARGET<br> ※REPLACE時、isRemoveがtrueの場合は設定不要です。<br> <br> ‐SITE_RETARGETING: targetListId<br> ‐PLACEMENT_TARGET: placementUrlListId<br> ‐SEARCH_TARGET: searchKeywordListId<br> ‐GEO_TARGET: IM地域コード(geo)<br> ‐INTEREST_CATEGORY: カテゴリーコード(category)<br> ‐SITE_CATEGORY: カテゴリーコード(category)<br> ‐OS_VERSION_TARGET: osVersion<br> ‐AUDIENCE_CATEGORY_TARGET: オーディエンスカテゴリーコード(audience category)<br> ‐POSITION_TARGET: PositionTypeのコード値<br> ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId<br> -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId<br> -CONTENTS_TARGET: contentsKeywordListId </div> <div lang=\"en\"> Target ID.<br> This field is optional in ADD and REPLACE operation, and is required in SET and REMOVE operation.<br> *If targetType is any of the following, this field is required in ADD operation.<br> ‐SITE_RETARGETING<br> ‐PLACEMENT_TARGET<br> ‐SEARCH_TARGET<br> ‐GEO_TARGET<br> ‐INTEREST_CATEGORY<br> ‐SITE_CATEGORY<br> ‐AUDIENCE_CATEGORY_TARGET<br> ‐PLACEMENT_CATEGORY_TARGET<br> -PLACEMENT_CATEGORY_DETAIL_TARGET<br> -CONTENTS_TARGET<br> *If isRemove is true, this field does not need to be set in REPLACE operation.<br> <br> ‐SITE_RETARGETING: targetListId<br> ‐PLACEMENT_TARGET: placementUrlListId<br> ‐SEARCH_TARGET: searchKeywordListId<br> ‐GEO_TARGET: IM area code(geo)<br> ‐INTEREST_CATEGORY: category code(category)<br> ‐SITE_CATEGORY: category code(category)<br> ‐OS_VERSION_TARGET: osVersion<br> ‐AUDIENCE_CATEGORY_TARGET: audience category code(audience category)<br> ‐POSITION_TARGET: PositionType code.<br> ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId<br> -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId<br> -CONTENTS_TARGET: contentsKeywordListId </div> ")


  public JsonNullable<String> getTargetId() {
    return targetId;
  }

  public void setTargetId(JsonNullable<String> targetId) {
    this.targetId = targetId;
  }

  public AdGroupTargetServiceTarget targetType(AdGroupTargetServiceTargetType targetType) {
    this.targetType = JsonNullable.of(targetType);
    return this;
  }

  /**
   * Get targetType
   * @return targetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceTargetType> getTargetType() {
    return targetType;
  }

  public void setTargetType(JsonNullable<AdGroupTargetServiceTargetType> targetType) {
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
    AdGroupTargetServiceTarget adGroupTargetServiceTarget = (AdGroupTargetServiceTarget) o;
    return Objects.equals(this.adScheduleTarget, adGroupTargetServiceTarget.adScheduleTarget) &&
        Objects.equals(this.ageTarget, adGroupTargetServiceTarget.ageTarget) &&
        Objects.equals(this.appTarget, adGroupTargetServiceTarget.appTarget) &&
        Objects.equals(this.audienceCategoryTarget, adGroupTargetServiceTarget.audienceCategoryTarget) &&
        Objects.equals(this.carrierTarget, adGroupTargetServiceTarget.carrierTarget) &&
        Objects.equals(this.deviceTarget, adGroupTargetServiceTarget.deviceTarget) &&
        Objects.equals(this.genderTarget, adGroupTargetServiceTarget.genderTarget) &&
        Objects.equals(this.geoTarget, adGroupTargetServiceTarget.geoTarget) &&
        Objects.equals(this.interestCategoryTarget, adGroupTargetServiceTarget.interestCategoryTarget) &&
        Objects.equals(this.isRemove, adGroupTargetServiceTarget.isRemove) &&
        Objects.equals(this.osTarget, adGroupTargetServiceTarget.osTarget) &&
        Objects.equals(this.osVersionTarget, adGroupTargetServiceTarget.osVersionTarget) &&
        Objects.equals(this.placementTarget, adGroupTargetServiceTarget.placementTarget) &&
        Objects.equals(this.searchTarget, adGroupTargetServiceTarget.searchTarget) &&
        Objects.equals(this.siteCategoryTarget, adGroupTargetServiceTarget.siteCategoryTarget) &&
        Objects.equals(this.siteRetargetingTarget, adGroupTargetServiceTarget.siteRetargetingTarget) &&
        Objects.equals(this.positionTarget, adGroupTargetServiceTarget.positionTarget) &&
        Objects.equals(this.placementCategoryTarget, adGroupTargetServiceTarget.placementCategoryTarget) &&
        Objects.equals(this.placementCategoryDetailTarget, adGroupTargetServiceTarget.placementCategoryDetailTarget) &&
        Objects.equals(this.contentsTarget, adGroupTargetServiceTarget.contentsTarget) &&
        Objects.equals(this.targetId, adGroupTargetServiceTarget.targetId) &&
        Objects.equals(this.targetType, adGroupTargetServiceTarget.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adScheduleTarget, ageTarget, appTarget, audienceCategoryTarget, carrierTarget, deviceTarget, genderTarget, geoTarget, interestCategoryTarget, isRemove, osTarget, osVersionTarget, placementTarget, searchTarget, siteCategoryTarget, siteRetargetingTarget, positionTarget, placementCategoryTarget, placementCategoryDetailTarget, contentsTarget, targetId, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceTarget {\n");
    
    sb.append("    adScheduleTarget: ").append(toIndentedString(adScheduleTarget)).append("\n");
    sb.append("    ageTarget: ").append(toIndentedString(ageTarget)).append("\n");
    sb.append("    appTarget: ").append(toIndentedString(appTarget)).append("\n");
    sb.append("    audienceCategoryTarget: ").append(toIndentedString(audienceCategoryTarget)).append("\n");
    sb.append("    carrierTarget: ").append(toIndentedString(carrierTarget)).append("\n");
    sb.append("    deviceTarget: ").append(toIndentedString(deviceTarget)).append("\n");
    sb.append("    genderTarget: ").append(toIndentedString(genderTarget)).append("\n");
    sb.append("    geoTarget: ").append(toIndentedString(geoTarget)).append("\n");
    sb.append("    interestCategoryTarget: ").append(toIndentedString(interestCategoryTarget)).append("\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    osTarget: ").append(toIndentedString(osTarget)).append("\n");
    sb.append("    osVersionTarget: ").append(toIndentedString(osVersionTarget)).append("\n");
    sb.append("    placementTarget: ").append(toIndentedString(placementTarget)).append("\n");
    sb.append("    searchTarget: ").append(toIndentedString(searchTarget)).append("\n");
    sb.append("    siteCategoryTarget: ").append(toIndentedString(siteCategoryTarget)).append("\n");
    sb.append("    siteRetargetingTarget: ").append(toIndentedString(siteRetargetingTarget)).append("\n");
    sb.append("    positionTarget: ").append(toIndentedString(positionTarget)).append("\n");
    sb.append("    placementCategoryTarget: ").append(toIndentedString(placementCategoryTarget)).append("\n");
    sb.append("    placementCategoryDetailTarget: ").append(toIndentedString(placementCategoryDetailTarget)).append("\n");
    sb.append("    contentsTarget: ").append(toIndentedString(contentsTarget)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceAgeTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceAppTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceAudienceListTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceContentsTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceGenderTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceGeoTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceOsTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceOsVersionTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServicePlacementCategoryDetailTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServicePlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServicePlacementTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServicePositionTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceSearchTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceSiteCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceTargetSetting;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupTargetServiceTargetType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceTargetオブジェクトは、ターゲティング設定情報を保持します。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceTarget object is a container for storing targeting settings.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupTargetServiceTarget.JSON_PROPERTY_AD_SCHEDULE_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_AGE_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_APP_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_DEVICE_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_GENDER_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_GEO_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_IS_REMOVE,
  AdGroupTargetServiceTarget.JSON_PROPERTY_OS_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_OS_VERSION_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_PLACEMENT_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_SEARCH_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_SITE_CATEGORY_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_AUDIENCE_LIST_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_POSITION_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_PLACEMENT_CATEGORY_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_PLACEMENT_CATEGORY_DETAIL_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_CONTENTS_TARGET,
  AdGroupTargetServiceTarget.JSON_PROPERTY_TARGET_ID,
  AdGroupTargetServiceTarget.JSON_PROPERTY_TARGET_SETTING,
  AdGroupTargetServiceTarget.JSON_PROPERTY_TARGET_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServiceTarget {
  public static final String JSON_PROPERTY_AD_SCHEDULE_TARGET = "adScheduleTarget";
  private AdGroupTargetServiceAdScheduleTarget adScheduleTarget;

  public static final String JSON_PROPERTY_AGE_TARGET = "ageTarget";
  private AdGroupTargetServiceAgeTarget ageTarget;

  public static final String JSON_PROPERTY_APP_TARGET = "appTarget";
  private AdGroupTargetServiceAppTarget appTarget;

  public static final String JSON_PROPERTY_DEVICE_TARGET = "deviceTarget";
  private AdGroupTargetServiceDeviceTarget deviceTarget;

  public static final String JSON_PROPERTY_GENDER_TARGET = "genderTarget";
  private AdGroupTargetServiceGenderTarget genderTarget;

  public static final String JSON_PROPERTY_GEO_TARGET = "geoTarget";
  private AdGroupTargetServiceGeoTarget geoTarget;

  public static final String JSON_PROPERTY_IS_REMOVE = "isRemove";
  private Boolean isRemove;

  public static final String JSON_PROPERTY_OS_TARGET = "osTarget";
  private AdGroupTargetServiceOsTarget osTarget;

  public static final String JSON_PROPERTY_OS_VERSION_TARGET = "osVersionTarget";
  private AdGroupTargetServiceOsVersionTarget osVersionTarget;

  public static final String JSON_PROPERTY_PLACEMENT_TARGET = "placementTarget";
  private AdGroupTargetServicePlacementTarget placementTarget;

  public static final String JSON_PROPERTY_SEARCH_TARGET = "searchTarget";
  private AdGroupTargetServiceSearchTarget searchTarget;

  public static final String JSON_PROPERTY_SITE_CATEGORY_TARGET = "siteCategoryTarget";
  private AdGroupTargetServiceSiteCategoryTarget siteCategoryTarget;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_TARGET = "audienceListTarget";
  private AdGroupTargetServiceAudienceListTarget audienceListTarget;

  public static final String JSON_PROPERTY_POSITION_TARGET = "positionTarget";
  private AdGroupTargetServicePositionTarget positionTarget;

  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_TARGET = "placementCategoryTarget";
  private AdGroupTargetServicePlacementCategoryTarget placementCategoryTarget;

  public static final String JSON_PROPERTY_PLACEMENT_CATEGORY_DETAIL_TARGET = "placementCategoryDetailTarget";
  private AdGroupTargetServicePlacementCategoryDetailTarget placementCategoryDetailTarget;

  public static final String JSON_PROPERTY_CONTENTS_TARGET = "contentsTarget";
  private AdGroupTargetServiceContentsTarget contentsTarget;

  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private String targetId;

  public static final String JSON_PROPERTY_TARGET_SETTING = "targetSetting";
  private AdGroupTargetServiceTargetSetting targetSetting;

  public static final String JSON_PROPERTY_TARGET_TYPE = "targetType";
  private AdGroupTargetServiceTargetType targetType;

  public AdGroupTargetServiceTarget() {
  }

  public AdGroupTargetServiceTarget adScheduleTarget(AdGroupTargetServiceAdScheduleTarget adScheduleTarget) {
    
    this.adScheduleTarget = adScheduleTarget;
    return this;
  }

   /**
   * Get adScheduleTarget
   * @return adScheduleTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_SCHEDULE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceAdScheduleTarget getAdScheduleTarget() {
    return adScheduleTarget;
  }


  @JsonProperty(JSON_PROPERTY_AD_SCHEDULE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceAgeTarget getAgeTarget() {
    return ageTarget;
  }


  @JsonProperty(JSON_PROPERTY_AGE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceAppTarget getAppTarget() {
    return appTarget;
  }


  @JsonProperty(JSON_PROPERTY_APP_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppTarget(AdGroupTargetServiceAppTarget appTarget) {
    this.appTarget = appTarget;
  }


  public AdGroupTargetServiceTarget deviceTarget(AdGroupTargetServiceDeviceTarget deviceTarget) {
    
    this.deviceTarget = deviceTarget;
    return this;
  }

   /**
   * Get deviceTarget
   * @return deviceTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceDeviceTarget getDeviceTarget() {
    return deviceTarget;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceGenderTarget getGenderTarget() {
    return genderTarget;
  }


  @JsonProperty(JSON_PROPERTY_GENDER_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceGeoTarget getGeoTarget() {
    return geoTarget;
  }


  @JsonProperty(JSON_PROPERTY_GEO_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoTarget(AdGroupTargetServiceGeoTarget geoTarget) {
    this.geoTarget = geoTarget;
  }


  public AdGroupTargetServiceTarget isRemove(Boolean isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; trueの場合、ターゲティング種別をすべて削除します。&lt;br&gt; このフィールドは、ADD、SETおよびREMOVE時は無視され、REPLACE時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; If true, delete all targeting types.&lt;br&gt; This field will be ignored in ADD, SET and REMOVE operation, and will be optional in REPLACE operation. &lt;/div&gt; 
   * @return isRemove
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRemove() {
    return isRemove;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceOsTarget getOsTarget() {
    return osTarget;
  }


  @JsonProperty(JSON_PROPERTY_OS_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceOsVersionTarget getOsVersionTarget() {
    return osVersionTarget;
  }


  @JsonProperty(JSON_PROPERTY_OS_VERSION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEMENT_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServicePlacementTarget getPlacementTarget() {
    return placementTarget;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceSearchTarget getSearchTarget() {
    return searchTarget;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SITE_CATEGORY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceSiteCategoryTarget getSiteCategoryTarget() {
    return siteCategoryTarget;
  }


  @JsonProperty(JSON_PROPERTY_SITE_CATEGORY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceAudienceListTarget getAudienceListTarget() {
    return audienceListTarget;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServicePositionTarget getPositionTarget() {
    return positionTarget;
  }


  @JsonProperty(JSON_PROPERTY_POSITION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServicePlacementCategoryTarget getPlacementCategoryTarget() {
    return placementCategoryTarget;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_DETAIL_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServicePlacementCategoryDetailTarget getPlacementCategoryDetailTarget() {
    return placementCategoryDetailTarget;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_CATEGORY_DETAIL_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceContentsTarget getContentsTarget() {
    return contentsTarget;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsTarget(AdGroupTargetServiceContentsTarget contentsTarget) {
    this.contentsTarget = contentsTarget;
  }


  public AdGroupTargetServiceTarget targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ターゲットIDです。&lt;br&gt; このフィールドは、ADDおよびREPLACE時は省略可能となり、SETおよびREMOVE時は必須となります。&lt;br&gt; ※ADD時、targetTypeが以下のいずれかの場合は必須です。&lt;br&gt; ‐AUDIENCE_LIST_TARGET&lt;br&gt; ‐PLACEMENT_TARGET&lt;br&gt; ‐SEARCH_TARGET&lt;br&gt; ‐GEO_TARGET(AdGroupTargetServiceGeoTarget.areaSearchTypeが&#x60;GEO&#x60;（地域指定）の場合)&lt;br&gt; ‐SITE_CATEGORY&lt;br&gt; ‐PLACEMENT_CATEGORY_TARGET&lt;br&gt; -PLACEMENT_CATEGORY_DETAIL_TARGET&lt;br&gt; -CONTENTS_TARGET&lt;br&gt; ※REPLACE時、isRemoveがtrueの場合は設定不要です。&lt;br&gt; &lt;br&gt; ‐AUDIENCE_LIST_TARGET: audienceListId&lt;br&gt; ‐PLACEMENT_TARGET: placementUrlListId&lt;br&gt; ‐SEARCH_TARGET: searchKeywordListId&lt;br&gt; ‐GEO_TARGET: IM地域コード(geo)&lt;br&gt; *When AdGroupTargetServiceGeoTarget.areaSearchType is &#x60;GEO&#x60; (regional specification)&lt;br&gt; ‐SITE_CATEGORY: カテゴリーコード(category)&lt;br&gt; ‐OS_VERSION_TARGET: osVersion&lt;br&gt; ‐POSITION_TARGET: PositionTypeのコード値&lt;br&gt; ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId&lt;br&gt; -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId&lt;br&gt; -CONTENTS_TARGET: contentsKeywordListId &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target ID.&lt;br&gt; This field is optional in ADD and REPLACE operation, and is required in SET and REMOVE operation.&lt;br&gt; *If targetType is any of the following, this field is required in ADD operation.&lt;br&gt; ‐AUDIENCE_LIST_TARGET&lt;br&gt; ‐PLACEMENT_TARGET&lt;br&gt; ‐SEARCH_TARGET&lt;br&gt; ‐GEO_TARGET&lt;br&gt; ‐SITE_CATEGORY&lt;br&gt; ‐PLACEMENT_CATEGORY_TARGET&lt;br&gt; -PLACEMENT_CATEGORY_DETAIL_TARGET&lt;br&gt; -CONTENTS_TARGET&lt;br&gt; *If isRemove is true, this field does not need to be set in REPLACE operation.&lt;br&gt; &lt;br&gt; ‐AUDIENCE_LIST_TARGET: audienceListId&lt;br&gt; ‐PLACEMENT_TARGET: placementUrlListId&lt;br&gt; ‐SEARCH_TARGET: searchKeywordListId&lt;br&gt; ‐GEO_TARGET: IM area code(geo)&lt;br&gt; ‐SITE_CATEGORY: category code(category)&lt;br&gt; ‐OS_VERSION_TARGET: osVersion&lt;br&gt; ‐POSITION_TARGET: PositionType code.&lt;br&gt; ‐PLACEMENT_CATEGORY_TARGET: placementCategoryListId&lt;br&gt; -PLACEMENT_CATEGORY_DETAIL_TARGET: placementCategoryId&lt;br&gt; -CONTENTS_TARGET: contentsKeywordListId &lt;/div&gt; 
   * @return targetId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupTargetServiceTarget targetSetting(AdGroupTargetServiceTargetSetting targetSetting) {
    
    this.targetSetting = targetSetting;
    return this;
  }

   /**
   * Get targetSetting
   * @return targetSetting
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceTargetSetting getTargetSetting() {
    return targetSetting;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceTargetType getTargetType() {
    return targetType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    return Objects.hash(adScheduleTarget, ageTarget, appTarget, deviceTarget, genderTarget, geoTarget, isRemove, osTarget, osVersionTarget, placementTarget, searchTarget, siteCategoryTarget, audienceListTarget, positionTarget, placementCategoryTarget, placementCategoryDetailTarget, contentsTarget, targetId, targetSetting, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceTarget {\n");
    sb.append("    adScheduleTarget: ").append(toIndentedString(adScheduleTarget)).append("\n");
    sb.append("    ageTarget: ").append(toIndentedString(ageTarget)).append("\n");
    sb.append("    appTarget: ").append(toIndentedString(appTarget)).append("\n");
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


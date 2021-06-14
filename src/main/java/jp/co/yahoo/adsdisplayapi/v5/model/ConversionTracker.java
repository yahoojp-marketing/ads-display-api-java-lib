package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceAppConversion;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceCountingType;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceType;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceWebConversion;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.</div> ")

public class ConversionTracker   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("allConversionValue")
  private JsonNullable<String> allConversionValue = JsonNullable.undefined();

  @JsonProperty("allConversions")
  private JsonNullable<Long> allConversions = JsonNullable.undefined();

  @JsonProperty("viewThroughConversions")
  private JsonNullable<Long> viewThroughConversions = JsonNullable.undefined();

  @JsonProperty("appConversion")
  private JsonNullable<ConversionTrackerServiceAppConversion> appConversion = JsonNullable.undefined();

  @JsonProperty("category")
  private JsonNullable<ConversionTrackerServiceCategory> category = JsonNullable.undefined();

  @JsonProperty("conversionTrackerId")
  private JsonNullable<Long> conversionTrackerId = JsonNullable.undefined();

  @JsonProperty("conversionTrackerName")
  private JsonNullable<String> conversionTrackerName = JsonNullable.undefined();

  @JsonProperty("conversionTrackerType")
  private JsonNullable<ConversionTrackerServiceType> conversionTrackerType = JsonNullable.undefined();

  @JsonProperty("conversionValue")
  private JsonNullable<String> conversionValue = JsonNullable.undefined();

  @JsonProperty("conversionValueViaAdClick")
  private JsonNullable<String> conversionValueViaAdClick = JsonNullable.undefined();

  @JsonProperty("conversions")
  private JsonNullable<Long> conversions = JsonNullable.undefined();

  @JsonProperty("conversionsViaAdClick")
  private JsonNullable<Long> conversionsViaAdClick = JsonNullable.undefined();

  @JsonProperty("countingType")
  private JsonNullable<ConversionTrackerServiceCountingType> countingType = JsonNullable.undefined();

  @JsonProperty("crossDeviceConversions")
  private JsonNullable<Long> crossDeviceConversions = JsonNullable.undefined();

  @JsonProperty("excludeFromBidding")
  private JsonNullable<ConversionTrackerServiceExcludeFromBidding> excludeFromBidding = JsonNullable.undefined();

  @JsonProperty("measurementPeriod")
  private JsonNullable<Integer> measurementPeriod = JsonNullable.undefined();

  @JsonProperty("measurementPeriodView")
  private JsonNullable<Integer> measurementPeriodView = JsonNullable.undefined();

  @JsonProperty("mostRecentConversionDate")
  private JsonNullable<String> mostRecentConversionDate = JsonNullable.undefined();

  @JsonProperty("status")
  private JsonNullable<ConversionTrackerServiceStatus> status = JsonNullable.undefined();

  @JsonProperty("userRevenueValue")
  private JsonNullable<Long> userRevenueValue = JsonNullable.undefined();

  @JsonProperty("webConversion")
  private JsonNullable<ConversionTrackerServiceWebConversion> webConversion = JsonNullable.undefined();

  public ConversionTracker accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public ConversionTracker allConversionValue(String allConversionValue) {
    this.allConversionValue = JsonNullable.of(allConversionValue);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンの価値（全て）です。 </div> <div lang=\"en\"> Conv. value (all). </div> 
   * @return allConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値（全て）です。 </div> <div lang=\"en\"> Conv. value (all). </div> ")


  public JsonNullable<String> getAllConversionValue() {
    return allConversionValue;
  }

  public void setAllConversionValue(JsonNullable<String> allConversionValue) {
    this.allConversionValue = allConversionValue;
  }

  public ConversionTracker allConversions(Long allConversions) {
    this.allConversions = JsonNullable.of(allConversions);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョン数（全て）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (all).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return allConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数（全て）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (all).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAllConversions() {
    return allConversions;
  }

  public void setAllConversions(JsonNullable<Long> allConversions) {
    this.allConversions = allConversions;
  }

  public ConversionTracker viewThroughConversions(Long viewThroughConversions) {
    this.viewThroughConversions = JsonNullable.of(viewThroughConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> 
   * @return viewThroughConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> ")


  public JsonNullable<Long> getViewThroughConversions() {
    return viewThroughConversions;
  }

  public void setViewThroughConversions(JsonNullable<Long> viewThroughConversions) {
    this.viewThroughConversions = viewThroughConversions;
  }

  public ConversionTracker appConversion(ConversionTrackerServiceAppConversion appConversion) {
    this.appConversion = JsonNullable.of(appConversion);
    return this;
  }

  /**
   * Get appConversion
   * @return appConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppConversion> getAppConversion() {
    return appConversion;
  }

  public void setAppConversion(JsonNullable<ConversionTrackerServiceAppConversion> appConversion) {
    this.appConversion = appConversion;
  }

  public ConversionTracker category(ConversionTrackerServiceCategory category) {
    this.category = JsonNullable.of(category);
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceCategory> getCategory() {
    return category;
  }

  public void setCategory(JsonNullable<ConversionTrackerServiceCategory> category) {
    this.category = category;
  }

  public ConversionTracker conversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = JsonNullable.of(conversionTrackerId);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョントラッカーIDです。<br> このフィールドは、ADD時は無視され、SET時は必須となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field will be ignored in ADD operation, and will be required in SET operation. </div> 
   * @return conversionTrackerId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカーIDです。<br> このフィールドは、ADD時は無視され、SET時は必須となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field will be ignored in ADD operation, and will be required in SET operation. </div> ")


  public JsonNullable<Long> getConversionTrackerId() {
    return conversionTrackerId;
  }

  public void setConversionTrackerId(JsonNullable<Long> conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }

  public ConversionTracker conversionTrackerName(String conversionTrackerName) {
    this.conversionTrackerName = JsonNullable.of(conversionTrackerName);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョントラッカー名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Tracker Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return conversionTrackerName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカー名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Tracker Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getConversionTrackerName() {
    return conversionTrackerName;
  }

  public void setConversionTrackerName(JsonNullable<String> conversionTrackerName) {
    this.conversionTrackerName = conversionTrackerName;
  }

  public ConversionTracker conversionTrackerType(ConversionTrackerServiceType conversionTrackerType) {
    this.conversionTrackerType = JsonNullable.of(conversionTrackerType);
    return this;
  }

  /**
   * Get conversionTrackerType
   * @return conversionTrackerType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceType> getConversionTrackerType() {
    return conversionTrackerType;
  }

  public void setConversionTrackerType(JsonNullable<ConversionTrackerServiceType> conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }

  public ConversionTracker conversionValue(String conversionValue) {
    this.conversionValue = JsonNullable.of(conversionValue);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンの価値/コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value/conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値/コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value/conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getConversionValue() {
    return conversionValue;
  }

  public void setConversionValue(JsonNullable<String> conversionValue) {
    this.conversionValue = conversionValue;
  }

  public ConversionTracker conversionValueViaAdClick(String conversionValueViaAdClick) {
    this.conversionValueViaAdClick = JsonNullable.of(conversionValueViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンの価値（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversionValueViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getConversionValueViaAdClick() {
    return conversionValueViaAdClick;
  }

  public void setConversionValueViaAdClick(JsonNullable<String> conversionValueViaAdClick) {
    this.conversionValueViaAdClick = conversionValueViaAdClick;
  }

  public ConversionTracker conversions(Long conversions) {
    this.conversions = JsonNullable.of(conversions);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getConversions() {
    return conversions;
  }

  public void setConversions(JsonNullable<Long> conversions) {
    this.conversions = conversions;
  }

  public ConversionTracker conversionsViaAdClick(Long conversionsViaAdClick) {
    this.conversionsViaAdClick = JsonNullable.of(conversionsViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョン数（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversionsViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getConversionsViaAdClick() {
    return conversionsViaAdClick;
  }

  public void setConversionsViaAdClick(JsonNullable<Long> conversionsViaAdClick) {
    this.conversionsViaAdClick = conversionsViaAdClick;
  }

  public ConversionTracker countingType(ConversionTrackerServiceCountingType countingType) {
    this.countingType = JsonNullable.of(countingType);
    return this;
  }

  /**
   * Get countingType
   * @return countingType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceCountingType> getCountingType() {
    return countingType;
  }

  public void setCountingType(JsonNullable<ConversionTrackerServiceCountingType> countingType) {
    this.countingType = countingType;
  }

  public ConversionTracker crossDeviceConversions(Long crossDeviceConversions) {
    this.crossDeviceConversions = JsonNullable.of(crossDeviceConversions);
    return this;
  }

  /**
   * <div lang=\"ja\"> クロスデバイスコンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Cross-device conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return crossDeviceConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> クロスデバイスコンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Cross-device conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getCrossDeviceConversions() {
    return crossDeviceConversions;
  }

  public void setCrossDeviceConversions(JsonNullable<Long> crossDeviceConversions) {
    this.crossDeviceConversions = crossDeviceConversions;
  }

  public ConversionTracker excludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = JsonNullable.of(excludeFromBidding);
    return this;
  }

  /**
   * Get excludeFromBidding
   * @return excludeFromBidding
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceExcludeFromBidding> getExcludeFromBidding() {
    return excludeFromBidding;
  }

  public void setExcludeFromBidding(JsonNullable<ConversionTrackerServiceExcludeFromBidding> excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
  }

  public ConversionTracker measurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = JsonNullable.of(measurementPeriod);
    return this;
  }

  /**
   * <div lang=\"ja\"> 計測期間（単位：日）です。<br> ※7～90の範囲内で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は30となります。 </div> <div lang=\"en\"> Counting period (Unit: Day).<br> ∗ Can be specified within the range of 7 to 90 days.<br> This field is optional in requests. The default value in ADD operation will be 30. </div> 
   * @return measurementPeriod
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 計測期間（単位：日）です。<br> ※7～90の範囲内で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は30となります。 </div> <div lang=\"en\"> Counting period (Unit: Day).<br> ∗ Can be specified within the range of 7 to 90 days.<br> This field is optional in requests. The default value in ADD operation will be 30. </div> ")


  public JsonNullable<Integer> getMeasurementPeriod() {
    return measurementPeriod;
  }

  public void setMeasurementPeriod(JsonNullable<Integer> measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
  }

  public ConversionTracker measurementPeriodView(Integer measurementPeriodView) {
    this.measurementPeriodView = JsonNullable.of(measurementPeriodView);
    return this;
  }

  /**
   * <div lang=\"ja\"> 測定期間（動画視聴）<br> ※1-30の範囲で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は1となります。 </div> <div lang=\"en\"> Counting period (Video view).<br> ∗ Can be specified within the range of 1 to 30.<br> This field is optional in requests. The default value in ADD operation will be 1. </div> 
   * @return measurementPeriodView
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 測定期間（動画視聴）<br> ※1-30の範囲で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は1となります。 </div> <div lang=\"en\"> Counting period (Video view).<br> ∗ Can be specified within the range of 1 to 30.<br> This field is optional in requests. The default value in ADD operation will be 1. </div> ")


  public JsonNullable<Integer> getMeasurementPeriodView() {
    return measurementPeriodView;
  }

  public void setMeasurementPeriodView(JsonNullable<Integer> measurementPeriodView) {
    this.measurementPeriodView = measurementPeriodView;
  }

  public ConversionTracker mostRecentConversionDate(String mostRecentConversionDate) {
    this.mostRecentConversionDate = JsonNullable.of(mostRecentConversionDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンが発生した直近の日付です。<br> ※YYYYMMDD形式です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date of the most recent conversion.<br> ∗ Format: YYYYMMDD.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return mostRecentConversionDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンが発生した直近の日付です。<br> ※YYYYMMDD形式です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date of the most recent conversion.<br> ∗ Format: YYYYMMDD.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getMostRecentConversionDate() {
    return mostRecentConversionDate;
  }

  public void setMostRecentConversionDate(JsonNullable<String> mostRecentConversionDate) {
    this.mostRecentConversionDate = mostRecentConversionDate;
  }

  public ConversionTracker status(ConversionTrackerServiceStatus status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceStatus> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<ConversionTrackerServiceStatus> status) {
    this.status = status;
  }

  public ConversionTracker userRevenueValue(Long userRevenueValue) {
    this.userRevenueValue = JsonNullable.of(userRevenueValue);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンの収益値です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は0となります。 </div> <div lang=\"en\"> Revenue value for Conversions.<br> This field is optional in requests. The default value in ADD operation will be 0. </div> 
   * @return userRevenueValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの収益値です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は0となります。 </div> <div lang=\"en\"> Revenue value for Conversions.<br> This field is optional in requests. The default value in ADD operation will be 0. </div> ")


  public JsonNullable<Long> getUserRevenueValue() {
    return userRevenueValue;
  }

  public void setUserRevenueValue(JsonNullable<Long> userRevenueValue) {
    this.userRevenueValue = userRevenueValue;
  }

  public ConversionTracker webConversion(ConversionTrackerServiceWebConversion webConversion) {
    this.webConversion = JsonNullable.of(webConversion);
    return this;
  }

  /**
   * Get webConversion
   * @return webConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceWebConversion> getWebConversion() {
    return webConversion;
  }

  public void setWebConversion(JsonNullable<ConversionTrackerServiceWebConversion> webConversion) {
    this.webConversion = webConversion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTracker conversionTracker = (ConversionTracker) o;
    return Objects.equals(this.accountId, conversionTracker.accountId) &&
        Objects.equals(this.allConversionValue, conversionTracker.allConversionValue) &&
        Objects.equals(this.allConversions, conversionTracker.allConversions) &&
        Objects.equals(this.viewThroughConversions, conversionTracker.viewThroughConversions) &&
        Objects.equals(this.appConversion, conversionTracker.appConversion) &&
        Objects.equals(this.category, conversionTracker.category) &&
        Objects.equals(this.conversionTrackerId, conversionTracker.conversionTrackerId) &&
        Objects.equals(this.conversionTrackerName, conversionTracker.conversionTrackerName) &&
        Objects.equals(this.conversionTrackerType, conversionTracker.conversionTrackerType) &&
        Objects.equals(this.conversionValue, conversionTracker.conversionValue) &&
        Objects.equals(this.conversionValueViaAdClick, conversionTracker.conversionValueViaAdClick) &&
        Objects.equals(this.conversions, conversionTracker.conversions) &&
        Objects.equals(this.conversionsViaAdClick, conversionTracker.conversionsViaAdClick) &&
        Objects.equals(this.countingType, conversionTracker.countingType) &&
        Objects.equals(this.crossDeviceConversions, conversionTracker.crossDeviceConversions) &&
        Objects.equals(this.excludeFromBidding, conversionTracker.excludeFromBidding) &&
        Objects.equals(this.measurementPeriod, conversionTracker.measurementPeriod) &&
        Objects.equals(this.measurementPeriodView, conversionTracker.measurementPeriodView) &&
        Objects.equals(this.mostRecentConversionDate, conversionTracker.mostRecentConversionDate) &&
        Objects.equals(this.status, conversionTracker.status) &&
        Objects.equals(this.userRevenueValue, conversionTracker.userRevenueValue) &&
        Objects.equals(this.webConversion, conversionTracker.webConversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, allConversionValue, allConversions, viewThroughConversions, appConversion, category, conversionTrackerId, conversionTrackerName, conversionTrackerType, conversionValue, conversionValueViaAdClick, conversions, conversionsViaAdClick, countingType, crossDeviceConversions, excludeFromBidding, measurementPeriod, measurementPeriodView, mostRecentConversionDate, status, userRevenueValue, webConversion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTracker {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    allConversionValue: ").append(toIndentedString(allConversionValue)).append("\n");
    sb.append("    allConversions: ").append(toIndentedString(allConversions)).append("\n");
    sb.append("    viewThroughConversions: ").append(toIndentedString(viewThroughConversions)).append("\n");
    sb.append("    appConversion: ").append(toIndentedString(appConversion)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    conversionTrackerId: ").append(toIndentedString(conversionTrackerId)).append("\n");
    sb.append("    conversionTrackerName: ").append(toIndentedString(conversionTrackerName)).append("\n");
    sb.append("    conversionTrackerType: ").append(toIndentedString(conversionTrackerType)).append("\n");
    sb.append("    conversionValue: ").append(toIndentedString(conversionValue)).append("\n");
    sb.append("    conversionValueViaAdClick: ").append(toIndentedString(conversionValueViaAdClick)).append("\n");
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
    sb.append("    conversionsViaAdClick: ").append(toIndentedString(conversionsViaAdClick)).append("\n");
    sb.append("    countingType: ").append(toIndentedString(countingType)).append("\n");
    sb.append("    crossDeviceConversions: ").append(toIndentedString(crossDeviceConversions)).append("\n");
    sb.append("    excludeFromBidding: ").append(toIndentedString(excludeFromBidding)).append("\n");
    sb.append("    measurementPeriod: ").append(toIndentedString(measurementPeriod)).append("\n");
    sb.append("    measurementPeriodView: ").append(toIndentedString(measurementPeriodView)).append("\n");
    sb.append("    mostRecentConversionDate: ").append(toIndentedString(mostRecentConversionDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userRevenueValue: ").append(toIndentedString(userRevenueValue)).append("\n");
    sb.append("    webConversion: ").append(toIndentedString(webConversion)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.ConversionTrackerServiceAppConversion;
import jp.co.yahoo.adsdisplayapi.v4.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adsdisplayapi.v4.model.ConversionTrackerServiceCountingType;
import jp.co.yahoo.adsdisplayapi.v4.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adsdisplayapi.v4.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.ConversionTrackerServiceType;
import jp.co.yahoo.adsdisplayapi.v4.model.ConversionTrackerServiceWebConversion;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTracker   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("allConversionValue")
  private String allConversionValue = null;

  @JsonProperty("allConversions")
  private Long allConversions = null;

  @JsonProperty("viewThroughConversions")
  private Long viewThroughConversions = null;

  @JsonProperty("appConversion")
  private ConversionTrackerServiceAppConversion appConversion = null;

  @JsonProperty("category")
  private ConversionTrackerServiceCategory category = null;

  @JsonProperty("conversionTrackerId")
  private Long conversionTrackerId = null;

  @JsonProperty("conversionTrackerName")
  private String conversionTrackerName = null;

  @JsonProperty("conversionTrackerType")
  private ConversionTrackerServiceType conversionTrackerType = null;

  @JsonProperty("conversionValue")
  private String conversionValue = null;

  @JsonProperty("conversionValueViaAdClick")
  private String conversionValueViaAdClick = null;

  @JsonProperty("conversions")
  private Long conversions = null;

  @JsonProperty("conversionsViaAdClick")
  private Long conversionsViaAdClick = null;

  @JsonProperty("countingType")
  private ConversionTrackerServiceCountingType countingType = null;

  @JsonProperty("crossDeviceConversions")
  private Long crossDeviceConversions = null;

  @JsonProperty("excludeFromBidding")
  private ConversionTrackerServiceExcludeFromBidding excludeFromBidding = null;

  @JsonProperty("measurementPeriod")
  private Integer measurementPeriod = null;

  @JsonProperty("measurementPeriodView")
  private Integer measurementPeriodView = null;

  @JsonProperty("mostRecentConversionDate")
  private String mostRecentConversionDate = null;

  @JsonProperty("status")
  private ConversionTrackerServiceStatus status = null;

  @JsonProperty("userRevenueValue")
  private Long userRevenueValue = null;

  @JsonProperty("webConversion")
  private ConversionTrackerServiceWebConversion webConversion = null;

  public ConversionTracker accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ConversionTracker allConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンの価値（全て）です。 </div> <div lang=\"en\"> Conv. value (all). </div> 
   * @return allConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値（全て）です。 </div> <div lang=\"en\"> Conv. value (all). </div> ")


  public String getAllConversionValue() {
    return allConversionValue;
  }

  public void setAllConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
  }

  public ConversionTracker allConversions(Long allConversions) {
    this.allConversions = allConversions;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョン数（全て）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (all).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return allConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数（全て）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (all).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAllConversions() {
    return allConversions;
  }

  public void setAllConversions(Long allConversions) {
    this.allConversions = allConversions;
  }

  public ConversionTracker viewThroughConversions(Long viewThroughConversions) {
    this.viewThroughConversions = viewThroughConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> 
   * @return viewThroughConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> ")


  public Long getViewThroughConversions() {
    return viewThroughConversions;
  }

  public void setViewThroughConversions(Long viewThroughConversions) {
    this.viewThroughConversions = viewThroughConversions;
  }

  public ConversionTracker appConversion(ConversionTrackerServiceAppConversion appConversion) {
    this.appConversion = appConversion;
    return this;
  }

  /**
   * Get appConversion
   * @return appConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppConversion getAppConversion() {
    return appConversion;
  }

  public void setAppConversion(ConversionTrackerServiceAppConversion appConversion) {
    this.appConversion = appConversion;
  }

  public ConversionTracker category(ConversionTrackerServiceCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceCategory getCategory() {
    return category;
  }

  public void setCategory(ConversionTrackerServiceCategory category) {
    this.category = category;
  }

  public ConversionTracker conversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョントラッカーIDです。<br> このフィールドは、ADD時は無視され、SET時は必須となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field will be ignored in ADD operation, and will be required in SET operation. </div> 
   * @return conversionTrackerId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカーIDです。<br> このフィールドは、ADD時は無視され、SET時は必須となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field will be ignored in ADD operation, and will be required in SET operation. </div> ")


  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }

  public void setConversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }

  public ConversionTracker conversionTrackerName(String conversionTrackerName) {
    this.conversionTrackerName = conversionTrackerName;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョントラッカー名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Tracker Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return conversionTrackerName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカー名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Tracker Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getConversionTrackerName() {
    return conversionTrackerName;
  }

  public void setConversionTrackerName(String conversionTrackerName) {
    this.conversionTrackerName = conversionTrackerName;
  }

  public ConversionTracker conversionTrackerType(ConversionTrackerServiceType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
    return this;
  }

  /**
   * Get conversionTrackerType
   * @return conversionTrackerType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceType getConversionTrackerType() {
    return conversionTrackerType;
  }

  public void setConversionTrackerType(ConversionTrackerServiceType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }

  public ConversionTracker conversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンの価値/コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value/conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値/コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value/conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getConversionValue() {
    return conversionValue;
  }

  public void setConversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
  }

  public ConversionTracker conversionValueViaAdClick(String conversionValueViaAdClick) {
    this.conversionValueViaAdClick = conversionValueViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンの価値（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversionValueViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getConversionValueViaAdClick() {
    return conversionValueViaAdClick;
  }

  public void setConversionValueViaAdClick(String conversionValueViaAdClick) {
    this.conversionValueViaAdClick = conversionValueViaAdClick;
  }

  public ConversionTracker conversions(Long conversions) {
    this.conversions = conversions;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getConversions() {
    return conversions;
  }

  public void setConversions(Long conversions) {
    this.conversions = conversions;
  }

  public ConversionTracker conversionsViaAdClick(Long conversionsViaAdClick) {
    this.conversionsViaAdClick = conversionsViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョン数（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversionsViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getConversionsViaAdClick() {
    return conversionsViaAdClick;
  }

  public void setConversionsViaAdClick(Long conversionsViaAdClick) {
    this.conversionsViaAdClick = conversionsViaAdClick;
  }

  public ConversionTracker countingType(ConversionTrackerServiceCountingType countingType) {
    this.countingType = countingType;
    return this;
  }

  /**
   * Get countingType
   * @return countingType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceCountingType getCountingType() {
    return countingType;
  }

  public void setCountingType(ConversionTrackerServiceCountingType countingType) {
    this.countingType = countingType;
  }

  public ConversionTracker crossDeviceConversions(Long crossDeviceConversions) {
    this.crossDeviceConversions = crossDeviceConversions;
    return this;
  }

  /**
   * <div lang=\"ja\"> クロスデバイスコンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Cross-device conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return crossDeviceConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> クロスデバイスコンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Cross-device conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getCrossDeviceConversions() {
    return crossDeviceConversions;
  }

  public void setCrossDeviceConversions(Long crossDeviceConversions) {
    this.crossDeviceConversions = crossDeviceConversions;
  }

  public ConversionTracker excludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
    return this;
  }

  /**
   * Get excludeFromBidding
   * @return excludeFromBidding
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceExcludeFromBidding getExcludeFromBidding() {
    return excludeFromBidding;
  }

  public void setExcludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
  }

  public ConversionTracker measurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
    return this;
  }

  /**
   * <div lang=\"ja\"> 計測期間（単位：日）です。<br> ※7～90の範囲内で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は30となります。 </div> <div lang=\"en\"> Counting period (Unit: Day).<br> ∗ Can be specified within the range of 7 to 90 days.<br> This field is optional in requests. The default value in ADD operation will be 30. </div> 
   * @return measurementPeriod
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 計測期間（単位：日）です。<br> ※7～90の範囲内で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は30となります。 </div> <div lang=\"en\"> Counting period (Unit: Day).<br> ∗ Can be specified within the range of 7 to 90 days.<br> This field is optional in requests. The default value in ADD operation will be 30. </div> ")


  public Integer getMeasurementPeriod() {
    return measurementPeriod;
  }

  public void setMeasurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
  }

  public ConversionTracker measurementPeriodView(Integer measurementPeriodView) {
    this.measurementPeriodView = measurementPeriodView;
    return this;
  }

  /**
   * <div lang=\"ja\"> 測定期間（動画視聴）<br> ※1-30の範囲で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は1となります。 </div> <div lang=\"en\"> Counting period (Video view).<br> ∗ Can be specified within the range of 1 to 30.<br> This field is optional in requests. The default value in ADD operation will be 1. </div> 
   * @return measurementPeriodView
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 測定期間（動画視聴）<br> ※1-30の範囲で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は1となります。 </div> <div lang=\"en\"> Counting period (Video view).<br> ∗ Can be specified within the range of 1 to 30.<br> This field is optional in requests. The default value in ADD operation will be 1. </div> ")


  public Integer getMeasurementPeriodView() {
    return measurementPeriodView;
  }

  public void setMeasurementPeriodView(Integer measurementPeriodView) {
    this.measurementPeriodView = measurementPeriodView;
  }

  public ConversionTracker mostRecentConversionDate(String mostRecentConversionDate) {
    this.mostRecentConversionDate = mostRecentConversionDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンが発生した直近の日付です。<br> ※YYYYMMDD形式です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date of the most recent conversion.<br> ∗ Format: YYYYMMDD.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return mostRecentConversionDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンが発生した直近の日付です。<br> ※YYYYMMDD形式です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date of the most recent conversion.<br> ∗ Format: YYYYMMDD.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getMostRecentConversionDate() {
    return mostRecentConversionDate;
  }

  public void setMostRecentConversionDate(String mostRecentConversionDate) {
    this.mostRecentConversionDate = mostRecentConversionDate;
  }

  public ConversionTracker status(ConversionTrackerServiceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceStatus getStatus() {
    return status;
  }

  public void setStatus(ConversionTrackerServiceStatus status) {
    this.status = status;
  }

  public ConversionTracker userRevenueValue(Long userRevenueValue) {
    this.userRevenueValue = userRevenueValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンの収益値です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は0となります。 </div> <div lang=\"en\"> Revenue value for Conversions.<br> This field is optional in requests. The default value in ADD operation will be 0. </div> 
   * @return userRevenueValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの収益値です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は0となります。 </div> <div lang=\"en\"> Revenue value for Conversions.<br> This field is optional in requests. The default value in ADD operation will be 0. </div> ")


  public Long getUserRevenueValue() {
    return userRevenueValue;
  }

  public void setUserRevenueValue(Long userRevenueValue) {
    this.userRevenueValue = userRevenueValue;
  }

  public ConversionTracker webConversion(ConversionTrackerServiceWebConversion webConversion) {
    this.webConversion = webConversion;
    return this;
  }

  /**
   * Get webConversion
   * @return webConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceWebConversion getWebConversion() {
    return webConversion;
  }

  public void setWebConversion(ConversionTrackerServiceWebConversion webConversion) {
    this.webConversion = webConversion;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


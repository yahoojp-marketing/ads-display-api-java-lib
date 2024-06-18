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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v14.model.Error;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceAdGroupStatsValue;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceAdStatsValue;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceCampaignStatsValue;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceImageStatsValue;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServicePeriodCustomDate;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceStatsPeriod;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceTargetStatsValue;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceType;
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceVideoStatsValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceValueオブジェクトは、統計情報1件あたりの実行結果（1 Entity）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceValue object is container for the execution result (1 entity) per single stats information by method.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServiceValue.JSON_PROPERTY_ACCOUNT_ID,
  StatsServiceValue.JSON_PROPERTY_AD_GROUP_STATS_VALUE,
  StatsServiceValue.JSON_PROPERTY_AD_STATS_VALUE,
  StatsServiceValue.JSON_PROPERTY_CAMPAIGN_STATS_VALUE,
  StatsServiceValue.JSON_PROPERTY_ERRORS,
  StatsServiceValue.JSON_PROPERTY_IMAGE_STATS_VALUE,
  StatsServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED,
  StatsServiceValue.JSON_PROPERTY_PERIOD_CUSTOM_DATE,
  StatsServiceValue.JSON_PROPERTY_STATS_PERIOD,
  StatsServiceValue.JSON_PROPERTY_TARGET_STATS_VALUE,
  StatsServiceValue.JSON_PROPERTY_TYPE,
  StatsServiceValue.JSON_PROPERTY_VIDEO_STATS_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceValue {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_STATS_VALUE = "adGroupStatsValue";
  private StatsServiceAdGroupStatsValue adGroupStatsValue;

  public static final String JSON_PROPERTY_AD_STATS_VALUE = "adStatsValue";
  private StatsServiceAdStatsValue adStatsValue;

  public static final String JSON_PROPERTY_CAMPAIGN_STATS_VALUE = "campaignStatsValue";
  private StatsServiceCampaignStatsValue campaignStatsValue;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_IMAGE_STATS_VALUE = "imageStatsValue";
  private StatsServiceImageStatsValue imageStatsValue;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public static final String JSON_PROPERTY_PERIOD_CUSTOM_DATE = "periodCustomDate";
  private StatsServicePeriodCustomDate periodCustomDate;

  public static final String JSON_PROPERTY_STATS_PERIOD = "statsPeriod";
  private StatsServiceStatsPeriod statsPeriod;

  public static final String JSON_PROPERTY_TARGET_STATS_VALUE = "targetStatsValue";
  private StatsServiceTargetStatsValue targetStatsValue;

  public static final String JSON_PROPERTY_TYPE = "type";
  private StatsServiceType type;

  public static final String JSON_PROPERTY_VIDEO_STATS_VALUE = "videoStatsValue";
  private StatsServiceVideoStatsValue videoStatsValue;

  public StatsServiceValue() {
  }

  public StatsServiceValue accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public StatsServiceValue adGroupStatsValue(StatsServiceAdGroupStatsValue adGroupStatsValue) {
    
    this.adGroupStatsValue = adGroupStatsValue;
    return this;
  }

   /**
   * Get adGroupStatsValue
   * @return adGroupStatsValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceAdGroupStatsValue getAdGroupStatsValue() {
    return adGroupStatsValue;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupStatsValue(StatsServiceAdGroupStatsValue adGroupStatsValue) {
    this.adGroupStatsValue = adGroupStatsValue;
  }


  public StatsServiceValue adStatsValue(StatsServiceAdStatsValue adStatsValue) {
    
    this.adStatsValue = adStatsValue;
    return this;
  }

   /**
   * Get adStatsValue
   * @return adStatsValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceAdStatsValue getAdStatsValue() {
    return adStatsValue;
  }


  @JsonProperty(JSON_PROPERTY_AD_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdStatsValue(StatsServiceAdStatsValue adStatsValue) {
    this.adStatsValue = adStatsValue;
  }


  public StatsServiceValue campaignStatsValue(StatsServiceCampaignStatsValue campaignStatsValue) {
    
    this.campaignStatsValue = campaignStatsValue;
    return this;
  }

   /**
   * Get campaignStatsValue
   * @return campaignStatsValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceCampaignStatsValue getCampaignStatsValue() {
    return campaignStatsValue;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignStatsValue(StatsServiceCampaignStatsValue campaignStatsValue) {
    this.campaignStatsValue = campaignStatsValue;
  }


  public StatsServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public StatsServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public StatsServiceValue imageStatsValue(StatsServiceImageStatsValue imageStatsValue) {
    
    this.imageStatsValue = imageStatsValue;
    return this;
  }

   /**
   * Get imageStatsValue
   * @return imageStatsValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceImageStatsValue getImageStatsValue() {
    return imageStatsValue;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageStatsValue(StatsServiceImageStatsValue imageStatsValue) {
    this.imageStatsValue = imageStatsValue;
  }


  public StatsServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  public StatsServiceValue periodCustomDate(StatsServicePeriodCustomDate periodCustomDate) {
    
    this.periodCustomDate = periodCustomDate;
    return this;
  }

   /**
   * Get periodCustomDate
   * @return periodCustomDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_CUSTOM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServicePeriodCustomDate getPeriodCustomDate() {
    return periodCustomDate;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_CUSTOM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodCustomDate(StatsServicePeriodCustomDate periodCustomDate) {
    this.periodCustomDate = periodCustomDate;
  }


  public StatsServiceValue statsPeriod(StatsServiceStatsPeriod statsPeriod) {
    
    this.statsPeriod = statsPeriod;
    return this;
  }

   /**
   * Get statsPeriod
   * @return statsPeriod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATS_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceStatsPeriod getStatsPeriod() {
    return statsPeriod;
  }


  @JsonProperty(JSON_PROPERTY_STATS_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatsPeriod(StatsServiceStatsPeriod statsPeriod) {
    this.statsPeriod = statsPeriod;
  }


  public StatsServiceValue targetStatsValue(StatsServiceTargetStatsValue targetStatsValue) {
    
    this.targetStatsValue = targetStatsValue;
    return this;
  }

   /**
   * Get targetStatsValue
   * @return targetStatsValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceTargetStatsValue getTargetStatsValue() {
    return targetStatsValue;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetStatsValue(StatsServiceTargetStatsValue targetStatsValue) {
    this.targetStatsValue = targetStatsValue;
  }


  public StatsServiceValue type(StatsServiceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(StatsServiceType type) {
    this.type = type;
  }


  public StatsServiceValue videoStatsValue(StatsServiceVideoStatsValue videoStatsValue) {
    
    this.videoStatsValue = videoStatsValue;
    return this;
  }

   /**
   * Get videoStatsValue
   * @return videoStatsValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceVideoStatsValue getVideoStatsValue() {
    return videoStatsValue;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_STATS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoStatsValue(StatsServiceVideoStatsValue videoStatsValue) {
    this.videoStatsValue = videoStatsValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceValue statsServiceValue = (StatsServiceValue) o;
    return Objects.equals(this.accountId, statsServiceValue.accountId) &&
        Objects.equals(this.adGroupStatsValue, statsServiceValue.adGroupStatsValue) &&
        Objects.equals(this.adStatsValue, statsServiceValue.adStatsValue) &&
        Objects.equals(this.campaignStatsValue, statsServiceValue.campaignStatsValue) &&
        Objects.equals(this.errors, statsServiceValue.errors) &&
        Objects.equals(this.imageStatsValue, statsServiceValue.imageStatsValue) &&
        Objects.equals(this.operationSucceeded, statsServiceValue.operationSucceeded) &&
        Objects.equals(this.periodCustomDate, statsServiceValue.periodCustomDate) &&
        Objects.equals(this.statsPeriod, statsServiceValue.statsPeriod) &&
        Objects.equals(this.targetStatsValue, statsServiceValue.targetStatsValue) &&
        Objects.equals(this.type, statsServiceValue.type) &&
        Objects.equals(this.videoStatsValue, statsServiceValue.videoStatsValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupStatsValue, adStatsValue, campaignStatsValue, errors, imageStatsValue, operationSucceeded, periodCustomDate, statsPeriod, targetStatsValue, type, videoStatsValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceValue {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupStatsValue: ").append(toIndentedString(adGroupStatsValue)).append("\n");
    sb.append("    adStatsValue: ").append(toIndentedString(adStatsValue)).append("\n");
    sb.append("    campaignStatsValue: ").append(toIndentedString(campaignStatsValue)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    imageStatsValue: ").append(toIndentedString(imageStatsValue)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    periodCustomDate: ").append(toIndentedString(periodCustomDate)).append("\n");
    sb.append("    statsPeriod: ").append(toIndentedString(statsPeriod)).append("\n");
    sb.append("    targetStatsValue: ").append(toIndentedString(targetStatsValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    videoStatsValue: ").append(toIndentedString(videoStatsValue)).append("\n");
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


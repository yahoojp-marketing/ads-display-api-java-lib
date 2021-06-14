package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceAdGroupStatsValue;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceAdStatsValue;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceCampaignStatsValue;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceImageStatsValue;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServicePeriodCustomDate;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceStatsPeriod;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceTargetStatsValue;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceType;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceVideoStatsValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceValueオブジェクトは、統計情報1件あたりの実行結果（1 Entity）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceValue object is container for the execution result (1 entity) per single stats information by method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceValueオブジェクトは、統計情報1件あたりの実行結果（1 Entity）を保持します。</div> <div lang=\"en\">StatsServiceValue object is container for the execution result (1 entity) per single stats information by method.</div> ")

public class StatsServiceValue   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupStatsValue")
  private JsonNullable<StatsServiceAdGroupStatsValue> adGroupStatsValue = JsonNullable.undefined();

  @JsonProperty("adStatsValue")
  private JsonNullable<StatsServiceAdStatsValue> adStatsValue = JsonNullable.undefined();

  @JsonProperty("campaignStatsValue")
  private JsonNullable<StatsServiceCampaignStatsValue> campaignStatsValue = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("imageStatsValue")
  private JsonNullable<StatsServiceImageStatsValue> imageStatsValue = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  @JsonProperty("periodCustomDate")
  private JsonNullable<StatsServicePeriodCustomDate> periodCustomDate = JsonNullable.undefined();

  @JsonProperty("statsPeriod")
  private JsonNullable<StatsServiceStatsPeriod> statsPeriod = JsonNullable.undefined();

  @JsonProperty("targetStatsValue")
  private JsonNullable<StatsServiceTargetStatsValue> targetStatsValue = JsonNullable.undefined();

  @JsonProperty("type")
  private JsonNullable<StatsServiceType> type = JsonNullable.undefined();

  @JsonProperty("videoStatsValue")
  private JsonNullable<StatsServiceVideoStatsValue> videoStatsValue = JsonNullable.undefined();

  public StatsServiceValue accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public StatsServiceValue adGroupStatsValue(StatsServiceAdGroupStatsValue adGroupStatsValue) {
    this.adGroupStatsValue = JsonNullable.of(adGroupStatsValue);
    return this;
  }

  /**
   * Get adGroupStatsValue
   * @return adGroupStatsValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceAdGroupStatsValue> getAdGroupStatsValue() {
    return adGroupStatsValue;
  }

  public void setAdGroupStatsValue(JsonNullable<StatsServiceAdGroupStatsValue> adGroupStatsValue) {
    this.adGroupStatsValue = adGroupStatsValue;
  }

  public StatsServiceValue adStatsValue(StatsServiceAdStatsValue adStatsValue) {
    this.adStatsValue = JsonNullable.of(adStatsValue);
    return this;
  }

  /**
   * Get adStatsValue
   * @return adStatsValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceAdStatsValue> getAdStatsValue() {
    return adStatsValue;
  }

  public void setAdStatsValue(JsonNullable<StatsServiceAdStatsValue> adStatsValue) {
    this.adStatsValue = adStatsValue;
  }

  public StatsServiceValue campaignStatsValue(StatsServiceCampaignStatsValue campaignStatsValue) {
    this.campaignStatsValue = JsonNullable.of(campaignStatsValue);
    return this;
  }

  /**
   * Get campaignStatsValue
   * @return campaignStatsValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceCampaignStatsValue> getCampaignStatsValue() {
    return campaignStatsValue;
  }

  public void setCampaignStatsValue(JsonNullable<StatsServiceCampaignStatsValue> campaignStatsValue) {
    this.campaignStatsValue = campaignStatsValue;
  }

  public StatsServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public StatsServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public StatsServiceValue imageStatsValue(StatsServiceImageStatsValue imageStatsValue) {
    this.imageStatsValue = JsonNullable.of(imageStatsValue);
    return this;
  }

  /**
   * Get imageStatsValue
   * @return imageStatsValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceImageStatsValue> getImageStatsValue() {
    return imageStatsValue;
  }

  public void setImageStatsValue(JsonNullable<StatsServiceImageStatsValue> imageStatsValue) {
    this.imageStatsValue = imageStatsValue;
  }

  public StatsServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public StatsServiceValue periodCustomDate(StatsServicePeriodCustomDate periodCustomDate) {
    this.periodCustomDate = JsonNullable.of(periodCustomDate);
    return this;
  }

  /**
   * Get periodCustomDate
   * @return periodCustomDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServicePeriodCustomDate> getPeriodCustomDate() {
    return periodCustomDate;
  }

  public void setPeriodCustomDate(JsonNullable<StatsServicePeriodCustomDate> periodCustomDate) {
    this.periodCustomDate = periodCustomDate;
  }

  public StatsServiceValue statsPeriod(StatsServiceStatsPeriod statsPeriod) {
    this.statsPeriod = JsonNullable.of(statsPeriod);
    return this;
  }

  /**
   * Get statsPeriod
   * @return statsPeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceStatsPeriod> getStatsPeriod() {
    return statsPeriod;
  }

  public void setStatsPeriod(JsonNullable<StatsServiceStatsPeriod> statsPeriod) {
    this.statsPeriod = statsPeriod;
  }

  public StatsServiceValue targetStatsValue(StatsServiceTargetStatsValue targetStatsValue) {
    this.targetStatsValue = JsonNullable.of(targetStatsValue);
    return this;
  }

  /**
   * Get targetStatsValue
   * @return targetStatsValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceTargetStatsValue> getTargetStatsValue() {
    return targetStatsValue;
  }

  public void setTargetStatsValue(JsonNullable<StatsServiceTargetStatsValue> targetStatsValue) {
    this.targetStatsValue = targetStatsValue;
  }

  public StatsServiceValue type(StatsServiceType type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceType> getType() {
    return type;
  }

  public void setType(JsonNullable<StatsServiceType> type) {
    this.type = type;
  }

  public StatsServiceValue videoStatsValue(StatsServiceVideoStatsValue videoStatsValue) {
    this.videoStatsValue = JsonNullable.of(videoStatsValue);
    return this;
  }

  /**
   * Get videoStatsValue
   * @return videoStatsValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceVideoStatsValue> getVideoStatsValue() {
    return videoStatsValue;
  }

  public void setVideoStatsValue(JsonNullable<StatsServiceVideoStatsValue> videoStatsValue) {
    this.videoStatsValue = videoStatsValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServicePeriod;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServicePage object contains the results (a list of all entities) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">ConversionTrackerServicePage object contains the results (a list of all entities) for get method.</div> ")

public class ConversionTrackerServicePage   {
  @JsonProperty("period")
  private JsonNullable<ConversionTrackerServicePeriod> period = JsonNullable.undefined();

  @JsonProperty("totalAllConversionValue")
  private JsonNullable<String> totalAllConversionValue = JsonNullable.undefined();

  @JsonProperty("totalAllConversions")
  private JsonNullable<Long> totalAllConversions = JsonNullable.undefined();

  @JsonProperty("totalConversionValue")
  private JsonNullable<String> totalConversionValue = JsonNullable.undefined();

  @JsonProperty("totalConversionValueViaAdClick")
  private JsonNullable<String> totalConversionValueViaAdClick = JsonNullable.undefined();

  @JsonProperty("totalConversions")
  private JsonNullable<Long> totalConversions = JsonNullable.undefined();

  @JsonProperty("totalConversionsViaAdClick")
  private JsonNullable<Long> totalConversionsViaAdClick = JsonNullable.undefined();

  @JsonProperty("totalCrossDeviceConversions")
  private JsonNullable<Long> totalCrossDeviceConversions = JsonNullable.undefined();

  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<ConversionTrackerServiceValue>> values = JsonNullable.undefined();

  public ConversionTrackerServicePage period(ConversionTrackerServicePeriod period) {
    this.period = JsonNullable.of(period);
    return this;
  }

  /**
   * Get period
   * @return period
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServicePeriod> getPeriod() {
    return period;
  }

  public void setPeriod(JsonNullable<ConversionTrackerServicePeriod> period) {
    this.period = period;
  }

  public ConversionTrackerServicePage totalAllConversionValue(String totalAllConversionValue) {
    this.totalAllConversionValue = JsonNullable.of(totalAllConversionValue);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（全て）の合計です。</div> <div lang=\"en\">Total of conv. value (all).</div> 
   * @return totalAllConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（全て）の合計です。</div> <div lang=\"en\">Total of conv. value (all).</div> ")


  public JsonNullable<String> getTotalAllConversionValue() {
    return totalAllConversionValue;
  }

  public void setTotalAllConversionValue(JsonNullable<String> totalAllConversionValue) {
    this.totalAllConversionValue = totalAllConversionValue;
  }

  public ConversionTrackerServicePage totalAllConversions(Long totalAllConversions) {
    this.totalAllConversions = JsonNullable.of(totalAllConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数（全て）の合計です。</div> <div lang=\"en\">Total of conversions (all).</div> 
   * @return totalAllConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数（全て）の合計です。</div> <div lang=\"en\">Total of conversions (all).</div> ")


  public JsonNullable<Long> getTotalAllConversions() {
    return totalAllConversions;
  }

  public void setTotalAllConversions(JsonNullable<Long> totalAllConversions) {
    this.totalAllConversions = totalAllConversions;
  }

  public ConversionTrackerServicePage totalConversionValue(String totalConversionValue) {
    this.totalConversionValue = JsonNullable.of(totalConversionValue);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値の合計です。</div> <div lang=\"en\">Total of conv. value.</div> 
   * @return totalConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値の合計です。</div> <div lang=\"en\">Total of conv. value.</div> ")


  public JsonNullable<String> getTotalConversionValue() {
    return totalConversionValue;
  }

  public void setTotalConversionValue(JsonNullable<String> totalConversionValue) {
    this.totalConversionValue = totalConversionValue;
  }

  public ConversionTrackerServicePage totalConversionValueViaAdClick(String totalConversionValueViaAdClick) {
    this.totalConversionValueViaAdClick = JsonNullable.of(totalConversionValueViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値の合計（クリック経由）です。</div> <div lang=\"en\">Total of conv. value (via click).</div> 
   * @return totalConversionValueViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値の合計（クリック経由）です。</div> <div lang=\"en\">Total of conv. value (via click).</div> ")


  public JsonNullable<String> getTotalConversionValueViaAdClick() {
    return totalConversionValueViaAdClick;
  }

  public void setTotalConversionValueViaAdClick(JsonNullable<String> totalConversionValueViaAdClick) {
    this.totalConversionValueViaAdClick = totalConversionValueViaAdClick;
  }

  public ConversionTrackerServicePage totalConversions(Long totalConversions) {
    this.totalConversions = JsonNullable.of(totalConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数の合計です。</div> <div lang=\"en\">Total of conversions.</div> 
   * @return totalConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数の合計です。</div> <div lang=\"en\">Total of conversions.</div> ")


  public JsonNullable<Long> getTotalConversions() {
    return totalConversions;
  }

  public void setTotalConversions(JsonNullable<Long> totalConversions) {
    this.totalConversions = totalConversions;
  }

  public ConversionTrackerServicePage totalConversionsViaAdClick(Long totalConversionsViaAdClick) {
    this.totalConversionsViaAdClick = JsonNullable.of(totalConversionsViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数の合計（クリック経由）です。</div> <div lang=\"en\">Total of conversions (via click).</div> 
   * @return totalConversionsViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数の合計（クリック経由）です。</div> <div lang=\"en\">Total of conversions (via click).</div> ")


  public JsonNullable<Long> getTotalConversionsViaAdClick() {
    return totalConversionsViaAdClick;
  }

  public void setTotalConversionsViaAdClick(JsonNullable<Long> totalConversionsViaAdClick) {
    this.totalConversionsViaAdClick = totalConversionsViaAdClick;
  }

  public ConversionTrackerServicePage totalCrossDeviceConversions(Long totalCrossDeviceConversions) {
    this.totalCrossDeviceConversions = JsonNullable.of(totalCrossDeviceConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">クロスデバイスコンバージョン数の合計です。</div> <div lang=\"en\">Total of cross-device conv.</div> 
   * @return totalCrossDeviceConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クロスデバイスコンバージョン数の合計です。</div> <div lang=\"en\">Total of cross-device conv.</div> ")


  public JsonNullable<Long> getTotalCrossDeviceConversions() {
    return totalCrossDeviceConversions;
  }

  public void setTotalCrossDeviceConversions(JsonNullable<Long> totalCrossDeviceConversions) {
    this.totalCrossDeviceConversions = totalCrossDeviceConversions;
  }

  public ConversionTrackerServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public ConversionTrackerServicePage values(List<ConversionTrackerServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public ConversionTrackerServicePage addValuesItem(ConversionTrackerServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ConversionTrackerServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<ConversionTrackerServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServicePage conversionTrackerServicePage = (ConversionTrackerServicePage) o;
    return Objects.equals(this.period, conversionTrackerServicePage.period) &&
        Objects.equals(this.totalAllConversionValue, conversionTrackerServicePage.totalAllConversionValue) &&
        Objects.equals(this.totalAllConversions, conversionTrackerServicePage.totalAllConversions) &&
        Objects.equals(this.totalConversionValue, conversionTrackerServicePage.totalConversionValue) &&
        Objects.equals(this.totalConversionValueViaAdClick, conversionTrackerServicePage.totalConversionValueViaAdClick) &&
        Objects.equals(this.totalConversions, conversionTrackerServicePage.totalConversions) &&
        Objects.equals(this.totalConversionsViaAdClick, conversionTrackerServicePage.totalConversionsViaAdClick) &&
        Objects.equals(this.totalCrossDeviceConversions, conversionTrackerServicePage.totalCrossDeviceConversions) &&
        Objects.equals(this.totalNumEntries, conversionTrackerServicePage.totalNumEntries) &&
        Objects.equals(this.values, conversionTrackerServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, totalAllConversionValue, totalAllConversions, totalConversionValue, totalConversionValueViaAdClick, totalConversions, totalConversionsViaAdClick, totalCrossDeviceConversions, totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServicePage {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    totalAllConversionValue: ").append(toIndentedString(totalAllConversionValue)).append("\n");
    sb.append("    totalAllConversions: ").append(toIndentedString(totalAllConversions)).append("\n");
    sb.append("    totalConversionValue: ").append(toIndentedString(totalConversionValue)).append("\n");
    sb.append("    totalConversionValueViaAdClick: ").append(toIndentedString(totalConversionValueViaAdClick)).append("\n");
    sb.append("    totalConversions: ").append(toIndentedString(totalConversions)).append("\n");
    sb.append("    totalConversionsViaAdClick: ").append(toIndentedString(totalConversionsViaAdClick)).append("\n");
    sb.append("    totalCrossDeviceConversions: ").append(toIndentedString(totalCrossDeviceConversions)).append("\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


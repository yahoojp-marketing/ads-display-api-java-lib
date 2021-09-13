package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServicePeriod;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServicePage object contains the results (a list of all entities) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">ConversionTrackerServicePage object contains the results (a list of all entities) for get method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServicePage   {
  @JsonProperty("period")
  private ConversionTrackerServicePeriod period = null;

  @JsonProperty("totalAllConversionValue")
  private String totalAllConversionValue = null;

  @JsonProperty("totalAllConversions")
  private Long totalAllConversions = null;

  @JsonProperty("totalConversionValue")
  private String totalConversionValue = null;

  @JsonProperty("totalConversionValueViaAdClick")
  private String totalConversionValueViaAdClick = null;

  @JsonProperty("totalConversions")
  private Long totalConversions = null;

  @JsonProperty("totalConversionsViaAdClick")
  private Long totalConversionsViaAdClick = null;

  @JsonProperty("totalCrossDeviceConversions")
  private Long totalCrossDeviceConversions = null;

  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<ConversionTrackerServiceValue> values = null;

  public ConversionTrackerServicePage period(ConversionTrackerServicePeriod period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServicePeriod getPeriod() {
    return period;
  }

  public void setPeriod(ConversionTrackerServicePeriod period) {
    this.period = period;
  }

  public ConversionTrackerServicePage totalAllConversionValue(String totalAllConversionValue) {
    this.totalAllConversionValue = totalAllConversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（全て）の合計です。</div> <div lang=\"en\">Total of conv. value (all).</div> 
   * @return totalAllConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（全て）の合計です。</div> <div lang=\"en\">Total of conv. value (all).</div> ")


  public String getTotalAllConversionValue() {
    return totalAllConversionValue;
  }

  public void setTotalAllConversionValue(String totalAllConversionValue) {
    this.totalAllConversionValue = totalAllConversionValue;
  }

  public ConversionTrackerServicePage totalAllConversions(Long totalAllConversions) {
    this.totalAllConversions = totalAllConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数（全て）の合計です。</div> <div lang=\"en\">Total of conversions (all).</div> 
   * @return totalAllConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数（全て）の合計です。</div> <div lang=\"en\">Total of conversions (all).</div> ")


  public Long getTotalAllConversions() {
    return totalAllConversions;
  }

  public void setTotalAllConversions(Long totalAllConversions) {
    this.totalAllConversions = totalAllConversions;
  }

  public ConversionTrackerServicePage totalConversionValue(String totalConversionValue) {
    this.totalConversionValue = totalConversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値の合計です。</div> <div lang=\"en\">Total of conv. value.</div> 
   * @return totalConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値の合計です。</div> <div lang=\"en\">Total of conv. value.</div> ")


  public String getTotalConversionValue() {
    return totalConversionValue;
  }

  public void setTotalConversionValue(String totalConversionValue) {
    this.totalConversionValue = totalConversionValue;
  }

  public ConversionTrackerServicePage totalConversionValueViaAdClick(String totalConversionValueViaAdClick) {
    this.totalConversionValueViaAdClick = totalConversionValueViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値の合計（クリック経由）です。</div> <div lang=\"en\">Total of conv. value (via click).</div> 
   * @return totalConversionValueViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値の合計（クリック経由）です。</div> <div lang=\"en\">Total of conv. value (via click).</div> ")


  public String getTotalConversionValueViaAdClick() {
    return totalConversionValueViaAdClick;
  }

  public void setTotalConversionValueViaAdClick(String totalConversionValueViaAdClick) {
    this.totalConversionValueViaAdClick = totalConversionValueViaAdClick;
  }

  public ConversionTrackerServicePage totalConversions(Long totalConversions) {
    this.totalConversions = totalConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数の合計です。</div> <div lang=\"en\">Total of conversions.</div> 
   * @return totalConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数の合計です。</div> <div lang=\"en\">Total of conversions.</div> ")


  public Long getTotalConversions() {
    return totalConversions;
  }

  public void setTotalConversions(Long totalConversions) {
    this.totalConversions = totalConversions;
  }

  public ConversionTrackerServicePage totalConversionsViaAdClick(Long totalConversionsViaAdClick) {
    this.totalConversionsViaAdClick = totalConversionsViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数の合計（クリック経由）です。</div> <div lang=\"en\">Total of conversions (via click).</div> 
   * @return totalConversionsViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数の合計（クリック経由）です。</div> <div lang=\"en\">Total of conversions (via click).</div> ")


  public Long getTotalConversionsViaAdClick() {
    return totalConversionsViaAdClick;
  }

  public void setTotalConversionsViaAdClick(Long totalConversionsViaAdClick) {
    this.totalConversionsViaAdClick = totalConversionsViaAdClick;
  }

  public ConversionTrackerServicePage totalCrossDeviceConversions(Long totalCrossDeviceConversions) {
    this.totalCrossDeviceConversions = totalCrossDeviceConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">クロスデバイスコンバージョン数の合計です。</div> <div lang=\"en\">Total of cross-device conv.</div> 
   * @return totalCrossDeviceConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クロスデバイスコンバージョン数の合計です。</div> <div lang=\"en\">Total of cross-device conv.</div> ")


  public Long getTotalCrossDeviceConversions() {
    return totalCrossDeviceConversions;
  }

  public void setTotalCrossDeviceConversions(Long totalCrossDeviceConversions) {
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
    this.values = values;
    return this;
  }

  public ConversionTrackerServicePage addValuesItem(ConversionTrackerServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ConversionTrackerServiceValue> getValues() {
    return values;
  }

  public void setValues(List<ConversionTrackerServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


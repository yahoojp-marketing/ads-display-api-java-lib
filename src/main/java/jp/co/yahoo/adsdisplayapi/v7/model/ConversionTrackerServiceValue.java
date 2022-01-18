package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.ConversionTracker;
import jp.co.yahoo.adsdisplayapi.v7.model.ConversionTrackerServiceStatsPeriodCustomDate;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceValueオブジェクトは、操作結果を含むコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceValue object displays the entity of Conversion Tracker information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceValueオブジェクトは、操作結果を含むコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTrackerServiceValue object displays the entity of Conversion Tracker information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceValue   {
  @JsonProperty("conversionTracker")
  private ConversionTracker conversionTracker = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("statsPeriodCustomDate")
  private ConversionTrackerServiceStatsPeriodCustomDate statsPeriodCustomDate = null;

  public ConversionTrackerServiceValue conversionTracker(ConversionTracker conversionTracker) {
    this.conversionTracker = conversionTracker;
    return this;
  }

  /**
   * Get conversionTracker
   * @return conversionTracker
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTracker getConversionTracker() {
    return conversionTracker;
  }

  public void setConversionTracker(ConversionTracker conversionTracker) {
    this.conversionTracker = conversionTracker;
  }

  public ConversionTrackerServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ConversionTrackerServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public ConversionTrackerServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public ConversionTrackerServiceValue statsPeriodCustomDate(ConversionTrackerServiceStatsPeriodCustomDate statsPeriodCustomDate) {
    this.statsPeriodCustomDate = statsPeriodCustomDate;
    return this;
  }

  /**
   * Get statsPeriodCustomDate
   * @return statsPeriodCustomDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceStatsPeriodCustomDate getStatsPeriodCustomDate() {
    return statsPeriodCustomDate;
  }

  public void setStatsPeriodCustomDate(ConversionTrackerServiceStatsPeriodCustomDate statsPeriodCustomDate) {
    this.statsPeriodCustomDate = statsPeriodCustomDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceValue conversionTrackerServiceValue = (ConversionTrackerServiceValue) o;
    return Objects.equals(this.conversionTracker, conversionTrackerServiceValue.conversionTracker) &&
        Objects.equals(this.errors, conversionTrackerServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, conversionTrackerServiceValue.operationSucceeded) &&
        Objects.equals(this.statsPeriodCustomDate, conversionTrackerServiceValue.statsPeriodCustomDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTracker, errors, operationSucceeded, statsPeriodCustomDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceValue {\n");
    
    sb.append("    conversionTracker: ").append(toIndentedString(conversionTracker)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    statsPeriodCustomDate: ").append(toIndentedString(statsPeriodCustomDate)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupServiceAutoConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupServiceManualConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupServiceNoneConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupServiceOptimizerType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceConversionOptimizerは、コンバージョン最適化制御を保持するオブジェクトです。&lt;br&gt; ADD、SETのどちらも指定できません。ADD時、MANUAL固定となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceConversionOptimizer retains conversion optimization control.&lt;br&gt; Not allowed for ADD and SET. In ADD operation, it is set to \&quot;MANUAL\&quot;. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceConversionOptimizerは、コンバージョン最適化制御を保持するオブジェクトです。<br> ADD、SETのどちらも指定できません。ADD時、MANUAL固定となります。 </div> <div lang=\"en\"> AdGroupServiceConversionOptimizer retains conversion optimization control.<br> Not allowed for ADD and SET. In ADD operation, it is set to \"MANUAL\". </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceConversionOptimizer   {
  @JsonProperty("autoConversionOptimizer")
  private AdGroupServiceAutoConversionOptimizer autoConversionOptimizer = null;

  @JsonProperty("manualConversionOptimizer")
  private AdGroupServiceManualConversionOptimizer manualConversionOptimizer = null;

  @JsonProperty("noneConversionOptimizer")
  private AdGroupServiceNoneConversionOptimizer noneConversionOptimizer = null;

  @JsonProperty("optimizerType")
  private AdGroupServiceOptimizerType optimizerType = null;

  public AdGroupServiceConversionOptimizer autoConversionOptimizer(AdGroupServiceAutoConversionOptimizer autoConversionOptimizer) {
    this.autoConversionOptimizer = autoConversionOptimizer;
    return this;
  }

  /**
   * Get autoConversionOptimizer
   * @return autoConversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceAutoConversionOptimizer getAutoConversionOptimizer() {
    return autoConversionOptimizer;
  }

  public void setAutoConversionOptimizer(AdGroupServiceAutoConversionOptimizer autoConversionOptimizer) {
    this.autoConversionOptimizer = autoConversionOptimizer;
  }

  public AdGroupServiceConversionOptimizer manualConversionOptimizer(AdGroupServiceManualConversionOptimizer manualConversionOptimizer) {
    this.manualConversionOptimizer = manualConversionOptimizer;
    return this;
  }

  /**
   * Get manualConversionOptimizer
   * @return manualConversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceManualConversionOptimizer getManualConversionOptimizer() {
    return manualConversionOptimizer;
  }

  public void setManualConversionOptimizer(AdGroupServiceManualConversionOptimizer manualConversionOptimizer) {
    this.manualConversionOptimizer = manualConversionOptimizer;
  }

  public AdGroupServiceConversionOptimizer noneConversionOptimizer(AdGroupServiceNoneConversionOptimizer noneConversionOptimizer) {
    this.noneConversionOptimizer = noneConversionOptimizer;
    return this;
  }

  /**
   * Get noneConversionOptimizer
   * @return noneConversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceNoneConversionOptimizer getNoneConversionOptimizer() {
    return noneConversionOptimizer;
  }

  public void setNoneConversionOptimizer(AdGroupServiceNoneConversionOptimizer noneConversionOptimizer) {
    this.noneConversionOptimizer = noneConversionOptimizer;
  }

  public AdGroupServiceConversionOptimizer optimizerType(AdGroupServiceOptimizerType optimizerType) {
    this.optimizerType = optimizerType;
    return this;
  }

  /**
   * Get optimizerType
   * @return optimizerType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceOptimizerType getOptimizerType() {
    return optimizerType;
  }

  public void setOptimizerType(AdGroupServiceOptimizerType optimizerType) {
    this.optimizerType = optimizerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceConversionOptimizer adGroupServiceConversionOptimizer = (AdGroupServiceConversionOptimizer) o;
    return Objects.equals(this.autoConversionOptimizer, adGroupServiceConversionOptimizer.autoConversionOptimizer) &&
        Objects.equals(this.manualConversionOptimizer, adGroupServiceConversionOptimizer.manualConversionOptimizer) &&
        Objects.equals(this.noneConversionOptimizer, adGroupServiceConversionOptimizer.noneConversionOptimizer) &&
        Objects.equals(this.optimizerType, adGroupServiceConversionOptimizer.optimizerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoConversionOptimizer, manualConversionOptimizer, noneConversionOptimizer, optimizerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceConversionOptimizer {\n");
    
    sb.append("    autoConversionOptimizer: ").append(toIndentedString(autoConversionOptimizer)).append("\n");
    sb.append("    manualConversionOptimizer: ").append(toIndentedString(manualConversionOptimizer)).append("\n");
    sb.append("    noneConversionOptimizer: ").append(toIndentedString(noneConversionOptimizer)).append("\n");
    sb.append("    optimizerType: ").append(toIndentedString(optimizerType)).append("\n");
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


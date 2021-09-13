package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionGroup;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupServiceValueオブジェクトは、操作結果を含むコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionGroupServiceValue object displays the entity of Conversion Tracker information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionGroupServiceValueオブジェクトは、操作結果を含むコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionGroupServiceValue object displays the entity of Conversion Tracker information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionGroupServiceValue   {
  @JsonProperty("conversionGroup")
  private ConversionGroup conversionGroup = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public ConversionGroupServiceValue conversionGroup(ConversionGroup conversionGroup) {
    this.conversionGroup = conversionGroup;
    return this;
  }

  /**
   * Get conversionGroup
   * @return conversionGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionGroup getConversionGroup() {
    return conversionGroup;
  }

  public void setConversionGroup(ConversionGroup conversionGroup) {
    this.conversionGroup = conversionGroup;
  }

  public ConversionGroupServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ConversionGroupServiceValue addErrorsItem(Error errorsItem) {
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

  public ConversionGroupServiceValue operationSucceeded(Boolean operationSucceeded) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionGroupServiceValue conversionGroupServiceValue = (ConversionGroupServiceValue) o;
    return Objects.equals(this.conversionGroup, conversionGroupServiceValue.conversionGroup) &&
        Objects.equals(this.errors, conversionGroupServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, conversionGroupServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionGroup, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionGroupServiceValue {\n");
    
    sb.append("    conversionGroup: ").append(toIndentedString(conversionGroup)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.DictionaryServiceGeographicLocation;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationValueオブジェクトは、地域情報のリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocationValue object displays the list of geographic location.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationValueオブジェクトは、地域情報のリストを表します。</div> <div lang=\"en\">DictionaryServiceGeographicLocationValue object displays the list of geographic location.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceGeographicLocationValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("geographicLocation")
  private DictionaryServiceGeographicLocation geographicLocation = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public DictionaryServiceGeographicLocationValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public DictionaryServiceGeographicLocationValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceGeographicLocationValue geographicLocation(DictionaryServiceGeographicLocation geographicLocation) {
    this.geographicLocation = geographicLocation;
    return this;
  }

  /**
   * Get geographicLocation
   * @return geographicLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServiceGeographicLocation getGeographicLocation() {
    return geographicLocation;
  }

  public void setGeographicLocation(DictionaryServiceGeographicLocation geographicLocation) {
    this.geographicLocation = geographicLocation;
  }

  public DictionaryServiceGeographicLocationValue operationSucceeded(Boolean operationSucceeded) {
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
    DictionaryServiceGeographicLocationValue dictionaryServiceGeographicLocationValue = (DictionaryServiceGeographicLocationValue) o;
    return Objects.equals(this.errors, dictionaryServiceGeographicLocationValue.errors) &&
        Objects.equals(this.geographicLocation, dictionaryServiceGeographicLocationValue.geographicLocation) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceGeographicLocationValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, geographicLocation, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGeographicLocationValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    geographicLocation: ").append(toIndentedString(geographicLocation)).append("\n");
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


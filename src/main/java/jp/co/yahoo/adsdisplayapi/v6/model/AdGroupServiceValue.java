package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroup;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceValueオブジェクトは、処理結果を含む広告グループに関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceValue serves the information of adGroup including operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceValueオブジェクトは、処理結果を含む広告グループに関する情報を表します。</div> <div lang=\"en\">AdGroupServiceValue serves the information of adGroup including operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceValue   {
  @JsonProperty("adGroup")
  private AdGroup adGroup = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupServiceValue adGroup(AdGroup adGroup) {
    this.adGroup = adGroup;
    return this;
  }

  /**
   * Get adGroup
   * @return adGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroup getAdGroup() {
    return adGroup;
  }

  public void setAdGroup(AdGroup adGroup) {
    this.adGroup = adGroup;
  }

  public AdGroupServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">A result of operation.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">A result of operation.</div> ")


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
    AdGroupServiceValue adGroupServiceValue = (AdGroupServiceValue) o;
    return Objects.equals(this.adGroup, adGroupServiceValue.adGroup) &&
        Objects.equals(this.errors, adGroupServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroup, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceValue {\n");
    
    sb.append("    adGroup: ").append(toIndentedString(adGroup)).append("\n");
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


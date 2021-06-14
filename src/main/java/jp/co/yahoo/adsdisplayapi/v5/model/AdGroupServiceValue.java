package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroup;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceValueオブジェクトは、処理結果を含む広告グループに関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceValue serves the information of adGroup including operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceValueオブジェクトは、処理結果を含む広告グループに関する情報を表します。</div> <div lang=\"en\">AdGroupServiceValue serves the information of adGroup including operation results.</div> ")

public class AdGroupServiceValue   {
  @JsonProperty("adGroup")
  private JsonNullable<AdGroup> adGroup = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public AdGroupServiceValue adGroup(AdGroup adGroup) {
    this.adGroup = JsonNullable.of(adGroup);
    return this;
  }

  /**
   * Get adGroup
   * @return adGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroup> getAdGroup() {
    return adGroup;
  }

  public void setAdGroup(JsonNullable<AdGroup> adGroup) {
    this.adGroup = adGroup;
  }

  public AdGroupServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public AdGroupServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">A result of operation.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">A result of operation.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


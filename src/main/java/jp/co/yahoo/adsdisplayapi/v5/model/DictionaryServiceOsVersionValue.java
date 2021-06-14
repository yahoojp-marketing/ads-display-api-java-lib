package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceOsVersion;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceOsVersionValueオブジェクトは、getOsVersionメソッドの実行結果（１Entity）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceOsVersionValue object contains the results (1 Entity) for getOsVersion method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceOsVersionValueオブジェクトは、getOsVersionメソッドの実行結果（１Entity）を保持します。</div> <div lang=\"en\">DictionaryServiceOsVersionValue object contains the results (1 Entity) for getOsVersion method.</div> ")

public class DictionaryServiceOsVersionValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  @JsonProperty("osVersion")
  @Valid
  private JsonNullable<List<DictionaryServiceOsVersion>> osVersion = JsonNullable.undefined();

  public DictionaryServiceOsVersionValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public DictionaryServiceOsVersionValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceOsVersionValue operationSucceeded(Boolean operationSucceeded) {
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

  public DictionaryServiceOsVersionValue osVersion(List<DictionaryServiceOsVersion> osVersion) {
    this.osVersion = JsonNullable.of(osVersion);
    return this;
  }

  public DictionaryServiceOsVersionValue addOsVersionItem(DictionaryServiceOsVersion osVersionItem) {
    if (this.osVersion == null || !this.osVersion.isPresent()) {
      this.osVersion = JsonNullable.of(new ArrayList<>());
    }
    this.osVersion.get().add(osVersionItem);
    return this;
  }

  /**
   * Get osVersion
   * @return osVersion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<DictionaryServiceOsVersion>> getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(JsonNullable<List<DictionaryServiceOsVersion>> osVersion) {
    this.osVersion = osVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceOsVersionValue dictionaryServiceOsVersionValue = (DictionaryServiceOsVersionValue) o;
    return Objects.equals(this.errors, dictionaryServiceOsVersionValue.errors) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceOsVersionValue.operationSucceeded) &&
        Objects.equals(this.osVersion, dictionaryServiceOsVersionValue.osVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, osVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceOsVersionValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
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


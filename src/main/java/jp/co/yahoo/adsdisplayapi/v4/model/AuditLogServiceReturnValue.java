package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.AuditLogServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceReturnValueは、addメソッドの実行結果を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceReturnValue is an object which acquires the exec parameter of add method&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceReturnValueは、addメソッドの実行結果を保持するオブジェクトです。</div> <div lang=\"en\">AuditLogServiceReturnValue is an object which acquires the exec parameter of add method</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuditLogServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AuditLogServiceValue> values = null;

  public AuditLogServiceReturnValue values(List<AuditLogServiceValue> values) {
    this.values = values;
    return this;
  }

  public AuditLogServiceReturnValue addValuesItem(AuditLogServiceValue valuesItem) {
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

  public List<AuditLogServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AuditLogServiceValue> values) {
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
    AuditLogServiceReturnValue auditLogServiceReturnValue = (AuditLogServiceReturnValue) o;
    return Objects.equals(this.values, auditLogServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceReturnValue {\n");
    
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


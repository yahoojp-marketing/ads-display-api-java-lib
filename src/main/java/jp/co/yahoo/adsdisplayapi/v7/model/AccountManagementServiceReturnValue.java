package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AccountManagementServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceReturnValueオブジェクトは、アカウント情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountManagementServiceReturnValue object is a container for storing account information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementServiceReturnValueオブジェクトは、アカウント情報を格納するコンテナです。</div> <div lang=\"en\">The AccountManagementServiceReturnValue object is a container for storing account information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagementServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AccountManagementServiceValue> values = null;

  public AccountManagementServiceReturnValue values(List<AccountManagementServiceValue> values) {
    this.values = values;
    return this;
  }

  public AccountManagementServiceReturnValue addValuesItem(AccountManagementServiceValue valuesItem) {
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

  public List<AccountManagementServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AccountManagementServiceValue> values) {
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
    AccountManagementServiceReturnValue accountManagementServiceReturnValue = (AccountManagementServiceReturnValue) o;
    return Objects.equals(this.values, accountManagementServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServiceReturnValue {\n");
    
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


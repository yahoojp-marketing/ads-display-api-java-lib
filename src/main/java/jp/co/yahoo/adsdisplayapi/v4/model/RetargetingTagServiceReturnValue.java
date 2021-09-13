package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.RetargetingTagServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingTagServiceReturnValueオブジェクトは、サイトリターゲティングタグの情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingTagServiceReturnValue object is a container that holds tag information of site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingTagServiceReturnValueオブジェクトは、サイトリターゲティングタグの情報を格納するコンテナです。</div> <div lang=\"en\">RetargetingTagServiceReturnValue object is a container that holds tag information of site retargeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingTagServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<RetargetingTagServiceValue> values = null;

  public RetargetingTagServiceReturnValue values(List<RetargetingTagServiceValue> values) {
    this.values = values;
    return this;
  }

  public RetargetingTagServiceReturnValue addValuesItem(RetargetingTagServiceValue valuesItem) {
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

  public List<RetargetingTagServiceValue> getValues() {
    return values;
  }

  public void setValues(List<RetargetingTagServiceValue> values) {
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
    RetargetingTagServiceReturnValue retargetingTagServiceReturnValue = (RetargetingTagServiceReturnValue) o;
    return Objects.equals(this.values, retargetingTagServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingTagServiceReturnValue {\n");
    
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

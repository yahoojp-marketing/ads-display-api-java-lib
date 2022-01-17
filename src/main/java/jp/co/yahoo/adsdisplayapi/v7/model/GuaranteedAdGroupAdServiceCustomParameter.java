package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupAdServiceCustomParameterは、カスタムパラメータの内容を表します。&lt;br&gt;ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedAdGroupAdServiceCustomParameter displays the element of custom parameters.&lt;br&gt;This field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupAdServiceCustomParameterは、カスタムパラメータの内容を表します。<br>ADD時、このフィールドは必須となります。</div> <div lang=\"en\">GuaranteedAdGroupAdServiceCustomParameter displays the element of custom parameters.<br>This field is required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceCustomParameter   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public GuaranteedAdGroupAdServiceCustomParameter key(String key) {
    this.key = key;
    return this;
  }

  /**
   * <div lang=\"ja\">キーです。<br>ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Key of parameter.<br>This field is required in ADD and SET operation.</div> 
   * @return key
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーです。<br>ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Key of parameter.<br>This field is required in ADD and SET operation.</div> ")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public GuaranteedAdGroupAdServiceCustomParameter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <div lang=\"ja\">値です。<br>ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Value of parameter.<br>This field is optional in ADD and SET operation.</div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\">値です。<br>ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Value of parameter.<br>This field is optional in ADD and SET operation.</div> ")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceCustomParameter guaranteedAdGroupAdServiceCustomParameter = (GuaranteedAdGroupAdServiceCustomParameter) o;
    return Objects.equals(this.key, guaranteedAdGroupAdServiceCustomParameter.key) &&
        Objects.equals(this.value, guaranteedAdGroupAdServiceCustomParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceCustomParameter {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


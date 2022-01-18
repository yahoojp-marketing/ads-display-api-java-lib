package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceCustomParameter;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupAdServiceCustomParametersは、カスタムパラメータの設定を表します。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; SET時にurlを指定する場合、このフィールドの値はクリアされます。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedAdGroupAdServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; If url is specified in SET operation, the value in this field will be cleared.&lt;br&gt; * Not Available. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupAdServiceCustomParametersは、カスタムパラメータの設定を表します。<br> finalUrlを指定するときのみ、任意で指定できます。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。<br> ※現在利用できません </div> <div lang=\"en\">GuaranteedAdGroupAdServiceCustomParameters displays the setting of custom parameters.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared.<br> * Not Available. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceCustomParameters   {
  @JsonProperty("isRemove")
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemove = null;

  @JsonProperty("parameters")
  @Valid
  private List<GuaranteedAdGroupAdServiceCustomParameter> parameters = null;

  public GuaranteedAdGroupAdServiceCustomParameters isRemove(GuaranteedAdGroupAdServiceIsRemoveFlg isRemove) {
    this.isRemove = isRemove;
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(GuaranteedAdGroupAdServiceIsRemoveFlg isRemove) {
    this.isRemove = isRemove;
  }

  public GuaranteedAdGroupAdServiceCustomParameters parameters(List<GuaranteedAdGroupAdServiceCustomParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public GuaranteedAdGroupAdServiceCustomParameters addParametersItem(GuaranteedAdGroupAdServiceCustomParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedAdGroupAdServiceCustomParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<GuaranteedAdGroupAdServiceCustomParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceCustomParameters guaranteedAdGroupAdServiceCustomParameters = (GuaranteedAdGroupAdServiceCustomParameters) o;
    return Objects.equals(this.isRemove, guaranteedAdGroupAdServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, guaranteedAdGroupAdServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceCustomParameters {\n");
    
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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


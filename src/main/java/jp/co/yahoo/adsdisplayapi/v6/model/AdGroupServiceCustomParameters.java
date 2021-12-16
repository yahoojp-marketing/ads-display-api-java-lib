package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupServiceCustomParameter;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceCustomParametersは、カスタムパラメータの設定を表します。&lt;br&gt;  このフィールドは、省略可能となります。&lt;br&gt; ※SET時、既存の項目を置き換えます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field is optional.&lt;br&gt; *In SET operation, it will replace the current items. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceCustomParametersは、カスタムパラメータの設定を表します。<br>  このフィールドは、省略可能となります。<br> ※SET時、既存の項目を置き換えます。</div> <div lang=\"en\">AdGroupServiceCustomParameters displays the setting of custom parameters.<br> This field is optional.<br> *In SET operation, it will replace the current items. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceCustomParameters   {
  @JsonProperty("isRemove")
  private AdGroupServiceIsRemoveFlg isRemove = null;

  @JsonProperty("parameters")
  @Valid
  private List<AdGroupServiceCustomParameter> parameters = null;

  public AdGroupServiceCustomParameters isRemove(AdGroupServiceIsRemoveFlg isRemove) {
    this.isRemove = isRemove;
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceIsRemoveFlg getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(AdGroupServiceIsRemoveFlg isRemove) {
    this.isRemove = isRemove;
  }

  public AdGroupServiceCustomParameters parameters(List<AdGroupServiceCustomParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AdGroupServiceCustomParameters addParametersItem(AdGroupServiceCustomParameter parametersItem) {
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

  public List<AdGroupServiceCustomParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<AdGroupServiceCustomParameter> parameters) {
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
    AdGroupServiceCustomParameters adGroupServiceCustomParameters = (AdGroupServiceCustomParameters) o;
    return Objects.equals(this.isRemove, adGroupServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, adGroupServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceCustomParameters {\n");
    
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


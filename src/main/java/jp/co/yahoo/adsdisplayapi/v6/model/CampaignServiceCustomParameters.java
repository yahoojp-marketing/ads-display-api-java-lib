package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.CampaignServiceCustomParameter;
import jp.co.yahoo.adsdisplayapi.v6.model.CampaignServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceCustomParametersは、カスタムパラメータの設定を表します。&lt;br&gt; ADD時およびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceCustomParametersは、カスタムパラメータの設定を表します。<br> ADD時およびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">CampaignServiceCustomParameters displays the setting of custom parameters.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceCustomParameters   {
  @JsonProperty("isRemove")
  private CampaignServiceIsRemoveFlg isRemove = null;

  @JsonProperty("parameters")
  @Valid
  private List<CampaignServiceCustomParameter> parameters = null;

  public CampaignServiceCustomParameters isRemove(CampaignServiceIsRemoveFlg isRemove) {
    this.isRemove = isRemove;
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceIsRemoveFlg getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(CampaignServiceIsRemoveFlg isRemove) {
    this.isRemove = isRemove;
  }

  public CampaignServiceCustomParameters parameters(List<CampaignServiceCustomParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public CampaignServiceCustomParameters addParametersItem(CampaignServiceCustomParameter parametersItem) {
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

  public List<CampaignServiceCustomParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<CampaignServiceCustomParameter> parameters) {
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
    CampaignServiceCustomParameters campaignServiceCustomParameters = (CampaignServiceCustomParameters) o;
    return Objects.equals(this.isRemove, campaignServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, campaignServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCustomParameters {\n");
    
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


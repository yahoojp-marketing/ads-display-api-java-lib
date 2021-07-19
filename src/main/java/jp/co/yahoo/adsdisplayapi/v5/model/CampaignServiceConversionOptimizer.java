package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceAutoCampaignConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceConversionOptimizerType;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceManualCampaignConversionOptimizer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceConversionOptimizerは、コンバージョン最適化制御を保持するオブジェクトです。&lt;br&gt; このフィールドは、SET時に省略可能となり、ADDおよびREMOVE時に無視されます。&lt;br&gt; ※SET時、目的ありの場合は設定不可となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceConversionOptimizer retains conversion optimization control.&lt;br&gt; This field is optional in SET operation, and will be ignored in ADD and REMOVE operation. &lt;br&gt; *For campaign with campaign goal, this field cannot be set in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceConversionOptimizerは、コンバージョン最適化制御を保持するオブジェクトです。<br> このフィールドは、SET時に省略可能となり、ADDおよびREMOVE時に無視されます。<br> ※SET時、目的ありの場合は設定不可となります。 </div> <div lang=\"en\"> CampaignServiceConversionOptimizer retains conversion optimization control.<br> This field is optional in SET operation, and will be ignored in ADD and REMOVE operation. <br> *For campaign with campaign goal, this field cannot be set in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceConversionOptimizer   {
  @JsonProperty("autoCampaignConversionOptimizer")
  private CampaignServiceAutoCampaignConversionOptimizer autoCampaignConversionOptimizer = null;

  @JsonProperty("conversionOptimizerType")
  private CampaignServiceConversionOptimizerType conversionOptimizerType = null;

  @JsonProperty("manualCampaignConversionOptimizer")
  private CampaignServiceManualCampaignConversionOptimizer manualCampaignConversionOptimizer = null;

  public CampaignServiceConversionOptimizer autoCampaignConversionOptimizer(CampaignServiceAutoCampaignConversionOptimizer autoCampaignConversionOptimizer) {
    this.autoCampaignConversionOptimizer = autoCampaignConversionOptimizer;
    return this;
  }

  /**
   * Get autoCampaignConversionOptimizer
   * @return autoCampaignConversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceAutoCampaignConversionOptimizer getAutoCampaignConversionOptimizer() {
    return autoCampaignConversionOptimizer;
  }

  public void setAutoCampaignConversionOptimizer(CampaignServiceAutoCampaignConversionOptimizer autoCampaignConversionOptimizer) {
    this.autoCampaignConversionOptimizer = autoCampaignConversionOptimizer;
  }

  public CampaignServiceConversionOptimizer conversionOptimizerType(CampaignServiceConversionOptimizerType conversionOptimizerType) {
    this.conversionOptimizerType = conversionOptimizerType;
    return this;
  }

  /**
   * Get conversionOptimizerType
   * @return conversionOptimizerType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceConversionOptimizerType getConversionOptimizerType() {
    return conversionOptimizerType;
  }

  public void setConversionOptimizerType(CampaignServiceConversionOptimizerType conversionOptimizerType) {
    this.conversionOptimizerType = conversionOptimizerType;
  }

  public CampaignServiceConversionOptimizer manualCampaignConversionOptimizer(CampaignServiceManualCampaignConversionOptimizer manualCampaignConversionOptimizer) {
    this.manualCampaignConversionOptimizer = manualCampaignConversionOptimizer;
    return this;
  }

  /**
   * Get manualCampaignConversionOptimizer
   * @return manualCampaignConversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceManualCampaignConversionOptimizer getManualCampaignConversionOptimizer() {
    return manualCampaignConversionOptimizer;
  }

  public void setManualCampaignConversionOptimizer(CampaignServiceManualCampaignConversionOptimizer manualCampaignConversionOptimizer) {
    this.manualCampaignConversionOptimizer = manualCampaignConversionOptimizer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceConversionOptimizer campaignServiceConversionOptimizer = (CampaignServiceConversionOptimizer) o;
    return Objects.equals(this.autoCampaignConversionOptimizer, campaignServiceConversionOptimizer.autoCampaignConversionOptimizer) &&
        Objects.equals(this.conversionOptimizerType, campaignServiceConversionOptimizer.conversionOptimizerType) &&
        Objects.equals(this.manualCampaignConversionOptimizer, campaignServiceConversionOptimizer.manualCampaignConversionOptimizer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCampaignConversionOptimizer, conversionOptimizerType, manualCampaignConversionOptimizer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceConversionOptimizer {\n");
    
    sb.append("    autoCampaignConversionOptimizer: ").append(toIndentedString(autoCampaignConversionOptimizer)).append("\n");
    sb.append("    conversionOptimizerType: ").append(toIndentedString(conversionOptimizerType)).append("\n");
    sb.append("    manualCampaignConversionOptimizer: ").append(toIndentedString(manualCampaignConversionOptimizer)).append("\n");
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


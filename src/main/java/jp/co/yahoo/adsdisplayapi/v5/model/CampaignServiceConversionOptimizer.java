package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceAutoCampaignConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceConversionOptimizerType;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceManualCampaignConversionOptimizer;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceConversionOptimizerは、コンバージョン最適化制御を保持するオブジェクトです。&lt;br&gt; このフィールドは、SET時に省略可能となり、ADDおよびREMOVE時に無視されます。&lt;br&gt; ※SET時、目的ありの場合は設定不可となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceConversionOptimizer retains conversion optimization control.&lt;br&gt; This field is optional in SET operation, and will be ignored in ADD and REMOVE operation. &lt;br&gt; *For campaign with campaign goal, this field cannot be set in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceConversionOptimizerは、コンバージョン最適化制御を保持するオブジェクトです。<br> このフィールドは、SET時に省略可能となり、ADDおよびREMOVE時に無視されます。<br> ※SET時、目的ありの場合は設定不可となります。 </div> <div lang=\"en\"> CampaignServiceConversionOptimizer retains conversion optimization control.<br> This field is optional in SET operation, and will be ignored in ADD and REMOVE operation. <br> *For campaign with campaign goal, this field cannot be set in SET operation. </div> ")

public class CampaignServiceConversionOptimizer   {
  @JsonProperty("autoCampaignConversionOptimizer")
  private JsonNullable<CampaignServiceAutoCampaignConversionOptimizer> autoCampaignConversionOptimizer = JsonNullable.undefined();

  @JsonProperty("conversionOptimizerType")
  private JsonNullable<CampaignServiceConversionOptimizerType> conversionOptimizerType = JsonNullable.undefined();

  @JsonProperty("manualCampaignConversionOptimizer")
  private JsonNullable<CampaignServiceManualCampaignConversionOptimizer> manualCampaignConversionOptimizer = JsonNullable.undefined();

  public CampaignServiceConversionOptimizer autoCampaignConversionOptimizer(CampaignServiceAutoCampaignConversionOptimizer autoCampaignConversionOptimizer) {
    this.autoCampaignConversionOptimizer = JsonNullable.of(autoCampaignConversionOptimizer);
    return this;
  }

  /**
   * Get autoCampaignConversionOptimizer
   * @return autoCampaignConversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceAutoCampaignConversionOptimizer> getAutoCampaignConversionOptimizer() {
    return autoCampaignConversionOptimizer;
  }

  public void setAutoCampaignConversionOptimizer(JsonNullable<CampaignServiceAutoCampaignConversionOptimizer> autoCampaignConversionOptimizer) {
    this.autoCampaignConversionOptimizer = autoCampaignConversionOptimizer;
  }

  public CampaignServiceConversionOptimizer conversionOptimizerType(CampaignServiceConversionOptimizerType conversionOptimizerType) {
    this.conversionOptimizerType = JsonNullable.of(conversionOptimizerType);
    return this;
  }

  /**
   * Get conversionOptimizerType
   * @return conversionOptimizerType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceConversionOptimizerType> getConversionOptimizerType() {
    return conversionOptimizerType;
  }

  public void setConversionOptimizerType(JsonNullable<CampaignServiceConversionOptimizerType> conversionOptimizerType) {
    this.conversionOptimizerType = conversionOptimizerType;
  }

  public CampaignServiceConversionOptimizer manualCampaignConversionOptimizer(CampaignServiceManualCampaignConversionOptimizer manualCampaignConversionOptimizer) {
    this.manualCampaignConversionOptimizer = JsonNullable.of(manualCampaignConversionOptimizer);
    return this;
  }

  /**
   * Get manualCampaignConversionOptimizer
   * @return manualCampaignConversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceManualCampaignConversionOptimizer> getManualCampaignConversionOptimizer() {
    return manualCampaignConversionOptimizer;
  }

  public void setManualCampaignConversionOptimizer(JsonNullable<CampaignServiceManualCampaignConversionOptimizer> manualCampaignConversionOptimizer) {
    this.manualCampaignConversionOptimizer = manualCampaignConversionOptimizer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


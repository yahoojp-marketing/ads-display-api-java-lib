package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceConversionOptimizerEligibilityFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceConversionOptimizerTrainingStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceManualCampaignConversionOptimizerオブジェクトは、コンバージョン最適化設定情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceManualCampaignConversionOptimizer displays the contents of Conversion Optimization settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceManualCampaignConversionOptimizerオブジェクトは、コンバージョン最適化設定情報を表します。</div> <div lang=\"en\">CampaignServiceManualCampaignConversionOptimizer displays the contents of Conversion Optimization settings.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceManualCampaignConversionOptimizer   {
  @JsonProperty("conversionOptimizerEligibilityFlg")
  private CampaignServiceConversionOptimizerEligibilityFlg conversionOptimizerEligibilityFlg = null;

  @JsonProperty("conversionOptimizerTrainingStatus")
  private CampaignServiceConversionOptimizerTrainingStatus conversionOptimizerTrainingStatus = null;

  public CampaignServiceManualCampaignConversionOptimizer conversionOptimizerEligibilityFlg(CampaignServiceConversionOptimizerEligibilityFlg conversionOptimizerEligibilityFlg) {
    this.conversionOptimizerEligibilityFlg = conversionOptimizerEligibilityFlg;
    return this;
  }

  /**
   * Get conversionOptimizerEligibilityFlg
   * @return conversionOptimizerEligibilityFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceConversionOptimizerEligibilityFlg getConversionOptimizerEligibilityFlg() {
    return conversionOptimizerEligibilityFlg;
  }

  public void setConversionOptimizerEligibilityFlg(CampaignServiceConversionOptimizerEligibilityFlg conversionOptimizerEligibilityFlg) {
    this.conversionOptimizerEligibilityFlg = conversionOptimizerEligibilityFlg;
  }

  public CampaignServiceManualCampaignConversionOptimizer conversionOptimizerTrainingStatus(CampaignServiceConversionOptimizerTrainingStatus conversionOptimizerTrainingStatus) {
    this.conversionOptimizerTrainingStatus = conversionOptimizerTrainingStatus;
    return this;
  }

  /**
   * Get conversionOptimizerTrainingStatus
   * @return conversionOptimizerTrainingStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceConversionOptimizerTrainingStatus getConversionOptimizerTrainingStatus() {
    return conversionOptimizerTrainingStatus;
  }

  public void setConversionOptimizerTrainingStatus(CampaignServiceConversionOptimizerTrainingStatus conversionOptimizerTrainingStatus) {
    this.conversionOptimizerTrainingStatus = conversionOptimizerTrainingStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceManualCampaignConversionOptimizer campaignServiceManualCampaignConversionOptimizer = (CampaignServiceManualCampaignConversionOptimizer) o;
    return Objects.equals(this.conversionOptimizerEligibilityFlg, campaignServiceManualCampaignConversionOptimizer.conversionOptimizerEligibilityFlg) &&
        Objects.equals(this.conversionOptimizerTrainingStatus, campaignServiceManualCampaignConversionOptimizer.conversionOptimizerTrainingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionOptimizerEligibilityFlg, conversionOptimizerTrainingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceManualCampaignConversionOptimizer {\n");
    
    sb.append("    conversionOptimizerEligibilityFlg: ").append(toIndentedString(conversionOptimizerEligibilityFlg)).append("\n");
    sb.append("    conversionOptimizerTrainingStatus: ").append(toIndentedString(conversionOptimizerTrainingStatus)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.CampaignServiceConversionOptimizerTrainingStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceConversionOptimizerは、コンバージョン最適化制御を保持するオブジェクトです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceConversionOptimizer retains conversion optimization control.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceConversionOptimizerは、コンバージョン最適化制御を保持するオブジェクトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> CampaignServiceConversionOptimizer retains conversion optimization control.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceConversionOptimizer   {
  @JsonProperty("conversionOptimizerTrainingStatus")
  private CampaignServiceConversionOptimizerTrainingStatus conversionOptimizerTrainingStatus = null;

  public CampaignServiceConversionOptimizer conversionOptimizerTrainingStatus(CampaignServiceConversionOptimizerTrainingStatus conversionOptimizerTrainingStatus) {
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
    CampaignServiceConversionOptimizer campaignServiceConversionOptimizer = (CampaignServiceConversionOptimizer) o;
    return Objects.equals(this.conversionOptimizerTrainingStatus, campaignServiceConversionOptimizer.conversionOptimizerTrainingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionOptimizerTrainingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceConversionOptimizer {\n");
    
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


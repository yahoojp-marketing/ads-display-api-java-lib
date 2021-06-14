package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceConversionOptimizerEligibilityFlg;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceAutoCampaignConversionOptimizerオブジェクトは、コンバージョン最適化設定情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceAutoCampaignConversionOptimizer retains conversion optimization settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceAutoCampaignConversionOptimizerオブジェクトは、コンバージョン最適化設定情報を表します。</div> <div lang=\"en\">CampaignServiceAutoCampaignConversionOptimizer retains conversion optimization settings.</div> ")

public class CampaignServiceAutoCampaignConversionOptimizer   {
  @JsonProperty("conversionOptimizerEligibilityFlg")
  private JsonNullable<CampaignServiceConversionOptimizerEligibilityFlg> conversionOptimizerEligibilityFlg = JsonNullable.undefined();

  @JsonProperty("targetCpa")
  private JsonNullable<Long> targetCpa = JsonNullable.undefined();

  public CampaignServiceAutoCampaignConversionOptimizer conversionOptimizerEligibilityFlg(CampaignServiceConversionOptimizerEligibilityFlg conversionOptimizerEligibilityFlg) {
    this.conversionOptimizerEligibilityFlg = JsonNullable.of(conversionOptimizerEligibilityFlg);
    return this;
  }

  /**
   * Get conversionOptimizerEligibilityFlg
   * @return conversionOptimizerEligibilityFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceConversionOptimizerEligibilityFlg> getConversionOptimizerEligibilityFlg() {
    return conversionOptimizerEligibilityFlg;
  }

  public void setConversionOptimizerEligibilityFlg(JsonNullable<CampaignServiceConversionOptimizerEligibilityFlg> conversionOptimizerEligibilityFlg) {
    this.conversionOptimizerEligibilityFlg = conversionOptimizerEligibilityFlg;
  }

  public CampaignServiceAutoCampaignConversionOptimizer targetCpa(Long targetCpa) {
    this.targetCpa = JsonNullable.of(targetCpa);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョン単価の目標値です。<br> このフィールドは、SET時に省略可能となり、ADDおよびREMOVE時に無視されます。<br> ※設定範囲：1 - 9,999,999,999<br> ※コンバージョン最適化機能が動作している場合には、手動で設定されている入札設定は無効になります。<br> </div> <div lang=\"en\"> This field is desired conversion cost value.<br> This field is optional in SET operation, and will be ignored in ADD and REMOVE operation. <br> * Settable range：1 - 9,999,999,999<br> * If function of conversion optimization is running, manual bid settings is invalid.<br> </div> 
   * @return targetCpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン単価の目標値です。<br> このフィールドは、SET時に省略可能となり、ADDおよびREMOVE時に無視されます。<br> ※設定範囲：1 - 9,999,999,999<br> ※コンバージョン最適化機能が動作している場合には、手動で設定されている入札設定は無効になります。<br> </div> <div lang=\"en\"> This field is desired conversion cost value.<br> This field is optional in SET operation, and will be ignored in ADD and REMOVE operation. <br> * Settable range：1 - 9,999,999,999<br> * If function of conversion optimization is running, manual bid settings is invalid.<br> </div> ")


  public JsonNullable<Long> getTargetCpa() {
    return targetCpa;
  }

  public void setTargetCpa(JsonNullable<Long> targetCpa) {
    this.targetCpa = targetCpa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceAutoCampaignConversionOptimizer campaignServiceAutoCampaignConversionOptimizer = (CampaignServiceAutoCampaignConversionOptimizer) o;
    return Objects.equals(this.conversionOptimizerEligibilityFlg, campaignServiceAutoCampaignConversionOptimizer.conversionOptimizerEligibilityFlg) &&
        Objects.equals(this.targetCpa, campaignServiceAutoCampaignConversionOptimizer.targetCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionOptimizerEligibilityFlg, targetCpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceAutoCampaignConversionOptimizer {\n");
    
    sb.append("    conversionOptimizerEligibilityFlg: ").append(toIndentedString(conversionOptimizerEligibilityFlg)).append("\n");
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
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


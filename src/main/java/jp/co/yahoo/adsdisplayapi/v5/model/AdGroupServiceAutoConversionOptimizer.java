package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceEligibilityFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceAutoConversionOptimizerオブジェクトは、コンバージョン最適化設定情報を表します。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、このフィールドは指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceAutoConversionOptimizer displays the contents of conversion optimization &#39;Auto Bidding&#39; settings.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, this field can not be set. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceAutoConversionOptimizerオブジェクトは、コンバージョン最適化設定情報を表します。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupServiceAutoConversionOptimizer displays the contents of conversion optimization 'Auto Bidding' settings.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceAutoConversionOptimizer   {
  @JsonProperty("eligibilityFlg")
  private AdGroupServiceEligibilityFlg eligibilityFlg = null;

  @JsonProperty("targetCpa")
  private Long targetCpa = null;

  public AdGroupServiceAutoConversionOptimizer eligibilityFlg(AdGroupServiceEligibilityFlg eligibilityFlg) {
    this.eligibilityFlg = eligibilityFlg;
    return this;
  }

  /**
   * Get eligibilityFlg
   * @return eligibilityFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceEligibilityFlg getEligibilityFlg() {
    return eligibilityFlg;
  }

  public void setEligibilityFlg(AdGroupServiceEligibilityFlg eligibilityFlg) {
    this.eligibilityFlg = eligibilityFlg;
  }

  public AdGroupServiceAutoConversionOptimizer targetCpa(Long targetCpa) {
    this.targetCpa = targetCpa;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョン単価の目標値です。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。<br> ※設定範囲は1 - 9,999,999,999です。<br> ※コンバージョン最適化機能が動作している場合には、手動で設定されている入札設定は無効になります。 </div> <div lang=\"en\"> Target cost per conversion.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set.<br> ∗Settable range is 1 - 9,999,999,999.<br> ∗If function of conversion optimization is running, manual bid settings is invalid. </div> 
   * @return targetCpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン単価の目標値です。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。<br> ※設定範囲は1 - 9,999,999,999です。<br> ※コンバージョン最適化機能が動作している場合には、手動で設定されている入札設定は無効になります。 </div> <div lang=\"en\"> Target cost per conversion.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set.<br> ∗Settable range is 1 - 9,999,999,999.<br> ∗If function of conversion optimization is running, manual bid settings is invalid. </div> ")


  public Long getTargetCpa() {
    return targetCpa;
  }

  public void setTargetCpa(Long targetCpa) {
    this.targetCpa = targetCpa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceAutoConversionOptimizer adGroupServiceAutoConversionOptimizer = (AdGroupServiceAutoConversionOptimizer) o;
    return Objects.equals(this.eligibilityFlg, adGroupServiceAutoConversionOptimizer.eligibilityFlg) &&
        Objects.equals(this.targetCpa, adGroupServiceAutoConversionOptimizer.targetCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibilityFlg, targetCpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceAutoConversionOptimizer {\n");
    
    sb.append("    eligibilityFlg: ").append(toIndentedString(eligibilityFlg)).append("\n");
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
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


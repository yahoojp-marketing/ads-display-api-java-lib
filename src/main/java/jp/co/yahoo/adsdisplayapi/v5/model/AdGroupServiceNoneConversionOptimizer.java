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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceNoneConversionOptimizerは、コンバージョン最適化「キャンペーンの入札方法を適用する」設定を保持するオブジェクトです。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、このフィールドは指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceNoneConversionOptimizer displays the contents of conversion optimization &#39;Apply same Bidding with campaign&#39; settings.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, this field can not be set. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceNoneConversionOptimizerは、コンバージョン最適化「キャンペーンの入札方法を適用する」設定を保持するオブジェクトです。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupServiceNoneConversionOptimizer displays the contents of conversion optimization 'Apply same Bidding with campaign' settings.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceNoneConversionOptimizer   {
  @JsonProperty("eligibilityFlg")
  private AdGroupServiceEligibilityFlg eligibilityFlg = null;

  public AdGroupServiceNoneConversionOptimizer eligibilityFlg(AdGroupServiceEligibilityFlg eligibilityFlg) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceNoneConversionOptimizer adGroupServiceNoneConversionOptimizer = (AdGroupServiceNoneConversionOptimizer) o;
    return Objects.equals(this.eligibilityFlg, adGroupServiceNoneConversionOptimizer.eligibilityFlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibilityFlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceNoneConversionOptimizer {\n");
    
    sb.append("    eligibilityFlg: ").append(toIndentedString(eligibilityFlg)).append("\n");
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


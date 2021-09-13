package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupServiceEligibilityFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceManualConversionOptimizerは、コンバージョン最適化「手動入札」設定を保持するオブジェクトです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceManualConversionOptimizer displays the contents of conversion optimization &#39;Manual Bidding&#39; settings.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceManualConversionOptimizerは、コンバージョン最適化「手動入札」設定を保持するオブジェクトです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> AdGroupServiceManualConversionOptimizer displays the contents of conversion optimization 'Manual Bidding' settings.<br> This field is optional in ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceManualConversionOptimizer   {
  @JsonProperty("eligibilityFlg")
  private AdGroupServiceEligibilityFlg eligibilityFlg = null;

  public AdGroupServiceManualConversionOptimizer eligibilityFlg(AdGroupServiceEligibilityFlg eligibilityFlg) {
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
    AdGroupServiceManualConversionOptimizer adGroupServiceManualConversionOptimizer = (AdGroupServiceManualConversionOptimizer) o;
    return Objects.equals(this.eligibilityFlg, adGroupServiceManualConversionOptimizer.eligibilityFlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibilityFlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceManualConversionOptimizer {\n");
    
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


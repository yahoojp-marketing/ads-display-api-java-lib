package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceCarrierType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceCarrierTargetオブジェクトは、モバイルキャリアターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceCarrierTarget object holds configuration information of mobile carrier targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceCarrierTargetオブジェクトは、モバイルキャリアターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceCarrierTarget object holds configuration information of mobile carrier targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceCarrierTarget   {
  @JsonProperty("carrierType")
  private StatsServiceCarrierType carrierType = null;

  public StatsServiceCarrierTarget carrierType(StatsServiceCarrierType carrierType) {
    this.carrierType = carrierType;
    return this;
  }

  /**
   * Get carrierType
   * @return carrierType
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceCarrierType getCarrierType() {
    return carrierType;
  }

  public void setCarrierType(StatsServiceCarrierType carrierType) {
    this.carrierType = carrierType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceCarrierTarget statsServiceCarrierTarget = (StatsServiceCarrierTarget) o;
    return Objects.equals(this.carrierType, statsServiceCarrierTarget.carrierType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceCarrierTarget {\n");
    
    sb.append("    carrierType: ").append(toIndentedString(carrierType)).append("\n");
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


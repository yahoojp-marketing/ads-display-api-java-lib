package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupTargetServiceCarrierType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceCarrierTargetオブジェクトは、モバイルキャリアターゲティングの設定情報を保持します。&lt;br&gt; SET時のみ指定可能です。ADD、REMOVEおよびREPLACE時、このフィールドは無視されます。&lt;br&gt; SET時に必要なtargetIdは、AdGroupオブジェクトにキャリアが設定されている場合にレスポンスされます。&lt;br&gt; ※SET時、入札価格調整率のみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceCarrierTarget object is a container for storing mobile carrier targeting settings.&lt;br&gt; This field can be specified only in SET operation and is ignored in ADD, REMOVE and REPLACE operation.&lt;br&gt; The targetId required on SET will be responded when carriers are set on AdGroup object.&lt;br&gt; *Can set only bid adjustment in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceCarrierTargetオブジェクトは、モバイルキャリアターゲティングの設定情報を保持します。<br> SET時のみ指定可能です。ADD、REMOVEおよびREPLACE時、このフィールドは無視されます。<br> SET時に必要なtargetIdは、AdGroupオブジェクトにキャリアが設定されている場合にレスポンスされます。<br> ※SET時、入札価格調整率のみ設定可能です。 </div> <div lang=\"en\"> AdGroupTargetServiceCarrierTarget object is a container for storing mobile carrier targeting settings.<br> This field can be specified only in SET operation and is ignored in ADD, REMOVE and REPLACE operation.<br> The targetId required on SET will be responded when carriers are set on AdGroup object.<br> *Can set only bid adjustment in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceCarrierTarget   {
  @JsonProperty("carrierType")
  private AdGroupTargetServiceCarrierType carrierType = null;

  public AdGroupTargetServiceCarrierTarget carrierType(AdGroupTargetServiceCarrierType carrierType) {
    this.carrierType = carrierType;
    return this;
  }

  /**
   * Get carrierType
   * @return carrierType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceCarrierType getCarrierType() {
    return carrierType;
  }

  public void setCarrierType(AdGroupTargetServiceCarrierType carrierType) {
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
    AdGroupTargetServiceCarrierTarget adGroupTargetServiceCarrierTarget = (AdGroupTargetServiceCarrierTarget) o;
    return Objects.equals(this.carrierType, adGroupTargetServiceCarrierTarget.carrierType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceCarrierTarget {\n");
    
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


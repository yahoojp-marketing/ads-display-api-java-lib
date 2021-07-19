package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServicePositionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServicePositionTargetオブジェクトは、ポジションターゲティングの設定情報を保持します。&lt;br&gt; *このターゲットは予約型専用となります。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServicePositionTarget object contains position targeting settings.&lt;br&gt; *This target is exclusive for guaranteed ad.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServicePositionTargetオブジェクトは、ポジションターゲティングの設定情報を保持します。<br> *このターゲットは予約型専用となります。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupTargetServicePositionTarget object contains position targeting settings.<br> *This target is exclusive for guaranteed ad.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServicePositionTarget   {
  @JsonProperty("positionType")
  private AdGroupTargetServicePositionType positionType = null;

  public AdGroupTargetServicePositionTarget positionType(AdGroupTargetServicePositionType positionType) {
    this.positionType = positionType;
    return this;
  }

  /**
   * Get positionType
   * @return positionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServicePositionType getPositionType() {
    return positionType;
  }

  public void setPositionType(AdGroupTargetServicePositionType positionType) {
    this.positionType = positionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServicePositionTarget adGroupTargetServicePositionTarget = (AdGroupTargetServicePositionTarget) o;
    return Objects.equals(this.positionType, adGroupTargetServicePositionTarget.positionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServicePositionTarget {\n");
    
    sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
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


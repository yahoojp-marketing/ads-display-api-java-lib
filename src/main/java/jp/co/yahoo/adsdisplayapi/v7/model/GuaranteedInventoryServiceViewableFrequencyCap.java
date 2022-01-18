package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceFrequencyTimeUnit;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceViewableFrequencyCap object describes viewable frequency restriction.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedCampaignServiceViewableFrequencyCap object describes viewable frequency restriction.<br> This field is optional in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceViewableFrequencyCap   {
  @JsonProperty("frequencyLevel")
  private GuaranteedInventoryServiceFrequencyLevel frequencyLevel = null;

  @JsonProperty("frequencyTimeUnit")
  private GuaranteedInventoryServiceFrequencyTimeUnit frequencyTimeUnit = null;

  @JsonProperty("vImps")
  private Long vImps = null;

  public GuaranteedInventoryServiceViewableFrequencyCap frequencyLevel(GuaranteedInventoryServiceFrequencyLevel frequencyLevel) {
    this.frequencyLevel = frequencyLevel;
    return this;
  }

  /**
   * Get frequencyLevel
   * @return frequencyLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceFrequencyLevel getFrequencyLevel() {
    return frequencyLevel;
  }

  public void setFrequencyLevel(GuaranteedInventoryServiceFrequencyLevel frequencyLevel) {
    this.frequencyLevel = frequencyLevel;
  }

  public GuaranteedInventoryServiceViewableFrequencyCap frequencyTimeUnit(GuaranteedInventoryServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
    return this;
  }

  /**
   * Get frequencyTimeUnit
   * @return frequencyTimeUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceFrequencyTimeUnit getFrequencyTimeUnit() {
    return frequencyTimeUnit;
  }

  public void setFrequencyTimeUnit(GuaranteedInventoryServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
  }

  public GuaranteedInventoryServiceViewableFrequencyCap vImps(Long vImps) {
    this.vImps = vImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> 同一ユーザに対する広告の最大ビューアブルインプレッション数です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> In ADD operation, this field will be required. </div> 
   * @return vImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 同一ユーザに対する広告の最大ビューアブルインプレッション数です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> In ADD operation, this field will be required. </div> ")


  public Long getvImps() {
    return vImps;
  }

  public void setvImps(Long vImps) {
    this.vImps = vImps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceViewableFrequencyCap guaranteedInventoryServiceViewableFrequencyCap = (GuaranteedInventoryServiceViewableFrequencyCap) o;
    return Objects.equals(this.frequencyLevel, guaranteedInventoryServiceViewableFrequencyCap.frequencyLevel) &&
        Objects.equals(this.frequencyTimeUnit, guaranteedInventoryServiceViewableFrequencyCap.frequencyTimeUnit) &&
        Objects.equals(this.vImps, guaranteedInventoryServiceViewableFrequencyCap.vImps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyLevel, frequencyTimeUnit, vImps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceViewableFrequencyCap {\n");
    
    sb.append("    frequencyLevel: ").append(toIndentedString(frequencyLevel)).append("\n");
    sb.append("    frequencyTimeUnit: ").append(toIndentedString(frequencyTimeUnit)).append("\n");
    sb.append("    vImps: ").append(toIndentedString(vImps)).append("\n");
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


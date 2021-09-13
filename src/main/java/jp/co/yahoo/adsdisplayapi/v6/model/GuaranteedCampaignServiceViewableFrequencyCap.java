package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedCampaignServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedCampaignServiceFrequencyTimeUnit;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceViewableFrequencyCap object describes viewable frequency restriction.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedCampaignServiceViewableFrequencyCap object describes viewable frequency restriction.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedCampaignServiceViewableFrequencyCap   {
  @JsonProperty("frequencyLevel")
  private GuaranteedCampaignServiceFrequencyLevel frequencyLevel = null;

  @JsonProperty("frequencyTimeUnit")
  private GuaranteedCampaignServiceFrequencyTimeUnit frequencyTimeUnit = null;

  @JsonProperty("vImps")
  private Long vImps = null;

  public GuaranteedCampaignServiceViewableFrequencyCap frequencyLevel(GuaranteedCampaignServiceFrequencyLevel frequencyLevel) {
    this.frequencyLevel = frequencyLevel;
    return this;
  }

  /**
   * Get frequencyLevel
   * @return frequencyLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedCampaignServiceFrequencyLevel getFrequencyLevel() {
    return frequencyLevel;
  }

  public void setFrequencyLevel(GuaranteedCampaignServiceFrequencyLevel frequencyLevel) {
    this.frequencyLevel = frequencyLevel;
  }

  public GuaranteedCampaignServiceViewableFrequencyCap frequencyTimeUnit(GuaranteedCampaignServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
    return this;
  }

  /**
   * Get frequencyTimeUnit
   * @return frequencyTimeUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedCampaignServiceFrequencyTimeUnit getFrequencyTimeUnit() {
    return frequencyTimeUnit;
  }

  public void setFrequencyTimeUnit(GuaranteedCampaignServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
  }

  public GuaranteedCampaignServiceViewableFrequencyCap vImps(Long vImps) {
    this.vImps = vImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> 同一ユーザに対する広告の最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return vImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 同一ユーザに対する広告の最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


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
    GuaranteedCampaignServiceViewableFrequencyCap guaranteedCampaignServiceViewableFrequencyCap = (GuaranteedCampaignServiceViewableFrequencyCap) o;
    return Objects.equals(this.frequencyLevel, guaranteedCampaignServiceViewableFrequencyCap.frequencyLevel) &&
        Objects.equals(this.frequencyTimeUnit, guaranteedCampaignServiceViewableFrequencyCap.frequencyTimeUnit) &&
        Objects.equals(this.vImps, guaranteedCampaignServiceViewableFrequencyCap.vImps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyLevel, frequencyTimeUnit, vImps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceViewableFrequencyCap {\n");
    
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


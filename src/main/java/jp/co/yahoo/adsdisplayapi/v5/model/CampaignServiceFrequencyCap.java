package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceFrequencyTimeUnit;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceFrequencyCapは、フリークエンシー制御を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※ADDおよびSET時、目的ありの場合は設定不可となります。&lt;br&gt; ※ADD時、このフィールドは指定できません。&lt;br&gt; ※SET時は更新する項目のみのリクエストが可能です。&lt;br&gt; ※フリークエンシーキャップの解除方法は、以下の通りです： &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceFrequencyCap object describes frequency restriction.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. &lt;br&gt; *In ADD and SET operation, this field cannot be set for campaigns with campaign goal. &lt;br&gt; *In ADD operation, this field can not be set.&lt;br&gt; *Only update items can be requested in SET operation.&lt;br&gt; *Method to remove the frequency cap: &lt;/div&gt; &lt;code&gt; {   \&quot;frequencyCap\&quot;: {     \&quot;impression\&quot;: 0   } } &lt;/code&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceFrequencyCapは、フリークエンシー制御を表します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※ADDおよびSET時、目的ありの場合は設定不可となります。<br> ※ADD時、このフィールドは指定できません。<br> ※SET時は更新する項目のみのリクエストが可能です。<br> ※フリークエンシーキャップの解除方法は、以下の通りです： </div> <div lang=\"en\"> CampaignServiceFrequencyCap object describes frequency restriction.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. <br> *In ADD and SET operation, this field cannot be set for campaigns with campaign goal. <br> *In ADD operation, this field can not be set.<br> *Only update items can be requested in SET operation.<br> *Method to remove the frequency cap: </div> <code> {   \"frequencyCap\": {     \"impression\": 0   } } </code> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceFrequencyCap   {
  @JsonProperty("frequencyLevel")
  private CampaignServiceFrequencyLevel frequencyLevel = null;

  @JsonProperty("frequencyTimeUnit")
  private CampaignServiceFrequencyTimeUnit frequencyTimeUnit = null;

  @JsonProperty("impression")
  private Long impression = null;

  public CampaignServiceFrequencyCap frequencyLevel(CampaignServiceFrequencyLevel frequencyLevel) {
    this.frequencyLevel = frequencyLevel;
    return this;
  }

  /**
   * Get frequencyLevel
   * @return frequencyLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceFrequencyLevel getFrequencyLevel() {
    return frequencyLevel;
  }

  public void setFrequencyLevel(CampaignServiceFrequencyLevel frequencyLevel) {
    this.frequencyLevel = frequencyLevel;
  }

  public CampaignServiceFrequencyCap frequencyTimeUnit(CampaignServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
    return this;
  }

  /**
   * Get frequencyTimeUnit
   * @return frequencyTimeUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceFrequencyTimeUnit getFrequencyTimeUnit() {
    return frequencyTimeUnit;
  }

  public void setFrequencyTimeUnit(CampaignServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
  }

  public CampaignServiceFrequencyCap impression(Long impression) {
    this.impression = impression;
    return this;
  }

  /**
   * <div lang=\"ja\"> 同一ユーザに対する広告の最大インプレッション数です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Maximum Number of Ad Impressions to Unique User.<br> This field is optional in ADD and SET operation. </div> 
   * @return impression
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 同一ユーザに対する広告の最大インプレッション数です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Maximum Number of Ad Impressions to Unique User.<br> This field is optional in ADD and SET operation. </div> ")


  public Long getImpression() {
    return impression;
  }

  public void setImpression(Long impression) {
    this.impression = impression;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceFrequencyCap campaignServiceFrequencyCap = (CampaignServiceFrequencyCap) o;
    return Objects.equals(this.frequencyLevel, campaignServiceFrequencyCap.frequencyLevel) &&
        Objects.equals(this.frequencyTimeUnit, campaignServiceFrequencyCap.frequencyTimeUnit) &&
        Objects.equals(this.impression, campaignServiceFrequencyCap.impression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyLevel, frequencyTimeUnit, impression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceFrequencyCap {\n");
    
    sb.append("    frequencyLevel: ").append(toIndentedString(frequencyLevel)).append("\n");
    sb.append("    frequencyTimeUnit: ").append(toIndentedString(frequencyTimeUnit)).append("\n");
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
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


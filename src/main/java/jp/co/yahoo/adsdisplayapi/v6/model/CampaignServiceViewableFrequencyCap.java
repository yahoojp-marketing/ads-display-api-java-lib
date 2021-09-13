package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.CampaignServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v6.model.CampaignServiceFrequencyTimeUnit;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。&lt;br&gt; ADDおよびSET時、このフィールドは目的なしの場合は設定不可となり、目的ありの場合は省略可能となります。&lt;br&gt; REMOVE時は無視されます。&lt;br&gt; ※ADD時は全ての項目の指定が必須です。&lt;br&gt; ※SET時は更新する項目のみのリクエストが可能です。&lt;br&gt; ※ビューアブルフリークエンシーキャップの解除方法は、以下の通りです： &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceViewableFrequencyCap object describes viewable frequency restriction.&lt;br&gt; In ADD and SET operation, this field cannot be set for campaigns with no campaign goal, and will be optional for campaigns with campaign goal. &lt;br&gt; In REMOVE operation, this field will be ignored.&lt;br&gt; *All items must be specified in ADD operation.&lt;br&gt; *Only update items can be requested in SET operation.&lt;br&gt; *Method to remove the viewable frequency cap: &lt;/div&gt; &lt;code&gt; {     \&quot;viewableFrequencyCap\&quot;: {         \&quot;vImps\&quot;: 0     } } &lt;/code&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。<br> ADDおよびSET時、このフィールドは目的なしの場合は設定不可となり、目的ありの場合は省略可能となります。<br> REMOVE時は無視されます。<br> ※ADD時は全ての項目の指定が必須です。<br> ※SET時は更新する項目のみのリクエストが可能です。<br> ※ビューアブルフリークエンシーキャップの解除方法は、以下の通りです： </div> <div lang=\"en\"> CampaignServiceViewableFrequencyCap object describes viewable frequency restriction.<br> In ADD and SET operation, this field cannot be set for campaigns with no campaign goal, and will be optional for campaigns with campaign goal. <br> In REMOVE operation, this field will be ignored.<br> *All items must be specified in ADD operation.<br> *Only update items can be requested in SET operation.<br> *Method to remove the viewable frequency cap: </div> <code> {     \"viewableFrequencyCap\": {         \"vImps\": 0     } } </code> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceViewableFrequencyCap   {
  @JsonProperty("frequencyLevel")
  private CampaignServiceFrequencyLevel frequencyLevel = null;

  @JsonProperty("frequencyTimeUnit")
  private CampaignServiceFrequencyTimeUnit frequencyTimeUnit = null;

  @JsonProperty("vImps")
  private Long vImps = null;

  public CampaignServiceViewableFrequencyCap frequencyLevel(CampaignServiceFrequencyLevel frequencyLevel) {
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

  public CampaignServiceViewableFrequencyCap frequencyTimeUnit(CampaignServiceFrequencyTimeUnit frequencyTimeUnit) {
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

  public CampaignServiceViewableFrequencyCap vImps(Long vImps) {
    this.vImps = vImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> 同一ユーザに対する広告の最大ビューアブルインプレッション数です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> This field is optional in ADD and SET operation. </div> 
   * @return vImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 同一ユーザに対する広告の最大ビューアブルインプレッション数です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> This field is optional in ADD and SET operation. </div> ")


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
    CampaignServiceViewableFrequencyCap campaignServiceViewableFrequencyCap = (CampaignServiceViewableFrequencyCap) o;
    return Objects.equals(this.frequencyLevel, campaignServiceViewableFrequencyCap.frequencyLevel) &&
        Objects.equals(this.frequencyTimeUnit, campaignServiceViewableFrequencyCap.frequencyTimeUnit) &&
        Objects.equals(this.vImps, campaignServiceViewableFrequencyCap.vImps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyLevel, frequencyTimeUnit, vImps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceViewableFrequencyCap {\n");
    
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceFrequencyTimeUnit;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceViewableFrequencyCap object describes viewable frequency restriction.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedCampaignServiceViewableFrequencyCap object describes viewable frequency restriction.<br> This field is optional in ADD operation. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceViewableFrequencyCap.JSON_PROPERTY_FREQUENCY_LEVEL,
  GuaranteedSimulationServiceViewableFrequencyCap.JSON_PROPERTY_FREQUENCY_TIME_UNIT,
  GuaranteedSimulationServiceViewableFrequencyCap.JSON_PROPERTY_V_IMPS
})
@JsonTypeName("GuaranteedSimulationServiceViewableFrequencyCap")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceViewableFrequencyCap {
  public static final String JSON_PROPERTY_FREQUENCY_LEVEL = "frequencyLevel";
  private GuaranteedSimulationServiceFrequencyLevel frequencyLevel;

  public static final String JSON_PROPERTY_FREQUENCY_TIME_UNIT = "frequencyTimeUnit";
  private GuaranteedSimulationServiceFrequencyTimeUnit frequencyTimeUnit;

  public static final String JSON_PROPERTY_V_IMPS = "vImps";
  private Long vImps;

  public GuaranteedSimulationServiceViewableFrequencyCap() { 
  }

  public GuaranteedSimulationServiceViewableFrequencyCap frequencyLevel(GuaranteedSimulationServiceFrequencyLevel frequencyLevel) {
    
    this.frequencyLevel = frequencyLevel;
    return this;
  }

   /**
   * Get frequencyLevel
   * @return frequencyLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceFrequencyLevel getFrequencyLevel() {
    return frequencyLevel;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequencyLevel(GuaranteedSimulationServiceFrequencyLevel frequencyLevel) {
    this.frequencyLevel = frequencyLevel;
  }


  public GuaranteedSimulationServiceViewableFrequencyCap frequencyTimeUnit(GuaranteedSimulationServiceFrequencyTimeUnit frequencyTimeUnit) {
    
    this.frequencyTimeUnit = frequencyTimeUnit;
    return this;
  }

   /**
   * Get frequencyTimeUnit
   * @return frequencyTimeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY_TIME_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceFrequencyTimeUnit getFrequencyTimeUnit() {
    return frequencyTimeUnit;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_TIME_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequencyTimeUnit(GuaranteedSimulationServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
  }


  public GuaranteedSimulationServiceViewableFrequencyCap vImps(Long vImps) {
    
    this.vImps = vImps;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 同一ユーザに対する広告の最大ビューアブルインプレッション数です。&lt;br&gt; ADD時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Maximum number of ad viewable impressions to same user.&lt;br&gt; In ADD operation, this field will be required. &lt;/div&gt; 
   * @return vImps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 同一ユーザに対する広告の最大ビューアブルインプレッション数です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> In ADD operation, this field will be required. </div> ")
  @JsonProperty(JSON_PROPERTY_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getvImps() {
    return vImps;
  }


  @JsonProperty(JSON_PROPERTY_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    GuaranteedSimulationServiceViewableFrequencyCap guaranteedSimulationServiceViewableFrequencyCap = (GuaranteedSimulationServiceViewableFrequencyCap) o;
    return Objects.equals(this.frequencyLevel, guaranteedSimulationServiceViewableFrequencyCap.frequencyLevel) &&
        Objects.equals(this.frequencyTimeUnit, guaranteedSimulationServiceViewableFrequencyCap.frequencyTimeUnit) &&
        Objects.equals(this.vImps, guaranteedSimulationServiceViewableFrequencyCap.vImps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyLevel, frequencyTimeUnit, vImps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceViewableFrequencyCap {\n");
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


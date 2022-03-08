/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedCampaignServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedCampaignServiceFrequencyTimeUnit;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceViewableFrequencyCap object describes viewable frequency restriction.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedCampaignServiceViewableFrequencyCap object describes viewable frequency restriction.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  GuaranteedCampaignServiceViewableFrequencyCap.JSON_PROPERTY_FREQUENCY_LEVEL,
  GuaranteedCampaignServiceViewableFrequencyCap.JSON_PROPERTY_FREQUENCY_TIME_UNIT,
  GuaranteedCampaignServiceViewableFrequencyCap.JSON_PROPERTY_V_IMPS
})
@JsonTypeName("GuaranteedCampaignServiceViewableFrequencyCap")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedCampaignServiceViewableFrequencyCap {
  public static final String JSON_PROPERTY_FREQUENCY_LEVEL = "frequencyLevel";
  private GuaranteedCampaignServiceFrequencyLevel frequencyLevel;

  public static final String JSON_PROPERTY_FREQUENCY_TIME_UNIT = "frequencyTimeUnit";
  private GuaranteedCampaignServiceFrequencyTimeUnit frequencyTimeUnit;

  public static final String JSON_PROPERTY_V_IMPS = "vImps";
  private Long vImps;

  public GuaranteedCampaignServiceViewableFrequencyCap() { 
  }

  public GuaranteedCampaignServiceViewableFrequencyCap frequencyLevel(GuaranteedCampaignServiceFrequencyLevel frequencyLevel) {
    
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

  public GuaranteedCampaignServiceFrequencyLevel getFrequencyLevel() {
    return frequencyLevel;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY_TIME_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceFrequencyTimeUnit getFrequencyTimeUnit() {
    return frequencyTimeUnit;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_TIME_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequencyTimeUnit(GuaranteedCampaignServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
  }


  public GuaranteedCampaignServiceViewableFrequencyCap vImps(Long vImps) {
    
    this.vImps = vImps;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 同一ユーザに対する広告の最大ビューアブルインプレッション数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Maximum number of ad viewable impressions to same user.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return vImps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 同一ユーザに対する広告の最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


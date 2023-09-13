/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v12.model.CampaignServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v12.model.CampaignServiceFrequencyTimeUnit;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; REMOVE時は無視されます。&lt;br&gt; ※ADD時は全ての項目の指定が必須です。&lt;br&gt; ※SET時は更新する項目のみのリクエストが可能です。&lt;br&gt; ※ビューアブルフリークエンシーキャップの解除方法は、以下の通りです： &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceViewableFrequencyCap object describes viewable frequency restriction.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; In REMOVE operation, this field will be ignored.&lt;br&gt; *All items must be specified in ADD operation.&lt;br&gt; *Only update items can be requested in SET operation.&lt;br&gt; *Method to remove the viewable frequency cap: &lt;/div&gt; &lt;code&gt; {     \&quot;viewableFrequencyCap\&quot;: {         \&quot;vImps\&quot;: 0     } } &lt;/code&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceViewableFrequencyCap.JSON_PROPERTY_FREQUENCY_LEVEL,
  CampaignServiceViewableFrequencyCap.JSON_PROPERTY_FREQUENCY_TIME_UNIT,
  CampaignServiceViewableFrequencyCap.JSON_PROPERTY_V_IMPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceViewableFrequencyCap {
  public static final String JSON_PROPERTY_FREQUENCY_LEVEL = "frequencyLevel";
  private CampaignServiceFrequencyLevel frequencyLevel;

  public static final String JSON_PROPERTY_FREQUENCY_TIME_UNIT = "frequencyTimeUnit";
  private CampaignServiceFrequencyTimeUnit frequencyTimeUnit;

  public static final String JSON_PROPERTY_V_IMPS = "vImps";
  private Long vImps;

  public CampaignServiceViewableFrequencyCap() {
  }

  public CampaignServiceViewableFrequencyCap frequencyLevel(CampaignServiceFrequencyLevel frequencyLevel) {
    
    this.frequencyLevel = frequencyLevel;
    return this;
  }

   /**
   * Get frequencyLevel
   * @return frequencyLevel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENCY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceFrequencyLevel getFrequencyLevel() {
    return frequencyLevel;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENCY_TIME_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceFrequencyTimeUnit getFrequencyTimeUnit() {
    return frequencyTimeUnit;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_TIME_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequencyTimeUnit(CampaignServiceFrequencyTimeUnit frequencyTimeUnit) {
    this.frequencyTimeUnit = frequencyTimeUnit;
  }


  public CampaignServiceViewableFrequencyCap vImps(Long vImps) {
    
    this.vImps = vImps;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 同一ユーザに対する広告の最大ビューアブルインプレッション数です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Maximum number of ad viewable impressions to same user.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return vImps
  **/
  @jakarta.annotation.Nullable
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


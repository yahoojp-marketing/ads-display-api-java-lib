/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceFrequencyTimeUnit;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceFrequencyCapは、フリークエンシー制御を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※ADDおよびSET時、目的ありの場合は設定不可となります。&lt;br&gt; ※ADD時、このフィールドは指定できません。&lt;br&gt; ※SET時は更新する項目のみのリクエストが可能です。&lt;br&gt; ※フリークエンシーキャップの解除方法は、以下の通りです： &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceFrequencyCap object describes frequency restriction.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. &lt;br&gt; *In ADD and SET operation, this field cannot be set for campaigns with campaign goal. &lt;br&gt; *In ADD operation, this field can not be set.&lt;br&gt; *Only update items can be requested in SET operation.&lt;br&gt; *Method to remove the frequency cap: &lt;/div&gt; &lt;code&gt; {   \&quot;frequencyCap\&quot;: {     \&quot;impression\&quot;: 0   } } &lt;/code&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceFrequencyCapは、フリークエンシー制御を表します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※ADDおよびSET時、目的ありの場合は設定不可となります。<br> ※ADD時、このフィールドは指定できません。<br> ※SET時は更新する項目のみのリクエストが可能です。<br> ※フリークエンシーキャップの解除方法は、以下の通りです： </div> <div lang=\"en\"> CampaignServiceFrequencyCap object describes frequency restriction.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. <br> *In ADD and SET operation, this field cannot be set for campaigns with campaign goal. <br> *In ADD operation, this field can not be set.<br> *Only update items can be requested in SET operation.<br> *Method to remove the frequency cap: </div> <code> {   \"frequencyCap\": {     \"impression\": 0   } } </code> ")
@JsonPropertyOrder({
  CampaignServiceFrequencyCap.JSON_PROPERTY_FREQUENCY_LEVEL,
  CampaignServiceFrequencyCap.JSON_PROPERTY_FREQUENCY_TIME_UNIT,
  CampaignServiceFrequencyCap.JSON_PROPERTY_IMPRESSION
})
@JsonTypeName("CampaignServiceFrequencyCap")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceFrequencyCap {
  public static final String JSON_PROPERTY_FREQUENCY_LEVEL = "frequencyLevel";
  private CampaignServiceFrequencyLevel frequencyLevel;

  public static final String JSON_PROPERTY_FREQUENCY_TIME_UNIT = "frequencyTimeUnit";
  private CampaignServiceFrequencyTimeUnit frequencyTimeUnit;

  public static final String JSON_PROPERTY_IMPRESSION = "impression";
  private Long impression;

  public CampaignServiceFrequencyCap() { 
  }

  public CampaignServiceFrequencyCap frequencyLevel(CampaignServiceFrequencyLevel frequencyLevel) {
    
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

  public CampaignServiceFrequencyLevel getFrequencyLevel() {
    return frequencyLevel;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CampaignServiceFrequencyCap impression(Long impression) {
    
    this.impression = impression;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 同一ユーザに対する広告の最大インプレッション数です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Maximum Number of Ad Impressions to Unique User.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return impression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 同一ユーザに対する広告の最大インプレッション数です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Maximum Number of Ad Impressions to Unique User.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImpression() {
    return impression;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


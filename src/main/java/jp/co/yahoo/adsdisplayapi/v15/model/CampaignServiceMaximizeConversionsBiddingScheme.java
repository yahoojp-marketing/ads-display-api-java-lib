/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v15.model.CampaignServiceSkanTcpaTargetType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceMaximizeConversionsBiddingSchemeオブジェクトは、キャンペーン目標単価(tCPA)の設定情報を表します。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※BiddingStrategyTypeがMAXIMIZE_CONVERSIONSの場合、指定可能となります。     &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceCpcBiddingScheme object holds configuration information of Target CPA (tCPA) of campaign.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; *This field can only be specified (optional) when BiddingStrategyType is MAXIMIZE_CONVERSIONS. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceMaximizeConversionsBiddingScheme.JSON_PROPERTY_TARGET_CPA,
  CampaignServiceMaximizeConversionsBiddingScheme.JSON_PROPERTY_SKAN_TCPA_TARGET_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceMaximizeConversionsBiddingScheme {
  public static final String JSON_PROPERTY_TARGET_CPA = "targetCpa";
  private Long targetCpa;

  public static final String JSON_PROPERTY_SKAN_TCPA_TARGET_TYPE = "skanTcpaTargetType";
  private CampaignServiceSkanTcpaTargetType skanTcpaTargetType;

  public CampaignServiceMaximizeConversionsBiddingScheme() {
  }

  public CampaignServiceMaximizeConversionsBiddingScheme targetCpa(Long targetCpa) {
    
    this.targetCpa = targetCpa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン目標単価(tCPA)です。&lt;br&gt; ADDおよびSET時、このフィールドは任意で指定できます。&lt;br&gt; SET時、BiddingStrategyTypeにMAXIMIZE_CONVERSIONSが指定されていて、targetCpaを指定しない場合、targetCpaの値がクリアされます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target CPA (tCPA) of campaign.&lt;br&gt; This field can be optionally specified in ADD and SET operation.&lt;br&gt; If BiddingStrategyType is MAXIMIZE_CONVERSION and targetCpa is not specified in SET operation, the value in this field will be cleared. &lt;/div&gt; 
   * @return targetCpa
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetCpa() {
    return targetCpa;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetCpa(Long targetCpa) {
    this.targetCpa = targetCpa;
  }


  public CampaignServiceMaximizeConversionsBiddingScheme skanTcpaTargetType(CampaignServiceSkanTcpaTargetType skanTcpaTargetType) {
    
    this.skanTcpaTargetType = skanTcpaTargetType;
    return this;
  }

   /**
   * Get skanTcpaTargetType
   * @return skanTcpaTargetType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKAN_TCPA_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceSkanTcpaTargetType getSkanTcpaTargetType() {
    return skanTcpaTargetType;
  }


  @JsonProperty(JSON_PROPERTY_SKAN_TCPA_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkanTcpaTargetType(CampaignServiceSkanTcpaTargetType skanTcpaTargetType) {
    this.skanTcpaTargetType = skanTcpaTargetType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceMaximizeConversionsBiddingScheme campaignServiceMaximizeConversionsBiddingScheme = (CampaignServiceMaximizeConversionsBiddingScheme) o;
    return Objects.equals(this.targetCpa, campaignServiceMaximizeConversionsBiddingScheme.targetCpa) &&
        Objects.equals(this.skanTcpaTargetType, campaignServiceMaximizeConversionsBiddingScheme.skanTcpaTargetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetCpa, skanTcpaTargetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceMaximizeConversionsBiddingScheme {\n");
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
    sb.append("    skanTcpaTargetType: ").append(toIndentedString(skanTcpaTargetType)).append("\n");
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


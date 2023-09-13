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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceVcpmBiddingSchemeオブジェクトは、キャンペーン最大入札価格(vCPM)の設定情報を表します。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※BiddingStrategyTypeがVCPMの場合、指定必須となります。     &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceVcpmBiddingScheme object holds configuration information of Max bid of campaign (vCPM).&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; *If BiddingStrategyType is VCPM, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceVcpmBiddingSchemeオブジェクトは、キャンペーン最大入札価格(vCPM)の設定情報を表します。<br> このフィールドは、ADD時およびSET時に省略可能となり、REMOVE時に無視されます。<br> ※BiddingStrategyTypeがVCPMの場合、指定必須となります。     </div> <div lang=\"en\"> CampaignServiceVcpmBiddingScheme object holds configuration information of Max bid of campaign (vCPM).<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> *If BiddingStrategyType is VCPM, this field is required. </div> ")
@JsonPropertyOrder({
  CampaignServiceVcpmBiddingScheme.JSON_PROPERTY_VCPM
})
@JsonTypeName("CampaignServiceVcpmBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceVcpmBiddingScheme {
  public static final String JSON_PROPERTY_VCPM = "vcpm";
  private Long vcpm;

  public CampaignServiceVcpmBiddingScheme() { 
  }

  public CampaignServiceVcpmBiddingScheme vcpm(Long vcpm) {
    
    this.vcpm = vcpm;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン最大入札価格(vCPM)です。&lt;br&gt; このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of campaign (vCPM). &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return vcpm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(vCPM)です。<br> このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (vCPM). <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_VCPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVcpm() {
    return vcpm;
  }


  @JsonProperty(JSON_PROPERTY_VCPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcpm(Long vcpm) {
    this.vcpm = vcpm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceVcpmBiddingScheme campaignServiceVcpmBiddingScheme = (CampaignServiceVcpmBiddingScheme) o;
    return Objects.equals(this.vcpm, campaignServiceVcpmBiddingScheme.vcpm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcpm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceVcpmBiddingScheme {\n");
    sb.append("    vcpm: ").append(toIndentedString(vcpm)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceCpcBiddingSchemeオブジェクトは、キャンペーン最大入札価格(CPC)の設定情報を表します。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※BiddingStrategyTypeがCPCの場合、指定必須となります。     &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceCpcBiddingScheme object holds configuration information of Max bid of campaign (CPC).&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; *If BiddingStrategyType is CPC, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceCpcBiddingSchemeオブジェクトは、キャンペーン最大入札価格(CPC)の設定情報を表します。<br> このフィールドは、ADD時およびSET時に省略可能となり、REMOVE時に無視されます。<br> ※BiddingStrategyTypeがCPCの場合、指定必須となります。     </div> <div lang=\"en\"> CampaignServiceCpcBiddingScheme object holds configuration information of Max bid of campaign (CPC).<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> *If BiddingStrategyType is CPC, this field is required. </div> ")
@JsonPropertyOrder({
  CampaignServiceCpcBiddingScheme.JSON_PROPERTY_CPC
})
@JsonTypeName("CampaignServiceCpcBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceCpcBiddingScheme {
  public static final String JSON_PROPERTY_CPC = "cpc";
  private Long cpc;

  public CampaignServiceCpcBiddingScheme() { 
  }

  public CampaignServiceCpcBiddingScheme cpc(Long cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン最大入札価格(CPC)です。&lt;br&gt; このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of campaign (CPC). &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return cpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(CPC)です。<br> このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPC). <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpc(Long cpc) {
    this.cpc = cpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceCpcBiddingScheme campaignServiceCpcBiddingScheme = (CampaignServiceCpcBiddingScheme) o;
    return Objects.equals(this.cpc, campaignServiceCpcBiddingScheme.cpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCpcBiddingScheme {\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
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

/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v11.model.AdGroupServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceVcpmBiddingSchemeオブジェクトは、広告グループ最大入札価格(vCPM)の設定情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceVcpmBiddingScheme object holds configuration information of Max bid of ad group (vCPM). &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceVcpmBiddingSchemeオブジェクトは、広告グループ最大入札価格(vCPM)の設定情報を表します。 </div> <div lang=\"en\"> AdGroupServiceVcpmBiddingScheme object holds configuration information of Max bid of ad group (vCPM). </div> ")
@JsonPropertyOrder({
  AdGroupServiceVcpmBiddingScheme.JSON_PROPERTY_VCPM,
  AdGroupServiceVcpmBiddingScheme.JSON_PROPERTY_IS_REMOVE_VCPM
})
@JsonTypeName("AdGroupServiceVcpmBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceVcpmBiddingScheme {
  public static final String JSON_PROPERTY_VCPM = "vcpm";
  private Long vcpm;

  public static final String JSON_PROPERTY_IS_REMOVE_VCPM = "isRemoveVcpm";
  private AdGroupServiceIsRemoveFlg isRemoveVcpm;

  public AdGroupServiceVcpmBiddingScheme() { 
  }

  public AdGroupServiceVcpmBiddingScheme vcpm(Long vcpm) {
    
    this.vcpm = vcpm;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ最大入札価格（vCPM）です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※campaignBiddingStrategyTypeがvCPMの場合のみ指定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of ad group (vCPM).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *This can only be specified when campaignBiddingStrategyType is vCPM. &lt;/div&gt; 
   * @return vcpm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ最大入札価格（vCPM）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがvCPMの場合のみ指定可能です。 </div> <div lang=\"en\"> Max bid of ad group (vCPM).<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is vCPM. </div> ")
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


  public AdGroupServiceVcpmBiddingScheme isRemoveVcpm(AdGroupServiceIsRemoveFlg isRemoveVcpm) {
    
    this.isRemoveVcpm = isRemoveVcpm;
    return this;
  }

   /**
   * Get isRemoveVcpm
   * @return isRemoveVcpm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VCPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceIsRemoveFlg getIsRemoveVcpm() {
    return isRemoveVcpm;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VCPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVcpm(AdGroupServiceIsRemoveFlg isRemoveVcpm) {
    this.isRemoveVcpm = isRemoveVcpm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceVcpmBiddingScheme adGroupServiceVcpmBiddingScheme = (AdGroupServiceVcpmBiddingScheme) o;
    return Objects.equals(this.vcpm, adGroupServiceVcpmBiddingScheme.vcpm) &&
        Objects.equals(this.isRemoveVcpm, adGroupServiceVcpmBiddingScheme.isRemoveVcpm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcpm, isRemoveVcpm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceVcpmBiddingScheme {\n");
    sb.append("    vcpm: ").append(toIndentedString(vcpm)).append("\n");
    sb.append("    isRemoveVcpm: ").append(toIndentedString(isRemoveVcpm)).append("\n");
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


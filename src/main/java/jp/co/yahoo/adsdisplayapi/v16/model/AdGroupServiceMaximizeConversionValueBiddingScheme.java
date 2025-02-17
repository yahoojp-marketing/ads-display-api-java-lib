/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v16.model.AdGroupServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceMaximizeConversionValueBiddingSchemeオブジェクトは、広告費用対効果の目標値の設定情報を表します。&lt;br&gt; ※現在利用できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceMaximizeConversionValueBiddingScheme object displays bidding setting for Target ROAS.&lt;br&gt; * Not Available. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceMaximizeConversionValueBiddingSchemeオブジェクトは、広告費用対効果の目標値の設定情報を表します。<br> ※現在利用できません。 </div> <div lang=\"en\"> AdGroupServiceMaximizeConversionValueBiddingScheme object displays bidding setting for Target ROAS.<br> * Not Available. </div> ")
@JsonPropertyOrder({
  AdGroupServiceMaximizeConversionValueBiddingScheme.JSON_PROPERTY_TARGET_ROAS,
  AdGroupServiceMaximizeConversionValueBiddingScheme.JSON_PROPERTY_IS_REMOVE_TARGET_ROAS
})
@JsonTypeName("AdGroupServiceMaximizeConversionValueBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceMaximizeConversionValueBiddingScheme {
  public static final String JSON_PROPERTY_TARGET_ROAS = "targetRoas";
  private Double targetRoas;

  public static final String JSON_PROPERTY_IS_REMOVE_TARGET_ROAS = "isRemoveTargetRoas";
  private AdGroupServiceIsRemoveFlg isRemoveTargetRoas;

  public AdGroupServiceMaximizeConversionValueBiddingScheme() { 
  }

  public AdGroupServiceMaximizeConversionValueBiddingScheme targetRoas(Double targetRoas) {
    
    this.targetRoas = targetRoas;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告費用対効果の目標値です。&lt;br&gt; ※Return On Advertising Spend(ROAS) ※0.01 〜1000.00（1%〜100000%）の範囲内のみ許容します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※campaignBiddingStrategyTypeがMAXIMIZE_CONVERSION_VALUEの場合のみ指定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target ROAS.&lt;br&gt; * ROAS: Return On Average Spend.&lt;br&gt; * Setting limit: 0.01 〜1000.00（1%〜100000%）.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *This can only be specified when campaignBiddingStrategyType is MAXIMIZE_CONVERSION_VALUE. &lt;/div&gt; 
   * @return targetRoas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告費用対効果の目標値です。<br> ※Return On Advertising Spend(ROAS) ※0.01 〜1000.00（1%〜100000%）の範囲内のみ許容します。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがMAXIMIZE_CONVERSION_VALUEの場合のみ指定可能です。 </div> <div lang=\"en\"> Target ROAS.<br> * ROAS: Return On Average Spend.<br> * Setting limit: 0.01 〜1000.00（1%〜100000%）.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is MAXIMIZE_CONVERSION_VALUE. </div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTargetRoas() {
    return targetRoas;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetRoas(Double targetRoas) {
    this.targetRoas = targetRoas;
  }


  public AdGroupServiceMaximizeConversionValueBiddingScheme isRemoveTargetRoas(AdGroupServiceIsRemoveFlg isRemoveTargetRoas) {
    
    this.isRemoveTargetRoas = isRemoveTargetRoas;
    return this;
  }

   /**
   * Get isRemoveTargetRoas
   * @return isRemoveTargetRoas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceIsRemoveFlg getIsRemoveTargetRoas() {
    return isRemoveTargetRoas;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTargetRoas(AdGroupServiceIsRemoveFlg isRemoveTargetRoas) {
    this.isRemoveTargetRoas = isRemoveTargetRoas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceMaximizeConversionValueBiddingScheme adGroupServiceMaximizeConversionValueBiddingScheme = (AdGroupServiceMaximizeConversionValueBiddingScheme) o;
    return Objects.equals(this.targetRoas, adGroupServiceMaximizeConversionValueBiddingScheme.targetRoas) &&
        Objects.equals(this.isRemoveTargetRoas, adGroupServiceMaximizeConversionValueBiddingScheme.isRemoveTargetRoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetRoas, isRemoveTargetRoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceMaximizeConversionValueBiddingScheme {\n");
    sb.append("    targetRoas: ").append(toIndentedString(targetRoas)).append("\n");
    sb.append("    isRemoveTargetRoas: ").append(toIndentedString(isRemoveTargetRoas)).append("\n");
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


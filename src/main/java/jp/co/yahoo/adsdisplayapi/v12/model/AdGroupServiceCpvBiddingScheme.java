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
import jp.co.yahoo.adsdisplayapi.v12.model.AdGroupServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceCpvBiddingSchemeオブジェクトは、広告グループ最大入札価格(CPV)の設定情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceCpvBiddingScheme object holds configuration information of Max bid of ad group (CPV). &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupServiceCpvBiddingScheme.JSON_PROPERTY_CPV,
  AdGroupServiceCpvBiddingScheme.JSON_PROPERTY_IS_REMOVE_CPV
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceCpvBiddingScheme {
  public static final String JSON_PROPERTY_CPV = "cpv";
  private Long cpv;

  public static final String JSON_PROPERTY_IS_REMOVE_CPV = "isRemoveCpv";
  private AdGroupServiceIsRemoveFlg isRemoveCpv;

  public AdGroupServiceCpvBiddingScheme() {
  }

  public AdGroupServiceCpvBiddingScheme cpv(Long cpv) {
    
    this.cpv = cpv;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ最大入札価格（CPV）です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※campaignBiddingStrategyTypeがCPVの場合のみ指定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of ad group (CPV).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *This can only be specified when campaignBiddingStrategyType is CPV. &lt;/div&gt; 
   * @return cpv
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCpv() {
    return cpv;
  }


  @JsonProperty(JSON_PROPERTY_CPV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpv(Long cpv) {
    this.cpv = cpv;
  }


  public AdGroupServiceCpvBiddingScheme isRemoveCpv(AdGroupServiceIsRemoveFlg isRemoveCpv) {
    
    this.isRemoveCpv = isRemoveCpv;
    return this;
  }

   /**
   * Get isRemoveCpv
   * @return isRemoveCpv
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CPV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceIsRemoveFlg getIsRemoveCpv() {
    return isRemoveCpv;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CPV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveCpv(AdGroupServiceIsRemoveFlg isRemoveCpv) {
    this.isRemoveCpv = isRemoveCpv;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceCpvBiddingScheme adGroupServiceCpvBiddingScheme = (AdGroupServiceCpvBiddingScheme) o;
    return Objects.equals(this.cpv, adGroupServiceCpvBiddingScheme.cpv) &&
        Objects.equals(this.isRemoveCpv, adGroupServiceCpvBiddingScheme.isRemoveCpv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpv, isRemoveCpv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceCpvBiddingScheme {\n");
    sb.append("    cpv: ").append(toIndentedString(cpv)).append("\n");
    sb.append("    isRemoveCpv: ").append(toIndentedString(isRemoveCpv)).append("\n");
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


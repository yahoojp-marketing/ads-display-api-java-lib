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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceYahooJapanAudienceDiscoveryAudienceListオブジェクトは、オーディエンスリスト(Yahoo! Audience Discovery)を表します。&lt;br&gt; このフィールドは、SET時に省略可能、ADD時に指定不可となります。&lt;br&gt; ※audienceListTypeがYAHOO_JAPAN_AUDIENCE_DISCOVERYの場合は、任意で指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceCustomAudienceList object displays audience list (Yahoo! JAPAN Audience Discovery)&lt;br&gt; This field is optional in SET operation, and cannot be specified in ADD operation.&lt;br&gt; *If audienceListType is YAHOO_JAPAN_AUDIENCE_DISCOVERY, this field can be optionally specified. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceYahooJapanAudienceDiscoveryAudienceList.JSON_PROPERTY_REACH_PERIOD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceYahooJapanAudienceDiscoveryAudienceList {
  public static final String JSON_PROPERTY_REACH_PERIOD = "reachPeriod";
  private Integer reachPeriod;

  public AudienceListServiceYahooJapanAudienceDiscoveryAudienceList() {
  }

  public AudienceListServiceYahooJapanAudienceDiscoveryAudienceList reachPeriod(Integer reachPeriod) {
    
    this.reachPeriod = reachPeriod;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リーチの蓄積期間（1日～60日）です。&lt;br&gt; このフィールドは、SET時に省略可能、ADD時に指定不可となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Cookies validation period. (1 - 60 days) &lt;br&gt; This field is optional in SET operation, and cannot be specified in ADD operation. &lt;/div&gt; 
   * @return reachPeriod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACH_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReachPeriod() {
    return reachPeriod;
  }


  @JsonProperty(JSON_PROPERTY_REACH_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachPeriod(Integer reachPeriod) {
    this.reachPeriod = reachPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceYahooJapanAudienceDiscoveryAudienceList audienceListServiceYahooJapanAudienceDiscoveryAudienceList = (AudienceListServiceYahooJapanAudienceDiscoveryAudienceList) o;
    return Objects.equals(this.reachPeriod, audienceListServiceYahooJapanAudienceDiscoveryAudienceList.reachPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reachPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceYahooJapanAudienceDiscoveryAudienceList {\n");
    sb.append("    reachPeriod: ").append(toIndentedString(reachPeriod)).append("\n");
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


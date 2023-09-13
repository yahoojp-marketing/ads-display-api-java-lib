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
import jp.co.yahoo.adsdisplayapi.v12.model.AdGroupServiceBiddingScheme;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceBiddingStrategyConfigurationは、広告グループ入札戦略を表します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceBiddingStrategyConfiguration object describes bidding strategy of ad group.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupServiceBiddingStrategyConfiguration.JSON_PROPERTY_BIDDING_SCHEME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceBiddingStrategyConfiguration {
  public static final String JSON_PROPERTY_BIDDING_SCHEME = "biddingScheme";
  private AdGroupServiceBiddingScheme biddingScheme;

  public AdGroupServiceBiddingStrategyConfiguration() {
  }

  public AdGroupServiceBiddingStrategyConfiguration biddingScheme(AdGroupServiceBiddingScheme biddingScheme) {
    
    this.biddingScheme = biddingScheme;
    return this;
  }

   /**
   * Get biddingScheme
   * @return biddingScheme
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceBiddingScheme getBiddingScheme() {
    return biddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingScheme(AdGroupServiceBiddingScheme biddingScheme) {
    this.biddingScheme = biddingScheme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceBiddingStrategyConfiguration adGroupServiceBiddingStrategyConfiguration = (AdGroupServiceBiddingStrategyConfiguration) o;
    return Objects.equals(this.biddingScheme, adGroupServiceBiddingStrategyConfiguration.biddingScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBiddingStrategyConfiguration {\n");
    sb.append("    biddingScheme: ").append(toIndentedString(biddingScheme)).append("\n");
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


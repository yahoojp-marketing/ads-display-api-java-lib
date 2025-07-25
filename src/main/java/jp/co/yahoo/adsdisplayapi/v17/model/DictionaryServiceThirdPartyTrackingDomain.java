/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceThirdPartyTrackingDomainオブジェクトは第三者計測スクリプトタグのsrcで利用可能なドメインを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceThirdPartyTrackingDomain object indicates the domain that can be used for the src of third party tracking scripting tag.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  DictionaryServiceThirdPartyTrackingDomain.JSON_PROPERTY_DOMAIN,
  DictionaryServiceThirdPartyTrackingDomain.JSON_PROPERTY_VENDOR,
  DictionaryServiceThirdPartyTrackingDomain.JSON_PROPERTY_VENDOR_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceThirdPartyTrackingDomain {
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_VENDOR = "vendor";
  private String vendor;

  public static final String JSON_PROPERTY_VENDOR_NAME = "vendorName";
  private String vendorName;

  public DictionaryServiceThirdPartyTrackingDomain() {
  }

  public DictionaryServiceThirdPartyTrackingDomain domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ドメイン&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Domain&lt;/div&gt; 
   * @return domain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public DictionaryServiceThirdPartyTrackingDomain vendor(String vendor) {
    
    this.vendor = vendor;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;第三者計測ベンダー&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Third party tracking vendor&lt;/div&gt; 
   * @return vendor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVendor() {
    return vendor;
  }


  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public DictionaryServiceThirdPartyTrackingDomain vendorName(String vendorName) {
    
    this.vendorName = vendorName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;第三者計測ベンダーの論理名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Logical name of third party tracking vendor&lt;/div&gt; 
   * @return vendorName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENDOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVendorName() {
    return vendorName;
  }


  @JsonProperty(JSON_PROPERTY_VENDOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceThirdPartyTrackingDomain dictionaryServiceThirdPartyTrackingDomain = (DictionaryServiceThirdPartyTrackingDomain) o;
    return Objects.equals(this.domain, dictionaryServiceThirdPartyTrackingDomain.domain) &&
        Objects.equals(this.vendor, dictionaryServiceThirdPartyTrackingDomain.vendor) &&
        Objects.equals(this.vendorName, dictionaryServiceThirdPartyTrackingDomain.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, vendor, vendorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceThirdPartyTrackingDomain {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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


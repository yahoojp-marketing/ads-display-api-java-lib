package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceThirdPartyTrackingDomainオブジェクトは第三者計測スクリプトタグのsrcで利用可能なドメインを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceThirdPartyTrackingDomain object indicates the domain that can be used for the src of third party tracking scripting tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceThirdPartyTrackingDomainオブジェクトは第三者計測スクリプトタグのsrcで利用可能なドメインを示します。</div> <div lang=\"en\">DictionaryServiceThirdPartyTrackingDomain object indicates the domain that can be used for the src of third party tracking scripting tag.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceThirdPartyTrackingDomain   {
  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("vendor")
  private String vendor = null;

  @JsonProperty("vendorName")
  private String vendorName = null;

  public DictionaryServiceThirdPartyTrackingDomain domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * <div lang=\"ja\">ドメイン</div> <div lang=\"en\">Domain</div> 
   * @return domain
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ドメイン</div> <div lang=\"en\">Domain</div> ")


  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DictionaryServiceThirdPartyTrackingDomain vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * <div lang=\"ja\">第三者計測ベンダー</div> <div lang=\"en\">Third Party Tracking vendor</div> 
   * @return vendor
  */
  @ApiModelProperty(value = "<div lang=\"ja\">第三者計測ベンダー</div> <div lang=\"en\">Third Party Tracking vendor</div> ")


  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public DictionaryServiceThirdPartyTrackingDomain vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

  /**
   * <div lang=\"ja\">第三者計測ベンダーの論理名</div> <div lang=\"en\">Logical name of Third Party Tracking vendor</div> 
   * @return vendorName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">第三者計測ベンダーの論理名</div> <div lang=\"en\">Logical name of Third Party Tracking vendor</div> ")


  public String getVendorName() {
    return vendorName;
  }

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


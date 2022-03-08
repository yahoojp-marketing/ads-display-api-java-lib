/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.DictionaryServiceDeviceOsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceOsVersionオブジェクトは、OSバージョンを保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceOsVersion object contains OS version.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceOsVersionオブジェクトは、OSバージョンを保持します。</div> <div lang=\"en\">DictionaryServiceOsVersion object contains OS version.</div> ")
@JsonPropertyOrder({
  DictionaryServiceOsVersion.JSON_PROPERTY_DEVICE_OS_TYPE,
  DictionaryServiceOsVersion.JSON_PROPERTY_VERSION
})
@JsonTypeName("DictionaryServiceOsVersion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceOsVersion {
  public static final String JSON_PROPERTY_DEVICE_OS_TYPE = "deviceOsType";
  private DictionaryServiceDeviceOsType deviceOsType;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DictionaryServiceOsVersion() { 
  }

  public DictionaryServiceOsVersion deviceOsType(DictionaryServiceDeviceOsType deviceOsType) {
    
    this.deviceOsType = deviceOsType;
    return this;
  }

   /**
   * Get deviceOsType
   * @return deviceOsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_OS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DictionaryServiceDeviceOsType getDeviceOsType() {
    return deviceOsType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_OS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceOsType(DictionaryServiceDeviceOsType deviceOsType) {
    this.deviceOsType = deviceOsType;
  }


  public DictionaryServiceOsVersion version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;OSバージョンです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;OS Version&lt;/div&gt; 
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">OSバージョンです。</div> <div lang=\"en\">OS Version</div> ")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceOsVersion dictionaryServiceOsVersion = (DictionaryServiceOsVersion) o;
    return Objects.equals(this.deviceOsType, dictionaryServiceOsVersion.deviceOsType) &&
        Objects.equals(this.version, dictionaryServiceOsVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceOsType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceOsVersion {\n");
    sb.append("    deviceOsType: ").append(toIndentedString(deviceOsType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v8.model.DictionaryServiceDeviceOsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceOsVersionSelectorオブジェクトは、getOsVersionメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceOsVersionSelector object contains a set of criteria (parameters) for getOsVersion method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceOsVersionSelectorオブジェクトは、getOsVersionメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">DictionaryServiceOsVersionSelector object contains a set of criteria (parameters) for getOsVersion method.</div> ")
@JsonPropertyOrder({
  DictionaryServiceOsVersionSelector.JSON_PROPERTY_DEVICE_OS_TYPE
})
@JsonTypeName("DictionaryServiceOsVersionSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceOsVersionSelector {
  public static final String JSON_PROPERTY_DEVICE_OS_TYPE = "deviceOsType";
  private DictionaryServiceDeviceOsType deviceOsType;

  public DictionaryServiceOsVersionSelector() { 
  }

  public DictionaryServiceOsVersionSelector deviceOsType(DictionaryServiceDeviceOsType deviceOsType) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceOsVersionSelector dictionaryServiceOsVersionSelector = (DictionaryServiceOsVersionSelector) o;
    return Objects.equals(this.deviceOsType, dictionaryServiceOsVersionSelector.deviceOsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceOsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceOsVersionSelector {\n");
    sb.append("    deviceOsType: ").append(toIndentedString(deviceOsType)).append("\n");
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


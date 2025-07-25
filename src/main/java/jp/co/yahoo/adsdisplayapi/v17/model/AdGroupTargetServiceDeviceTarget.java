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
import jp.co.yahoo.adsdisplayapi.v17.model.AdGroupTargetServiceDeviceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceDeviceTargetオブジェクトは、デバイスターゲティングの設定情報を保持します。&lt;br&gt; SET時のみ指定可能です。ADD、REMOVEおよびREPLACE時、このフィールドは無視されます。&lt;br&gt; SET時に必要なtargetIdは、AdGroupオブジェクトにデバイスが設定されている場合にレスポンスされます。&lt;br&gt; ※SET時、入札価格調整率のみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceDeviceTarget object is a container for storing device targeting settings.&lt;br&gt; This field can be specified only in SET operation and is ignored in ADD, REMOVE and REPLACE operation.&lt;br&gt; The targetId required on SET will be responded when devices are set on AdGroup object.&lt;br&gt; *Can set only bid adjustment in SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupTargetServiceDeviceTarget.JSON_PROPERTY_DEVICE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServiceDeviceTarget {
  public static final String JSON_PROPERTY_DEVICE_TYPE = "deviceType";
  private AdGroupTargetServiceDeviceType deviceType;

  public AdGroupTargetServiceDeviceTarget() {
  }

  public AdGroupTargetServiceDeviceTarget deviceType(AdGroupTargetServiceDeviceType deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceDeviceType getDeviceType() {
    return deviceType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceType(AdGroupTargetServiceDeviceType deviceType) {
    this.deviceType = deviceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceDeviceTarget adGroupTargetServiceDeviceTarget = (AdGroupTargetServiceDeviceTarget) o;
    return Objects.equals(this.deviceType, adGroupTargetServiceDeviceTarget.deviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceDeviceTarget {\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
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


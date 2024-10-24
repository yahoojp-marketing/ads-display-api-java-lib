/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v15.model.StatsServiceDeviceAppType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAppTargetオブジェクトは、アプリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAppTarget object holds configuration information of app targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAppTargetオブジェクトは、アプリターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAppTarget object holds configuration information of app targeting.</div> ")
@JsonPropertyOrder({
  StatsServiceAppTarget.JSON_PROPERTY_DEVICE_APP_TYPE
})
@JsonTypeName("StatsServiceAppTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceAppTarget {
  public static final String JSON_PROPERTY_DEVICE_APP_TYPE = "deviceAppType";
  private StatsServiceDeviceAppType deviceAppType;

  public StatsServiceAppTarget() { 
  }

  public StatsServiceAppTarget deviceAppType(StatsServiceDeviceAppType deviceAppType) {
    
    this.deviceAppType = deviceAppType;
    return this;
  }

   /**
   * Get deviceAppType
   * @return deviceAppType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_APP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceDeviceAppType getDeviceAppType() {
    return deviceAppType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_APP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceAppType(StatsServiceDeviceAppType deviceAppType) {
    this.deviceAppType = deviceAppType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceAppTarget statsServiceAppTarget = (StatsServiceAppTarget) o;
    return Objects.equals(this.deviceAppType, statsServiceAppTarget.deviceAppType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAppType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAppTarget {\n");
    sb.append("    deviceAppType: ").append(toIndentedString(deviceAppType)).append("\n");
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


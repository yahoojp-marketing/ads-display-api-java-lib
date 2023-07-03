/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v10.model.ConversionTrackerServiceAppConversionPlatform;
import jp.co.yahoo.adsdisplayapi.v10.model.ConversionTrackerServiceAppConversionType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceAppConversionオブジェクトは、アプリコンバージョントラッカーの情報を保持します。&lt;br&gt; このフィールドは、ADD時は省略可能となり、SET時は無視されます。ADD時、conversionTrackerTypeがAPP_CONVERSIONの場合、必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceAppConversion object contains the information for ConversionTrackerServiceAppConversionTracker.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET operation. If conversionTrackerType is APP_CONVERSION, this field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_APP_CONVERSION_PLATFORM,
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_APP_CONVERSION_TYPE,
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_APP_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceAppConversion {
  public static final String JSON_PROPERTY_APP_CONVERSION_PLATFORM = "appConversionPlatform";
  private ConversionTrackerServiceAppConversionPlatform appConversionPlatform;

  public static final String JSON_PROPERTY_APP_CONVERSION_TYPE = "appConversionType";
  private ConversionTrackerServiceAppConversionType appConversionType;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public ConversionTrackerServiceAppConversion() {
  }

  public ConversionTrackerServiceAppConversion appConversionPlatform(ConversionTrackerServiceAppConversionPlatform appConversionPlatform) {
    
    this.appConversionPlatform = appConversionPlatform;
    return this;
  }

   /**
   * Get appConversionPlatform
   * @return appConversionPlatform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CONVERSION_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppConversionPlatform getAppConversionPlatform() {
    return appConversionPlatform;
  }


  @JsonProperty(JSON_PROPERTY_APP_CONVERSION_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppConversionPlatform(ConversionTrackerServiceAppConversionPlatform appConversionPlatform) {
    this.appConversionPlatform = appConversionPlatform;
  }


  public ConversionTrackerServiceAppConversion appConversionType(ConversionTrackerServiceAppConversionType appConversionType) {
    
    this.appConversionType = appConversionType;
    return this;
  }

   /**
   * Get appConversionType
   * @return appConversionType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CONVERSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppConversionType getAppConversionType() {
    return appConversionType;
  }


  @JsonProperty(JSON_PROPERTY_APP_CONVERSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppConversionType(ConversionTrackerServiceAppConversionType appConversionType) {
    this.appConversionType = appConversionType;
  }


  public ConversionTrackerServiceAppConversion appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 計測対象のアプリIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; App ID of the object to be tracked.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation. &lt;/div&gt; 
   * @return appId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(String appId) {
    this.appId = appId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceAppConversion conversionTrackerServiceAppConversion = (ConversionTrackerServiceAppConversion) o;
    return Objects.equals(this.appConversionPlatform, conversionTrackerServiceAppConversion.appConversionPlatform) &&
        Objects.equals(this.appConversionType, conversionTrackerServiceAppConversion.appConversionType) &&
        Objects.equals(this.appId, conversionTrackerServiceAppConversion.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appConversionPlatform, appConversionType, appId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppConversion {\n");
    sb.append("    appConversionPlatform: ").append(toIndentedString(appConversionPlatform)).append("\n");
    sb.append("    appConversionType: ").append(toIndentedString(appConversionType)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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


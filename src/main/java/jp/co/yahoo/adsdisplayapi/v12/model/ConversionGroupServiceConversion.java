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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v12.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adsdisplayapi.v12.model.ConversionTrackerServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupServiceConversionオブジェクトは、コンバージョン測定タグなどのコンバージョン設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionGroupServiceConversion object shows ConversionTracker settings such as ConversionTag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionGroupServiceConversionオブジェクトは、コンバージョン測定タグなどのコンバージョン設定を表します。</div> <div lang=\"en\">ConversionGroupServiceConversion object shows ConversionTracker settings such as ConversionTag.</div> ")
@JsonPropertyOrder({
  ConversionGroupServiceConversion.JSON_PROPERTY_CONVERSION_TRACKER_ID,
  ConversionGroupServiceConversion.JSON_PROPERTY_CONVERSION_TRACKER_TYPE,
  ConversionGroupServiceConversion.JSON_PROPERTY_CONVERSION_TAG_ID,
  ConversionGroupServiceConversion.JSON_PROPERTY_CONVERSION_TAG_NAME,
  ConversionGroupServiceConversion.JSON_PROPERTY_STATUS
})
@JsonTypeName("ConversionGroupServiceConversion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionGroupServiceConversion {
  public static final String JSON_PROPERTY_CONVERSION_TRACKER_ID = "conversionTrackerId";
  private Long conversionTrackerId;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_TYPE = "conversionTrackerType";
  private ConversionTrackerServiceType conversionTrackerType;

  public static final String JSON_PROPERTY_CONVERSION_TAG_ID = "conversionTagId";
  private Long conversionTagId;

  public static final String JSON_PROPERTY_CONVERSION_TAG_NAME = "conversionTagName";
  private String conversionTagName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ConversionTrackerServiceStatus status;

  public ConversionGroupServiceConversion() { 
  }

  public ConversionGroupServiceConversion conversionTrackerId(Long conversionTrackerId) {
    
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョントラッカーIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversion tracker ID.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return conversionTrackerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカーIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion tracker ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }


  public ConversionGroupServiceConversion conversionTrackerType(ConversionTrackerServiceType conversionTrackerType) {
    
    this.conversionTrackerType = conversionTrackerType;
    return this;
  }

   /**
   * Get conversionTrackerType
   * @return conversionTrackerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceType getConversionTrackerType() {
    return conversionTrackerType;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerType(ConversionTrackerServiceType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }


  public ConversionGroupServiceConversion conversionTagId(Long conversionTagId) {
    
    this.conversionTagId = conversionTagId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョンタグIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversion tag ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return conversionTagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンタグIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversion tag ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionTagId() {
    return conversionTagId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTagId(Long conversionTagId) {
    this.conversionTagId = conversionTagId;
  }


  public ConversionGroupServiceConversion conversionTagName(String conversionTagName) {
    
    this.conversionTagName = conversionTagName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョンタグ名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversion tag name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return conversionTagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンタグ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversion tag name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TAG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversionTagName() {
    return conversionTagName;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TAG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTagName(String conversionTagName) {
    this.conversionTagName = conversionTagName;
  }


  public ConversionGroupServiceConversion status(ConversionTrackerServiceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ConversionTrackerServiceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionGroupServiceConversion conversionGroupServiceConversion = (ConversionGroupServiceConversion) o;
    return Objects.equals(this.conversionTrackerId, conversionGroupServiceConversion.conversionTrackerId) &&
        Objects.equals(this.conversionTrackerType, conversionGroupServiceConversion.conversionTrackerType) &&
        Objects.equals(this.conversionTagId, conversionGroupServiceConversion.conversionTagId) &&
        Objects.equals(this.conversionTagName, conversionGroupServiceConversion.conversionTagName) &&
        Objects.equals(this.status, conversionGroupServiceConversion.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTrackerId, conversionTrackerType, conversionTagId, conversionTagName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionGroupServiceConversion {\n");
    sb.append("    conversionTrackerId: ").append(toIndentedString(conversionTrackerId)).append("\n");
    sb.append("    conversionTrackerType: ").append(toIndentedString(conversionTrackerType)).append("\n");
    sb.append("    conversionTagId: ").append(toIndentedString(conversionTagId)).append("\n");
    sb.append("    conversionTagName: ").append(toIndentedString(conversionTagName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


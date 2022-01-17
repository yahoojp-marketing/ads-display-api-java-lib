package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adsdisplayapi.v7.model.ConversionTrackerServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupServiceConversionオブジェクトは、コンバージョン測定タグなどのコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionGroupServiceConversion object shows ConversionTracker information such as ConversionTag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionGroupServiceConversionオブジェクトは、コンバージョン測定タグなどのコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionGroupServiceConversion object shows ConversionTracker information such as ConversionTag.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionGroupServiceConversion   {
  @JsonProperty("conversionTrackerId")
  private Long conversionTrackerId = null;

  @JsonProperty("conversionTrackerType")
  private ConversionTrackerServiceType conversionTrackerType = null;

  @JsonProperty("conversionTagId")
  private Long conversionTagId = null;

  @JsonProperty("conversionTagName")
  private String conversionTagName = null;

  @JsonProperty("status")
  private ConversionTrackerServiceStatus status = null;

  public ConversionGroupServiceConversion conversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョントラッカーIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return conversionTrackerId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカーIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceType getConversionTrackerType() {
    return conversionTrackerType;
  }

  public void setConversionTrackerType(ConversionTrackerServiceType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }

  public ConversionGroupServiceConversion conversionTagId(Long conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンタグIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversion Tag ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversionTagId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンタグIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversion Tag ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getConversionTagId() {
    return conversionTagId;
  }

  public void setConversionTagId(Long conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  public ConversionGroupServiceConversion conversionTagName(String conversionTagName) {
    this.conversionTagName = conversionTagName;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョンタグ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversion Tag Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return conversionTagName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンタグ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversion Tag Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getConversionTagName() {
    return conversionTagName;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceStatus getStatus() {
    return status;
  }

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


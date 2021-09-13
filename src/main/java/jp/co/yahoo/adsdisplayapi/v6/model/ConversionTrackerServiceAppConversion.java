package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceAppConversionPlatform;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionTrackerServiceAppConversionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceAppConversionオブジェクトは、アプリコンバージョントラッカーの情報を保持します。&lt;br&gt; このフィールドは、ADD時は省略可能となり、SET時は無視されます。ADD時、conversionTrackerTypeがAPP_CONVERSIONの場合、必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceAppConversion object contains the information for ConversionTrackerServiceAppConversionTracker.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET operation. If conversionTrackerType is APP_CONVERSION, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ConversionTrackerServiceAppConversionオブジェクトは、アプリコンバージョントラッカーの情報を保持します。<br> このフィールドは、ADD時は省略可能となり、SET時は無視されます。ADD時、conversionTrackerTypeがAPP_CONVERSIONの場合、必須です。 </div> <div lang=\"en\"> ConversionTrackerServiceAppConversion object contains the information for ConversionTrackerServiceAppConversionTracker.<br> This field is optional in ADD operation, and will be ignored in SET operation. If conversionTrackerType is APP_CONVERSION, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceAppConversion   {
  @JsonProperty("appConversionPlatform")
  private ConversionTrackerServiceAppConversionPlatform appConversionPlatform = null;

  @JsonProperty("appConversionType")
  private ConversionTrackerServiceAppConversionType appConversionType = null;

  @JsonProperty("appId")
  private String appId = null;

  public ConversionTrackerServiceAppConversion appConversionPlatform(ConversionTrackerServiceAppConversionPlatform appConversionPlatform) {
    this.appConversionPlatform = appConversionPlatform;
    return this;
  }

  /**
   * Get appConversionPlatform
   * @return appConversionPlatform
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppConversionPlatform getAppConversionPlatform() {
    return appConversionPlatform;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppConversionType getAppConversionType() {
    return appConversionType;
  }

  public void setAppConversionType(ConversionTrackerServiceAppConversionType appConversionType) {
    this.appConversionType = appConversionType;
  }

  public ConversionTrackerServiceAppConversion appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 計測対象のアプリIDです。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。 </div> <div lang=\"en\"> App ID of the object to be tracked.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 計測対象のアプリIDです。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。 </div> <div lang=\"en\"> App ID of the object to be tracked.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> ")


  public String getAppId() {
    return appId;
  }

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


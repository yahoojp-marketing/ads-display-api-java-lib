package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceAppConversionPlatform;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceAppConversionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceAppConversionオブジェクトは、アプリコンバージョントラッカーの情報を保持します。&lt;br&gt; このフィールドは、ADD時は省略可能となり、SET時は無視されます。ADD時、conversionTrackerTypeがAPP_CONVERSIONの場合、必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceAppConversion object contains the information for ConversionTrackerServiceAppConversionTracker.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET operation. If conversionTrackerType is APP_CONVERSION, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ConversionTrackerServiceAppConversionオブジェクトは、アプリコンバージョントラッカーの情報を保持します。<br> このフィールドは、ADD時は省略可能となり、SET時は無視されます。ADD時、conversionTrackerTypeがAPP_CONVERSIONの場合、必須です。 </div> <div lang=\"en\"> ConversionTrackerServiceAppConversion object contains the information for ConversionTrackerServiceAppConversionTracker.<br> This field is optional in ADD operation, and will be ignored in SET operation. If conversionTrackerType is APP_CONVERSION, this field is required in ADD operation. </div> ")

public class ConversionTrackerServiceAppConversion   {
  @JsonProperty("appConversionPlatform")
  private JsonNullable<ConversionTrackerServiceAppConversionPlatform> appConversionPlatform = JsonNullable.undefined();

  @JsonProperty("appConversionType")
  private JsonNullable<ConversionTrackerServiceAppConversionType> appConversionType = JsonNullable.undefined();

  @JsonProperty("appId")
  private JsonNullable<String> appId = JsonNullable.undefined();

  public ConversionTrackerServiceAppConversion appConversionPlatform(ConversionTrackerServiceAppConversionPlatform appConversionPlatform) {
    this.appConversionPlatform = JsonNullable.of(appConversionPlatform);
    return this;
  }

  /**
   * Get appConversionPlatform
   * @return appConversionPlatform
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppConversionPlatform> getAppConversionPlatform() {
    return appConversionPlatform;
  }

  public void setAppConversionPlatform(JsonNullable<ConversionTrackerServiceAppConversionPlatform> appConversionPlatform) {
    this.appConversionPlatform = appConversionPlatform;
  }

  public ConversionTrackerServiceAppConversion appConversionType(ConversionTrackerServiceAppConversionType appConversionType) {
    this.appConversionType = JsonNullable.of(appConversionType);
    return this;
  }

  /**
   * Get appConversionType
   * @return appConversionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppConversionType> getAppConversionType() {
    return appConversionType;
  }

  public void setAppConversionType(JsonNullable<ConversionTrackerServiceAppConversionType> appConversionType) {
    this.appConversionType = appConversionType;
  }

  public ConversionTrackerServiceAppConversion appId(String appId) {
    this.appId = JsonNullable.of(appId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 計測対象のアプリIDです。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。 </div> <div lang=\"en\"> App ID of the object to be tracked.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 計測対象のアプリIDです。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。 </div> <div lang=\"en\"> App ID of the object to be tracked.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> ")


  public JsonNullable<String> getAppId() {
    return appId;
  }

  public void setAppId(JsonNullable<String> appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


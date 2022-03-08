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
import jp.co.yahoo.adsdisplayapi.v7.model.FeedServiceControlType;
import jp.co.yahoo.adsdisplayapi.v7.model.FeedServiceSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServiceUploadLimitオブジェクトは、Feedファイルの制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServiceUploadLimit object contains feed file restriction information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedServiceUploadLimitオブジェクトは、Feedファイルの制限情報を保持します。</div> <div lang=\"en\">FeedServiceUploadLimit object contains feed file restriction information.</div> ")
@JsonPropertyOrder({
  FeedServiceUploadLimit.JSON_PROPERTY_SOURCE_TYPE,
  FeedServiceUploadLimit.JSON_PROPERTY_CONTROL_TYPE,
  FeedServiceUploadLimit.JSON_PROPERTY_LIMIT_VALUE
})
@JsonTypeName("FeedServiceUploadLimit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedServiceUploadLimit {
  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  private FeedServiceSourceType sourceType;

  public static final String JSON_PROPERTY_CONTROL_TYPE = "controlType";
  private FeedServiceControlType controlType;

  public static final String JSON_PROPERTY_LIMIT_VALUE = "limitValue";
  private Integer limitValue;

  public FeedServiceUploadLimit() { 
  }

  public FeedServiceUploadLimit sourceType(FeedServiceSourceType sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedServiceSourceType getSourceType() {
    return sourceType;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceType(FeedServiceSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public FeedServiceUploadLimit controlType(FeedServiceControlType controlType) {
    
    this.controlType = controlType;
    return this;
  }

   /**
   * Get controlType
   * @return controlType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTROL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedServiceControlType getControlType() {
    return controlType;
  }


  @JsonProperty(JSON_PROPERTY_CONTROL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setControlType(FeedServiceControlType controlType) {
    this.controlType = controlType;
  }


  public FeedServiceUploadLimit limitValue(Integer limitValue) {
    
    this.limitValue = limitValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;上限数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of limit.&lt;/div&gt; 
   * @return limitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">上限数です。</div> <div lang=\"en\">Number of limit.</div> ")
  @JsonProperty(JSON_PROPERTY_LIMIT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimitValue() {
    return limitValue;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitValue(Integer limitValue) {
    this.limitValue = limitValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedServiceUploadLimit feedServiceUploadLimit = (FeedServiceUploadLimit) o;
    return Objects.equals(this.sourceType, feedServiceUploadLimit.sourceType) &&
        Objects.equals(this.controlType, feedServiceUploadLimit.controlType) &&
        Objects.equals(this.limitValue, feedServiceUploadLimit.limitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, controlType, limitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedServiceUploadLimit {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    limitValue: ").append(toIndentedString(limitValue)).append("\n");
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


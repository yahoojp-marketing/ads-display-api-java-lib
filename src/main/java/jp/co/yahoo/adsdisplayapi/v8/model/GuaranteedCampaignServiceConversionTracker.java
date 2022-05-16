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
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 紐づけられているコンバージョントラッカー設定情報を表します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceConversionTracker object describes conversion tracking information to be associated.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> 紐づけられているコンバージョントラッカー設定情報を表します。<br> </div> <div lang=\"en\"> GuaranteedCampaignServiceConversionTracker object describes conversion tracking information to be associated.<br> </div> ")
@JsonPropertyOrder({
  GuaranteedCampaignServiceConversionTracker.JSON_PROPERTY_CONVERSION_GROUP_ID,
  GuaranteedCampaignServiceConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_ID,
  GuaranteedCampaignServiceConversionTracker.JSON_PROPERTY_IS_REMOVE_CONVERSION_GROUP_ID,
  GuaranteedCampaignServiceConversionTracker.JSON_PROPERTY_IS_REMOVE_CONVERSION_TRACKER_ID
})
@JsonTypeName("GuaranteedCampaignServiceConversionTracker")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedCampaignServiceConversionTracker {
  public static final String JSON_PROPERTY_CONVERSION_GROUP_ID = "conversionGroupId";
  private Long conversionGroupId;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_ID = "conversionTrackerId";
  private Long conversionTrackerId;

  public static final String JSON_PROPERTY_IS_REMOVE_CONVERSION_GROUP_ID = "isRemoveConversionGroupId";
  private GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionGroupId;

  public static final String JSON_PROPERTY_IS_REMOVE_CONVERSION_TRACKER_ID = "isRemoveConversionTrackerId";
  private GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionTrackerId;

  public GuaranteedCampaignServiceConversionTracker() { 
  }

  public GuaranteedCampaignServiceConversionTracker conversionGroupId(Long conversionGroupId) {
    
    this.conversionGroupId = conversionGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョングループIDです。&lt;br&gt; ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceConversionGroup ID.&lt;br&gt; *conversionGroupId and conversionTrackerIds cannot be set at the same time. &lt;/div&gt; 
   * @return conversionGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョングループIDです。<br> ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 </div> <div lang=\"en\"> GuaranteedCampaignServiceConversionGroup ID.<br> *conversionGroupId and conversionTrackerIds cannot be set at the same time. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionGroupId() {
    return conversionGroupId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionGroupId(Long conversionGroupId) {
    this.conversionGroupId = conversionGroupId;
  }


  public GuaranteedCampaignServiceConversionTracker conversionTrackerId(Long conversionTrackerId) {
    
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョントラッカーIDです。&lt;br&gt; ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceConversionTracker ID.&lt;br&gt; *conversionGroupId and conversionTrackerIds cannot be set at the same time. &lt;/div&gt; 
   * @return conversionTrackerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカーIDです。<br> ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 </div> <div lang=\"en\"> GuaranteedCampaignServiceConversionTracker ID.<br> *conversionGroupId and conversionTrackerIds cannot be set at the same time. </div> ")
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


  public GuaranteedCampaignServiceConversionTracker isRemoveConversionGroupId(GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionGroupId) {
    
    this.isRemoveConversionGroupId = isRemoveConversionGroupId;
    return this;
  }

   /**
   * Get isRemoveConversionGroupId
   * @return isRemoveConversionGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceIsRemoveFlg getIsRemoveConversionGroupId() {
    return isRemoveConversionGroupId;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveConversionGroupId(GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionGroupId) {
    this.isRemoveConversionGroupId = isRemoveConversionGroupId;
  }


  public GuaranteedCampaignServiceConversionTracker isRemoveConversionTrackerId(GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionTrackerId) {
    
    this.isRemoveConversionTrackerId = isRemoveConversionTrackerId;
    return this;
  }

   /**
   * Get isRemoveConversionTrackerId
   * @return isRemoveConversionTrackerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceIsRemoveFlg getIsRemoveConversionTrackerId() {
    return isRemoveConversionTrackerId;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveConversionTrackerId(GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionTrackerId) {
    this.isRemoveConversionTrackerId = isRemoveConversionTrackerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceConversionTracker guaranteedCampaignServiceConversionTracker = (GuaranteedCampaignServiceConversionTracker) o;
    return Objects.equals(this.conversionGroupId, guaranteedCampaignServiceConversionTracker.conversionGroupId) &&
        Objects.equals(this.conversionTrackerId, guaranteedCampaignServiceConversionTracker.conversionTrackerId) &&
        Objects.equals(this.isRemoveConversionGroupId, guaranteedCampaignServiceConversionTracker.isRemoveConversionGroupId) &&
        Objects.equals(this.isRemoveConversionTrackerId, guaranteedCampaignServiceConversionTracker.isRemoveConversionTrackerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionGroupId, conversionTrackerId, isRemoveConversionGroupId, isRemoveConversionTrackerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceConversionTracker {\n");
    sb.append("    conversionGroupId: ").append(toIndentedString(conversionGroupId)).append("\n");
    sb.append("    conversionTrackerId: ").append(toIndentedString(conversionTrackerId)).append("\n");
    sb.append("    isRemoveConversionGroupId: ").append(toIndentedString(isRemoveConversionGroupId)).append("\n");
    sb.append("    isRemoveConversionTrackerId: ").append(toIndentedString(isRemoveConversionTrackerId)).append("\n");
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


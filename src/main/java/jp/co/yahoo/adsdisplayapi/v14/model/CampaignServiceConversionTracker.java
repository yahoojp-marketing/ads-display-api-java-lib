/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v14.model.CampaignServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 紐づけられているコンバージョントラッカー設定情報を表します。&lt;br&gt; コンバージョングループID及びコンバージョントラッカーIDが共に指定されていない場合は、アカウントレベルのコンバージョン設定が適用されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceConversionTracker object describes conversion tracking information to be associated.&lt;br&gt; If neither the conversionGroupId nor the conversionTrackerId is specified, the account-level conversion settings are applied. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceConversionTracker.JSON_PROPERTY_CONVERSION_GROUP_ID,
  CampaignServiceConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_ID,
  CampaignServiceConversionTracker.JSON_PROPERTY_IS_REMOVE_CONVERSION_GROUP_ID,
  CampaignServiceConversionTracker.JSON_PROPERTY_IS_REMOVE_CONVERSION_TRACKER_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceConversionTracker {
  public static final String JSON_PROPERTY_CONVERSION_GROUP_ID = "conversionGroupId";
  private Long conversionGroupId;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_ID = "conversionTrackerId";
  private Long conversionTrackerId;

  public static final String JSON_PROPERTY_IS_REMOVE_CONVERSION_GROUP_ID = "isRemoveConversionGroupId";
  private CampaignServiceIsRemoveFlg isRemoveConversionGroupId;

  public static final String JSON_PROPERTY_IS_REMOVE_CONVERSION_TRACKER_ID = "isRemoveConversionTrackerId";
  private CampaignServiceIsRemoveFlg isRemoveConversionTrackerId;

  public CampaignServiceConversionTracker() {
  }

  public CampaignServiceConversionTracker conversionGroupId(Long conversionGroupId) {
    
    this.conversionGroupId = conversionGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョングループIDです。&lt;br&gt; ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceConversionGroup ID.&lt;br&gt; *conversionGroupId and conversionTrackerIds cannot be set at the same time. &lt;/div&gt; 
   * @return conversionGroupId
  **/
  @jakarta.annotation.Nullable
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


  public CampaignServiceConversionTracker conversionTrackerId(Long conversionTrackerId) {
    
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョントラッカーIDです。&lt;br&gt; ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceConversionTracker ID.&lt;br&gt; *conversionGroupId and conversionTrackerIds cannot be set at the same time. &lt;/div&gt; 
   * @return conversionTrackerId
  **/
  @jakarta.annotation.Nullable
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


  public CampaignServiceConversionTracker isRemoveConversionGroupId(CampaignServiceIsRemoveFlg isRemoveConversionGroupId) {
    
    this.isRemoveConversionGroupId = isRemoveConversionGroupId;
    return this;
  }

   /**
   * Get isRemoveConversionGroupId
   * @return isRemoveConversionGroupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceIsRemoveFlg getIsRemoveConversionGroupId() {
    return isRemoveConversionGroupId;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveConversionGroupId(CampaignServiceIsRemoveFlg isRemoveConversionGroupId) {
    this.isRemoveConversionGroupId = isRemoveConversionGroupId;
  }


  public CampaignServiceConversionTracker isRemoveConversionTrackerId(CampaignServiceIsRemoveFlg isRemoveConversionTrackerId) {
    
    this.isRemoveConversionTrackerId = isRemoveConversionTrackerId;
    return this;
  }

   /**
   * Get isRemoveConversionTrackerId
   * @return isRemoveConversionTrackerId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceIsRemoveFlg getIsRemoveConversionTrackerId() {
    return isRemoveConversionTrackerId;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveConversionTrackerId(CampaignServiceIsRemoveFlg isRemoveConversionTrackerId) {
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
    CampaignServiceConversionTracker campaignServiceConversionTracker = (CampaignServiceConversionTracker) o;
    return Objects.equals(this.conversionGroupId, campaignServiceConversionTracker.conversionGroupId) &&
        Objects.equals(this.conversionTrackerId, campaignServiceConversionTracker.conversionTrackerId) &&
        Objects.equals(this.isRemoveConversionGroupId, campaignServiceConversionTracker.isRemoveConversionGroupId) &&
        Objects.equals(this.isRemoveConversionTrackerId, campaignServiceConversionTracker.isRemoveConversionTrackerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionGroupId, conversionTrackerId, isRemoveConversionGroupId, isRemoveConversionTrackerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceConversionTracker {\n");
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


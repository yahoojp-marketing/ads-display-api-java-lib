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
import jp.co.yahoo.adsdisplayapi.v17.model.VideoServiceQualityType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビデオをダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Download the video.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  VideoServiceDownloadSelector.JSON_PROPERTY_ACCOUNT_ID,
  VideoServiceDownloadSelector.JSON_PROPERTY_MEDIA_ID,
  VideoServiceDownloadSelector.JSON_PROPERTY_QUALITY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoServiceDownloadSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_QUALITY_TYPE = "qualityType";
  private VideoServiceQualityType qualityType;

  public VideoServiceDownloadSelector() {
  }

  public VideoServiceDownloadSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public VideoServiceDownloadSelector mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;メディアID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Media ID.&lt;/div&gt; 
   * @return mediaId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMediaId() {
    return mediaId;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }


  public VideoServiceDownloadSelector qualityType(VideoServiceQualityType qualityType) {
    
    this.qualityType = qualityType;
    return this;
  }

   /**
   * Get qualityType
   * @return qualityType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUALITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VideoServiceQualityType getQualityType() {
    return qualityType;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQualityType(VideoServiceQualityType qualityType) {
    this.qualityType = qualityType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoServiceDownloadSelector videoServiceDownloadSelector = (VideoServiceDownloadSelector) o;
    return Objects.equals(this.accountId, videoServiceDownloadSelector.accountId) &&
        Objects.equals(this.mediaId, videoServiceDownloadSelector.mediaId) &&
        Objects.equals(this.qualityType, videoServiceDownloadSelector.qualityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, mediaId, qualityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceDownloadSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    qualityType: ").append(toIndentedString(qualityType)).append("\n");
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


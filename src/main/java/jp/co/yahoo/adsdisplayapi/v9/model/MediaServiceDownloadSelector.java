/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入稿済みのメディアファイルをダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Download the submitted media file.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  MediaServiceDownloadSelector.JSON_PROPERTY_ACCOUNT_ID,
  MediaServiceDownloadSelector.JSON_PROPERTY_MEDIA_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MediaServiceDownloadSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public MediaServiceDownloadSelector() {
  }

  public MediaServiceDownloadSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
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


  public MediaServiceDownloadSelector mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：メディアIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Media ID.&lt;/div&gt; 
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaServiceDownloadSelector mediaServiceDownloadSelector = (MediaServiceDownloadSelector) o;
    return Objects.equals(this.accountId, mediaServiceDownloadSelector.accountId) &&
        Objects.equals(this.mediaId, mediaServiceDownloadSelector.mediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, mediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaServiceDownloadSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
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


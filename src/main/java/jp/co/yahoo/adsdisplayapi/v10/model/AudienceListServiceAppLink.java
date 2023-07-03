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
import jp.co.yahoo.adsdisplayapi.v10.model.AudienceListServiceAppPlatform;
import jp.co.yahoo.adsdisplayapi.v10.model.AudienceListServiceAppVendor;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceAppLinkオブジェクトは、アプリリンクの詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceListServiceAppLink object describes the detailed information of app link.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceAppLink.JSON_PROPERTY_APP_ID,
  AudienceListServiceAppLink.JSON_PROPERTY_APP_VENDOR,
  AudienceListServiceAppLink.JSON_PROPERTY_LINK_ID,
  AudienceListServiceAppLink.JSON_PROPERTY_APP_PLATFORM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceAppLink {
  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_VENDOR = "appVendor";
  private AudienceListServiceAppVendor appVendor;

  public static final String JSON_PROPERTY_LINK_ID = "linkId";
  private String linkId;

  public static final String JSON_PROPERTY_APP_PLATFORM = "appPlatform";
  private AudienceListServiceAppPlatform appPlatform;

  public AudienceListServiceAppLink() {
  }

  public AudienceListServiceAppLink appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アプリIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; App ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
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


  public AudienceListServiceAppLink appVendor(AudienceListServiceAppVendor appVendor) {
    
    this.appVendor = appVendor;
    return this;
  }

   /**
   * Get appVendor
   * @return appVendor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceAppVendor getAppVendor() {
    return appVendor;
  }


  @JsonProperty(JSON_PROPERTY_APP_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppVendor(AudienceListServiceAppVendor appVendor) {
    this.appVendor = appVendor;
  }


  public AudienceListServiceAppLink linkId(String linkId) {
    
    this.linkId = linkId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンクIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Link ID.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation. &lt;/div&gt; 
   * @return linkId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkId() {
    return linkId;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }


  public AudienceListServiceAppLink appPlatform(AudienceListServiceAppPlatform appPlatform) {
    
    this.appPlatform = appPlatform;
    return this;
  }

   /**
   * Get appPlatform
   * @return appPlatform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceAppPlatform getAppPlatform() {
    return appPlatform;
  }


  @JsonProperty(JSON_PROPERTY_APP_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppPlatform(AudienceListServiceAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceAppLink audienceListServiceAppLink = (AudienceListServiceAppLink) o;
    return Objects.equals(this.appId, audienceListServiceAppLink.appId) &&
        Objects.equals(this.appVendor, audienceListServiceAppLink.appVendor) &&
        Objects.equals(this.linkId, audienceListServiceAppLink.linkId) &&
        Objects.equals(this.appPlatform, audienceListServiceAppLink.appPlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appVendor, linkId, appPlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceAppLink {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appVendor: ").append(toIndentedString(appVendor)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    appPlatform: ").append(toIndentedString(appPlatform)).append("\n");
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


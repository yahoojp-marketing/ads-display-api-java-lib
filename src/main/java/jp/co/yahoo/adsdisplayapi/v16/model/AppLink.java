/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v16.model.AppLinkServiceAppLinkStatus;
import jp.co.yahoo.adsdisplayapi.v16.model.AppLinkServiceAppPlatform;
import jp.co.yahoo.adsdisplayapi.v16.model.AppLinkServiceAppVendor;
import jp.co.yahoo.adsdisplayapi.v16.model.AppLinkServiceCategoryType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AppLinkオブジェクトは、アプリ連携の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The App Link object is a container for storing app link information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AppLink.JSON_PROPERTY_ACCOUNT_ID,
  AppLink.JSON_PROPERTY_CATEGORY_TYPE,
  AppLink.JSON_PROPERTY_LINK_ID,
  AppLink.JSON_PROPERTY_APP_PLATFORM,
  AppLink.JSON_PROPERTY_APP_ID,
  AppLink.JSON_PROPERTY_APP_VENDOR,
  AppLink.JSON_PROPERTY_APP_LINK_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppLink {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CATEGORY_TYPE = "categoryType";
  private AppLinkServiceCategoryType categoryType;

  public static final String JSON_PROPERTY_LINK_ID = "linkId";
  private String linkId;

  public static final String JSON_PROPERTY_APP_PLATFORM = "appPlatform";
  private AppLinkServiceAppPlatform appPlatform;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_VENDOR = "appVendor";
  private AppLinkServiceAppVendor appVendor;

  public static final String JSON_PROPERTY_APP_LINK_STATUS = "appLinkStatus";
  private AppLinkServiceAppLinkStatus appLinkStatus;

  public AppLink() {
  }

  public AppLink accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AppLink categoryType(AppLinkServiceCategoryType categoryType) {
    
    this.categoryType = categoryType;
    return this;
  }

   /**
   * Get categoryType
   * @return categoryType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppLinkServiceCategoryType getCategoryType() {
    return categoryType;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryType(AppLinkServiceCategoryType categoryType) {
    this.categoryType = categoryType;
  }


  public AppLink linkId(String linkId) {
    
    this.linkId = linkId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンクIDです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Link ID. &lt;/div&gt; 
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


  public AppLink appPlatform(AppLinkServiceAppPlatform appPlatform) {
    
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

  public AppLinkServiceAppPlatform getAppPlatform() {
    return appPlatform;
  }


  @JsonProperty(JSON_PROPERTY_APP_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppPlatform(AppLinkServiceAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
  }


  public AppLink appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アプリIDです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; App ID. &lt;/div&gt; 
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


  public AppLink appVendor(AppLinkServiceAppVendor appVendor) {
    
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

  public AppLinkServiceAppVendor getAppVendor() {
    return appVendor;
  }


  @JsonProperty(JSON_PROPERTY_APP_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppVendor(AppLinkServiceAppVendor appVendor) {
    this.appVendor = appVendor;
  }


  public AppLink appLinkStatus(AppLinkServiceAppLinkStatus appLinkStatus) {
    
    this.appLinkStatus = appLinkStatus;
    return this;
  }

   /**
   * Get appLinkStatus
   * @return appLinkStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_LINK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppLinkServiceAppLinkStatus getAppLinkStatus() {
    return appLinkStatus;
  }


  @JsonProperty(JSON_PROPERTY_APP_LINK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppLinkStatus(AppLinkServiceAppLinkStatus appLinkStatus) {
    this.appLinkStatus = appLinkStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLink appLink = (AppLink) o;
    return Objects.equals(this.accountId, appLink.accountId) &&
        Objects.equals(this.categoryType, appLink.categoryType) &&
        Objects.equals(this.linkId, appLink.linkId) &&
        Objects.equals(this.appPlatform, appLink.appPlatform) &&
        Objects.equals(this.appId, appLink.appId) &&
        Objects.equals(this.appVendor, appLink.appVendor) &&
        Objects.equals(this.appLinkStatus, appLink.appLinkStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, categoryType, linkId, appPlatform, appId, appVendor, appLinkStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLink {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    appPlatform: ").append(toIndentedString(appPlatform)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appVendor: ").append(toIndentedString(appVendor)).append("\n");
    sb.append("    appLinkStatus: ").append(toIndentedString(appLinkStatus)).append("\n");
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


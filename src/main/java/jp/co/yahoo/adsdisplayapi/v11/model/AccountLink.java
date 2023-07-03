/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v11.model.AccountLinkServiceAudienceListSharingEnabled;
import jp.co.yahoo.adsdisplayapi.v11.model.AccountLinkServiceLinkAccessPermission;
import jp.co.yahoo.adsdisplayapi.v11.model.AccountLinkServiceOwnerShipType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountLinkオブジェクトは、アカウントリンク情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountLink objects serve account link information.&lt;br&gt; &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AccountLink.JSON_PROPERTY_MANAGER_ACCOUNT_ID,
  AccountLink.JSON_PROPERTY_ACCOUNT_ID,
  AccountLink.JSON_PROPERTY_LINK_ACCESS_PERMISSION,
  AccountLink.JSON_PROPERTY_AUDIENCE_LIST_SHARING_ENABLED,
  AccountLink.JSON_PROPERTY_OWNER_SHIP_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountLink {
  public static final String JSON_PROPERTY_MANAGER_ACCOUNT_ID = "managerAccountId";
  private Long managerAccountId;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_LINK_ACCESS_PERMISSION = "linkAccessPermission";
  private AccountLinkServiceLinkAccessPermission linkAccessPermission;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_SHARING_ENABLED = "audienceListSharingEnabled";
  private AccountLinkServiceAudienceListSharingEnabled audienceListSharingEnabled;

  public static final String JSON_PROPERTY_OWNER_SHIP_TYPE = "ownerShipType";
  private AccountLinkServiceOwnerShipType ownerShipType;

  public AccountLink() {
  }

  public AccountLink managerAccountId(Long managerAccountId) {
    
    this.managerAccountId = managerAccountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MCCアカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;MCC Account ID.&lt;/div&gt; 
   * @return managerAccountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANAGER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getManagerAccountId() {
    return managerAccountId;
  }


  @JsonProperty(JSON_PROPERTY_MANAGER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagerAccountId(Long managerAccountId) {
    this.managerAccountId = managerAccountId;
  }


  public AccountLink accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
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


  public AccountLink linkAccessPermission(AccountLinkServiceLinkAccessPermission linkAccessPermission) {
    
    this.linkAccessPermission = linkAccessPermission;
    return this;
  }

   /**
   * Get linkAccessPermission
   * @return linkAccessPermission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ACCESS_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountLinkServiceLinkAccessPermission getLinkAccessPermission() {
    return linkAccessPermission;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ACCESS_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkAccessPermission(AccountLinkServiceLinkAccessPermission linkAccessPermission) {
    this.linkAccessPermission = linkAccessPermission;
  }


  public AccountLink audienceListSharingEnabled(AccountLinkServiceAudienceListSharingEnabled audienceListSharingEnabled) {
    
    this.audienceListSharingEnabled = audienceListSharingEnabled;
    return this;
  }

   /**
   * Get audienceListSharingEnabled
   * @return audienceListSharingEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SHARING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountLinkServiceAudienceListSharingEnabled getAudienceListSharingEnabled() {
    return audienceListSharingEnabled;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SHARING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListSharingEnabled(AccountLinkServiceAudienceListSharingEnabled audienceListSharingEnabled) {
    this.audienceListSharingEnabled = audienceListSharingEnabled;
  }


  public AccountLink ownerShipType(AccountLinkServiceOwnerShipType ownerShipType) {
    
    this.ownerShipType = ownerShipType;
    return this;
  }

   /**
   * Get ownerShipType
   * @return ownerShipType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER_SHIP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountLinkServiceOwnerShipType getOwnerShipType() {
    return ownerShipType;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_SHIP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerShipType(AccountLinkServiceOwnerShipType ownerShipType) {
    this.ownerShipType = ownerShipType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountLink accountLink = (AccountLink) o;
    return Objects.equals(this.managerAccountId, accountLink.managerAccountId) &&
        Objects.equals(this.accountId, accountLink.accountId) &&
        Objects.equals(this.linkAccessPermission, accountLink.linkAccessPermission) &&
        Objects.equals(this.audienceListSharingEnabled, accountLink.audienceListSharingEnabled) &&
        Objects.equals(this.ownerShipType, accountLink.ownerShipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerAccountId, accountId, linkAccessPermission, audienceListSharingEnabled, ownerShipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLink {\n");
    sb.append("    managerAccountId: ").append(toIndentedString(managerAccountId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    linkAccessPermission: ").append(toIndentedString(linkAccessPermission)).append("\n");
    sb.append("    audienceListSharingEnabled: ").append(toIndentedString(audienceListSharingEnabled)).append("\n");
    sb.append("    ownerShipType: ").append(toIndentedString(ownerShipType)).append("\n");
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


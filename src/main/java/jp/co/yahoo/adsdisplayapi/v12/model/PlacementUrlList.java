/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v12.model.PlacementUrlListServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v12.model.PlacementUrlListServiceUnknownDomainFlg;
import jp.co.yahoo.adsdisplayapi.v12.model.PlacementUrlListServiceUrlList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlListオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The objects to keep Placement Url Information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PlacementUrlList.JSON_PROPERTY_ACCOUNT_ID,
  PlacementUrlList.JSON_PROPERTY_DESCRIPTION,
  PlacementUrlList.JSON_PROPERTY_IS_REMOVE_DESCRIPTION,
  PlacementUrlList.JSON_PROPERTY_UNKNOWN_DOMAIN_FLG,
  PlacementUrlList.JSON_PROPERTY_URL_LIST_ID,
  PlacementUrlList.JSON_PROPERTY_URL_LIST_NAME,
  PlacementUrlList.JSON_PROPERTY_BRAND_SAFETY_DENY_LIST_FLG,
  PlacementUrlList.JSON_PROPERTY_URLS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlacementUrlList {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_REMOVE_DESCRIPTION = "isRemoveDescription";
  private PlacementUrlListServiceIsRemoveFlg isRemoveDescription;

  public static final String JSON_PROPERTY_UNKNOWN_DOMAIN_FLG = "unknownDomainFlg";
  private PlacementUrlListServiceUnknownDomainFlg unknownDomainFlg;

  public static final String JSON_PROPERTY_URL_LIST_ID = "urlListId";
  private Long urlListId;

  public static final String JSON_PROPERTY_URL_LIST_NAME = "urlListName";
  private String urlListName;

  public static final String JSON_PROPERTY_BRAND_SAFETY_DENY_LIST_FLG = "brandSafetyDenyListFlg";
  private Boolean brandSafetyDenyListFlg;

  public static final String JSON_PROPERTY_URLS = "urls";
  private List<PlacementUrlListServiceUrlList> urls;

  public PlacementUrlList() {
  }

  public PlacementUrlList accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
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


  public PlacementUrlList description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; urlリストの説明です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Url list description.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PlacementUrlList isRemoveDescription(PlacementUrlListServiceIsRemoveFlg isRemoveDescription) {
    
    this.isRemoveDescription = isRemoveDescription;
    return this;
  }

   /**
   * Get isRemoveDescription
   * @return isRemoveDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlacementUrlListServiceIsRemoveFlg getIsRemoveDescription() {
    return isRemoveDescription;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveDescription(PlacementUrlListServiceIsRemoveFlg isRemoveDescription) {
    this.isRemoveDescription = isRemoveDescription;
  }


  public PlacementUrlList unknownDomainFlg(PlacementUrlListServiceUnknownDomainFlg unknownDomainFlg) {
    
    this.unknownDomainFlg = unknownDomainFlg;
    return this;
  }

   /**
   * Get unknownDomainFlg
   * @return unknownDomainFlg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNKNOWN_DOMAIN_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlacementUrlListServiceUnknownDomainFlg getUnknownDomainFlg() {
    return unknownDomainFlg;
  }


  @JsonProperty(JSON_PROPERTY_UNKNOWN_DOMAIN_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnknownDomainFlg(PlacementUrlListServiceUnknownDomainFlg unknownDomainFlg) {
    this.unknownDomainFlg = unknownDomainFlg;
  }


  public PlacementUrlList urlListId(Long urlListId) {
    
    this.urlListId = urlListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; urlリストIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Url list ID. &lt;br&gt; This field is required in SET and REMOVE operation. &lt;/div&gt; 
   * @return urlListId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUrlListId() {
    return urlListId;
  }


  @JsonProperty(JSON_PROPERTY_URL_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlListId(Long urlListId) {
    this.urlListId = urlListId;
  }


  public PlacementUrlList urlListName(String urlListName) {
    
    this.urlListName = urlListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; urlリスト名です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Url list name. &lt;br&gt; This field is required in ADD operation, and is optional in SET operation. &lt;/div&gt; 
   * @return urlListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlListName() {
    return urlListName;
  }


  @JsonProperty(JSON_PROPERTY_URL_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlListName(String urlListName) {
    this.urlListName = urlListName;
  }


  public PlacementUrlList brandSafetyDenyListFlg(Boolean brandSafetyDenyListFlg) {
    
    this.brandSafetyDenyListFlg = brandSafetyDenyListFlg;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 除外専用リストかどうかのフラグです。&lt;br&gt; 除外専用リストには下記の制約があります。&lt;br&gt; ・１アカウントにつき1つ作成が可能です。&lt;br&gt; ・除外にのみ紐付け可能です。&lt;br&gt; このフィールドは、ADD時に省略可能(デフォルトの値はFALSE)、SET時に指定不可となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; A flag that indicates whether it is an exclusion list. &lt;br&gt; Exclusion list includes the following restrictions: &lt;br&gt; *Only one list can be created per account. &lt;br&gt; *Can be linked only to exclusion. &lt;br&gt; This field is optional in ADD operation (default value will be FALSE), and cannot be specified in SET operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;除外専用リストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Exclusion list.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;通常のurlリストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Standard URL list.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
   * @return brandSafetyDenyListFlg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_SAFETY_DENY_LIST_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBrandSafetyDenyListFlg() {
    return brandSafetyDenyListFlg;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_SAFETY_DENY_LIST_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandSafetyDenyListFlg(Boolean brandSafetyDenyListFlg) {
    this.brandSafetyDenyListFlg = brandSafetyDenyListFlg;
  }


  public PlacementUrlList urls(List<PlacementUrlListServiceUrlList> urls) {
    
    this.urls = urls;
    return this;
  }

  public PlacementUrlList addUrlsItem(PlacementUrlListServiceUrlList urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlacementUrlListServiceUrlList> getUrls() {
    return urls;
  }


  @JsonProperty(JSON_PROPERTY_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrls(List<PlacementUrlListServiceUrlList> urls) {
    this.urls = urls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlList placementUrlList = (PlacementUrlList) o;
    return Objects.equals(this.accountId, placementUrlList.accountId) &&
        Objects.equals(this.description, placementUrlList.description) &&
        Objects.equals(this.isRemoveDescription, placementUrlList.isRemoveDescription) &&
        Objects.equals(this.unknownDomainFlg, placementUrlList.unknownDomainFlg) &&
        Objects.equals(this.urlListId, placementUrlList.urlListId) &&
        Objects.equals(this.urlListName, placementUrlList.urlListName) &&
        Objects.equals(this.brandSafetyDenyListFlg, placementUrlList.brandSafetyDenyListFlg) &&
        Objects.equals(this.urls, placementUrlList.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, description, isRemoveDescription, unknownDomainFlg, urlListId, urlListName, brandSafetyDenyListFlg, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlList {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRemoveDescription: ").append(toIndentedString(isRemoveDescription)).append("\n");
    sb.append("    unknownDomainFlg: ").append(toIndentedString(unknownDomainFlg)).append("\n");
    sb.append("    urlListId: ").append(toIndentedString(urlListId)).append("\n");
    sb.append("    urlListName: ").append(toIndentedString(urlListName)).append("\n");
    sb.append("    brandSafetyDenyListFlg: ").append(toIndentedString(brandSafetyDenyListFlg)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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


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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v10.model.PlacementUrlIdeaServiceAdFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;An object that holds the placement Url information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。</div> <div lang=\"en\">An object that holds the placement Url information.</div> ")
@JsonPropertyOrder({
  PlacementUrlIdea.JSON_PROPERTY_KEYWORD,
  PlacementUrlIdea.JSON_PROPERTY_SITE_CATEGORY,
  PlacementUrlIdea.JSON_PROPERTY_SEARCH_URL,
  PlacementUrlIdea.JSON_PROPERTY_AD_FORMAT,
  PlacementUrlIdea.JSON_PROPERTY_DESKTOP_REACHES,
  PlacementUrlIdea.JSON_PROPERTY_DESKTOP_AD_REQUESTS,
  PlacementUrlIdea.JSON_PROPERTY_SMART_PHONE_REACHES,
  PlacementUrlIdea.JSON_PROPERTY_SMART_PHONE_AD_REQUESTS,
  PlacementUrlIdea.JSON_PROPERTY_TABLET_REACHES,
  PlacementUrlIdea.JSON_PROPERTY_TABLET_AD_REQUESTS
})
@JsonTypeName("PlacementUrlIdea")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlacementUrlIdea {
  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private String keyword;

  public static final String JSON_PROPERTY_SITE_CATEGORY = "siteCategory";
  private List<String> siteCategory = null;

  public static final String JSON_PROPERTY_SEARCH_URL = "searchUrl";
  private String searchUrl;

  public static final String JSON_PROPERTY_AD_FORMAT = "adFormat";
  private List<PlacementUrlIdeaServiceAdFormat> adFormat = null;

  public static final String JSON_PROPERTY_DESKTOP_REACHES = "desktopReaches";
  private Long desktopReaches;

  public static final String JSON_PROPERTY_DESKTOP_AD_REQUESTS = "desktopAdRequests";
  private Long desktopAdRequests;

  public static final String JSON_PROPERTY_SMART_PHONE_REACHES = "smartPhoneReaches";
  private Long smartPhoneReaches;

  public static final String JSON_PROPERTY_SMART_PHONE_AD_REQUESTS = "smartPhoneAdRequests";
  private Long smartPhoneAdRequests;

  public static final String JSON_PROPERTY_TABLET_REACHES = "tabletReaches";
  private Long tabletReaches;

  public static final String JSON_PROPERTY_TABLET_AD_REQUESTS = "tabletAdRequests";
  private Long tabletAdRequests;

  public PlacementUrlIdea() { 
  }

  public PlacementUrlIdea keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Keyword&lt;/div&gt; 
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索キーワードです。</div> <div lang=\"en\">Search Keyword</div> ")
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public PlacementUrlIdea siteCategory(List<String> siteCategory) {
    
    this.siteCategory = siteCategory;
    return this;
  }

  public PlacementUrlIdea addSiteCategoryItem(String siteCategoryItem) {
    if (this.siteCategory == null) {
      this.siteCategory = new ArrayList<>();
    }
    this.siteCategory.add(siteCategoryItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索カテゴリです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Category&lt;/div&gt; 
   * @return siteCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索カテゴリです。</div> <div lang=\"en\">Search Category</div> ")
  @JsonProperty(JSON_PROPERTY_SITE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSiteCategory() {
    return siteCategory;
  }


  @JsonProperty(JSON_PROPERTY_SITE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSiteCategory(List<String> siteCategory) {
    this.siteCategory = siteCategory;
  }


  public PlacementUrlIdea searchUrl(String searchUrl) {
    
    this.searchUrl = searchUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 取得URLです。&lt;br&gt; 不明なURLの場合　UNKNOWN_URLが入ります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;URL&lt;/div&gt; 
   * @return searchUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 取得URLです。<br> 不明なURLの場合　UNKNOWN_URLが入ります。 </div> <div lang=\"en\">URL</div> ")
  @JsonProperty(JSON_PROPERTY_SEARCH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchUrl() {
    return searchUrl;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
  }


  public PlacementUrlIdea adFormat(List<PlacementUrlIdeaServiceAdFormat> adFormat) {
    
    this.adFormat = adFormat;
    return this;
  }

  public PlacementUrlIdea addAdFormatItem(PlacementUrlIdeaServiceAdFormat adFormatItem) {
    if (this.adFormat == null) {
      this.adFormat = new ArrayList<>();
    }
    this.adFormat.add(adFormatItem);
    return this;
  }

   /**
   * Get adFormat
   * @return adFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlacementUrlIdeaServiceAdFormat> getAdFormat() {
    return adFormat;
  }


  @JsonProperty(JSON_PROPERTY_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdFormat(List<PlacementUrlIdeaServiceAdFormat> adFormat) {
    this.adFormat = adFormat;
  }


  public PlacementUrlIdea desktopReaches(Long desktopReaches) {
    
    this.desktopReaches = desktopReaches;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; PC でのリーチ数です。&lt;br&gt; ・1000未満の時は0が取得されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reach Number of PC(1000 In the case of 0)&lt;/div&gt; 
   * @return desktopReaches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> PC でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of PC(1000 In the case of 0)</div> ")
  @JsonProperty(JSON_PROPERTY_DESKTOP_REACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDesktopReaches() {
    return desktopReaches;
  }


  @JsonProperty(JSON_PROPERTY_DESKTOP_REACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesktopReaches(Long desktopReaches) {
    this.desktopReaches = desktopReaches;
  }


  public PlacementUrlIdea desktopAdRequests(Long desktopAdRequests) {
    
    this.desktopAdRequests = desktopAdRequests;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; PC でのADリクエスト数です。&lt;br&gt; ・1000未満の時は0が取得されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AD Number of PC(1000 In the case of 0)&lt;/div&gt; 
   * @return desktopAdRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> PC でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of PC(1000 In the case of 0)</div> ")
  @JsonProperty(JSON_PROPERTY_DESKTOP_AD_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDesktopAdRequests() {
    return desktopAdRequests;
  }


  @JsonProperty(JSON_PROPERTY_DESKTOP_AD_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesktopAdRequests(Long desktopAdRequests) {
    this.desktopAdRequests = desktopAdRequests;
  }


  public PlacementUrlIdea smartPhoneReaches(Long smartPhoneReaches) {
    
    this.smartPhoneReaches = smartPhoneReaches;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; SmartPhone でのリーチ数です。&lt;br&gt; ・1000未満の時は0が取得されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reach Number of SmartPhone (1000 In the case of 0)&lt;/div&gt; 
   * @return smartPhoneReaches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> SmartPhone でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of SmartPhone (1000 In the case of 0)</div> ")
  @JsonProperty(JSON_PROPERTY_SMART_PHONE_REACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSmartPhoneReaches() {
    return smartPhoneReaches;
  }


  @JsonProperty(JSON_PROPERTY_SMART_PHONE_REACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmartPhoneReaches(Long smartPhoneReaches) {
    this.smartPhoneReaches = smartPhoneReaches;
  }


  public PlacementUrlIdea smartPhoneAdRequests(Long smartPhoneAdRequests) {
    
    this.smartPhoneAdRequests = smartPhoneAdRequests;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; SmartPhone でのADリクエスト数です。&lt;br&gt; ・1000未満の時は0が取得されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AD Number of SmartPhone(1000 In the case of 0)&lt;/div&gt; 
   * @return smartPhoneAdRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> SmartPhone でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of SmartPhone(1000 In the case of 0)</div> ")
  @JsonProperty(JSON_PROPERTY_SMART_PHONE_AD_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSmartPhoneAdRequests() {
    return smartPhoneAdRequests;
  }


  @JsonProperty(JSON_PROPERTY_SMART_PHONE_AD_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmartPhoneAdRequests(Long smartPhoneAdRequests) {
    this.smartPhoneAdRequests = smartPhoneAdRequests;
  }


  public PlacementUrlIdea tabletReaches(Long tabletReaches) {
    
    this.tabletReaches = tabletReaches;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; Tablet でのリーチ数です。&lt;br&gt; ・1000未満の時は0が取得されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tablet(1000 In the case of 0)&lt;/div&gt; 
   * @return tabletReaches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> Tablet でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Tablet(1000 In the case of 0)</div> ")
  @JsonProperty(JSON_PROPERTY_TABLET_REACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTabletReaches() {
    return tabletReaches;
  }


  @JsonProperty(JSON_PROPERTY_TABLET_REACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabletReaches(Long tabletReaches) {
    this.tabletReaches = tabletReaches;
  }


  public PlacementUrlIdea tabletAdRequests(Long tabletAdRequests) {
    
    this.tabletAdRequests = tabletAdRequests;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; TabletでのADリクエスト数です。&lt;br&gt; ・1000未満の時は0が取得されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AD Number of Tablet (1000 In the case of 0)&lt;/div&gt; 
   * @return tabletAdRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> TabletでのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of Tablet (1000 In the case of 0)</div> ")
  @JsonProperty(JSON_PROPERTY_TABLET_AD_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTabletAdRequests() {
    return tabletAdRequests;
  }


  @JsonProperty(JSON_PROPERTY_TABLET_AD_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabletAdRequests(Long tabletAdRequests) {
    this.tabletAdRequests = tabletAdRequests;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlIdea placementUrlIdea = (PlacementUrlIdea) o;
    return Objects.equals(this.keyword, placementUrlIdea.keyword) &&
        Objects.equals(this.siteCategory, placementUrlIdea.siteCategory) &&
        Objects.equals(this.searchUrl, placementUrlIdea.searchUrl) &&
        Objects.equals(this.adFormat, placementUrlIdea.adFormat) &&
        Objects.equals(this.desktopReaches, placementUrlIdea.desktopReaches) &&
        Objects.equals(this.desktopAdRequests, placementUrlIdea.desktopAdRequests) &&
        Objects.equals(this.smartPhoneReaches, placementUrlIdea.smartPhoneReaches) &&
        Objects.equals(this.smartPhoneAdRequests, placementUrlIdea.smartPhoneAdRequests) &&
        Objects.equals(this.tabletReaches, placementUrlIdea.tabletReaches) &&
        Objects.equals(this.tabletAdRequests, placementUrlIdea.tabletAdRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, siteCategory, searchUrl, adFormat, desktopReaches, desktopAdRequests, smartPhoneReaches, smartPhoneAdRequests, tabletReaches, tabletAdRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlIdea {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    siteCategory: ").append(toIndentedString(siteCategory)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    adFormat: ").append(toIndentedString(adFormat)).append("\n");
    sb.append("    desktopReaches: ").append(toIndentedString(desktopReaches)).append("\n");
    sb.append("    desktopAdRequests: ").append(toIndentedString(desktopAdRequests)).append("\n");
    sb.append("    smartPhoneReaches: ").append(toIndentedString(smartPhoneReaches)).append("\n");
    sb.append("    smartPhoneAdRequests: ").append(toIndentedString(smartPhoneAdRequests)).append("\n");
    sb.append("    tabletReaches: ").append(toIndentedString(tabletReaches)).append("\n");
    sb.append("    tabletAdRequests: ").append(toIndentedString(tabletAdRequests)).append("\n");
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

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
import jp.co.yahoo.adsdisplayapi.v11.model.SearchKeywordIdeaServiceAvailabilityStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordIdeaオブジェクトは、サーチターゲティング対象キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordIdea object is keyword for search targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  SearchKeywordIdea.JSON_PROPERTY_DESKTOP_SEARCH_VOLUME,
  SearchKeywordIdea.JSON_PROPERTY_RELEASE_DATE,
  SearchKeywordIdea.JSON_PROPERTY_SEARCH_KEYWORD,
  SearchKeywordIdea.JSON_PROPERTY_SEARCH_KEYWORD_ID,
  SearchKeywordIdea.JSON_PROPERTY_SMART_PHONE_SEARCH_VOLUME,
  SearchKeywordIdea.JSON_PROPERTY_TABLET_SEARCH_VOLUME,
  SearchKeywordIdea.JSON_PROPERTY_CLOSE_DATE,
  SearchKeywordIdea.JSON_PROPERTY_AVAILABILITY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchKeywordIdea {
  public static final String JSON_PROPERTY_DESKTOP_SEARCH_VOLUME = "desktopSearchVolume";
  private Long desktopSearchVolume;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private String releaseDate;

  public static final String JSON_PROPERTY_SEARCH_KEYWORD = "searchKeyword";
  private String searchKeyword;

  public static final String JSON_PROPERTY_SEARCH_KEYWORD_ID = "searchKeywordId";
  private Long searchKeywordId;

  public static final String JSON_PROPERTY_SMART_PHONE_SEARCH_VOLUME = "smartPhoneSearchVolume";
  private Long smartPhoneSearchVolume;

  public static final String JSON_PROPERTY_TABLET_SEARCH_VOLUME = "tabletSearchVolume";
  private Long tabletSearchVolume;

  public static final String JSON_PROPERTY_CLOSE_DATE = "closeDate";
  private String closeDate;

  public static final String JSON_PROPERTY_AVAILABILITY_STATUS = "availabilityStatus";
  private SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus;

  public SearchKeywordIdea() {
  }

  public SearchKeywordIdea desktopSearchVolume(Long desktopSearchVolume) {
    
    this.desktopSearchVolume = desktopSearchVolume;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; PCでのリーチ数です。&lt;br&gt; ※1000件未満の場合は&lt;br&gt; 0が取得されます。&lt;br&gt; ※サーチキーワードの停止日以降はnullが返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reach numbers on PC.&lt;br&gt; *If it is less than 1000 times, the value &amp;#34;0&amp;#34; will be responded.&lt;br&gt; *After the stop date of search keyword, null will be returned. &lt;/div&gt; 
   * @return desktopSearchVolume
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESKTOP_SEARCH_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDesktopSearchVolume() {
    return desktopSearchVolume;
  }


  @JsonProperty(JSON_PROPERTY_DESKTOP_SEARCH_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesktopSearchVolume(Long desktopSearchVolume) {
    this.desktopSearchVolume = desktopSearchVolume;
  }


  public SearchKeywordIdea releaseDate(String releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サーチキーワード追加日です。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Additional date of keyword.&lt;br&gt; * Format: yyyyMMdd&lt;/div&gt; 
   * @return releaseDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }


  public SearchKeywordIdea searchKeyword(String searchKeyword) {
    
    this.searchKeyword = searchKeyword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サーチキーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search keyword.&lt;/div&gt; 
   * @return searchKeyword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchKeyword() {
    return searchKeyword;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeyword(String searchKeyword) {
    this.searchKeyword = searchKeyword;
  }


  public SearchKeywordIdea searchKeywordId(Long searchKeywordId) {
    
    this.searchKeywordId = searchKeywordId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サーチキーワードIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search keyword ID.&lt;/div&gt; 
   * @return searchKeywordId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSearchKeywordId() {
    return searchKeywordId;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeywordId(Long searchKeywordId) {
    this.searchKeywordId = searchKeywordId;
  }


  public SearchKeywordIdea smartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; スマートフォンでのリーチ数です。&lt;br&gt; ※1000件未満の場合は&lt;br&gt; 0が取得されます。&lt;br&gt; ※サーチキーワードの停止日以降はnullが返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reach numbers on Smartphone.&lt;br&gt; *If it is less than 1000 times, the value &amp;#34;0&amp;#34; will be responded.&lt;br&gt; *After the stop date of search keyword, null will be returned. &lt;/div&gt; 
   * @return smartPhoneSearchVolume
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMART_PHONE_SEARCH_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSmartPhoneSearchVolume() {
    return smartPhoneSearchVolume;
  }


  @JsonProperty(JSON_PROPERTY_SMART_PHONE_SEARCH_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
  }


  public SearchKeywordIdea tabletSearchVolume(Long tabletSearchVolume) {
    
    this.tabletSearchVolume = tabletSearchVolume;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; タブレットでのリーチ数です。&lt;br&gt; ※1000件未満の場合は&lt;br&gt; 0が取得されます。&lt;br&gt; ※サーチキーワードの停止日以降はnullが返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reach numbers on Tablet.&lt;br&gt; *If it is less than 1000 times, the value &amp;#34;0&amp;#34; will be responded.&lt;br&gt; *After the stop date of search keyword, null will be returned. &lt;/div&gt; 
   * @return tabletSearchVolume
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLET_SEARCH_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTabletSearchVolume() {
    return tabletSearchVolume;
  }


  @JsonProperty(JSON_PROPERTY_TABLET_SEARCH_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabletSearchVolume(Long tabletSearchVolume) {
    this.tabletSearchVolume = tabletSearchVolume;
  }


  public SearchKeywordIdea closeDate(String closeDate) {
    
    this.closeDate = closeDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サーチキーワード停止日です。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Stop date of keyword.&lt;br&gt; * Format: yyyyMMdd&lt;/div&gt; 
   * @return closeDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloseDate() {
    return closeDate;
  }


  @JsonProperty(JSON_PROPERTY_CLOSE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
  }


  public SearchKeywordIdea availabilityStatus(SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus) {
    
    this.availabilityStatus = availabilityStatus;
    return this;
  }

   /**
   * Get availabilityStatus
   * @return availabilityStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchKeywordIdeaServiceAvailabilityStatus getAvailabilityStatus() {
    return availabilityStatus;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityStatus(SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordIdea searchKeywordIdea = (SearchKeywordIdea) o;
    return Objects.equals(this.desktopSearchVolume, searchKeywordIdea.desktopSearchVolume) &&
        Objects.equals(this.releaseDate, searchKeywordIdea.releaseDate) &&
        Objects.equals(this.searchKeyword, searchKeywordIdea.searchKeyword) &&
        Objects.equals(this.searchKeywordId, searchKeywordIdea.searchKeywordId) &&
        Objects.equals(this.smartPhoneSearchVolume, searchKeywordIdea.smartPhoneSearchVolume) &&
        Objects.equals(this.tabletSearchVolume, searchKeywordIdea.tabletSearchVolume) &&
        Objects.equals(this.closeDate, searchKeywordIdea.closeDate) &&
        Objects.equals(this.availabilityStatus, searchKeywordIdea.availabilityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktopSearchVolume, releaseDate, searchKeyword, searchKeywordId, smartPhoneSearchVolume, tabletSearchVolume, closeDate, availabilityStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordIdea {\n");
    sb.append("    desktopSearchVolume: ").append(toIndentedString(desktopSearchVolume)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
    sb.append("    searchKeywordId: ").append(toIndentedString(searchKeywordId)).append("\n");
    sb.append("    smartPhoneSearchVolume: ").append(toIndentedString(smartPhoneSearchVolume)).append("\n");
    sb.append("    tabletSearchVolume: ").append(toIndentedString(tabletSearchVolume)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    availabilityStatus: ").append(toIndentedString(availabilityStatus)).append("\n");
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


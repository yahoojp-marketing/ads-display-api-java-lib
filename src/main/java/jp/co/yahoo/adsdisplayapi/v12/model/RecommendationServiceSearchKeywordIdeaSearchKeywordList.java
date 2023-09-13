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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;追加を推奨するサーチキーワードに関する詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This describes the detailed information of recommended search keyword to add.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_RECOMMENDATION_ID,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_LIST_ID,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_LIST_NAME,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_RECENCY,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_FREQUENCY,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_RECOMMENDED_SEARCH_KEYWORD_ID,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_RECOMMENDED_SEARCH_KEYWORD,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_DESKTOP_SEARCH_VOLUME,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_SMART_PHONE_SEARCH_VOLUME,
  RecommendationServiceSearchKeywordIdeaSearchKeywordList.JSON_PROPERTY_TABLET_SEARCH_VOLUME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceSearchKeywordIdeaSearchKeywordList {
  public static final String JSON_PROPERTY_RECOMMENDATION_ID = "recommendationId";
  private Long recommendationId;

  public static final String JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_LIST_ID = "currentSearchKeywordListId";
  private Long currentSearchKeywordListId;

  public static final String JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_LIST_NAME = "currentSearchKeywordListName";
  private String currentSearchKeywordListName;

  public static final String JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_RECENCY = "currentSearchKeywordRecency";
  private String currentSearchKeywordRecency;

  public static final String JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_FREQUENCY = "currentSearchKeywordFrequency";
  private String currentSearchKeywordFrequency;

  public static final String JSON_PROPERTY_RECOMMENDED_SEARCH_KEYWORD_ID = "recommendedSearchKeywordId";
  private Long recommendedSearchKeywordId;

  public static final String JSON_PROPERTY_RECOMMENDED_SEARCH_KEYWORD = "recommendedSearchKeyword";
  private String recommendedSearchKeyword;

  public static final String JSON_PROPERTY_DESKTOP_SEARCH_VOLUME = "desktopSearchVolume";
  private Long desktopSearchVolume;

  public static final String JSON_PROPERTY_SMART_PHONE_SEARCH_VOLUME = "smartPhoneSearchVolume";
  private Long smartPhoneSearchVolume;

  public static final String JSON_PROPERTY_TABLET_SEARCH_VOLUME = "tabletSearchVolume";
  private Long tabletSearchVolume;

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList() {
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendationId(Long recommendationId) {
    
    this.recommendationId = recommendationId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 最適化提案IDです。&lt;br&gt; optimizationScoreLiftがnullでない場合は、1つのキャンペーンに関する提案に共通の最適化提案IDが割り当てられます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommendation ID.&lt;br&gt; When optimizationScoreLift isn&#39;t null, the system will assign a common recommendation ID to the suggestion for the campaign. &lt;/div&gt; 
   * @return recommendationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRecommendationId() {
    return recommendationId;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
  }


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordListId(Long currentSearchKeywordListId) {
    
    this.currentSearchKeywordListId = currentSearchKeywordListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サーチキーワードリストIDです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Search keyword list ID. &lt;/div&gt; 
   * @return currentSearchKeywordListId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentSearchKeywordListId() {
    return currentSearchKeywordListId;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentSearchKeywordListId(Long currentSearchKeywordListId) {
    this.currentSearchKeywordListId = currentSearchKeywordListId;
  }


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordListName(String currentSearchKeywordListName) {
    
    this.currentSearchKeywordListName = currentSearchKeywordListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サーチキーワードリスト名です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Search keyword list name. &lt;/div&gt; 
   * @return currentSearchKeywordListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentSearchKeywordListName() {
    return currentSearchKeywordListName;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentSearchKeywordListName(String currentSearchKeywordListName) {
    this.currentSearchKeywordListName = currentSearchKeywordListName;
  }


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordRecency(String currentSearchKeywordRecency) {
    
    this.currentSearchKeywordRecency = currentSearchKeywordRecency;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サーチキーワードの有効期間を表します。&lt;br&gt; 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordRecencyオブジェクトをご参照ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recency of search keyword list.&lt;br&gt; See the SearchKeywordListServiceKeywordRecency in SearchKeywordListService to learn about return value. &lt;/div&gt; 
   * @return currentSearchKeywordRecency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_RECENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentSearchKeywordRecency() {
    return currentSearchKeywordRecency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_RECENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentSearchKeywordRecency(String currentSearchKeywordRecency) {
    this.currentSearchKeywordRecency = currentSearchKeywordRecency;
  }


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordFrequency(String currentSearchKeywordFrequency) {
    
    this.currentSearchKeywordFrequency = currentSearchKeywordFrequency;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サーチキーワードの検索回数を表します。&lt;br&gt; 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordFrequencyオブジェクトをご参照ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Frequency of search keyword list.&lt;br&gt; See the SearchKeywordListServiceKeywordFrequency in SearchKeywordListService to learn about return value. &lt;/div&gt; 
   * @return currentSearchKeywordFrequency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentSearchKeywordFrequency() {
    return currentSearchKeywordFrequency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SEARCH_KEYWORD_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentSearchKeywordFrequency(String currentSearchKeywordFrequency) {
    this.currentSearchKeywordFrequency = currentSearchKeywordFrequency;
  }


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendedSearchKeywordId(Long recommendedSearchKeywordId) {
    
    this.recommendedSearchKeywordId = recommendedSearchKeywordId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 推奨するサーチキーワードIDです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommended search keyword ID. &lt;/div&gt; 
   * @return recommendedSearchKeywordId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_SEARCH_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRecommendedSearchKeywordId() {
    return recommendedSearchKeywordId;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDED_SEARCH_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendedSearchKeywordId(Long recommendedSearchKeywordId) {
    this.recommendedSearchKeywordId = recommendedSearchKeywordId;
  }


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendedSearchKeyword(String recommendedSearchKeyword) {
    
    this.recommendedSearchKeyword = recommendedSearchKeyword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 推奨するサーチキーワードです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommended search keyword. &lt;/div&gt; 
   * @return recommendedSearchKeyword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_SEARCH_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecommendedSearchKeyword() {
    return recommendedSearchKeyword;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDED_SEARCH_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendedSearchKeyword(String recommendedSearchKeyword) {
    this.recommendedSearchKeyword = recommendedSearchKeyword;
  }


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList desktopSearchVolume(Long desktopSearchVolume) {
    
    this.desktopSearchVolume = desktopSearchVolume;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 推奨するサーチキーワードのPCでのリーチ数です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Number of reach in PC with recommended search keyword. &lt;/div&gt; 
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


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList smartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 推奨するサーチキーワードのSmartPhoneでのリーチ数です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Number of Reach in SmartPhone with recommended search keyword. &lt;/div&gt; 
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


  public RecommendationServiceSearchKeywordIdeaSearchKeywordList tabletSearchVolume(Long tabletSearchVolume) {
    
    this.tabletSearchVolume = tabletSearchVolume;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 推奨するサーチキーワードのTabletでのリーチ数です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Number of Reach in Tablet with recommended search keyword. &lt;/div&gt; 
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendationServiceSearchKeywordIdeaSearchKeywordList = (RecommendationServiceSearchKeywordIdeaSearchKeywordList) o;
    return Objects.equals(this.recommendationId, recommendationServiceSearchKeywordIdeaSearchKeywordList.recommendationId) &&
        Objects.equals(this.currentSearchKeywordListId, recommendationServiceSearchKeywordIdeaSearchKeywordList.currentSearchKeywordListId) &&
        Objects.equals(this.currentSearchKeywordListName, recommendationServiceSearchKeywordIdeaSearchKeywordList.currentSearchKeywordListName) &&
        Objects.equals(this.currentSearchKeywordRecency, recommendationServiceSearchKeywordIdeaSearchKeywordList.currentSearchKeywordRecency) &&
        Objects.equals(this.currentSearchKeywordFrequency, recommendationServiceSearchKeywordIdeaSearchKeywordList.currentSearchKeywordFrequency) &&
        Objects.equals(this.recommendedSearchKeywordId, recommendationServiceSearchKeywordIdeaSearchKeywordList.recommendedSearchKeywordId) &&
        Objects.equals(this.recommendedSearchKeyword, recommendationServiceSearchKeywordIdeaSearchKeywordList.recommendedSearchKeyword) &&
        Objects.equals(this.desktopSearchVolume, recommendationServiceSearchKeywordIdeaSearchKeywordList.desktopSearchVolume) &&
        Objects.equals(this.smartPhoneSearchVolume, recommendationServiceSearchKeywordIdeaSearchKeywordList.smartPhoneSearchVolume) &&
        Objects.equals(this.tabletSearchVolume, recommendationServiceSearchKeywordIdeaSearchKeywordList.tabletSearchVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, currentSearchKeywordListId, currentSearchKeywordListName, currentSearchKeywordRecency, currentSearchKeywordFrequency, recommendedSearchKeywordId, recommendedSearchKeyword, desktopSearchVolume, smartPhoneSearchVolume, tabletSearchVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceSearchKeywordIdeaSearchKeywordList {\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    currentSearchKeywordListId: ").append(toIndentedString(currentSearchKeywordListId)).append("\n");
    sb.append("    currentSearchKeywordListName: ").append(toIndentedString(currentSearchKeywordListName)).append("\n");
    sb.append("    currentSearchKeywordRecency: ").append(toIndentedString(currentSearchKeywordRecency)).append("\n");
    sb.append("    currentSearchKeywordFrequency: ").append(toIndentedString(currentSearchKeywordFrequency)).append("\n");
    sb.append("    recommendedSearchKeywordId: ").append(toIndentedString(recommendedSearchKeywordId)).append("\n");
    sb.append("    recommendedSearchKeyword: ").append(toIndentedString(recommendedSearchKeyword)).append("\n");
    sb.append("    desktopSearchVolume: ").append(toIndentedString(desktopSearchVolume)).append("\n");
    sb.append("    smartPhoneSearchVolume: ").append(toIndentedString(smartPhoneSearchVolume)).append("\n");
    sb.append("    tabletSearchVolume: ").append(toIndentedString(tabletSearchVolume)).append("\n");
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


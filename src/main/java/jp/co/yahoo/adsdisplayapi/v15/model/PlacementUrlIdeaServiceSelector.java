/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The objects to keep get method search conditions (execution parameter).&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PlacementUrlIdeaServiceSelector.JSON_PROPERTY_KEYWORD,
  PlacementUrlIdeaServiceSelector.JSON_PROPERTY_SITE_CATEGORIES,
  PlacementUrlIdeaServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  PlacementUrlIdeaServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlacementUrlIdeaServiceSelector {
  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private String keyword;

  public static final String JSON_PROPERTY_SITE_CATEGORIES = "siteCategories";
  private List<String> siteCategories;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public PlacementUrlIdeaServiceSelector() {
  }

  public PlacementUrlIdeaServiceSelector keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 検索キーワードの配列です。&lt;br&gt; ・URLを検索するためのキーワードです。&lt;br&gt; ・部分一致です。&lt;br&gt; ・スペース区切りでAND検索です。&lt;br&gt; ・最大文字数250です。&lt;br&gt; ・スペース区切りでの単語数は最大10個です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Array of Search keyword.&lt;br&gt; ・Keyword to search the URL&lt;br&gt; ・Broad match&lt;br&gt; ・Search all keywords (AND), separated by spaces&lt;br&gt; ・Maximum of 250 characters&lt;br&gt; ・Maximum of 10 spaces to separate the words &lt;/div&gt; 
   * @return keyword
  **/
  @jakarta.annotation.Nullable
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


  public PlacementUrlIdeaServiceSelector siteCategories(List<String> siteCategories) {
    
    this.siteCategories = siteCategories;
    return this;
  }

  public PlacementUrlIdeaServiceSelector addSiteCategoriesItem(String siteCategoriesItem) {
    if (this.siteCategories == null) {
      this.siteCategories = new ArrayList<>();
    }
    this.siteCategories.add(siteCategoriesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カテゴリの配列です。&lt;br&gt; ・URLのカテゴリです。&lt;br&gt; ・完全一致です。&lt;br&gt; ・複数指定でOR検索です。&lt;br&gt; ・TC-SC-xxxxxxで現される規定値です。&lt;br&gt; ・DicitonaryServiceから返ってくるTC-SC-xxxxxxをそのまま指定です。&lt;br&gt; ・最大50件です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Array of categories.&lt;br&gt; ・Category of URL&lt;br&gt; ・Exact match&lt;br&gt; ・Search multiple specific keywords (OR)&lt;br&gt; ・From value: TC-SC-xxxxxx&lt;br&gt; ・Choose the TC-SC-xxxxxx value from DictionaryService&lt;br&gt; ・Maximum of 50 cases &lt;/div&gt; 
   * @return siteCategories
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SITE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSiteCategories() {
    return siteCategories;
  }


  @JsonProperty(JSON_PROPERTY_SITE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSiteCategories(List<String> siteCategories) {
    this.siteCategories = siteCategories;
  }


  public PlacementUrlIdeaServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public PlacementUrlIdeaServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 0.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlIdeaServiceSelector placementUrlIdeaServiceSelector = (PlacementUrlIdeaServiceSelector) o;
    return Objects.equals(this.keyword, placementUrlIdeaServiceSelector.keyword) &&
        Objects.equals(this.siteCategories, placementUrlIdeaServiceSelector.siteCategories) &&
        Objects.equals(this.numberResults, placementUrlIdeaServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, placementUrlIdeaServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, siteCategories, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlIdeaServiceSelector {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    siteCategories: ").append(toIndentedString(siteCategories)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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


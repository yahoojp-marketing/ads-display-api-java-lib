package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;追加を推奨するサーチキーワードに関する詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This describes the detailed information of recommended search keyword to add.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">追加を推奨するサーチキーワードに関する詳細情報を表します。</div> <div lang=\"en\">This describes the detailed information of recommended search keyword to add.</div> ")

public class RecommendationServiceSearchKeywordIdeaSearchKeywordList   {
  @JsonProperty("recommendationId")
  private JsonNullable<Long> recommendationId = JsonNullable.undefined();

  @JsonProperty("currentSearchKeywordListId")
  private JsonNullable<Long> currentSearchKeywordListId = JsonNullable.undefined();

  @JsonProperty("currentSearchKeywordListName")
  private JsonNullable<String> currentSearchKeywordListName = JsonNullable.undefined();

  @JsonProperty("currentSearchKeywordRecency")
  private JsonNullable<String> currentSearchKeywordRecency = JsonNullable.undefined();

  @JsonProperty("currentSearchKeywordFrequency")
  private JsonNullable<String> currentSearchKeywordFrequency = JsonNullable.undefined();

  @JsonProperty("recommendedSearchKeywordId")
  private JsonNullable<Long> recommendedSearchKeywordId = JsonNullable.undefined();

  @JsonProperty("recommendedSearchKeyword")
  private JsonNullable<String> recommendedSearchKeyword = JsonNullable.undefined();

  @JsonProperty("desktopSearchVolume")
  private JsonNullable<Long> desktopSearchVolume = JsonNullable.undefined();

  @JsonProperty("smartPhoneSearchVolume")
  private JsonNullable<Long> smartPhoneSearchVolume = JsonNullable.undefined();

  @JsonProperty("tabletSearchVolume")
  private JsonNullable<Long> tabletSearchVolume = JsonNullable.undefined();

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendationId(Long recommendationId) {
    this.recommendationId = JsonNullable.of(recommendationId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> 
   * @return recommendationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> ")


  public JsonNullable<Long> getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(JsonNullable<Long> recommendationId) {
    this.recommendationId = recommendationId;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordListId(Long currentSearchKeywordListId) {
    this.currentSearchKeywordListId = JsonNullable.of(currentSearchKeywordListId);
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードリストIDです。 </div> <div lang=\"en\"> Search keyword list ID. </div> 
   * @return currentSearchKeywordListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリストIDです。 </div> <div lang=\"en\"> Search keyword list ID. </div> ")


  public JsonNullable<Long> getCurrentSearchKeywordListId() {
    return currentSearchKeywordListId;
  }

  public void setCurrentSearchKeywordListId(JsonNullable<Long> currentSearchKeywordListId) {
    this.currentSearchKeywordListId = currentSearchKeywordListId;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordListName(String currentSearchKeywordListName) {
    this.currentSearchKeywordListName = JsonNullable.of(currentSearchKeywordListName);
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードリスト名です。 </div> <div lang=\"en\"> Search keyword list name. </div> 
   * @return currentSearchKeywordListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリスト名です。 </div> <div lang=\"en\"> Search keyword list name. </div> ")


  public JsonNullable<String> getCurrentSearchKeywordListName() {
    return currentSearchKeywordListName;
  }

  public void setCurrentSearchKeywordListName(JsonNullable<String> currentSearchKeywordListName) {
    this.currentSearchKeywordListName = currentSearchKeywordListName;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordRecency(String currentSearchKeywordRecency) {
    this.currentSearchKeywordRecency = JsonNullable.of(currentSearchKeywordRecency);
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードの有効期間を表します。<br> 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordRecencyオブジェクトをご参照ください。 </div> <div lang=\"en\"> Recency of search keyword list.<br> See the SearchKeywordListServiceKeywordRecency in SearchKeywordListService to learn about return value. </div> 
   * @return currentSearchKeywordRecency
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードの有効期間を表します。<br> 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordRecencyオブジェクトをご参照ください。 </div> <div lang=\"en\"> Recency of search keyword list.<br> See the SearchKeywordListServiceKeywordRecency in SearchKeywordListService to learn about return value. </div> ")


  public JsonNullable<String> getCurrentSearchKeywordRecency() {
    return currentSearchKeywordRecency;
  }

  public void setCurrentSearchKeywordRecency(JsonNullable<String> currentSearchKeywordRecency) {
    this.currentSearchKeywordRecency = currentSearchKeywordRecency;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordFrequency(String currentSearchKeywordFrequency) {
    this.currentSearchKeywordFrequency = JsonNullable.of(currentSearchKeywordFrequency);
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードの検索回数を表します。<br> 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordFrequencyオブジェクトをご参照ください。 </div> <div lang=\"en\"> Frequency of search keyword list.<br> See the SearchKeywordListServiceKeywordFrequency in SearchKeywordListService to learn about return value. </div> 
   * @return currentSearchKeywordFrequency
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードの検索回数を表します。<br> 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordFrequencyオブジェクトをご参照ください。 </div> <div lang=\"en\"> Frequency of search keyword list.<br> See the SearchKeywordListServiceKeywordFrequency in SearchKeywordListService to learn about return value. </div> ")


  public JsonNullable<String> getCurrentSearchKeywordFrequency() {
    return currentSearchKeywordFrequency;
  }

  public void setCurrentSearchKeywordFrequency(JsonNullable<String> currentSearchKeywordFrequency) {
    this.currentSearchKeywordFrequency = currentSearchKeywordFrequency;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendedSearchKeywordId(Long recommendedSearchKeywordId) {
    this.recommendedSearchKeywordId = JsonNullable.of(recommendedSearchKeywordId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードIDです。 </div> <div lang=\"en\"> Recommended search keyword ID. </div> 
   * @return recommendedSearchKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードIDです。 </div> <div lang=\"en\"> Recommended search keyword ID. </div> ")


  public JsonNullable<Long> getRecommendedSearchKeywordId() {
    return recommendedSearchKeywordId;
  }

  public void setRecommendedSearchKeywordId(JsonNullable<Long> recommendedSearchKeywordId) {
    this.recommendedSearchKeywordId = recommendedSearchKeywordId;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendedSearchKeyword(String recommendedSearchKeyword) {
    this.recommendedSearchKeyword = JsonNullable.of(recommendedSearchKeyword);
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードです。 </div> <div lang=\"en\"> Recommended search keyword. </div> 
   * @return recommendedSearchKeyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードです。 </div> <div lang=\"en\"> Recommended search keyword. </div> ")


  public JsonNullable<String> getRecommendedSearchKeyword() {
    return recommendedSearchKeyword;
  }

  public void setRecommendedSearchKeyword(JsonNullable<String> recommendedSearchKeyword) {
    this.recommendedSearchKeyword = recommendedSearchKeyword;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList desktopSearchVolume(Long desktopSearchVolume) {
    this.desktopSearchVolume = JsonNullable.of(desktopSearchVolume);
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードのPCでのリーチ数です。 </div> <div lang=\"en\"> Number of reach in PC with recommended search keyword. </div> 
   * @return desktopSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードのPCでのリーチ数です。 </div> <div lang=\"en\"> Number of reach in PC with recommended search keyword. </div> ")


  public JsonNullable<Long> getDesktopSearchVolume() {
    return desktopSearchVolume;
  }

  public void setDesktopSearchVolume(JsonNullable<Long> desktopSearchVolume) {
    this.desktopSearchVolume = desktopSearchVolume;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList smartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = JsonNullable.of(smartPhoneSearchVolume);
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードのSmartPhoneでのリーチ数です。 </div> <div lang=\"en\"> Number of Reach in SmartPhone with recommended search keyword. </div> 
   * @return smartPhoneSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードのSmartPhoneでのリーチ数です。 </div> <div lang=\"en\"> Number of Reach in SmartPhone with recommended search keyword. </div> ")


  public JsonNullable<Long> getSmartPhoneSearchVolume() {
    return smartPhoneSearchVolume;
  }

  public void setSmartPhoneSearchVolume(JsonNullable<Long> smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList tabletSearchVolume(Long tabletSearchVolume) {
    this.tabletSearchVolume = JsonNullable.of(tabletSearchVolume);
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードのTabletでのリーチ数です。 </div> <div lang=\"en\"> Number of Reach in Tablet with recommended search keyword. </div> 
   * @return tabletSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードのTabletでのリーチ数です。 </div> <div lang=\"en\"> Number of Reach in Tablet with recommended search keyword. </div> ")


  public JsonNullable<Long> getTabletSearchVolume() {
    return tabletSearchVolume;
  }

  public void setTabletSearchVolume(JsonNullable<Long> tabletSearchVolume) {
    this.tabletSearchVolume = tabletSearchVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


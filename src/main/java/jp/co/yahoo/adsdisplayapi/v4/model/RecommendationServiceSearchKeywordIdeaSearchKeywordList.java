package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;追加を推奨するサーチキーワードに関する詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This describes the detailed information of recommended search keyword to add.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">追加を推奨するサーチキーワードに関する詳細情報を表します。</div> <div lang=\"en\">This describes the detailed information of recommended search keyword to add.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceSearchKeywordIdeaSearchKeywordList   {
  @JsonProperty("recommendationId")
  private Long recommendationId = null;

  @JsonProperty("currentSearchKeywordListId")
  private Long currentSearchKeywordListId = null;

  @JsonProperty("currentSearchKeywordListName")
  private String currentSearchKeywordListName = null;

  @JsonProperty("currentSearchKeywordRecency")
  private String currentSearchKeywordRecency = null;

  @JsonProperty("currentSearchKeywordFrequency")
  private String currentSearchKeywordFrequency = null;

  @JsonProperty("recommendedSearchKeywordId")
  private Long recommendedSearchKeywordId = null;

  @JsonProperty("recommendedSearchKeyword")
  private String recommendedSearchKeyword = null;

  @JsonProperty("desktopSearchVolume")
  private Long desktopSearchVolume = null;

  @JsonProperty("smartPhoneSearchVolume")
  private Long smartPhoneSearchVolume = null;

  @JsonProperty("tabletSearchVolume")
  private Long tabletSearchVolume = null;

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> 
   * @return recommendationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> ")


  public Long getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordListId(Long currentSearchKeywordListId) {
    this.currentSearchKeywordListId = currentSearchKeywordListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードリストIDです。 </div> <div lang=\"en\"> Search keyword list ID. </div> 
   * @return currentSearchKeywordListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリストIDです。 </div> <div lang=\"en\"> Search keyword list ID. </div> ")


  public Long getCurrentSearchKeywordListId() {
    return currentSearchKeywordListId;
  }

  public void setCurrentSearchKeywordListId(Long currentSearchKeywordListId) {
    this.currentSearchKeywordListId = currentSearchKeywordListId;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordListName(String currentSearchKeywordListName) {
    this.currentSearchKeywordListName = currentSearchKeywordListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードリスト名です。 </div> <div lang=\"en\"> Search keyword list name. </div> 
   * @return currentSearchKeywordListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリスト名です。 </div> <div lang=\"en\"> Search keyword list name. </div> ")


  public String getCurrentSearchKeywordListName() {
    return currentSearchKeywordListName;
  }

  public void setCurrentSearchKeywordListName(String currentSearchKeywordListName) {
    this.currentSearchKeywordListName = currentSearchKeywordListName;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordRecency(String currentSearchKeywordRecency) {
    this.currentSearchKeywordRecency = currentSearchKeywordRecency;
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードの有効期間を表します。<br> 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordRecencyオブジェクトをご参照ください。 </div> <div lang=\"en\"> Recency of search keyword list.<br> See the SearchKeywordListServiceKeywordRecency in SearchKeywordListService to learn about return value. </div> 
   * @return currentSearchKeywordRecency
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードの有効期間を表します。<br> 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordRecencyオブジェクトをご参照ください。 </div> <div lang=\"en\"> Recency of search keyword list.<br> See the SearchKeywordListServiceKeywordRecency in SearchKeywordListService to learn about return value. </div> ")


  public String getCurrentSearchKeywordRecency() {
    return currentSearchKeywordRecency;
  }

  public void setCurrentSearchKeywordRecency(String currentSearchKeywordRecency) {
    this.currentSearchKeywordRecency = currentSearchKeywordRecency;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList currentSearchKeywordFrequency(String currentSearchKeywordFrequency) {
    this.currentSearchKeywordFrequency = currentSearchKeywordFrequency;
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードの検索回数を表します。<br> 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordFrequencyオブジェクトをご参照ください。 </div> <div lang=\"en\"> Frequency of search keyword list.<br> See the SearchKeywordListServiceKeywordFrequency in SearchKeywordListService to learn about return value. </div> 
   * @return currentSearchKeywordFrequency
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードの検索回数を表します。<br> 返却される値については、SearchKeywordListServiceのSearchKeywordListServiceKeywordFrequencyオブジェクトをご参照ください。 </div> <div lang=\"en\"> Frequency of search keyword list.<br> See the SearchKeywordListServiceKeywordFrequency in SearchKeywordListService to learn about return value. </div> ")


  public String getCurrentSearchKeywordFrequency() {
    return currentSearchKeywordFrequency;
  }

  public void setCurrentSearchKeywordFrequency(String currentSearchKeywordFrequency) {
    this.currentSearchKeywordFrequency = currentSearchKeywordFrequency;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendedSearchKeywordId(Long recommendedSearchKeywordId) {
    this.recommendedSearchKeywordId = recommendedSearchKeywordId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードIDです。 </div> <div lang=\"en\"> Recommended search keyword ID. </div> 
   * @return recommendedSearchKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードIDです。 </div> <div lang=\"en\"> Recommended search keyword ID. </div> ")


  public Long getRecommendedSearchKeywordId() {
    return recommendedSearchKeywordId;
  }

  public void setRecommendedSearchKeywordId(Long recommendedSearchKeywordId) {
    this.recommendedSearchKeywordId = recommendedSearchKeywordId;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList recommendedSearchKeyword(String recommendedSearchKeyword) {
    this.recommendedSearchKeyword = recommendedSearchKeyword;
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードです。 </div> <div lang=\"en\"> Recommended search keyword. </div> 
   * @return recommendedSearchKeyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードです。 </div> <div lang=\"en\"> Recommended search keyword. </div> ")


  public String getRecommendedSearchKeyword() {
    return recommendedSearchKeyword;
  }

  public void setRecommendedSearchKeyword(String recommendedSearchKeyword) {
    this.recommendedSearchKeyword = recommendedSearchKeyword;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList desktopSearchVolume(Long desktopSearchVolume) {
    this.desktopSearchVolume = desktopSearchVolume;
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードのPCでのリーチ数です。 </div> <div lang=\"en\"> Number of reach in PC with recommended search keyword. </div> 
   * @return desktopSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードのPCでのリーチ数です。 </div> <div lang=\"en\"> Number of reach in PC with recommended search keyword. </div> ")


  public Long getDesktopSearchVolume() {
    return desktopSearchVolume;
  }

  public void setDesktopSearchVolume(Long desktopSearchVolume) {
    this.desktopSearchVolume = desktopSearchVolume;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList smartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードのSmartPhoneでのリーチ数です。 </div> <div lang=\"en\"> Number of Reach in SmartPhone with recommended search keyword. </div> 
   * @return smartPhoneSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードのSmartPhoneでのリーチ数です。 </div> <div lang=\"en\"> Number of Reach in SmartPhone with recommended search keyword. </div> ")


  public Long getSmartPhoneSearchVolume() {
    return smartPhoneSearchVolume;
  }

  public void setSmartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
  }

  public RecommendationServiceSearchKeywordIdeaSearchKeywordList tabletSearchVolume(Long tabletSearchVolume) {
    this.tabletSearchVolume = tabletSearchVolume;
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するサーチキーワードのTabletでのリーチ数です。 </div> <div lang=\"en\"> Number of Reach in Tablet with recommended search keyword. </div> 
   * @return tabletSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するサーチキーワードのTabletでのリーチ数です。 </div> <div lang=\"en\"> Number of Reach in Tablet with recommended search keyword. </div> ")


  public Long getTabletSearchVolume() {
    return tabletSearchVolume;
  }

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


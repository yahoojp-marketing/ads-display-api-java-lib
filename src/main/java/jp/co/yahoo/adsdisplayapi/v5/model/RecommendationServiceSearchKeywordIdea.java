package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceSearchKeywordIdeaSearchKeywordList;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;追加を推奨するサーチキーワードに関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This describes the information of a recommended search keyword to add.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">追加を推奨するサーチキーワードに関する情報を表します。</div> <div lang=\"en\">This describes the information of a recommended search keyword to add.</div> ")

public class RecommendationServiceSearchKeywordIdea   {
  @JsonProperty("searchKeywordIdeaSearchKeywordList")
  @Valid
  private JsonNullable<List<RecommendationServiceSearchKeywordIdeaSearchKeywordList>> searchKeywordIdeaSearchKeywordList = JsonNullable.undefined();

  public RecommendationServiceSearchKeywordIdea searchKeywordIdeaSearchKeywordList(List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> searchKeywordIdeaSearchKeywordList) {
    this.searchKeywordIdeaSearchKeywordList = JsonNullable.of(searchKeywordIdeaSearchKeywordList);
    return this;
  }

  public RecommendationServiceSearchKeywordIdea addSearchKeywordIdeaSearchKeywordListItem(RecommendationServiceSearchKeywordIdeaSearchKeywordList searchKeywordIdeaSearchKeywordListItem) {
    if (this.searchKeywordIdeaSearchKeywordList == null || !this.searchKeywordIdeaSearchKeywordList.isPresent()) {
      this.searchKeywordIdeaSearchKeywordList = JsonNullable.of(new ArrayList<>());
    }
    this.searchKeywordIdeaSearchKeywordList.get().add(searchKeywordIdeaSearchKeywordListItem);
    return this;
  }

  /**
   * Get searchKeywordIdeaSearchKeywordList
   * @return searchKeywordIdeaSearchKeywordList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<RecommendationServiceSearchKeywordIdeaSearchKeywordList>> getSearchKeywordIdeaSearchKeywordList() {
    return searchKeywordIdeaSearchKeywordList;
  }

  public void setSearchKeywordIdeaSearchKeywordList(JsonNullable<List<RecommendationServiceSearchKeywordIdeaSearchKeywordList>> searchKeywordIdeaSearchKeywordList) {
    this.searchKeywordIdeaSearchKeywordList = searchKeywordIdeaSearchKeywordList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceSearchKeywordIdea recommendationServiceSearchKeywordIdea = (RecommendationServiceSearchKeywordIdea) o;
    return Objects.equals(this.searchKeywordIdeaSearchKeywordList, recommendationServiceSearchKeywordIdea.searchKeywordIdeaSearchKeywordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKeywordIdeaSearchKeywordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceSearchKeywordIdea {\n");
    
    sb.append("    searchKeywordIdeaSearchKeywordList: ").append(toIndentedString(searchKeywordIdeaSearchKeywordList)).append("\n");
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


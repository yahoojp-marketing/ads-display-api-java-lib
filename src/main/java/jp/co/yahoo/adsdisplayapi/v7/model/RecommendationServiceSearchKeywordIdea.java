package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceSearchKeywordIdeaSearchKeywordList;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;追加を推奨するサーチキーワードに関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This describes the information of a recommended search keyword to add.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">追加を推奨するサーチキーワードに関する情報を表します。</div> <div lang=\"en\">This describes the information of a recommended search keyword to add.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceSearchKeywordIdea   {
  @JsonProperty("searchKeywordIdeaSearchKeywordList")
  @Valid
  private List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> searchKeywordIdeaSearchKeywordList = null;

  public RecommendationServiceSearchKeywordIdea searchKeywordIdeaSearchKeywordList(List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> searchKeywordIdeaSearchKeywordList) {
    this.searchKeywordIdeaSearchKeywordList = searchKeywordIdeaSearchKeywordList;
    return this;
  }

  public RecommendationServiceSearchKeywordIdea addSearchKeywordIdeaSearchKeywordListItem(RecommendationServiceSearchKeywordIdeaSearchKeywordList searchKeywordIdeaSearchKeywordListItem) {
    if (this.searchKeywordIdeaSearchKeywordList == null) {
      this.searchKeywordIdeaSearchKeywordList = new ArrayList<>();
    }
    this.searchKeywordIdeaSearchKeywordList.add(searchKeywordIdeaSearchKeywordListItem);
    return this;
  }

  /**
   * Get searchKeywordIdeaSearchKeywordList
   * @return searchKeywordIdeaSearchKeywordList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> getSearchKeywordIdeaSearchKeywordList() {
    return searchKeywordIdeaSearchKeywordList;
  }

  public void setSearchKeywordIdeaSearchKeywordList(List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> searchKeywordIdeaSearchKeywordList) {
    this.searchKeywordIdeaSearchKeywordList = searchKeywordIdeaSearchKeywordList;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


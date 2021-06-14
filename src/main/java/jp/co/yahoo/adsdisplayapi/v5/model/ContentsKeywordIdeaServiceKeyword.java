package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ContentsKeywordIdeaServiceMatchType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordIdeaServiceKeywordオブジェクトは、コンテンツターゲティングの検索条件です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordIdeaServiceKeyword object is search condition for contents targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordIdeaServiceKeywordオブジェクトは、コンテンツターゲティングの検索条件です。</div> <div lang=\"en\">ContentsKeywordIdeaServiceKeyword object is search condition for contents targeting.</div> ")

public class ContentsKeywordIdeaServiceKeyword   {
  @JsonProperty("keywords")
  @Valid
  private JsonNullable<List<String>> keywords = JsonNullable.undefined();

  @JsonProperty("matchType")
  private JsonNullable<ContentsKeywordIdeaServiceMatchType> matchType = JsonNullable.undefined();

  public ContentsKeywordIdeaServiceKeyword keywords(List<String> keywords) {
    this.keywords = JsonNullable.of(keywords);
    return this;
  }

  public ContentsKeywordIdeaServiceKeyword addKeywordsItem(String keywordsItem) {
    if (this.keywords == null || !this.keywords.isPresent()) {
      this.keywords = JsonNullable.of(new ArrayList<>());
    }
    this.keywords.get().add(keywordsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 検索条件：キーワード<br> ※キーワード提案用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\"> Search condition : Keyword.<br> *Keyword for suggesting.<br> *Can not specify Keyword and Keyword ID at the same time. </div> 
   * @return keywords
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索条件：キーワード<br> ※キーワード提案用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\"> Search condition : Keyword.<br> *Keyword for suggesting.<br> *Can not specify Keyword and Keyword ID at the same time. </div> ")

@Size(max=200) 
  public JsonNullable<List<String>> getKeywords() {
    return keywords;
  }

  public void setKeywords(JsonNullable<List<String>> keywords) {
    this.keywords = keywords;
  }

  public ContentsKeywordIdeaServiceKeyword matchType(ContentsKeywordIdeaServiceMatchType matchType) {
    this.matchType = JsonNullable.of(matchType);
    return this;
  }

  /**
   * Get matchType
   * @return matchType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ContentsKeywordIdeaServiceMatchType> getMatchType() {
    return matchType;
  }

  public void setMatchType(JsonNullable<ContentsKeywordIdeaServiceMatchType> matchType) {
    this.matchType = matchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsKeywordIdeaServiceKeyword contentsKeywordIdeaServiceKeyword = (ContentsKeywordIdeaServiceKeyword) o;
    return Objects.equals(this.keywords, contentsKeywordIdeaServiceKeyword.keywords) &&
        Objects.equals(this.matchType, contentsKeywordIdeaServiceKeyword.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, matchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordIdeaServiceKeyword {\n");
    
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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


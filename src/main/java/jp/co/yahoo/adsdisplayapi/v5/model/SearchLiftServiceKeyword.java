package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchLiftServiceKeywordCategory;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchLiftServiceKeywordオブジェクトは、サーチリフトのキーワード情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchLiftServiceKeyword object describes information about the keyword of the search lift.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchLiftServiceKeywordオブジェクトは、サーチリフトのキーワード情報を表します。</div> <div lang=\"en\">SearchLiftServiceKeyword object describes information about the keyword of the search lift.</div> ")

public class SearchLiftServiceKeyword   {
  @JsonProperty("keyword")
  private JsonNullable<String> keyword = JsonNullable.undefined();

  @JsonProperty("keywordCategory")
  private JsonNullable<SearchLiftServiceKeywordCategory> keywordCategory = JsonNullable.undefined();

  public SearchLiftServiceKeyword keyword(String keyword) {
    this.keyword = JsonNullable.of(keyword);
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword. </div> 
   * @return keyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword. </div> ")


  public JsonNullable<String> getKeyword() {
    return keyword;
  }

  public void setKeyword(JsonNullable<String> keyword) {
    this.keyword = keyword;
  }

  public SearchLiftServiceKeyword keywordCategory(SearchLiftServiceKeywordCategory keywordCategory) {
    this.keywordCategory = JsonNullable.of(keywordCategory);
    return this;
  }

  /**
   * Get keywordCategory
   * @return keywordCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchLiftServiceKeywordCategory> getKeywordCategory() {
    return keywordCategory;
  }

  public void setKeywordCategory(JsonNullable<SearchLiftServiceKeywordCategory> keywordCategory) {
    this.keywordCategory = keywordCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchLiftServiceKeyword searchLiftServiceKeyword = (SearchLiftServiceKeyword) o;
    return Objects.equals(this.keyword, searchLiftServiceKeyword.keyword) &&
        Objects.equals(this.keywordCategory, searchLiftServiceKeyword.keywordCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, keywordCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchLiftServiceKeyword {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordCategory: ").append(toIndentedString(keywordCategory)).append("\n");
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


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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; SearchKeywordListServiceSearchKeywordオブジェクトは、サーチキーワードを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; SearchKeywordListServiceSearchKeyword is an object to display the search keyword.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> SearchKeywordListServiceSearchKeywordオブジェクトは、サーチキーワードを表します。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> SearchKeywordListServiceSearchKeyword is an object to display the search keyword.<br> This field is required in ADD and SET operation. </div> ")

public class SearchKeywordListServiceSearchKeyword   {
  @JsonProperty("searchKeywordId")
  private JsonNullable<Long> searchKeywordId = JsonNullable.undefined();

  public SearchKeywordListServiceSearchKeyword searchKeywordId(Long searchKeywordId) {
    this.searchKeywordId = JsonNullable.of(searchKeywordId);
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Search keyword ID.<br> This field is required in ADD and SET operation. </div> 
   * @return searchKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Search keyword ID.<br> This field is required in ADD and SET operation. </div> ")


  public JsonNullable<Long> getSearchKeywordId() {
    return searchKeywordId;
  }

  public void setSearchKeywordId(JsonNullable<Long> searchKeywordId) {
    this.searchKeywordId = searchKeywordId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordListServiceSearchKeyword searchKeywordListServiceSearchKeyword = (SearchKeywordListServiceSearchKeyword) o;
    return Objects.equals(this.searchKeywordId, searchKeywordListServiceSearchKeyword.searchKeywordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKeywordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordListServiceSearchKeyword {\n");
    
    sb.append("    searchKeywordId: ").append(toIndentedString(searchKeywordId)).append("\n");
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


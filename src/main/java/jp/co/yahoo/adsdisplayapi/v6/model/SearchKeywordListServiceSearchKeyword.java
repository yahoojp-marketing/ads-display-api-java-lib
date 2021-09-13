package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; SearchKeywordListServiceSearchKeywordオブジェクトは、サーチキーワードを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; SearchKeywordListServiceSearchKeyword is an object to display the search keyword.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> SearchKeywordListServiceSearchKeywordオブジェクトは、サーチキーワードを表します。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> SearchKeywordListServiceSearchKeyword is an object to display the search keyword.<br> This field is required in ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchKeywordListServiceSearchKeyword   {
  @JsonProperty("searchKeywordId")
  private Long searchKeywordId = null;

  public SearchKeywordListServiceSearchKeyword searchKeywordId(Long searchKeywordId) {
    this.searchKeywordId = searchKeywordId;
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Search keyword ID.<br> This field is required in ADD and SET operation. </div> 
   * @return searchKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Search keyword ID.<br> This field is required in ADD and SET operation. </div> ")


  public Long getSearchKeywordId() {
    return searchKeywordId;
  }

  public void setSearchKeywordId(Long searchKeywordId) {
    this.searchKeywordId = searchKeywordId;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


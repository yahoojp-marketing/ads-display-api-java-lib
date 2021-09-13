package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceSearchTargetオブジェクトは、サーチターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceSearchTarget object holds configuration information of search targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceSearchTargetオブジェクトは、サーチターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceSearchTarget object holds configuration information of search targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceSearchTarget   {
  @JsonProperty("searchKeywordListName")
  private String searchKeywordListName = null;

  public StatsServiceSearchTarget searchKeywordListName(String searchKeywordListName) {
    this.searchKeywordListName = searchKeywordListName;
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワードリスト名</div> <div lang=\"en\">Search Keyword List name</div> 
   * @return searchKeywordListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワードリスト名</div> <div lang=\"en\">Search Keyword List name</div> ")


  public String getSearchKeywordListName() {
    return searchKeywordListName;
  }

  public void setSearchKeywordListName(String searchKeywordListName) {
    this.searchKeywordListName = searchKeywordListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceSearchTarget statsServiceSearchTarget = (StatsServiceSearchTarget) o;
    return Objects.equals(this.searchKeywordListName, statsServiceSearchTarget.searchKeywordListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKeywordListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceSearchTarget {\n");
    
    sb.append("    searchKeywordListName: ").append(toIndentedString(searchKeywordListName)).append("\n");
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

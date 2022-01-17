package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.SearchKeywordListServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordListServiceReturnValueオブジェクトは、サーチキーワードリスト設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordListServiceReturnValue object displays the setting of search keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordListServiceReturnValueオブジェクトは、サーチキーワードリスト設定を表します。</div> <div lang=\"en\">SearchKeywordListServiceReturnValue object displays the setting of search keyword list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchKeywordListServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<SearchKeywordListServiceValue> values = null;

  public SearchKeywordListServiceReturnValue values(List<SearchKeywordListServiceValue> values) {
    this.values = values;
    return this;
  }

  public SearchKeywordListServiceReturnValue addValuesItem(SearchKeywordListServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SearchKeywordListServiceValue> getValues() {
    return values;
  }

  public void setValues(List<SearchKeywordListServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordListServiceReturnValue searchKeywordListServiceReturnValue = (SearchKeywordListServiceReturnValue) o;
    return Objects.equals(this.values, searchKeywordListServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordListServiceReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


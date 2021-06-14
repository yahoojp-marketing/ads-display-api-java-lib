package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordList;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordListServiceValueオブジェクトは、操作結果を含むサーチキーワードリストのコンテナを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordListServiceValue object displays the container that includes operation results for search keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordListServiceValueオブジェクトは、操作結果を含むサーチキーワードリストのコンテナを表します。</div> <div lang=\"en\">SearchKeywordListServiceValue object displays the container that includes operation results for search keyword list.</div> ")

public class SearchKeywordListServiceValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  @JsonProperty("searchKeywordList")
  private JsonNullable<SearchKeywordList> searchKeywordList = JsonNullable.undefined();

  public SearchKeywordListServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public SearchKeywordListServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public SearchKeywordListServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public SearchKeywordListServiceValue searchKeywordList(SearchKeywordList searchKeywordList) {
    this.searchKeywordList = JsonNullable.of(searchKeywordList);
    return this;
  }

  /**
   * Get searchKeywordList
   * @return searchKeywordList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchKeywordList> getSearchKeywordList() {
    return searchKeywordList;
  }

  public void setSearchKeywordList(JsonNullable<SearchKeywordList> searchKeywordList) {
    this.searchKeywordList = searchKeywordList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordListServiceValue searchKeywordListServiceValue = (SearchKeywordListServiceValue) o;
    return Objects.equals(this.errors, searchKeywordListServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, searchKeywordListServiceValue.operationSucceeded) &&
        Objects.equals(this.searchKeywordList, searchKeywordListServiceValue.searchKeywordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, searchKeywordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordListServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    searchKeywordList: ").append(toIndentedString(searchKeywordList)).append("\n");
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


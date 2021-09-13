package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchKeywordList;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordListServiceValueオブジェクトは、操作結果を含むサーチキーワードリストのコンテナを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordListServiceValue object displays the container that includes operation results for search keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordListServiceValueオブジェクトは、操作結果を含むサーチキーワードリストのコンテナを表します。</div> <div lang=\"en\">SearchKeywordListServiceValue object displays the container that includes operation results for search keyword list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchKeywordListServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("searchKeywordList")
  private SearchKeywordList searchKeywordList = null;

  public SearchKeywordListServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public SearchKeywordListServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public SearchKeywordListServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public SearchKeywordListServiceValue searchKeywordList(SearchKeywordList searchKeywordList) {
    this.searchKeywordList = searchKeywordList;
    return this;
  }

  /**
   * Get searchKeywordList
   * @return searchKeywordList
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordList getSearchKeywordList() {
    return searchKeywordList;
  }

  public void setSearchKeywordList(SearchKeywordList searchKeywordList) {
    this.searchKeywordList = searchKeywordList;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


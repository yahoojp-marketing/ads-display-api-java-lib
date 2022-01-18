package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.ContentsKeywordList;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordListServiceValueオブジェクトは、操作結果を含むコンテンツキーワードリストのコンテナを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordListServiceValue object displays the container that includes operation results for contents keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordListServiceValueオブジェクトは、操作結果を含むコンテンツキーワードリストのコンテナを表します。</div> <div lang=\"en\">ContentsKeywordListServiceValue object displays the container that includes operation results for contents keyword list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContentsKeywordListServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("contentsKeywordList")
  private ContentsKeywordList contentsKeywordList = null;

  public ContentsKeywordListServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ContentsKeywordListServiceValue addErrorsItem(Error errorsItem) {
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

  public ContentsKeywordListServiceValue operationSucceeded(Boolean operationSucceeded) {
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

  public ContentsKeywordListServiceValue contentsKeywordList(ContentsKeywordList contentsKeywordList) {
    this.contentsKeywordList = contentsKeywordList;
    return this;
  }

  /**
   * Get contentsKeywordList
   * @return contentsKeywordList
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContentsKeywordList getContentsKeywordList() {
    return contentsKeywordList;
  }

  public void setContentsKeywordList(ContentsKeywordList contentsKeywordList) {
    this.contentsKeywordList = contentsKeywordList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsKeywordListServiceValue contentsKeywordListServiceValue = (ContentsKeywordListServiceValue) o;
    return Objects.equals(this.errors, contentsKeywordListServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, contentsKeywordListServiceValue.operationSucceeded) &&
        Objects.equals(this.contentsKeywordList, contentsKeywordListServiceValue.contentsKeywordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, contentsKeywordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordListServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    contentsKeywordList: ").append(toIndentedString(contentsKeywordList)).append("\n");
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


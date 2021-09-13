package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchLift;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchLiftServiceValueオブジェクトは、操作結果を含むサーチリフトの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The SearchLiftServiceValue object is a container for storing search lift information and operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchLiftServiceValueオブジェクトは、操作結果を含むサーチリフトの情報を表します。</div> <div lang=\"en\">The SearchLiftServiceValue object is a container for storing search lift information and operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchLiftServiceValue   {
  @JsonProperty("searchLift")
  private SearchLift searchLift = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public SearchLiftServiceValue searchLift(SearchLift searchLift) {
    this.searchLift = searchLift;
    return this;
  }

  /**
   * Get searchLift
   * @return searchLift
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchLift getSearchLift() {
    return searchLift;
  }

  public void setSearchLift(SearchLift searchLift) {
    this.searchLift = searchLift;
  }

  public SearchLiftServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public SearchLiftServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> 
   * @return errors
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public SearchLiftServiceValue operationSucceeded(Boolean operationSucceeded) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchLiftServiceValue searchLiftServiceValue = (SearchLiftServiceValue) o;
    return Objects.equals(this.searchLift, searchLiftServiceValue.searchLift) &&
        Objects.equals(this.errors, searchLiftServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, searchLiftServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchLift, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchLiftServiceValue {\n");
    
    sb.append("    searchLift: ").append(toIndentedString(searchLift)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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


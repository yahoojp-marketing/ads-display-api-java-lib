package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchLift;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchLiftServiceValueオブジェクトは、操作結果を含むサーチリフトの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The SearchLiftServiceValue object is a container for storing search lift information and operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchLiftServiceValueオブジェクトは、操作結果を含むサーチリフトの情報を表します。</div> <div lang=\"en\">The SearchLiftServiceValue object is a container for storing search lift information and operation results.</div> ")

public class SearchLiftServiceValue   {
  @JsonProperty("searchLift")
  private JsonNullable<SearchLift> searchLift = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public SearchLiftServiceValue searchLift(SearchLift searchLift) {
    this.searchLift = JsonNullable.of(searchLift);
    return this;
  }

  /**
   * Get searchLift
   * @return searchLift
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchLift> getSearchLift() {
    return searchLift;
  }

  public void setSearchLift(JsonNullable<SearchLift> searchLift) {
    this.searchLift = searchLift;
  }

  public SearchLiftServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public SearchLiftServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> 
   * @return errors
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public SearchLiftServiceValue operationSucceeded(Boolean operationSucceeded) {
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


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


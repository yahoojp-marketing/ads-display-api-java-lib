package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.ContentsKeywordIdea;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordIdeaServiceValueオブジェクトは、コンテンツターゲティング対象キーワードを含むコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordIdeaServiceValue object is a container that includes keyword for contents targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordIdeaServiceValueオブジェクトは、コンテンツターゲティング対象キーワードを含むコンテナです。</div> <div lang=\"en\">ContentsKeywordIdeaServiceValue object is a container that includes keyword for contents targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContentsKeywordIdeaServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("contentsKeywordIdea")
  private ContentsKeywordIdea contentsKeywordIdea = null;

  public ContentsKeywordIdeaServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ContentsKeywordIdeaServiceValue addErrorsItem(Error errorsItem) {
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

  public ContentsKeywordIdeaServiceValue operationSucceeded(Boolean operationSucceeded) {
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

  public ContentsKeywordIdeaServiceValue contentsKeywordIdea(ContentsKeywordIdea contentsKeywordIdea) {
    this.contentsKeywordIdea = contentsKeywordIdea;
    return this;
  }

  /**
   * Get contentsKeywordIdea
   * @return contentsKeywordIdea
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContentsKeywordIdea getContentsKeywordIdea() {
    return contentsKeywordIdea;
  }

  public void setContentsKeywordIdea(ContentsKeywordIdea contentsKeywordIdea) {
    this.contentsKeywordIdea = contentsKeywordIdea;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsKeywordIdeaServiceValue contentsKeywordIdeaServiceValue = (ContentsKeywordIdeaServiceValue) o;
    return Objects.equals(this.errors, contentsKeywordIdeaServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, contentsKeywordIdeaServiceValue.operationSucceeded) &&
        Objects.equals(this.contentsKeywordIdea, contentsKeywordIdeaServiceValue.contentsKeywordIdea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, contentsKeywordIdea);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordIdeaServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    contentsKeywordIdea: ").append(toIndentedString(contentsKeywordIdea)).append("\n");
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


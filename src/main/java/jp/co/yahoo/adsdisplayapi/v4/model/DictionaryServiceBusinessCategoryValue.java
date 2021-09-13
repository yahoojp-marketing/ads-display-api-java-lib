package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.DictionaryServiceBusinessCategory;
import jp.co.yahoo.adsdisplayapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceBusinessCategoryValueオブジェクトは、ビジネスカテゴリー情報を取得するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceBusinessCategoryValue object is a container that retrieves business category information.&lt;/div&gt;
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceBusinessCategoryValueオブジェクトは、ビジネスカテゴリー情報を取得するコンテナです。</div> <div lang=\"en\">DictionaryServiceBusinessCategoryValue object is a container that retrieves business category information.</div>")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceBusinessCategoryValue   {
  @JsonProperty("adCategory")
  private DictionaryServiceBusinessCategory adCategory = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public DictionaryServiceBusinessCategoryValue adCategory(DictionaryServiceBusinessCategory adCategory) {
    this.adCategory = adCategory;
    return this;
  }

  /**
   * Get adCategory
   * @return adCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServiceBusinessCategory getAdCategory() {
    return adCategory;
  }

  public void setAdCategory(DictionaryServiceBusinessCategory adCategory) {
    this.adCategory = adCategory;
  }

  public DictionaryServiceBusinessCategoryValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public DictionaryServiceBusinessCategoryValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceBusinessCategoryValue operationSucceeded(Boolean operationSucceeded) {
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
    DictionaryServiceBusinessCategoryValue dictionaryServiceBusinessCategoryValue = (DictionaryServiceBusinessCategoryValue) o;
    return Objects.equals(this.adCategory, dictionaryServiceBusinessCategoryValue.adCategory) &&
        Objects.equals(this.errors, dictionaryServiceBusinessCategoryValue.errors) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceBusinessCategoryValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCategory, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceBusinessCategoryValue {\n");
    
    sb.append("    adCategory: ").append(toIndentedString(adCategory)).append("\n");
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


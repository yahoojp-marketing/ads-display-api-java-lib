package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceBusinessCategory;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceBusinessCategoryValueオブジェクトは、ビジネスカテゴリー情報を取得するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceBusinessCategoryValue object is a container that retrieves business category information.&lt;/div&gt;
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceBusinessCategoryValueオブジェクトは、ビジネスカテゴリー情報を取得するコンテナです。</div> <div lang=\"en\">DictionaryServiceBusinessCategoryValue object is a container that retrieves business category information.</div>")

public class DictionaryServiceBusinessCategoryValue   {
  @JsonProperty("adCategory")
  private JsonNullable<DictionaryServiceBusinessCategory> adCategory = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public DictionaryServiceBusinessCategoryValue adCategory(DictionaryServiceBusinessCategory adCategory) {
    this.adCategory = JsonNullable.of(adCategory);
    return this;
  }

  /**
   * Get adCategory
   * @return adCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<DictionaryServiceBusinessCategory> getAdCategory() {
    return adCategory;
  }

  public void setAdCategory(JsonNullable<DictionaryServiceBusinessCategory> adCategory) {
    this.adCategory = adCategory;
  }

  public DictionaryServiceBusinessCategoryValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public DictionaryServiceBusinessCategoryValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceBusinessCategoryValue operationSucceeded(Boolean operationSucceeded) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


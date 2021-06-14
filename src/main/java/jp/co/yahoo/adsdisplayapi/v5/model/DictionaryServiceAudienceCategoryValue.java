package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceAudienceCategory;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceAudienceCategoryValueオブジェクトは、オーディエンスカテゴリー情報を取得するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceAudienceCategoryValue object is a container that retrieves audience category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceAudienceCategoryValueオブジェクトは、オーディエンスカテゴリー情報を取得するコンテナです。</div> <div lang=\"en\">DictionaryServiceAudienceCategoryValue object is a container that retrieves audience category information.</div> ")

public class DictionaryServiceAudienceCategoryValue   {
  @JsonProperty("audienceCategory")
  private JsonNullable<DictionaryServiceAudienceCategory> audienceCategory = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public DictionaryServiceAudienceCategoryValue audienceCategory(DictionaryServiceAudienceCategory audienceCategory) {
    this.audienceCategory = JsonNullable.of(audienceCategory);
    return this;
  }

  /**
   * Get audienceCategory
   * @return audienceCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<DictionaryServiceAudienceCategory> getAudienceCategory() {
    return audienceCategory;
  }

  public void setAudienceCategory(JsonNullable<DictionaryServiceAudienceCategory> audienceCategory) {
    this.audienceCategory = audienceCategory;
  }

  public DictionaryServiceAudienceCategoryValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public DictionaryServiceAudienceCategoryValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceAudienceCategoryValue operationSucceeded(Boolean operationSucceeded) {
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
    DictionaryServiceAudienceCategoryValue dictionaryServiceAudienceCategoryValue = (DictionaryServiceAudienceCategoryValue) o;
    return Objects.equals(this.audienceCategory, dictionaryServiceAudienceCategoryValue.audienceCategory) &&
        Objects.equals(this.errors, dictionaryServiceAudienceCategoryValue.errors) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceAudienceCategoryValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceCategory, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceAudienceCategoryValue {\n");
    
    sb.append("    audienceCategory: ").append(toIndentedString(audienceCategory)).append("\n");
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


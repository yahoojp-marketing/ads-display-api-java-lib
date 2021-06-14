package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceFeedItemGoogleProductCategory;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryValueオブジェクトは、FeedItemGoogleProductCategoryを取得するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryValue object obtains FeedItemGoogleProductCategory.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceFeedItemGoogleProductCategoryValueオブジェクトは、FeedItemGoogleProductCategoryを取得するコンテナです。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategoryValue object obtains FeedItemGoogleProductCategory.</div> ")

public class DictionaryServiceFeedItemGoogleProductCategoryValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("feedItemGoogleProductCategory")
  private JsonNullable<DictionaryServiceFeedItemGoogleProductCategory> feedItemGoogleProductCategory = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public DictionaryServiceFeedItemGoogleProductCategoryValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public DictionaryServiceFeedItemGoogleProductCategoryValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceFeedItemGoogleProductCategoryValue feedItemGoogleProductCategory(DictionaryServiceFeedItemGoogleProductCategory feedItemGoogleProductCategory) {
    this.feedItemGoogleProductCategory = JsonNullable.of(feedItemGoogleProductCategory);
    return this;
  }

  /**
   * Get feedItemGoogleProductCategory
   * @return feedItemGoogleProductCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<DictionaryServiceFeedItemGoogleProductCategory> getFeedItemGoogleProductCategory() {
    return feedItemGoogleProductCategory;
  }

  public void setFeedItemGoogleProductCategory(JsonNullable<DictionaryServiceFeedItemGoogleProductCategory> feedItemGoogleProductCategory) {
    this.feedItemGoogleProductCategory = feedItemGoogleProductCategory;
  }

  public DictionaryServiceFeedItemGoogleProductCategoryValue operationSucceeded(Boolean operationSucceeded) {
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
    DictionaryServiceFeedItemGoogleProductCategoryValue dictionaryServiceFeedItemGoogleProductCategoryValue = (DictionaryServiceFeedItemGoogleProductCategoryValue) o;
    return Objects.equals(this.errors, dictionaryServiceFeedItemGoogleProductCategoryValue.errors) &&
        Objects.equals(this.feedItemGoogleProductCategory, dictionaryServiceFeedItemGoogleProductCategoryValue.feedItemGoogleProductCategory) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceFeedItemGoogleProductCategoryValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, feedItemGoogleProductCategory, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceFeedItemGoogleProductCategoryValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    feedItemGoogleProductCategory: ").append(toIndentedString(feedItemGoogleProductCategory)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.DictionaryServiceFeedItemGoogleProductCategory;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryValueオブジェクトは、FeedItemGoogleProductCategoryを取得するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryValue object obtains FeedItemGoogleProductCategory.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceFeedItemGoogleProductCategoryValueオブジェクトは、FeedItemGoogleProductCategoryを取得するコンテナです。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategoryValue object obtains FeedItemGoogleProductCategory.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceFeedItemGoogleProductCategoryValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("feedItemGoogleProductCategory")
  private DictionaryServiceFeedItemGoogleProductCategory feedItemGoogleProductCategory = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public DictionaryServiceFeedItemGoogleProductCategoryValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public DictionaryServiceFeedItemGoogleProductCategoryValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceFeedItemGoogleProductCategoryValue feedItemGoogleProductCategory(DictionaryServiceFeedItemGoogleProductCategory feedItemGoogleProductCategory) {
    this.feedItemGoogleProductCategory = feedItemGoogleProductCategory;
    return this;
  }

  /**
   * Get feedItemGoogleProductCategory
   * @return feedItemGoogleProductCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServiceFeedItemGoogleProductCategory getFeedItemGoogleProductCategory() {
    return feedItemGoogleProductCategory;
  }

  public void setFeedItemGoogleProductCategory(DictionaryServiceFeedItemGoogleProductCategory feedItemGoogleProductCategory) {
    this.feedItemGoogleProductCategory = feedItemGoogleProductCategory;
  }

  public DictionaryServiceFeedItemGoogleProductCategoryValue operationSucceeded(Boolean operationSucceeded) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


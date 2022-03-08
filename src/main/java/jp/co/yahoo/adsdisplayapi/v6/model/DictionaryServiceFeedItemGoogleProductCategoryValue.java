/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.DictionaryServiceFeedItemGoogleProductCategory;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryValueオブジェクトは、FeedItemGoogleProductCategoryを取得するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryValue object obtains FeedItemGoogleProductCategory.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceFeedItemGoogleProductCategoryValueオブジェクトは、FeedItemGoogleProductCategoryを取得するコンテナです。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategoryValue object obtains FeedItemGoogleProductCategory.</div> ")
@JsonPropertyOrder({
  DictionaryServiceFeedItemGoogleProductCategoryValue.JSON_PROPERTY_ERRORS,
  DictionaryServiceFeedItemGoogleProductCategoryValue.JSON_PROPERTY_FEED_ITEM_GOOGLE_PRODUCT_CATEGORY,
  DictionaryServiceFeedItemGoogleProductCategoryValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("DictionaryServiceFeedItemGoogleProductCategoryValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceFeedItemGoogleProductCategoryValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_FEED_ITEM_GOOGLE_PRODUCT_CATEGORY = "feedItemGoogleProductCategory";
  private DictionaryServiceFeedItemGoogleProductCategory feedItemGoogleProductCategory;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public DictionaryServiceFeedItemGoogleProductCategoryValue() { 
  }

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_ITEM_GOOGLE_PRODUCT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DictionaryServiceFeedItemGoogleProductCategory getFeedItemGoogleProductCategory() {
    return feedItemGoogleProductCategory;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ITEM_GOOGLE_PRODUCT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedItemGoogleProductCategory(DictionaryServiceFeedItemGoogleProductCategory feedItemGoogleProductCategory) {
    this.feedItemGoogleProductCategory = feedItemGoogleProductCategory;
  }


  public DictionaryServiceFeedItemGoogleProductCategoryValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")
  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


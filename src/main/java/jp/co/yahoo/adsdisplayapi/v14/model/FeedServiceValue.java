/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

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
import jp.co.yahoo.adsdisplayapi.v14.model.Error;
import jp.co.yahoo.adsdisplayapi.v14.model.Feed;
import jp.co.yahoo.adsdisplayapi.v14.model.FeedServiceUploadLimit;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServiceValueオブジェクトは、操作結果を含むFeed情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServiceValue object describes Feed information including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedServiceValueオブジェクトは、操作結果を含むFeed情報を表します。</div> <div lang=\"en\">FeedServiceValue object describes Feed information including operation result.</div> ")
@JsonPropertyOrder({
  FeedServiceValue.JSON_PROPERTY_FEED,
  FeedServiceValue.JSON_PROPERTY_UPLOAD_LIMITS,
  FeedServiceValue.JSON_PROPERTY_ERRORS,
  FeedServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("FeedServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedServiceValue {
  public static final String JSON_PROPERTY_FEED = "feed";
  private Feed feed;

  public static final String JSON_PROPERTY_UPLOAD_LIMITS = "uploadLimits";
  private List<FeedServiceUploadLimit> uploadLimits = null;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public FeedServiceValue() { 
  }

  public FeedServiceValue feed(Feed feed) {
    
    this.feed = feed;
    return this;
  }

   /**
   * Get feed
   * @return feed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Feed getFeed() {
    return feed;
  }


  @JsonProperty(JSON_PROPERTY_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeed(Feed feed) {
    this.feed = feed;
  }


  public FeedServiceValue uploadLimits(List<FeedServiceUploadLimit> uploadLimits) {
    
    this.uploadLimits = uploadLimits;
    return this;
  }

  public FeedServiceValue addUploadLimitsItem(FeedServiceUploadLimit uploadLimitsItem) {
    if (this.uploadLimits == null) {
      this.uploadLimits = new ArrayList<>();
    }
    this.uploadLimits.add(uploadLimitsItem);
    return this;
  }

   /**
   * Get uploadLimits
   * @return uploadLimits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPLOAD_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeedServiceUploadLimit> getUploadLimits() {
    return uploadLimits;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadLimits(List<FeedServiceUploadLimit> uploadLimits) {
    this.uploadLimits = uploadLimits;
  }


  public FeedServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public FeedServiceValue addErrorsItem(Error errorsItem) {
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


  public FeedServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Result of operation&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果</div> <div lang=\"en\">Result of operation</div> ")
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
    FeedServiceValue feedServiceValue = (FeedServiceValue) o;
    return Objects.equals(this.feed, feedServiceValue.feed) &&
        Objects.equals(this.uploadLimits, feedServiceValue.uploadLimits) &&
        Objects.equals(this.errors, feedServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, feedServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feed, uploadLimits, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedServiceValue {\n");
    sb.append("    feed: ").append(toIndentedString(feed)).append("\n");
    sb.append("    uploadLimits: ").append(toIndentedString(uploadLimits)).append("\n");
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


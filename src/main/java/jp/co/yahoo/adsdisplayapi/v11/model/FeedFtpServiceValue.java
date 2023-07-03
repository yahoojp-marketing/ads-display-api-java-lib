/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v11.model.Error;
import jp.co.yahoo.adsdisplayapi.v11.model.FeedFtp;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpServiceValueオブジェクトは、操作結果を含む定期アップロード設定情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpServiceValue object displays Periodic Upload setting information including operation result.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedFtpServiceValue.JSON_PROPERTY_ERRORS,
  FeedFtpServiceValue.JSON_PROPERTY_FEED_FTP,
  FeedFtpServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedFtpServiceValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_FEED_FTP = "feedFtp";
  private FeedFtp feedFtp;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public FeedFtpServiceValue() {
  }

  public FeedFtpServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public FeedFtpServiceValue addErrorsItem(Error errorsItem) {
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
  @jakarta.annotation.Nullable
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


  public FeedFtpServiceValue feedFtp(FeedFtp feedFtp) {
    
    this.feedFtp = feedFtp;
    return this;
  }

   /**
   * Get feedFtp
   * @return feedFtp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_FTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtp getFeedFtp() {
    return feedFtp;
  }


  @JsonProperty(JSON_PROPERTY_FEED_FTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedFtp(FeedFtp feedFtp) {
    this.feedFtp = feedFtp;
  }


  public FeedFtpServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @jakarta.annotation.Nullable
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
    FeedFtpServiceValue feedFtpServiceValue = (FeedFtpServiceValue) o;
    return Objects.equals(this.errors, feedFtpServiceValue.errors) &&
        Objects.equals(this.feedFtp, feedFtpServiceValue.feedFtp) &&
        Objects.equals(this.operationSucceeded, feedFtpServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, feedFtp, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpServiceValue {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    feedFtp: ").append(toIndentedString(feedFtp)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.Feed;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedServiceUploadLimit;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServiceValueオブジェクトは、操作結果を含むFeed情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServiceValue object describes Feed information including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedServiceValueオブジェクトは、操作結果を含むFeed情報を表します。</div> <div lang=\"en\">FeedServiceValue object describes Feed information including operation result.</div> ")

public class FeedServiceValue   {
  @JsonProperty("feed")
  private JsonNullable<Feed> feed = JsonNullable.undefined();

  @JsonProperty("uploadLimits")
  @Valid
  private JsonNullable<List<FeedServiceUploadLimit>> uploadLimits = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public FeedServiceValue feed(Feed feed) {
    this.feed = JsonNullable.of(feed);
    return this;
  }

  /**
   * Get feed
   * @return feed
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<Feed> getFeed() {
    return feed;
  }

  public void setFeed(JsonNullable<Feed> feed) {
    this.feed = feed;
  }

  public FeedServiceValue uploadLimits(List<FeedServiceUploadLimit> uploadLimits) {
    this.uploadLimits = JsonNullable.of(uploadLimits);
    return this;
  }

  public FeedServiceValue addUploadLimitsItem(FeedServiceUploadLimit uploadLimitsItem) {
    if (this.uploadLimits == null || !this.uploadLimits.isPresent()) {
      this.uploadLimits = JsonNullable.of(new ArrayList<>());
    }
    this.uploadLimits.get().add(uploadLimitsItem);
    return this;
  }

  /**
   * Get uploadLimits
   * @return uploadLimits
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<FeedServiceUploadLimit>> getUploadLimits() {
    return uploadLimits;
  }

  public void setUploadLimits(JsonNullable<List<FeedServiceUploadLimit>> uploadLimits) {
    this.uploadLimits = uploadLimits;
  }

  public FeedServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public FeedServiceValue addErrorsItem(Error errorsItem) {
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

  public FeedServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果</div> <div lang=\"en\">Result of operation</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果</div> <div lang=\"en\">Result of operation</div> ")


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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


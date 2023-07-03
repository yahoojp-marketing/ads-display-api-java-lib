/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v10.model.Error;
import jp.co.yahoo.adsdisplayapi.v10.model.FeedSetServicePage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FeedSetServiceGetResponse
 */
@JsonPropertyOrder({
  FeedSetServiceGetResponse.JSON_PROPERTY_ERRORS,
  FeedSetServiceGetResponse.JSON_PROPERTY_RID,
  FeedSetServiceGetResponse.JSON_PROPERTY_RVAL,
  FeedSetServiceGetResponse.JSON_PROPERTY_TIME_TAKEN_SECONDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedSetServiceGetResponse {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_RID = "rid";
  private String rid;

  public static final String JSON_PROPERTY_RVAL = "rval";
  private FeedSetServicePage rval;

  public static final String JSON_PROPERTY_TIME_TAKEN_SECONDS = "timeTakenSeconds";
  private BigDecimal timeTakenSeconds;

  public FeedSetServiceGetResponse() {
  }

  public FeedSetServiceGetResponse errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public FeedSetServiceGetResponse addErrorsItem(Error errorsItem) {
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


  public FeedSetServiceGetResponse rid(String rid) {
    
    this.rid = rid;
    return this;
  }

   /**
   * Get rid
   * @return rid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRid() {
    return rid;
  }


  @JsonProperty(JSON_PROPERTY_RID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRid(String rid) {
    this.rid = rid;
  }


  public FeedSetServiceGetResponse rval(FeedSetServicePage rval) {
    
    this.rval = rval;
    return this;
  }

   /**
   * Get rval
   * @return rval
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedSetServicePage getRval() {
    return rval;
  }


  @JsonProperty(JSON_PROPERTY_RVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRval(FeedSetServicePage rval) {
    this.rval = rval;
  }


  public FeedSetServiceGetResponse timeTakenSeconds(BigDecimal timeTakenSeconds) {
    
    this.timeTakenSeconds = timeTakenSeconds;
    return this;
  }

   /**
   * Get timeTakenSeconds
   * @return timeTakenSeconds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TAKEN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTimeTakenSeconds() {
    return timeTakenSeconds;
  }


  @JsonProperty(JSON_PROPERTY_TIME_TAKEN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeTakenSeconds(BigDecimal timeTakenSeconds) {
    this.timeTakenSeconds = timeTakenSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedSetServiceGetResponse feedSetServiceGetResponse = (FeedSetServiceGetResponse) o;
    return Objects.equals(this.errors, feedSetServiceGetResponse.errors) &&
        Objects.equals(this.rid, feedSetServiceGetResponse.rid) &&
        Objects.equals(this.rval, feedSetServiceGetResponse.rval) &&
        Objects.equals(this.timeTakenSeconds, feedSetServiceGetResponse.timeTakenSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval, timeTakenSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedSetServiceGetResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
    sb.append("    rval: ").append(toIndentedString(rval)).append("\n");
    sb.append("    timeTakenSeconds: ").append(toIndentedString(timeTakenSeconds)).append("\n");
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


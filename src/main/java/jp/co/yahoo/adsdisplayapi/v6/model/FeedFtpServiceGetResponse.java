package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import jp.co.yahoo.adsdisplayapi.v6.model.FeedFtpServicePage;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeedFtpServiceGetResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedFtpServiceGetResponse   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("rid")
  private String rid;

  @JsonProperty("rval")
  private FeedFtpServicePage rval = null;

  @JsonProperty("timeTakenSeconds")
  private BigDecimal timeTakenSeconds = null;

  public FeedFtpServiceGetResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public FeedFtpServiceGetResponse addErrorsItem(Error errorsItem) {
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

  public FeedFtpServiceGetResponse rid(String rid) {
    this.rid = rid;
    return this;
  }

  /**
   * Get rid
   * @return rid
  */
  @ApiModelProperty(value = "")


  public String getRid() {
    return rid;
  }

  public void setRid(String rid) {
    this.rid = rid;
  }

  public FeedFtpServiceGetResponse rval(FeedFtpServicePage rval) {
    this.rval = rval;
    return this;
  }

  /**
   * Get rval
   * @return rval
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedFtpServicePage getRval() {
    return rval;
  }

  public void setRval(FeedFtpServicePage rval) {
    this.rval = rval;
  }

  public FeedFtpServiceGetResponse timeTakenSeconds(BigDecimal timeTakenSeconds) {
    this.timeTakenSeconds = timeTakenSeconds;
    return this;
  }

  /**
   * Get timeTakenSeconds
   * @return timeTakenSeconds
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTimeTakenSeconds() {
    return timeTakenSeconds;
  }

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
    FeedFtpServiceGetResponse feedFtpServiceGetResponse = (FeedFtpServiceGetResponse) o;
    return Objects.equals(this.errors, feedFtpServiceGetResponse.errors) &&
        Objects.equals(this.rid, feedFtpServiceGetResponse.rid) &&
        Objects.equals(this.rval, feedFtpServiceGetResponse.rval) &&
        Objects.equals(this.timeTakenSeconds, feedFtpServiceGetResponse.timeTakenSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval, timeTakenSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpServiceGetResponse {\n");
    
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


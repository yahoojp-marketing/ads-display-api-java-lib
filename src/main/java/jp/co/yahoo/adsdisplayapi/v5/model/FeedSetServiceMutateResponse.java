package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedSetServiceReturnValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeedSetServiceMutateResponse
 */

public class FeedSetServiceMutateResponse   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("rid")
  private String rid;

  @JsonProperty("rval")
  private JsonNullable<FeedSetServiceReturnValue> rval = JsonNullable.undefined();

  @JsonProperty("timeTakenSeconds")
  private JsonNullable<BigDecimal> timeTakenSeconds = JsonNullable.undefined();

  public FeedSetServiceMutateResponse errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public FeedSetServiceMutateResponse addErrorsItem(Error errorsItem) {
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

  public FeedSetServiceMutateResponse rid(String rid) {
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

  public FeedSetServiceMutateResponse rval(FeedSetServiceReturnValue rval) {
    this.rval = JsonNullable.of(rval);
    return this;
  }

  /**
   * Get rval
   * @return rval
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedSetServiceReturnValue> getRval() {
    return rval;
  }

  public void setRval(JsonNullable<FeedSetServiceReturnValue> rval) {
    this.rval = rval;
  }

  public FeedSetServiceMutateResponse timeTakenSeconds(BigDecimal timeTakenSeconds) {
    this.timeTakenSeconds = JsonNullable.of(timeTakenSeconds);
    return this;
  }

  /**
   * Get timeTakenSeconds
   * @return timeTakenSeconds
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BigDecimal> getTimeTakenSeconds() {
    return timeTakenSeconds;
  }

  public void setTimeTakenSeconds(JsonNullable<BigDecimal> timeTakenSeconds) {
    this.timeTakenSeconds = timeTakenSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedSetServiceMutateResponse feedSetServiceMutateResponse = (FeedSetServiceMutateResponse) o;
    return Objects.equals(this.errors, feedSetServiceMutateResponse.errors) &&
        Objects.equals(this.rid, feedSetServiceMutateResponse.rid) &&
        Objects.equals(this.rval, feedSetServiceMutateResponse.rval) &&
        Objects.equals(this.timeTakenSeconds, feedSetServiceMutateResponse.timeTakenSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval, timeTakenSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedSetServiceMutateResponse {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


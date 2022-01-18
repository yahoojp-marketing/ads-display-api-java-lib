package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedCampaignServiceReturnValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GuaranteedCampaignServiceMutateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedCampaignServiceMutateResponse   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("rid")
  private String rid;

  @JsonProperty("rval")
  private GuaranteedCampaignServiceReturnValue rval = null;

  public GuaranteedCampaignServiceMutateResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GuaranteedCampaignServiceMutateResponse addErrorsItem(Error errorsItem) {
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

  public GuaranteedCampaignServiceMutateResponse rid(String rid) {
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

  public GuaranteedCampaignServiceMutateResponse rval(GuaranteedCampaignServiceReturnValue rval) {
    this.rval = rval;
    return this;
  }

  /**
   * Get rval
   * @return rval
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedCampaignServiceReturnValue getRval() {
    return rval;
  }

  public void setRval(GuaranteedCampaignServiceReturnValue rval) {
    this.rval = rval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceMutateResponse guaranteedCampaignServiceMutateResponse = (GuaranteedCampaignServiceMutateResponse) o;
    return Objects.equals(this.errors, guaranteedCampaignServiceMutateResponse.errors) &&
        Objects.equals(this.rid, guaranteedCampaignServiceMutateResponse.rid) &&
        Objects.equals(this.rval, guaranteedCampaignServiceMutateResponse.rval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceMutateResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
    sb.append("    rval: ").append(toIndentedString(rval)).append("\n");
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


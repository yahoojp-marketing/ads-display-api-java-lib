package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.DictionaryServiceMediaAdFormatPage;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DictionaryServiceGetMediaAdFormatResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceGetMediaAdFormatResponse   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("rid")
  private String rid;

  @JsonProperty("rval")
  private DictionaryServiceMediaAdFormatPage rval = null;

  public DictionaryServiceGetMediaAdFormatResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public DictionaryServiceGetMediaAdFormatResponse addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceGetMediaAdFormatResponse rid(String rid) {
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

  public DictionaryServiceGetMediaAdFormatResponse rval(DictionaryServiceMediaAdFormatPage rval) {
    this.rval = rval;
    return this;
  }

  /**
   * Get rval
   * @return rval
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServiceMediaAdFormatPage getRval() {
    return rval;
  }

  public void setRval(DictionaryServiceMediaAdFormatPage rval) {
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
    DictionaryServiceGetMediaAdFormatResponse dictionaryServiceGetMediaAdFormatResponse = (DictionaryServiceGetMediaAdFormatResponse) o;
    return Objects.equals(this.errors, dictionaryServiceGetMediaAdFormatResponse.errors) &&
        Objects.equals(this.rid, dictionaryServiceGetMediaAdFormatResponse.rid) &&
        Objects.equals(this.rval, dictionaryServiceGetMediaAdFormatResponse.rval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGetMediaAdFormatResponse {\n");
    
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


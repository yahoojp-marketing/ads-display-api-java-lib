package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedDataServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeedDataServiceUploadReturnValue
 */

public class FeedDataServiceUploadReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<FeedDataServiceValue>> values = JsonNullable.undefined();

  public FeedDataServiceUploadReturnValue values(List<FeedDataServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public FeedDataServiceUploadReturnValue addValuesItem(FeedDataServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<FeedDataServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<FeedDataServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDataServiceUploadReturnValue feedDataServiceUploadReturnValue = (FeedDataServiceUploadReturnValue) o;
    return Objects.equals(this.values, feedDataServiceUploadReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDataServiceUploadReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


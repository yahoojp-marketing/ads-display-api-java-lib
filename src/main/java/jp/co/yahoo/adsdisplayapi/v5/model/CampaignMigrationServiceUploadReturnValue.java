package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignMigrationServiceJobValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CampaignMigrationServiceUploadReturnValue
 */

public class CampaignMigrationServiceUploadReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<CampaignMigrationServiceJobValue>> values = JsonNullable.undefined();

  public CampaignMigrationServiceUploadReturnValue values(List<CampaignMigrationServiceJobValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public CampaignMigrationServiceUploadReturnValue addValuesItem(CampaignMigrationServiceJobValue valuesItem) {
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

  public JsonNullable<List<CampaignMigrationServiceJobValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<CampaignMigrationServiceJobValue>> values) {
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
    CampaignMigrationServiceUploadReturnValue campaignMigrationServiceUploadReturnValue = (CampaignMigrationServiceUploadReturnValue) o;
    return Objects.equals(this.values, campaignMigrationServiceUploadReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMigrationServiceUploadReturnValue {\n");
    
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


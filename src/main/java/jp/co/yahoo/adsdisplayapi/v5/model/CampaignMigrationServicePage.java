package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignMigrationServiceJobValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignMigrationServicePageオブジェクトは、マイグレーションジョブの状況を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignMigrationServicePage object contains migration job status.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignMigrationServicePageオブジェクトは、マイグレーションジョブの状況を格納するコンテナです。</div> <div lang=\"en\">CampaignMigrationServicePage object contains migration job status.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignMigrationServicePage   {
  @JsonProperty("values")
  @Valid
  private List<CampaignMigrationServiceJobValue> values = null;

  public CampaignMigrationServicePage values(List<CampaignMigrationServiceJobValue> values) {
    this.values = values;
    return this;
  }

  public CampaignMigrationServicePage addValuesItem(CampaignMigrationServiceJobValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignMigrationServiceJobValue> getValues() {
    return values;
  }

  public void setValues(List<CampaignMigrationServiceJobValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMigrationServicePage campaignMigrationServicePage = (CampaignMigrationServicePage) o;
    return Objects.equals(this.values, campaignMigrationServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMigrationServicePage {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


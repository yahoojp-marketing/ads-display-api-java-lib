package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAdCategoryValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceAdCategoryPageオブジェクトは、広告カテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceAdCategoryPage object contains ad category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceAdCategoryPageオブジェクトは、広告カテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">GuaranteedSimulationServiceAdCategoryPage object contains ad category information.</div> ")

public class GuaranteedSimulationServiceAdCategoryPage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<GuaranteedSimulationServiceAdCategoryValue>> values = JsonNullable.undefined();

  public GuaranteedSimulationServiceAdCategoryPage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public GuaranteedSimulationServiceAdCategoryPage values(List<GuaranteedSimulationServiceAdCategoryValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public GuaranteedSimulationServiceAdCategoryPage addValuesItem(GuaranteedSimulationServiceAdCategoryValue valuesItem) {
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

  public JsonNullable<List<GuaranteedSimulationServiceAdCategoryValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<GuaranteedSimulationServiceAdCategoryValue>> values) {
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
    GuaranteedSimulationServiceAdCategoryPage guaranteedSimulationServiceAdCategoryPage = (GuaranteedSimulationServiceAdCategoryPage) o;
    return Objects.equals(this.totalNumEntries, guaranteedSimulationServiceAdCategoryPage.totalNumEntries) &&
        Objects.equals(this.values, guaranteedSimulationServiceAdCategoryPage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAdCategoryPage {\n");
    
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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


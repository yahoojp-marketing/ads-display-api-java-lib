package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.StatsServicePeriod;
import jp.co.yahoo.adsdisplayapi.v6.model.StatsServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServicePage object is a container that includes the execution result of get methods (list of all entities).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">StatsServicePage object is a container that includes the execution result of get methods (list of all entities).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServicePage   {
  @JsonProperty("period")
  private StatsServicePeriod period = null;

  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<StatsServiceValue> values = null;

  public StatsServicePage period(StatsServicePeriod period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServicePeriod getPeriod() {
    return period;
  }

  public void setPeriod(StatsServicePeriod period) {
    this.period = period;
  }

  public StatsServicePage totalNumEntries(Integer totalNumEntries) {
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

  public StatsServicePage values(List<StatsServiceValue> values) {
    this.values = values;
    return this;
  }

  public StatsServicePage addValuesItem(StatsServiceValue valuesItem) {
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

  public List<StatsServiceValue> getValues() {
    return values;
  }

  public void setValues(List<StatsServiceValue> values) {
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
    StatsServicePage statsServicePage = (StatsServicePage) o;
    return Objects.equals(this.period, statsServicePage.period) &&
        Objects.equals(this.totalNumEntries, statsServicePage.totalNumEntries) &&
        Objects.equals(this.values, statsServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServicePage {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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


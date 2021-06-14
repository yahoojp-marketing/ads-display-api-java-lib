package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedInventoryServicePageオブジェクトは、取得される在庫状況に関するエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedInventoryServicePage describes the entry of inventory status to be obtained. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedInventoryServicePageオブジェクトは、取得される在庫状況に関するエントリーを表します。</div> <div lang=\"en\">GuaranteedInventoryServicePage describes the entry of inventory status to be obtained. </div> ")

public class GuaranteedInventoryServicePage   {
  @JsonProperty("totalNumEntries")
  private JsonNullable<Integer> totalNumEntries = JsonNullable.undefined();

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<GuaranteedInventoryServiceValue>> values = JsonNullable.undefined();

  public GuaranteedInventoryServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = JsonNullable.of(totalNumEntries);
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be acquired.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be acquired.</div> ")


  public JsonNullable<Integer> getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(JsonNullable<Integer> totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public GuaranteedInventoryServicePage values(List<GuaranteedInventoryServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public GuaranteedInventoryServicePage addValuesItem(GuaranteedInventoryServiceValue valuesItem) {
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

  public JsonNullable<List<GuaranteedInventoryServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<GuaranteedInventoryServiceValue>> values) {
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
    GuaranteedInventoryServicePage guaranteedInventoryServicePage = (GuaranteedInventoryServicePage) o;
    return Objects.equals(this.totalNumEntries, guaranteedInventoryServicePage.totalNumEntries) &&
        Objects.equals(this.values, guaranteedInventoryServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServicePage {\n");
    
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


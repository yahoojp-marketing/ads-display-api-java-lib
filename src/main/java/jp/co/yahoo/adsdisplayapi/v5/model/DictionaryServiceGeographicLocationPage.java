package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceGeographicLocationValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationPageオブジェクトは、地域情報のリストを取得するためのエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocationPage object displays the entry to retrieve the geographic location list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationPageオブジェクトは、地域情報のリストを取得するためのエントリーを表します。</div> <div lang=\"en\">DictionaryServiceGeographicLocationPage object displays the entry to retrieve the geographic location list.</div> ")

public class DictionaryServiceGeographicLocationPage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<DictionaryServiceGeographicLocationValue>> values = JsonNullable.undefined();

  public DictionaryServiceGeographicLocationPage totalNumEntries(Integer totalNumEntries) {
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

  public DictionaryServiceGeographicLocationPage values(List<DictionaryServiceGeographicLocationValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public DictionaryServiceGeographicLocationPage addValuesItem(DictionaryServiceGeographicLocationValue valuesItem) {
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

  public JsonNullable<List<DictionaryServiceGeographicLocationValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<DictionaryServiceGeographicLocationValue>> values) {
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
    DictionaryServiceGeographicLocationPage dictionaryServiceGeographicLocationPage = (DictionaryServiceGeographicLocationPage) o;
    return Objects.equals(this.totalNumEntries, dictionaryServiceGeographicLocationPage.totalNumEntries) &&
        Objects.equals(this.values, dictionaryServiceGeographicLocationPage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGeographicLocationPage {\n");
    
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


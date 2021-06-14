package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceFeedItemGoogleProductCategoryValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryPageオブジェクトは、FeedItemGoogleProductCategoryを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryPage object contains the FeedItemGoogleProductCategory.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceFeedItemGoogleProductCategoryPageオブジェクトは、FeedItemGoogleProductCategoryを格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategoryPage object contains the FeedItemGoogleProductCategory.</div> ")

public class DictionaryServiceFeedItemGoogleProductCategoryPage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<DictionaryServiceFeedItemGoogleProductCategoryValue>> values = JsonNullable.undefined();

  public DictionaryServiceFeedItemGoogleProductCategoryPage totalNumEntries(Integer totalNumEntries) {
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

  public DictionaryServiceFeedItemGoogleProductCategoryPage values(List<DictionaryServiceFeedItemGoogleProductCategoryValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public DictionaryServiceFeedItemGoogleProductCategoryPage addValuesItem(DictionaryServiceFeedItemGoogleProductCategoryValue valuesItem) {
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

  public JsonNullable<List<DictionaryServiceFeedItemGoogleProductCategoryValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<DictionaryServiceFeedItemGoogleProductCategoryValue>> values) {
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
    DictionaryServiceFeedItemGoogleProductCategoryPage dictionaryServiceFeedItemGoogleProductCategoryPage = (DictionaryServiceFeedItemGoogleProductCategoryPage) o;
    return Objects.equals(this.totalNumEntries, dictionaryServiceFeedItemGoogleProductCategoryPage.totalNumEntries) &&
        Objects.equals(this.values, dictionaryServiceFeedItemGoogleProductCategoryPage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceFeedItemGoogleProductCategoryPage {\n");
    
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


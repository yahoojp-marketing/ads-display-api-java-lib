package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedPreviewServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewServicePageオブジェクトは、取得される予約型キャンペーンのプレビューに関するエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedPreviewServicePage object serves the preview of guaranteed campaign entry.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewServicePageオブジェクトは、取得される予約型キャンペーンのプレビューに関するエントリーを表します。</div> <div lang=\"en\">The GuaranteedPreviewServicePage object serves the preview of guaranteed campaign entry.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedPreviewServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<GuaranteedPreviewServiceValue> values = null;

  public GuaranteedPreviewServicePage totalNumEntries(Integer totalNumEntries) {
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

  public GuaranteedPreviewServicePage values(List<GuaranteedPreviewServiceValue> values) {
    this.values = values;
    return this;
  }

  public GuaranteedPreviewServicePage addValuesItem(GuaranteedPreviewServiceValue valuesItem) {
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

  public List<GuaranteedPreviewServiceValue> getValues() {
    return values;
  }

  public void setValues(List<GuaranteedPreviewServiceValue> values) {
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
    GuaranteedPreviewServicePage guaranteedPreviewServicePage = (GuaranteedPreviewServicePage) o;
    return Objects.equals(this.totalNumEntries, guaranteedPreviewServicePage.totalNumEntries) &&
        Objects.equals(this.values, guaranteedPreviewServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreviewServicePage {\n");
    
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


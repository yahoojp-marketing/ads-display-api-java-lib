/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceMediaAdFormatValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceMediaAdFormatPageオブジェクトは、getMediaAdFormatメソッドの実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceMediaAdFormatPage object contains the results (a list of all entities) for getMediaAdFormat method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceMediaAdFormatPageオブジェクトは、getMediaAdFormatメソッドの実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">DictionaryServiceMediaAdFormatPage object contains the results (a list of all entities) for getMediaAdFormat method.</div> ")
@JsonPropertyOrder({
  DictionaryServiceMediaAdFormatPage.JSON_PROPERTY_TOTAL_NUM_ENTRIES,
  DictionaryServiceMediaAdFormatPage.JSON_PROPERTY_VALUES
})
@JsonTypeName("DictionaryServiceMediaAdFormatPage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceMediaAdFormatPage {
  public static final String JSON_PROPERTY_TOTAL_NUM_ENTRIES = "totalNumEntries";
  private Integer totalNumEntries;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<DictionaryServiceMediaAdFormatValue> values = null;

  public DictionaryServiceMediaAdFormatPage() { 
  }

  public DictionaryServiceMediaAdFormatPage totalNumEntries(Integer totalNumEntries) {
    
    this.totalNumEntries = totalNumEntries;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得される項目の総件数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of items to be retrieved.&lt;/div&gt; 
   * @return totalNumEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> ")
  @JsonProperty(JSON_PROPERTY_TOTAL_NUM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }


  public DictionaryServiceMediaAdFormatPage values(List<DictionaryServiceMediaAdFormatValue> values) {
    
    this.values = values;
    return this;
  }

  public DictionaryServiceMediaAdFormatPage addValuesItem(DictionaryServiceMediaAdFormatValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DictionaryServiceMediaAdFormatValue> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<DictionaryServiceMediaAdFormatValue> values) {
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
    DictionaryServiceMediaAdFormatPage dictionaryServiceMediaAdFormatPage = (DictionaryServiceMediaAdFormatPage) o;
    return Objects.equals(this.totalNumEntries, dictionaryServiceMediaAdFormatPage.totalNumEntries) &&
        Objects.equals(this.values, dictionaryServiceMediaAdFormatPage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceMediaAdFormatPage {\n");
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


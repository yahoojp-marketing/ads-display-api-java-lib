package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceWebConversionSnippet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceWebConversionは、ウェブページのコンバージョントラッカー情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceWebConversion object displays the Web Conversion Tracker information.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ConversionTrackerServiceWebConversionは、ウェブページのコンバージョントラッカー情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> ConversionTrackerServiceWebConversion object displays the Web Conversion Tracker information.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")

public class ConversionTrackerServiceWebConversion   {
  @JsonProperty("snippet")
  @Valid
  private JsonNullable<List<ConversionTrackerServiceWebConversionSnippet>> snippet = JsonNullable.undefined();

  public ConversionTrackerServiceWebConversion snippet(List<ConversionTrackerServiceWebConversionSnippet> snippet) {
    this.snippet = JsonNullable.of(snippet);
    return this;
  }

  public ConversionTrackerServiceWebConversion addSnippetItem(ConversionTrackerServiceWebConversionSnippet snippetItem) {
    if (this.snippet == null || !this.snippet.isPresent()) {
      this.snippet = JsonNullable.of(new ArrayList<>());
    }
    this.snippet.get().add(snippetItem);
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ConversionTrackerServiceWebConversionSnippet>> getSnippet() {
    return snippet;
  }

  public void setSnippet(JsonNullable<List<ConversionTrackerServiceWebConversionSnippet>> snippet) {
    this.snippet = snippet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceWebConversion conversionTrackerServiceWebConversion = (ConversionTrackerServiceWebConversion) o;
    return Objects.equals(this.snippet, conversionTrackerServiceWebConversion.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceWebConversion {\n");
    
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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


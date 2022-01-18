package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.ConversionTrackerServiceWebConversionSnippet;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceWebConversionは、ウェブページのコンバージョントラッカー情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceWebConversion object displays the Web Conversion Tracker information.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ConversionTrackerServiceWebConversionは、ウェブページのコンバージョントラッカー情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> ConversionTrackerServiceWebConversion object displays the Web Conversion Tracker information.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceWebConversion   {
  @JsonProperty("snippet")
  @Valid
  private List<ConversionTrackerServiceWebConversionSnippet> snippet = null;

  public ConversionTrackerServiceWebConversion snippet(List<ConversionTrackerServiceWebConversionSnippet> snippet) {
    this.snippet = snippet;
    return this;
  }

  public ConversionTrackerServiceWebConversion addSnippetItem(ConversionTrackerServiceWebConversionSnippet snippetItem) {
    if (this.snippet == null) {
      this.snippet = new ArrayList<>();
    }
    this.snippet.add(snippetItem);
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ConversionTrackerServiceWebConversionSnippet> getSnippet() {
    return snippet;
  }

  public void setSnippet(List<ConversionTrackerServiceWebConversionSnippet> snippet) {
    this.snippet = snippet;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


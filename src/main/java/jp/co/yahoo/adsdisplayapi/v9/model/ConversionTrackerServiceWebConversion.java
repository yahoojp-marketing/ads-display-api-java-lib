/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

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
import jp.co.yahoo.adsdisplayapi.v9.model.ConversionTrackerServiceWebConversionSnippet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceWebConversionは、ウェブページのコンバージョントラッカー情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceWebConversion object displays the Web Conversion Tracker information.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ConversionTrackerServiceWebConversionは、ウェブページのコンバージョントラッカー情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> ConversionTrackerServiceWebConversion object displays the Web Conversion Tracker information.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_SNIPPET
})
@JsonTypeName("ConversionTrackerServiceWebConversion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceWebConversion {
  public static final String JSON_PROPERTY_SNIPPET = "snippet";
  private List<ConversionTrackerServiceWebConversionSnippet> snippet = null;

  public ConversionTrackerServiceWebConversion() { 
  }

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceWebConversionSnippet> getSnippet() {
    return snippet;
  }


  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

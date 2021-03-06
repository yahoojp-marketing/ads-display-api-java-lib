/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceWebConversionSnippetType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceWebConversionSnippetオブジェクトは、ウェブコンバージョントラッカーのトラッキングスクリプト情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceWebConversionSnippet object displays the tracking script information of Web Conversion Tracker.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ConversionTrackerServiceWebConversionSnippetオブジェクトは、ウェブコンバージョントラッカーのトラッキングスクリプト情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> ConversionTrackerServiceWebConversionSnippet object displays the tracking script information of Web Conversion Tracker.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  ConversionTrackerServiceWebConversionSnippet.JSON_PROPERTY_TAG,
  ConversionTrackerServiceWebConversionSnippet.JSON_PROPERTY_ADVANCED_TAG,
  ConversionTrackerServiceWebConversionSnippet.JSON_PROPERTY_WEB_CONVERSION_SNIPPET_TYPE
})
@JsonTypeName("ConversionTrackerServiceWebConversionSnippet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceWebConversionSnippet {
  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_ADVANCED_TAG = "advancedTag";
  private String advancedTag;

  public static final String JSON_PROPERTY_WEB_CONVERSION_SNIPPET_TYPE = "webConversionSnippetType";
  private ConversionTrackerServiceWebConversionSnippetType webConversionSnippetType;

  public ConversionTrackerServiceWebConversionSnippet() { 
  }

  public ConversionTrackerServiceWebConversionSnippet tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 従来のコンバージョンタグです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Previous tag of Conversion.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 従来のコンバージョンタグです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Previous tag of Conversion.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public ConversionTrackerServiceWebConversionSnippet advancedTag(String advancedTag) {
    
    this.advancedTag = advancedTag;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。&lt;br&gt; 詳細は、「&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan&#x3D;ja&amp;aid&#x3D;59417\&quot;&gt;コンバージョン測定とは&lt;/a&gt;」を参照してください。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The new format of conversion tag avoids the impacts such as changes made to the browser. &lt;br&gt; More details are described on &lt;a https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan&#x3D;en&amp;aid&#x3D;33889\&quot;&gt;Conversion Analytics&lt;/a&gt;.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return advancedTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br> 詳細は、「<a href=\"https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=ja&aid=59417\">コンバージョン測定とは</a>」を参照してください。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The new format of conversion tag avoids the impacts such as changes made to the browser. <br> More details are described on <a https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=en&aid=33889\">Conversion Analytics</a>.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_ADVANCED_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdvancedTag() {
    return advancedTag;
  }


  @JsonProperty(JSON_PROPERTY_ADVANCED_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdvancedTag(String advancedTag) {
    this.advancedTag = advancedTag;
  }


  public ConversionTrackerServiceWebConversionSnippet webConversionSnippetType(ConversionTrackerServiceWebConversionSnippetType webConversionSnippetType) {
    
    this.webConversionSnippetType = webConversionSnippetType;
    return this;
  }

   /**
   * Get webConversionSnippetType
   * @return webConversionSnippetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEB_CONVERSION_SNIPPET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceWebConversionSnippetType getWebConversionSnippetType() {
    return webConversionSnippetType;
  }


  @JsonProperty(JSON_PROPERTY_WEB_CONVERSION_SNIPPET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebConversionSnippetType(ConversionTrackerServiceWebConversionSnippetType webConversionSnippetType) {
    this.webConversionSnippetType = webConversionSnippetType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceWebConversionSnippet conversionTrackerServiceWebConversionSnippet = (ConversionTrackerServiceWebConversionSnippet) o;
    return Objects.equals(this.tag, conversionTrackerServiceWebConversionSnippet.tag) &&
        Objects.equals(this.advancedTag, conversionTrackerServiceWebConversionSnippet.advancedTag) &&
        Objects.equals(this.webConversionSnippetType, conversionTrackerServiceWebConversionSnippet.webConversionSnippetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, advancedTag, webConversionSnippetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceWebConversionSnippet {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    advancedTag: ").append(toIndentedString(advancedTag)).append("\n");
    sb.append("    webConversionSnippetType: ").append(toIndentedString(webConversionSnippetType)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.ConversionTrackerServiceWebConversionSnippetType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceWebConversionSnippetオブジェクトは、ウェブコンバージョントラッカーのトラッキングスクリプト情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceWebConversionSnippet object displays the tracking script information of Web Conversion Tracker.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ConversionTrackerServiceWebConversionSnippetオブジェクトは、ウェブコンバージョントラッカーのトラッキングスクリプト情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> ConversionTrackerServiceWebConversionSnippet object displays the tracking script information of Web Conversion Tracker.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceWebConversionSnippet   {
  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("advancedTag")
  private String advancedTag = null;

  @JsonProperty("webConversionSnippetType")
  private ConversionTrackerServiceWebConversionSnippetType webConversionSnippetType = null;

  public ConversionTrackerServiceWebConversionSnippet tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <div lang=\"ja\"> 従来のコンバージョンタグです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Previous tag of Conversion.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return tag
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 従来のコンバージョンタグです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Previous tag of Conversion.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ConversionTrackerServiceWebConversionSnippet advancedTag(String advancedTag) {
    this.advancedTag = advancedTag;
    return this;
  }

  /**
   * <div lang=\"ja\"> リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br> 詳細は、「<a href=\"https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=ja&aid=59417\">コンバージョン測定とは</a>」を参照してください。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The new format of conversion tag avoids the impacts such as changes made to the browser. <br> More details are described on <a https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=en&aid=33889\">Conversion Analytics</a>.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return advancedTag
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br> 詳細は、「<a href=\"https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=ja&aid=59417\">コンバージョン測定とは</a>」を参照してください。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The new format of conversion tag avoids the impacts such as changes made to the browser. <br> More details are described on <a https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=en&aid=33889\">Conversion Analytics</a>.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAdvancedTag() {
    return advancedTag;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceWebConversionSnippetType getWebConversionSnippetType() {
    return webConversionSnippetType;
  }

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


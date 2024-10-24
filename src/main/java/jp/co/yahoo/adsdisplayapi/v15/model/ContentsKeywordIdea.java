/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordIdeaオブジェクトは、コンテンツターゲティング対象キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordIdea object is keyword for contents targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ContentsKeywordIdea.JSON_PROPERTY_VOLUME,
  ContentsKeywordIdea.JSON_PROPERTY_CREATED_DATE,
  ContentsKeywordIdea.JSON_PROPERTY_CONTENTS_KEYWORD,
  ContentsKeywordIdea.JSON_PROPERTY_CONTENTS_KEYWORD_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentsKeywordIdea {
  public static final String JSON_PROPERTY_VOLUME = "volume";
  private Long volume;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public static final String JSON_PROPERTY_CONTENTS_KEYWORD = "contentsKeyword";
  private String contentsKeyword;

  public static final String JSON_PROPERTY_CONTENTS_KEYWORD_ID = "contentsKeywordId";
  private Long contentsKeywordId;

  public ContentsKeywordIdea() {
  }

  public ContentsKeywordIdea volume(Long volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; インプレッション数です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Number of impressions. &lt;/div&gt; 
   * @return volume
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVolume() {
    return volume;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(Long volume) {
    this.volume = volume;
  }


  public ContentsKeywordIdea createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンテンツキーワード作成日です。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Created date of keyword.&lt;br&gt; * Format: yyyyMMdd&lt;/div&gt; 
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  public ContentsKeywordIdea contentsKeyword(String contentsKeyword) {
    
    this.contentsKeyword = contentsKeyword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンテンツキーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Contents keyword.&lt;/div&gt; 
   * @return contentsKeyword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentsKeyword() {
    return contentsKeyword;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsKeyword(String contentsKeyword) {
    this.contentsKeyword = contentsKeyword;
  }


  public ContentsKeywordIdea contentsKeywordId(Long contentsKeywordId) {
    
    this.contentsKeywordId = contentsKeywordId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンテンツキーワードIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Contents keyword ID.&lt;/div&gt; 
   * @return contentsKeywordId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContentsKeywordId() {
    return contentsKeywordId;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsKeywordId(Long contentsKeywordId) {
    this.contentsKeywordId = contentsKeywordId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsKeywordIdea contentsKeywordIdea = (ContentsKeywordIdea) o;
    return Objects.equals(this.volume, contentsKeywordIdea.volume) &&
        Objects.equals(this.createdDate, contentsKeywordIdea.createdDate) &&
        Objects.equals(this.contentsKeyword, contentsKeywordIdea.contentsKeyword) &&
        Objects.equals(this.contentsKeywordId, contentsKeywordIdea.contentsKeywordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, createdDate, contentsKeyword, contentsKeywordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordIdea {\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    contentsKeyword: ").append(toIndentedString(contentsKeyword)).append("\n");
    sb.append("    contentsKeywordId: ").append(toIndentedString(contentsKeywordId)).append("\n");
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


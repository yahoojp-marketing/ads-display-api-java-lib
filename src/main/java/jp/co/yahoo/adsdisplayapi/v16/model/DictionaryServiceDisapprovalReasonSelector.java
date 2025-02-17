/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v16.model.DictionaryServiceLang;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceDisapprovalReasonSelectorオブジェクトは、EditorialReason一覧を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceDisapprovalReasonSelector object is a container of EditorialReason list request.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  DictionaryServiceDisapprovalReasonSelector.JSON_PROPERTY_LANG,
  DictionaryServiceDisapprovalReasonSelector.JSON_PROPERTY_NUMBER_RESULTS,
  DictionaryServiceDisapprovalReasonSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceDisapprovalReasonSelector {
  public static final String JSON_PROPERTY_LANG = "lang";
  private DictionaryServiceLang lang;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public DictionaryServiceDisapprovalReasonSelector() {
  }

  public DictionaryServiceDisapprovalReasonSelector lang(DictionaryServiceLang lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DictionaryServiceLang getLang() {
    return lang;
  }


  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLang(DictionaryServiceLang lang) {
    this.lang = lang;
  }


  public DictionaryServiceDisapprovalReasonSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public DictionaryServiceDisapprovalReasonSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 0.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceDisapprovalReasonSelector dictionaryServiceDisapprovalReasonSelector = (DictionaryServiceDisapprovalReasonSelector) o;
    return Objects.equals(this.lang, dictionaryServiceDisapprovalReasonSelector.lang) &&
        Objects.equals(this.numberResults, dictionaryServiceDisapprovalReasonSelector.numberResults) &&
        Objects.equals(this.startIndex, dictionaryServiceDisapprovalReasonSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceDisapprovalReasonSelector {\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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


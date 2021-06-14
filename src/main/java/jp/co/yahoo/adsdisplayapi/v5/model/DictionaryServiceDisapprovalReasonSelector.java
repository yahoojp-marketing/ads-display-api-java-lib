package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceLang;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceDisapprovalReasonSelectorオブジェクトは、EditorialReason一覧を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceDisapprovalReasonSelector object is a container of EditorialReason list request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceDisapprovalReasonSelectorオブジェクトは、EditorialReason一覧を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceDisapprovalReasonSelector object is a container of EditorialReason list request.</div> ")

public class DictionaryServiceDisapprovalReasonSelector   {
  @JsonProperty("lang")
  private JsonNullable<DictionaryServiceLang> lang = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  public DictionaryServiceDisapprovalReasonSelector lang(DictionaryServiceLang lang) {
    this.lang = JsonNullable.of(lang);
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<DictionaryServiceLang> getLang() {
    return lang;
  }

  public void setLang(JsonNullable<DictionaryServiceLang> lang) {
    this.lang = lang;
  }

  public DictionaryServiceDisapprovalReasonSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }

  public DictionaryServiceDisapprovalReasonSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceDisapprovalReasonSelector dictionaryServiceDisapprovalReasonSelector = (DictionaryServiceDisapprovalReasonSelector) o;
    return Objects.equals(this.lang, dictionaryServiceDisapprovalReasonSelector.lang) &&
        Objects.equals(this.startIndex, dictionaryServiceDisapprovalReasonSelector.startIndex) &&
        Objects.equals(this.numberResults, dictionaryServiceDisapprovalReasonSelector.numberResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, startIndex, numberResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceDisapprovalReasonSelector {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
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


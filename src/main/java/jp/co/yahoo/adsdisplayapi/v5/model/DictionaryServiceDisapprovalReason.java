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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceDisapprovalReasonオブジェクトは、 EditorialReason一覧を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceDisapprovalReason object is a container of EditorialReason list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceDisapprovalReasonオブジェクトは、 EditorialReason一覧を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceDisapprovalReason object is a container of EditorialReason list.</div> ")

public class DictionaryServiceDisapprovalReason   {
  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCode")
  private JsonNullable<String> disapprovalReasonCode = JsonNullable.undefined();

  @JsonProperty("lang")
  private JsonNullable<DictionaryServiceLang> lang = JsonNullable.undefined();

  @JsonProperty("recommendation")
  private JsonNullable<String> recommendation = JsonNullable.undefined();

  @JsonProperty("title")
  private JsonNullable<String> title = JsonNullable.undefined();

  public DictionaryServiceDisapprovalReason description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由の内容です。</div> <div lang=\"en\">Description of disapproval reason.</div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由の内容です。</div> <div lang=\"en\">Description of disapproval reason.</div> ")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public DictionaryServiceDisapprovalReason disapprovalReasonCode(String disapprovalReasonCode) {
    this.disapprovalReasonCode = JsonNullable.of(disapprovalReasonCode);
    return this;
  }

  /**
   * <div lang=\"ja\">審査コードです。</div> <div lang=\"en\">Disapproval reason code.</div> 
   * @return disapprovalReasonCode
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査コードです。</div> <div lang=\"en\">Disapproval reason code.</div> ")


  public JsonNullable<String> getDisapprovalReasonCode() {
    return disapprovalReasonCode;
  }

  public void setDisapprovalReasonCode(JsonNullable<String> disapprovalReasonCode) {
    this.disapprovalReasonCode = disapprovalReasonCode;
  }

  public DictionaryServiceDisapprovalReason lang(DictionaryServiceLang lang) {
    this.lang = JsonNullable.of(lang);
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<DictionaryServiceLang> getLang() {
    return lang;
  }

  public void setLang(JsonNullable<DictionaryServiceLang> lang) {
    this.lang = lang;
  }

  public DictionaryServiceDisapprovalReason recommendation(String recommendation) {
    this.recommendation = JsonNullable.of(recommendation);
    return this;
  }

  /**
   * <div lang=\"ja\">推奨する対応方法です。</div> <div lang=\"en\">Description of recommendation.</div> 
   * @return recommendation
  */
  @ApiModelProperty(value = "<div lang=\"ja\">推奨する対応方法です。</div> <div lang=\"en\">Description of recommendation.</div> ")


  public JsonNullable<String> getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(JsonNullable<String> recommendation) {
    this.recommendation = recommendation;
  }

  public DictionaryServiceDisapprovalReason title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由のタイトルです。</div> <div lang=\"en\">Title of disapproval reason.</div> 
   * @return title
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由のタイトルです。</div> <div lang=\"en\">Title of disapproval reason.</div> ")


  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceDisapprovalReason dictionaryServiceDisapprovalReason = (DictionaryServiceDisapprovalReason) o;
    return Objects.equals(this.description, dictionaryServiceDisapprovalReason.description) &&
        Objects.equals(this.disapprovalReasonCode, dictionaryServiceDisapprovalReason.disapprovalReasonCode) &&
        Objects.equals(this.lang, dictionaryServiceDisapprovalReason.lang) &&
        Objects.equals(this.recommendation, dictionaryServiceDisapprovalReason.recommendation) &&
        Objects.equals(this.title, dictionaryServiceDisapprovalReason.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, disapprovalReasonCode, lang, recommendation, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceDisapprovalReason {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disapprovalReasonCode: ").append(toIndentedString(disapprovalReasonCode)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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


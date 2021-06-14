package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordIdeaオブジェクトは、コンテンツターゲティング対象キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordIdea object is keyword for contents targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordIdeaオブジェクトは、コンテンツターゲティング対象キーワードです。</div> <div lang=\"en\">ContentsKeywordIdea object is keyword for contents targeting.</div> ")

public class ContentsKeywordIdea   {
  @JsonProperty("volume")
  private JsonNullable<Long> volume = JsonNullable.undefined();

  @JsonProperty("createdDate")
  private JsonNullable<String> createdDate = JsonNullable.undefined();

  @JsonProperty("contentsKeyword")
  private JsonNullable<String> contentsKeyword = JsonNullable.undefined();

  @JsonProperty("contentsKeywordId")
  private JsonNullable<Long> contentsKeywordId = JsonNullable.undefined();

  public ContentsKeywordIdea volume(Long volume) {
    this.volume = JsonNullable.of(volume);
    return this;
  }

  /**
   * <div lang=\"ja\"> インプレッション数です。 </div> <div lang=\"en\"> Number of impressions. </div> 
   * @return volume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> インプレッション数です。 </div> <div lang=\"en\"> Number of impressions. </div> ")


  public JsonNullable<Long> getVolume() {
    return volume;
  }

  public void setVolume(JsonNullable<Long> volume) {
    this.volume = volume;
  }

  public ContentsKeywordIdea createdDate(String createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * <div lang=\"ja\">コンテンツキーワード作成日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Created date of keyword.<br> * Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンテンツキーワード作成日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Created date of keyword.<br> * Format: yyyyMMdd</div> ")


  public JsonNullable<String> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<String> createdDate) {
    this.createdDate = createdDate;
  }

  public ContentsKeywordIdea contentsKeyword(String contentsKeyword) {
    this.contentsKeyword = JsonNullable.of(contentsKeyword);
    return this;
  }

  /**
   * <div lang=\"ja\">コンテンツキーワードです。</div> <div lang=\"en\">Contents keyword.</div> 
   * @return contentsKeyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンテンツキーワードです。</div> <div lang=\"en\">Contents keyword.</div> ")


  public JsonNullable<String> getContentsKeyword() {
    return contentsKeyword;
  }

  public void setContentsKeyword(JsonNullable<String> contentsKeyword) {
    this.contentsKeyword = contentsKeyword;
  }

  public ContentsKeywordIdea contentsKeywordId(Long contentsKeywordId) {
    this.contentsKeywordId = JsonNullable.of(contentsKeywordId);
    return this;
  }

  /**
   * <div lang=\"ja\">コンテンツキーワードIDです。</div> <div lang=\"en\">Contents keyword ID.</div> 
   * @return contentsKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンテンツキーワードIDです。</div> <div lang=\"en\">Contents keyword ID.</div> ")


  public JsonNullable<Long> getContentsKeywordId() {
    return contentsKeywordId;
  }

  public void setContentsKeywordId(JsonNullable<Long> contentsKeywordId) {
    this.contentsKeywordId = contentsKeywordId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


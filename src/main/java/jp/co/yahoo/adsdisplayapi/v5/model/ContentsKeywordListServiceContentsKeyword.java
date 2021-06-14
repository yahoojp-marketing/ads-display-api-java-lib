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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ContentsKeywordListServiceContentsKeywordオブジェクトは、コンテンツキーワードを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ContentsKeywordListServiceContentsKeyword is an object to display the contents keyword.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ContentsKeywordListServiceContentsKeywordオブジェクトは、コンテンツキーワードを表します。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> ContentsKeywordListServiceContentsKeyword is an object to display the contents keyword.<br> This field is required in ADD and SET operation. </div> ")

public class ContentsKeywordListServiceContentsKeyword   {
  @JsonProperty("contentsKeywordId")
  private JsonNullable<Long> contentsKeywordId = JsonNullable.undefined();

  public ContentsKeywordListServiceContentsKeyword contentsKeywordId(Long contentsKeywordId) {
    this.contentsKeywordId = JsonNullable.of(contentsKeywordId);
    return this;
  }

  /**
   * <div lang=\"ja\"> コンテンツキーワードIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Contents keyword ID.<br> This field is required in ADD and SET operation. </div> 
   * @return contentsKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンテンツキーワードIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Contents keyword ID.<br> This field is required in ADD and SET operation. </div> ")


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
    ContentsKeywordListServiceContentsKeyword contentsKeywordListServiceContentsKeyword = (ContentsKeywordListServiceContentsKeyword) o;
    return Objects.equals(this.contentsKeywordId, contentsKeywordListServiceContentsKeyword.contentsKeywordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentsKeywordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordListServiceContentsKeyword {\n");
    
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


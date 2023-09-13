/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ContentsKeywordListServiceContentsKeywordオブジェクトは、コンテンツキーワードを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ContentsKeywordListServiceContentsKeyword is an object to display the contents keyword.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ContentsKeywordListServiceContentsKeywordオブジェクトは、コンテンツキーワードを表します。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> ContentsKeywordListServiceContentsKeyword is an object to display the contents keyword.<br> This field is required in ADD and SET operation. </div> ")
@JsonPropertyOrder({
  ContentsKeywordListServiceContentsKeyword.JSON_PROPERTY_CONTENTS_KEYWORD_ID
})
@JsonTypeName("ContentsKeywordListServiceContentsKeyword")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentsKeywordListServiceContentsKeyword {
  public static final String JSON_PROPERTY_CONTENTS_KEYWORD_ID = "contentsKeywordId";
  private Long contentsKeywordId;

  public ContentsKeywordListServiceContentsKeyword() { 
  }

  public ContentsKeywordListServiceContentsKeyword contentsKeywordId(Long contentsKeywordId) {
    
    this.contentsKeywordId = contentsKeywordId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンテンツキーワードIDです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Contents keyword ID.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return contentsKeywordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンテンツキーワードIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Contents keyword ID.<br> This field is required in ADD and SET operation. </div> ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


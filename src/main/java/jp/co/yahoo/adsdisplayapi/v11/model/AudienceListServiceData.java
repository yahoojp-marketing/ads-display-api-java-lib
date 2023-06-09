/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceDataオブジェクトは、オーディエンスリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceData object displays the audience list. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceDataオブジェクトは、オーディエンスリストを表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> AudienceListServiceData object displays the audience list. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
@JsonPropertyOrder({
  AudienceListServiceData.JSON_PROPERTY_AUDIENCE_LIST_ID,
  AudienceListServiceData.JSON_PROPERTY_AUDIENCE_LIST_NAME,
  AudienceListServiceData.JSON_PROPERTY_AUDIENCE_LIST_NAME_EN
})
@JsonTypeName("AudienceListServiceData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceData {
  public static final String JSON_PROPERTY_AUDIENCE_LIST_ID = "audienceListId";
  private Long audienceListId;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_NAME = "audienceListName";
  private String audienceListName;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_NAME_EN = "audienceListNameEn";
  private String audienceListNameEn;

  public AudienceListServiceData() { 
  }

  public AudienceListServiceData audienceListId(Long audienceListId) {
    
    this.audienceListId = audienceListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 組み合わせ対象のオーディエンスリストIDです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience list ID that is subject to the combination.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return audienceListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 組み合わせ対象のオーディエンスリストIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Audience list ID that is subject to the combination.<br> This field is required in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAudienceListId() {
    return audienceListId;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
  }


  public AudienceListServiceData audienceListName(String audienceListName) {
    
    this.audienceListName = audienceListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;組み合わせ対象のオーディエンスリストの名前です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Audience list name that is subject to the combination.&lt;/div&gt; 
   * @return audienceListName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">組み合わせ対象のオーディエンスリストの名前です。</div> <div lang=\"en\">Audience list name that is subject to the combination.</div> ")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudienceListName() {
    return audienceListName;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
  }


  public AudienceListServiceData audienceListNameEn(String audienceListNameEn) {
    
    this.audienceListNameEn = audienceListNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;組み合わせ対象のオーディエンスリストの名前(英語)です。&lt;br&gt; 共通オーディエンスリストの場合のみ返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Audience list name (Eng) that is subject to the combination.&lt;br&gt; This field is returned when the audience list is shared audience list. &lt;/div&gt; 
   * @return audienceListNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">組み合わせ対象のオーディエンスリストの名前(英語)です。<br> 共通オーディエンスリストの場合のみ返却されます。 </div> <div lang=\"en\">Audience list name (Eng) that is subject to the combination.<br> This field is returned when the audience list is shared audience list. </div> ")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudienceListNameEn() {
    return audienceListNameEn;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListNameEn(String audienceListNameEn) {
    this.audienceListNameEn = audienceListNameEn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceData audienceListServiceData = (AudienceListServiceData) o;
    return Objects.equals(this.audienceListId, audienceListServiceData.audienceListId) &&
        Objects.equals(this.audienceListName, audienceListServiceData.audienceListName) &&
        Objects.equals(this.audienceListNameEn, audienceListServiceData.audienceListNameEn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListId, audienceListName, audienceListNameEn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceData {\n");
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
    sb.append("    audienceListNameEn: ").append(toIndentedString(audienceListNameEn)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v17.model.DictionaryServiceSharedAudienceListType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceSharedAudienceListInfoオブジェクトは、共通オーディエンスリストの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceSharedAudienceListInfo object describes information of shared audience list.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  DictionaryServiceSharedAudienceListInfo.JSON_PROPERTY_AUDIENCE_LIST_ID,
  DictionaryServiceSharedAudienceListInfo.JSON_PROPERTY_AUDIENCE_LIST_NAME_JA,
  DictionaryServiceSharedAudienceListInfo.JSON_PROPERTY_AUDIENCE_LIST_NAME_EN,
  DictionaryServiceSharedAudienceListInfo.JSON_PROPERTY_AUDIENCE_LIST_TYPE,
  DictionaryServiceSharedAudienceListInfo.JSON_PROPERTY_REACH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceSharedAudienceListInfo {
  public static final String JSON_PROPERTY_AUDIENCE_LIST_ID = "audienceListId";
  private Long audienceListId;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_NAME_JA = "audienceListNameJa";
  private String audienceListNameJa;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_NAME_EN = "audienceListNameEn";
  private String audienceListNameEn;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_TYPE = "audienceListType";
  private DictionaryServiceSharedAudienceListType audienceListType;

  public static final String JSON_PROPERTY_REACH = "reach";
  private Long reach;

  public DictionaryServiceSharedAudienceListInfo() {
  }

  public DictionaryServiceSharedAudienceListInfo audienceListId(Long audienceListId) {
    
    this.audienceListId = audienceListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリストIDです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience list ID. &lt;/div&gt; 
   * @return audienceListId
  **/
  @jakarta.annotation.Nullable
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


  public DictionaryServiceSharedAudienceListInfo audienceListNameJa(String audienceListNameJa) {
    
    this.audienceListNameJa = audienceListNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリスト名(日本語)です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience list name(Japanese). &lt;/div&gt; 
   * @return audienceListNameJa
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudienceListNameJa() {
    return audienceListNameJa;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListNameJa(String audienceListNameJa) {
    this.audienceListNameJa = audienceListNameJa;
  }


  public DictionaryServiceSharedAudienceListInfo audienceListNameEn(String audienceListNameEn) {
    
    this.audienceListNameEn = audienceListNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリスト名(英語)です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience list name(English). &lt;/div&gt; 
   * @return audienceListNameEn
  **/
  @jakarta.annotation.Nullable
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


  public DictionaryServiceSharedAudienceListInfo audienceListType(DictionaryServiceSharedAudienceListType audienceListType) {
    
    this.audienceListType = audienceListType;
    return this;
  }

   /**
   * Get audienceListType
   * @return audienceListType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DictionaryServiceSharedAudienceListType getAudienceListType() {
    return audienceListType;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListType(DictionaryServiceSharedAudienceListType audienceListType) {
    this.audienceListType = audienceListType;
  }


  public DictionaryServiceSharedAudienceListInfo reach(Long reach) {
    
    this.reach = reach;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リーチ数です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Number of reaches. &lt;/div&gt; 
   * @return reach
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReach() {
    return reach;
  }


  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReach(Long reach) {
    this.reach = reach;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceSharedAudienceListInfo dictionaryServiceSharedAudienceListInfo = (DictionaryServiceSharedAudienceListInfo) o;
    return Objects.equals(this.audienceListId, dictionaryServiceSharedAudienceListInfo.audienceListId) &&
        Objects.equals(this.audienceListNameJa, dictionaryServiceSharedAudienceListInfo.audienceListNameJa) &&
        Objects.equals(this.audienceListNameEn, dictionaryServiceSharedAudienceListInfo.audienceListNameEn) &&
        Objects.equals(this.audienceListType, dictionaryServiceSharedAudienceListInfo.audienceListType) &&
        Objects.equals(this.reach, dictionaryServiceSharedAudienceListInfo.reach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListId, audienceListNameJa, audienceListNameEn, audienceListType, reach);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceSharedAudienceListInfo {\n");
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
    sb.append("    audienceListNameJa: ").append(toIndentedString(audienceListNameJa)).append("\n");
    sb.append("    audienceListNameEn: ").append(toIndentedString(audienceListNameEn)).append("\n");
    sb.append("    audienceListType: ").append(toIndentedString(audienceListType)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
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


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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceSharedAudienceListMasterオブジェクトは、共通オーディエンスリストマスタを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceSharedAudienceListMaster object contains shared audience list master.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  DictionaryServiceSharedAudienceListMaster.JSON_PROPERTY_AUDIENCE_LIST_ID,
  DictionaryServiceSharedAudienceListMaster.JSON_PROPERTY_AUDIENCE_LIST_NAME,
  DictionaryServiceSharedAudienceListMaster.JSON_PROPERTY_SUB_AUDIENCE_LIST_NAME,
  DictionaryServiceSharedAudienceListMaster.JSON_PROPERTY_CHILDREN,
  DictionaryServiceSharedAudienceListMaster.JSON_PROPERTY_IS_GUARANTEED_PERMITTED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceSharedAudienceListMaster {
  public static final String JSON_PROPERTY_AUDIENCE_LIST_ID = "audienceListId";
  private Long audienceListId;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_NAME = "audienceListName";
  private String audienceListName;

  public static final String JSON_PROPERTY_SUB_AUDIENCE_LIST_NAME = "subAudienceListName";
  private String subAudienceListName;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<DictionaryServiceSharedAudienceListMaster> children;

  public static final String JSON_PROPERTY_IS_GUARANTEED_PERMITTED = "isGuaranteedPermitted";
  private String isGuaranteedPermitted;

  public DictionaryServiceSharedAudienceListMaster() {
  }

  public DictionaryServiceSharedAudienceListMaster audienceListId(Long audienceListId) {
    
    this.audienceListId = audienceListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリストIDです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience List ID. &lt;/div&gt; 
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


  public DictionaryServiceSharedAudienceListMaster audienceListName(String audienceListName) {
    
    this.audienceListName = audienceListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスリスト名です&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Audience List name.&lt;/div&gt; 
   * @return audienceListName
  **/
  @jakarta.annotation.Nullable
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


  public DictionaryServiceSharedAudienceListMaster subAudienceListName(String subAudienceListName) {
    
    this.subAudienceListName = subAudienceListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サブオーディエンスリスト名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Sub-Audience List name.&lt;/div&gt; 
   * @return subAudienceListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_AUDIENCE_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubAudienceListName() {
    return subAudienceListName;
  }


  @JsonProperty(JSON_PROPERTY_SUB_AUDIENCE_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubAudienceListName(String subAudienceListName) {
    this.subAudienceListName = subAudienceListName;
  }


  public DictionaryServiceSharedAudienceListMaster children(List<DictionaryServiceSharedAudienceListMaster> children) {
    
    this.children = children;
    return this;
  }

  public DictionaryServiceSharedAudienceListMaster addChildrenItem(DictionaryServiceSharedAudienceListMaster childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;子要素としてDictionaryServiceSharedAudienceListMasterオブジェクトを使用します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceSharedAudienceListMaster object is used.&lt;/div&gt; 
   * @return children
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DictionaryServiceSharedAudienceListMaster> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(List<DictionaryServiceSharedAudienceListMaster> children) {
    this.children = children;
  }


  public DictionaryServiceSharedAudienceListMaster isGuaranteedPermitted(String isGuaranteedPermitted) {
    
    this.isGuaranteedPermitted = isGuaranteedPermitted;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;予約型販売対象を表します&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Indicates that it is subject to guaranteed sale.&lt;/div&gt; 
   * @return isGuaranteedPermitted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_GUARANTEED_PERMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsGuaranteedPermitted() {
    return isGuaranteedPermitted;
  }


  @JsonProperty(JSON_PROPERTY_IS_GUARANTEED_PERMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsGuaranteedPermitted(String isGuaranteedPermitted) {
    this.isGuaranteedPermitted = isGuaranteedPermitted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceSharedAudienceListMaster dictionaryServiceSharedAudienceListMaster = (DictionaryServiceSharedAudienceListMaster) o;
    return Objects.equals(this.audienceListId, dictionaryServiceSharedAudienceListMaster.audienceListId) &&
        Objects.equals(this.audienceListName, dictionaryServiceSharedAudienceListMaster.audienceListName) &&
        Objects.equals(this.subAudienceListName, dictionaryServiceSharedAudienceListMaster.subAudienceListName) &&
        Objects.equals(this.children, dictionaryServiceSharedAudienceListMaster.children) &&
        Objects.equals(this.isGuaranteedPermitted, dictionaryServiceSharedAudienceListMaster.isGuaranteedPermitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListId, audienceListName, subAudienceListName, children, isGuaranteedPermitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceSharedAudienceListMaster {\n");
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
    sb.append("    subAudienceListName: ").append(toIndentedString(subAudienceListName)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    isGuaranteedPermitted: ").append(toIndentedString(isGuaranteedPermitted)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryオブジェクトは、DictionaryServiceFeedItemGoogleProductCategoryを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategory object contains information about Google product category.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceFeedItemGoogleProductCategoryオブジェクトは、DictionaryServiceFeedItemGoogleProductCategoryを格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategory object contains information about Google product category.</div> ")
@JsonPropertyOrder({
  DictionaryServiceFeedItemGoogleProductCategory.JSON_PROPERTY_CHILD,
  DictionaryServiceFeedItemGoogleProductCategory.JSON_PROPERTY_FULL_NAME,
  DictionaryServiceFeedItemGoogleProductCategory.JSON_PROPERTY_ID,
  DictionaryServiceFeedItemGoogleProductCategory.JSON_PROPERTY_NAME,
  DictionaryServiceFeedItemGoogleProductCategory.JSON_PROPERTY_ORDER,
  DictionaryServiceFeedItemGoogleProductCategory.JSON_PROPERTY_PARENT
})
@JsonTypeName("DictionaryServiceFeedItemGoogleProductCategory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceFeedItemGoogleProductCategory {
  public static final String JSON_PROPERTY_CHILD = "child";
  private List<DictionaryServiceFeedItemGoogleProductCategory> child = null;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER = "order";
  private String order;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private String parent;

  public DictionaryServiceFeedItemGoogleProductCategory() { 
  }

  public DictionaryServiceFeedItemGoogleProductCategory child(List<DictionaryServiceFeedItemGoogleProductCategory> child) {
    
    this.child = child;
    return this;
  }

  public DictionaryServiceFeedItemGoogleProductCategory addChildItem(DictionaryServiceFeedItemGoogleProductCategory childItem) {
    if (this.child == null) {
      this.child = new ArrayList<>();
    }
    this.child.add(childItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;子要素としてDictionaryServiceFeedItemGoogleProductCategoryオブジェクトを使用します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategory object is used.&lt;/div&gt; 
   * @return child
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">子要素としてDictionaryServiceFeedItemGoogleProductCategoryオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategory object is used.</div> ")
  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DictionaryServiceFeedItemGoogleProductCategory> getChild() {
    return child;
  }


  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChild(List<DictionaryServiceFeedItemGoogleProductCategory> child) {
    this.child = child;
  }


  public DictionaryServiceFeedItemGoogleProductCategory fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;上位階層を含むGoogle商品カテゴリの名称です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of Google product category including parent&lt;/div&gt; 
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">上位階層を含むGoogle商品カテゴリの名称です。</div> <div lang=\"en\">Name of Google product category including parent</div> ")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public DictionaryServiceFeedItemGoogleProductCategory id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Google商品カテゴリのIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Google product category ID&lt;/div&gt; 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">Google商品カテゴリのIDです。</div> <div lang=\"en\">Google product category ID</div> ")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public DictionaryServiceFeedItemGoogleProductCategory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Google商品カテゴリの名前です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of Google product category&lt;/div&gt; 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">Google商品カテゴリの名前です。</div> <div lang=\"en\">Name of Google product category</div> ")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public DictionaryServiceFeedItemGoogleProductCategory order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;並び順を示す番号です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number that indicates the sequence&lt;/div&gt; 
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">並び順を示す番号です。</div> <div lang=\"en\">Number that indicates the sequence</div> ")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(String order) {
    this.order = order;
  }


  public DictionaryServiceFeedItemGoogleProductCategory parent(String parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;上位のGoogle商品カテゴリIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Parent Google product category ID&lt;/div&gt; 
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">上位のGoogle商品カテゴリIDです。</div> <div lang=\"en\">Parent Google product category ID</div> ")
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(String parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceFeedItemGoogleProductCategory dictionaryServiceFeedItemGoogleProductCategory = (DictionaryServiceFeedItemGoogleProductCategory) o;
    return Objects.equals(this.child, dictionaryServiceFeedItemGoogleProductCategory.child) &&
        Objects.equals(this.fullName, dictionaryServiceFeedItemGoogleProductCategory.fullName) &&
        Objects.equals(this.id, dictionaryServiceFeedItemGoogleProductCategory.id) &&
        Objects.equals(this.name, dictionaryServiceFeedItemGoogleProductCategory.name) &&
        Objects.equals(this.order, dictionaryServiceFeedItemGoogleProductCategory.order) &&
        Objects.equals(this.parent, dictionaryServiceFeedItemGoogleProductCategory.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(child, fullName, id, name, order, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceFeedItemGoogleProductCategory {\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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


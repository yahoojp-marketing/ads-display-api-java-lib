package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategoryオブジェクトは、DictionaryServiceFeedItemGoogleProductCategoryを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategory object contains information about Google Product Category.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceFeedItemGoogleProductCategoryオブジェクトは、DictionaryServiceFeedItemGoogleProductCategoryを格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategory object contains information about Google Product Category.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceFeedItemGoogleProductCategory   {
  @JsonProperty("child")
  @Valid
  private List<DictionaryServiceFeedItemGoogleProductCategory> child = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("parent")
  private String parent = null;

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
   * <div lang=\"ja\">子要素としてDictionaryServiceFeedItemGoogleProductCategoryオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategory object is used.</div> 
   * @return child
  */
  @ApiModelProperty(value = "<div lang=\"ja\">子要素としてDictionaryServiceFeedItemGoogleProductCategoryオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategory object is used.</div> ")

  @Valid

  public List<DictionaryServiceFeedItemGoogleProductCategory> getChild() {
    return child;
  }

  public void setChild(List<DictionaryServiceFeedItemGoogleProductCategory> child) {
    this.child = child;
  }

  public DictionaryServiceFeedItemGoogleProductCategory fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * <div lang=\"ja\">上位階層を含むGoogle商品カテゴリの名称です。</div> <div lang=\"en\">Name of Google Product Category including parent</div> 
   * @return fullName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">上位階層を含むGoogle商品カテゴリの名称です。</div> <div lang=\"en\">Name of Google Product Category including parent</div> ")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public DictionaryServiceFeedItemGoogleProductCategory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <div lang=\"ja\">Google商品カテゴリのIDです。</div> <div lang=\"en\">Google Product Category ID</div> 
   * @return id
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Google商品カテゴリのIDです。</div> <div lang=\"en\">Google Product Category ID</div> ")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DictionaryServiceFeedItemGoogleProductCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <div lang=\"ja\">Google商品カテゴリの名前です。</div> <div lang=\"en\">Name of Google Product Category</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Google商品カテゴリの名前です。</div> <div lang=\"en\">Name of Google Product Category</div> ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DictionaryServiceFeedItemGoogleProductCategory order(String order) {
    this.order = order;
    return this;
  }

  /**
   * <div lang=\"ja\">並び順を示す番号です。</div> <div lang=\"en\">Number that indicates the sequence</div> 
   * @return order
  */
  @ApiModelProperty(value = "<div lang=\"ja\">並び順を示す番号です。</div> <div lang=\"en\">Number that indicates the sequence</div> ")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public DictionaryServiceFeedItemGoogleProductCategory parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * <div lang=\"ja\">上位のGoogle商品カテゴリIDです。</div> <div lang=\"en\">Parent Google Product Category ID</div> 
   * @return parent
  */
  @ApiModelProperty(value = "<div lang=\"ja\">上位のGoogle商品カテゴリIDです。</div> <div lang=\"en\">Parent Google Product Category ID</div> ")


  public String getParent() {
    return parent;
  }

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


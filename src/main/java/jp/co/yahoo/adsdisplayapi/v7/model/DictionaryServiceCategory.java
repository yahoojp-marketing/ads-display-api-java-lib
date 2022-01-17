package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.DictionaryServiceCategoryChild;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceCategoryオブジェクトは、カテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceCategory object is a container of category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceCategoryオブジェクトは、カテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceCategory object is a container of category information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceCategory   {
  @JsonProperty("child")
  @Valid
  private List<DictionaryServiceCategoryChild> child = null;

  @JsonProperty("name")
  private String name = null;

  public DictionaryServiceCategory child(List<DictionaryServiceCategoryChild> child) {
    this.child = child;
    return this;
  }

  public DictionaryServiceCategory addChildItem(DictionaryServiceCategoryChild childItem) {
    if (this.child == null) {
      this.child = new ArrayList<>();
    }
    this.child.add(childItem);
    return this;
  }

  /**
   * Get child
   * @return child
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DictionaryServiceCategoryChild> getChild() {
    return child;
  }

  public void setChild(List<DictionaryServiceCategoryChild> child) {
    this.child = child;
  }

  public DictionaryServiceCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <div lang=\"ja\">最上位階層のカテゴリー名です。</div> <div lang=\"en\">DictionaryServiceCategory name in the highest level.</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最上位階層のカテゴリー名です。</div> <div lang=\"en\">DictionaryServiceCategory name in the highest level.</div> ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceCategory dictionaryServiceCategory = (DictionaryServiceCategory) o;
    return Objects.equals(this.child, dictionaryServiceCategory.child) &&
        Objects.equals(this.name, dictionaryServiceCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(child, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceCategory {\n");
    
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


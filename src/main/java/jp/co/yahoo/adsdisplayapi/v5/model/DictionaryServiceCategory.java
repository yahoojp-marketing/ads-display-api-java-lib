package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceCategoryChild;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceCategoryオブジェクトは、カテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceCategory object is a container of category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceCategoryオブジェクトは、カテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceCategory object is a container of category information.</div> ")

public class DictionaryServiceCategory   {
  @JsonProperty("child")
  @Valid
  private JsonNullable<List<DictionaryServiceCategoryChild>> child = JsonNullable.undefined();

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  public DictionaryServiceCategory child(List<DictionaryServiceCategoryChild> child) {
    this.child = JsonNullable.of(child);
    return this;
  }

  public DictionaryServiceCategory addChildItem(DictionaryServiceCategoryChild childItem) {
    if (this.child == null || !this.child.isPresent()) {
      this.child = JsonNullable.of(new ArrayList<>());
    }
    this.child.get().add(childItem);
    return this;
  }

  /**
   * Get child
   * @return child
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<DictionaryServiceCategoryChild>> getChild() {
    return child;
  }

  public void setChild(JsonNullable<List<DictionaryServiceCategoryChild>> child) {
    this.child = child;
  }

  public DictionaryServiceCategory name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * <div lang=\"ja\">最上位階層のカテゴリー名です。</div> <div lang=\"en\">DictionaryServiceCategory name in the highest level.</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最上位階層のカテゴリー名です。</div> <div lang=\"en\">DictionaryServiceCategory name in the highest level.</div> ")


  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationオブジェクトは、地域情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocation object displays the geographic location.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationオブジェクトは、地域情報を表します。</div> <div lang=\"en\">DictionaryServiceGeographicLocation object displays the geographic location.</div> ")

public class DictionaryServiceGeographicLocation   {
  @JsonProperty("child")
  @Valid
  private JsonNullable<List<DictionaryServiceGeographicLocation>> child = JsonNullable.undefined();

  @JsonProperty("code")
  private JsonNullable<String> code = JsonNullable.undefined();

  @JsonProperty("fullName")
  private JsonNullable<String> fullName = JsonNullable.undefined();

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("order")
  private JsonNullable<String> order = JsonNullable.undefined();

  @JsonProperty("parent")
  private JsonNullable<String> parent = JsonNullable.undefined();

  public DictionaryServiceGeographicLocation child(List<DictionaryServiceGeographicLocation> child) {
    this.child = JsonNullable.of(child);
    return this;
  }

  public DictionaryServiceGeographicLocation addChildItem(DictionaryServiceGeographicLocation childItem) {
    if (this.child == null || !this.child.isPresent()) {
      this.child = JsonNullable.of(new ArrayList<>());
    }
    this.child.get().add(childItem);
    return this;
  }

  /**
   * <div lang=\"ja\">子要素としてDictionaryServiceGeographicLocationオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceGeographicLocation object is used.</div> 
   * @return child
  */
  @ApiModelProperty(value = "<div lang=\"ja\">子要素としてDictionaryServiceGeographicLocationオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceGeographicLocation object is used.</div> ")

  @Valid

  public JsonNullable<List<DictionaryServiceGeographicLocation>> getChild() {
    return child;
  }

  public void setChild(JsonNullable<List<DictionaryServiceGeographicLocation>> child) {
    this.child = child;
  }

  public DictionaryServiceGeographicLocation code(String code) {
    this.code = JsonNullable.of(code);
    return this;
  }

  /**
   * <div lang=\"ja\"> 地域コードです。<br> 「その他」の地域コード(TC-CI-00000073)は、地域ターゲティングでは利用できません。 </div> <div lang=\"en\"> Geographic code.<br> The \"Other\" geo code (TC-CI-00000073) is not available for geo targeting. </div> 
   * @return code
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 地域コードです。<br> 「その他」の地域コード(TC-CI-00000073)は、地域ターゲティングでは利用できません。 </div> <div lang=\"en\"> Geographic code.<br> The \"Other\" geo code (TC-CI-00000073) is not available for geo targeting. </div> ")


  public JsonNullable<String> getCode() {
    return code;
  }

  public void setCode(JsonNullable<String> code) {
    this.code = code;
  }

  public DictionaryServiceGeographicLocation fullName(String fullName) {
    this.fullName = JsonNullable.of(fullName);
    return this;
  }

  /**
   * <div lang=\"ja\">都道府県名を含む地域名です。</div> <div lang=\"en\">Name of places including prefecture name.</div> 
   * @return fullName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">都道府県名を含む地域名です。</div> <div lang=\"en\">Name of places including prefecture name.</div> ")


  public JsonNullable<String> getFullName() {
    return fullName;
  }

  public void setFullName(JsonNullable<String> fullName) {
    this.fullName = fullName;
  }

  public DictionaryServiceGeographicLocation name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * <div lang=\"ja\">市区町村名です。</div> <div lang=\"en\">Name of places.</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">市区町村名です。</div> <div lang=\"en\">Name of places.</div> ")


  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public DictionaryServiceGeographicLocation order(String order) {
    this.order = JsonNullable.of(order);
    return this;
  }

  /**
   * <div lang=\"ja\">並び順を示す番号です。</div> <div lang=\"en\">Number indicating the order of arrangement.</div> 
   * @return order
  */
  @ApiModelProperty(value = "<div lang=\"ja\">並び順を示す番号です。</div> <div lang=\"en\">Number indicating the order of arrangement.</div> ")


  public JsonNullable<String> getOrder() {
    return order;
  }

  public void setOrder(JsonNullable<String> order) {
    this.order = order;
  }

  public DictionaryServiceGeographicLocation parent(String parent) {
    this.parent = JsonNullable.of(parent);
    return this;
  }

  /**
   * <div lang=\"ja\">上位階層の地域コードです。</div> <div lang=\"en\">Parent geographic code.</div> 
   * @return parent
  */
  @ApiModelProperty(value = "<div lang=\"ja\">上位階層の地域コードです。</div> <div lang=\"en\">Parent geographic code.</div> ")


  public JsonNullable<String> getParent() {
    return parent;
  }

  public void setParent(JsonNullable<String> parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceGeographicLocation dictionaryServiceGeographicLocation = (DictionaryServiceGeographicLocation) o;
    return Objects.equals(this.child, dictionaryServiceGeographicLocation.child) &&
        Objects.equals(this.code, dictionaryServiceGeographicLocation.code) &&
        Objects.equals(this.fullName, dictionaryServiceGeographicLocation.fullName) &&
        Objects.equals(this.name, dictionaryServiceGeographicLocation.name) &&
        Objects.equals(this.order, dictionaryServiceGeographicLocation.order) &&
        Objects.equals(this.parent, dictionaryServiceGeographicLocation.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(child, code, fullName, name, order, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGeographicLocation {\n");
    
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceCategoryChildオブジェクトは、1-5階層までのカテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceCategoryChild object is a container of category information in level 1-5.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceCategoryChildオブジェクトは、1-5階層までのカテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceCategoryChild object is a container of category information in level 1-5.</div> ")

public class DictionaryServiceCategoryChild   {
  @JsonProperty("code")
  private JsonNullable<String> code = JsonNullable.undefined();

  @JsonProperty("fullName")
  private JsonNullable<String> fullName = JsonNullable.undefined();

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("reachDesktop")
  private JsonNullable<Long> reachDesktop = JsonNullable.undefined();

  @JsonProperty("reachSmartphone")
  private JsonNullable<Long> reachSmartphone = JsonNullable.undefined();

  @JsonProperty("reachTablet")
  private JsonNullable<Long> reachTablet = JsonNullable.undefined();

  public DictionaryServiceCategoryChild code(String code) {
    this.code = JsonNullable.of(code);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリコードです。</div> <div lang=\"en\">Category code.</div> 
   * @return code
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリコードです。</div> <div lang=\"en\">Category code.</div> ")


  public JsonNullable<String> getCode() {
    return code;
  }

  public void setCode(JsonNullable<String> code) {
    this.code = code;
  }

  public DictionaryServiceCategoryChild fullName(String fullName) {
    this.fullName = JsonNullable.of(fullName);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名称です。（カテゴリ名称、サブカテゴリ名称を含めた正式名称です。）</div> <div lang=\"en\">Category name in high level.</div> 
   * @return fullName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名称です。（カテゴリ名称、サブカテゴリ名称を含めた正式名称です。）</div> <div lang=\"en\">Category name in high level.</div> ")


  public JsonNullable<String> getFullName() {
    return fullName;
  }

  public void setFullName(JsonNullable<String> fullName) {
    this.fullName = fullName;
  }

  public DictionaryServiceCategoryChild name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * <div lang=\"ja\">サブカテゴリ名称です。</div> <div lang=\"en\">Category name.</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サブカテゴリ名称です。</div> <div lang=\"en\">Category name.</div> ")


  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public DictionaryServiceCategoryChild reachDesktop(Long reachDesktop) {
    this.reachDesktop = JsonNullable.of(reachDesktop);
    return this;
  }

  /**
   * <div lang=\"ja\">PCのリーチ実績数です。</div> <div lang=\"en\">Reach record number of PC</div> 
   * @return reachDesktop
  */
  @ApiModelProperty(value = "<div lang=\"ja\">PCのリーチ実績数です。</div> <div lang=\"en\">Reach record number of PC</div> ")


  public JsonNullable<Long> getReachDesktop() {
    return reachDesktop;
  }

  public void setReachDesktop(JsonNullable<Long> reachDesktop) {
    this.reachDesktop = reachDesktop;
  }

  public DictionaryServiceCategoryChild reachSmartphone(Long reachSmartphone) {
    this.reachSmartphone = JsonNullable.of(reachSmartphone);
    return this;
  }

  /**
   * <div lang=\"ja\">スマホのリーチ実績数です。</div> <div lang=\"en\">Reach record number of smartphone</div> 
   * @return reachSmartphone
  */
  @ApiModelProperty(value = "<div lang=\"ja\">スマホのリーチ実績数です。</div> <div lang=\"en\">Reach record number of smartphone</div> ")


  public JsonNullable<Long> getReachSmartphone() {
    return reachSmartphone;
  }

  public void setReachSmartphone(JsonNullable<Long> reachSmartphone) {
    this.reachSmartphone = reachSmartphone;
  }

  public DictionaryServiceCategoryChild reachTablet(Long reachTablet) {
    this.reachTablet = JsonNullable.of(reachTablet);
    return this;
  }

  /**
   * <div lang=\"ja\">タブレットのリーチ実績数です。</div> <div lang=\"en\">Reach record number of tablet</div> 
   * @return reachTablet
  */
  @ApiModelProperty(value = "<div lang=\"ja\">タブレットのリーチ実績数です。</div> <div lang=\"en\">Reach record number of tablet</div> ")


  public JsonNullable<Long> getReachTablet() {
    return reachTablet;
  }

  public void setReachTablet(JsonNullable<Long> reachTablet) {
    this.reachTablet = reachTablet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceCategoryChild dictionaryServiceCategoryChild = (DictionaryServiceCategoryChild) o;
    return Objects.equals(this.code, dictionaryServiceCategoryChild.code) &&
        Objects.equals(this.fullName, dictionaryServiceCategoryChild.fullName) &&
        Objects.equals(this.name, dictionaryServiceCategoryChild.name) &&
        Objects.equals(this.reachDesktop, dictionaryServiceCategoryChild.reachDesktop) &&
        Objects.equals(this.reachSmartphone, dictionaryServiceCategoryChild.reachSmartphone) &&
        Objects.equals(this.reachTablet, dictionaryServiceCategoryChild.reachTablet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, fullName, name, reachDesktop, reachSmartphone, reachTablet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceCategoryChild {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reachDesktop: ").append(toIndentedString(reachDesktop)).append("\n");
    sb.append("    reachSmartphone: ").append(toIndentedString(reachSmartphone)).append("\n");
    sb.append("    reachTablet: ").append(toIndentedString(reachTablet)).append("\n");
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


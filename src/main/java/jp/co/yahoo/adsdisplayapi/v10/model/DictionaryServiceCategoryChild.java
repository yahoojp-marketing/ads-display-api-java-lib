/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceCategoryChildオブジェクトは、1-5階層までのカテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceCategoryChild object is a container of category information in level 1-5.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceCategoryChildオブジェクトは、1-5階層までのカテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceCategoryChild object is a container of category information in level 1-5.</div> ")
@JsonPropertyOrder({
  DictionaryServiceCategoryChild.JSON_PROPERTY_CODE,
  DictionaryServiceCategoryChild.JSON_PROPERTY_FULL_NAME,
  DictionaryServiceCategoryChild.JSON_PROPERTY_NAME,
  DictionaryServiceCategoryChild.JSON_PROPERTY_REACH_DESKTOP,
  DictionaryServiceCategoryChild.JSON_PROPERTY_REACH_SMARTPHONE,
  DictionaryServiceCategoryChild.JSON_PROPERTY_REACH_TABLET
})
@JsonTypeName("DictionaryServiceCategoryChild")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceCategoryChild {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REACH_DESKTOP = "reachDesktop";
  private Long reachDesktop;

  public static final String JSON_PROPERTY_REACH_SMARTPHONE = "reachSmartphone";
  private Long reachSmartphone;

  public static final String JSON_PROPERTY_REACH_TABLET = "reachTablet";
  private Long reachTablet;

  public DictionaryServiceCategoryChild() { 
  }

  public DictionaryServiceCategoryChild code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリコードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Category code.&lt;/div&gt; 
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリコードです。</div> <div lang=\"en\">Category code.</div> ")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public DictionaryServiceCategoryChild fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ名称です。（カテゴリ名称、サブカテゴリ名称を含めた正式名称です。）&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Category name in high level.&lt;/div&gt; 
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名称です。（カテゴリ名称、サブカテゴリ名称を含めた正式名称です。）</div> <div lang=\"en\">Category name in high level.</div> ")
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


  public DictionaryServiceCategoryChild name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サブカテゴリ名称です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Category name.&lt;/div&gt; 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サブカテゴリ名称です。</div> <div lang=\"en\">Category name.</div> ")
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


  public DictionaryServiceCategoryChild reachDesktop(Long reachDesktop) {
    
    this.reachDesktop = reachDesktop;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PCのリーチ実績数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reach record number of PC&lt;/div&gt; 
   * @return reachDesktop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">PCのリーチ実績数です。</div> <div lang=\"en\">Reach record number of PC</div> ")
  @JsonProperty(JSON_PROPERTY_REACH_DESKTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReachDesktop() {
    return reachDesktop;
  }


  @JsonProperty(JSON_PROPERTY_REACH_DESKTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachDesktop(Long reachDesktop) {
    this.reachDesktop = reachDesktop;
  }


  public DictionaryServiceCategoryChild reachSmartphone(Long reachSmartphone) {
    
    this.reachSmartphone = reachSmartphone;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;スマホのリーチ実績数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reach record number of smartphone&lt;/div&gt; 
   * @return reachSmartphone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">スマホのリーチ実績数です。</div> <div lang=\"en\">Reach record number of smartphone</div> ")
  @JsonProperty(JSON_PROPERTY_REACH_SMARTPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReachSmartphone() {
    return reachSmartphone;
  }


  @JsonProperty(JSON_PROPERTY_REACH_SMARTPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachSmartphone(Long reachSmartphone) {
    this.reachSmartphone = reachSmartphone;
  }


  public DictionaryServiceCategoryChild reachTablet(Long reachTablet) {
    
    this.reachTablet = reachTablet;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;タブレットのリーチ実績数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reach record number of tablet&lt;/div&gt; 
   * @return reachTablet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">タブレットのリーチ実績数です。</div> <div lang=\"en\">Reach record number of tablet</div> ")
  @JsonProperty(JSON_PROPERTY_REACH_TABLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReachTablet() {
    return reachTablet;
  }


  @JsonProperty(JSON_PROPERTY_REACH_TABLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachTablet(Long reachTablet) {
    this.reachTablet = reachTablet;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


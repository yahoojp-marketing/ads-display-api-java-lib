/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationオブジェクトは、地域情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocation object displays the geographic location.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationオブジェクトは、地域情報を表します。</div> <div lang=\"en\">DictionaryServiceGeographicLocation object displays the geographic location.</div> ")
@JsonPropertyOrder({
  DictionaryServiceGeographicLocation.JSON_PROPERTY_CHILD,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_CODE,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_FULL_NAME,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_NAME,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_ORDER,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_PARENT
})
@JsonTypeName("DictionaryServiceGeographicLocation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceGeographicLocation {
  public static final String JSON_PROPERTY_CHILD = "child";
  private List<DictionaryServiceGeographicLocation> child = null;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER = "order";
  private String order;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private String parent;

  public DictionaryServiceGeographicLocation() { 
  }

  public DictionaryServiceGeographicLocation child(List<DictionaryServiceGeographicLocation> child) {
    
    this.child = child;
    return this;
  }

  public DictionaryServiceGeographicLocation addChildItem(DictionaryServiceGeographicLocation childItem) {
    if (this.child == null) {
      this.child = new ArrayList<>();
    }
    this.child.add(childItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;子要素としてDictionaryServiceGeographicLocationオブジェクトを使用します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocation object is used.&lt;/div&gt; 
   * @return child
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">子要素としてDictionaryServiceGeographicLocationオブジェクトを使用します。</div> <div lang=\"en\">DictionaryServiceGeographicLocation object is used.</div> ")
  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DictionaryServiceGeographicLocation> getChild() {
    return child;
  }


  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChild(List<DictionaryServiceGeographicLocation> child) {
    this.child = child;
  }


  public DictionaryServiceGeographicLocation code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 地域コードです。&lt;br&gt; 「その他」の地域コード(TC-CI-00000073)は、地域ターゲティングでは利用できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Geographic code.&lt;br&gt; The \&quot;Other\&quot; geo code (TC-CI-00000073) is not available for geo targeting. &lt;/div&gt; 
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 地域コードです。<br> 「その他」の地域コード(TC-CI-00000073)は、地域ターゲティングでは利用できません。 </div> <div lang=\"en\"> Geographic code.<br> The \"Other\" geo code (TC-CI-00000073) is not available for geo targeting. </div> ")
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


  public DictionaryServiceGeographicLocation fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;都道府県名を含む地域名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of places including prefecture name.&lt;/div&gt; 
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">都道府県名を含む地域名です。</div> <div lang=\"en\">Name of places including prefecture name.</div> ")
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


  public DictionaryServiceGeographicLocation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;市区町村名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of places.&lt;/div&gt; 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">市区町村名です。</div> <div lang=\"en\">Name of places.</div> ")
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


  public DictionaryServiceGeographicLocation order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;並び順を示す番号です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number indicating the order of arrangement.&lt;/div&gt; 
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">並び順を示す番号です。</div> <div lang=\"en\">Number indicating the order of arrangement.</div> ")
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


  public DictionaryServiceGeographicLocation parent(String parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;上位階層の地域コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Parent geographic code.&lt;/div&gt; 
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">上位階層の地域コードです。</div> <div lang=\"en\">Parent geographic code.</div> ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


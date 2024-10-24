/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

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
 * ReportDefinitionServiceFieldAttribute
 */
@JsonPropertyOrder({
  ReportDefinitionServiceFieldAttribute.JSON_PROPERTY_DISPLAY_FIELD_NAME_EN,
  ReportDefinitionServiceFieldAttribute.JSON_PROPERTY_DISPLAY_FIELD_NAME_JA,
  ReportDefinitionServiceFieldAttribute.JSON_PROPERTY_FIELD_NAME,
  ReportDefinitionServiceFieldAttribute.JSON_PROPERTY_FIELD_TYPE,
  ReportDefinitionServiceFieldAttribute.JSON_PROPERTY_FILTERABLE,
  ReportDefinitionServiceFieldAttribute.JSON_PROPERTY_IMPOSSIBLE_COMBINATION_FIELDS,
  ReportDefinitionServiceFieldAttribute.JSON_PROPERTY_XML_ATTRIBUTE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceFieldAttribute {
  public static final String JSON_PROPERTY_DISPLAY_FIELD_NAME_EN = "displayFieldNameEn";
  private String displayFieldNameEn;

  public static final String JSON_PROPERTY_DISPLAY_FIELD_NAME_JA = "displayFieldNameJa";
  private String displayFieldNameJa;

  public static final String JSON_PROPERTY_FIELD_NAME = "fieldName";
  private String fieldName;

  public static final String JSON_PROPERTY_FIELD_TYPE = "fieldType";
  private String fieldType;

  public static final String JSON_PROPERTY_FILTERABLE = "filterable";
  private Boolean filterable;

  public static final String JSON_PROPERTY_IMPOSSIBLE_COMBINATION_FIELDS = "impossibleCombinationFields";
  private List<String> impossibleCombinationFields;

  public static final String JSON_PROPERTY_XML_ATTRIBUTE_NAME = "xmlAttributeName";
  private String xmlAttributeName;

  public ReportDefinitionServiceFieldAttribute() {
  }

  public ReportDefinitionServiceFieldAttribute displayFieldNameEn(String displayFieldNameEn) {
    
    this.displayFieldNameEn = displayFieldNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ダウンロードされたレポートに表示されるフィールド名（英語）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field name for the downloaded Report (English).&lt;/div&gt; 
   * @return displayFieldNameEn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayFieldNameEn() {
    return displayFieldNameEn;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayFieldNameEn(String displayFieldNameEn) {
    this.displayFieldNameEn = displayFieldNameEn;
  }


  public ReportDefinitionServiceFieldAttribute displayFieldNameJa(String displayFieldNameJa) {
    
    this.displayFieldNameJa = displayFieldNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ダウンロードされたレポートに表示されるフィールド名（日本語）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field name for the downloaded report (Japanese).&lt;/div&gt; 
   * @return displayFieldNameJa
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayFieldNameJa() {
    return displayFieldNameJa;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayFieldNameJa(String displayFieldNameJa) {
    this.displayFieldNameJa = displayFieldNameJa;
  }


  public ReportDefinitionServiceFieldAttribute fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールド名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field Name.&lt;/div&gt; 
   * @return fieldName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldName() {
    return fieldName;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public ReportDefinitionServiceFieldAttribute fieldType(String fieldType) {
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールドタイプ（数字、文字列、ENUM値など）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field type (number, string, ENUM, etc.)&lt;/div&gt; 
   * @return fieldType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }


  public ReportDefinitionServiceFieldAttribute filterable(Boolean filterable) {
    
    this.filterable = filterable;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールドのフィルター指定可否（true：フィルター指定可能なフィールド）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Whether the field filter can be specified or not (true: Filter can be specified).&lt;/div&gt; 
   * @return filterable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFilterable() {
    return filterable;
  }


  @JsonProperty(JSON_PROPERTY_FILTERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterable(Boolean filterable) {
    this.filterable = filterable;
  }


  public ReportDefinitionServiceFieldAttribute impossibleCombinationFields(List<String> impossibleCombinationFields) {
    
    this.impossibleCombinationFields = impossibleCombinationFields;
    return this;
  }

  public ReportDefinitionServiceFieldAttribute addImpossibleCombinationFieldsItem(String impossibleCombinationFieldsItem) {
    if (this.impossibleCombinationFields == null) {
      this.impossibleCombinationFields = new ArrayList<>();
    }
    this.impossibleCombinationFields.add(impossibleCombinationFieldsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;組み合わせ不可フィールドです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Invalid field combinations.&lt;/div&gt; 
   * @return impossibleCombinationFields
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPOSSIBLE_COMBINATION_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getImpossibleCombinationFields() {
    return impossibleCombinationFields;
  }


  @JsonProperty(JSON_PROPERTY_IMPOSSIBLE_COMBINATION_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpossibleCombinationFields(List<String> impossibleCombinationFields) {
    this.impossibleCombinationFields = impossibleCombinationFields;
  }


  public ReportDefinitionServiceFieldAttribute xmlAttributeName(String xmlAttributeName) {
    
    this.xmlAttributeName = xmlAttributeName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ダウンロードしたレポートのXML属性です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;XML attribute for the Downloaded Report.&lt;/div&gt; 
   * @return xmlAttributeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XML_ATTRIBUTE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXmlAttributeName() {
    return xmlAttributeName;
  }


  @JsonProperty(JSON_PROPERTY_XML_ATTRIBUTE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXmlAttributeName(String xmlAttributeName) {
    this.xmlAttributeName = xmlAttributeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceFieldAttribute reportDefinitionServiceFieldAttribute = (ReportDefinitionServiceFieldAttribute) o;
    return Objects.equals(this.displayFieldNameEn, reportDefinitionServiceFieldAttribute.displayFieldNameEn) &&
        Objects.equals(this.displayFieldNameJa, reportDefinitionServiceFieldAttribute.displayFieldNameJa) &&
        Objects.equals(this.fieldName, reportDefinitionServiceFieldAttribute.fieldName) &&
        Objects.equals(this.fieldType, reportDefinitionServiceFieldAttribute.fieldType) &&
        Objects.equals(this.filterable, reportDefinitionServiceFieldAttribute.filterable) &&
        Objects.equals(this.impossibleCombinationFields, reportDefinitionServiceFieldAttribute.impossibleCombinationFields) &&
        Objects.equals(this.xmlAttributeName, reportDefinitionServiceFieldAttribute.xmlAttributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayFieldNameEn, displayFieldNameJa, fieldName, fieldType, filterable, impossibleCombinationFields, xmlAttributeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceFieldAttribute {\n");
    sb.append("    displayFieldNameEn: ").append(toIndentedString(displayFieldNameEn)).append("\n");
    sb.append("    displayFieldNameJa: ").append(toIndentedString(displayFieldNameJa)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    filterable: ").append(toIndentedString(filterable)).append("\n");
    sb.append("    impossibleCombinationFields: ").append(toIndentedString(impossibleCombinationFields)).append("\n");
    sb.append("    xmlAttributeName: ").append(toIndentedString(xmlAttributeName)).append("\n");
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


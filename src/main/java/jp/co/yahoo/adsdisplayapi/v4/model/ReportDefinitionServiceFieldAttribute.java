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
 * ReportDefinitionServiceFieldAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceFieldAttribute   {
  @JsonProperty("displayFieldNameEN")
  private String displayFieldNameEN = null;

  @JsonProperty("displayFieldNameJA")
  private String displayFieldNameJA = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("fieldType")
  private String fieldType = null;

  @JsonProperty("filterable")
  private Boolean filterable = null;

  @JsonProperty("impossibleCombinationFields")
  @Valid
  private List<String> impossibleCombinationFields = null;

  @JsonProperty("xmlAttributeName")
  private String xmlAttributeName = null;

  public ReportDefinitionServiceFieldAttribute displayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードされたレポートに表示されるフィールド名（英語）です。</div> <div lang=\"en\">Field Name for the Downloaded Report (EN).</div> 
   * @return displayFieldNameEN
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードされたレポートに表示されるフィールド名（英語）です。</div> <div lang=\"en\">Field Name for the Downloaded Report (EN).</div> ")


  public String getDisplayFieldNameEN() {
    return displayFieldNameEN;
  }

  public void setDisplayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
  }

  public ReportDefinitionServiceFieldAttribute displayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードされたレポートに表示されるフィールド名（日本語）です。</div> <div lang=\"en\">Field Name for the Downloaded Report (JA).</div> 
   * @return displayFieldNameJA
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードされたレポートに表示されるフィールド名（日本語）です。</div> <div lang=\"en\">Field Name for the Downloaded Report (JA).</div> ")


  public String getDisplayFieldNameJA() {
    return displayFieldNameJA;
  }

  public void setDisplayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
  }

  public ReportDefinitionServiceFieldAttribute fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * <div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field Name.</div> 
   * @return fieldName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field Name.</div> ")


  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public ReportDefinitionServiceFieldAttribute fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * <div lang=\"ja\">フィールドタイプ（数字、文字列、ENUM値など）です。</div> <div lang=\"en\">Field type (number, string, ENUM, etc.)</div> 
   * @return fieldType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールドタイプ（数字、文字列、ENUM値など）です。</div> <div lang=\"en\">Field type (number, string, ENUM, etc.)</div> ")


  public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public ReportDefinitionServiceFieldAttribute filterable(Boolean filterable) {
    this.filterable = filterable;
    return this;
  }

  /**
   * <div lang=\"ja\">フィールドのフィルター指定可否（true：フィルター指定可能なフィールド）です。</div> <div lang=\"en\">Whether the field filter can be specified or not (true: Filter can be specified).</div> 
   * @return filterable
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールドのフィルター指定可否（true：フィルター指定可能なフィールド）です。</div> <div lang=\"en\">Whether the field filter can be specified or not (true: Filter can be specified).</div> ")


  public Boolean getFilterable() {
    return filterable;
  }

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
   * <div lang=\"ja\">組み合わせ不可フィールドです。</div> <div lang=\"en\">Invalid field combinations.</div> 
   * @return impossibleCombinationFields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">組み合わせ不可フィールドです。</div> <div lang=\"en\">Invalid field combinations.</div> ")


  public List<String> getImpossibleCombinationFields() {
    return impossibleCombinationFields;
  }

  public void setImpossibleCombinationFields(List<String> impossibleCombinationFields) {
    this.impossibleCombinationFields = impossibleCombinationFields;
  }

  public ReportDefinitionServiceFieldAttribute xmlAttributeName(String xmlAttributeName) {
    this.xmlAttributeName = xmlAttributeName;
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードしたレポートのXML属性です。</div> <div lang=\"en\">XML attribute for the Downloaded Report.</div> 
   * @return xmlAttributeName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードしたレポートのXML属性です。</div> <div lang=\"en\">XML attribute for the Downloaded Report.</div> ")


  public String getXmlAttributeName() {
    return xmlAttributeName;
  }

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
    return Objects.equals(this.displayFieldNameEN, reportDefinitionServiceFieldAttribute.displayFieldNameEN) &&
        Objects.equals(this.displayFieldNameJA, reportDefinitionServiceFieldAttribute.displayFieldNameJA) &&
        Objects.equals(this.fieldName, reportDefinitionServiceFieldAttribute.fieldName) &&
        Objects.equals(this.fieldType, reportDefinitionServiceFieldAttribute.fieldType) &&
        Objects.equals(this.filterable, reportDefinitionServiceFieldAttribute.filterable) &&
        Objects.equals(this.impossibleCombinationFields, reportDefinitionServiceFieldAttribute.impossibleCombinationFields) &&
        Objects.equals(this.xmlAttributeName, reportDefinitionServiceFieldAttribute.xmlAttributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayFieldNameEN, displayFieldNameJA, fieldName, fieldType, filterable, impossibleCombinationFields, xmlAttributeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceFieldAttribute {\n");
    
    sb.append("    displayFieldNameEN: ").append(toIndentedString(displayFieldNameEN)).append("\n");
    sb.append("    displayFieldNameJA: ").append(toIndentedString(displayFieldNameJA)).append("\n");
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


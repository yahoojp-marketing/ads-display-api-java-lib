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
 * ReportDefinitionServiceFieldAttribute
 */

public class ReportDefinitionServiceFieldAttribute   {
  @JsonProperty("displayFieldNameEN")
  private JsonNullable<String> displayFieldNameEN = JsonNullable.undefined();

  @JsonProperty("displayFieldNameJA")
  private JsonNullable<String> displayFieldNameJA = JsonNullable.undefined();

  @JsonProperty("fieldName")
  private JsonNullable<String> fieldName = JsonNullable.undefined();

  @JsonProperty("fieldType")
  private JsonNullable<String> fieldType = JsonNullable.undefined();

  @JsonProperty("filterable")
  private JsonNullable<Boolean> filterable = JsonNullable.undefined();

  @JsonProperty("impossibleCombinationFields")
  @Valid
  private JsonNullable<List<String>> impossibleCombinationFields = JsonNullable.undefined();

  @JsonProperty("xmlAttributeName")
  private JsonNullable<String> xmlAttributeName = JsonNullable.undefined();

  public ReportDefinitionServiceFieldAttribute displayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = JsonNullable.of(displayFieldNameEN);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードされたレポートに表示されるフィールド名（英語）です。</div> <div lang=\"en\">Field Name for the Downloaded Report (EN).</div> 
   * @return displayFieldNameEN
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードされたレポートに表示されるフィールド名（英語）です。</div> <div lang=\"en\">Field Name for the Downloaded Report (EN).</div> ")


  public JsonNullable<String> getDisplayFieldNameEN() {
    return displayFieldNameEN;
  }

  public void setDisplayFieldNameEN(JsonNullable<String> displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
  }

  public ReportDefinitionServiceFieldAttribute displayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = JsonNullable.of(displayFieldNameJA);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードされたレポートに表示されるフィールド名（日本語）です。</div> <div lang=\"en\">Field Name for the Downloaded Report (JA).</div> 
   * @return displayFieldNameJA
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードされたレポートに表示されるフィールド名（日本語）です。</div> <div lang=\"en\">Field Name for the Downloaded Report (JA).</div> ")


  public JsonNullable<String> getDisplayFieldNameJA() {
    return displayFieldNameJA;
  }

  public void setDisplayFieldNameJA(JsonNullable<String> displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
  }

  public ReportDefinitionServiceFieldAttribute fieldName(String fieldName) {
    this.fieldName = JsonNullable.of(fieldName);
    return this;
  }

  /**
   * <div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field Name.</div> 
   * @return fieldName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field Name.</div> ")


  public JsonNullable<String> getFieldName() {
    return fieldName;
  }

  public void setFieldName(JsonNullable<String> fieldName) {
    this.fieldName = fieldName;
  }

  public ReportDefinitionServiceFieldAttribute fieldType(String fieldType) {
    this.fieldType = JsonNullable.of(fieldType);
    return this;
  }

  /**
   * <div lang=\"ja\">フィールドタイプ（数字、文字列、ENUM値など）です。</div> <div lang=\"en\">Field type (number, string, ENUM, etc.)</div> 
   * @return fieldType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールドタイプ（数字、文字列、ENUM値など）です。</div> <div lang=\"en\">Field type (number, string, ENUM, etc.)</div> ")


  public JsonNullable<String> getFieldType() {
    return fieldType;
  }

  public void setFieldType(JsonNullable<String> fieldType) {
    this.fieldType = fieldType;
  }

  public ReportDefinitionServiceFieldAttribute filterable(Boolean filterable) {
    this.filterable = JsonNullable.of(filterable);
    return this;
  }

  /**
   * <div lang=\"ja\">フィールドのフィルター指定可否（true：フィルター指定可能なフィールド）です。</div> <div lang=\"en\">Whether the field filter can be specified or not (true: Filter can be specified).</div> 
   * @return filterable
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールドのフィルター指定可否（true：フィルター指定可能なフィールド）です。</div> <div lang=\"en\">Whether the field filter can be specified or not (true: Filter can be specified).</div> ")


  public JsonNullable<Boolean> getFilterable() {
    return filterable;
  }

  public void setFilterable(JsonNullable<Boolean> filterable) {
    this.filterable = filterable;
  }

  public ReportDefinitionServiceFieldAttribute impossibleCombinationFields(List<String> impossibleCombinationFields) {
    this.impossibleCombinationFields = JsonNullable.of(impossibleCombinationFields);
    return this;
  }

  public ReportDefinitionServiceFieldAttribute addImpossibleCombinationFieldsItem(String impossibleCombinationFieldsItem) {
    if (this.impossibleCombinationFields == null || !this.impossibleCombinationFields.isPresent()) {
      this.impossibleCombinationFields = JsonNullable.of(new ArrayList<>());
    }
    this.impossibleCombinationFields.get().add(impossibleCombinationFieldsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">組み合わせ不可フィールドです。</div> <div lang=\"en\">Invalid field combinations.</div> 
   * @return impossibleCombinationFields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">組み合わせ不可フィールドです。</div> <div lang=\"en\">Invalid field combinations.</div> ")


  public JsonNullable<List<String>> getImpossibleCombinationFields() {
    return impossibleCombinationFields;
  }

  public void setImpossibleCombinationFields(JsonNullable<List<String>> impossibleCombinationFields) {
    this.impossibleCombinationFields = impossibleCombinationFields;
  }

  public ReportDefinitionServiceFieldAttribute xmlAttributeName(String xmlAttributeName) {
    this.xmlAttributeName = JsonNullable.of(xmlAttributeName);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードしたレポートのXML属性です。</div> <div lang=\"en\">XML attribute for the Downloaded Report.</div> 
   * @return xmlAttributeName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードしたレポートのXML属性です。</div> <div lang=\"en\">XML attribute for the Downloaded Report.</div> ")


  public JsonNullable<String> getXmlAttributeName() {
    return xmlAttributeName;
  }

  public void setXmlAttributeName(JsonNullable<String> xmlAttributeName) {
    this.xmlAttributeName = xmlAttributeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


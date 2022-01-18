package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ReportDefinitionServiceReportSortTypeは、ソート条件を表します。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> ReportDefinitionServiceReportSortType is a sort condition type.<br>  This field is required in ADD operation.  </div> <dl class=term>   <dt class=\"term__item\">ASC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">昇順にソートされます。</span><span lang=\"en\">Sort in ascending order.</span></dd>   <dt class=\"term__item\">DESC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">降順にソートされます。</span><span lang=\"en\">Sort in descending order.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportSortType {
  
  ASC("ASC"),
  
  DESC("DESC"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportSortType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReportDefinitionServiceReportSortType fromValue(String value) {
    for (ReportDefinitionServiceReportSortType b : ReportDefinitionServiceReportSortType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


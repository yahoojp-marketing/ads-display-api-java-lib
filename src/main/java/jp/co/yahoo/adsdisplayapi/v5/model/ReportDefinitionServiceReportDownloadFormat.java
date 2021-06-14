package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ReportDefinitionServiceReportDownloadFormatは、定義されたダウンロードレポートのファイル形式を表します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> ReportDefinitionServiceReportDownloadFormat serves file format for the defined download report.<br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">CSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カンマ区分されたフォーマットです。</span><span lang=\"en\">Formats separated by commas.</span></dd>   <dt class=\"term__item\">XML</dt>   <dd class=\"term__desc\"><span lang=\"ja\">XMLフォーマットです。</span><span lang=\"en\">XML format</span></dd>   <dt class=\"term__item\">TSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">TSVフォーマットです。</span><span lang=\"en\">TSV output format.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportDownloadFormat {
  
  CSV("CSV"),
  
  XML("XML"),
  
  TSV("TSV"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportDownloadFormat(String value) {
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
  public static ReportDefinitionServiceReportDownloadFormat fromValue(String value) {
    for (ReportDefinitionServiceReportDownloadFormat b : ReportDefinitionServiceReportDownloadFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


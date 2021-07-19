package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportSkipColumnHeaderは、ヘッダー行の表示をスキップするかしないかのフラグです。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト値はFALSEとなります。</div> <div lang=\"en\">ReportDefinitionServiceReportSkipColumnHeader is a flag that indicates whether to skip the display of the header line.<br> This field is optional in ADD operation. The default value will be FALSE.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スキップします。</span><span lang=\"en\">Skip.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スキップしません。</span><span lang=\"en\">Do not skip.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportSkipColumnHeader {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportSkipColumnHeader(String value) {
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
  public static ReportDefinitionServiceReportSkipColumnHeader fromValue(String value) {
    for (ReportDefinitionServiceReportSkipColumnHeader b : ReportDefinitionServiceReportSkipColumnHeader.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


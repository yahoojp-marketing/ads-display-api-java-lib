package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportDecimalPartDisplayTypeは、小数項目の表示タイプを表します。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト値はSIMPLE_DISPLAYとなります。</div> <div lang=\"en\">ReportDefinitionServiceReportDecimalPartDisplayType describes the display type of the decimal item.<br> This field is optional in ADD operation. The default value will be SIMPLE_DISPLAY.</div> <dl class=term>   <dt class=\"term__item\">FULL_DISPLAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全て表示します。</span><span lang=\"en\">All display.</span></dd>   <dt class=\"term__item\">SIMPLE_DISPLAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">簡易表示です。</span><span lang=\"en\">Simple display.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportDecimalPartDisplayType {
  
  FULL_DISPLAY("FULL_DISPLAY"),
  
  SIMPLE_DISPLAY("SIMPLE_DISPLAY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportDecimalPartDisplayType(String value) {
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
  public static ReportDefinitionServiceReportDecimalPartDisplayType fromValue(String value) {
    for (ReportDefinitionServiceReportDecimalPartDisplayType b : ReportDefinitionServiceReportDecimalPartDisplayType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


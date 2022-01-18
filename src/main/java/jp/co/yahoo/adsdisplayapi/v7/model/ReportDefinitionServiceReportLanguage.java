package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ReportDefinitionServiceReportLanguageは、定義されたカラム名の言語です。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> ReportDefinitionServiceReportLanguage serves the language for the defined column name. <br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">EN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">英語です。</span><span lang=\"en\">English</span></dd>   <dt class=\"term__item\">JA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日本語です。</span><span lang=\"en\">Japanese</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportLanguage {
  
  JA("JA"),
  
  EN("EN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportLanguage(String value) {
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
  public static ReportDefinitionServiceReportLanguage fromValue(String value) {
    for (ReportDefinitionServiceReportLanguage b : ReportDefinitionServiceReportLanguage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ReportDefinitionServiceReportDownloadEncodeは、ダウンロードするレポートの文字コードを表します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> ReportDefinitionServiceReportDownloadEncode serves encoding for the report to be downloaded. <br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">UTF8</dt>   <dd class=\"term__desc\"><span lang=\"ja\">文字コード：UTF8です。<br>※デフォルトに設定されます。</span><span lang=\"en\">Character code: UTF8.<br>*Default setting.</span></dd>   <dt class=\"term__item\">SJIS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">文字コード：Shift-JISです。</span><span lang=\"en\">Character code: SJIS.</span></dd>   <dt class=\"term__item\">EUC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">文字コード：EUCです。</span><span lang=\"en\">Character code: EUC.</span></dd>   <dt class=\"term__item\">UTF16LE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">文字コード：UTF16LEです。</span><span lang=\"en\">Character code: UTF16LE.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportDownloadEncode {
  
  UTF8("UTF8"),
  
  SJIS("SJIS"),
  
  EUC("EUC"),
  
  UTF16LE("UTF16LE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportDownloadEncode(String value) {
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
  public static ReportDefinitionServiceReportDownloadEncode fromValue(String value) {
    for (ReportDefinitionServiceReportDownloadEncode b : ReportDefinitionServiceReportDownloadEncode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


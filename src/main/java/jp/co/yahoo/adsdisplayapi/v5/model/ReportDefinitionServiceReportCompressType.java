package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportCompressTypeは、定義されたダウンロードレポートの圧縮の有無を表します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">ReportDefinitionServiceReportCompressType displays if defined download report is compressed.<br> This field is optional in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">圧縮なしです。<br>※デフォルトに設定されます。</span><span lang=\"en\">Not compressed.<br>*Default setting.</span></dd>   <dt class=\"term__item\">ZIP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Zip圧縮されます。</span><span lang=\"en\">Compressed to Zip file.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportCompressType {
  
  NONE("NONE"),
  
  ZIP("ZIP"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportCompressType(String value) {
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
  public static ReportDefinitionServiceReportCompressType fromValue(String value) {
    for (ReportDefinitionServiceReportCompressType b : ReportDefinitionServiceReportCompressType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


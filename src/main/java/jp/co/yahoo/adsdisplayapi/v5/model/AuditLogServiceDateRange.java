package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AuditLogServiceDateRangeは、addメソッド実行時にダウンロード対象とする更新期間を保持するオブジェクトです。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AuditLogServiceDateRange object is container storing the downloading date range of add method.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AuditLogServiceDateRangeは、addメソッド実行時にダウンロード対象とする更新期間を保持するオブジェクトです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> AuditLogServiceDateRange object is container storing the downloading date range of add method.<br> This field is optional in requests. </div> ")

public class AuditLogServiceDateRange   {
  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  public AuditLogServiceDateRange endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 終了日付です。<br> このフィールドは、リクエストの場合は省略可能となります。<br> ・入力形式：Ymd形式<br> ・デフォルト値：現在の日付<br> ・指定可能範囲：現在の日付<br> ※終了日付は開始日付以降の日付を指定してください。<br> ※開始日付から終了日付の期間は最大1カ月です。 </div> <div lang=\"en\"> End date.<br> This field is optional in requests.<br> - Entry format : Ymd format<br> - Default value : Current date<br> - Available range : Current date<br> *Enter the date after Start date.<br> *Maximum length of date range between Start and End is 1 month. </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日付です。<br> このフィールドは、リクエストの場合は省略可能となります。<br> ・入力形式：Ymd形式<br> ・デフォルト値：現在の日付<br> ・指定可能範囲：現在の日付<br> ※終了日付は開始日付以降の日付を指定してください。<br> ※開始日付から終了日付の期間は最大1カ月です。 </div> <div lang=\"en\"> End date.<br> This field is optional in requests.<br> - Entry format : Ymd format<br> - Default value : Current date<br> - Available range : Current date<br> *Enter the date after Start date.<br> *Maximum length of date range between Start and End is 1 month. </div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public AuditLogServiceDateRange startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 開始日付です。<br> このフィールドは、リクエストの場合は省略可能となります。<br> ・入力形式：Ymd形式<br> ・デフォルト値：現在の日付<br> ・指定可能範囲：前月の月初<br> 例：4/30時点で、開始日付に指定できるもっとも古い日付は3/1 </div> <div lang=\"en\"> Start date.<br> This field is optional in requests.<br> - Entry format : Ymd format<br> - Default value : Current date<br> - Available range : Beginning of the last month<br> e.g.: The oldest date selectable as of April 30 is March 1. </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日付です。<br> このフィールドは、リクエストの場合は省略可能となります。<br> ・入力形式：Ymd形式<br> ・デフォルト値：現在の日付<br> ・指定可能範囲：前月の月初<br> 例：4/30時点で、開始日付に指定できるもっとも古い日付は3/1 </div> <div lang=\"en\"> Start date.<br> This field is optional in requests.<br> - Entry format : Ymd format<br> - Default value : Current date<br> - Available range : Beginning of the last month<br> e.g.: The oldest date selectable as of April 30 is March 1. </div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceDateRange auditLogServiceDateRange = (AuditLogServiceDateRange) o;
    return Objects.equals(this.endDate, auditLogServiceDateRange.endDate) &&
        Objects.equals(this.startDate, auditLogServiceDateRange.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceDateRange {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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


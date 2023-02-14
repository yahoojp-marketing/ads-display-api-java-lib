/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AuditLogServiceDateRangeは、addメソッド実行時にダウンロード対象とする更新期間を保持するオブジェクトです。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AuditLogServiceDateRange object is container storing the downloading date range of add method.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AuditLogServiceDateRangeは、addメソッド実行時にダウンロード対象とする更新期間を保持するオブジェクトです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> AuditLogServiceDateRange object is container storing the downloading date range of add method.<br> This field is optional in requests. </div> ")
@JsonPropertyOrder({
  AuditLogServiceDateRange.JSON_PROPERTY_END_DATE,
  AuditLogServiceDateRange.JSON_PROPERTY_START_DATE
})
@JsonTypeName("AuditLogServiceDateRange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditLogServiceDateRange {
  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public AuditLogServiceDateRange() { 
  }

  public AuditLogServiceDateRange endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 終了日付です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。&lt;br&gt; ・入力形式：Ymd形式&lt;br&gt; ・デフォルト値：現在の日付&lt;br&gt; ・指定可能範囲：現在の日付&lt;br&gt; ※終了日付は開始日付以降の日付を指定してください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End date.&lt;br&gt; This field is optional in requests.&lt;br&gt; - Entry format : Ymd format&lt;br&gt; - Default value : Current date&lt;br&gt; - Available range : Current date&lt;br&gt; *Enter the date after Start date. &lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日付です。<br> このフィールドは、リクエストの場合は省略可能となります。<br> ・入力形式：Ymd形式<br> ・デフォルト値：現在の日付<br> ・指定可能範囲：現在の日付<br> ※終了日付は開始日付以降の日付を指定してください。 </div> <div lang=\"en\"> End date.<br> This field is optional in requests.<br> - Entry format : Ymd format<br> - Default value : Current date<br> - Available range : Current date<br> *Enter the date after Start date. </div> ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public AuditLogServiceDateRange startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 開始日付です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。&lt;br&gt; ・入力形式：Ymd形式&lt;br&gt; ・デフォルト値：2週間前の日付&lt;br&gt; ・指定可能範囲：1年前の日付 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start date.&lt;br&gt; This field is optional in requests.&lt;br&gt; - Entry format : Ymd format&lt;br&gt; - Default value : Dated 2 weeks ago&lt;br&gt; - Available range : Date one year ago &lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日付です。<br> このフィールドは、リクエストの場合は省略可能となります。<br> ・入力形式：Ymd形式<br> ・デフォルト値：2週間前の日付<br> ・指定可能範囲：1年前の日付 </div> <div lang=\"en\"> Start date.<br> This field is optional in requests.<br> - Entry format : Ymd format<br> - Default value : Dated 2 weeks ago<br> - Available range : Date one year ago </div> ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


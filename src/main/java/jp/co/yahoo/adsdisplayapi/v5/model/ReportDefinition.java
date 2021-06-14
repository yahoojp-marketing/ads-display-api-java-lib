package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceDateRange;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceFilter;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportCompressType;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportDateRangeType;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportDecimalPartDisplayType;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportDownloadEncode;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportDownloadFormat;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportJobStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportLanguage;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportSkipColumnHeader;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportSkipReportSummary;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportSortField;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportTypeCondition;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionオブジェクトは、レポート定義を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The ReportDefinition object serves report definitions.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionオブジェクトは、レポート定義を表します。</div> <div lang=\"en\">The ReportDefinition object serves report definitions.</div> ")

public class ReportDefinition   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("completeTime")
  private JsonNullable<String> completeTime = JsonNullable.undefined();

  @JsonProperty("dateRange")
  private JsonNullable<ReportDefinitionServiceDateRange> dateRange = JsonNullable.undefined();

  @JsonProperty("fields")
  @Valid
  private JsonNullable<List<String>> fields = JsonNullable.undefined();

  @JsonProperty("filters")
  @Valid
  private JsonNullable<List<ReportDefinitionServiceFilter>> filters = JsonNullable.undefined();

  @JsonProperty("reportCompressType")
  private JsonNullable<ReportDefinitionServiceReportCompressType> reportCompressType = JsonNullable.undefined();

  @JsonProperty("reportDateRangeType")
  private JsonNullable<ReportDefinitionServiceReportDateRangeType> reportDateRangeType = JsonNullable.undefined();

  @JsonProperty("reportDownloadEncode")
  private JsonNullable<ReportDefinitionServiceReportDownloadEncode> reportDownloadEncode = JsonNullable.undefined();

  @JsonProperty("reportDownloadFormat")
  private JsonNullable<ReportDefinitionServiceReportDownloadFormat> reportDownloadFormat = JsonNullable.undefined();

  @JsonProperty("reportJobStatus")
  private JsonNullable<ReportDefinitionServiceReportJobStatus> reportJobStatus = JsonNullable.undefined();

  @JsonProperty("reportJobErrorDetail")
  private JsonNullable<String> reportJobErrorDetail = JsonNullable.undefined();

  @JsonProperty("reportJobId")
  private JsonNullable<Long> reportJobId = JsonNullable.undefined();

  @JsonProperty("reportLanguage")
  private JsonNullable<ReportDefinitionServiceReportLanguage> reportLanguage = JsonNullable.undefined();

  @JsonProperty("reportName")
  private JsonNullable<String> reportName = JsonNullable.undefined();

  @JsonProperty("requestTime")
  private JsonNullable<String> requestTime = JsonNullable.undefined();

  @JsonProperty("reportSkipColumnHeader")
  private JsonNullable<ReportDefinitionServiceReportSkipColumnHeader> reportSkipColumnHeader = JsonNullable.undefined();

  @JsonProperty("reportSkipReportSummary")
  private JsonNullable<ReportDefinitionServiceReportSkipReportSummary> reportSkipReportSummary = JsonNullable.undefined();

  @JsonProperty("reportDecimalPartDisplayType")
  private JsonNullable<ReportDefinitionServiceReportDecimalPartDisplayType> reportDecimalPartDisplayType = JsonNullable.undefined();

  @JsonProperty("reportTypeCondition")
  private JsonNullable<ReportDefinitionServiceReportTypeCondition> reportTypeCondition = JsonNullable.undefined();

  @JsonProperty("sortFields")
  @Valid
  private JsonNullable<List<ReportDefinitionServiceReportSortField>> sortFields = JsonNullable.undefined();

  public ReportDefinition accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public ReportDefinition completeTime(String completeTime) {
    this.completeTime = JsonNullable.of(completeTime);
    return this;
  }

  /**
   * <div lang=\"ja\"> ジョブ完了日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date and time of Job completion. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return completeTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ジョブ完了日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date and time of Job completion. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getCompleteTime() {
    return completeTime;
  }

  public void setCompleteTime(JsonNullable<String> completeTime) {
    this.completeTime = completeTime;
  }

  public ReportDefinition dateRange(ReportDefinitionServiceDateRange dateRange) {
    this.dateRange = JsonNullable.of(dateRange);
    return this;
  }

  /**
   * Get dateRange
   * @return dateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceDateRange> getDateRange() {
    return dateRange;
  }

  public void setDateRange(JsonNullable<ReportDefinitionServiceDateRange> dateRange) {
    this.dateRange = dateRange;
  }

  public ReportDefinition fields(List<String> fields) {
    this.fields = JsonNullable.of(fields);
    return this;
  }

  public ReportDefinition addFieldsItem(String fieldsItem) {
    if (this.fields == null || !this.fields.isPresent()) {
      this.fields = JsonNullable.of(new ArrayList<>());
    }
    this.fields.get().add(fieldsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示項目です。<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。<br> 指定可能な値は、ReportDefinitionServiceのgetReportFieldsで取得されるfieldNameをご確認ください。 </div> <div lang=\"en\"> Select the fields. <br> This field is required in ADD operation, and will be ignored in REMOVE operation.<br> * Available values can be referred to fieldName field of fields object obtained by getReportFields operation of ReportDefinitionService. </div> 
   * @return fields
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示項目です。<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。<br> 指定可能な値は、ReportDefinitionServiceのgetReportFieldsで取得されるfieldNameをご確認ください。 </div> <div lang=\"en\"> Select the fields. <br> This field is required in ADD operation, and will be ignored in REMOVE operation.<br> * Available values can be referred to fieldName field of fields object obtained by getReportFields operation of ReportDefinitionService. </div> ")


  public JsonNullable<List<String>> getFields() {
    return fields;
  }

  public void setFields(JsonNullable<List<String>> fields) {
    this.fields = fields;
  }

  public ReportDefinition filters(List<ReportDefinitionServiceFilter> filters) {
    this.filters = JsonNullable.of(filters);
    return this;
  }

  public ReportDefinition addFiltersItem(ReportDefinitionServiceFilter filtersItem) {
    if (this.filters == null || !this.filters.isPresent()) {
      this.filters = JsonNullable.of(new ArrayList<>());
    }
    this.filters.get().add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ReportDefinitionServiceFilter>> getFilters() {
    return filters;
  }

  public void setFilters(JsonNullable<List<ReportDefinitionServiceFilter>> filters) {
    this.filters = filters;
  }

  public ReportDefinition reportCompressType(ReportDefinitionServiceReportCompressType reportCompressType) {
    this.reportCompressType = JsonNullable.of(reportCompressType);
    return this;
  }

  /**
   * Get reportCompressType
   * @return reportCompressType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportCompressType> getReportCompressType() {
    return reportCompressType;
  }

  public void setReportCompressType(JsonNullable<ReportDefinitionServiceReportCompressType> reportCompressType) {
    this.reportCompressType = reportCompressType;
  }

  public ReportDefinition reportDateRangeType(ReportDefinitionServiceReportDateRangeType reportDateRangeType) {
    this.reportDateRangeType = JsonNullable.of(reportDateRangeType);
    return this;
  }

  /**
   * Get reportDateRangeType
   * @return reportDateRangeType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportDateRangeType> getReportDateRangeType() {
    return reportDateRangeType;
  }

  public void setReportDateRangeType(JsonNullable<ReportDefinitionServiceReportDateRangeType> reportDateRangeType) {
    this.reportDateRangeType = reportDateRangeType;
  }

  public ReportDefinition reportDownloadEncode(ReportDefinitionServiceReportDownloadEncode reportDownloadEncode) {
    this.reportDownloadEncode = JsonNullable.of(reportDownloadEncode);
    return this;
  }

  /**
   * Get reportDownloadEncode
   * @return reportDownloadEncode
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportDownloadEncode> getReportDownloadEncode() {
    return reportDownloadEncode;
  }

  public void setReportDownloadEncode(JsonNullable<ReportDefinitionServiceReportDownloadEncode> reportDownloadEncode) {
    this.reportDownloadEncode = reportDownloadEncode;
  }

  public ReportDefinition reportDownloadFormat(ReportDefinitionServiceReportDownloadFormat reportDownloadFormat) {
    this.reportDownloadFormat = JsonNullable.of(reportDownloadFormat);
    return this;
  }

  /**
   * Get reportDownloadFormat
   * @return reportDownloadFormat
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportDownloadFormat> getReportDownloadFormat() {
    return reportDownloadFormat;
  }

  public void setReportDownloadFormat(JsonNullable<ReportDefinitionServiceReportDownloadFormat> reportDownloadFormat) {
    this.reportDownloadFormat = reportDownloadFormat;
  }

  public ReportDefinition reportJobStatus(ReportDefinitionServiceReportJobStatus reportJobStatus) {
    this.reportJobStatus = JsonNullable.of(reportJobStatus);
    return this;
  }

  /**
   * Get reportJobStatus
   * @return reportJobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportJobStatus> getReportJobStatus() {
    return reportJobStatus;
  }

  public void setReportJobStatus(JsonNullable<ReportDefinitionServiceReportJobStatus> reportJobStatus) {
    this.reportJobStatus = reportJobStatus;
  }

  public ReportDefinition reportJobErrorDetail(String reportJobErrorDetail) {
    this.reportJobErrorDetail = JsonNullable.of(reportJobErrorDetail);
    return this;
  }

  /**
   * <div lang=\"ja\"> ジョブエラー詳細です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> 「Over limit of file size.」が返される場合は、レポートのサイズが小さくなるようにレポート作成時の条件を変更してください。 </div> <div lang=\"en\"> Job Error Detail. <br> Although this field will be returned in the response, it will be ignored on input.<br> If the message \"Over limit of file size.\" is returned, change the report creation conditions to reduce the size of the report. </div> 
   * @return reportJobErrorDetail
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ジョブエラー詳細です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> 「Over limit of file size.」が返される場合は、レポートのサイズが小さくなるようにレポート作成時の条件を変更してください。 </div> <div lang=\"en\"> Job Error Detail. <br> Although this field will be returned in the response, it will be ignored on input.<br> If the message \"Over limit of file size.\" is returned, change the report creation conditions to reduce the size of the report. </div> ")


  public JsonNullable<String> getReportJobErrorDetail() {
    return reportJobErrorDetail;
  }

  public void setReportJobErrorDetail(JsonNullable<String> reportJobErrorDetail) {
    this.reportJobErrorDetail = reportJobErrorDetail;
  }

  public ReportDefinition reportJobId(Long reportJobId) {
    this.reportJobId = JsonNullable.of(reportJobId);
    return this;
  }

  /**
   * <div lang=\"ja\"> レポートジョブIDです。<br> このフィールドは、REMOVE時に必須となり、ADD時に無視されます。 </div> <div lang=\"en\"> Report Job Id. <br> This field is required in REMOVE operation, and will be ignored in ADD operation. </div> 
   * @return reportJobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> レポートジョブIDです。<br> このフィールドは、REMOVE時に必須となり、ADD時に無視されます。 </div> <div lang=\"en\"> Report Job Id. <br> This field is required in REMOVE operation, and will be ignored in ADD operation. </div> ")


  public JsonNullable<Long> getReportJobId() {
    return reportJobId;
  }

  public void setReportJobId(JsonNullable<Long> reportJobId) {
    this.reportJobId = reportJobId;
  }

  public ReportDefinition reportLanguage(ReportDefinitionServiceReportLanguage reportLanguage) {
    this.reportLanguage = JsonNullable.of(reportLanguage);
    return this;
  }

  /**
   * Get reportLanguage
   * @return reportLanguage
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportLanguage> getReportLanguage() {
    return reportLanguage;
  }

  public void setReportLanguage(JsonNullable<ReportDefinitionServiceReportLanguage> reportLanguage) {
    this.reportLanguage = reportLanguage;
  }

  public ReportDefinition reportName(String reportName) {
    this.reportName = JsonNullable.of(reportName);
    return this;
  }

  /**
   * <div lang=\"ja\"> レポート名です。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Report name. <br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> 
   * @return reportName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> レポート名です。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Report name. <br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> ")


  public JsonNullable<String> getReportName() {
    return reportName;
  }

  public void setReportName(JsonNullable<String> reportName) {
    this.reportName = reportName;
  }

  public ReportDefinition requestTime(String requestTime) {
    this.requestTime = JsonNullable.of(requestTime);
    return this;
  }

  /**
   * <div lang=\"ja\"> ジョブ依頼日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date and time of Job request. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return requestTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ジョブ依頼日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date and time of Job request. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(JsonNullable<String> requestTime) {
    this.requestTime = requestTime;
  }

  public ReportDefinition reportSkipColumnHeader(ReportDefinitionServiceReportSkipColumnHeader reportSkipColumnHeader) {
    this.reportSkipColumnHeader = JsonNullable.of(reportSkipColumnHeader);
    return this;
  }

  /**
   * Get reportSkipColumnHeader
   * @return reportSkipColumnHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportSkipColumnHeader> getReportSkipColumnHeader() {
    return reportSkipColumnHeader;
  }

  public void setReportSkipColumnHeader(JsonNullable<ReportDefinitionServiceReportSkipColumnHeader> reportSkipColumnHeader) {
    this.reportSkipColumnHeader = reportSkipColumnHeader;
  }

  public ReportDefinition reportSkipReportSummary(ReportDefinitionServiceReportSkipReportSummary reportSkipReportSummary) {
    this.reportSkipReportSummary = JsonNullable.of(reportSkipReportSummary);
    return this;
  }

  /**
   * Get reportSkipReportSummary
   * @return reportSkipReportSummary
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportSkipReportSummary> getReportSkipReportSummary() {
    return reportSkipReportSummary;
  }

  public void setReportSkipReportSummary(JsonNullable<ReportDefinitionServiceReportSkipReportSummary> reportSkipReportSummary) {
    this.reportSkipReportSummary = reportSkipReportSummary;
  }

  public ReportDefinition reportDecimalPartDisplayType(ReportDefinitionServiceReportDecimalPartDisplayType reportDecimalPartDisplayType) {
    this.reportDecimalPartDisplayType = JsonNullable.of(reportDecimalPartDisplayType);
    return this;
  }

  /**
   * Get reportDecimalPartDisplayType
   * @return reportDecimalPartDisplayType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportDecimalPartDisplayType> getReportDecimalPartDisplayType() {
    return reportDecimalPartDisplayType;
  }

  public void setReportDecimalPartDisplayType(JsonNullable<ReportDefinitionServiceReportDecimalPartDisplayType> reportDecimalPartDisplayType) {
    this.reportDecimalPartDisplayType = reportDecimalPartDisplayType;
  }

  public ReportDefinition reportTypeCondition(ReportDefinitionServiceReportTypeCondition reportTypeCondition) {
    this.reportTypeCondition = JsonNullable.of(reportTypeCondition);
    return this;
  }

  /**
   * Get reportTypeCondition
   * @return reportTypeCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportTypeCondition> getReportTypeCondition() {
    return reportTypeCondition;
  }

  public void setReportTypeCondition(JsonNullable<ReportDefinitionServiceReportTypeCondition> reportTypeCondition) {
    this.reportTypeCondition = reportTypeCondition;
  }

  public ReportDefinition sortFields(List<ReportDefinitionServiceReportSortField> sortFields) {
    this.sortFields = JsonNullable.of(sortFields);
    return this;
  }

  public ReportDefinition addSortFieldsItem(ReportDefinitionServiceReportSortField sortFieldsItem) {
    if (this.sortFields == null || !this.sortFields.isPresent()) {
      this.sortFields = JsonNullable.of(new ArrayList<>());
    }
    this.sortFields.get().add(sortFieldsItem);
    return this;
  }

  /**
   * Get sortFields
   * @return sortFields
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public JsonNullable<List<ReportDefinitionServiceReportSortField>> getSortFields() {
    return sortFields;
  }

  public void setSortFields(JsonNullable<List<ReportDefinitionServiceReportSortField>> sortFields) {
    this.sortFields = sortFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinition reportDefinition = (ReportDefinition) o;
    return Objects.equals(this.accountId, reportDefinition.accountId) &&
        Objects.equals(this.completeTime, reportDefinition.completeTime) &&
        Objects.equals(this.dateRange, reportDefinition.dateRange) &&
        Objects.equals(this.fields, reportDefinition.fields) &&
        Objects.equals(this.filters, reportDefinition.filters) &&
        Objects.equals(this.reportCompressType, reportDefinition.reportCompressType) &&
        Objects.equals(this.reportDateRangeType, reportDefinition.reportDateRangeType) &&
        Objects.equals(this.reportDownloadEncode, reportDefinition.reportDownloadEncode) &&
        Objects.equals(this.reportDownloadFormat, reportDefinition.reportDownloadFormat) &&
        Objects.equals(this.reportJobStatus, reportDefinition.reportJobStatus) &&
        Objects.equals(this.reportJobErrorDetail, reportDefinition.reportJobErrorDetail) &&
        Objects.equals(this.reportJobId, reportDefinition.reportJobId) &&
        Objects.equals(this.reportLanguage, reportDefinition.reportLanguage) &&
        Objects.equals(this.reportName, reportDefinition.reportName) &&
        Objects.equals(this.requestTime, reportDefinition.requestTime) &&
        Objects.equals(this.reportSkipColumnHeader, reportDefinition.reportSkipColumnHeader) &&
        Objects.equals(this.reportSkipReportSummary, reportDefinition.reportSkipReportSummary) &&
        Objects.equals(this.reportDecimalPartDisplayType, reportDefinition.reportDecimalPartDisplayType) &&
        Objects.equals(this.reportTypeCondition, reportDefinition.reportTypeCondition) &&
        Objects.equals(this.sortFields, reportDefinition.sortFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, completeTime, dateRange, fields, filters, reportCompressType, reportDateRangeType, reportDownloadEncode, reportDownloadFormat, reportJobStatus, reportJobErrorDetail, reportJobId, reportLanguage, reportName, requestTime, reportSkipColumnHeader, reportSkipReportSummary, reportDecimalPartDisplayType, reportTypeCondition, sortFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinition {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    completeTime: ").append(toIndentedString(completeTime)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    reportCompressType: ").append(toIndentedString(reportCompressType)).append("\n");
    sb.append("    reportDateRangeType: ").append(toIndentedString(reportDateRangeType)).append("\n");
    sb.append("    reportDownloadEncode: ").append(toIndentedString(reportDownloadEncode)).append("\n");
    sb.append("    reportDownloadFormat: ").append(toIndentedString(reportDownloadFormat)).append("\n");
    sb.append("    reportJobStatus: ").append(toIndentedString(reportJobStatus)).append("\n");
    sb.append("    reportJobErrorDetail: ").append(toIndentedString(reportJobErrorDetail)).append("\n");
    sb.append("    reportJobId: ").append(toIndentedString(reportJobId)).append("\n");
    sb.append("    reportLanguage: ").append(toIndentedString(reportLanguage)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    reportSkipColumnHeader: ").append(toIndentedString(reportSkipColumnHeader)).append("\n");
    sb.append("    reportSkipReportSummary: ").append(toIndentedString(reportSkipReportSummary)).append("\n");
    sb.append("    reportDecimalPartDisplayType: ").append(toIndentedString(reportDecimalPartDisplayType)).append("\n");
    sb.append("    reportTypeCondition: ").append(toIndentedString(reportTypeCondition)).append("\n");
    sb.append("    sortFields: ").append(toIndentedString(sortFields)).append("\n");
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


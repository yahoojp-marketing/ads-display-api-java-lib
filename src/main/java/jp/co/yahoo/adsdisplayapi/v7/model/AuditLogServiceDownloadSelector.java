package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;操作履歴をダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Download the operation history.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">操作履歴をダウンロードします。</div> <div lang=\"en\">Download the operation history.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuditLogServiceDownloadSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("auditLogJobId")
  private Long auditLogJobId;

  public AuditLogServiceDownloadSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AuditLogServiceDownloadSelector auditLogJobId(Long auditLogJobId) {
    this.auditLogJobId = auditLogJobId;
    return this;
  }

  /**
   * <div lang=\"ja\">操作履歴のダウンロードジョブIDです。</div> <div lang=\"en\">The operation history job ID.</div> 
   * @return auditLogJobId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">操作履歴のダウンロードジョブIDです。</div> <div lang=\"en\">The operation history job ID.</div> ")
  @NotNull


  public Long getAuditLogJobId() {
    return auditLogJobId;
  }

  public void setAuditLogJobId(Long auditLogJobId) {
    this.auditLogJobId = auditLogJobId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceDownloadSelector auditLogServiceDownloadSelector = (AuditLogServiceDownloadSelector) o;
    return Objects.equals(this.accountId, auditLogServiceDownloadSelector.accountId) &&
        Objects.equals(this.auditLogJobId, auditLogServiceDownloadSelector.auditLogJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, auditLogJobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceDownloadSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    auditLogJobId: ").append(toIndentedString(auditLogJobId)).append("\n");
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


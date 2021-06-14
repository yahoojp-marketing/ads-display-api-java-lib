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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードしたオリジナルcsvファイル、またはエラーが発生したキャンペーン一覧のcsvファイルをダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Download the uploaded original csv file or the campaign list with error.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">アップロードしたオリジナルcsvファイル、またはエラーが発生したキャンペーン一覧のcsvファイルをダウンロードします。</div> <div lang=\"en\">Download the uploaded original csv file or the campaign list with error.</div> ")

public class CampaignMigrationServiceDownloadFileSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("migrationJobId")
  private Long migrationJobId;

  public CampaignMigrationServiceDownloadFileSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignMigrationServiceDownloadFileSelector migrationJobId(Long migrationJobId) {
    this.migrationJobId = migrationJobId;
    return this;
  }

  /**
   * <div lang=\"ja\">マイグレーションジョブID</div> <div lang=\"en\">Migration job ID</div> 
   * @return migrationJobId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">マイグレーションジョブID</div> <div lang=\"en\">Migration job ID</div> ")
  @NotNull


  public Long getMigrationJobId() {
    return migrationJobId;
  }

  public void setMigrationJobId(Long migrationJobId) {
    this.migrationJobId = migrationJobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMigrationServiceDownloadFileSelector campaignMigrationServiceDownloadFileSelector = (CampaignMigrationServiceDownloadFileSelector) o;
    return Objects.equals(this.accountId, campaignMigrationServiceDownloadFileSelector.accountId) &&
        Objects.equals(this.migrationJobId, campaignMigrationServiceDownloadFileSelector.migrationJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, migrationJobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMigrationServiceDownloadFileSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    migrationJobId: ").append(toIndentedString(migrationJobId)).append("\n");
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


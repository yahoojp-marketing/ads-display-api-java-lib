package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignMigrationServiceLang;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;マイグレーション対象のキャンペーン一覧をダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Download the list of campaigns targeted for migration.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">マイグレーション対象のキャンペーン一覧をダウンロードします。</div> <div lang=\"en\">Download the list of campaigns targeted for migration.</div> ")

public class CampaignMigrationServiceDownloadSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("lang")
  private JsonNullable<CampaignMigrationServiceLang> lang = JsonNullable.undefined();

  public CampaignMigrationServiceDownloadSelector accountId(Long accountId) {
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

  public CampaignMigrationServiceDownloadSelector lang(CampaignMigrationServiceLang lang) {
    this.lang = JsonNullable.of(lang);
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignMigrationServiceLang> getLang() {
    return lang;
  }

  public void setLang(JsonNullable<CampaignMigrationServiceLang> lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMigrationServiceDownloadSelector campaignMigrationServiceDownloadSelector = (CampaignMigrationServiceDownloadSelector) o;
    return Objects.equals(this.accountId, campaignMigrationServiceDownloadSelector.accountId) &&
        Objects.equals(this.lang, campaignMigrationServiceDownloadSelector.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMigrationServiceDownloadSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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


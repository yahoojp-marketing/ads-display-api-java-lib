package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.SearchLiftServiceKeyword;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchLiftオブジェクトは、サーチリフトの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchLift object describes information about the search lift.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchLiftオブジェクトは、サーチリフトの情報を表します。</div> <div lang=\"en\">SearchLift object describes information about the search lift.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchLift   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("searchLiftId")
  private Long searchLiftId = null;

  @JsonProperty("keywords")
  @Valid
  private List<SearchLiftServiceKeyword> keywords = null;

  public SearchLift accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public SearchLift campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID. </div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public SearchLift searchLiftId(Long searchLiftId) {
    this.searchLiftId = searchLiftId;
    return this;
  }

  /**
   * <div lang=\"ja\">サーチリフト調査IDです。</div> <div lang=\"en\">SearchLift ID. </div> 
   * @return searchLiftId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチリフト調査IDです。</div> <div lang=\"en\">SearchLift ID. </div> ")


  public Long getSearchLiftId() {
    return searchLiftId;
  }

  public void setSearchLiftId(Long searchLiftId) {
    this.searchLiftId = searchLiftId;
  }

  public SearchLift keywords(List<SearchLiftServiceKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public SearchLift addKeywordsItem(SearchLiftServiceKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Get keywords
   * @return keywords
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SearchLiftServiceKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<SearchLiftServiceKeyword> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchLift searchLift = (SearchLift) o;
    return Objects.equals(this.accountId, searchLift.accountId) &&
        Objects.equals(this.campaignId, searchLift.campaignId) &&
        Objects.equals(this.searchLiftId, searchLift.searchLiftId) &&
        Objects.equals(this.keywords, searchLift.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, searchLiftId, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchLift {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    searchLiftId: ").append(toIndentedString(searchLiftId)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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


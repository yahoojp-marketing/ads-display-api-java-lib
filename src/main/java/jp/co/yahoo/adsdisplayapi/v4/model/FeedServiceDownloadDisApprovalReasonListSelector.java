package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feed情報の審査否認理由をダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Download the disapproval reason list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Feed情報の審査否認理由をダウンロードします。</div> <div lang=\"en\">Download the disapproval reason list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedServiceDownloadDisApprovalReasonListSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("feedId")
  private Long feedId;

  public FeedServiceDownloadDisApprovalReasonListSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public FeedServiceDownloadDisApprovalReasonListSelector feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：フィードIDです。</div> <div lang=\"en\">Search condition: Feed ID.</div> 
   * @return feedId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：フィードIDです。</div> <div lang=\"en\">Search condition: Feed ID.</div> ")
  @NotNull


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedServiceDownloadDisApprovalReasonListSelector feedServiceDownloadDisApprovalReasonListSelector = (FeedServiceDownloadDisApprovalReasonListSelector) o;
    return Objects.equals(this.accountId, feedServiceDownloadDisApprovalReasonListSelector.accountId) &&
        Objects.equals(this.feedId, feedServiceDownloadDisApprovalReasonListSelector.feedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, feedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedServiceDownloadDisApprovalReasonListSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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


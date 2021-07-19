package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品情報のエラーファイルダウンロード処理を実施します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedDataServiceDownloadErrorFileSelector object retains search condition of downloadErrorFile operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">商品情報のエラーファイルダウンロード処理を実施します。</div> <div lang=\"en\">FeedDataServiceDownloadErrorFileSelector object retains search condition of downloadErrorFile operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedDataServiceDownloadErrorFileSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("itemListUploadId")
  private Long itemListUploadId;

  public FeedDataServiceDownloadErrorFileSelector accountId(Long accountId) {
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

  public FeedDataServiceDownloadErrorFileSelector itemListUploadId(Long itemListUploadId) {
    this.itemListUploadId = itemListUploadId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アップロードした商品情報を識別するID</div> <div lang=\"en\">Search condition: Uploaded item list ID.</div> 
   * @return itemListUploadId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アップロードした商品情報を識別するID</div> <div lang=\"en\">Search condition: Uploaded item list ID.</div> ")
  @NotNull


  public Long getItemListUploadId() {
    return itemListUploadId;
  }

  public void setItemListUploadId(Long itemListUploadId) {
    this.itemListUploadId = itemListUploadId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDataServiceDownloadErrorFileSelector feedDataServiceDownloadErrorFileSelector = (FeedDataServiceDownloadErrorFileSelector) o;
    return Objects.equals(this.accountId, feedDataServiceDownloadErrorFileSelector.accountId) &&
        Objects.equals(this.itemListUploadId, feedDataServiceDownloadErrorFileSelector.itemListUploadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, itemListUploadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDataServiceDownloadErrorFileSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    itemListUploadId: ").append(toIndentedString(itemListUploadId)).append("\n");
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


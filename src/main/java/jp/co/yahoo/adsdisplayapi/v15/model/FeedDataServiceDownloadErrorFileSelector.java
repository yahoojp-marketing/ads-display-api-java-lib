/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品情報のエラーファイルダウンロード処理を実施します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedDataServiceDownloadErrorFileSelector object retains search condition of downloadErrorFile operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">商品情報のエラーファイルダウンロード処理を実施します。</div> <div lang=\"en\">FeedDataServiceDownloadErrorFileSelector object retains search condition of downloadErrorFile operation.</div> ")
@JsonPropertyOrder({
  FeedDataServiceDownloadErrorFileSelector.JSON_PROPERTY_ACCOUNT_ID,
  FeedDataServiceDownloadErrorFileSelector.JSON_PROPERTY_ITEM_LIST_UPLOAD_ID
})
@JsonTypeName("FeedDataServiceDownloadErrorFileSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedDataServiceDownloadErrorFileSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ITEM_LIST_UPLOAD_ID = "itemListUploadId";
  private Long itemListUploadId;

  public FeedDataServiceDownloadErrorFileSelector() { 
  }

  public FeedDataServiceDownloadErrorFileSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public FeedDataServiceDownloadErrorFileSelector itemListUploadId(Long itemListUploadId) {
    
    this.itemListUploadId = itemListUploadId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アップロードした商品情報を識別するID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Uploaded item list ID.&lt;/div&gt; 
   * @return itemListUploadId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アップロードした商品情報を識別するID</div> <div lang=\"en\">Search condition: Uploaded item list ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getItemListUploadId() {
    return itemListUploadId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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


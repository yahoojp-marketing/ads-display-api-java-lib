/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v8.model.SearchKeywordListServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v8.model.SearchKeywordListServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v8.model.SearchKeywordListServiceKeywordFrequency;
import jp.co.yahoo.adsdisplayapi.v8.model.SearchKeywordListServiceKeywordRecency;
import jp.co.yahoo.adsdisplayapi.v8.model.SearchKeywordListServiceSearchKeyword;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordListオブジェクトは、サーチキーワードリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordList object displays the search list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordListオブジェクトは、サーチキーワードリストを表します。</div> <div lang=\"en\">SearchKeywordList object displays the search list.</div> ")
@JsonPropertyOrder({
  SearchKeywordList.JSON_PROPERTY_ACCOUNT_ID,
  SearchKeywordList.JSON_PROPERTY_DELIVERY_STATUS,
  SearchKeywordList.JSON_PROPERTY_KEYWORD_FREQUENCY,
  SearchKeywordList.JSON_PROPERTY_KEYWORD_RECENCY,
  SearchKeywordList.JSON_PROPERTY_SEARCH_KEYWORD,
  SearchKeywordList.JSON_PROPERTY_SEARCH_KEYWORD_LIST_DESCRIPTION,
  SearchKeywordList.JSON_PROPERTY_IS_REMOVE_SEARCH_KEYWORD_LIST_DESCRIPTION,
  SearchKeywordList.JSON_PROPERTY_SEARCH_KEYWORD_LIST_ID,
  SearchKeywordList.JSON_PROPERTY_SEARCH_KEYWORD_LIST_NAME
})
@JsonTypeName("SearchKeywordList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchKeywordList {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_DELIVERY_STATUS = "deliveryStatus";
  private SearchKeywordListServiceDeliveryStatus deliveryStatus;

  public static final String JSON_PROPERTY_KEYWORD_FREQUENCY = "keywordFrequency";
  private SearchKeywordListServiceKeywordFrequency keywordFrequency;

  public static final String JSON_PROPERTY_KEYWORD_RECENCY = "keywordRecency";
  private SearchKeywordListServiceKeywordRecency keywordRecency;

  public static final String JSON_PROPERTY_SEARCH_KEYWORD = "searchKeyword";
  private List<SearchKeywordListServiceSearchKeyword> searchKeyword = null;

  public static final String JSON_PROPERTY_SEARCH_KEYWORD_LIST_DESCRIPTION = "searchKeywordListDescription";
  private String searchKeywordListDescription;

  public static final String JSON_PROPERTY_IS_REMOVE_SEARCH_KEYWORD_LIST_DESCRIPTION = "isRemoveSearchKeywordListDescription";
  private SearchKeywordListServiceIsRemoveFlg isRemoveSearchKeywordListDescription;

  public static final String JSON_PROPERTY_SEARCH_KEYWORD_LIST_ID = "searchKeywordListId";
  private Long searchKeywordListId;

  public static final String JSON_PROPERTY_SEARCH_KEYWORD_LIST_NAME = "searchKeywordListName";
  private String searchKeywordListName;

  public SearchKeywordList() { 
  }

  public SearchKeywordList accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public SearchKeywordList deliveryStatus(SearchKeywordListServiceDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchKeywordListServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatus(SearchKeywordListServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public SearchKeywordList keywordFrequency(SearchKeywordListServiceKeywordFrequency keywordFrequency) {
    
    this.keywordFrequency = keywordFrequency;
    return this;
  }

   /**
   * Get keywordFrequency
   * @return keywordFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchKeywordListServiceKeywordFrequency getKeywordFrequency() {
    return keywordFrequency;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordFrequency(SearchKeywordListServiceKeywordFrequency keywordFrequency) {
    this.keywordFrequency = keywordFrequency;
  }


  public SearchKeywordList keywordRecency(SearchKeywordListServiceKeywordRecency keywordRecency) {
    
    this.keywordRecency = keywordRecency;
    return this;
  }

   /**
   * Get keywordRecency
   * @return keywordRecency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_RECENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchKeywordListServiceKeywordRecency getKeywordRecency() {
    return keywordRecency;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_RECENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordRecency(SearchKeywordListServiceKeywordRecency keywordRecency) {
    this.keywordRecency = keywordRecency;
  }


  public SearchKeywordList searchKeyword(List<SearchKeywordListServiceSearchKeyword> searchKeyword) {
    
    this.searchKeyword = searchKeyword;
    return this;
  }

  public SearchKeywordList addSearchKeywordItem(SearchKeywordListServiceSearchKeyword searchKeywordItem) {
    if (this.searchKeyword == null) {
      this.searchKeyword = new ArrayList<>();
    }
    this.searchKeyword.add(searchKeywordItem);
    return this;
  }

   /**
   * Get searchKeyword
   * @return searchKeyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SearchKeywordListServiceSearchKeyword> getSearchKeyword() {
    return searchKeyword;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeyword(List<SearchKeywordListServiceSearchKeyword> searchKeyword) {
    this.searchKeyword = searchKeyword;
  }


  public SearchKeywordList searchKeywordListDescription(String searchKeywordListDescription) {
    
    this.searchKeywordListDescription = searchKeywordListDescription;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サーチキーワードリストの説明文です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Description of Search keyword list.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return searchKeywordListDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリストの説明文です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Description of Search keyword list.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchKeywordListDescription() {
    return searchKeywordListDescription;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeywordListDescription(String searchKeywordListDescription) {
    this.searchKeywordListDescription = searchKeywordListDescription;
  }


  public SearchKeywordList isRemoveSearchKeywordListDescription(SearchKeywordListServiceIsRemoveFlg isRemoveSearchKeywordListDescription) {
    
    this.isRemoveSearchKeywordListDescription = isRemoveSearchKeywordListDescription;
    return this;
  }

   /**
   * Get isRemoveSearchKeywordListDescription
   * @return isRemoveSearchKeywordListDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SEARCH_KEYWORD_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchKeywordListServiceIsRemoveFlg getIsRemoveSearchKeywordListDescription() {
    return isRemoveSearchKeywordListDescription;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SEARCH_KEYWORD_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveSearchKeywordListDescription(SearchKeywordListServiceIsRemoveFlg isRemoveSearchKeywordListDescription) {
    this.isRemoveSearchKeywordListDescription = isRemoveSearchKeywordListDescription;
  }


  public SearchKeywordList searchKeywordListId(Long searchKeywordListId) {
    
    this.searchKeywordListId = searchKeywordListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サーチキーワードリストIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Search keyword list ID.&lt;br&gt; This field is required in SET and REMOVE operation. &lt;/div&gt; 
   * @return searchKeywordListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Search keyword list ID.<br> This field is required in SET and REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSearchKeywordListId() {
    return searchKeywordListId;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeywordListId(Long searchKeywordListId) {
    this.searchKeywordListId = searchKeywordListId;
  }


  public SearchKeywordList searchKeywordListName(String searchKeywordListName) {
    
    this.searchKeywordListName = searchKeywordListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サーチキーワードリスト名です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Name of Search keyword list.&lt;br&gt; This field is required in ADD operation, and is optional in SET operation. &lt;/div&gt; 
   * @return searchKeywordListName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリスト名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Name of Search keyword list.<br> This field is required in ADD operation, and is optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchKeywordListName() {
    return searchKeywordListName;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeywordListName(String searchKeywordListName) {
    this.searchKeywordListName = searchKeywordListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordList searchKeywordList = (SearchKeywordList) o;
    return Objects.equals(this.accountId, searchKeywordList.accountId) &&
        Objects.equals(this.deliveryStatus, searchKeywordList.deliveryStatus) &&
        Objects.equals(this.keywordFrequency, searchKeywordList.keywordFrequency) &&
        Objects.equals(this.keywordRecency, searchKeywordList.keywordRecency) &&
        Objects.equals(this.searchKeyword, searchKeywordList.searchKeyword) &&
        Objects.equals(this.searchKeywordListDescription, searchKeywordList.searchKeywordListDescription) &&
        Objects.equals(this.isRemoveSearchKeywordListDescription, searchKeywordList.isRemoveSearchKeywordListDescription) &&
        Objects.equals(this.searchKeywordListId, searchKeywordList.searchKeywordListId) &&
        Objects.equals(this.searchKeywordListName, searchKeywordList.searchKeywordListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, deliveryStatus, keywordFrequency, keywordRecency, searchKeyword, searchKeywordListDescription, isRemoveSearchKeywordListDescription, searchKeywordListId, searchKeywordListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordList {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    keywordFrequency: ").append(toIndentedString(keywordFrequency)).append("\n");
    sb.append("    keywordRecency: ").append(toIndentedString(keywordRecency)).append("\n");
    sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
    sb.append("    searchKeywordListDescription: ").append(toIndentedString(searchKeywordListDescription)).append("\n");
    sb.append("    isRemoveSearchKeywordListDescription: ").append(toIndentedString(isRemoveSearchKeywordListDescription)).append("\n");
    sb.append("    searchKeywordListId: ").append(toIndentedString(searchKeywordListId)).append("\n");
    sb.append("    searchKeywordListName: ").append(toIndentedString(searchKeywordListName)).append("\n");
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


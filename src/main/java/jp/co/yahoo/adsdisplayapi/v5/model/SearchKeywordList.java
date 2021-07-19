package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordListServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordListServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordListServiceKeywordFrequency;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordListServiceKeywordRecency;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordListServiceSearchKeyword;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordListオブジェクトは、サーチキーワードリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordList object displays the search list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordListオブジェクトは、サーチキーワードリストを表します。</div> <div lang=\"en\">SearchKeywordList object displays the search list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchKeywordList   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("deliveryStatus")
  private SearchKeywordListServiceDeliveryStatus deliveryStatus = null;

  @JsonProperty("keywordFrequency")
  private SearchKeywordListServiceKeywordFrequency keywordFrequency = null;

  @JsonProperty("keywordRecency")
  private SearchKeywordListServiceKeywordRecency keywordRecency = null;

  @JsonProperty("searchKeyword")
  @Valid
  private List<SearchKeywordListServiceSearchKeyword> searchKeyword = null;

  @JsonProperty("searchKeywordListDescription")
  private String searchKeywordListDescription = null;

  @JsonProperty("isRemoveSearchKeywordListDescription")
  private SearchKeywordListServiceIsRemoveFlg isRemoveSearchKeywordListDescription = null;

  @JsonProperty("searchKeywordListId")
  private Long searchKeywordListId = null;

  @JsonProperty("searchKeywordListName")
  private String searchKeywordListName = null;

  public SearchKeywordList accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")


  public Long getAccountId() {
    return accountId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordListServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordListServiceKeywordFrequency getKeywordFrequency() {
    return keywordFrequency;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordListServiceKeywordRecency getKeywordRecency() {
    return keywordRecency;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SearchKeywordListServiceSearchKeyword> getSearchKeyword() {
    return searchKeyword;
  }

  public void setSearchKeyword(List<SearchKeywordListServiceSearchKeyword> searchKeyword) {
    this.searchKeyword = searchKeyword;
  }

  public SearchKeywordList searchKeywordListDescription(String searchKeywordListDescription) {
    this.searchKeywordListDescription = searchKeywordListDescription;
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードリストの説明文です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Description of Search keyword list.<br> This field is optional in ADD and SET operation. </div> 
   * @return searchKeywordListDescription
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリストの説明文です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Description of Search keyword list.<br> This field is optional in ADD and SET operation. </div> ")


  public String getSearchKeywordListDescription() {
    return searchKeywordListDescription;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordListServiceIsRemoveFlg getIsRemoveSearchKeywordListDescription() {
    return isRemoveSearchKeywordListDescription;
  }

  public void setIsRemoveSearchKeywordListDescription(SearchKeywordListServiceIsRemoveFlg isRemoveSearchKeywordListDescription) {
    this.isRemoveSearchKeywordListDescription = isRemoveSearchKeywordListDescription;
  }

  public SearchKeywordList searchKeywordListId(Long searchKeywordListId) {
    this.searchKeywordListId = searchKeywordListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Search keyword list ID.<br> This field is required in SET and REMOVE operation. </div> 
   * @return searchKeywordListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Search keyword list ID.<br> This field is required in SET and REMOVE operation. </div> ")


  public Long getSearchKeywordListId() {
    return searchKeywordListId;
  }

  public void setSearchKeywordListId(Long searchKeywordListId) {
    this.searchKeywordListId = searchKeywordListId;
  }

  public SearchKeywordList searchKeywordListName(String searchKeywordListName) {
    this.searchKeywordListName = searchKeywordListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> サーチキーワードリスト名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Name of Search keyword list.<br> This field is required in ADD operation, and is optional in SET operation. </div> 
   * @return searchKeywordListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サーチキーワードリスト名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Name of Search keyword list.<br> This field is required in ADD operation, and is optional in SET operation. </div> ")


  public String getSearchKeywordListName() {
    return searchKeywordListName;
  }

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


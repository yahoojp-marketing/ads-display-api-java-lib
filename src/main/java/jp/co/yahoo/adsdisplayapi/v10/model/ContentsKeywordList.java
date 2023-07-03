/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v10.model.ContentsKeywordListServiceContentsKeyword;
import jp.co.yahoo.adsdisplayapi.v10.model.ContentsKeywordListServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordListオブジェクトは、コンテンツキーワードリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordList object displays the contents keyword list.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ContentsKeywordList.JSON_PROPERTY_ACCOUNT_ID,
  ContentsKeywordList.JSON_PROPERTY_CONTENTS_KEYWORD,
  ContentsKeywordList.JSON_PROPERTY_CONTENTS_KEYWORD_LIST_DESCRIPTION,
  ContentsKeywordList.JSON_PROPERTY_IS_REMOVE_CONTENTS_KEYWORD_LIST_DESCRIPTION,
  ContentsKeywordList.JSON_PROPERTY_CONTENTS_KEYWORD_LIST_ID,
  ContentsKeywordList.JSON_PROPERTY_CONTENTS_KEYWORD_LIST_NAME,
  ContentsKeywordList.JSON_PROPERTY_BRAND_SAFETY_DENY_LIST_FLG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentsKeywordList {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CONTENTS_KEYWORD = "contentsKeyword";
  private List<ContentsKeywordListServiceContentsKeyword> contentsKeyword;

  public static final String JSON_PROPERTY_CONTENTS_KEYWORD_LIST_DESCRIPTION = "contentsKeywordListDescription";
  private String contentsKeywordListDescription;

  public static final String JSON_PROPERTY_IS_REMOVE_CONTENTS_KEYWORD_LIST_DESCRIPTION = "isRemoveContentsKeywordListDescription";
  private ContentsKeywordListServiceIsRemoveFlg isRemoveContentsKeywordListDescription;

  public static final String JSON_PROPERTY_CONTENTS_KEYWORD_LIST_ID = "contentsKeywordListId";
  private Long contentsKeywordListId;

  public static final String JSON_PROPERTY_CONTENTS_KEYWORD_LIST_NAME = "contentsKeywordListName";
  private String contentsKeywordListName;

  public static final String JSON_PROPERTY_BRAND_SAFETY_DENY_LIST_FLG = "brandSafetyDenyListFlg";
  private Boolean brandSafetyDenyListFlg;

  public ContentsKeywordList() {
  }

  public ContentsKeywordList accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
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


  public ContentsKeywordList contentsKeyword(List<ContentsKeywordListServiceContentsKeyword> contentsKeyword) {
    
    this.contentsKeyword = contentsKeyword;
    return this;
  }

  public ContentsKeywordList addContentsKeywordItem(ContentsKeywordListServiceContentsKeyword contentsKeywordItem) {
    if (this.contentsKeyword == null) {
      this.contentsKeyword = new ArrayList<>();
    }
    this.contentsKeyword.add(contentsKeywordItem);
    return this;
  }

   /**
   * Get contentsKeyword
   * @return contentsKeyword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ContentsKeywordListServiceContentsKeyword> getContentsKeyword() {
    return contentsKeyword;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsKeyword(List<ContentsKeywordListServiceContentsKeyword> contentsKeyword) {
    this.contentsKeyword = contentsKeyword;
  }


  public ContentsKeywordList contentsKeywordListDescription(String contentsKeywordListDescription) {
    
    this.contentsKeywordListDescription = contentsKeywordListDescription;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンテンツキーワードリストの説明文です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Description of Contents keyword list.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return contentsKeywordListDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentsKeywordListDescription() {
    return contentsKeywordListDescription;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsKeywordListDescription(String contentsKeywordListDescription) {
    this.contentsKeywordListDescription = contentsKeywordListDescription;
  }


  public ContentsKeywordList isRemoveContentsKeywordListDescription(ContentsKeywordListServiceIsRemoveFlg isRemoveContentsKeywordListDescription) {
    
    this.isRemoveContentsKeywordListDescription = isRemoveContentsKeywordListDescription;
    return this;
  }

   /**
   * Get isRemoveContentsKeywordListDescription
   * @return isRemoveContentsKeywordListDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONTENTS_KEYWORD_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentsKeywordListServiceIsRemoveFlg getIsRemoveContentsKeywordListDescription() {
    return isRemoveContentsKeywordListDescription;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CONTENTS_KEYWORD_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveContentsKeywordListDescription(ContentsKeywordListServiceIsRemoveFlg isRemoveContentsKeywordListDescription) {
    this.isRemoveContentsKeywordListDescription = isRemoveContentsKeywordListDescription;
  }


  public ContentsKeywordList contentsKeywordListId(Long contentsKeywordListId) {
    
    this.contentsKeywordListId = contentsKeywordListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンテンツキーワードリストIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Contents keyword list ID.&lt;br&gt; This field is required in SET and REMOVE operation. &lt;/div&gt; 
   * @return contentsKeywordListId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContentsKeywordListId() {
    return contentsKeywordListId;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsKeywordListId(Long contentsKeywordListId) {
    this.contentsKeywordListId = contentsKeywordListId;
  }


  public ContentsKeywordList contentsKeywordListName(String contentsKeywordListName) {
    
    this.contentsKeywordListName = contentsKeywordListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンテンツキーワードリスト名です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Name of Contents keyword list.&lt;br&gt; This field is required in ADD operation, and is optional in SET operation. &lt;/div&gt; 
   * @return contentsKeywordListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentsKeywordListName() {
    return contentsKeywordListName;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsKeywordListName(String contentsKeywordListName) {
    this.contentsKeywordListName = contentsKeywordListName;
  }


  public ContentsKeywordList brandSafetyDenyListFlg(Boolean brandSafetyDenyListFlg) {
    
    this.brandSafetyDenyListFlg = brandSafetyDenyListFlg;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 除外専用リストかどうかのフラグです。&lt;br&gt; 除外専用リストには下記の制約があります。&lt;br&gt; ・１アカウントにつき1つ作成が可能です。&lt;br&gt; ・除外にのみ紐付け可能です。&lt;br&gt; このフィールドは、ADD時に省略可能(デフォルトの値はFALSE)、SET時に指定不可となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; A flag that indicates whether it is an exclusion list. &lt;br&gt; Exclusion list includes the following restrictions: &lt;br&gt; *Only one list can be created per account. &lt;br&gt; *Can be linked only to exclusion. &lt;br&gt; This field is optional in ADD operation (default value will be FALSE), and cannot be specified in SET operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;除外専用リストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Exclusion list.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;通常のurlリストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Standard URL list.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
   * @return brandSafetyDenyListFlg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_SAFETY_DENY_LIST_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBrandSafetyDenyListFlg() {
    return brandSafetyDenyListFlg;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_SAFETY_DENY_LIST_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandSafetyDenyListFlg(Boolean brandSafetyDenyListFlg) {
    this.brandSafetyDenyListFlg = brandSafetyDenyListFlg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsKeywordList contentsKeywordList = (ContentsKeywordList) o;
    return Objects.equals(this.accountId, contentsKeywordList.accountId) &&
        Objects.equals(this.contentsKeyword, contentsKeywordList.contentsKeyword) &&
        Objects.equals(this.contentsKeywordListDescription, contentsKeywordList.contentsKeywordListDescription) &&
        Objects.equals(this.isRemoveContentsKeywordListDescription, contentsKeywordList.isRemoveContentsKeywordListDescription) &&
        Objects.equals(this.contentsKeywordListId, contentsKeywordList.contentsKeywordListId) &&
        Objects.equals(this.contentsKeywordListName, contentsKeywordList.contentsKeywordListName) &&
        Objects.equals(this.brandSafetyDenyListFlg, contentsKeywordList.brandSafetyDenyListFlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, contentsKeyword, contentsKeywordListDescription, isRemoveContentsKeywordListDescription, contentsKeywordListId, contentsKeywordListName, brandSafetyDenyListFlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordList {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    contentsKeyword: ").append(toIndentedString(contentsKeyword)).append("\n");
    sb.append("    contentsKeywordListDescription: ").append(toIndentedString(contentsKeywordListDescription)).append("\n");
    sb.append("    isRemoveContentsKeywordListDescription: ").append(toIndentedString(isRemoveContentsKeywordListDescription)).append("\n");
    sb.append("    contentsKeywordListId: ").append(toIndentedString(contentsKeywordListId)).append("\n");
    sb.append("    contentsKeywordListName: ").append(toIndentedString(contentsKeywordListName)).append("\n");
    sb.append("    brandSafetyDenyListFlg: ").append(toIndentedString(brandSafetyDenyListFlg)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.ContentsKeywordListServiceContentsKeyword;
import jp.co.yahoo.adsdisplayapi.v7.model.ContentsKeywordListServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordListオブジェクトは、コンテンツキーワードリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordList object displays the contents keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordListオブジェクトは、コンテンツキーワードリストを表します。</div> <div lang=\"en\">ContentsKeywordList object displays the contents keyword list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContentsKeywordList   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("contentsKeyword")
  @Valid
  private List<ContentsKeywordListServiceContentsKeyword> contentsKeyword = null;

  @JsonProperty("contentsKeywordListDescription")
  private String contentsKeywordListDescription = null;

  @JsonProperty("isRemoveContentsKeywordListDescription")
  private ContentsKeywordListServiceIsRemoveFlg isRemoveContentsKeywordListDescription = null;

  @JsonProperty("contentsKeywordListId")
  private Long contentsKeywordListId = null;

  @JsonProperty("contentsKeywordListName")
  private String contentsKeywordListName = null;

  @JsonProperty("brandSafetyDenyListFlg")
  private Boolean brandSafetyDenyListFlg = null;

  public ContentsKeywordList accountId(Long accountId) {
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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ContentsKeywordListServiceContentsKeyword> getContentsKeyword() {
    return contentsKeyword;
  }

  public void setContentsKeyword(List<ContentsKeywordListServiceContentsKeyword> contentsKeyword) {
    this.contentsKeyword = contentsKeyword;
  }

  public ContentsKeywordList contentsKeywordListDescription(String contentsKeywordListDescription) {
    this.contentsKeywordListDescription = contentsKeywordListDescription;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンテンツキーワードリストの説明文です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Description of Contents keyword list.<br> This field is optional in ADD and SET operation. </div> 
   * @return contentsKeywordListDescription
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンテンツキーワードリストの説明文です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Description of Contents keyword list.<br> This field is optional in ADD and SET operation. </div> ")


  public String getContentsKeywordListDescription() {
    return contentsKeywordListDescription;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContentsKeywordListServiceIsRemoveFlg getIsRemoveContentsKeywordListDescription() {
    return isRemoveContentsKeywordListDescription;
  }

  public void setIsRemoveContentsKeywordListDescription(ContentsKeywordListServiceIsRemoveFlg isRemoveContentsKeywordListDescription) {
    this.isRemoveContentsKeywordListDescription = isRemoveContentsKeywordListDescription;
  }

  public ContentsKeywordList contentsKeywordListId(Long contentsKeywordListId) {
    this.contentsKeywordListId = contentsKeywordListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンテンツキーワードリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Contents keyword list ID.<br> This field is required in SET and REMOVE operation. </div> 
   * @return contentsKeywordListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンテンツキーワードリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Contents keyword list ID.<br> This field is required in SET and REMOVE operation. </div> ")


  public Long getContentsKeywordListId() {
    return contentsKeywordListId;
  }

  public void setContentsKeywordListId(Long contentsKeywordListId) {
    this.contentsKeywordListId = contentsKeywordListId;
  }

  public ContentsKeywordList contentsKeywordListName(String contentsKeywordListName) {
    this.contentsKeywordListName = contentsKeywordListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンテンツキーワードリスト名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Name of Contents keyword list.<br> This field is required in ADD operation, and is optional in SET operation. </div> 
   * @return contentsKeywordListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンテンツキーワードリスト名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Name of Contents keyword list.<br> This field is required in ADD operation, and is optional in SET operation. </div> ")


  public String getContentsKeywordListName() {
    return contentsKeywordListName;
  }

  public void setContentsKeywordListName(String contentsKeywordListName) {
    this.contentsKeywordListName = contentsKeywordListName;
  }

  public ContentsKeywordList brandSafetyDenyListFlg(Boolean brandSafetyDenyListFlg) {
    this.brandSafetyDenyListFlg = brandSafetyDenyListFlg;
    return this;
  }

  /**
   * <div lang=\"ja\"> 除外専用リストかどうかのフラグです。<br> 除外専用リストには下記の制約があります。<br> ・１アカウントにつき1つ作成が可能です。<br> ・除外にのみ紐付け可能です。<br> ・YDNキャンペーンには紐付けできません。<br> このフィールドは、ADD時に省略可能(デフォルトの値はFALSE)、SET時に指定不可となります。 </div> <div lang=\"en\"> A flag that indicates whether it is an exclusion list. <br> Exclusion list includes the following restrictions: <br> *Only one list can be created per account. <br> *Can be linked only to exclusion. <br> *Cannot be linked with YDN campaign. <br> This field is optional in ADD operation (default value will be FALSE), and cannot be specified in SET operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">除外専用リストです。</span><span lang=\"en\">Exclusion list.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通常のurlリストです。</span><span lang=\"en\">Standard URL list.</span></dd> </dl> 
   * @return brandSafetyDenyListFlg
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 除外専用リストかどうかのフラグです。<br> 除外専用リストには下記の制約があります。<br> ・１アカウントにつき1つ作成が可能です。<br> ・除外にのみ紐付け可能です。<br> ・YDNキャンペーンには紐付けできません。<br> このフィールドは、ADD時に省略可能(デフォルトの値はFALSE)、SET時に指定不可となります。 </div> <div lang=\"en\"> A flag that indicates whether it is an exclusion list. <br> Exclusion list includes the following restrictions: <br> *Only one list can be created per account. <br> *Can be linked only to exclusion. <br> *Cannot be linked with YDN campaign. <br> This field is optional in ADD operation (default value will be FALSE), and cannot be specified in SET operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">除外専用リストです。</span><span lang=\"en\">Exclusion list.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通常のurlリストです。</span><span lang=\"en\">Standard URL list.</span></dd> </dl> ")


  public Boolean getBrandSafetyDenyListFlg() {
    return brandSafetyDenyListFlg;
  }

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


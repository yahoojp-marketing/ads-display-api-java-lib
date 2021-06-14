package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.PlacementUrlListServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.PlacementUrlListServiceUnknownDomainFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.PlacementUrlListServiceUrlList;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlListオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The objects to keep Placement Url Information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlListオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。</div> <div lang=\"en\">The objects to keep Placement Url Information.</div> ")

public class PlacementUrlList   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("isRemoveDescription")
  private JsonNullable<PlacementUrlListServiceIsRemoveFlg> isRemoveDescription = JsonNullable.undefined();

  @JsonProperty("unknownDomainFlg")
  private JsonNullable<PlacementUrlListServiceUnknownDomainFlg> unknownDomainFlg = JsonNullable.undefined();

  @JsonProperty("urlListId")
  private JsonNullable<Long> urlListId = JsonNullable.undefined();

  @JsonProperty("urlListName")
  private JsonNullable<String> urlListName = JsonNullable.undefined();

  @JsonProperty("brandSafetyDenyListFlg")
  private JsonNullable<Boolean> brandSafetyDenyListFlg = JsonNullable.undefined();

  @JsonProperty("urls")
  @Valid
  private JsonNullable<List<PlacementUrlListServiceUrlList>> urls = JsonNullable.undefined();

  public PlacementUrlList accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public PlacementUrlList description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * <div lang=\"ja\"> urlリストの説明です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Url List Description.<br> This field is optional in ADD and SET operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> urlリストの説明です。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Url List Description.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public PlacementUrlList isRemoveDescription(PlacementUrlListServiceIsRemoveFlg isRemoveDescription) {
    this.isRemoveDescription = JsonNullable.of(isRemoveDescription);
    return this;
  }

  /**
   * Get isRemoveDescription
   * @return isRemoveDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<PlacementUrlListServiceIsRemoveFlg> getIsRemoveDescription() {
    return isRemoveDescription;
  }

  public void setIsRemoveDescription(JsonNullable<PlacementUrlListServiceIsRemoveFlg> isRemoveDescription) {
    this.isRemoveDescription = isRemoveDescription;
  }

  public PlacementUrlList unknownDomainFlg(PlacementUrlListServiceUnknownDomainFlg unknownDomainFlg) {
    this.unknownDomainFlg = JsonNullable.of(unknownDomainFlg);
    return this;
  }

  /**
   * Get unknownDomainFlg
   * @return unknownDomainFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<PlacementUrlListServiceUnknownDomainFlg> getUnknownDomainFlg() {
    return unknownDomainFlg;
  }

  public void setUnknownDomainFlg(JsonNullable<PlacementUrlListServiceUnknownDomainFlg> unknownDomainFlg) {
    this.unknownDomainFlg = unknownDomainFlg;
  }

  public PlacementUrlList urlListId(Long urlListId) {
    this.urlListId = JsonNullable.of(urlListId);
    return this;
  }

  /**
   * <div lang=\"ja\"> urlリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Url List ID. <br> This field is required in SET and REMOVE operation. </div> 
   * @return urlListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> urlリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Url List ID. <br> This field is required in SET and REMOVE operation. </div> ")


  public JsonNullable<Long> getUrlListId() {
    return urlListId;
  }

  public void setUrlListId(JsonNullable<Long> urlListId) {
    this.urlListId = urlListId;
  }

  public PlacementUrlList urlListName(String urlListName) {
    this.urlListName = JsonNullable.of(urlListName);
    return this;
  }

  /**
   * <div lang=\"ja\"> urlリスト名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Url List Name. <br> This field is required in ADD operation, and is optional in SET operation. </div> 
   * @return urlListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> urlリスト名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Url List Name. <br> This field is required in ADD operation, and is optional in SET operation. </div> ")


  public JsonNullable<String> getUrlListName() {
    return urlListName;
  }

  public void setUrlListName(JsonNullable<String> urlListName) {
    this.urlListName = urlListName;
  }

  public PlacementUrlList brandSafetyDenyListFlg(Boolean brandSafetyDenyListFlg) {
    this.brandSafetyDenyListFlg = JsonNullable.of(brandSafetyDenyListFlg);
    return this;
  }

  /**
   * <div lang=\"ja\"> 除外専用リストかどうかのフラグです。<br> 除外専用リストには下記の制約があります。<br> ・１アカウントにつき1つ作成が可能です。<br> ・除外にのみ紐付け可能です。<br> ・YDNキャンペーンには紐付けできません。<br> このフィールドは、ADD時に省略可能(デフォルトの値はFALSE)、SET時に指定不可となります。 </div> <div lang=\"en\"> A flag that indicates whether it is an exclusion list. <br> Exclusion list includes the following restrictions: <br> *Only one list can be created per account. <br> *Can be linked only to exclusion. <br> *Cannot be linked with YDN campaign. <br> This field is optional in ADD operation (default value will be FALSE), and cannot be specified in SET operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">除外専用リストです。</span><span lang=\"en\">Exclusion list.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通常のurlリストです。</span><span lang=\"en\">Standard URL list.</span></dd> </dl> 
   * @return brandSafetyDenyListFlg
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 除外専用リストかどうかのフラグです。<br> 除外専用リストには下記の制約があります。<br> ・１アカウントにつき1つ作成が可能です。<br> ・除外にのみ紐付け可能です。<br> ・YDNキャンペーンには紐付けできません。<br> このフィールドは、ADD時に省略可能(デフォルトの値はFALSE)、SET時に指定不可となります。 </div> <div lang=\"en\"> A flag that indicates whether it is an exclusion list. <br> Exclusion list includes the following restrictions: <br> *Only one list can be created per account. <br> *Can be linked only to exclusion. <br> *Cannot be linked with YDN campaign. <br> This field is optional in ADD operation (default value will be FALSE), and cannot be specified in SET operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">除外専用リストです。</span><span lang=\"en\">Exclusion list.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通常のurlリストです。</span><span lang=\"en\">Standard URL list.</span></dd> </dl> ")


  public JsonNullable<Boolean> getBrandSafetyDenyListFlg() {
    return brandSafetyDenyListFlg;
  }

  public void setBrandSafetyDenyListFlg(JsonNullable<Boolean> brandSafetyDenyListFlg) {
    this.brandSafetyDenyListFlg = brandSafetyDenyListFlg;
  }

  public PlacementUrlList urls(List<PlacementUrlListServiceUrlList> urls) {
    this.urls = JsonNullable.of(urls);
    return this;
  }

  public PlacementUrlList addUrlsItem(PlacementUrlListServiceUrlList urlsItem) {
    if (this.urls == null || !this.urls.isPresent()) {
      this.urls = JsonNullable.of(new ArrayList<>());
    }
    this.urls.get().add(urlsItem);
    return this;
  }

  /**
   * Get urls
   * @return urls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<PlacementUrlListServiceUrlList>> getUrls() {
    return urls;
  }

  public void setUrls(JsonNullable<List<PlacementUrlListServiceUrlList>> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlList placementUrlList = (PlacementUrlList) o;
    return Objects.equals(this.accountId, placementUrlList.accountId) &&
        Objects.equals(this.description, placementUrlList.description) &&
        Objects.equals(this.isRemoveDescription, placementUrlList.isRemoveDescription) &&
        Objects.equals(this.unknownDomainFlg, placementUrlList.unknownDomainFlg) &&
        Objects.equals(this.urlListId, placementUrlList.urlListId) &&
        Objects.equals(this.urlListName, placementUrlList.urlListName) &&
        Objects.equals(this.brandSafetyDenyListFlg, placementUrlList.brandSafetyDenyListFlg) &&
        Objects.equals(this.urls, placementUrlList.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, description, isRemoveDescription, unknownDomainFlg, urlListId, urlListName, brandSafetyDenyListFlg, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlList {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRemoveDescription: ").append(toIndentedString(isRemoveDescription)).append("\n");
    sb.append("    unknownDomainFlg: ").append(toIndentedString(unknownDomainFlg)).append("\n");
    sb.append("    urlListId: ").append(toIndentedString(urlListId)).append("\n");
    sb.append("    urlListName: ").append(toIndentedString(urlListName)).append("\n");
    sb.append("    brandSafetyDenyListFlg: ").append(toIndentedString(brandSafetyDenyListFlg)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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


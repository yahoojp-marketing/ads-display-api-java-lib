package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceContent;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceSourceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListオブジェクトは、オーディエンスリストの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceList object describes information of audience list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AudienceListオブジェクトは、オーディエンスリストの情報を表します。</div> <div lang=\"en\">AudienceList object describes information of audience list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceList   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("deliveryStatus")
  private AudienceListServiceDeliveryStatus deliveryStatus = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isRemoveDescription")
  private AudienceListServiceIsRemoveFlg isRemoveDescription = null;

  @JsonProperty("reach")
  private Long reach = null;

  @JsonProperty("audienceListContent")
  private AudienceListServiceContent audienceListContent = null;

  @JsonProperty("audienceListId")
  private Long audienceListId = null;

  @JsonProperty("audienceListName")
  private String audienceListName = null;

  @JsonProperty("sourceAccountId")
  private Long sourceAccountId = null;

  @JsonProperty("sourceAccountName")
  private String sourceAccountName = null;

  @JsonProperty("sourceType")
  private AudienceListServiceSourceType sourceType = null;

  @JsonProperty("isShared")
  private Boolean isShared = null;

  public AudienceList accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AudienceList deliveryStatus(AudienceListServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

  /**
   * Get deliveryStatus
   * @return deliveryStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(AudienceListServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  public AudienceList description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスリストの説明です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Description of Audience List.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリストの説明です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Description of Audience List.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AudienceList isRemoveDescription(AudienceListServiceIsRemoveFlg isRemoveDescription) {
    this.isRemoveDescription = isRemoveDescription;
    return this;
  }

  /**
   * Get isRemoveDescription
   * @return isRemoveDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceIsRemoveFlg getIsRemoveDescription() {
    return isRemoveDescription;
  }

  public void setIsRemoveDescription(AudienceListServiceIsRemoveFlg isRemoveDescription) {
    this.isRemoveDescription = isRemoveDescription;
  }

  public AudienceList reach(Long reach) {
    this.reach = reach;
    return this;
  }

  /**
   * <div lang=\"ja\"> リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getReach() {
    return reach;
  }

  public void setReach(Long reach) {
    this.reach = reach;
  }

  public AudienceList audienceListContent(AudienceListServiceContent audienceListContent) {
    this.audienceListContent = audienceListContent;
    return this;
  }

  /**
   * Get audienceListContent
   * @return audienceListContent
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceContent getAudienceListContent() {
    return audienceListContent;
  }

  public void setAudienceListContent(AudienceListServiceContent audienceListContent) {
    this.audienceListContent = audienceListContent;
  }

  public AudienceList audienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時には無視されます。 </div> <div lang=\"en\"> Audience List ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation. </div> 
   * @return audienceListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時には無視されます。 </div> <div lang=\"en\"> Audience List ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation. </div> ")


  public Long getAudienceListId() {
    return audienceListId;
  }

  public void setAudienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
  }

  public AudienceList audienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> Audience List name.<br> This field is required in ADD operation, optional in SET operation, and will be ignored in REMOVE operation. </div> 
   * @return audienceListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> Audience List name.<br> This field is required in ADD operation, optional in SET operation, and will be ignored in REMOVE operation. </div> ")


  public String getAudienceListName() {
    return audienceListName;
  }

  public void setAudienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
  }

  public AudienceList sourceAccountId(Long sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
    return this;
  }

  /**
   * <div lang=\"ja\">   共有元アカウントIDです。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   Account ID of the sharing source.<br>   Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return sourceAccountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   共有元アカウントIDです。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   Account ID of the sharing source.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getSourceAccountId() {
    return sourceAccountId;
  }

  public void setSourceAccountId(Long sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
  }

  public AudienceList sourceAccountName(String sourceAccountName) {
    this.sourceAccountName = sourceAccountName;
    return this;
  }

  /**
   * <div lang=\"ja\">   共有元アカウント名です。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   Account name of the sharing source.<br>   Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return sourceAccountName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   共有元アカウント名です。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   Account name of the sharing source.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getSourceAccountName() {
    return sourceAccountName;
  }

  public void setSourceAccountName(String sourceAccountName) {
    this.sourceAccountName = sourceAccountName;
  }

  public AudienceList sourceType(AudienceListServiceSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(AudienceListServiceSourceType sourceType) {
    this.sourceType = sourceType;
  }

  public AudienceList isShared(Boolean isShared) {
    this.isShared = isShared;
    return this;
  }

  /**
   * <div lang=\"ja\">   AudienceListServiceIsSharedは、オーディエンスリストの共有ステータスを示します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   AudienceListServiceIsShared describes the sharing status of the audience list.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <hr> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有されたオーディエンスリストです。</span><span lang=\"en\">The shared audience list.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有されていないオーディエンスリストです。</span><span lang=\"en\">The non-shared audience list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
   * @return isShared
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   AudienceListServiceIsSharedは、オーディエンスリストの共有ステータスを示します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   AudienceListServiceIsShared describes the sharing status of the audience list.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <hr> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有されたオーディエンスリストです。</span><span lang=\"en\">The shared audience list.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有されていないオーディエンスリストです。</span><span lang=\"en\">The non-shared audience list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> ")


  public Boolean getIsShared() {
    return isShared;
  }

  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceList audienceList = (AudienceList) o;
    return Objects.equals(this.accountId, audienceList.accountId) &&
        Objects.equals(this.deliveryStatus, audienceList.deliveryStatus) &&
        Objects.equals(this.description, audienceList.description) &&
        Objects.equals(this.isRemoveDescription, audienceList.isRemoveDescription) &&
        Objects.equals(this.reach, audienceList.reach) &&
        Objects.equals(this.audienceListContent, audienceList.audienceListContent) &&
        Objects.equals(this.audienceListId, audienceList.audienceListId) &&
        Objects.equals(this.audienceListName, audienceList.audienceListName) &&
        Objects.equals(this.sourceAccountId, audienceList.sourceAccountId) &&
        Objects.equals(this.sourceAccountName, audienceList.sourceAccountName) &&
        Objects.equals(this.sourceType, audienceList.sourceType) &&
        Objects.equals(this.isShared, audienceList.isShared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, deliveryStatus, description, isRemoveDescription, reach, audienceListContent, audienceListId, audienceListName, sourceAccountId, sourceAccountName, sourceType, isShared);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceList {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRemoveDescription: ").append(toIndentedString(isRemoveDescription)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    audienceListContent: ").append(toIndentedString(audienceListContent)).append("\n");
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
    sb.append("    sourceAccountId: ").append(toIndentedString(sourceAccountId)).append("\n");
    sb.append("    sourceAccountName: ").append(toIndentedString(sourceAccountName)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceTargetList;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListオブジェクトは、サイトリターゲティング のターゲットリストの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingList object diplays the target list for site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListオブジェクトは、サイトリターゲティング のターゲットリストの情報を表します。</div> <div lang=\"en\">RetargetingList object diplays the target list for site retargeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingList   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("deliveryStatus")
  private RetargetingListServiceDeliveryStatus deliveryStatus = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isRemoveDescription")
  private RetargetingListServiceIsRemoveFlg isRemoveDescription = null;

  @JsonProperty("reach")
  private Long reach = null;

  @JsonProperty("targetList")
  private RetargetingListServiceTargetList targetList = null;

  @JsonProperty("targetListId")
  private Long targetListId = null;

  @JsonProperty("targetListName")
  private String targetListName = null;

  @JsonProperty("sourceAccountId")
  private Long sourceAccountId = null;

  @JsonProperty("sourceAccountName")
  private String sourceAccountName = null;

  @JsonProperty("isShared")
  private Boolean isShared = null;

  public RetargetingList accountId(Long accountId) {
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

  public RetargetingList deliveryStatus(RetargetingListServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

  /**
   * Get deliveryStatus
   * @return deliveryStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(RetargetingListServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  public RetargetingList description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットリストの説明です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Description of Target List.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリストの説明です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Description of Target List.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RetargetingList isRemoveDescription(RetargetingListServiceIsRemoveFlg isRemoveDescription) {
    this.isRemoveDescription = isRemoveDescription;
    return this;
  }

  /**
   * Get isRemoveDescription
   * @return isRemoveDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceIsRemoveFlg getIsRemoveDescription() {
    return isRemoveDescription;
  }

  public void setIsRemoveDescription(RetargetingListServiceIsRemoveFlg isRemoveDescription) {
    this.isRemoveDescription = isRemoveDescription;
  }

  public RetargetingList reach(Long reach) {
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

  public RetargetingList targetList(RetargetingListServiceTargetList targetList) {
    this.targetList = targetList;
    return this;
  }

  /**
   * Get targetList
   * @return targetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceTargetList getTargetList() {
    return targetList;
  }

  public void setTargetList(RetargetingListServiceTargetList targetList) {
    this.targetList = targetList;
  }

  public RetargetingList targetListId(Long targetListId) {
    this.targetListId = targetListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時には無視されます。 </div> <div lang=\"en\"> Target List ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation. </div> 
   * @return targetListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリストIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時には無視されます。 </div> <div lang=\"en\"> Target List ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation. </div> ")


  public Long getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }

  public RetargetingList targetListName(String targetListName) {
    this.targetListName = targetListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットリスト名です。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> Target List name.<br> This field is required in ADD operation, optional in SET operation, and will be ignored in REMOVE operation. </div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリスト名です。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> Target List name.<br> This field is required in ADD operation, optional in SET operation, and will be ignored in REMOVE operation. </div> ")


  public String getTargetListName() {
    return targetListName;
  }

  public void setTargetListName(String targetListName) {
    this.targetListName = targetListName;
  }

  public RetargetingList sourceAccountId(Long sourceAccountId) {
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

  public RetargetingList sourceAccountName(String sourceAccountName) {
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

  public RetargetingList isShared(Boolean isShared) {
    this.isShared = isShared;
    return this;
  }

  /**
   * <div lang=\"ja\">   RetargetingListServiceIsSharedは、ターゲットリストの共有ステータスを示します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   RetargetingListServiceIsShared describes the sharing status of the target list.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <hr> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有されたターゲットリストです。</span><span lang=\"en\">The shared target list.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有されていないターゲットリストです。</span><span lang=\"en\">The non-shared target list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
   * @return isShared
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   RetargetingListServiceIsSharedは、ターゲットリストの共有ステータスを示します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   RetargetingListServiceIsShared describes the sharing status of the target list.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <hr> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有されたターゲットリストです。</span><span lang=\"en\">The shared target list.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有されていないターゲットリストです。</span><span lang=\"en\">The non-shared target list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> ")


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
    RetargetingList retargetingList = (RetargetingList) o;
    return Objects.equals(this.accountId, retargetingList.accountId) &&
        Objects.equals(this.deliveryStatus, retargetingList.deliveryStatus) &&
        Objects.equals(this.description, retargetingList.description) &&
        Objects.equals(this.isRemoveDescription, retargetingList.isRemoveDescription) &&
        Objects.equals(this.reach, retargetingList.reach) &&
        Objects.equals(this.targetList, retargetingList.targetList) &&
        Objects.equals(this.targetListId, retargetingList.targetListId) &&
        Objects.equals(this.targetListName, retargetingList.targetListName) &&
        Objects.equals(this.sourceAccountId, retargetingList.sourceAccountId) &&
        Objects.equals(this.sourceAccountName, retargetingList.sourceAccountName) &&
        Objects.equals(this.isShared, retargetingList.isShared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, deliveryStatus, description, isRemoveDescription, reach, targetList, targetListId, targetListName, sourceAccountId, sourceAccountName, isShared);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingList {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRemoveDescription: ").append(toIndentedString(isRemoveDescription)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    targetList: ").append(toIndentedString(targetList)).append("\n");
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
    sb.append("    sourceAccountId: ").append(toIndentedString(sourceAccountId)).append("\n");
    sb.append("    sourceAccountName: ").append(toIndentedString(sourceAccountName)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedInventoryServiceInventory;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedInventoryServiceInventoryJobStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedInventoryJobオブジェクトは、在庫情報のジョブを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedInventoryJob contains the job of inventory information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedInventoryJobオブジェクトは、在庫情報のジョブを格納するコンテナです。</div> <div lang=\"en\">GuaranteedInventoryJob contains the job of inventory information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryJob   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("inventoryJobId")
  private Long inventoryJobId = null;

  @JsonProperty("inventoryJobName")
  private String inventoryJobName = null;

  @JsonProperty("notificationBusinessIds")
  @Valid
  private List<String> notificationBusinessIds = null;

  @JsonProperty("inventoryJobStartDate")
  private String inventoryJobStartDate = null;

  @JsonProperty("inventoryJobEndDate")
  private String inventoryJobEndDate = null;

  @JsonProperty("createdBusinessId")
  private String createdBusinessId = null;

  @JsonProperty("isExpiredPackage")
  private Boolean isExpiredPackage = null;

  @JsonProperty("inventoryJobStatus")
  private GuaranteedInventoryServiceInventoryJobStatus inventoryJobStatus = null;

  @JsonProperty("inventories")
  @Valid
  private List<GuaranteedInventoryServiceInventory> inventories = null;

  public GuaranteedInventoryJob accountId(Long accountId) {
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

  public GuaranteedInventoryJob inventoryJobId(Long inventoryJobId) {
    this.inventoryJobId = inventoryJobId;
    return this;
  }

  /**
   * <div lang=\"ja\">在庫確認ジョブIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Inventory check job ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return inventoryJobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">在庫確認ジョブIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Inventory check job ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getInventoryJobId() {
    return inventoryJobId;
  }

  public void setInventoryJobId(Long inventoryJobId) {
    this.inventoryJobId = inventoryJobId;
  }

  public GuaranteedInventoryJob inventoryJobName(String inventoryJobName) {
    this.inventoryJobName = inventoryJobName;
    return this;
  }

  /**
   * <div lang=\"ja\">在庫確認ジョブ名です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Inventory check job name.<br> This field is required in ADD operation.</div> 
   * @return inventoryJobName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">在庫確認ジョブ名です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Inventory check job name.<br> This field is required in ADD operation.</div> ")


  public String getInventoryJobName() {
    return inventoryJobName;
  }

  public void setInventoryJobName(String inventoryJobName) {
    this.inventoryJobName = inventoryJobName;
  }

  public GuaranteedInventoryJob notificationBusinessIds(List<String> notificationBusinessIds) {
    this.notificationBusinessIds = notificationBusinessIds;
    return this;
  }

  public GuaranteedInventoryJob addNotificationBusinessIdsItem(String notificationBusinessIdsItem) {
    if (this.notificationBusinessIds == null) {
      this.notificationBusinessIds = new ArrayList<>();
    }
    this.notificationBusinessIds.add(notificationBusinessIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">連絡先Yahoo! JAPANビジネスIDです。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">Yahoo! JAPAN Business ID to send notifications.<br> This field is optional in ADD operation.</div> 
   * @return notificationBusinessIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">連絡先Yahoo! JAPANビジネスIDです。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">Yahoo! JAPAN Business ID to send notifications.<br> This field is optional in ADD operation.</div> ")


  public List<String> getNotificationBusinessIds() {
    return notificationBusinessIds;
  }

  public void setNotificationBusinessIds(List<String> notificationBusinessIds) {
    this.notificationBusinessIds = notificationBusinessIds;
  }

  public GuaranteedInventoryJob inventoryJobStartDate(String inventoryJobStartDate) {
    this.inventoryJobStartDate = inventoryJobStartDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 在庫確認ジョブの開始日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start date of inventory check job.<br> Although this field will be returned in the response, it will be ignored on input. </div> Format: yyyyMMddHHmmss 
   * @return inventoryJobStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 在庫確認ジョブの開始日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start date of inventory check job.<br> Although this field will be returned in the response, it will be ignored on input. </div> Format: yyyyMMddHHmmss ")


  public String getInventoryJobStartDate() {
    return inventoryJobStartDate;
  }

  public void setInventoryJobStartDate(String inventoryJobStartDate) {
    this.inventoryJobStartDate = inventoryJobStartDate;
  }

  public GuaranteedInventoryJob inventoryJobEndDate(String inventoryJobEndDate) {
    this.inventoryJobEndDate = inventoryJobEndDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 在庫確認ジョブの完了日時です。<br> 在庫確認ジョブが実行中の場合はnullで返ります。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\"> End date of inventory check job. <br> Null will be returned if the inventory check job is still running. <br> Although this field will be returned in the response, it will be ignored on input. </div> Format: yyyyMMddHHmmss 
   * @return inventoryJobEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 在庫確認ジョブの完了日時です。<br> 在庫確認ジョブが実行中の場合はnullで返ります。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\"> End date of inventory check job. <br> Null will be returned if the inventory check job is still running. <br> Although this field will be returned in the response, it will be ignored on input. </div> Format: yyyyMMddHHmmss ")


  public String getInventoryJobEndDate() {
    return inventoryJobEndDate;
  }

  public void setInventoryJobEndDate(String inventoryJobEndDate) {
    this.inventoryJobEndDate = inventoryJobEndDate;
  }

  public GuaranteedInventoryJob createdBusinessId(String createdBusinessId) {
    this.createdBusinessId = createdBusinessId;
    return this;
  }

  /**
   * <div lang=\"ja\">在庫確認ジョブ作成者のYahoo! JAPANビジネスIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Yahoo! JAPAN Business ID of inventory check job creator. <br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return createdBusinessId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">在庫確認ジョブ作成者のYahoo! JAPANビジネスIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Yahoo! JAPAN Business ID of inventory check job creator. <br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getCreatedBusinessId() {
    return createdBusinessId;
  }

  public void setCreatedBusinessId(String createdBusinessId) {
    this.createdBusinessId = createdBusinessId;
  }

  public GuaranteedInventoryJob isExpiredPackage(Boolean isExpiredPackage) {
    this.isExpiredPackage = isExpiredPackage;
    return this;
  }

  /**
   * <div lang=\"ja\"> 予約有効終了日が過去日の商品が指定されているかどうかのフラグです。<br> trueの場合、その商品の予約有効終了日を超えていることを示しています。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\"> A flag which indicates if the expired package is specified. <br> If the value is true, it indicates that the package reservation expiration date has already passed. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return isExpiredPackage
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 予約有効終了日が過去日の商品が指定されているかどうかのフラグです。<br> trueの場合、その商品の予約有効終了日を超えていることを示しています。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\"> A flag which indicates if the expired package is specified. <br> If the value is true, it indicates that the package reservation expiration date has already passed. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Boolean getIsExpiredPackage() {
    return isExpiredPackage;
  }

  public void setIsExpiredPackage(Boolean isExpiredPackage) {
    this.isExpiredPackage = isExpiredPackage;
  }

  public GuaranteedInventoryJob inventoryJobStatus(GuaranteedInventoryServiceInventoryJobStatus inventoryJobStatus) {
    this.inventoryJobStatus = inventoryJobStatus;
    return this;
  }

  /**
   * Get inventoryJobStatus
   * @return inventoryJobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceInventoryJobStatus getInventoryJobStatus() {
    return inventoryJobStatus;
  }

  public void setInventoryJobStatus(GuaranteedInventoryServiceInventoryJobStatus inventoryJobStatus) {
    this.inventoryJobStatus = inventoryJobStatus;
  }

  public GuaranteedInventoryJob inventories(List<GuaranteedInventoryServiceInventory> inventories) {
    this.inventories = inventories;
    return this;
  }

  public GuaranteedInventoryJob addInventoriesItem(GuaranteedInventoryServiceInventory inventoriesItem) {
    if (this.inventories == null) {
      this.inventories = new ArrayList<>();
    }
    this.inventories.add(inventoriesItem);
    return this;
  }

  /**
   * Get inventories
   * @return inventories
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedInventoryServiceInventory> getInventories() {
    return inventories;
  }

  public void setInventories(List<GuaranteedInventoryServiceInventory> inventories) {
    this.inventories = inventories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryJob guaranteedInventoryJob = (GuaranteedInventoryJob) o;
    return Objects.equals(this.accountId, guaranteedInventoryJob.accountId) &&
        Objects.equals(this.inventoryJobId, guaranteedInventoryJob.inventoryJobId) &&
        Objects.equals(this.inventoryJobName, guaranteedInventoryJob.inventoryJobName) &&
        Objects.equals(this.notificationBusinessIds, guaranteedInventoryJob.notificationBusinessIds) &&
        Objects.equals(this.inventoryJobStartDate, guaranteedInventoryJob.inventoryJobStartDate) &&
        Objects.equals(this.inventoryJobEndDate, guaranteedInventoryJob.inventoryJobEndDate) &&
        Objects.equals(this.createdBusinessId, guaranteedInventoryJob.createdBusinessId) &&
        Objects.equals(this.isExpiredPackage, guaranteedInventoryJob.isExpiredPackage) &&
        Objects.equals(this.inventoryJobStatus, guaranteedInventoryJob.inventoryJobStatus) &&
        Objects.equals(this.inventories, guaranteedInventoryJob.inventories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, inventoryJobId, inventoryJobName, notificationBusinessIds, inventoryJobStartDate, inventoryJobEndDate, createdBusinessId, isExpiredPackage, inventoryJobStatus, inventories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryJob {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    inventoryJobId: ").append(toIndentedString(inventoryJobId)).append("\n");
    sb.append("    inventoryJobName: ").append(toIndentedString(inventoryJobName)).append("\n");
    sb.append("    notificationBusinessIds: ").append(toIndentedString(notificationBusinessIds)).append("\n");
    sb.append("    inventoryJobStartDate: ").append(toIndentedString(inventoryJobStartDate)).append("\n");
    sb.append("    inventoryJobEndDate: ").append(toIndentedString(inventoryJobEndDate)).append("\n");
    sb.append("    createdBusinessId: ").append(toIndentedString(createdBusinessId)).append("\n");
    sb.append("    isExpiredPackage: ").append(toIndentedString(isExpiredPackage)).append("\n");
    sb.append("    inventoryJobStatus: ").append(toIndentedString(inventoryJobStatus)).append("\n");
    sb.append("    inventories: ").append(toIndentedString(inventories)).append("\n");
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


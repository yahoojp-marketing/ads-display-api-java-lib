package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceActionAfterVideoAdTap;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAdRequirement;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceBuyingTerm;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceInstreamDurationType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermissionType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedAdPlaceTypes;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedAgeTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedAppTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedGenderTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedGeoTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedOsTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedPositionTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePermittedViewableFrequencyCap;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePackagePublicLevel;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePricingPackage;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePromotionalDocument;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceRelatedDocument;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceSalesDocument;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackageオブジェクトは、商品情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackage object contains package information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackageオブジェクトは、商品情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackage object contains package information.</div> ")

public class GuaranteedSimulationServicePackage   {
  @JsonProperty("packageId")
  private Long packageId;

  @JsonProperty("packageHistoryId")
  private Long packageHistoryId;

  @JsonProperty("packageName")
  private String packageName;

  @JsonProperty("sellingStartDate")
  private JsonNullable<String> sellingStartDate = JsonNullable.undefined();

  @JsonProperty("sellingEndDate")
  private JsonNullable<String> sellingEndDate = JsonNullable.undefined();

  @JsonProperty("adDeliveryDurationStartDate")
  private JsonNullable<String> adDeliveryDurationStartDate = JsonNullable.undefined();

  @JsonProperty("reservationStartDate")
  private JsonNullable<String> reservationStartDate = JsonNullable.undefined();

  @JsonProperty("reservationEndDate")
  private JsonNullable<String> reservationEndDate = JsonNullable.undefined();

  @JsonProperty("adDeliveryDurationEndDate")
  private JsonNullable<String> adDeliveryDurationEndDate = JsonNullable.undefined();

  @JsonProperty("buyingTerm")
  private JsonNullable<GuaranteedSimulationServiceBuyingTerm> buyingTerm = JsonNullable.undefined();

  @JsonProperty("pricingPackage")
  private JsonNullable<GuaranteedSimulationServicePricingPackage> pricingPackage = JsonNullable.undefined();

  @JsonProperty("packagePublicLevel")
  private JsonNullable<GuaranteedSimulationServicePackagePublicLevel> packagePublicLevel = JsonNullable.undefined();

  @JsonProperty("salesDocument")
  private JsonNullable<GuaranteedSimulationServiceSalesDocument> salesDocument = JsonNullable.undefined();

  @JsonProperty("promotionalDocument")
  private JsonNullable<GuaranteedSimulationServicePromotionalDocument> promotionalDocument = JsonNullable.undefined();

  @JsonProperty("relatedDocument")
  private JsonNullable<GuaranteedSimulationServiceRelatedDocument> relatedDocument = JsonNullable.undefined();

  @JsonProperty("adTypePermission")
  private JsonNullable<GuaranteedSimulationServicePackagePermissionType> adTypePermission = JsonNullable.undefined();

  @JsonProperty("adRequirements")
  @Valid
  private JsonNullable<List<GuaranteedSimulationServiceAdRequirement>> adRequirements = JsonNullable.undefined();

  @JsonProperty("actionAfterVideoAdTap")
  private JsonNullable<GuaranteedSimulationServiceActionAfterVideoAdTap> actionAfterVideoAdTap = JsonNullable.undefined();

  @JsonProperty("instreamDurationType")
  private JsonNullable<GuaranteedSimulationServiceInstreamDurationType> instreamDurationType = JsonNullable.undefined();

  @JsonProperty("remarks")
  private String remarks;

  @JsonProperty("packagePermittedViewableFrequencyCap")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedViewableFrequencyCap> packagePermittedViewableFrequencyCap = JsonNullable.undefined();

  @JsonProperty("packagePermittedAdPlaceTypes")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedAdPlaceTypes> packagePermittedAdPlaceTypes = JsonNullable.undefined();

  @JsonProperty("packagePermittedGenderTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedGenderTarget> packagePermittedGenderTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedAgeTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedAgeTarget> packagePermittedAgeTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedAudienceCategoryTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget> packagePermittedAudienceCategoryTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedGeoTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedGeoTarget> packagePermittedGeoTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedAdScheduleTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedAdScheduleTarget> packagePermittedAdScheduleTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedDeviceTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedDeviceTarget> packagePermittedDeviceTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedOsTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedOsTarget> packagePermittedOsTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedAppTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedAppTarget> packagePermittedAppTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedPlacementCategoryTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget> packagePermittedPlacementCategoryTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedPositionTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedPositionTarget> packagePermittedPositionTarget = JsonNullable.undefined();

  @JsonProperty("packagePermittedSiteRetargetingTarget")
  private JsonNullable<GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget> packagePermittedSiteRetargetingTarget = JsonNullable.undefined();

  public GuaranteedSimulationServicePackage packageId(Long packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * <div lang=\"ja\">商品IDです。</div> <div lang=\"en\">Package ID.</div> 
   * @return packageId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品IDです。</div> <div lang=\"en\">Package ID.</div> ")


  public Long getPackageId() {
    return packageId;
  }

  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }

  public GuaranteedSimulationServicePackage packageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
    return this;
  }

  /**
   * <div lang=\"ja\">商品履歴IDです。</div> <div lang=\"en\">Package history ID.</div> 
   * @return packageHistoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品履歴IDです。</div> <div lang=\"en\">Package history ID.</div> ")


  public Long getPackageHistoryId() {
    return packageHistoryId;
  }

  public void setPackageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
  }

  public GuaranteedSimulationServicePackage packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * <div lang=\"ja\">商品名です。</div> <div lang=\"en\">Package name.</div> 
   * @return packageName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品名です。</div> <div lang=\"en\">Package name.</div> ")


  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public GuaranteedSimulationServicePackage sellingStartDate(String sellingStartDate) {
    this.sellingStartDate = JsonNullable.of(sellingStartDate);
    return this;
  }

  /**
   * <div lang=\"ja\">   商品開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the package.<br>   Format: yyyyMMdd </div> 
   * @return sellingStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   商品開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the package.<br>   Format: yyyyMMdd </div> ")


  public JsonNullable<String> getSellingStartDate() {
    return sellingStartDate;
  }

  public void setSellingStartDate(JsonNullable<String> sellingStartDate) {
    this.sellingStartDate = sellingStartDate;
  }

  public GuaranteedSimulationServicePackage sellingEndDate(String sellingEndDate) {
    this.sellingEndDate = JsonNullable.of(sellingEndDate);
    return this;
  }

  /**
   * <div lang=\"ja\">   商品終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the package.<br>   Format: yyyyMMdd </div> 
   * @return sellingEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   商品終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the package.<br>   Format: yyyyMMdd </div> ")


  public JsonNullable<String> getSellingEndDate() {
    return sellingEndDate;
  }

  public void setSellingEndDate(JsonNullable<String> sellingEndDate) {
    this.sellingEndDate = sellingEndDate;
  }

  public GuaranteedSimulationServicePackage adDeliveryDurationStartDate(String adDeliveryDurationStartDate) {
    this.adDeliveryDurationStartDate = JsonNullable.of(adDeliveryDurationStartDate);
    return this;
  }

  /**
   * <div lang=\"ja\">   広告の掲載有効期間の開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the ad delivery validity period.<br>   Format: yyyyMMdd </div> 
   * @return adDeliveryDurationStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   広告の掲載有効期間の開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the ad delivery validity period.<br>   Format: yyyyMMdd </div> ")


  public JsonNullable<String> getAdDeliveryDurationStartDate() {
    return adDeliveryDurationStartDate;
  }

  public void setAdDeliveryDurationStartDate(JsonNullable<String> adDeliveryDurationStartDate) {
    this.adDeliveryDurationStartDate = adDeliveryDurationStartDate;
  }

  public GuaranteedSimulationServicePackage reservationStartDate(String reservationStartDate) {
    this.reservationStartDate = JsonNullable.of(reservationStartDate);
    return this;
  }

  /**
   * <div lang=\"ja\">   予約期間開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of reservation period.<br>   Format: yyyyMMdd </div> 
   * @return reservationStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   予約期間開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of reservation period.<br>   Format: yyyyMMdd </div> ")


  public JsonNullable<String> getReservationStartDate() {
    return reservationStartDate;
  }

  public void setReservationStartDate(JsonNullable<String> reservationStartDate) {
    this.reservationStartDate = reservationStartDate;
  }

  public GuaranteedSimulationServicePackage reservationEndDate(String reservationEndDate) {
    this.reservationEndDate = JsonNullable.of(reservationEndDate);
    return this;
  }

  /**
   * <div lang=\"ja\">   予約期間終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of reservation period.<br>   Format: yyyyMMdd </div> 
   * @return reservationEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   予約期間終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of reservation period.<br>   Format: yyyyMMdd </div> ")


  public JsonNullable<String> getReservationEndDate() {
    return reservationEndDate;
  }

  public void setReservationEndDate(JsonNullable<String> reservationEndDate) {
    this.reservationEndDate = reservationEndDate;
  }

  public GuaranteedSimulationServicePackage adDeliveryDurationEndDate(String adDeliveryDurationEndDate) {
    this.adDeliveryDurationEndDate = JsonNullable.of(adDeliveryDurationEndDate);
    return this;
  }

  /**
   * <div lang=\"ja\">   掲載有効期間の終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the ad delivery validity period.<br>   Format: yyyyMMdd </div> 
   * @return adDeliveryDurationEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   掲載有効期間の終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the ad delivery validity period.<br>   Format: yyyyMMdd </div> ")


  public JsonNullable<String> getAdDeliveryDurationEndDate() {
    return adDeliveryDurationEndDate;
  }

  public void setAdDeliveryDurationEndDate(JsonNullable<String> adDeliveryDurationEndDate) {
    this.adDeliveryDurationEndDate = adDeliveryDurationEndDate;
  }

  public GuaranteedSimulationServicePackage buyingTerm(GuaranteedSimulationServiceBuyingTerm buyingTerm) {
    this.buyingTerm = JsonNullable.of(buyingTerm);
    return this;
  }

  /**
   * Get buyingTerm
   * @return buyingTerm
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceBuyingTerm> getBuyingTerm() {
    return buyingTerm;
  }

  public void setBuyingTerm(JsonNullable<GuaranteedSimulationServiceBuyingTerm> buyingTerm) {
    this.buyingTerm = buyingTerm;
  }

  public GuaranteedSimulationServicePackage pricingPackage(GuaranteedSimulationServicePricingPackage pricingPackage) {
    this.pricingPackage = JsonNullable.of(pricingPackage);
    return this;
  }

  /**
   * Get pricingPackage
   * @return pricingPackage
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePricingPackage> getPricingPackage() {
    return pricingPackage;
  }

  public void setPricingPackage(JsonNullable<GuaranteedSimulationServicePricingPackage> pricingPackage) {
    this.pricingPackage = pricingPackage;
  }

  public GuaranteedSimulationServicePackage packagePublicLevel(GuaranteedSimulationServicePackagePublicLevel packagePublicLevel) {
    this.packagePublicLevel = JsonNullable.of(packagePublicLevel);
    return this;
  }

  /**
   * Get packagePublicLevel
   * @return packagePublicLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePublicLevel> getPackagePublicLevel() {
    return packagePublicLevel;
  }

  public void setPackagePublicLevel(JsonNullable<GuaranteedSimulationServicePackagePublicLevel> packagePublicLevel) {
    this.packagePublicLevel = packagePublicLevel;
  }

  public GuaranteedSimulationServicePackage salesDocument(GuaranteedSimulationServiceSalesDocument salesDocument) {
    this.salesDocument = JsonNullable.of(salesDocument);
    return this;
  }

  /**
   * Get salesDocument
   * @return salesDocument
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceSalesDocument> getSalesDocument() {
    return salesDocument;
  }

  public void setSalesDocument(JsonNullable<GuaranteedSimulationServiceSalesDocument> salesDocument) {
    this.salesDocument = salesDocument;
  }

  public GuaranteedSimulationServicePackage promotionalDocument(GuaranteedSimulationServicePromotionalDocument promotionalDocument) {
    this.promotionalDocument = JsonNullable.of(promotionalDocument);
    return this;
  }

  /**
   * Get promotionalDocument
   * @return promotionalDocument
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePromotionalDocument> getPromotionalDocument() {
    return promotionalDocument;
  }

  public void setPromotionalDocument(JsonNullable<GuaranteedSimulationServicePromotionalDocument> promotionalDocument) {
    this.promotionalDocument = promotionalDocument;
  }

  public GuaranteedSimulationServicePackage relatedDocument(GuaranteedSimulationServiceRelatedDocument relatedDocument) {
    this.relatedDocument = JsonNullable.of(relatedDocument);
    return this;
  }

  /**
   * Get relatedDocument
   * @return relatedDocument
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceRelatedDocument> getRelatedDocument() {
    return relatedDocument;
  }

  public void setRelatedDocument(JsonNullable<GuaranteedSimulationServiceRelatedDocument> relatedDocument) {
    this.relatedDocument = relatedDocument;
  }

  public GuaranteedSimulationServicePackage adTypePermission(GuaranteedSimulationServicePackagePermissionType adTypePermission) {
    this.adTypePermission = JsonNullable.of(adTypePermission);
    return this;
  }

  /**
   * Get adTypePermission
   * @return adTypePermission
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermissionType> getAdTypePermission() {
    return adTypePermission;
  }

  public void setAdTypePermission(JsonNullable<GuaranteedSimulationServicePackagePermissionType> adTypePermission) {
    this.adTypePermission = adTypePermission;
  }

  public GuaranteedSimulationServicePackage adRequirements(List<GuaranteedSimulationServiceAdRequirement> adRequirements) {
    this.adRequirements = JsonNullable.of(adRequirements);
    return this;
  }

  public GuaranteedSimulationServicePackage addAdRequirementsItem(GuaranteedSimulationServiceAdRequirement adRequirementsItem) {
    if (this.adRequirements == null || !this.adRequirements.isPresent()) {
      this.adRequirements = JsonNullable.of(new ArrayList<>());
    }
    this.adRequirements.get().add(adRequirementsItem);
    return this;
  }

  /**
   * Get adRequirements
   * @return adRequirements
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedSimulationServiceAdRequirement>> getAdRequirements() {
    return adRequirements;
  }

  public void setAdRequirements(JsonNullable<List<GuaranteedSimulationServiceAdRequirement>> adRequirements) {
    this.adRequirements = adRequirements;
  }

  public GuaranteedSimulationServicePackage actionAfterVideoAdTap(GuaranteedSimulationServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = JsonNullable.of(actionAfterVideoAdTap);
    return this;
  }

  /**
   * Get actionAfterVideoAdTap
   * @return actionAfterVideoAdTap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceActionAfterVideoAdTap> getActionAfterVideoAdTap() {
    return actionAfterVideoAdTap;
  }

  public void setActionAfterVideoAdTap(JsonNullable<GuaranteedSimulationServiceActionAfterVideoAdTap> actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
  }

  public GuaranteedSimulationServicePackage instreamDurationType(GuaranteedSimulationServiceInstreamDurationType instreamDurationType) {
    this.instreamDurationType = JsonNullable.of(instreamDurationType);
    return this;
  }

  /**
   * Get instreamDurationType
   * @return instreamDurationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceInstreamDurationType> getInstreamDurationType() {
    return instreamDurationType;
  }

  public void setInstreamDurationType(JsonNullable<GuaranteedSimulationServiceInstreamDurationType> instreamDurationType) {
    this.instreamDurationType = instreamDurationType;
  }

  public GuaranteedSimulationServicePackage remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * <div lang=\"ja\">備考です。</div> <div lang=\"en\">Remarks.</div> 
   * @return remarks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">備考です。</div> <div lang=\"en\">Remarks.</div> ")


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public GuaranteedSimulationServicePackage packagePermittedViewableFrequencyCap(GuaranteedSimulationServicePackagePermittedViewableFrequencyCap packagePermittedViewableFrequencyCap) {
    this.packagePermittedViewableFrequencyCap = JsonNullable.of(packagePermittedViewableFrequencyCap);
    return this;
  }

  /**
   * Get packagePermittedViewableFrequencyCap
   * @return packagePermittedViewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedViewableFrequencyCap> getPackagePermittedViewableFrequencyCap() {
    return packagePermittedViewableFrequencyCap;
  }

  public void setPackagePermittedViewableFrequencyCap(JsonNullable<GuaranteedSimulationServicePackagePermittedViewableFrequencyCap> packagePermittedViewableFrequencyCap) {
    this.packagePermittedViewableFrequencyCap = packagePermittedViewableFrequencyCap;
  }

  public GuaranteedSimulationServicePackage packagePermittedAdPlaceTypes(GuaranteedSimulationServicePackagePermittedAdPlaceTypes packagePermittedAdPlaceTypes) {
    this.packagePermittedAdPlaceTypes = JsonNullable.of(packagePermittedAdPlaceTypes);
    return this;
  }

  /**
   * Get packagePermittedAdPlaceTypes
   * @return packagePermittedAdPlaceTypes
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedAdPlaceTypes> getPackagePermittedAdPlaceTypes() {
    return packagePermittedAdPlaceTypes;
  }

  public void setPackagePermittedAdPlaceTypes(JsonNullable<GuaranteedSimulationServicePackagePermittedAdPlaceTypes> packagePermittedAdPlaceTypes) {
    this.packagePermittedAdPlaceTypes = packagePermittedAdPlaceTypes;
  }

  public GuaranteedSimulationServicePackage packagePermittedGenderTarget(GuaranteedSimulationServicePackagePermittedGenderTarget packagePermittedGenderTarget) {
    this.packagePermittedGenderTarget = JsonNullable.of(packagePermittedGenderTarget);
    return this;
  }

  /**
   * Get packagePermittedGenderTarget
   * @return packagePermittedGenderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedGenderTarget> getPackagePermittedGenderTarget() {
    return packagePermittedGenderTarget;
  }

  public void setPackagePermittedGenderTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedGenderTarget> packagePermittedGenderTarget) {
    this.packagePermittedGenderTarget = packagePermittedGenderTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAgeTarget(GuaranteedSimulationServicePackagePermittedAgeTarget packagePermittedAgeTarget) {
    this.packagePermittedAgeTarget = JsonNullable.of(packagePermittedAgeTarget);
    return this;
  }

  /**
   * Get packagePermittedAgeTarget
   * @return packagePermittedAgeTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedAgeTarget> getPackagePermittedAgeTarget() {
    return packagePermittedAgeTarget;
  }

  public void setPackagePermittedAgeTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedAgeTarget> packagePermittedAgeTarget) {
    this.packagePermittedAgeTarget = packagePermittedAgeTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAudienceCategoryTarget(GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget packagePermittedAudienceCategoryTarget) {
    this.packagePermittedAudienceCategoryTarget = JsonNullable.of(packagePermittedAudienceCategoryTarget);
    return this;
  }

  /**
   * Get packagePermittedAudienceCategoryTarget
   * @return packagePermittedAudienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget> getPackagePermittedAudienceCategoryTarget() {
    return packagePermittedAudienceCategoryTarget;
  }

  public void setPackagePermittedAudienceCategoryTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget> packagePermittedAudienceCategoryTarget) {
    this.packagePermittedAudienceCategoryTarget = packagePermittedAudienceCategoryTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedGeoTarget(GuaranteedSimulationServicePackagePermittedGeoTarget packagePermittedGeoTarget) {
    this.packagePermittedGeoTarget = JsonNullable.of(packagePermittedGeoTarget);
    return this;
  }

  /**
   * Get packagePermittedGeoTarget
   * @return packagePermittedGeoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedGeoTarget> getPackagePermittedGeoTarget() {
    return packagePermittedGeoTarget;
  }

  public void setPackagePermittedGeoTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedGeoTarget> packagePermittedGeoTarget) {
    this.packagePermittedGeoTarget = packagePermittedGeoTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAdScheduleTarget(GuaranteedSimulationServicePackagePermittedAdScheduleTarget packagePermittedAdScheduleTarget) {
    this.packagePermittedAdScheduleTarget = JsonNullable.of(packagePermittedAdScheduleTarget);
    return this;
  }

  /**
   * Get packagePermittedAdScheduleTarget
   * @return packagePermittedAdScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedAdScheduleTarget> getPackagePermittedAdScheduleTarget() {
    return packagePermittedAdScheduleTarget;
  }

  public void setPackagePermittedAdScheduleTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedAdScheduleTarget> packagePermittedAdScheduleTarget) {
    this.packagePermittedAdScheduleTarget = packagePermittedAdScheduleTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedDeviceTarget(GuaranteedSimulationServicePackagePermittedDeviceTarget packagePermittedDeviceTarget) {
    this.packagePermittedDeviceTarget = JsonNullable.of(packagePermittedDeviceTarget);
    return this;
  }

  /**
   * Get packagePermittedDeviceTarget
   * @return packagePermittedDeviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedDeviceTarget> getPackagePermittedDeviceTarget() {
    return packagePermittedDeviceTarget;
  }

  public void setPackagePermittedDeviceTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedDeviceTarget> packagePermittedDeviceTarget) {
    this.packagePermittedDeviceTarget = packagePermittedDeviceTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedOsTarget(GuaranteedSimulationServicePackagePermittedOsTarget packagePermittedOsTarget) {
    this.packagePermittedOsTarget = JsonNullable.of(packagePermittedOsTarget);
    return this;
  }

  /**
   * Get packagePermittedOsTarget
   * @return packagePermittedOsTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedOsTarget> getPackagePermittedOsTarget() {
    return packagePermittedOsTarget;
  }

  public void setPackagePermittedOsTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedOsTarget> packagePermittedOsTarget) {
    this.packagePermittedOsTarget = packagePermittedOsTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAppTarget(GuaranteedSimulationServicePackagePermittedAppTarget packagePermittedAppTarget) {
    this.packagePermittedAppTarget = JsonNullable.of(packagePermittedAppTarget);
    return this;
  }

  /**
   * Get packagePermittedAppTarget
   * @return packagePermittedAppTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedAppTarget> getPackagePermittedAppTarget() {
    return packagePermittedAppTarget;
  }

  public void setPackagePermittedAppTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedAppTarget> packagePermittedAppTarget) {
    this.packagePermittedAppTarget = packagePermittedAppTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedPlacementCategoryTarget(GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget packagePermittedPlacementCategoryTarget) {
    this.packagePermittedPlacementCategoryTarget = JsonNullable.of(packagePermittedPlacementCategoryTarget);
    return this;
  }

  /**
   * Get packagePermittedPlacementCategoryTarget
   * @return packagePermittedPlacementCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget> getPackagePermittedPlacementCategoryTarget() {
    return packagePermittedPlacementCategoryTarget;
  }

  public void setPackagePermittedPlacementCategoryTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget> packagePermittedPlacementCategoryTarget) {
    this.packagePermittedPlacementCategoryTarget = packagePermittedPlacementCategoryTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedPositionTarget(GuaranteedSimulationServicePackagePermittedPositionTarget packagePermittedPositionTarget) {
    this.packagePermittedPositionTarget = JsonNullable.of(packagePermittedPositionTarget);
    return this;
  }

  /**
   * Get packagePermittedPositionTarget
   * @return packagePermittedPositionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedPositionTarget> getPackagePermittedPositionTarget() {
    return packagePermittedPositionTarget;
  }

  public void setPackagePermittedPositionTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedPositionTarget> packagePermittedPositionTarget) {
    this.packagePermittedPositionTarget = packagePermittedPositionTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedSiteRetargetingTarget(GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget packagePermittedSiteRetargetingTarget) {
    this.packagePermittedSiteRetargetingTarget = JsonNullable.of(packagePermittedSiteRetargetingTarget);
    return this;
  }

  /**
   * Get packagePermittedSiteRetargetingTarget
   * @return packagePermittedSiteRetargetingTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget> getPackagePermittedSiteRetargetingTarget() {
    return packagePermittedSiteRetargetingTarget;
  }

  public void setPackagePermittedSiteRetargetingTarget(JsonNullable<GuaranteedSimulationServicePackagePermittedSiteRetargetingTarget> packagePermittedSiteRetargetingTarget) {
    this.packagePermittedSiteRetargetingTarget = packagePermittedSiteRetargetingTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePackage guaranteedSimulationServicePackage = (GuaranteedSimulationServicePackage) o;
    return Objects.equals(this.packageId, guaranteedSimulationServicePackage.packageId) &&
        Objects.equals(this.packageHistoryId, guaranteedSimulationServicePackage.packageHistoryId) &&
        Objects.equals(this.packageName, guaranteedSimulationServicePackage.packageName) &&
        Objects.equals(this.sellingStartDate, guaranteedSimulationServicePackage.sellingStartDate) &&
        Objects.equals(this.sellingEndDate, guaranteedSimulationServicePackage.sellingEndDate) &&
        Objects.equals(this.adDeliveryDurationStartDate, guaranteedSimulationServicePackage.adDeliveryDurationStartDate) &&
        Objects.equals(this.reservationStartDate, guaranteedSimulationServicePackage.reservationStartDate) &&
        Objects.equals(this.reservationEndDate, guaranteedSimulationServicePackage.reservationEndDate) &&
        Objects.equals(this.adDeliveryDurationEndDate, guaranteedSimulationServicePackage.adDeliveryDurationEndDate) &&
        Objects.equals(this.buyingTerm, guaranteedSimulationServicePackage.buyingTerm) &&
        Objects.equals(this.pricingPackage, guaranteedSimulationServicePackage.pricingPackage) &&
        Objects.equals(this.packagePublicLevel, guaranteedSimulationServicePackage.packagePublicLevel) &&
        Objects.equals(this.salesDocument, guaranteedSimulationServicePackage.salesDocument) &&
        Objects.equals(this.promotionalDocument, guaranteedSimulationServicePackage.promotionalDocument) &&
        Objects.equals(this.relatedDocument, guaranteedSimulationServicePackage.relatedDocument) &&
        Objects.equals(this.adTypePermission, guaranteedSimulationServicePackage.adTypePermission) &&
        Objects.equals(this.adRequirements, guaranteedSimulationServicePackage.adRequirements) &&
        Objects.equals(this.actionAfterVideoAdTap, guaranteedSimulationServicePackage.actionAfterVideoAdTap) &&
        Objects.equals(this.instreamDurationType, guaranteedSimulationServicePackage.instreamDurationType) &&
        Objects.equals(this.remarks, guaranteedSimulationServicePackage.remarks) &&
        Objects.equals(this.packagePermittedViewableFrequencyCap, guaranteedSimulationServicePackage.packagePermittedViewableFrequencyCap) &&
        Objects.equals(this.packagePermittedAdPlaceTypes, guaranteedSimulationServicePackage.packagePermittedAdPlaceTypes) &&
        Objects.equals(this.packagePermittedGenderTarget, guaranteedSimulationServicePackage.packagePermittedGenderTarget) &&
        Objects.equals(this.packagePermittedAgeTarget, guaranteedSimulationServicePackage.packagePermittedAgeTarget) &&
        Objects.equals(this.packagePermittedAudienceCategoryTarget, guaranteedSimulationServicePackage.packagePermittedAudienceCategoryTarget) &&
        Objects.equals(this.packagePermittedGeoTarget, guaranteedSimulationServicePackage.packagePermittedGeoTarget) &&
        Objects.equals(this.packagePermittedAdScheduleTarget, guaranteedSimulationServicePackage.packagePermittedAdScheduleTarget) &&
        Objects.equals(this.packagePermittedDeviceTarget, guaranteedSimulationServicePackage.packagePermittedDeviceTarget) &&
        Objects.equals(this.packagePermittedOsTarget, guaranteedSimulationServicePackage.packagePermittedOsTarget) &&
        Objects.equals(this.packagePermittedAppTarget, guaranteedSimulationServicePackage.packagePermittedAppTarget) &&
        Objects.equals(this.packagePermittedPlacementCategoryTarget, guaranteedSimulationServicePackage.packagePermittedPlacementCategoryTarget) &&
        Objects.equals(this.packagePermittedPositionTarget, guaranteedSimulationServicePackage.packagePermittedPositionTarget) &&
        Objects.equals(this.packagePermittedSiteRetargetingTarget, guaranteedSimulationServicePackage.packagePermittedSiteRetargetingTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageId, packageHistoryId, packageName, sellingStartDate, sellingEndDate, adDeliveryDurationStartDate, reservationStartDate, reservationEndDate, adDeliveryDurationEndDate, buyingTerm, pricingPackage, packagePublicLevel, salesDocument, promotionalDocument, relatedDocument, adTypePermission, adRequirements, actionAfterVideoAdTap, instreamDurationType, remarks, packagePermittedViewableFrequencyCap, packagePermittedAdPlaceTypes, packagePermittedGenderTarget, packagePermittedAgeTarget, packagePermittedAudienceCategoryTarget, packagePermittedGeoTarget, packagePermittedAdScheduleTarget, packagePermittedDeviceTarget, packagePermittedOsTarget, packagePermittedAppTarget, packagePermittedPlacementCategoryTarget, packagePermittedPositionTarget, packagePermittedSiteRetargetingTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackage {\n");
    
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageHistoryId: ").append(toIndentedString(packageHistoryId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    sellingStartDate: ").append(toIndentedString(sellingStartDate)).append("\n");
    sb.append("    sellingEndDate: ").append(toIndentedString(sellingEndDate)).append("\n");
    sb.append("    adDeliveryDurationStartDate: ").append(toIndentedString(adDeliveryDurationStartDate)).append("\n");
    sb.append("    reservationStartDate: ").append(toIndentedString(reservationStartDate)).append("\n");
    sb.append("    reservationEndDate: ").append(toIndentedString(reservationEndDate)).append("\n");
    sb.append("    adDeliveryDurationEndDate: ").append(toIndentedString(adDeliveryDurationEndDate)).append("\n");
    sb.append("    buyingTerm: ").append(toIndentedString(buyingTerm)).append("\n");
    sb.append("    pricingPackage: ").append(toIndentedString(pricingPackage)).append("\n");
    sb.append("    packagePublicLevel: ").append(toIndentedString(packagePublicLevel)).append("\n");
    sb.append("    salesDocument: ").append(toIndentedString(salesDocument)).append("\n");
    sb.append("    promotionalDocument: ").append(toIndentedString(promotionalDocument)).append("\n");
    sb.append("    relatedDocument: ").append(toIndentedString(relatedDocument)).append("\n");
    sb.append("    adTypePermission: ").append(toIndentedString(adTypePermission)).append("\n");
    sb.append("    adRequirements: ").append(toIndentedString(adRequirements)).append("\n");
    sb.append("    actionAfterVideoAdTap: ").append(toIndentedString(actionAfterVideoAdTap)).append("\n");
    sb.append("    instreamDurationType: ").append(toIndentedString(instreamDurationType)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    packagePermittedViewableFrequencyCap: ").append(toIndentedString(packagePermittedViewableFrequencyCap)).append("\n");
    sb.append("    packagePermittedAdPlaceTypes: ").append(toIndentedString(packagePermittedAdPlaceTypes)).append("\n");
    sb.append("    packagePermittedGenderTarget: ").append(toIndentedString(packagePermittedGenderTarget)).append("\n");
    sb.append("    packagePermittedAgeTarget: ").append(toIndentedString(packagePermittedAgeTarget)).append("\n");
    sb.append("    packagePermittedAudienceCategoryTarget: ").append(toIndentedString(packagePermittedAudienceCategoryTarget)).append("\n");
    sb.append("    packagePermittedGeoTarget: ").append(toIndentedString(packagePermittedGeoTarget)).append("\n");
    sb.append("    packagePermittedAdScheduleTarget: ").append(toIndentedString(packagePermittedAdScheduleTarget)).append("\n");
    sb.append("    packagePermittedDeviceTarget: ").append(toIndentedString(packagePermittedDeviceTarget)).append("\n");
    sb.append("    packagePermittedOsTarget: ").append(toIndentedString(packagePermittedOsTarget)).append("\n");
    sb.append("    packagePermittedAppTarget: ").append(toIndentedString(packagePermittedAppTarget)).append("\n");
    sb.append("    packagePermittedPlacementCategoryTarget: ").append(toIndentedString(packagePermittedPlacementCategoryTarget)).append("\n");
    sb.append("    packagePermittedPositionTarget: ").append(toIndentedString(packagePermittedPositionTarget)).append("\n");
    sb.append("    packagePermittedSiteRetargetingTarget: ").append(toIndentedString(packagePermittedSiteRetargetingTarget)).append("\n");
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


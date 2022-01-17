package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceActionAfterVideoAdTap;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceAdRequirement;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceBuyingTerm;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceInstreamDurationType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedAdScheduleTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedAgeTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedAppTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedAudienceListTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedDeviceTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedGenderTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedGeoTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedOsTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedPositionTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermittedViewableFrequencyCap;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePublicLevel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePricingPackage;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePromotionalDocument;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceRelatedDocument;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceSalesDocument;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackageオブジェクトは、商品情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackage object contains package information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackageオブジェクトは、商品情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePackage object contains package information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePackage   {
  @JsonProperty("packageId")
  private Long packageId;

  @JsonProperty("packageHistoryId")
  private Long packageHistoryId;

  @JsonProperty("packageName")
  private String packageName;

  @JsonProperty("sellingStartDate")
  private String sellingStartDate = null;

  @JsonProperty("sellingEndDate")
  private String sellingEndDate = null;

  @JsonProperty("adDeliveryDurationStartDate")
  private String adDeliveryDurationStartDate = null;

  @JsonProperty("reservationStartDate")
  private String reservationStartDate = null;

  @JsonProperty("reservationEndDate")
  private String reservationEndDate = null;

  @JsonProperty("adDeliveryDurationEndDate")
  private String adDeliveryDurationEndDate = null;

  @JsonProperty("buyingTerm")
  private GuaranteedSimulationServiceBuyingTerm buyingTerm = null;

  @JsonProperty("pricingPackage")
  private GuaranteedSimulationServicePricingPackage pricingPackage = null;

  @JsonProperty("packagePublicLevel")
  private GuaranteedSimulationServicePackagePublicLevel packagePublicLevel = null;

  @JsonProperty("salesDocument")
  private GuaranteedSimulationServiceSalesDocument salesDocument = null;

  @JsonProperty("promotionalDocument")
  private GuaranteedSimulationServicePromotionalDocument promotionalDocument = null;

  @JsonProperty("relatedDocument")
  private GuaranteedSimulationServiceRelatedDocument relatedDocument = null;

  @JsonProperty("adRequirements")
  @Valid
  private List<GuaranteedSimulationServiceAdRequirement> adRequirements = null;

  @JsonProperty("actionAfterVideoAdTap")
  private GuaranteedSimulationServiceActionAfterVideoAdTap actionAfterVideoAdTap = null;

  @JsonProperty("instreamDurationType")
  private GuaranteedSimulationServiceInstreamDurationType instreamDurationType = null;

  @JsonProperty("remarks")
  private String remarks;

  @JsonProperty("packagePermittedViewableFrequencyCap")
  private GuaranteedSimulationServicePackagePermittedViewableFrequencyCap packagePermittedViewableFrequencyCap = null;

  @JsonProperty("packagePermittedGenderTarget")
  private GuaranteedSimulationServicePackagePermittedGenderTarget packagePermittedGenderTarget = null;

  @JsonProperty("packagePermittedAgeTarget")
  private GuaranteedSimulationServicePackagePermittedAgeTarget packagePermittedAgeTarget = null;

  @JsonProperty("packagePermittedAudienceCategoryTarget")
  private GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget packagePermittedAudienceCategoryTarget = null;

  @JsonProperty("packagePermittedGeoTarget")
  private GuaranteedSimulationServicePackagePermittedGeoTarget packagePermittedGeoTarget = null;

  @JsonProperty("packagePermittedAdScheduleTarget")
  private GuaranteedSimulationServicePackagePermittedAdScheduleTarget packagePermittedAdScheduleTarget = null;

  @JsonProperty("packagePermittedDeviceTarget")
  private GuaranteedSimulationServicePackagePermittedDeviceTarget packagePermittedDeviceTarget = null;

  @JsonProperty("packagePermittedOsTarget")
  private GuaranteedSimulationServicePackagePermittedOsTarget packagePermittedOsTarget = null;

  @JsonProperty("packagePermittedAppTarget")
  private GuaranteedSimulationServicePackagePermittedAppTarget packagePermittedAppTarget = null;

  @JsonProperty("packagePermittedPlacementCategoryTarget")
  private GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget packagePermittedPlacementCategoryTarget = null;

  @JsonProperty("packagePermittedPositionTarget")
  private GuaranteedSimulationServicePackagePermittedPositionTarget packagePermittedPositionTarget = null;

  @JsonProperty("packagePermittedAudienceListTarget")
  private GuaranteedSimulationServicePackagePermittedAudienceListTarget packagePermittedAudienceListTarget = null;

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
    this.sellingStartDate = sellingStartDate;
    return this;
  }

  /**
   * <div lang=\"ja\">   商品開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the package.<br>   Format: yyyyMMdd </div> 
   * @return sellingStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   商品開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the package.<br>   Format: yyyyMMdd </div> ")


  public String getSellingStartDate() {
    return sellingStartDate;
  }

  public void setSellingStartDate(String sellingStartDate) {
    this.sellingStartDate = sellingStartDate;
  }

  public GuaranteedSimulationServicePackage sellingEndDate(String sellingEndDate) {
    this.sellingEndDate = sellingEndDate;
    return this;
  }

  /**
   * <div lang=\"ja\">   商品終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the package.<br>   Format: yyyyMMdd </div> 
   * @return sellingEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   商品終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the package.<br>   Format: yyyyMMdd </div> ")


  public String getSellingEndDate() {
    return sellingEndDate;
  }

  public void setSellingEndDate(String sellingEndDate) {
    this.sellingEndDate = sellingEndDate;
  }

  public GuaranteedSimulationServicePackage adDeliveryDurationStartDate(String adDeliveryDurationStartDate) {
    this.adDeliveryDurationStartDate = adDeliveryDurationStartDate;
    return this;
  }

  /**
   * <div lang=\"ja\">   広告の掲載有効期間の開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the ad delivery validity period.<br>   Format: yyyyMMdd </div> 
   * @return adDeliveryDurationStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   広告の掲載有効期間の開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the ad delivery validity period.<br>   Format: yyyyMMdd </div> ")


  public String getAdDeliveryDurationStartDate() {
    return adDeliveryDurationStartDate;
  }

  public void setAdDeliveryDurationStartDate(String adDeliveryDurationStartDate) {
    this.adDeliveryDurationStartDate = adDeliveryDurationStartDate;
  }

  public GuaranteedSimulationServicePackage reservationStartDate(String reservationStartDate) {
    this.reservationStartDate = reservationStartDate;
    return this;
  }

  /**
   * <div lang=\"ja\">   予約期間開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of reservation period.<br>   Format: yyyyMMdd </div> 
   * @return reservationStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   予約期間開始日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of reservation period.<br>   Format: yyyyMMdd </div> ")


  public String getReservationStartDate() {
    return reservationStartDate;
  }

  public void setReservationStartDate(String reservationStartDate) {
    this.reservationStartDate = reservationStartDate;
  }

  public GuaranteedSimulationServicePackage reservationEndDate(String reservationEndDate) {
    this.reservationEndDate = reservationEndDate;
    return this;
  }

  /**
   * <div lang=\"ja\">   予約期間終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of reservation period.<br>   Format: yyyyMMdd </div> 
   * @return reservationEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   予約期間終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of reservation period.<br>   Format: yyyyMMdd </div> ")


  public String getReservationEndDate() {
    return reservationEndDate;
  }

  public void setReservationEndDate(String reservationEndDate) {
    this.reservationEndDate = reservationEndDate;
  }

  public GuaranteedSimulationServicePackage adDeliveryDurationEndDate(String adDeliveryDurationEndDate) {
    this.adDeliveryDurationEndDate = adDeliveryDurationEndDate;
    return this;
  }

  /**
   * <div lang=\"ja\">   掲載有効期間の終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the ad delivery validity period.<br>   Format: yyyyMMdd </div> 
   * @return adDeliveryDurationEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   掲載有効期間の終了日です。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the ad delivery validity period.<br>   Format: yyyyMMdd </div> ")


  public String getAdDeliveryDurationEndDate() {
    return adDeliveryDurationEndDate;
  }

  public void setAdDeliveryDurationEndDate(String adDeliveryDurationEndDate) {
    this.adDeliveryDurationEndDate = adDeliveryDurationEndDate;
  }

  public GuaranteedSimulationServicePackage buyingTerm(GuaranteedSimulationServiceBuyingTerm buyingTerm) {
    this.buyingTerm = buyingTerm;
    return this;
  }

  /**
   * Get buyingTerm
   * @return buyingTerm
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceBuyingTerm getBuyingTerm() {
    return buyingTerm;
  }

  public void setBuyingTerm(GuaranteedSimulationServiceBuyingTerm buyingTerm) {
    this.buyingTerm = buyingTerm;
  }

  public GuaranteedSimulationServicePackage pricingPackage(GuaranteedSimulationServicePricingPackage pricingPackage) {
    this.pricingPackage = pricingPackage;
    return this;
  }

  /**
   * Get pricingPackage
   * @return pricingPackage
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePricingPackage getPricingPackage() {
    return pricingPackage;
  }

  public void setPricingPackage(GuaranteedSimulationServicePricingPackage pricingPackage) {
    this.pricingPackage = pricingPackage;
  }

  public GuaranteedSimulationServicePackage packagePublicLevel(GuaranteedSimulationServicePackagePublicLevel packagePublicLevel) {
    this.packagePublicLevel = packagePublicLevel;
    return this;
  }

  /**
   * Get packagePublicLevel
   * @return packagePublicLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePublicLevel getPackagePublicLevel() {
    return packagePublicLevel;
  }

  public void setPackagePublicLevel(GuaranteedSimulationServicePackagePublicLevel packagePublicLevel) {
    this.packagePublicLevel = packagePublicLevel;
  }

  public GuaranteedSimulationServicePackage salesDocument(GuaranteedSimulationServiceSalesDocument salesDocument) {
    this.salesDocument = salesDocument;
    return this;
  }

  /**
   * Get salesDocument
   * @return salesDocument
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceSalesDocument getSalesDocument() {
    return salesDocument;
  }

  public void setSalesDocument(GuaranteedSimulationServiceSalesDocument salesDocument) {
    this.salesDocument = salesDocument;
  }

  public GuaranteedSimulationServicePackage promotionalDocument(GuaranteedSimulationServicePromotionalDocument promotionalDocument) {
    this.promotionalDocument = promotionalDocument;
    return this;
  }

  /**
   * Get promotionalDocument
   * @return promotionalDocument
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePromotionalDocument getPromotionalDocument() {
    return promotionalDocument;
  }

  public void setPromotionalDocument(GuaranteedSimulationServicePromotionalDocument promotionalDocument) {
    this.promotionalDocument = promotionalDocument;
  }

  public GuaranteedSimulationServicePackage relatedDocument(GuaranteedSimulationServiceRelatedDocument relatedDocument) {
    this.relatedDocument = relatedDocument;
    return this;
  }

  /**
   * Get relatedDocument
   * @return relatedDocument
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceRelatedDocument getRelatedDocument() {
    return relatedDocument;
  }

  public void setRelatedDocument(GuaranteedSimulationServiceRelatedDocument relatedDocument) {
    this.relatedDocument = relatedDocument;
  }

  public GuaranteedSimulationServicePackage adRequirements(List<GuaranteedSimulationServiceAdRequirement> adRequirements) {
    this.adRequirements = adRequirements;
    return this;
  }

  public GuaranteedSimulationServicePackage addAdRequirementsItem(GuaranteedSimulationServiceAdRequirement adRequirementsItem) {
    if (this.adRequirements == null) {
      this.adRequirements = new ArrayList<>();
    }
    this.adRequirements.add(adRequirementsItem);
    return this;
  }

  /**
   * Get adRequirements
   * @return adRequirements
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceAdRequirement> getAdRequirements() {
    return adRequirements;
  }

  public void setAdRequirements(List<GuaranteedSimulationServiceAdRequirement> adRequirements) {
    this.adRequirements = adRequirements;
  }

  public GuaranteedSimulationServicePackage actionAfterVideoAdTap(GuaranteedSimulationServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
    return this;
  }

  /**
   * Get actionAfterVideoAdTap
   * @return actionAfterVideoAdTap
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceActionAfterVideoAdTap getActionAfterVideoAdTap() {
    return actionAfterVideoAdTap;
  }

  public void setActionAfterVideoAdTap(GuaranteedSimulationServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
  }

  public GuaranteedSimulationServicePackage instreamDurationType(GuaranteedSimulationServiceInstreamDurationType instreamDurationType) {
    this.instreamDurationType = instreamDurationType;
    return this;
  }

  /**
   * Get instreamDurationType
   * @return instreamDurationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceInstreamDurationType getInstreamDurationType() {
    return instreamDurationType;
  }

  public void setInstreamDurationType(GuaranteedSimulationServiceInstreamDurationType instreamDurationType) {
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
    this.packagePermittedViewableFrequencyCap = packagePermittedViewableFrequencyCap;
    return this;
  }

  /**
   * Get packagePermittedViewableFrequencyCap
   * @return packagePermittedViewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap getPackagePermittedViewableFrequencyCap() {
    return packagePermittedViewableFrequencyCap;
  }

  public void setPackagePermittedViewableFrequencyCap(GuaranteedSimulationServicePackagePermittedViewableFrequencyCap packagePermittedViewableFrequencyCap) {
    this.packagePermittedViewableFrequencyCap = packagePermittedViewableFrequencyCap;
  }

  public GuaranteedSimulationServicePackage packagePermittedGenderTarget(GuaranteedSimulationServicePackagePermittedGenderTarget packagePermittedGenderTarget) {
    this.packagePermittedGenderTarget = packagePermittedGenderTarget;
    return this;
  }

  /**
   * Get packagePermittedGenderTarget
   * @return packagePermittedGenderTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedGenderTarget getPackagePermittedGenderTarget() {
    return packagePermittedGenderTarget;
  }

  public void setPackagePermittedGenderTarget(GuaranteedSimulationServicePackagePermittedGenderTarget packagePermittedGenderTarget) {
    this.packagePermittedGenderTarget = packagePermittedGenderTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAgeTarget(GuaranteedSimulationServicePackagePermittedAgeTarget packagePermittedAgeTarget) {
    this.packagePermittedAgeTarget = packagePermittedAgeTarget;
    return this;
  }

  /**
   * Get packagePermittedAgeTarget
   * @return packagePermittedAgeTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedAgeTarget getPackagePermittedAgeTarget() {
    return packagePermittedAgeTarget;
  }

  public void setPackagePermittedAgeTarget(GuaranteedSimulationServicePackagePermittedAgeTarget packagePermittedAgeTarget) {
    this.packagePermittedAgeTarget = packagePermittedAgeTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAudienceCategoryTarget(GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget packagePermittedAudienceCategoryTarget) {
    this.packagePermittedAudienceCategoryTarget = packagePermittedAudienceCategoryTarget;
    return this;
  }

  /**
   * Get packagePermittedAudienceCategoryTarget
   * @return packagePermittedAudienceCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget getPackagePermittedAudienceCategoryTarget() {
    return packagePermittedAudienceCategoryTarget;
  }

  public void setPackagePermittedAudienceCategoryTarget(GuaranteedSimulationServicePackagePermittedAudienceCategoryTarget packagePermittedAudienceCategoryTarget) {
    this.packagePermittedAudienceCategoryTarget = packagePermittedAudienceCategoryTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedGeoTarget(GuaranteedSimulationServicePackagePermittedGeoTarget packagePermittedGeoTarget) {
    this.packagePermittedGeoTarget = packagePermittedGeoTarget;
    return this;
  }

  /**
   * Get packagePermittedGeoTarget
   * @return packagePermittedGeoTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedGeoTarget getPackagePermittedGeoTarget() {
    return packagePermittedGeoTarget;
  }

  public void setPackagePermittedGeoTarget(GuaranteedSimulationServicePackagePermittedGeoTarget packagePermittedGeoTarget) {
    this.packagePermittedGeoTarget = packagePermittedGeoTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAdScheduleTarget(GuaranteedSimulationServicePackagePermittedAdScheduleTarget packagePermittedAdScheduleTarget) {
    this.packagePermittedAdScheduleTarget = packagePermittedAdScheduleTarget;
    return this;
  }

  /**
   * Get packagePermittedAdScheduleTarget
   * @return packagePermittedAdScheduleTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedAdScheduleTarget getPackagePermittedAdScheduleTarget() {
    return packagePermittedAdScheduleTarget;
  }

  public void setPackagePermittedAdScheduleTarget(GuaranteedSimulationServicePackagePermittedAdScheduleTarget packagePermittedAdScheduleTarget) {
    this.packagePermittedAdScheduleTarget = packagePermittedAdScheduleTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedDeviceTarget(GuaranteedSimulationServicePackagePermittedDeviceTarget packagePermittedDeviceTarget) {
    this.packagePermittedDeviceTarget = packagePermittedDeviceTarget;
    return this;
  }

  /**
   * Get packagePermittedDeviceTarget
   * @return packagePermittedDeviceTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedDeviceTarget getPackagePermittedDeviceTarget() {
    return packagePermittedDeviceTarget;
  }

  public void setPackagePermittedDeviceTarget(GuaranteedSimulationServicePackagePermittedDeviceTarget packagePermittedDeviceTarget) {
    this.packagePermittedDeviceTarget = packagePermittedDeviceTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedOsTarget(GuaranteedSimulationServicePackagePermittedOsTarget packagePermittedOsTarget) {
    this.packagePermittedOsTarget = packagePermittedOsTarget;
    return this;
  }

  /**
   * Get packagePermittedOsTarget
   * @return packagePermittedOsTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedOsTarget getPackagePermittedOsTarget() {
    return packagePermittedOsTarget;
  }

  public void setPackagePermittedOsTarget(GuaranteedSimulationServicePackagePermittedOsTarget packagePermittedOsTarget) {
    this.packagePermittedOsTarget = packagePermittedOsTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAppTarget(GuaranteedSimulationServicePackagePermittedAppTarget packagePermittedAppTarget) {
    this.packagePermittedAppTarget = packagePermittedAppTarget;
    return this;
  }

  /**
   * Get packagePermittedAppTarget
   * @return packagePermittedAppTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedAppTarget getPackagePermittedAppTarget() {
    return packagePermittedAppTarget;
  }

  public void setPackagePermittedAppTarget(GuaranteedSimulationServicePackagePermittedAppTarget packagePermittedAppTarget) {
    this.packagePermittedAppTarget = packagePermittedAppTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedPlacementCategoryTarget(GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget packagePermittedPlacementCategoryTarget) {
    this.packagePermittedPlacementCategoryTarget = packagePermittedPlacementCategoryTarget;
    return this;
  }

  /**
   * Get packagePermittedPlacementCategoryTarget
   * @return packagePermittedPlacementCategoryTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget getPackagePermittedPlacementCategoryTarget() {
    return packagePermittedPlacementCategoryTarget;
  }

  public void setPackagePermittedPlacementCategoryTarget(GuaranteedSimulationServicePackagePermittedPlacementCategoryTarget packagePermittedPlacementCategoryTarget) {
    this.packagePermittedPlacementCategoryTarget = packagePermittedPlacementCategoryTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedPositionTarget(GuaranteedSimulationServicePackagePermittedPositionTarget packagePermittedPositionTarget) {
    this.packagePermittedPositionTarget = packagePermittedPositionTarget;
    return this;
  }

  /**
   * Get packagePermittedPositionTarget
   * @return packagePermittedPositionTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedPositionTarget getPackagePermittedPositionTarget() {
    return packagePermittedPositionTarget;
  }

  public void setPackagePermittedPositionTarget(GuaranteedSimulationServicePackagePermittedPositionTarget packagePermittedPositionTarget) {
    this.packagePermittedPositionTarget = packagePermittedPositionTarget;
  }

  public GuaranteedSimulationServicePackage packagePermittedAudienceListTarget(GuaranteedSimulationServicePackagePermittedAudienceListTarget packagePermittedAudienceListTarget) {
    this.packagePermittedAudienceListTarget = packagePermittedAudienceListTarget;
    return this;
  }

  /**
   * Get packagePermittedAudienceListTarget
   * @return packagePermittedAudienceListTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermittedAudienceListTarget getPackagePermittedAudienceListTarget() {
    return packagePermittedAudienceListTarget;
  }

  public void setPackagePermittedAudienceListTarget(GuaranteedSimulationServicePackagePermittedAudienceListTarget packagePermittedAudienceListTarget) {
    this.packagePermittedAudienceListTarget = packagePermittedAudienceListTarget;
  }


  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.adRequirements, guaranteedSimulationServicePackage.adRequirements) &&
        Objects.equals(this.actionAfterVideoAdTap, guaranteedSimulationServicePackage.actionAfterVideoAdTap) &&
        Objects.equals(this.instreamDurationType, guaranteedSimulationServicePackage.instreamDurationType) &&
        Objects.equals(this.remarks, guaranteedSimulationServicePackage.remarks) &&
        Objects.equals(this.packagePermittedViewableFrequencyCap, guaranteedSimulationServicePackage.packagePermittedViewableFrequencyCap) &&
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
        Objects.equals(this.packagePermittedAudienceListTarget, guaranteedSimulationServicePackage.packagePermittedAudienceListTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageId, packageHistoryId, packageName, sellingStartDate, sellingEndDate, adDeliveryDurationStartDate, reservationStartDate, reservationEndDate, adDeliveryDurationEndDate, buyingTerm, pricingPackage, packagePublicLevel, salesDocument, promotionalDocument, relatedDocument, adRequirements, actionAfterVideoAdTap, instreamDurationType, remarks, packagePermittedViewableFrequencyCap, packagePermittedGenderTarget, packagePermittedAgeTarget, packagePermittedAudienceCategoryTarget, packagePermittedGeoTarget, packagePermittedAdScheduleTarget, packagePermittedDeviceTarget, packagePermittedOsTarget, packagePermittedAppTarget, packagePermittedPlacementCategoryTarget, packagePermittedPositionTarget, packagePermittedAudienceListTarget);
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
    sb.append("    adRequirements: ").append(toIndentedString(adRequirements)).append("\n");
    sb.append("    actionAfterVideoAdTap: ").append(toIndentedString(actionAfterVideoAdTap)).append("\n");
    sb.append("    instreamDurationType: ").append(toIndentedString(instreamDurationType)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    packagePermittedViewableFrequencyCap: ").append(toIndentedString(packagePermittedViewableFrequencyCap)).append("\n");
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
    sb.append("    packagePermittedAudienceListTarget: ").append(toIndentedString(packagePermittedAudienceListTarget)).append("\n");
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


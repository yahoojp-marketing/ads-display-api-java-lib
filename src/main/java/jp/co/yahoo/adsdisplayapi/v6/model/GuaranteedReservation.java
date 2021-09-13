package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedReservationServiceConversionTracker;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedReservationオブジェクトは、シミュレーション結果に基づいた予約情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedReservation object contains a reservation information based on simulation result. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedReservationオブジェクトは、シミュレーション結果に基づいた予約情報を保持します。</div> <div lang=\"en\">GuaranteedReservation object contains a reservation information based on simulation result. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedReservation   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("guaranteedSimulationId")
  private Long guaranteedSimulationId = null;

  @JsonProperty("lifetimeBudget")
  private Long lifetimeBudget = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("notificationEmailAddress")
  @Valid
  private List<String> notificationEmailAddress = null;

  @JsonProperty("conversionTracker")
  private GuaranteedReservationServiceConversionTracker conversionTracker = null;

  public GuaranteedReservation accountId(Long accountId) {
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

  public GuaranteedReservation guaranteedSimulationId(Long guaranteedSimulationId) {
    this.guaranteedSimulationId = guaranteedSimulationId;
    return this;
  }

  /**
   * <div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Simulation ID. <br> This field is required in requests. </div> 
   * @return guaranteedSimulationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Simulation ID. <br> This field is required in requests. </div> ")


  public Long getGuaranteedSimulationId() {
    return guaranteedSimulationId;
  }

  public void setGuaranteedSimulationId(Long guaranteedSimulationId) {
    this.guaranteedSimulationId = guaranteedSimulationId;
  }

  public GuaranteedReservation lifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> This field is required in requests. </div> 
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> This field is required in requests. </div> ")


  public Long getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedReservation adGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in requests. </div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in requests. </div> ")


  public String getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }

  public GuaranteedReservation campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign name.<br> This field is required in requests. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign name.<br> This field is required in requests. </div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public GuaranteedReservation notificationEmailAddress(List<String> notificationEmailAddress) {
    this.notificationEmailAddress = notificationEmailAddress;
    return this;
  }

  public GuaranteedReservation addNotificationEmailAddressItem(String notificationEmailAddressItem) {
    if (this.notificationEmailAddress == null) {
      this.notificationEmailAddress = new ArrayList<>();
    }
    this.notificationEmailAddress.add(notificationEmailAddressItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 連絡先メールアドレスです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Email address to send notifications.<br> This field is required in requests. </div> 
   * @return notificationEmailAddress
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 連絡先メールアドレスです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Email address to send notifications.<br> This field is required in requests. </div> ")


  public List<String> getNotificationEmailAddress() {
    return notificationEmailAddress;
  }

  public void setNotificationEmailAddress(List<String> notificationEmailAddress) {
    this.notificationEmailAddress = notificationEmailAddress;
  }

  public GuaranteedReservation conversionTracker(GuaranteedReservationServiceConversionTracker conversionTracker) {
    this.conversionTracker = conversionTracker;
    return this;
  }

  /**
   * Get conversionTracker
   * @return conversionTracker
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedReservationServiceConversionTracker getConversionTracker() {
    return conversionTracker;
  }

  public void setConversionTracker(GuaranteedReservationServiceConversionTracker conversionTracker) {
    this.conversionTracker = conversionTracker;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedReservation guaranteedReservation = (GuaranteedReservation) o;
    return Objects.equals(this.accountId, guaranteedReservation.accountId) &&
        Objects.equals(this.guaranteedSimulationId, guaranteedReservation.guaranteedSimulationId) &&
        Objects.equals(this.lifetimeBudget, guaranteedReservation.lifetimeBudget) &&
        Objects.equals(this.adGroupName, guaranteedReservation.adGroupName) &&
        Objects.equals(this.campaignName, guaranteedReservation.campaignName) &&
        Objects.equals(this.notificationEmailAddress, guaranteedReservation.notificationEmailAddress) &&
        Objects.equals(this.conversionTracker, guaranteedReservation.conversionTracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, guaranteedSimulationId, lifetimeBudget, adGroupName, campaignName, notificationEmailAddress, conversionTracker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedReservation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    guaranteedSimulationId: ").append(toIndentedString(guaranteedSimulationId)).append("\n");
    sb.append("    lifetimeBudget: ").append(toIndentedString(lifetimeBudget)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    notificationEmailAddress: ").append(toIndentedString(notificationEmailAddress)).append("\n");
    sb.append("    conversionTracker: ").append(toIndentedString(conversionTracker)).append("\n");
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


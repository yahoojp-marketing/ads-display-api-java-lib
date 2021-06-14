package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedReservationオブジェクトは、シミュレーション結果に基づいた予約情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedReservation object contains a reservation information based on simulation result. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedReservationオブジェクトは、シミュレーション結果に基づいた予約情報を保持します。</div> <div lang=\"en\">GuaranteedReservation object contains a reservation information based on simulation result. </div> ")

public class GuaranteedReservation   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("guaranteedSimulationId")
  private JsonNullable<Long> guaranteedSimulationId = JsonNullable.undefined();

  @JsonProperty("lifetimeBudget")
  private JsonNullable<Long> lifetimeBudget = JsonNullable.undefined();

  @JsonProperty("adGroupName")
  private JsonNullable<String> adGroupName = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("notificationEmailAddress")
  @Valid
  private JsonNullable<List<String>> notificationEmailAddress = JsonNullable.undefined();

  public GuaranteedReservation accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public GuaranteedReservation guaranteedSimulationId(Long guaranteedSimulationId) {
    this.guaranteedSimulationId = JsonNullable.of(guaranteedSimulationId);
    return this;
  }

  /**
   * <div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Simulation ID. <br> This field is required in requests. </div> 
   * @return guaranteedSimulationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Simulation ID. <br> This field is required in requests. </div> ")


  public JsonNullable<Long> getGuaranteedSimulationId() {
    return guaranteedSimulationId;
  }

  public void setGuaranteedSimulationId(JsonNullable<Long> guaranteedSimulationId) {
    this.guaranteedSimulationId = guaranteedSimulationId;
  }

  public GuaranteedReservation lifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = JsonNullable.of(lifetimeBudget);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> This field is required in requests. </div> 
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(JsonNullable<Long> lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedReservation adGroupName(String adGroupName) {
    this.adGroupName = JsonNullable.of(adGroupName);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in requests. </div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in requests. </div> ")


  public JsonNullable<String> getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(JsonNullable<String> adGroupName) {
    this.adGroupName = adGroupName;
  }

  public GuaranteedReservation campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign name.<br> This field is required in requests. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign name.<br> This field is required in requests. </div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public GuaranteedReservation notificationEmailAddress(List<String> notificationEmailAddress) {
    this.notificationEmailAddress = JsonNullable.of(notificationEmailAddress);
    return this;
  }

  public GuaranteedReservation addNotificationEmailAddressItem(String notificationEmailAddressItem) {
    if (this.notificationEmailAddress == null || !this.notificationEmailAddress.isPresent()) {
      this.notificationEmailAddress = JsonNullable.of(new ArrayList<>());
    }
    this.notificationEmailAddress.get().add(notificationEmailAddressItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 連絡先メールアドレスです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Email address to send notifications.<br> This field is required in requests. </div> 
   * @return notificationEmailAddress
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 連絡先メールアドレスです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Email address to send notifications.<br> This field is required in requests. </div> ")


  public JsonNullable<List<String>> getNotificationEmailAddress() {
    return notificationEmailAddress;
  }

  public void setNotificationEmailAddress(JsonNullable<List<String>> notificationEmailAddress) {
    this.notificationEmailAddress = notificationEmailAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.notificationEmailAddress, guaranteedReservation.notificationEmailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, guaranteedSimulationId, lifetimeBudget, adGroupName, campaignName, notificationEmailAddress);
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


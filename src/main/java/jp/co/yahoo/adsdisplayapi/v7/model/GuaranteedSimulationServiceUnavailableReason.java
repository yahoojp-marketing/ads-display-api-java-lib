package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceAge;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceDeviceType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceGender;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceUnavailableReasonオブジェクトは、在庫の不足理由を表します。&lt;br&gt; このオブジェクトで返される各フィールドに対応する在庫は不足しています。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceUnavailableReason describes a reason for lack of inventory.&lt;br&gt;  An inventory subject to each field returned by this object is lacking.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceUnavailableReasonオブジェクトは、在庫の不足理由を表します。<br> このオブジェクトで返される各フィールドに対応する在庫は不足しています。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">GuaranteedSimulationServiceUnavailableReason describes a reason for lack of inventory.<br>  An inventory subject to each field returned by this object is lacking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceUnavailableReason   {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("hours")
  @Valid
  private List<Long> hours = null;

  @JsonProperty("genders")
  @Valid
  private List<GuaranteedSimulationServiceGender> genders = null;

  @JsonProperty("ages")
  @Valid
  private List<GuaranteedSimulationServiceAge> ages = null;

  @JsonProperty("devices")
  @Valid
  private List<GuaranteedSimulationServiceDeviceType> devices = null;

  @JsonProperty("audienceCategories")
  @Valid
  private List<String> audienceCategories = null;

  public GuaranteedSimulationServiceUnavailableReason date(String date) {
    this.date = date;
    return this;
  }

  /**
   * <div lang=\"ja\"> 在庫がない日を表します。 </div> <div lang=\"en\"> Indicates a day when it is out of inventory.  </div> Format: yyyyMMdd 
   * @return date
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 在庫がない日を表します。 </div> <div lang=\"en\"> Indicates a day when it is out of inventory.  </div> Format: yyyyMMdd ")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public GuaranteedSimulationServiceUnavailableReason hours(List<Long> hours) {
    this.hours = hours;
    return this;
  }

  public GuaranteedSimulationServiceUnavailableReason addHoursItem(Long hoursItem) {
    if (this.hours == null) {
      this.hours = new ArrayList<>();
    }
    this.hours.add(hoursItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 予約ができない時間帯のリストです。 </div> <div lang=\"en\"> List of time zones that cannot be reserved. </div> 
   * @return hours
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 予約ができない時間帯のリストです。 </div> <div lang=\"en\"> List of time zones that cannot be reserved. </div> ")


  public List<Long> getHours() {
    return hours;
  }

  public void setHours(List<Long> hours) {
    this.hours = hours;
  }

  public GuaranteedSimulationServiceUnavailableReason genders(List<GuaranteedSimulationServiceGender> genders) {
    this.genders = genders;
    return this;
  }

  public GuaranteedSimulationServiceUnavailableReason addGendersItem(GuaranteedSimulationServiceGender gendersItem) {
    if (this.genders == null) {
      this.genders = new ArrayList<>();
    }
    this.genders.add(gendersItem);
    return this;
  }

  /**
   * Get genders
   * @return genders
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceGender> getGenders() {
    return genders;
  }

  public void setGenders(List<GuaranteedSimulationServiceGender> genders) {
    this.genders = genders;
  }

  public GuaranteedSimulationServiceUnavailableReason ages(List<GuaranteedSimulationServiceAge> ages) {
    this.ages = ages;
    return this;
  }

  public GuaranteedSimulationServiceUnavailableReason addAgesItem(GuaranteedSimulationServiceAge agesItem) {
    if (this.ages == null) {
      this.ages = new ArrayList<>();
    }
    this.ages.add(agesItem);
    return this;
  }

  /**
   * Get ages
   * @return ages
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceAge> getAges() {
    return ages;
  }

  public void setAges(List<GuaranteedSimulationServiceAge> ages) {
    this.ages = ages;
  }

  public GuaranteedSimulationServiceUnavailableReason devices(List<GuaranteedSimulationServiceDeviceType> devices) {
    this.devices = devices;
    return this;
  }

  public GuaranteedSimulationServiceUnavailableReason addDevicesItem(GuaranteedSimulationServiceDeviceType devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * Get devices
   * @return devices
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceDeviceType> getDevices() {
    return devices;
  }

  public void setDevices(List<GuaranteedSimulationServiceDeviceType> devices) {
    this.devices = devices;
  }

  public GuaranteedSimulationServiceUnavailableReason audienceCategories(List<String> audienceCategories) {
    this.audienceCategories = audienceCategories;
    return this;
  }

  public GuaranteedSimulationServiceUnavailableReason addAudienceCategoriesItem(String audienceCategoriesItem) {
    if (this.audienceCategories == null) {
      this.audienceCategories = new ArrayList<>();
    }
    this.audienceCategories.add(audienceCategoriesItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 在庫がないオーディエンスカテゴリーのターゲットID（カテゴリーコード）のリストです。 </div> <div lang=\"en\"> A list of Audience category target ID (category code) with no inventory. </div> 
   * @return audienceCategories
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 在庫がないオーディエンスカテゴリーのターゲットID（カテゴリーコード）のリストです。 </div> <div lang=\"en\"> A list of Audience category target ID (category code) with no inventory. </div> ")


  public List<String> getAudienceCategories() {
    return audienceCategories;
  }

  public void setAudienceCategories(List<String> audienceCategories) {
    this.audienceCategories = audienceCategories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceUnavailableReason guaranteedSimulationServiceUnavailableReason = (GuaranteedSimulationServiceUnavailableReason) o;
    return Objects.equals(this.date, guaranteedSimulationServiceUnavailableReason.date) &&
        Objects.equals(this.hours, guaranteedSimulationServiceUnavailableReason.hours) &&
        Objects.equals(this.genders, guaranteedSimulationServiceUnavailableReason.genders) &&
        Objects.equals(this.ages, guaranteedSimulationServiceUnavailableReason.ages) &&
        Objects.equals(this.devices, guaranteedSimulationServiceUnavailableReason.devices) &&
        Objects.equals(this.audienceCategories, guaranteedSimulationServiceUnavailableReason.audienceCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, hours, genders, ages, devices, audienceCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceUnavailableReason {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    genders: ").append(toIndentedString(genders)).append("\n");
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    audienceCategories: ").append(toIndentedString(audienceCategories)).append("\n");
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


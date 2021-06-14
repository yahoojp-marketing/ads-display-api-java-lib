package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroup;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaign;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedReservationServiceValueオブジェクトは、操作結果を含むシミュレーション結果に基づいた予約情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedReservationServiceValue object describes the reservation information including operation result based on simulation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedReservationServiceValueオブジェクトは、操作結果を含むシミュレーション結果に基づいた予約情報を表します。</div> <div lang=\"en\">GuaranteedReservationServiceValue object describes the reservation information including operation result based on simulation result.</div> ")

public class GuaranteedReservationServiceValue   {
  @JsonProperty("campaign")
  private JsonNullable<GuaranteedCampaign> campaign = JsonNullable.undefined();

  @JsonProperty("adGroup")
  @Valid
  private JsonNullable<List<GuaranteedAdGroup>> adGroup = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public GuaranteedReservationServiceValue campaign(GuaranteedCampaign campaign) {
    this.campaign = JsonNullable.of(campaign);
    return this;
  }

  /**
   * Get campaign
   * @return campaign
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaign> getCampaign() {
    return campaign;
  }

  public void setCampaign(JsonNullable<GuaranteedCampaign> campaign) {
    this.campaign = campaign;
  }

  public GuaranteedReservationServiceValue adGroup(List<GuaranteedAdGroup> adGroup) {
    this.adGroup = JsonNullable.of(adGroup);
    return this;
  }

  public GuaranteedReservationServiceValue addAdGroupItem(GuaranteedAdGroup adGroupItem) {
    if (this.adGroup == null || !this.adGroup.isPresent()) {
      this.adGroup = JsonNullable.of(new ArrayList<>());
    }
    this.adGroup.get().add(adGroupItem);
    return this;
  }

  /**
   * Get adGroup
   * @return adGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedAdGroup>> getAdGroup() {
    return adGroup;
  }

  public void setAdGroup(JsonNullable<List<GuaranteedAdGroup>> adGroup) {
    this.adGroup = adGroup;
  }

  public GuaranteedReservationServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public GuaranteedReservationServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> 
   * @return errors
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public GuaranteedReservationServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedReservationServiceValue guaranteedReservationServiceValue = (GuaranteedReservationServiceValue) o;
    return Objects.equals(this.campaign, guaranteedReservationServiceValue.campaign) &&
        Objects.equals(this.adGroup, guaranteedReservationServiceValue.adGroup) &&
        Objects.equals(this.errors, guaranteedReservationServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, guaranteedReservationServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, adGroup, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedReservationServiceValue {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    adGroup: ").append(toIndentedString(adGroup)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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


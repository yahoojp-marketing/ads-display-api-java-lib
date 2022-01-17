package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedCampaignServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 紐づけられているコンバージョントラッカー設定情報を表します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceConversionTracker object describes conversion tracking information to be associated.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> 紐づけられているコンバージョントラッカー設定情報を表します。<br> </div> <div lang=\"en\"> GuaranteedCampaignServiceConversionTracker object describes conversion tracking information to be associated.<br> </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedCampaignServiceConversionTracker   {
  @JsonProperty("conversionGroupId")
  private Long conversionGroupId = null;

  @JsonProperty("conversionTrackerId")
  private Long conversionTrackerId = null;

  @JsonProperty("isRemoveConversionGroupId")
  private GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionGroupId = null;

  @JsonProperty("isRemoveConversionTrackerId")
  private GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionTrackerId = null;

  public GuaranteedCampaignServiceConversionTracker conversionGroupId(Long conversionGroupId) {
    this.conversionGroupId = conversionGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョングループIDです。<br> ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 </div> <div lang=\"en\"> GuaranteedCampaignServiceConversionGroup ID.<br> *conversionGroupId and conversionTrackerIds cannot be set at the same time. </div> 
   * @return conversionGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョングループIDです。<br> ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 </div> <div lang=\"en\"> GuaranteedCampaignServiceConversionGroup ID.<br> *conversionGroupId and conversionTrackerIds cannot be set at the same time. </div> ")


  public Long getConversionGroupId() {
    return conversionGroupId;
  }

  public void setConversionGroupId(Long conversionGroupId) {
    this.conversionGroupId = conversionGroupId;
  }

  public GuaranteedCampaignServiceConversionTracker conversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

  /**
   * <div lang=\"ja\"> コンバージョントラッカーIDです。<br> ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 </div> <div lang=\"en\"> GuaranteedCampaignServiceConversionTracker ID.<br> *conversionGroupId and conversionTrackerIds cannot be set at the same time. </div> 
   * @return conversionTrackerId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカーIDです。<br> ※conversionGroupId, conversionTrackerIdは同時に設定することができません。 </div> <div lang=\"en\"> GuaranteedCampaignServiceConversionTracker ID.<br> *conversionGroupId and conversionTrackerIds cannot be set at the same time. </div> ")


  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }

  public void setConversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }

  public GuaranteedCampaignServiceConversionTracker isRemoveConversionGroupId(GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionGroupId) {
    this.isRemoveConversionGroupId = isRemoveConversionGroupId;
    return this;
  }

  /**
   * Get isRemoveConversionGroupId
   * @return isRemoveConversionGroupId
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedCampaignServiceIsRemoveFlg getIsRemoveConversionGroupId() {
    return isRemoveConversionGroupId;
  }

  public void setIsRemoveConversionGroupId(GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionGroupId) {
    this.isRemoveConversionGroupId = isRemoveConversionGroupId;
  }

  public GuaranteedCampaignServiceConversionTracker isRemoveConversionTrackerId(GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionTrackerId) {
    this.isRemoveConversionTrackerId = isRemoveConversionTrackerId;
    return this;
  }

  /**
   * Get isRemoveConversionTrackerId
   * @return isRemoveConversionTrackerId
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedCampaignServiceIsRemoveFlg getIsRemoveConversionTrackerId() {
    return isRemoveConversionTrackerId;
  }

  public void setIsRemoveConversionTrackerId(GuaranteedCampaignServiceIsRemoveFlg isRemoveConversionTrackerId) {
    this.isRemoveConversionTrackerId = isRemoveConversionTrackerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceConversionTracker guaranteedCampaignServiceConversionTracker = (GuaranteedCampaignServiceConversionTracker) o;
    return Objects.equals(this.conversionGroupId, guaranteedCampaignServiceConversionTracker.conversionGroupId) &&
        Objects.equals(this.conversionTrackerId, guaranteedCampaignServiceConversionTracker.conversionTrackerId) &&
        Objects.equals(this.isRemoveConversionGroupId, guaranteedCampaignServiceConversionTracker.isRemoveConversionGroupId) &&
        Objects.equals(this.isRemoveConversionTrackerId, guaranteedCampaignServiceConversionTracker.isRemoveConversionTrackerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionGroupId, conversionTrackerId, isRemoveConversionGroupId, isRemoveConversionTrackerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceConversionTracker {\n");
    
    sb.append("    conversionGroupId: ").append(toIndentedString(conversionGroupId)).append("\n");
    sb.append("    conversionTrackerId: ").append(toIndentedString(conversionTrackerId)).append("\n");
    sb.append("    isRemoveConversionGroupId: ").append(toIndentedString(isRemoveConversionGroupId)).append("\n");
    sb.append("    isRemoveConversionTrackerId: ").append(toIndentedString(isRemoveConversionTrackerId)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedPreviewServicePanelSwitchオブジェクトは、プレビュー素材（スイッチ画像）の情報を保持します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedPreviewServicePanelSwitch object holds information about the preview material (switch image). &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedPreviewServicePanelSwitchオブジェクトは、プレビュー素材（スイッチ画像）の情報を保持します。<br> </div> <div lang=\"en\"> GuaranteedPreviewServicePanelSwitch object holds information about the preview material (switch image). </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedPreviewServicePanelSwitch   {
  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("switchMediaId")
  private Long switchMediaId = null;

  @JsonProperty("adLeftSideMediaId")
  private Long adLeftSideMediaId = null;

  @JsonProperty("adRightSideMediaId")
  private Long adRightSideMediaId = null;

  public GuaranteedPreviewServicePanelSwitch mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Media ID.<br> This field is optional in requests. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Media ID.<br> This field is optional in requests. </div> ")


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public GuaranteedPreviewServicePanelSwitch switchMediaId(Long switchMediaId) {
    this.switchMediaId = switchMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> スイッチ画像のメディアIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Media ID of switch image.<br> This field is optional in requests. 
   * @return switchMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> スイッチ画像のメディアIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Media ID of switch image.<br> This field is optional in requests. ")


  public Long getSwitchMediaId() {
    return switchMediaId;
  }

  public void setSwitchMediaId(Long switchMediaId) {
    this.switchMediaId = switchMediaId;
  }

  public GuaranteedPreviewServicePanelSwitch adLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is optional in requests. </div> 
   * @return adLeftSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is optional in requests. </div> ")


  public Long getAdLeftSideMediaId() {
    return adLeftSideMediaId;
  }

  public void setAdLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
  }

  public GuaranteedPreviewServicePanelSwitch adRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is optional in requests. </div> 
   * @return adRightSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is optional in requests. </div> ")


  public Long getAdRightSideMediaId() {
    return adRightSideMediaId;
  }

  public void setAdRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedPreviewServicePanelSwitch guaranteedPreviewServicePanelSwitch = (GuaranteedPreviewServicePanelSwitch) o;
    return Objects.equals(this.mediaId, guaranteedPreviewServicePanelSwitch.mediaId) &&
        Objects.equals(this.switchMediaId, guaranteedPreviewServicePanelSwitch.switchMediaId) &&
        Objects.equals(this.adLeftSideMediaId, guaranteedPreviewServicePanelSwitch.adLeftSideMediaId) &&
        Objects.equals(this.adRightSideMediaId, guaranteedPreviewServicePanelSwitch.adRightSideMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, switchMediaId, adLeftSideMediaId, adRightSideMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreviewServicePanelSwitch {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    switchMediaId: ").append(toIndentedString(switchMediaId)).append("\n");
    sb.append("    adLeftSideMediaId: ").append(toIndentedString(adLeftSideMediaId)).append("\n");
    sb.append("    adRightSideMediaId: ").append(toIndentedString(adRightSideMediaId)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナー、右サイド画像、左サイド画像で構成される広告の詳細情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch object describes detailed information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, 16:9 reduced banner, the right side image, and the left side image. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナー、右サイド画像、左サイド画像で構成される広告の詳細情報を表します。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch object describes detailed information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, 16:9 reduced banner, the right side image, and the left side image. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch   {
  @JsonProperty("displayOrder")
  private Long displayOrder = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("switchMediaId")
  private Long switchMediaId = null;

  @JsonProperty("adLeftSideMediaId")
  private Long adLeftSideMediaId = null;

  @JsonProperty("adRightSideMediaId")
  private Long adRightSideMediaId = null;

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch displayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * <div lang=\"ja\"> パネルの表示順です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※指定しない場合は自動で設定されます。 </div> <div lang=\"en\"> Panel display order.<br> This field is optional in ADD and SET operation.<br> *If not specified, it will be set automatically. </div> 
   * @return displayOrder
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> パネルの表示順です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※指定しない場合は自動で設定されます。 </div> <div lang=\"en\"> Panel display order.<br> This field is optional in ADD and SET operation.<br> *If not specified, it will be set automatically. </div> ")


  public Long getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\">Final URL.<br> This field is required in ADD and SET operation. </div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\">Final URL.<br> This field is required in ADD and SET operation. </div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is required in ADD and SET operation. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is required in ADD and SET operation. </div> ")


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch switchMediaId(Long switchMediaId) {
    this.switchMediaId = switchMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> スイッチ画像のメディアIDです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Media ID of switch image.<br> This field is required in ADD and SET operation. </div> 
   * @return switchMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> スイッチ画像のメディアIDです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Media ID of switch image.<br> This field is required in ADD and SET operation. </div> ")


  public Long getSwitchMediaId() {
    return switchMediaId;
  }

  public void setSwitchMediaId(Long switchMediaId) {
    this.switchMediaId = switchMediaId;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch adLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD and SET operation. </div> 
   * @return adLeftSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD and SET operation. </div> ")


  public Long getAdLeftSideMediaId() {
    return adLeftSideMediaId;
  }

  public void setAdLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch adRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD and SET operation. </div> 
   * @return adRightSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD and SET operation. </div> ")


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
    GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch = (GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch) o;
    return Objects.equals(this.displayOrder, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.displayOrder) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.finalUrl) &&
        Objects.equals(this.mediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.mediaId) &&
        Objects.equals(this.switchMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.switchMediaId) &&
        Objects.equals(this.adLeftSideMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.adLeftSideMediaId) &&
        Objects.equals(this.adRightSideMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.adRightSideMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOrder, finalUrl, mediaId, switchMediaId, adLeftSideMediaId, adRightSideMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch {\n");
    
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
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


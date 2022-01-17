package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナーで構成される広告の詳細情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch object describes detailed information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, and 16:9 reduced banner. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナーで構成される広告の詳細情報を表します。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch object describes detailed information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, and 16:9 reduced banner. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch   {
  @JsonProperty("displayOrder")
  private Long displayOrder = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("switchMediaId")
  private Long switchMediaId = null;

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch displayOrder(Long displayOrder) {
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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch finalUrl(String finalUrl) {
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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch mediaId(Long mediaId) {
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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch switchMediaId(Long switchMediaId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch = (GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch) o;
    return Objects.equals(this.displayOrder, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch.displayOrder) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch.finalUrl) &&
        Objects.equals(this.mediaId, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch.mediaId) &&
        Objects.equals(this.switchMediaId, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch.switchMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOrder, finalUrl, mediaId, switchMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch {\n");
    
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    switchMediaId: ").append(toIndentedString(switchMediaId)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactQuintieオブジェクトは、予約型専用広告：メインの16:9の縮小機能付き画像と、センター画像、右サイド画像、左サイド画像で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactQuintie object describes information about a guaranteed ad composed of the main 16:9 image with reduction function, the center image, the right side image, and the left side image.&lt;br&gt; This field is optional.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceTopImpactQuintieオブジェクトは、予約型専用広告：メインの16:9の縮小機能付き画像と、センター画像、右サイド画像、左サイド画像で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceTopImpactQuintie object describes information about a guaranteed ad composed of the main 16:9 image with reduction function, the center image, the right side image, and the left side image.<br> This field is optional.<br> </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceTopImpactQuintie   {
  @JsonProperty("displayUrl")
  private String displayUrl = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("customParameters")
  private GuaranteedAdGroupAdServiceCustomParameters customParameters = null;

  @JsonProperty("displayUrlLevel")
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("isRemoveTrackingUrl")
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("adLeftSideMediaId")
  private Long adLeftSideMediaId = null;

  @JsonProperty("adRightSideMediaId")
  private Long adRightSideMediaId = null;

  @JsonProperty("adCenterMediaId")
  private Long adCenterMediaId = null;

  public GuaranteedAdGroupAdServiceTopImpactQuintie displayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Display URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Display URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
    return this;
  }

  /**
   * Get displayUrlLevel
   * @return displayUrlLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceDisplayUrlLevel getDisplayUrlLevel() {
    return displayUrlLevel;
  }

  public void setDisplayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> ※現在利用できません </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> * Not Available. </div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> ※現在利用できません </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> * Not Available. </div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie isRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

  /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }

  public void setIsRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared.<br> * Not Available. </div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared.<br> * Not Available. </div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie adLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adLeftSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public Long getAdLeftSideMediaId() {
    return adLeftSideMediaId;
  }

  public void setAdLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie adRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adRightSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public Long getAdRightSideMediaId() {
    return adRightSideMediaId;
  }

  public void setAdRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
  }

  public GuaranteedAdGroupAdServiceTopImpactQuintie adCenterMediaId(Long adCenterMediaId) {
    this.adCenterMediaId = adCenterMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> センター画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Center image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adCenterMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> センター画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Center image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public Long getAdCenterMediaId() {
    return adCenterMediaId;
  }

  public void setAdCenterMediaId(Long adCenterMediaId) {
    this.adCenterMediaId = adCenterMediaId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceTopImpactQuintie guaranteedAdGroupAdServiceTopImpactQuintie = (GuaranteedAdGroupAdServiceTopImpactQuintie) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceTopImpactQuintie.displayUrl) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceTopImpactQuintie.url) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceTopImpactQuintie.customParameters) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceTopImpactQuintie.displayUrlLevel) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceTopImpactQuintie.finalUrl) &&
        Objects.equals(this.isRemoveTrackingUrl, guaranteedAdGroupAdServiceTopImpactQuintie.isRemoveTrackingUrl) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceTopImpactQuintie.trackingUrl) &&
        Objects.equals(this.adLeftSideMediaId, guaranteedAdGroupAdServiceTopImpactQuintie.adLeftSideMediaId) &&
        Objects.equals(this.adRightSideMediaId, guaranteedAdGroupAdServiceTopImpactQuintie.adRightSideMediaId) &&
        Objects.equals(this.adCenterMediaId, guaranteedAdGroupAdServiceTopImpactQuintie.adCenterMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, url, customParameters, displayUrlLevel, finalUrl, isRemoveTrackingUrl, trackingUrl, adLeftSideMediaId, adRightSideMediaId, adCenterMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceTopImpactQuintie {\n");
    
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    adLeftSideMediaId: ").append(toIndentedString(adLeftSideMediaId)).append("\n");
    sb.append("    adRightSideMediaId: ").append(toIndentedString(adRightSideMediaId)).append("\n");
    sb.append("    adCenterMediaId: ").append(toIndentedString(adCenterMediaId)).append("\n");
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


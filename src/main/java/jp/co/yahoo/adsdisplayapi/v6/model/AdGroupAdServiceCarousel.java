package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceCarouselオブジェクトはカルーセル広告の詳細情報を表します。&lt;br&gt; ※SET時には、現在のCarouselsに含まれるCarouselが全て指定したCarouselsに置き換わります。&lt;br&gt; ※特定のCarousel単体を指定して変更することはできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceCarousel object describes the detailed information of carousel ad.&lt;br&gt; *In SET operation, all Carousel included in the current Carousels will be replaced with the specified Carousels.&lt;br&gt; *Cannot specify a specific Carousel alone. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceCarouselオブジェクトはカルーセル広告の詳細情報を表します。<br> ※SET時には、現在のCarouselsに含まれるCarouselが全て指定したCarouselsに置き換わります。<br> ※特定のCarousel単体を指定して変更することはできません。 </div> <div lang=\"en\"> AdGroupAdServiceCarousel object describes the detailed information of carousel ad.<br> *In SET operation, all Carousel included in the current Carousels will be replaced with the specified Carousels.<br> *Cannot specify a specific Carousel alone. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceCarousel   {
  @JsonProperty("displayOrder")
  private Long displayOrder = null;

  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("headline")
  private String headline = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("smartphoneFinalUrl")
  private String smartphoneFinalUrl = null;

  @JsonProperty("isRemoveSmartphoneFinalUrl")
  private AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl = null;

  public AdGroupAdServiceCarousel displayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * <div lang=\"ja\"> カルーセルの表示順です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※指定しない場合は自動で設定されます。 </div> <div lang=\"en\"> Carousel display order.<br> This field is optional in ADD and SET operation.<br> *If not specified, it will be set automatically. </div> 
   * @return displayOrder
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カルーセルの表示順です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※指定しない場合は自動で設定されます。 </div> <div lang=\"en\"> Carousel display order.<br> This field is optional in ADD and SET operation.<br> *If not specified, it will be set automatically. </div> ")


  public Long getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
  }

  public AdGroupAdServiceCarousel mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is requred in ADD and SET operation. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is requred in ADD and SET operation. </div> ")


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public AdGroupAdServiceCarousel headline(String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad title.<br> This field is requred in ADD and SET operation. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad title.<br> This field is requred in ADD and SET operation. </div> ")


  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public AdGroupAdServiceCarousel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad description.<br> This field is requred in ADD and SET operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad description.<br> This field is requred in ADD and SET operation. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdGroupAdServiceCarousel url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> ADD時、urlフィールドとfinalUrlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> SET時は省略可能となります。<br> SET時にfinalUrlを指定する場合、このフィールドの値はクリアされます。 </div> <div lang=\"en\"> Destination URL.<br> In ADD operation, url field and finalUrl field cannot be set at the same time, and one of them must be set.<br> This field is optional in SET operation.<br> If finalUrl is specified in SET operation, the value in this field will be cleared. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> ADD時、urlフィールドとfinalUrlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> SET時は省略可能となります。<br> SET時にfinalUrlを指定する場合、このフィールドの値はクリアされます。 </div> <div lang=\"en\"> Destination URL.<br> In ADD operation, url field and finalUrl field cannot be set at the same time, and one of them must be set.<br> This field is optional in SET operation.<br> If finalUrl is specified in SET operation, the value in this field will be cleared. </div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AdGroupAdServiceCarousel disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupAdServiceCarousel addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AdGroupAdServiceCarousel finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、smartphoneFinalUrl、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。<br> キャンペーン目的「アプリ訴求」の場合は、このフィールドには以下のURLのみ設定できます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, smartphoneFinalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> If url is specified in SET operation, the value in this field will be cleared.<br> If campaignGoal is APP_PROMOTION, only the following URL can be set in this field.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、smartphoneFinalUrl、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。<br> キャンペーン目的「アプリ訴求」の場合は、このフィールドには以下のURLのみ設定できます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, smartphoneFinalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> If url is specified in SET operation, the value in this field will be cleared.<br> If campaignGoal is APP_PROMOTION, only the following URL can be set in this field.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public AdGroupAdServiceCarousel smartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 </div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> Not allowed for ADD and SET when a campaign goal is \"app promotion\".<br> If url is specified in SET operation, the value in this field will be cleared. </div> 
   * @return smartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 </div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> Not allowed for ADD and SET when a campaign goal is \"app promotion\".<br> If url is specified in SET operation, the value in this field will be cleared. </div> ")


  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }

  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }

  public AdGroupAdServiceCarousel isRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
    return this;
  }

  /**
   * Get isRemoveSmartphoneFinalUrl
   * @return isRemoveSmartphoneFinalUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }

  public void setIsRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceCarousel adGroupAdServiceCarousel = (AdGroupAdServiceCarousel) o;
    return Objects.equals(this.displayOrder, adGroupAdServiceCarousel.displayOrder) &&
        Objects.equals(this.mediaId, adGroupAdServiceCarousel.mediaId) &&
        Objects.equals(this.headline, adGroupAdServiceCarousel.headline) &&
        Objects.equals(this.description, adGroupAdServiceCarousel.description) &&
        Objects.equals(this.url, adGroupAdServiceCarousel.url) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAdServiceCarousel.disapprovalReasonCodes) &&
        Objects.equals(this.finalUrl, adGroupAdServiceCarousel.finalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, adGroupAdServiceCarousel.smartphoneFinalUrl) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, adGroupAdServiceCarousel.isRemoveSmartphoneFinalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOrder, mediaId, headline, description, url, disapprovalReasonCodes, finalUrl, smartphoneFinalUrl, isRemoveSmartphoneFinalUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceCarousel {\n");
    
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveSmartphoneFinalUrl: ").append(toIndentedString(isRemoveSmartphoneFinalUrl)).append("\n");
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


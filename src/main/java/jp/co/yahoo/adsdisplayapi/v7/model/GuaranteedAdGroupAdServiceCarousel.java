/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceCarouselオブジェクトはカルーセル広告の詳細情報を表します。&lt;br&gt; ※SET時には、現在のCarouselsに含まれるCarouselが全て指定したCarouselsに置き換わります。&lt;br&gt; ※特定のCarousel単体を指定して変更することはできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceCarousel object describes the detailed information of carousel ad.&lt;br&gt; *In SET operation, all Carousel included in the current Carousels will be replaced with the specified Carousels.&lt;br&gt; *Cannot specify a specific Carousel alone. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceCarouselオブジェクトはカルーセル広告の詳細情報を表します。<br> ※SET時には、現在のCarouselsに含まれるCarouselが全て指定したCarouselsに置き換わります。<br> ※特定のCarousel単体を指定して変更することはできません。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceCarousel object describes the detailed information of carousel ad.<br> *In SET operation, all Carousel included in the current Carousels will be replaced with the specified Carousels.<br> *Cannot specify a specific Carousel alone. </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_DISPLAY_ORDER,
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_MEDIA_ID,
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_HEADLINE,
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_DESCRIPTION,
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_URL,
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_SMARTPHONE_FINAL_URL,
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL,
  GuaranteedAdGroupAdServiceCarousel.JSON_PROPERTY_DISAPPROVAL_REASON_CODES
})
@JsonTypeName("GuaranteedAdGroupAdServiceCarousel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceCarousel {
  public static final String JSON_PROPERTY_DISPLAY_ORDER = "displayOrder";
  private Long displayOrder;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_SMARTPHONE_FINAL_URL = "smartphoneFinalUrl";
  private String smartphoneFinalUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL = "isRemoveSmartphoneFinalUrl";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes = null;

  public GuaranteedAdGroupAdServiceCarousel() { 
  }

  public GuaranteedAdGroupAdServiceCarousel displayOrder(Long displayOrder) {
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カルーセルの表示順です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※指定しない場合は自動で設定されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Carousel display order.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If not specified, it will be set automatically. &lt;/div&gt; 
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> カルーセルの表示順です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※指定しない場合は自動で設定されます。 </div> <div lang=\"en\"> Carousel display order.<br> This field is optional in ADD and SET operation.<br> *If not specified, it will be set automatically. </div> ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDisplayOrder() {
    return displayOrder;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
  }


  public GuaranteedAdGroupAdServiceCarousel mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; メディアIDです。&lt;br&gt; このフィールドは、ADD時およびSET時に指定不可です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID.&lt;br&gt; This field cannot be specified in ADD and SET operation. &lt;/div&gt; 
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に指定不可です。 </div> <div lang=\"en\"> Media ID.<br> This field cannot be specified in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMediaId() {
    return mediaId;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }


  public GuaranteedAdGroupAdServiceCarousel headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告のタイトルです。&lt;br&gt; このフィールドは、ADD時およびSET時に必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad title.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad title.<br> This field is required in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public GuaranteedAdGroupAdServiceCarousel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告の説明文です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad description.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad description.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public GuaranteedAdGroupAdServiceCarousel url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンク先URLです。&lt;br&gt; このフィールドは、ADD時およびSET時に必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Destination URL.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public GuaranteedAdGroupAdServiceCarousel finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; SET時は省略可能となります。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; * Not Available. &lt;/div&gt; 
   * @return finalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> SET時は省略可能となります。<br> ※現在利用できません </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> This field is optional in SET operation.<br> * Not Available. </div> ")
  @JsonProperty(JSON_PROPERTY_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinalUrl() {
    return finalUrl;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }


  public GuaranteedAdGroupAdServiceCarousel smartphoneFinalUrl(String smartphoneFinalUrl) {
    
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;スマートフォン向けURLです。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL (smartphone).&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; &lt;/div&gt; 
   * @return smartphoneFinalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> </div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }


  public GuaranteedAdGroupAdServiceCarousel isRemoveSmartphoneFinalUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
    return this;
  }

   /**
   * Get isRemoveSmartphoneFinalUrl
   * @return isRemoveSmartphoneFinalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveSmartphoneFinalUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
  }


  public GuaranteedAdGroupAdServiceCarousel disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public GuaranteedAdGroupAdServiceCarousel addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 掲載拒否の理由です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reject reason on editorial review.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceCarousel guaranteedAdGroupAdServiceCarousel = (GuaranteedAdGroupAdServiceCarousel) o;
    return Objects.equals(this.displayOrder, guaranteedAdGroupAdServiceCarousel.displayOrder) &&
        Objects.equals(this.mediaId, guaranteedAdGroupAdServiceCarousel.mediaId) &&
        Objects.equals(this.headline, guaranteedAdGroupAdServiceCarousel.headline) &&
        Objects.equals(this.description, guaranteedAdGroupAdServiceCarousel.description) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceCarousel.url) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceCarousel.finalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, guaranteedAdGroupAdServiceCarousel.smartphoneFinalUrl) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, guaranteedAdGroupAdServiceCarousel.isRemoveSmartphoneFinalUrl) &&
        Objects.equals(this.disapprovalReasonCodes, guaranteedAdGroupAdServiceCarousel.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOrder, mediaId, headline, description, url, finalUrl, smartphoneFinalUrl, isRemoveSmartphoneFinalUrl, disapprovalReasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceCarousel {\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveSmartphoneFinalUrl: ").append(toIndentedString(isRemoveSmartphoneFinalUrl)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
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


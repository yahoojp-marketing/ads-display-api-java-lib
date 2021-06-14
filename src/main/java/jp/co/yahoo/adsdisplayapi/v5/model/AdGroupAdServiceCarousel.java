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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceCarouselオブジェクトはカルーセル広告の詳細情報を表します。&lt;br&gt; ※SET時には、現在のCarouselsに含まれるCarouselが全て指定したCarouselsに置き換わります。&lt;br&gt; ※特定のCarousel単体を指定して変更することはできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceCarousel object describes the detailed information of carousel ad.&lt;br&gt; *In SET operation, all Carousel included in the current Carousels will be replaced with the specified Carousels.&lt;br&gt; *Cannot specify a specific Carousel alone. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceCarouselオブジェクトはカルーセル広告の詳細情報を表します。<br> ※SET時には、現在のCarouselsに含まれるCarouselが全て指定したCarouselsに置き換わります。<br> ※特定のCarousel単体を指定して変更することはできません。 </div> <div lang=\"en\"> AdGroupAdServiceCarousel object describes the detailed information of carousel ad.<br> *In SET operation, all Carousel included in the current Carousels will be replaced with the specified Carousels.<br> *Cannot specify a specific Carousel alone. </div> ")

public class AdGroupAdServiceCarousel   {
  @JsonProperty("displayOrder")
  private JsonNullable<Long> displayOrder = JsonNullable.undefined();

  @JsonProperty("mediaId")
  private JsonNullable<Long> mediaId = JsonNullable.undefined();

  @JsonProperty("headline")
  private JsonNullable<String> headline = JsonNullable.undefined();

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  public AdGroupAdServiceCarousel displayOrder(Long displayOrder) {
    this.displayOrder = JsonNullable.of(displayOrder);
    return this;
  }

  /**
   * <div lang=\"ja\"> カルーセルの表示順です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※指定しない場合は自動で設定されます。 </div> <div lang=\"en\"> Carousel display order.<br> This field is optional in ADD and SET operation.<br> *If not specified, it will be set automatically. </div> 
   * @return displayOrder
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カルーセルの表示順です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※指定しない場合は自動で設定されます。 </div> <div lang=\"en\"> Carousel display order.<br> This field is optional in ADD and SET operation.<br> *If not specified, it will be set automatically. </div> ")


  public JsonNullable<Long> getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(JsonNullable<Long> displayOrder) {
    this.displayOrder = displayOrder;
  }

  public AdGroupAdServiceCarousel mediaId(Long mediaId) {
    this.mediaId = JsonNullable.of(mediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に指定不可です。 </div> <div lang=\"en\"> Media ID.<br> This field cannot be specified in ADD and SET operation. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に指定不可です。 </div> <div lang=\"en\"> Media ID.<br> This field cannot be specified in ADD and SET operation. </div> ")


  public JsonNullable<Long> getMediaId() {
    return mediaId;
  }

  public void setMediaId(JsonNullable<Long> mediaId) {
    this.mediaId = mediaId;
  }

  public AdGroupAdServiceCarousel headline(String headline) {
    this.headline = JsonNullable.of(headline);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad title.<br> This field is requred in ADD and SET operation. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad title.<br> This field is requred in ADD and SET operation. </div> ")


  public JsonNullable<String> getHeadline() {
    return headline;
  }

  public void setHeadline(JsonNullable<String> headline) {
    this.headline = headline;
  }

  public AdGroupAdServiceCarousel description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、SET時は必須となり、ADD時は省略可能となります。 </div> <div lang=\"en\"> Ad description.<br> This field is required in SET operation, and will be optional in ADD operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、SET時は必須となり、ADD時は省略可能となります。 </div> <div lang=\"en\"> Ad description.<br> This field is required in SET operation, and will be optional in ADD operation. </div> ")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public AdGroupAdServiceCarousel url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Destination URL.<br> This field is requred in ADD and SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Destination URL.<br> This field is requred in ADD and SET operation. </div> ")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public AdGroupAdServiceCarousel disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public AdGroupAdServiceCarousel addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.disapprovalReasonCodes, adGroupAdServiceCarousel.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOrder, mediaId, headline, description, url, disapprovalReasonCodes);
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


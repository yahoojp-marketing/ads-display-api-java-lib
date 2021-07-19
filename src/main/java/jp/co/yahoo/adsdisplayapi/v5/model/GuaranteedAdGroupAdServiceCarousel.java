package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceCarouselオブジェクトはカルーセル広告の詳細情報を表します。&lt;br&gt; ※SET時には、現在のCarouselsに含まれるCarouselが全て指定したCarouselsに置き換わります。&lt;br&gt; ※特定のCarousel単体を指定して変更することはできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceCarousel object describes the detailed information of carousel ad.&lt;br&gt; *In SET operation, all Carousel included in the current Carousels will be replaced with the specified Carousels.&lt;br&gt; *Cannot specify a specific Carousel alone. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceCarouselオブジェクトはカルーセル広告の詳細情報を表します。<br> ※SET時には、現在のCarouselsに含まれるCarouselが全て指定したCarouselsに置き換わります。<br> ※特定のCarousel単体を指定して変更することはできません。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceCarousel object describes the detailed information of carousel ad.<br> *In SET operation, all Carousel included in the current Carousels will be replaced with the specified Carousels.<br> *Cannot specify a specific Carousel alone. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceCarousel   {
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

  public GuaranteedAdGroupAdServiceCarousel displayOrder(Long displayOrder) {
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

  public GuaranteedAdGroupAdServiceCarousel mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に指定不可です。 </div> <div lang=\"en\"> Media ID.<br> This field cannot be specified in ADD and SET operation. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に指定不可です。 </div> <div lang=\"en\"> Media ID.<br> This field cannot be specified in ADD and SET operation. </div> ")


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public GuaranteedAdGroupAdServiceCarousel headline(String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad title.<br> This field is required in ADD and SET operation. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Ad title.<br> This field is required in ADD and SET operation. </div> ")


  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public GuaranteedAdGroupAdServiceCarousel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad description.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad description.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GuaranteedAdGroupAdServiceCarousel url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD and SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD and SET operation. </div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
        Objects.equals(this.disapprovalReasonCodes, guaranteedAdGroupAdServiceCarousel.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOrder, mediaId, headline, description, url, disapprovalReasonCodes);
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


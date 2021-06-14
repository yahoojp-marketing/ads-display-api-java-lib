package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceCarousel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceCarouselAdオブジェクトはカルーセル広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがCAROUSEL_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceCarouselAd obeject describes information of carousel ad.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is CAROUSEL_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceCarouselAdオブジェクトはカルーセル広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがCAROUSEL_ADの場合は必須です。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceCarouselAd obeject describes information of carousel ad.<br> This field is optional.<br> *If adType is CAROUSEL_AD, this field is required in ADD operation. </div> ")

public class GuaranteedAdGroupAdServiceCarouselAd   {
  @JsonProperty("displayUrl")
  private JsonNullable<String> displayUrl = JsonNullable.undefined();

  @JsonProperty("logoMediaId")
  private JsonNullable<Long> logoMediaId = JsonNullable.undefined();

  @JsonProperty("principal")
  private JsonNullable<String> principal = JsonNullable.undefined();

  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  @JsonProperty("carousels")
  @Valid
  private JsonNullable<List<GuaranteedAdGroupAdServiceCarousel>> carousels = JsonNullable.undefined();

  public GuaranteedAdGroupAdServiceCarouselAd displayUrl(String displayUrl) {
    this.displayUrl = JsonNullable.of(displayUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ・標準キャンペーンの場合<br> &nbsp;&nbsp;ADDでは入力必須です。SETでの入力は任意です。<br> ・アプリキャンペーンの場合<br> &nbsp;&nbsp;ADD、SETのどちらも指定できません。<br> &nbsp;&nbsp;※アプリキャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> &nbsp;&nbsp;&nbsp;&nbsp;- iOSの場合：itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> - Standard campaign:<br> &nbsp;&nbsp;Required for ADD, optional for SET.<br> - Mobile app campaign:<br> &nbsp;&nbsp;Not allowed for ADD and SET.<br> &nbsp;&nbsp;*Based on DeviceOsType specified on Mobile app campaign, any of the following URLs will be automatically set.<br> &nbsp;&nbsp;&nbsp;&nbsp;- For iOS : itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- For Android : play.google.com<br> </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ・標準キャンペーンの場合<br> &nbsp;&nbsp;ADDでは入力必須です。SETでの入力は任意です。<br> ・アプリキャンペーンの場合<br> &nbsp;&nbsp;ADD、SETのどちらも指定できません。<br> &nbsp;&nbsp;※アプリキャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> &nbsp;&nbsp;&nbsp;&nbsp;- iOSの場合：itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> - Standard campaign:<br> &nbsp;&nbsp;Required for ADD, optional for SET.<br> - Mobile app campaign:<br> &nbsp;&nbsp;Not allowed for ADD and SET.<br> &nbsp;&nbsp;*Based on DeviceOsType specified on Mobile app campaign, any of the following URLs will be automatically set.<br> &nbsp;&nbsp;&nbsp;&nbsp;- For iOS : itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- For Android : play.google.com<br> </div> ")


  public JsonNullable<String> getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(JsonNullable<String> displayUrl) {
    this.displayUrl = displayUrl;
  }

  public GuaranteedAdGroupAdServiceCarouselAd logoMediaId(Long logoMediaId) {
    this.logoMediaId = JsonNullable.of(logoMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴの画像IDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Logo image ID.<br> This field is optional in ADD and SET operation. </div> 
   * @return logoMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴの画像IDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Logo image ID.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<Long> getLogoMediaId() {
    return logoMediaId;
  }

  public void setLogoMediaId(JsonNullable<Long> logoMediaId) {
    this.logoMediaId = logoMediaId;
  }

  public GuaranteedAdGroupAdServiceCarouselAd principal(String principal) {
    this.principal = JsonNullable.of(principal);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return principal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getPrincipal() {
    return principal;
  }

  public void setPrincipal(JsonNullable<String> principal) {
    this.principal = principal;
  }

  public GuaranteedAdGroupAdServiceCarouselAd url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public GuaranteedAdGroupAdServiceCarouselAd carousels(List<GuaranteedAdGroupAdServiceCarousel> carousels) {
    this.carousels = JsonNullable.of(carousels);
    return this;
  }

  public GuaranteedAdGroupAdServiceCarouselAd addCarouselsItem(GuaranteedAdGroupAdServiceCarousel carouselsItem) {
    if (this.carousels == null || !this.carousels.isPresent()) {
      this.carousels = JsonNullable.of(new ArrayList<>());
    }
    this.carousels.get().add(carouselsItem);
    return this;
  }

  /**
   * Get carousels
   * @return carousels
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedAdGroupAdServiceCarousel>> getCarousels() {
    return carousels;
  }

  public void setCarousels(JsonNullable<List<GuaranteedAdGroupAdServiceCarousel>> carousels) {
    this.carousels = carousels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceCarouselAd guaranteedAdGroupAdServiceCarouselAd = (GuaranteedAdGroupAdServiceCarouselAd) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceCarouselAd.displayUrl) &&
        Objects.equals(this.logoMediaId, guaranteedAdGroupAdServiceCarouselAd.logoMediaId) &&
        Objects.equals(this.principal, guaranteedAdGroupAdServiceCarouselAd.principal) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceCarouselAd.url) &&
        Objects.equals(this.carousels, guaranteedAdGroupAdServiceCarouselAd.carousels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, logoMediaId, principal, url, carousels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceCarouselAd {\n");
    
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    logoMediaId: ").append(toIndentedString(logoMediaId)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    carousels: ").append(toIndentedString(carousels)).append("\n");
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


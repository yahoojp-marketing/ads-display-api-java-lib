package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceCarousel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceCarouselAdオブジェクトはカルーセル広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがCAROUSEL_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceCarouselAd object describes information of carousel ad.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is CAROUSEL_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceCarouselAdオブジェクトはカルーセル広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがCAROUSEL_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceCarouselAd object describes information of carousel ad.<br> This field is optional.<br> *If adType is CAROUSEL_AD, this field is required in ADD operation. </div> ")

public class AdGroupAdServiceCarouselAd   {
  @JsonProperty("buttonText")
  private JsonNullable<AdGroupAdServiceButtonText> buttonText = JsonNullable.undefined();

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
  private JsonNullable<List<AdGroupAdServiceCarousel>> carousels = JsonNullable.undefined();

  public AdGroupAdServiceCarouselAd buttonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = JsonNullable.of(buttonText);
    return this;
  }

  /**
   * Get buttonText
   * @return buttonText
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceButtonText> getButtonText() {
    return buttonText;
  }

  public void setButtonText(JsonNullable<AdGroupAdServiceButtonText> buttonText) {
    this.buttonText = buttonText;
  }

  public AdGroupAdServiceCarouselAd displayUrl(String displayUrl) {
    this.displayUrl = JsonNullable.of(displayUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> ")


  public JsonNullable<String> getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(JsonNullable<String> displayUrl) {
    this.displayUrl = displayUrl;
  }

  public AdGroupAdServiceCarouselAd logoMediaId(Long logoMediaId) {
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

  public AdGroupAdServiceCarouselAd principal(String principal) {
    this.principal = JsonNullable.of(principal);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、キャンペーンのアプリ名と同一の値が自動的に設定され、アプリ名以外の値には変更できません。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation.<br> However, if campaignGoal is APP_PROMOTION, it will automatically be set to the same value as appName of campaign, and it cannot be changed to any other value. </div> 
   * @return principal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、キャンペーンのアプリ名と同一の値が自動的に設定され、アプリ名以外の値には変更できません。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation.<br> However, if campaignGoal is APP_PROMOTION, it will automatically be set to the same value as appName of campaign, and it cannot be changed to any other value. </div> ")


  public JsonNullable<String> getPrincipal() {
    return principal;
  }

  public void setPrincipal(JsonNullable<String> principal) {
    this.principal = principal;
  }

  public AdGroupAdServiceCarouselAd url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"reference/ads-display-api/v5/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"reference/ads-display-api/v5/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"reference/ads-display-api/v5/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"reference/ads-display-api/v5/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public AdGroupAdServiceCarouselAd carousels(List<AdGroupAdServiceCarousel> carousels) {
    this.carousels = JsonNullable.of(carousels);
    return this;
  }

  public AdGroupAdServiceCarouselAd addCarouselsItem(AdGroupAdServiceCarousel carouselsItem) {
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

  public JsonNullable<List<AdGroupAdServiceCarousel>> getCarousels() {
    return carousels;
  }

  public void setCarousels(JsonNullable<List<AdGroupAdServiceCarousel>> carousels) {
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
    AdGroupAdServiceCarouselAd adGroupAdServiceCarouselAd = (AdGroupAdServiceCarouselAd) o;
    return Objects.equals(this.buttonText, adGroupAdServiceCarouselAd.buttonText) &&
        Objects.equals(this.displayUrl, adGroupAdServiceCarouselAd.displayUrl) &&
        Objects.equals(this.logoMediaId, adGroupAdServiceCarouselAd.logoMediaId) &&
        Objects.equals(this.principal, adGroupAdServiceCarouselAd.principal) &&
        Objects.equals(this.url, adGroupAdServiceCarouselAd.url) &&
        Objects.equals(this.carousels, adGroupAdServiceCarouselAd.carousels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, displayUrl, logoMediaId, principal, url, carousels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceCarouselAd {\n");
    
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
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


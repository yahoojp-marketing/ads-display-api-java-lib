package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelQuintieVideoオブジェクトは、予約型専用広告：16:9の縮小機能付き動画で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelQuintieVideo object describes information about a guaranteed ad composed of 16:9 video with reduction function.&lt;br&gt; This field is optional.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceBrandPanelQuintieVideoオブジェクトは、予約型専用広告：16:9の縮小機能付き動画で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceBrandPanelQuintieVideo object describes information about a guaranteed ad composed of 16:9 video with reduction function.<br> This field is optional.<br> </div> ")

public class GuaranteedAdGroupAdServiceBrandPanelQuintieVideo   {
  @JsonProperty("displayUrl")
  private JsonNullable<String> displayUrl = JsonNullable.undefined();

  @JsonProperty("thumbnailMediaId")
  private JsonNullable<Long> thumbnailMediaId = JsonNullable.undefined();

  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo10SecBeaconUrls")
  private JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo10SecBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo25PercentBeaconUrls")
  private JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo25PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo3SecBeaconUrls")
  private JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo3SecBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo50PercentBeaconUrls")
  private JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo50PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo75PercentBeaconUrls")
  private JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo75PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideoCompleteBeaconUrls")
  private JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideoCompleteBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideoStartBeaconUrls")
  private JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideoStartBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video3SecBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video3SecBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video25PercentBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video25PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video50PercentBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video50PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video75PercentBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video75PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video10SecBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video10SecBeaconUrls = JsonNullable.undefined();

  @JsonProperty("videoCompleteBeaconUrls")
  @Valid
  private JsonNullable<List<String>> videoCompleteBeaconUrls = JsonNullable.undefined();

  @JsonProperty("videoStartBeaconUrls")
  @Valid
  private JsonNullable<List<String>> videoStartBeaconUrls = JsonNullable.undefined();

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo displayUrl(String displayUrl) {
    this.displayUrl = JsonNullable.of(displayUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Display URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Display URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(JsonNullable<String> displayUrl) {
    this.displayUrl = displayUrl;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo thumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = JsonNullable.of(thumbnailMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return thumbnailMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getThumbnailMediaId() {
    return thumbnailMediaId;
  }

  public void setThumbnailMediaId(JsonNullable<Long> thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo url(String url) {
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

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo isRemoveVideo10SecBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = JsonNullable.of(isRemoveVideo10SecBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo10SecBeaconUrls
   * @return isRemoveVideo10SecBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> getIsRemoveVideo10SecBeaconUrls() {
    return isRemoveVideo10SecBeaconUrls;
  }

  public void setIsRemoveVideo10SecBeaconUrls(JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo isRemoveVideo25PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = JsonNullable.of(isRemoveVideo25PercentBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo25PercentBeaconUrls
   * @return isRemoveVideo25PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> getIsRemoveVideo25PercentBeaconUrls() {
    return isRemoveVideo25PercentBeaconUrls;
  }

  public void setIsRemoveVideo25PercentBeaconUrls(JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo isRemoveVideo3SecBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = JsonNullable.of(isRemoveVideo3SecBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo3SecBeaconUrls
   * @return isRemoveVideo3SecBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> getIsRemoveVideo3SecBeaconUrls() {
    return isRemoveVideo3SecBeaconUrls;
  }

  public void setIsRemoveVideo3SecBeaconUrls(JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo isRemoveVideo50PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = JsonNullable.of(isRemoveVideo50PercentBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo50PercentBeaconUrls
   * @return isRemoveVideo50PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> getIsRemoveVideo50PercentBeaconUrls() {
    return isRemoveVideo50PercentBeaconUrls;
  }

  public void setIsRemoveVideo50PercentBeaconUrls(JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo isRemoveVideo75PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = JsonNullable.of(isRemoveVideo75PercentBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo75PercentBeaconUrls
   * @return isRemoveVideo75PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> getIsRemoveVideo75PercentBeaconUrls() {
    return isRemoveVideo75PercentBeaconUrls;
  }

  public void setIsRemoveVideo75PercentBeaconUrls(JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo isRemoveVideoCompleteBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = JsonNullable.of(isRemoveVideoCompleteBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideoCompleteBeaconUrls
   * @return isRemoveVideoCompleteBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> getIsRemoveVideoCompleteBeaconUrls() {
    return isRemoveVideoCompleteBeaconUrls;
  }

  public void setIsRemoveVideoCompleteBeaconUrls(JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo isRemoveVideoStartBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = JsonNullable.of(isRemoveVideoStartBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideoStartBeaconUrls
   * @return isRemoveVideoStartBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> getIsRemoveVideoStartBeaconUrls() {
    return isRemoveVideoStartBeaconUrls;
  }

  public void setIsRemoveVideoStartBeaconUrls(JsonNullable<GuaranteedAdGroupAdServiceIsRemoveFlg> isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo video3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    this.video3SecBeaconUrls = JsonNullable.of(video3SecBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo addVideo3SecBeaconUrlsItem(String video3SecBeaconUrlsItem) {
    if (this.video3SecBeaconUrls == null || !this.video3SecBeaconUrls.isPresent()) {
      this.video3SecBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video3SecBeaconUrls.get().add(video3SecBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 3秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (3 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video3SecBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 3秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (3 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo3SecBeaconUrls() {
    return video3SecBeaconUrls;
  }

  public void setVideo3SecBeaconUrls(JsonNullable<List<String>> video3SecBeaconUrls) {
    this.video3SecBeaconUrls = video3SecBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo video25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    this.video25PercentBeaconUrls = JsonNullable.of(video25PercentBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo addVideo25PercentBeaconUrlsItem(String video25PercentBeaconUrlsItem) {
    if (this.video25PercentBeaconUrls == null || !this.video25PercentBeaconUrls.isPresent()) {
      this.video25PercentBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video25PercentBeaconUrls.get().add(video25PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 25％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (25%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video25PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 25％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (25%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo25PercentBeaconUrls() {
    return video25PercentBeaconUrls;
  }

  public void setVideo25PercentBeaconUrls(JsonNullable<List<String>> video25PercentBeaconUrls) {
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo video50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    this.video50PercentBeaconUrls = JsonNullable.of(video50PercentBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo addVideo50PercentBeaconUrlsItem(String video50PercentBeaconUrlsItem) {
    if (this.video50PercentBeaconUrls == null || !this.video50PercentBeaconUrls.isPresent()) {
      this.video50PercentBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video50PercentBeaconUrls.get().add(video50PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 50％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (50%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video50PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 50％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (50%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo50PercentBeaconUrls() {
    return video50PercentBeaconUrls;
  }

  public void setVideo50PercentBeaconUrls(JsonNullable<List<String>> video50PercentBeaconUrls) {
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo video75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    this.video75PercentBeaconUrls = JsonNullable.of(video75PercentBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo addVideo75PercentBeaconUrlsItem(String video75PercentBeaconUrlsItem) {
    if (this.video75PercentBeaconUrls == null || !this.video75PercentBeaconUrls.isPresent()) {
      this.video75PercentBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video75PercentBeaconUrls.get().add(video75PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 75％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (75%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video75PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 75％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (75%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo75PercentBeaconUrls() {
    return video75PercentBeaconUrls;
  }

  public void setVideo75PercentBeaconUrls(JsonNullable<List<String>> video75PercentBeaconUrls) {
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo video10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    this.video10SecBeaconUrls = JsonNullable.of(video10SecBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo addVideo10SecBeaconUrlsItem(String video10SecBeaconUrlsItem) {
    if (this.video10SecBeaconUrls == null || !this.video10SecBeaconUrls.isPresent()) {
      this.video10SecBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video10SecBeaconUrls.get().add(video10SecBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 10秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (10 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video10SecBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 10秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (10 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo10SecBeaconUrls() {
    return video10SecBeaconUrls;
  }

  public void setVideo10SecBeaconUrls(JsonNullable<List<String>> video10SecBeaconUrls) {
    this.video10SecBeaconUrls = video10SecBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo videoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    this.videoCompleteBeaconUrls = JsonNullable.of(videoCompleteBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo addVideoCompleteBeaconUrlsItem(String videoCompleteBeaconUrlsItem) {
    if (this.videoCompleteBeaconUrls == null || !this.videoCompleteBeaconUrls.isPresent()) {
      this.videoCompleteBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.videoCompleteBeaconUrls.get().add(videoCompleteBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 再生完了ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (complete).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return videoCompleteBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生完了ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (complete).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideoCompleteBeaconUrls() {
    return videoCompleteBeaconUrls;
  }

  public void setVideoCompleteBeaconUrls(JsonNullable<List<String>> videoCompleteBeaconUrls) {
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo videoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    this.videoStartBeaconUrls = JsonNullable.of(videoStartBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo addVideoStartBeaconUrlsItem(String videoStartBeaconUrlsItem) {
    if (this.videoStartBeaconUrls == null || !this.videoStartBeaconUrls.isPresent()) {
      this.videoStartBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.videoStartBeaconUrls.get().add(videoStartBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 再生開始ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (start).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return videoStartBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生開始ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (start).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideoStartBeaconUrls() {
    return videoStartBeaconUrls;
  }

  public void setVideoStartBeaconUrls(JsonNullable<List<String>> videoStartBeaconUrls) {
    this.videoStartBeaconUrls = videoStartBeaconUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceBrandPanelQuintieVideo guaranteedAdGroupAdServiceBrandPanelQuintieVideo = (GuaranteedAdGroupAdServiceBrandPanelQuintieVideo) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.displayUrl) &&
        Objects.equals(this.thumbnailMediaId, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.thumbnailMediaId) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.url) &&
        Objects.equals(this.isRemoveVideo10SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.isRemoveVideo10SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo25PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.isRemoveVideo25PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo3SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.isRemoveVideo3SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo50PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.isRemoveVideo50PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo75PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.isRemoveVideo75PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideoCompleteBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.isRemoveVideoCompleteBeaconUrls) &&
        Objects.equals(this.isRemoveVideoStartBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.isRemoveVideoStartBeaconUrls) &&
        Objects.equals(this.video3SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.video3SecBeaconUrls) &&
        Objects.equals(this.video25PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.video25PercentBeaconUrls) &&
        Objects.equals(this.video50PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.video50PercentBeaconUrls) &&
        Objects.equals(this.video75PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.video75PercentBeaconUrls) &&
        Objects.equals(this.video10SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.video10SecBeaconUrls) &&
        Objects.equals(this.videoCompleteBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.videoCompleteBeaconUrls) &&
        Objects.equals(this.videoStartBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintieVideo.videoStartBeaconUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, thumbnailMediaId, url, isRemoveVideo10SecBeaconUrls, isRemoveVideo25PercentBeaconUrls, isRemoveVideo3SecBeaconUrls, isRemoveVideo50PercentBeaconUrls, isRemoveVideo75PercentBeaconUrls, isRemoveVideoCompleteBeaconUrls, isRemoveVideoStartBeaconUrls, video3SecBeaconUrls, video25PercentBeaconUrls, video50PercentBeaconUrls, video75PercentBeaconUrls, video10SecBeaconUrls, videoCompleteBeaconUrls, videoStartBeaconUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceBrandPanelQuintieVideo {\n");
    
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    thumbnailMediaId: ").append(toIndentedString(thumbnailMediaId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isRemoveVideo10SecBeaconUrls: ").append(toIndentedString(isRemoveVideo10SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo25PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo25PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo3SecBeaconUrls: ").append(toIndentedString(isRemoveVideo3SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo50PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo50PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo75PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo75PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoCompleteBeaconUrls: ").append(toIndentedString(isRemoveVideoCompleteBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoStartBeaconUrls: ").append(toIndentedString(isRemoveVideoStartBeaconUrls)).append("\n");
    sb.append("    video3SecBeaconUrls: ").append(toIndentedString(video3SecBeaconUrls)).append("\n");
    sb.append("    video25PercentBeaconUrls: ").append(toIndentedString(video25PercentBeaconUrls)).append("\n");
    sb.append("    video50PercentBeaconUrls: ").append(toIndentedString(video50PercentBeaconUrls)).append("\n");
    sb.append("    video75PercentBeaconUrls: ").append(toIndentedString(video75PercentBeaconUrls)).append("\n");
    sb.append("    video10SecBeaconUrls: ").append(toIndentedString(video10SecBeaconUrls)).append("\n");
    sb.append("    videoCompleteBeaconUrls: ").append(toIndentedString(videoCompleteBeaconUrls)).append("\n");
    sb.append("    videoStartBeaconUrls: ").append(toIndentedString(videoStartBeaconUrls)).append("\n");
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


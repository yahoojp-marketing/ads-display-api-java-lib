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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideoオブジェクトは、予約型専用広告：メインの4:1の縮小機能付き動画と、右サイド画像、左サイド画像で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo object describes information about a guaranteed ad composed of the main 4:1 video with reduction function, the right side image, and the left side image.&lt;br&gt; This field is optional.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideoオブジェクトは、予約型専用広告：メインの4:1の縮小機能付き動画と、右サイド画像、左サイド画像で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo object describes information about a guaranteed ad composed of the main 4:1 video with reduction function, the right side image, and the left side image.<br> This field is optional.<br> </div> ")

public class GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo   {
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

  @JsonProperty("adLeftSideMediaId")
  private JsonNullable<Long> adLeftSideMediaId = JsonNullable.undefined();

  @JsonProperty("adLeftSideMediaId2")
  private JsonNullable<Long> adLeftSideMediaId2 = JsonNullable.undefined();

  @JsonProperty("adRightSideMediaId")
  private JsonNullable<Long> adRightSideMediaId = JsonNullable.undefined();

  @JsonProperty("adRightSideMediaId2")
  private JsonNullable<Long> adRightSideMediaId2 = JsonNullable.undefined();

  @JsonProperty("adShrinkMainMediaId")
  private JsonNullable<Long> adShrinkMainMediaId = JsonNullable.undefined();

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo displayUrl(String displayUrl) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo thumbnailMediaId(Long thumbnailMediaId) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo url(String url) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo isRemoveVideo10SecBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo isRemoveVideo25PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo isRemoveVideo3SecBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo isRemoveVideo50PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo isRemoveVideo75PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo isRemoveVideoCompleteBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo isRemoveVideoStartBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo video3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    this.video3SecBeaconUrls = JsonNullable.of(video3SecBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo addVideo3SecBeaconUrlsItem(String video3SecBeaconUrlsItem) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo video25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    this.video25PercentBeaconUrls = JsonNullable.of(video25PercentBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo addVideo25PercentBeaconUrlsItem(String video25PercentBeaconUrlsItem) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo video50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    this.video50PercentBeaconUrls = JsonNullable.of(video50PercentBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo addVideo50PercentBeaconUrlsItem(String video50PercentBeaconUrlsItem) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo video75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    this.video75PercentBeaconUrls = JsonNullable.of(video75PercentBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo addVideo75PercentBeaconUrlsItem(String video75PercentBeaconUrlsItem) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo video10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    this.video10SecBeaconUrls = JsonNullable.of(video10SecBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo addVideo10SecBeaconUrlsItem(String video10SecBeaconUrlsItem) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo videoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    this.videoCompleteBeaconUrls = JsonNullable.of(videoCompleteBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo addVideoCompleteBeaconUrlsItem(String videoCompleteBeaconUrlsItem) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo videoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    this.videoStartBeaconUrls = JsonNullable.of(videoStartBeaconUrls);
    return this;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo addVideoStartBeaconUrlsItem(String videoStartBeaconUrlsItem) {
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

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo adLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = JsonNullable.of(adLeftSideMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adLeftSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getAdLeftSideMediaId() {
    return adLeftSideMediaId;
  }

  public void setAdLeftSideMediaId(JsonNullable<Long> adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo adLeftSideMediaId2(Long adLeftSideMediaId2) {
    this.adLeftSideMediaId2 = JsonNullable.of(adLeftSideMediaId2);
    return this;
  }

  /**
   * <div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adLeftSideMediaId2
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getAdLeftSideMediaId2() {
    return adLeftSideMediaId2;
  }

  public void setAdLeftSideMediaId2(JsonNullable<Long> adLeftSideMediaId2) {
    this.adLeftSideMediaId2 = adLeftSideMediaId2;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo adRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = JsonNullable.of(adRightSideMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adRightSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getAdRightSideMediaId() {
    return adRightSideMediaId;
  }

  public void setAdRightSideMediaId(JsonNullable<Long> adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo adRightSideMediaId2(Long adRightSideMediaId2) {
    this.adRightSideMediaId2 = JsonNullable.of(adRightSideMediaId2);
    return this;
  }

  /**
   * <div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adRightSideMediaId2
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getAdRightSideMediaId2() {
    return adRightSideMediaId2;
  }

  public void setAdRightSideMediaId2(JsonNullable<Long> adRightSideMediaId2) {
    this.adRightSideMediaId2 = adRightSideMediaId2;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo adShrinkMainMediaId(Long adShrinkMainMediaId) {
    this.adShrinkMainMediaId = JsonNullable.of(adShrinkMainMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Reduced main image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adShrinkMainMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Reduced main image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getAdShrinkMainMediaId() {
    return adShrinkMainMediaId;
  }

  public void setAdShrinkMainMediaId(JsonNullable<Long> adShrinkMainMediaId) {
    this.adShrinkMainMediaId = adShrinkMainMediaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo = (GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.displayUrl) &&
        Objects.equals(this.thumbnailMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.thumbnailMediaId) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.url) &&
        Objects.equals(this.isRemoveVideo10SecBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.isRemoveVideo10SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo25PercentBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.isRemoveVideo25PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo3SecBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.isRemoveVideo3SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo50PercentBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.isRemoveVideo50PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo75PercentBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.isRemoveVideo75PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideoCompleteBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.isRemoveVideoCompleteBeaconUrls) &&
        Objects.equals(this.isRemoveVideoStartBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.isRemoveVideoStartBeaconUrls) &&
        Objects.equals(this.video3SecBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.video3SecBeaconUrls) &&
        Objects.equals(this.video25PercentBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.video25PercentBeaconUrls) &&
        Objects.equals(this.video50PercentBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.video50PercentBeaconUrls) &&
        Objects.equals(this.video75PercentBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.video75PercentBeaconUrls) &&
        Objects.equals(this.video10SecBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.video10SecBeaconUrls) &&
        Objects.equals(this.videoCompleteBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.videoCompleteBeaconUrls) &&
        Objects.equals(this.videoStartBeaconUrls, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.videoStartBeaconUrls) &&
        Objects.equals(this.adLeftSideMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.adLeftSideMediaId) &&
        Objects.equals(this.adLeftSideMediaId2, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.adLeftSideMediaId2) &&
        Objects.equals(this.adRightSideMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.adRightSideMediaId) &&
        Objects.equals(this.adRightSideMediaId2, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.adRightSideMediaId2) &&
        Objects.equals(this.adShrinkMainMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo.adShrinkMainMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, thumbnailMediaId, url, isRemoveVideo10SecBeaconUrls, isRemoveVideo25PercentBeaconUrls, isRemoveVideo3SecBeaconUrls, isRemoveVideo50PercentBeaconUrls, isRemoveVideo75PercentBeaconUrls, isRemoveVideoCompleteBeaconUrls, isRemoveVideoStartBeaconUrls, video3SecBeaconUrls, video25PercentBeaconUrls, video50PercentBeaconUrls, video75PercentBeaconUrls, video10SecBeaconUrls, videoCompleteBeaconUrls, videoStartBeaconUrls, adLeftSideMediaId, adLeftSideMediaId2, adRightSideMediaId, adRightSideMediaId2, adShrinkMainMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo {\n");
    
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
    sb.append("    adLeftSideMediaId: ").append(toIndentedString(adLeftSideMediaId)).append("\n");
    sb.append("    adLeftSideMediaId2: ").append(toIndentedString(adLeftSideMediaId2)).append("\n");
    sb.append("    adRightSideMediaId: ").append(toIndentedString(adRightSideMediaId)).append("\n");
    sb.append("    adRightSideMediaId2: ").append(toIndentedString(adRightSideMediaId2)).append("\n");
    sb.append("    adShrinkMainMediaId: ").append(toIndentedString(adShrinkMainMediaId)).append("\n");
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


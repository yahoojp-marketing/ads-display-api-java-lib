package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpServiceActiveStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpServiceItemListUploadType;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpServiceSchedule;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpオブジェクトは、定期アップロード設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtp object retains Periodic Upload setting information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedFtpオブジェクトは、定期アップロード設定情報を保持します。</div> <div lang=\"en\">FeedFtp object retains Periodic Upload setting information.</div> ")

public class FeedFtp   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("activeStatus")
  private JsonNullable<FeedFtpServiceActiveStatus> activeStatus = JsonNullable.undefined();

  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  @JsonProperty("feedUrl")
  private JsonNullable<String> feedUrl = JsonNullable.undefined();

  @JsonProperty("itemListUploadType")
  private JsonNullable<FeedFtpServiceItemListUploadType> itemListUploadType = JsonNullable.undefined();

  @JsonProperty("schedule")
  private JsonNullable<FeedFtpServiceSchedule> schedule = JsonNullable.undefined();

  @JsonProperty("userName")
  private JsonNullable<String> userName = JsonNullable.undefined();

  @JsonProperty("userPassword")
  private JsonNullable<String> userPassword = JsonNullable.undefined();

  public FeedFtp accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public FeedFtp activeStatus(FeedFtpServiceActiveStatus activeStatus) {
    this.activeStatus = JsonNullable.of(activeStatus);
    return this;
  }

  /**
   * Get activeStatus
   * @return activeStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedFtpServiceActiveStatus> getActiveStatus() {
    return activeStatus;
  }

  public void setActiveStatus(JsonNullable<FeedFtpServiceActiveStatus> activeStatus) {
    this.activeStatus = activeStatus;
  }

  public FeedFtp feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\"> Feedを識別するIdです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Feed ID.<br> This field is required in requests. </div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別するIdです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Feed ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }

  public FeedFtp feedUrl(String feedUrl) {
    this.feedUrl = JsonNullable.of(feedUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品リストファイルのURLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> URL of item list file.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return feedUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品リストファイルのURLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> URL of item list file.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getFeedUrl() {
    return feedUrl;
  }

  public void setFeedUrl(JsonNullable<String> feedUrl) {
    this.feedUrl = feedUrl;
  }

  public FeedFtp itemListUploadType(FeedFtpServiceItemListUploadType itemListUploadType) {
    this.itemListUploadType = JsonNullable.of(itemListUploadType);
    return this;
  }

  /**
   * Get itemListUploadType
   * @return itemListUploadType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedFtpServiceItemListUploadType> getItemListUploadType() {
    return itemListUploadType;
  }

  public void setItemListUploadType(JsonNullable<FeedFtpServiceItemListUploadType> itemListUploadType) {
    this.itemListUploadType = itemListUploadType;
  }

  public FeedFtp schedule(FeedFtpServiceSchedule schedule) {
    this.schedule = JsonNullable.of(schedule);
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedFtpServiceSchedule> getSchedule() {
    return schedule;
  }

  public void setSchedule(JsonNullable<FeedFtpServiceSchedule> schedule) {
    this.schedule = schedule;
  }

  public FeedFtp userName(String userName) {
    this.userName = JsonNullable.of(userName);
    return this;
  }

  /**
   * <div lang=\"ja\"> ユーザー名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> User name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return userName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ユーザー名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> User name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getUserName() {
    return userName;
  }

  public void setUserName(JsonNullable<String> userName) {
    this.userName = userName;
  }

  public FeedFtp userPassword(String userPassword) {
    this.userPassword = JsonNullable.of(userPassword);
    return this;
  }

  /**
   * <div lang=\"ja\"> パスワードです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Password.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return userPassword
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> パスワードです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Password.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(JsonNullable<String> userPassword) {
    this.userPassword = userPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedFtp feedFtp = (FeedFtp) o;
    return Objects.equals(this.accountId, feedFtp.accountId) &&
        Objects.equals(this.activeStatus, feedFtp.activeStatus) &&
        Objects.equals(this.feedId, feedFtp.feedId) &&
        Objects.equals(this.feedUrl, feedFtp.feedUrl) &&
        Objects.equals(this.itemListUploadType, feedFtp.itemListUploadType) &&
        Objects.equals(this.schedule, feedFtp.schedule) &&
        Objects.equals(this.userName, feedFtp.userName) &&
        Objects.equals(this.userPassword, feedFtp.userPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, activeStatus, feedId, feedUrl, itemListUploadType, schedule, userName, userPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtp {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    feedUrl: ").append(toIndentedString(feedUrl)).append("\n");
    sb.append("    itemListUploadType: ").append(toIndentedString(itemListUploadType)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v17.model.FeedFtpServiceActiveStatus;
import jp.co.yahoo.adsdisplayapi.v17.model.FeedFtpServiceItemListUploadType;
import jp.co.yahoo.adsdisplayapi.v17.model.FeedFtpServiceSchedule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpオブジェクトは、定期アップロード設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtp object retains Periodic Upload setting information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedFtp.JSON_PROPERTY_ACCOUNT_ID,
  FeedFtp.JSON_PROPERTY_ACTIVE_STATUS,
  FeedFtp.JSON_PROPERTY_FEED_ID,
  FeedFtp.JSON_PROPERTY_FEED_URL,
  FeedFtp.JSON_PROPERTY_ITEM_LIST_UPLOAD_TYPE,
  FeedFtp.JSON_PROPERTY_SCHEDULE,
  FeedFtp.JSON_PROPERTY_USER_NAME,
  FeedFtp.JSON_PROPERTY_USER_PASSWORD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedFtp {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ACTIVE_STATUS = "activeStatus";
  private FeedFtpServiceActiveStatus activeStatus;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_FEED_URL = "feedUrl";
  private String feedUrl;

  public static final String JSON_PROPERTY_ITEM_LIST_UPLOAD_TYPE = "itemListUploadType";
  private FeedFtpServiceItemListUploadType itemListUploadType;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private FeedFtpServiceSchedule schedule;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_USER_PASSWORD = "userPassword";
  private String userPassword;

  public FeedFtp() {
  }

  public FeedFtp accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public FeedFtp activeStatus(FeedFtpServiceActiveStatus activeStatus) {
    
    this.activeStatus = activeStatus;
    return this;
  }

   /**
   * Get activeStatus
   * @return activeStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtpServiceActiveStatus getActiveStatus() {
    return activeStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveStatus(FeedFtpServiceActiveStatus activeStatus) {
    this.activeStatus = activeStatus;
  }


  public FeedFtp feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; Feedを識別するIdです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Feed ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return feedId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public FeedFtp feedUrl(String feedUrl) {
    
    this.feedUrl = feedUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 商品リストファイルのURLです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; URL of item list file.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return feedUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeedUrl() {
    return feedUrl;
  }


  @JsonProperty(JSON_PROPERTY_FEED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedUrl(String feedUrl) {
    this.feedUrl = feedUrl;
  }


  public FeedFtp itemListUploadType(FeedFtpServiceItemListUploadType itemListUploadType) {
    
    this.itemListUploadType = itemListUploadType;
    return this;
  }

   /**
   * Get itemListUploadType
   * @return itemListUploadType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtpServiceItemListUploadType getItemListUploadType() {
    return itemListUploadType;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemListUploadType(FeedFtpServiceItemListUploadType itemListUploadType) {
    this.itemListUploadType = itemListUploadType;
  }


  public FeedFtp schedule(FeedFtpServiceSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtpServiceSchedule getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(FeedFtpServiceSchedule schedule) {
    this.schedule = schedule;
  }


  public FeedFtp userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ユーザー名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; User name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return userName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public FeedFtp userPassword(String userPassword) {
    
    this.userPassword = userPassword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; パスワードです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Password.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return userPassword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserPassword() {
    return userPassword;
  }


  @JsonProperty(JSON_PROPERTY_USER_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


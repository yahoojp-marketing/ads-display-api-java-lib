/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v15.model.AudienceListServiceContainDataConnectionStopped;
import jp.co.yahoo.adsdisplayapi.v15.model.AudienceListServiceContainUnavailableAdActionUserListFlg;
import jp.co.yahoo.adsdisplayapi.v15.model.AudienceListServiceSize;
import jp.co.yahoo.adsdisplayapi.v15.model.AudienceListServiceSizeReaches;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 類似ユーザーターゲットの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがSIMILARITYの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceSimilarityAudienceList object is a container for storing the information of Targeting information of users (similar).&lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If audienceListType is SIMILARITY, this field is required in ADD and SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceSimilarityAudienceList.JSON_PROPERTY_AUDIENCE_LIST_ID,
  AudienceListServiceSimilarityAudienceList.JSON_PROPERTY_AUDIENCE_LIST_SIZE,
  AudienceListServiceSimilarityAudienceList.JSON_PROPERTY_AUDIENCE_LIST_SIZE_REACHES,
  AudienceListServiceSimilarityAudienceList.JSON_PROPERTY_CONTAIN_UNAVAILABLE_AD_ACTION_USER_LIST_FLG,
  AudienceListServiceSimilarityAudienceList.JSON_PROPERTY_CONTAIN_DATA_CONNECTION_STOPPED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceSimilarityAudienceList {
  public static final String JSON_PROPERTY_AUDIENCE_LIST_ID = "audienceListId";
  private Long audienceListId;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_SIZE = "audienceListSize";
  private AudienceListServiceSize audienceListSize;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_SIZE_REACHES = "audienceListSizeReaches";
  private List<AudienceListServiceSizeReaches> audienceListSizeReaches;

  public static final String JSON_PROPERTY_CONTAIN_UNAVAILABLE_AD_ACTION_USER_LIST_FLG = "containUnavailableAdActionUserListFlg";
  private AudienceListServiceContainUnavailableAdActionUserListFlg containUnavailableAdActionUserListFlg;

  public static final String JSON_PROPERTY_CONTAIN_DATA_CONNECTION_STOPPED = "containDataConnectionStopped";
  private AudienceListServiceContainDataConnectionStopped containDataConnectionStopped;

  public AudienceListServiceSimilarityAudienceList() {
  }

  public AudienceListServiceSimilarityAudienceList audienceListId(Long audienceListId) {
    
    this.audienceListId = audienceListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリスト（類似ユーザー）を作成する基となるオーディエンスリストIDです。&lt;br&gt; このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience list ID that is the basis for creating the audience list (similar users).&lt;br&gt; This field is required in ADD operation, and will be ignored in SET and REMOVE operation. &lt;/div&gt; 
   * @return audienceListId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAudienceListId() {
    return audienceListId;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
  }


  public AudienceListServiceSimilarityAudienceList audienceListSize(AudienceListServiceSize audienceListSize) {
    
    this.audienceListSize = audienceListSize;
    return this;
  }

   /**
   * Get audienceListSize
   * @return audienceListSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceSize getAudienceListSize() {
    return audienceListSize;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListSize(AudienceListServiceSize audienceListSize) {
    this.audienceListSize = audienceListSize;
  }


  public AudienceListServiceSimilarityAudienceList audienceListSizeReaches(List<AudienceListServiceSizeReaches> audienceListSizeReaches) {
    
    this.audienceListSizeReaches = audienceListSizeReaches;
    return this;
  }

  public AudienceListServiceSimilarityAudienceList addAudienceListSizeReachesItem(AudienceListServiceSizeReaches audienceListSizeReachesItem) {
    if (this.audienceListSizeReaches == null) {
      this.audienceListSizeReaches = new ArrayList<>();
    }
    this.audienceListSizeReaches.add(audienceListSizeReachesItem);
    return this;
  }

   /**
   * Get audienceListSizeReaches
   * @return audienceListSizeReaches
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SIZE_REACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AudienceListServiceSizeReaches> getAudienceListSizeReaches() {
    return audienceListSizeReaches;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SIZE_REACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListSizeReaches(List<AudienceListServiceSizeReaches> audienceListSizeReaches) {
    this.audienceListSizeReaches = audienceListSizeReaches;
  }


  public AudienceListServiceSimilarityAudienceList containUnavailableAdActionUserListFlg(AudienceListServiceContainUnavailableAdActionUserListFlg containUnavailableAdActionUserListFlg) {
    
    this.containUnavailableAdActionUserListFlg = containUnavailableAdActionUserListFlg;
    return this;
  }

   /**
   * Get containUnavailableAdActionUserListFlg
   * @return containUnavailableAdActionUserListFlg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAIN_UNAVAILABLE_AD_ACTION_USER_LIST_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceContainUnavailableAdActionUserListFlg getContainUnavailableAdActionUserListFlg() {
    return containUnavailableAdActionUserListFlg;
  }


  @JsonProperty(JSON_PROPERTY_CONTAIN_UNAVAILABLE_AD_ACTION_USER_LIST_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainUnavailableAdActionUserListFlg(AudienceListServiceContainUnavailableAdActionUserListFlg containUnavailableAdActionUserListFlg) {
    this.containUnavailableAdActionUserListFlg = containUnavailableAdActionUserListFlg;
  }


  public AudienceListServiceSimilarityAudienceList containDataConnectionStopped(AudienceListServiceContainDataConnectionStopped containDataConnectionStopped) {
    
    this.containDataConnectionStopped = containDataConnectionStopped;
    return this;
  }

   /**
   * Get containDataConnectionStopped
   * @return containDataConnectionStopped
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAIN_DATA_CONNECTION_STOPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceContainDataConnectionStopped getContainDataConnectionStopped() {
    return containDataConnectionStopped;
  }


  @JsonProperty(JSON_PROPERTY_CONTAIN_DATA_CONNECTION_STOPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainDataConnectionStopped(AudienceListServiceContainDataConnectionStopped containDataConnectionStopped) {
    this.containDataConnectionStopped = containDataConnectionStopped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceSimilarityAudienceList audienceListServiceSimilarityAudienceList = (AudienceListServiceSimilarityAudienceList) o;
    return Objects.equals(this.audienceListId, audienceListServiceSimilarityAudienceList.audienceListId) &&
        Objects.equals(this.audienceListSize, audienceListServiceSimilarityAudienceList.audienceListSize) &&
        Objects.equals(this.audienceListSizeReaches, audienceListServiceSimilarityAudienceList.audienceListSizeReaches) &&
        Objects.equals(this.containUnavailableAdActionUserListFlg, audienceListServiceSimilarityAudienceList.containUnavailableAdActionUserListFlg) &&
        Objects.equals(this.containDataConnectionStopped, audienceListServiceSimilarityAudienceList.containDataConnectionStopped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListId, audienceListSize, audienceListSizeReaches, containUnavailableAdActionUserListFlg, containDataConnectionStopped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceSimilarityAudienceList {\n");
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
    sb.append("    audienceListSize: ").append(toIndentedString(audienceListSize)).append("\n");
    sb.append("    audienceListSizeReaches: ").append(toIndentedString(audienceListSizeReaches)).append("\n");
    sb.append("    containUnavailableAdActionUserListFlg: ").append(toIndentedString(containUnavailableAdActionUserListFlg)).append("\n");
    sb.append("    containDataConnectionStopped: ").append(toIndentedString(containDataConnectionStopped)).append("\n");
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


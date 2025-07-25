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
import jp.co.yahoo.adsdisplayapi.v17.model.AudienceListServiceContent;
import jp.co.yahoo.adsdisplayapi.v17.model.AudienceListServiceDataConnectionStopped;
import jp.co.yahoo.adsdisplayapi.v17.model.AudienceListServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v17.model.AudienceListServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v17.model.AudienceListServiceSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListオブジェクトは、オーディエンスリストの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceList object describes information of audience list.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceList.JSON_PROPERTY_ACCOUNT_ID,
  AudienceList.JSON_PROPERTY_DELIVERY_STATUS,
  AudienceList.JSON_PROPERTY_DESCRIPTION,
  AudienceList.JSON_PROPERTY_IS_REMOVE_DESCRIPTION,
  AudienceList.JSON_PROPERTY_REACH,
  AudienceList.JSON_PROPERTY_AUDIENCE_LIST_CONTENT,
  AudienceList.JSON_PROPERTY_AUDIENCE_LIST_ID,
  AudienceList.JSON_PROPERTY_AUDIENCE_LIST_NAME,
  AudienceList.JSON_PROPERTY_SOURCE_ACCOUNT_ID,
  AudienceList.JSON_PROPERTY_SOURCE_ACCOUNT_NAME,
  AudienceList.JSON_PROPERTY_SOURCE_TYPE,
  AudienceList.JSON_PROPERTY_IS_SHARED,
  AudienceList.JSON_PROPERTY_DATA_CONNECTION_STOPPED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceList {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_DELIVERY_STATUS = "deliveryStatus";
  private AudienceListServiceDeliveryStatus deliveryStatus;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_REMOVE_DESCRIPTION = "isRemoveDescription";
  private AudienceListServiceIsRemoveFlg isRemoveDescription;

  public static final String JSON_PROPERTY_REACH = "reach";
  private Long reach;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_CONTENT = "audienceListContent";
  private AudienceListServiceContent audienceListContent;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_ID = "audienceListId";
  private Long audienceListId;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_NAME = "audienceListName";
  private String audienceListName;

  public static final String JSON_PROPERTY_SOURCE_ACCOUNT_ID = "sourceAccountId";
  private Long sourceAccountId;

  public static final String JSON_PROPERTY_SOURCE_ACCOUNT_NAME = "sourceAccountName";
  private String sourceAccountName;

  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  private AudienceListServiceSourceType sourceType;

  public static final String JSON_PROPERTY_IS_SHARED = "isShared";
  private Boolean isShared;

  public static final String JSON_PROPERTY_DATA_CONNECTION_STOPPED = "dataConnectionStopped";
  private AudienceListServiceDataConnectionStopped dataConnectionStopped;

  public AudienceList() {
  }

  public AudienceList accountId(Long accountId) {
    
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


  public AudienceList deliveryStatus(AudienceListServiceDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatus(AudienceListServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public AudienceList description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリストの説明です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Description of audience list.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return description
  **/
  @jakarta.annotation.Nullable
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


  public AudienceList isRemoveDescription(AudienceListServiceIsRemoveFlg isRemoveDescription) {
    
    this.isRemoveDescription = isRemoveDescription;
    return this;
  }

   /**
   * Get isRemoveDescription
   * @return isRemoveDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceIsRemoveFlg getIsRemoveDescription() {
    return isRemoveDescription;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveDescription(AudienceListServiceIsRemoveFlg isRemoveDescription) {
    this.isRemoveDescription = isRemoveDescription;
  }


  public AudienceList reach(Long reach) {
    
    this.reach = reach;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リーチ数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Number of reaches.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return reach
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReach() {
    return reach;
  }


  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReach(Long reach) {
    this.reach = reach;
  }


  public AudienceList audienceListContent(AudienceListServiceContent audienceListContent) {
    
    this.audienceListContent = audienceListContent;
    return this;
  }

   /**
   * Get audienceListContent
   * @return audienceListContent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceContent getAudienceListContent() {
    return audienceListContent;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListContent(AudienceListServiceContent audienceListContent) {
    this.audienceListContent = audienceListContent;
  }


  public AudienceList audienceListId(Long audienceListId) {
    
    this.audienceListId = audienceListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリストIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となり、ADD時には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience list ID.&lt;br&gt; This field is required in SET and REMOVE operation, and will be ignored in ADD operation. &lt;/div&gt; 
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


  public AudienceList audienceListName(String audienceListName) {
    
    this.audienceListName = audienceListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリスト名です。&lt;br&gt; このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience list name.&lt;br&gt; This field is required in ADD operation, optional in SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return audienceListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudienceListName() {
    return audienceListName;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
  }


  public AudienceList sourceAccountId(Long sourceAccountId) {
    
    this.sourceAccountId = sourceAccountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   共有元アカウントIDです。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Account ID of the sharing source.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return sourceAccountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSourceAccountId() {
    return sourceAccountId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceAccountId(Long sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
  }


  public AudienceList sourceAccountName(String sourceAccountName) {
    
    this.sourceAccountName = sourceAccountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   共有元アカウント名です。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Account name of the sharing source.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return sourceAccountName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceAccountName() {
    return sourceAccountName;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceAccountName(String sourceAccountName) {
    this.sourceAccountName = sourceAccountName;
  }


  public AudienceList sourceType(AudienceListServiceSourceType sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceSourceType getSourceType() {
    return sourceType;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceType(AudienceListServiceSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public AudienceList isShared(Boolean isShared) {
    
    this.isShared = isShared;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   AudienceListServiceIsSharedは、オーディエンスリストの共有ステータスを示します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   AudienceListServiceIsShared describes the sharing status of the audience list.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return isShared
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsShared() {
    return isShared;
  }


  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  public AudienceList dataConnectionStopped(AudienceListServiceDataConnectionStopped dataConnectionStopped) {
    
    this.dataConnectionStopped = dataConnectionStopped;
    return this;
  }

   /**
   * Get dataConnectionStopped
   * @return dataConnectionStopped
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_CONNECTION_STOPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceDataConnectionStopped getDataConnectionStopped() {
    return dataConnectionStopped;
  }


  @JsonProperty(JSON_PROPERTY_DATA_CONNECTION_STOPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataConnectionStopped(AudienceListServiceDataConnectionStopped dataConnectionStopped) {
    this.dataConnectionStopped = dataConnectionStopped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceList audienceList = (AudienceList) o;
    return Objects.equals(this.accountId, audienceList.accountId) &&
        Objects.equals(this.deliveryStatus, audienceList.deliveryStatus) &&
        Objects.equals(this.description, audienceList.description) &&
        Objects.equals(this.isRemoveDescription, audienceList.isRemoveDescription) &&
        Objects.equals(this.reach, audienceList.reach) &&
        Objects.equals(this.audienceListContent, audienceList.audienceListContent) &&
        Objects.equals(this.audienceListId, audienceList.audienceListId) &&
        Objects.equals(this.audienceListName, audienceList.audienceListName) &&
        Objects.equals(this.sourceAccountId, audienceList.sourceAccountId) &&
        Objects.equals(this.sourceAccountName, audienceList.sourceAccountName) &&
        Objects.equals(this.sourceType, audienceList.sourceType) &&
        Objects.equals(this.isShared, audienceList.isShared) &&
        Objects.equals(this.dataConnectionStopped, audienceList.dataConnectionStopped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, deliveryStatus, description, isRemoveDescription, reach, audienceListContent, audienceListId, audienceListName, sourceAccountId, sourceAccountName, sourceType, isShared, dataConnectionStopped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceList {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRemoveDescription: ").append(toIndentedString(isRemoveDescription)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    audienceListContent: ").append(toIndentedString(audienceListContent)).append("\n");
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
    sb.append("    sourceAccountId: ").append(toIndentedString(sourceAccountId)).append("\n");
    sb.append("    sourceAccountName: ").append(toIndentedString(sourceAccountName)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    dataConnectionStopped: ").append(toIndentedString(dataConnectionStopped)).append("\n");
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


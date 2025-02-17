/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v16.model.AudienceListServiceIsZeroOrCurrentlyTotaling;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceBusinessManagerAudienceListオブジェクトは、オーディエンスリスト（ビジネスマネージャー）を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceBusinessManagerAudienceList object is a container for audience list (business manager). &lt;br&gt; This field will be returned in the response, but will be ignored on input. &lt;/div&gt;
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceBusinessManagerAudienceListオブジェクトは、オーディエンスリスト（ビジネスマネージャー）を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AudienceListServiceBusinessManagerAudienceList object is a container for audience list (business manager). <br> This field will be returned in the response, but will be ignored on input. </div>")
@JsonPropertyOrder({
  AudienceListServiceBusinessManagerAudienceList.JSON_PROPERTY_LINE_AUDIENCE_GROUP_ID,
  AudienceListServiceBusinessManagerAudienceList.JSON_PROPERTY_LINE_AUDIENCE_GROUP_TYPE,
  AudienceListServiceBusinessManagerAudienceList.JSON_PROPERTY_LINE_AUDIENCE_GROUP_OWNER_TYPE,
  AudienceListServiceBusinessManagerAudienceList.JSON_PROPERTY_IS_ZERO_OR_CURRENTLY_TOTALING
})
@JsonTypeName("AudienceListServiceBusinessManagerAudienceList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceBusinessManagerAudienceList {
  public static final String JSON_PROPERTY_LINE_AUDIENCE_GROUP_ID = "lineAudienceGroupId";
  private Long lineAudienceGroupId;

  public static final String JSON_PROPERTY_LINE_AUDIENCE_GROUP_TYPE = "lineAudienceGroupType";
  private String lineAudienceGroupType;

  public static final String JSON_PROPERTY_LINE_AUDIENCE_GROUP_OWNER_TYPE = "lineAudienceGroupOwnerType";
  private String lineAudienceGroupOwnerType;

  public static final String JSON_PROPERTY_IS_ZERO_OR_CURRENTLY_TOTALING = "isZeroOrCurrentlyTotaling";
  private AudienceListServiceIsZeroOrCurrentlyTotaling isZeroOrCurrentlyTotaling;

  public AudienceListServiceBusinessManagerAudienceList() { 
  }

  public AudienceListServiceBusinessManagerAudienceList lineAudienceGroupId(Long lineAudienceGroupId) {
    
    this.lineAudienceGroupId = lineAudienceGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; LINEのオーディエンスグループIDです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; LINE audience group ID. &lt;br&gt; &lt;/div&gt; 
   * @return lineAudienceGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> LINEのオーディエンスグループIDです。<br> </div> <div lang=\"en\"> LINE audience group ID. <br> </div> ")
  @JsonProperty(JSON_PROPERTY_LINE_AUDIENCE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLineAudienceGroupId() {
    return lineAudienceGroupId;
  }


  @JsonProperty(JSON_PROPERTY_LINE_AUDIENCE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineAudienceGroupId(Long lineAudienceGroupId) {
    this.lineAudienceGroupId = lineAudienceGroupId;
  }


  public AudienceListServiceBusinessManagerAudienceList lineAudienceGroupType(String lineAudienceGroupType) {
    
    this.lineAudienceGroupType = lineAudienceGroupType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceLineAudienceGroupTypeは、LINEのオーディエンスタイプを表します&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; lineAudienceGroupTypeで返却される値は、以下のとおりです。&lt;br&gt; &lt;table border&#x3D;&#39;1&#39;&gt;   &lt;tr&gt;     &lt;th&gt;lineAudienceGroupType&lt;/th&gt;     &lt;th&gt;説明&lt;/th&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;IDFA_AAID_UPLOAD&lt;/td&gt;     &lt;td&gt;IDFA/AAIDアップロード&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;PHONE_NUMBER_UPLOAD&lt;/td&gt;     &lt;td&gt;電話番号アップロード&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;EMAIL_ADDRESS_UPLOAD&lt;/td&gt;     &lt;td&gt;メールアドレスアップロード&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;MID_UID_UPLOAD&lt;/td&gt;     &lt;td&gt;ユーザーIDアップロード&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;WEB_TRAFFIC_AUDIENCE&lt;/td&gt;     &lt;td&gt;ウェブトラフィックオーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;APP_EVENT_AUDIENCE&lt;/td&gt;     &lt;td&gt;モバイルアプリオーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;IMAGE_CLICK_AUDIENCE&lt;/td&gt;     &lt;td&gt;画像クリックオーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;VIDEO_VIEW_AUDIENCE&lt;/td&gt;     &lt;td&gt;動画視聴オーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;LOOKALIKE_AUDIENCE&lt;/td&gt;     &lt;td&gt;類似オーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;MESSAGE_CLICK_AUDIENCE&lt;/td&gt;     &lt;td&gt;メッセージクリックオーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;MESSAGE_IMP_AUDIENCE&lt;/td&gt;     &lt;td&gt;メッセージインプレッションオーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;RICHMENU_CLICK_AUDIENCE&lt;/td&gt;     &lt;td&gt;リッチメニュークリックオーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;RICHMENU_IMP_AUDIENCE&lt;/td&gt;     &lt;td&gt;リッチメニューインプレッションオーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;CHAT_TAG_AUDIENCE&lt;/td&gt;     &lt;td&gt;チャットタグオーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;FRIEND_ROUTE_AUDIENCE&lt;/td&gt;     &lt;td&gt;友だち追加経路オーディエンス&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;RESERVATION_AUDIENCE&lt;/td&gt;     &lt;td&gt;予約オーディエンス&lt;/td&gt;   &lt;/tr&gt; &lt;/table&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceLineAudienceGroupType represents the type of LINE audience.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. Responded values of &#x60;lineAudienceGroupType&#x60; are as follows. &lt;table border&#x3D;&#39;1&#39;&gt;   &lt;tr&gt;     &lt;th&gt;lineAudienceGroupType&lt;/th&gt;     &lt;th&gt;Description&lt;/th&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;IDFA_AAID_UPLOAD&lt;/td&gt;     &lt;td&gt;IDFA/AAID upload&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;PHONE_NUMBER_UPLOAD&lt;/td&gt;     &lt;td&gt;Phone number upload&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;EMAIL_ADDRESS_UPLOAD&lt;/td&gt;     &lt;td&gt;Email address upload&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;MID_UID_UPLOAD&lt;/td&gt;     &lt;td&gt;User ID upload&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;WEB_TRAFFIC_AUDIENCE&lt;/td&gt;     &lt;td&gt;Web traffic audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;APP_EVENT_AUDIENCE&lt;/td&gt;     &lt;td&gt;Mobile app audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;IMAGE_CLICK_AUDIENCE&lt;/td&gt;     &lt;td&gt;Image click audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;VIDEO_VIEW_AUDIENCE&lt;/td&gt;     &lt;td&gt;Video view audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;LOOKALIKE_AUDIENCE&lt;/td&gt;     &lt;td&gt;Lookalike audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;MESSAGE_CLICK_AUDIENCE&lt;/td&gt;     &lt;td&gt;Message click audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;MESSAGE_IMP_AUDIENCE&lt;/td&gt;     &lt;td&gt;Message impression audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;RICHMENU_CLICK_AUDIENCE&lt;/td&gt;     &lt;td&gt;Rich menu click audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;RICHMENU_IMP_AUDIENCE&lt;/td&gt;     &lt;td&gt;Rich menu impression audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;CHAT_TAG_AUDIENCE&lt;/td&gt;     &lt;td&gt;Chat tag audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;FRIEND_ROUTE_AUDIENCE&lt;/td&gt;     &lt;td&gt;Friend path audience&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;RESERVATION_AUDIENCE&lt;/td&gt;     &lt;td&gt;Reservation audience&lt;/td&gt;   &lt;/tr&gt; &lt;/table&gt; &lt;/div&gt;
   * @return lineAudienceGroupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> AudienceListServiceLineAudienceGroupTypeは、LINEのオーディエンスタイプを表します<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> lineAudienceGroupTypeで返却される値は、以下のとおりです。<br> <table border='1'>   <tr>     <th>lineAudienceGroupType</th>     <th>説明</th>   </tr>   <tr>     <td>IDFA_AAID_UPLOAD</td>     <td>IDFA/AAIDアップロード</td>   </tr>   <tr>     <td>PHONE_NUMBER_UPLOAD</td>     <td>電話番号アップロード</td>   </tr>   <tr>     <td>EMAIL_ADDRESS_UPLOAD</td>     <td>メールアドレスアップロード</td>   </tr>   <tr>     <td>MID_UID_UPLOAD</td>     <td>ユーザーIDアップロード</td>   </tr>   <tr>     <td>WEB_TRAFFIC_AUDIENCE</td>     <td>ウェブトラフィックオーディエンス</td>   </tr>   <tr>     <td>APP_EVENT_AUDIENCE</td>     <td>モバイルアプリオーディエンス</td>   </tr>   <tr>     <td>IMAGE_CLICK_AUDIENCE</td>     <td>画像クリックオーディエンス</td>   </tr>   <tr>     <td>VIDEO_VIEW_AUDIENCE</td>     <td>動画視聴オーディエンス</td>   </tr>   <tr>     <td>LOOKALIKE_AUDIENCE</td>     <td>類似オーディエンス</td>   </tr>   <tr>     <td>MESSAGE_CLICK_AUDIENCE</td>     <td>メッセージクリックオーディエンス</td>   </tr>   <tr>     <td>MESSAGE_IMP_AUDIENCE</td>     <td>メッセージインプレッションオーディエンス</td>   </tr>   <tr>     <td>RICHMENU_CLICK_AUDIENCE</td>     <td>リッチメニュークリックオーディエンス</td>   </tr>   <tr>     <td>RICHMENU_IMP_AUDIENCE</td>     <td>リッチメニューインプレッションオーディエンス</td>   </tr>   <tr>     <td>CHAT_TAG_AUDIENCE</td>     <td>チャットタグオーディエンス</td>   </tr>   <tr>     <td>FRIEND_ROUTE_AUDIENCE</td>     <td>友だち追加経路オーディエンス</td>   </tr>   <tr>     <td>RESERVATION_AUDIENCE</td>     <td>予約オーディエンス</td>   </tr> </table> </div> <div lang=\"en\"> AudienceListServiceLineAudienceGroupType represents the type of LINE audience.<br> Although this field will be returned in the response, it will be ignored on input. Responded values of `lineAudienceGroupType` are as follows. <table border='1'>   <tr>     <th>lineAudienceGroupType</th>     <th>Description</th>   </tr>   <tr>     <td>IDFA_AAID_UPLOAD</td>     <td>IDFA/AAID upload</td>   </tr>   <tr>     <td>PHONE_NUMBER_UPLOAD</td>     <td>Phone number upload</td>   </tr>   <tr>     <td>EMAIL_ADDRESS_UPLOAD</td>     <td>Email address upload</td>   </tr>   <tr>     <td>MID_UID_UPLOAD</td>     <td>User ID upload</td>   </tr>   <tr>     <td>WEB_TRAFFIC_AUDIENCE</td>     <td>Web traffic audience</td>   </tr>   <tr>     <td>APP_EVENT_AUDIENCE</td>     <td>Mobile app audience</td>   </tr>   <tr>     <td>IMAGE_CLICK_AUDIENCE</td>     <td>Image click audience</td>   </tr>   <tr>     <td>VIDEO_VIEW_AUDIENCE</td>     <td>Video view audience</td>   </tr>   <tr>     <td>LOOKALIKE_AUDIENCE</td>     <td>Lookalike audience</td>   </tr>   <tr>     <td>MESSAGE_CLICK_AUDIENCE</td>     <td>Message click audience</td>   </tr>   <tr>     <td>MESSAGE_IMP_AUDIENCE</td>     <td>Message impression audience</td>   </tr>   <tr>     <td>RICHMENU_CLICK_AUDIENCE</td>     <td>Rich menu click audience</td>   </tr>   <tr>     <td>RICHMENU_IMP_AUDIENCE</td>     <td>Rich menu impression audience</td>   </tr>   <tr>     <td>CHAT_TAG_AUDIENCE</td>     <td>Chat tag audience</td>   </tr>   <tr>     <td>FRIEND_ROUTE_AUDIENCE</td>     <td>Friend path audience</td>   </tr>   <tr>     <td>RESERVATION_AUDIENCE</td>     <td>Reservation audience</td>   </tr> </table> </div>")
  @JsonProperty(JSON_PROPERTY_LINE_AUDIENCE_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLineAudienceGroupType() {
    return lineAudienceGroupType;
  }


  @JsonProperty(JSON_PROPERTY_LINE_AUDIENCE_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineAudienceGroupType(String lineAudienceGroupType) {
    this.lineAudienceGroupType = lineAudienceGroupType;
  }


  public AudienceListServiceBusinessManagerAudienceList lineAudienceGroupOwnerType(String lineAudienceGroupOwnerType) {
    
    this.lineAudienceGroupOwnerType = lineAudienceGroupOwnerType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceLineAudienceGroupOwnerTypeは、LINEのオーディエンスの作成元を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; lineAudienceGroupOwnerTypeで返却される値は、以下のとおりです。&lt;br&gt; &lt;table border&#x3D;&#39;1&#39;&gt;   &lt;tr&gt;     &lt;th&gt;lineAudienceGroupOwnerType&lt;/th&gt;     &lt;th&gt;説明&lt;/th&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;LINE_ADS&lt;/td&gt;     &lt;td&gt;LINE広告&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;LINE_OA&lt;/td&gt;     &lt;td&gt;LINE公式アカウント&lt;/td&gt;   &lt;/tr&gt; &lt;/table&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceLineAudienceGroupOwnerType represents the owner of LINE audience.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. Responded values of &#x60;lineAudienceGroupOwnerType&#x60; are as follows. &lt;table border&#x3D;&#39;1&#39;&gt;   &lt;tr&gt;     &lt;th&gt;lineAudienceGroupOwnerType&lt;/th&gt;     &lt;th&gt;Description&lt;/th&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;LINE_ADS&lt;/td&gt;     &lt;td&gt;LINE Ads&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;     &lt;td&gt;LINE_OA&lt;/td&gt;     &lt;td&gt;LINE Official Account&lt;/td&gt;   &lt;/tr&gt; &lt;/table&gt; &lt;/div&gt;
   * @return lineAudienceGroupOwnerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> AudienceListServiceLineAudienceGroupOwnerTypeは、LINEのオーディエンスの作成元を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> lineAudienceGroupOwnerTypeで返却される値は、以下のとおりです。<br> <table border='1'>   <tr>     <th>lineAudienceGroupOwnerType</th>     <th>説明</th>   </tr>   <tr>     <td>LINE_ADS</td>     <td>LINE広告</td>   </tr>   <tr>     <td>LINE_OA</td>     <td>LINE公式アカウント</td>   </tr> </table> </div> <div lang=\"en\"> AudienceListServiceLineAudienceGroupOwnerType represents the owner of LINE audience.<br> Although this field will be returned in the response, it will be ignored on input. Responded values of `lineAudienceGroupOwnerType` are as follows. <table border='1'>   <tr>     <th>lineAudienceGroupOwnerType</th>     <th>Description</th>   </tr>   <tr>     <td>LINE_ADS</td>     <td>LINE Ads</td>   </tr>   <tr>     <td>LINE_OA</td>     <td>LINE Official Account</td>   </tr> </table> </div>")
  @JsonProperty(JSON_PROPERTY_LINE_AUDIENCE_GROUP_OWNER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLineAudienceGroupOwnerType() {
    return lineAudienceGroupOwnerType;
  }


  @JsonProperty(JSON_PROPERTY_LINE_AUDIENCE_GROUP_OWNER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineAudienceGroupOwnerType(String lineAudienceGroupOwnerType) {
    this.lineAudienceGroupOwnerType = lineAudienceGroupOwnerType;
  }


  public AudienceListServiceBusinessManagerAudienceList isZeroOrCurrentlyTotaling(AudienceListServiceIsZeroOrCurrentlyTotaling isZeroOrCurrentlyTotaling) {
    
    this.isZeroOrCurrentlyTotaling = isZeroOrCurrentlyTotaling;
    return this;
  }

   /**
   * Get isZeroOrCurrentlyTotaling
   * @return isZeroOrCurrentlyTotaling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ZERO_OR_CURRENTLY_TOTALING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceIsZeroOrCurrentlyTotaling getIsZeroOrCurrentlyTotaling() {
    return isZeroOrCurrentlyTotaling;
  }


  @JsonProperty(JSON_PROPERTY_IS_ZERO_OR_CURRENTLY_TOTALING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsZeroOrCurrentlyTotaling(AudienceListServiceIsZeroOrCurrentlyTotaling isZeroOrCurrentlyTotaling) {
    this.isZeroOrCurrentlyTotaling = isZeroOrCurrentlyTotaling;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceBusinessManagerAudienceList audienceListServiceBusinessManagerAudienceList = (AudienceListServiceBusinessManagerAudienceList) o;
    return Objects.equals(this.lineAudienceGroupId, audienceListServiceBusinessManagerAudienceList.lineAudienceGroupId) &&
        Objects.equals(this.lineAudienceGroupType, audienceListServiceBusinessManagerAudienceList.lineAudienceGroupType) &&
        Objects.equals(this.lineAudienceGroupOwnerType, audienceListServiceBusinessManagerAudienceList.lineAudienceGroupOwnerType) &&
        Objects.equals(this.isZeroOrCurrentlyTotaling, audienceListServiceBusinessManagerAudienceList.isZeroOrCurrentlyTotaling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineAudienceGroupId, lineAudienceGroupType, lineAudienceGroupOwnerType, isZeroOrCurrentlyTotaling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceBusinessManagerAudienceList {\n");
    sb.append("    lineAudienceGroupId: ").append(toIndentedString(lineAudienceGroupId)).append("\n");
    sb.append("    lineAudienceGroupType: ").append(toIndentedString(lineAudienceGroupType)).append("\n");
    sb.append("    lineAudienceGroupOwnerType: ").append(toIndentedString(lineAudienceGroupOwnerType)).append("\n");
    sb.append("    isZeroOrCurrentlyTotaling: ").append(toIndentedString(isZeroOrCurrentlyTotaling)).append("\n");
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


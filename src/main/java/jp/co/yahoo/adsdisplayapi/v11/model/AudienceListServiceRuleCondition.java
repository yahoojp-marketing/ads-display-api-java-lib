/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v11.model.AudienceListServiceCompareOperator;
import jp.co.yahoo.adsdisplayapi.v11.model.AudienceListServiceRuleType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceRuleConditionオブジェクトは、オーディエンスリストに設定可能な条件を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceRuleCondition object displays the possible conditions to set for audience list.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceRuleConditionオブジェクトは、オーディエンスリストに設定可能な条件を表します。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> AudienceListServiceRuleCondition object displays the possible conditions to set for audience list.<br> This field is required in ADD and SET operation. </div> ")
@JsonPropertyOrder({
  AudienceListServiceRuleCondition.JSON_PROPERTY_COMPARE_OPERATOR,
  AudienceListServiceRuleCondition.JSON_PROPERTY_RULE_TYPE,
  AudienceListServiceRuleCondition.JSON_PROPERTY_VALUE
})
@JsonTypeName("AudienceListServiceRuleCondition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceRuleCondition {
  public static final String JSON_PROPERTY_COMPARE_OPERATOR = "compareOperator";
  private AudienceListServiceCompareOperator compareOperator;

  public static final String JSON_PROPERTY_RULE_TYPE = "ruleType";
  private AudienceListServiceRuleType ruleType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public AudienceListServiceRuleCondition() { 
  }

  public AudienceListServiceRuleCondition compareOperator(AudienceListServiceCompareOperator compareOperator) {
    
    this.compareOperator = compareOperator;
    return this;
  }

   /**
   * Get compareOperator
   * @return compareOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPARE_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceCompareOperator getCompareOperator() {
    return compareOperator;
  }


  @JsonProperty(JSON_PROPERTY_COMPARE_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompareOperator(AudienceListServiceCompareOperator compareOperator) {
    this.compareOperator = compareOperator;
  }


  public AudienceListServiceRuleCondition ruleType(AudienceListServiceRuleType ruleType) {
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceRuleType getRuleType() {
    return ruleType;
  }


  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleType(AudienceListServiceRuleType ruleType) {
    this.ruleType = ruleType;
  }


  public AudienceListServiceRuleCondition value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ルールで評価する値です。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。&lt;br&gt; ※ruleTypeがEVENT_TYPEの場合、以下のイベント種別に記載の値のみ指定可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Matching Rules Value. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; ∗If ruleType is EVENT_TYPE, only the values listed in the table below can be specified. &lt;/div&gt; &lt;details&gt;   &lt;summary&gt;     &lt;div lang&#x3D;\&quot;ja\&quot;&gt;イベント種別&lt;/div&gt;     &lt;div lang&#x3D;\&quot;en\&quot;&gt;Event Type&lt;/div&gt;   &lt;/summary&gt;   &lt;table&gt;     &lt;thead&gt;       &lt;tr&gt;         &lt;th&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;イベント種別&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Event Type&lt;/div&gt;         &lt;/th&gt;         &lt;th&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;イベント種別名&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of event type&lt;/div&gt;         &lt;/th&gt;       &lt;/tr&gt;     &lt;/thead&gt;     &lt;tbody&gt;       &lt;tr&gt;         &lt;td&gt;app_install&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリをインストール&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;App install&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;app_launch&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ起動&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;App start&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;app_update&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリをアップデート&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;App update&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;view_listing&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品一覧画面の閲覧&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;View item list&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;view_product&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品詳細画面の閲覧&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;View item description&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;view_cart&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品カートを閲覧&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;View cart&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;add_wishlist&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;お気に入りに追加&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Add to wishlist&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;add_cart&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品カートに追加&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Add to cart&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;check_out&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品購入確認&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Confirm purchasing&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;purchase&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品購入&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Purchase&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;payment_info&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;お支払い明細を発行&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Payment details&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;sign_up&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;登録完了&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Registration complete&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;login&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ログイン&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Login&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;search&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;review&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンテンツをレビュー&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Review contents&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;share&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンテンツをシェア&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Share contents&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;invite&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリへ招待&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Invite to app&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;reservation&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;予約完了&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reservation complete&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;tutorial&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;チュートリアルを完了&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tutorial complete&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;deeplink&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ディープリンクから流入&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Traffic from deep link&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;start_level&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ゲームイベントを開始&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start game event&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;end_level&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ゲームイベントを完了&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;End game event&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;level_achieved&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ゲームのレベル到達&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Level achieved&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;unlock_achievement&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ゲームの目標達成&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Unlock achievement&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;app_purchase&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ内購入&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;App purchasing&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;spent_credits&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クレジットカードの利用&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Credit card&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;custom1&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カスタムイベント1&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Custom event 1&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;custom2&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カスタムイベント2&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Custom event 2&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;custom3&lt;/td&gt;         &lt;td&gt;           &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カスタムイベント3&lt;/div&gt;           &lt;div lang&#x3D;\&quot;en\&quot;&gt;Custom event 3&lt;/div&gt;         &lt;/td&gt;       &lt;/tr&gt;     &lt;/tbody&gt;   &lt;/table&gt; &lt;/details&gt; 
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ルールで評価する値です。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。<br> ※ruleTypeがEVENT_TYPEの場合、以下のイベント種別に記載の値のみ指定可能となります。 </div> <div lang=\"en\"> Matching Rules Value. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.<br> ∗If ruleType is EVENT_TYPE, only the values listed in the table below can be specified. </div> <details>   <summary>     <div lang=\"ja\">イベント種別</div>     <div lang=\"en\">Event Type</div>   </summary>   <table>     <thead>       <tr>         <th>           <div lang=\"ja\">イベント種別</div>           <div lang=\"en\">Event Type</div>         </th>         <th>           <div lang=\"ja\">イベント種別名</div>           <div lang=\"en\">Name of event type</div>         </th>       </tr>     </thead>     <tbody>       <tr>         <td>app_install</td>         <td>           <div lang=\"ja\">アプリをインストール</div>           <div lang=\"en\">App install</div>         </td>       </tr>       <tr>         <td>app_launch</td>         <td>           <div lang=\"ja\">アプリ起動</div>           <div lang=\"en\">App start</div>         </td>       </tr>       <tr>         <td>app_update</td>         <td>           <div lang=\"ja\">アプリをアップデート</div>           <div lang=\"en\">App update</div>         </td>       </tr>       <tr>         <td>view_listing</td>         <td>           <div lang=\"ja\">商品一覧画面の閲覧</div>           <div lang=\"en\">View item list</div>         </td>       </tr>       <tr>         <td>view_product</td>         <td>           <div lang=\"ja\">商品詳細画面の閲覧</div>           <div lang=\"en\">View item description</div>         </td>       </tr>       <tr>         <td>view_cart</td>         <td>           <div lang=\"ja\">商品カートを閲覧</div>           <div lang=\"en\">View cart</div>         </td>       </tr>       <tr>         <td>add_wishlist</td>         <td>           <div lang=\"ja\">お気に入りに追加</div>           <div lang=\"en\">Add to wishlist</div>         </td>       </tr>       <tr>         <td>add_cart</td>         <td>           <div lang=\"ja\">商品カートに追加</div>           <div lang=\"en\">Add to cart</div>         </td>       </tr>       <tr>         <td>check_out</td>         <td>           <div lang=\"ja\">商品購入確認</div>           <div lang=\"en\">Confirm purchasing</div>         </td>       </tr>       <tr>         <td>purchase</td>         <td>           <div lang=\"ja\">商品購入</div>           <div lang=\"en\">Purchase</div>         </td>       </tr>       <tr>         <td>payment_info</td>         <td>           <div lang=\"ja\">お支払い明細を発行</div>           <div lang=\"en\">Payment details</div>         </td>       </tr>       <tr>         <td>sign_up</td>         <td>           <div lang=\"ja\">登録完了</div>           <div lang=\"en\">Registration complete</div>         </td>       </tr>       <tr>         <td>login</td>         <td>           <div lang=\"ja\">ログイン</div>           <div lang=\"en\">Login</div>         </td>       </tr>       <tr>         <td>search</td>         <td>           <div lang=\"ja\">検索</div>           <div lang=\"en\">Search</div>         </td>       </tr>       <tr>         <td>review</td>         <td>           <div lang=\"ja\">コンテンツをレビュー</div>           <div lang=\"en\">Review contents</div>         </td>       </tr>       <tr>         <td>share</td>         <td>           <div lang=\"ja\">コンテンツをシェア</div>           <div lang=\"en\">Share contents</div>         </td>       </tr>       <tr>         <td>invite</td>         <td>           <div lang=\"ja\">アプリへ招待</div>           <div lang=\"en\">Invite to app</div>         </td>       </tr>       <tr>         <td>reservation</td>         <td>           <div lang=\"ja\">予約完了</div>           <div lang=\"en\">Reservation complete</div>         </td>       </tr>       <tr>         <td>tutorial</td>         <td>           <div lang=\"ja\">チュートリアルを完了</div>           <div lang=\"en\">Tutorial complete</div>         </td>       </tr>       <tr>         <td>deeplink</td>         <td>           <div lang=\"ja\">ディープリンクから流入</div>           <div lang=\"en\">Traffic from deep link</div>         </td>       </tr>       <tr>         <td>start_level</td>         <td>           <div lang=\"ja\">ゲームイベントを開始</div>           <div lang=\"en\">Start game event</div>         </td>       </tr>       <tr>         <td>end_level</td>         <td>           <div lang=\"ja\">ゲームイベントを完了</div>           <div lang=\"en\">End game event</div>         </td>       </tr>       <tr>         <td>level_achieved</td>         <td>           <div lang=\"ja\">ゲームのレベル到達</div>           <div lang=\"en\">Level achieved</div>         </td>       </tr>       <tr>         <td>unlock_achievement</td>         <td>           <div lang=\"ja\">ゲームの目標達成</div>           <div lang=\"en\">Unlock achievement</div>         </td>       </tr>       <tr>         <td>app_purchase</td>         <td>           <div lang=\"ja\">アプリ内購入</div>           <div lang=\"en\">App purchasing</div>         </td>       </tr>       <tr>         <td>spent_credits</td>         <td>           <div lang=\"ja\">クレジットカードの利用</div>           <div lang=\"en\">Credit card</div>         </td>       </tr>       <tr>         <td>custom1</td>         <td>           <div lang=\"ja\">カスタムイベント1</div>           <div lang=\"en\">Custom event 1</div>         </td>       </tr>       <tr>         <td>custom2</td>         <td>           <div lang=\"ja\">カスタムイベント2</div>           <div lang=\"en\">Custom event 2</div>         </td>       </tr>       <tr>         <td>custom3</td>         <td>           <div lang=\"ja\">カスタムイベント3</div>           <div lang=\"en\">Custom event 3</div>         </td>       </tr>     </tbody>   </table> </details> ")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceRuleCondition audienceListServiceRuleCondition = (AudienceListServiceRuleCondition) o;
    return Objects.equals(this.compareOperator, audienceListServiceRuleCondition.compareOperator) &&
        Objects.equals(this.ruleType, audienceListServiceRuleCondition.ruleType) &&
        Objects.equals(this.value, audienceListServiceRuleCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareOperator, ruleType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceRuleCondition {\n");
    sb.append("    compareOperator: ").append(toIndentedString(compareOperator)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


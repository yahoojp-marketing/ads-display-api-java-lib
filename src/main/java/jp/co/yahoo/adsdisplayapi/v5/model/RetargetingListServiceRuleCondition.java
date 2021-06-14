package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceCompareOperator;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceRuleType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceRuleConditionオブジェクトは、ターゲットリストに設定可能な条件を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceRuleCondition object displays the possible conditions to set for target list.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceRuleConditionオブジェクトは、ターゲットリストに設定可能な条件を表します。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> RetargetingListServiceRuleCondition object displays the possible conditions to set for target list.<br> This field is required in ADD and SET operation. </div> ")

public class RetargetingListServiceRuleCondition   {
  @JsonProperty("compareOperator")
  private JsonNullable<RetargetingListServiceCompareOperator> compareOperator = JsonNullable.undefined();

  @JsonProperty("ruleType")
  private JsonNullable<RetargetingListServiceRuleType> ruleType = JsonNullable.undefined();

  @JsonProperty("value")
  private JsonNullable<String> value = JsonNullable.undefined();

  public RetargetingListServiceRuleCondition compareOperator(RetargetingListServiceCompareOperator compareOperator) {
    this.compareOperator = JsonNullable.of(compareOperator);
    return this;
  }

  /**
   * Get compareOperator
   * @return compareOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceCompareOperator> getCompareOperator() {
    return compareOperator;
  }

  public void setCompareOperator(JsonNullable<RetargetingListServiceCompareOperator> compareOperator) {
    this.compareOperator = compareOperator;
  }

  public RetargetingListServiceRuleCondition ruleType(RetargetingListServiceRuleType ruleType) {
    this.ruleType = JsonNullable.of(ruleType);
    return this;
  }

  /**
   * Get ruleType
   * @return ruleType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceRuleType> getRuleType() {
    return ruleType;
  }

  public void setRuleType(JsonNullable<RetargetingListServiceRuleType> ruleType) {
    this.ruleType = ruleType;
  }

  public RetargetingListServiceRuleCondition value(String value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * <div lang=\"ja\"> ルールで評価する値です。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。<br> ※ruleTypeがEVENT_TYPEの場合、以下のイベント種別に記載の値のみ指定可能となります。 </div> <div lang=\"en\"> Matching Rules Value. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.<br> ∗If ruleType is EVENT_TYPE, only the values listed in the table below can be specified. </div> <details>   <summary>     <div lang=\"ja\">イベント種別</div>     <div lang=\"en\">Event Type</div>   </summary>   <table>     <thead>       <tr>         <th>           <div lang=\"ja\">イベント種別</div>           <div lang=\"en\">Event Type</div>         </th>         <th>           <div lang=\"ja\">イベント種別名</div>           <div lang=\"en\">Name of event type</div>         </th>       </tr>     </thead>     <tbody>       <tr>         <td>app_install</td>         <td>           <div lang=\"ja\">アプリをインストール</div>           <div lang=\"en\">App install</div>         </td>       </tr>       <tr>         <td>app_launch</td>         <td>           <div lang=\"ja\">アプリ起動</div>           <div lang=\"en\">App start</div>         </td>       </tr>       <tr>         <td>app_update</td>         <td>           <div lang=\"ja\">アプリをアップデート</div>           <div lang=\"en\">App update</div>         </td>       </tr>       <tr>         <td>view_listing</td>         <td>           <div lang=\"ja\">商品一覧画面の閲覧</div>           <div lang=\"en\">View item list</div>         </td>       </tr>       <tr>         <td>view_product</td>         <td>           <div lang=\"ja\">商品詳細画面の閲覧</div>           <div lang=\"en\">View item description</div>         </td>       </tr>       <tr>         <td>view_cart</td>         <td>           <div lang=\"ja\">商品カートを閲覧</div>           <div lang=\"en\">View cart</div>         </td>       </tr>       <tr>         <td>add_wishlist</td>         <td>           <div lang=\"ja\">お気に入りに追加</div>           <div lang=\"en\">Add to wishlist</div>         </td>       </tr>       <tr>         <td>add_cart</td>         <td>           <div lang=\"ja\">商品カートに追加</div>           <div lang=\"en\">Add to cart</div>         </td>       </tr>       <tr>         <td>check_out</td>         <td>           <div lang=\"ja\">商品購入確認</div>           <div lang=\"en\">Confirm purchasing</div>         </td>       </tr>       <tr>         <td>purchase</td>         <td>           <div lang=\"ja\">商品購入</div>           <div lang=\"en\">Purchase</div>         </td>       </tr>       <tr>         <td>payment_info</td>         <td>           <div lang=\"ja\">お支払い明細を発行</div>           <div lang=\"en\">Payment details</div>         </td>       </tr>       <tr>         <td>sign_up</td>         <td>           <div lang=\"ja\">登録完了</div>           <div lang=\"en\">Registration complete</div>         </td>       </tr>       <tr>         <td>login</td>         <td>           <div lang=\"ja\">ログイン</div>           <div lang=\"en\">Login</div>         </td>       </tr>       <tr>         <td>search</td>         <td>           <div lang=\"ja\">検索</div>           <div lang=\"en\">Search</div>         </td>       </tr>       <tr>         <td>review</td>         <td>           <div lang=\"ja\">コンテンツをレビュー</div>           <div lang=\"en\">Review contents</div>         </td>       </tr>       <tr>         <td>share</td>         <td>           <div lang=\"ja\">コンテンツをシェア</div>           <div lang=\"en\">Share contents</div>         </td>       </tr>       <tr>         <td>invite</td>         <td>           <div lang=\"ja\">アプリへ招待</div>           <div lang=\"en\">Invite to app</div>         </td>       </tr>       <tr>         <td>reservation</td>         <td>           <div lang=\"ja\">予約完了</div>           <div lang=\"en\">Reservation complete</div>         </td>       </tr>       <tr>         <td>tutorial</td>         <td>           <div lang=\"ja\">チュートリアルを完了</div>           <div lang=\"en\">Tutorial complete</div>         </td>       </tr>       <tr>         <td>deeplink</td>         <td>           <div lang=\"ja\">ディープリンクから流入</div>           <div lang=\"en\">Traffic from deep link</div>         </td>       </tr>       <tr>         <td>start_level</td>         <td>           <div lang=\"ja\">ゲームイベントを開始</div>           <div lang=\"en\">Start game event</div>         </td>       </tr>       <tr>         <td>end_level</td>         <td>           <div lang=\"ja\">ゲームイベントを完了</div>           <div lang=\"en\">End game event</div>         </td>       </tr>       <tr>         <td>level_achieved</td>         <td>           <div lang=\"ja\">ゲームのレベル到達</div>           <div lang=\"en\">Level achieved</div>         </td>       </tr>       <tr>         <td>unlock_achievement</td>         <td>           <div lang=\"ja\">ゲームの目標達成</div>           <div lang=\"en\">Unlock achievement</div>         </td>       </tr>       <tr>         <td>app_purchase</td>         <td>           <div lang=\"ja\">アプリ内購入</div>           <div lang=\"en\">App purchasing</div>         </td>       </tr>       <tr>         <td>spent_credits</td>         <td>           <div lang=\"ja\">クレジットカードの利用</div>           <div lang=\"en\">Credit card</div>         </td>       </tr>       <tr>         <td>custom1</td>         <td>           <div lang=\"ja\">カスタムイベント1</div>           <div lang=\"en\">Custom event 1</div>         </td>       </tr>       <tr>         <td>custom2</td>         <td>           <div lang=\"ja\">カスタムイベント2</div>           <div lang=\"en\">Custom event 2</div>         </td>       </tr>       <tr>         <td>custom3</td>         <td>           <div lang=\"ja\">カスタムイベント3</div>           <div lang=\"en\">Custom event 3</div>         </td>       </tr>     </tbody>   </table> </details> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ルールで評価する値です。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。<br> ※ruleTypeがEVENT_TYPEの場合、以下のイベント種別に記載の値のみ指定可能となります。 </div> <div lang=\"en\"> Matching Rules Value. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.<br> ∗If ruleType is EVENT_TYPE, only the values listed in the table below can be specified. </div> <details>   <summary>     <div lang=\"ja\">イベント種別</div>     <div lang=\"en\">Event Type</div>   </summary>   <table>     <thead>       <tr>         <th>           <div lang=\"ja\">イベント種別</div>           <div lang=\"en\">Event Type</div>         </th>         <th>           <div lang=\"ja\">イベント種別名</div>           <div lang=\"en\">Name of event type</div>         </th>       </tr>     </thead>     <tbody>       <tr>         <td>app_install</td>         <td>           <div lang=\"ja\">アプリをインストール</div>           <div lang=\"en\">App install</div>         </td>       </tr>       <tr>         <td>app_launch</td>         <td>           <div lang=\"ja\">アプリ起動</div>           <div lang=\"en\">App start</div>         </td>       </tr>       <tr>         <td>app_update</td>         <td>           <div lang=\"ja\">アプリをアップデート</div>           <div lang=\"en\">App update</div>         </td>       </tr>       <tr>         <td>view_listing</td>         <td>           <div lang=\"ja\">商品一覧画面の閲覧</div>           <div lang=\"en\">View item list</div>         </td>       </tr>       <tr>         <td>view_product</td>         <td>           <div lang=\"ja\">商品詳細画面の閲覧</div>           <div lang=\"en\">View item description</div>         </td>       </tr>       <tr>         <td>view_cart</td>         <td>           <div lang=\"ja\">商品カートを閲覧</div>           <div lang=\"en\">View cart</div>         </td>       </tr>       <tr>         <td>add_wishlist</td>         <td>           <div lang=\"ja\">お気に入りに追加</div>           <div lang=\"en\">Add to wishlist</div>         </td>       </tr>       <tr>         <td>add_cart</td>         <td>           <div lang=\"ja\">商品カートに追加</div>           <div lang=\"en\">Add to cart</div>         </td>       </tr>       <tr>         <td>check_out</td>         <td>           <div lang=\"ja\">商品購入確認</div>           <div lang=\"en\">Confirm purchasing</div>         </td>       </tr>       <tr>         <td>purchase</td>         <td>           <div lang=\"ja\">商品購入</div>           <div lang=\"en\">Purchase</div>         </td>       </tr>       <tr>         <td>payment_info</td>         <td>           <div lang=\"ja\">お支払い明細を発行</div>           <div lang=\"en\">Payment details</div>         </td>       </tr>       <tr>         <td>sign_up</td>         <td>           <div lang=\"ja\">登録完了</div>           <div lang=\"en\">Registration complete</div>         </td>       </tr>       <tr>         <td>login</td>         <td>           <div lang=\"ja\">ログイン</div>           <div lang=\"en\">Login</div>         </td>       </tr>       <tr>         <td>search</td>         <td>           <div lang=\"ja\">検索</div>           <div lang=\"en\">Search</div>         </td>       </tr>       <tr>         <td>review</td>         <td>           <div lang=\"ja\">コンテンツをレビュー</div>           <div lang=\"en\">Review contents</div>         </td>       </tr>       <tr>         <td>share</td>         <td>           <div lang=\"ja\">コンテンツをシェア</div>           <div lang=\"en\">Share contents</div>         </td>       </tr>       <tr>         <td>invite</td>         <td>           <div lang=\"ja\">アプリへ招待</div>           <div lang=\"en\">Invite to app</div>         </td>       </tr>       <tr>         <td>reservation</td>         <td>           <div lang=\"ja\">予約完了</div>           <div lang=\"en\">Reservation complete</div>         </td>       </tr>       <tr>         <td>tutorial</td>         <td>           <div lang=\"ja\">チュートリアルを完了</div>           <div lang=\"en\">Tutorial complete</div>         </td>       </tr>       <tr>         <td>deeplink</td>         <td>           <div lang=\"ja\">ディープリンクから流入</div>           <div lang=\"en\">Traffic from deep link</div>         </td>       </tr>       <tr>         <td>start_level</td>         <td>           <div lang=\"ja\">ゲームイベントを開始</div>           <div lang=\"en\">Start game event</div>         </td>       </tr>       <tr>         <td>end_level</td>         <td>           <div lang=\"ja\">ゲームイベントを完了</div>           <div lang=\"en\">End game event</div>         </td>       </tr>       <tr>         <td>level_achieved</td>         <td>           <div lang=\"ja\">ゲームのレベル到達</div>           <div lang=\"en\">Level achieved</div>         </td>       </tr>       <tr>         <td>unlock_achievement</td>         <td>           <div lang=\"ja\">ゲームの目標達成</div>           <div lang=\"en\">Unlock achievement</div>         </td>       </tr>       <tr>         <td>app_purchase</td>         <td>           <div lang=\"ja\">アプリ内購入</div>           <div lang=\"en\">App purchasing</div>         </td>       </tr>       <tr>         <td>spent_credits</td>         <td>           <div lang=\"ja\">クレジットカードの利用</div>           <div lang=\"en\">Credit card</div>         </td>       </tr>       <tr>         <td>custom1</td>         <td>           <div lang=\"ja\">カスタムイベント1</div>           <div lang=\"en\">Custom event 1</div>         </td>       </tr>       <tr>         <td>custom2</td>         <td>           <div lang=\"ja\">カスタムイベント2</div>           <div lang=\"en\">Custom event 2</div>         </td>       </tr>       <tr>         <td>custom3</td>         <td>           <div lang=\"ja\">カスタムイベント3</div>           <div lang=\"en\">Custom event 3</div>         </td>       </tr>     </tbody>   </table> </details> ")


  public JsonNullable<String> getValue() {
    return value;
  }

  public void setValue(JsonNullable<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRuleCondition retargetingListServiceRuleCondition = (RetargetingListServiceRuleCondition) o;
    return Objects.equals(this.compareOperator, retargetingListServiceRuleCondition.compareOperator) &&
        Objects.equals(this.ruleType, retargetingListServiceRuleCondition.ruleType) &&
        Objects.equals(this.value, retargetingListServiceRuleCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareOperator, ruleType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRuleCondition {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceCategoryは、トラッキング対象のコンバージョン設定のカテゴリーです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceCategory is a category for ConversionTracker.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NONE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;None&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFAULT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;その他です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Other&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAGE_VIEW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;主要なページの閲覧です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Main page view&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PURCHASE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;購入販売です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Purchase / Sales&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SIGNUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;契約です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Sign up&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LEAD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;販売促進です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Sales promotion&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DOWNLOAD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリをインストールです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Install app&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP_LAUNCH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリを起動です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;App start&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP_UPDATE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリをアップデートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Update app&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SIGN_UP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;登録完了です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Registration complete&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LOGIN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ログインです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Sign in&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SEARCH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;検索です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Search&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;VIEW_LISTING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;商品一覧画面の閲覧です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;View item list&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;VIEW_PRODUCT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;商品詳細画面の閲覧です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;View item description&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;VIEW_CART&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;商品カートを閲覧です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Viewing cart&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADD_CART&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;商品カートに追加です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Add to cart&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADD_WISHLIST&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;お気に入りに追加です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Add to favorites&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CHECK_OUT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;商品購入確認です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Confirm purchase&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PRODUCT_PURCHASE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリ内商品購入です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;In-app product purchase&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP_PURCHASE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリ内購入です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;In-app purchase&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SPENT_CREDITS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クレジットカードの利用です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Credit card&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAYMENT_INFO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;お支払い明細を発行です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Payment details&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REVIEW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンテンツをレビューです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Review contents&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SHARE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンテンツをシェアです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Share contents&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INVITE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリへ招待です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Invite to app&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RESERVATION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;予約完了です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reservation complete&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TUTORIAL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;チュートリアルを完了です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Tutorial complete&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEEPLINK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ディープリンクから流入です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Traffic from deep link&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;START_LEVEL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ゲームイベントを開始です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Start game event&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;END_LEVEL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ゲームイベントを完了です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Complete game event&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LEVEL_ACHIEVED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ゲームのレベル到達です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Achieve game level&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNLOCK_ACHIEVEMENT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ゲームの目標達成です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unlock achievement&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOM1&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カスタムイベント1です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Custom event 1&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOM2&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カスタムイベント2です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Custom event 2&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOM3&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カスタムイベント3です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Custom event 3&lt;/span&gt;&lt;/dd&gt;    &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ConversionTrackerServiceCategory {
  
  NONE("NONE"),
  
  DEFAULT("DEFAULT"),
  
  PAGE_VIEW("PAGE_VIEW"),
  
  PURCHASE("PURCHASE"),
  
  SIGNUP("SIGNUP"),
  
  LEAD("LEAD"),
  
  DOWNLOAD("DOWNLOAD"),
  
  APP_LAUNCH("APP_LAUNCH"),
  
  APP_UPDATE("APP_UPDATE"),
  
  SIGN_UP("SIGN_UP"),
  
  LOGIN("LOGIN"),
  
  SEARCH("SEARCH"),
  
  VIEW_LISTING("VIEW_LISTING"),
  
  VIEW_PRODUCT("VIEW_PRODUCT"),
  
  VIEW_CART("VIEW_CART"),
  
  ADD_CART("ADD_CART"),
  
  ADD_WISHLIST("ADD_WISHLIST"),
  
  CHECK_OUT("CHECK_OUT"),
  
  PRODUCT_PURCHASE("PRODUCT_PURCHASE"),
  
  APP_PURCHASE("APP_PURCHASE"),
  
  SPENT_CREDITS("SPENT_CREDITS"),
  
  PAYMENT_INFO("PAYMENT_INFO"),
  
  REVIEW("REVIEW"),
  
  SHARE("SHARE"),
  
  INVITE("INVITE"),
  
  RESERVATION("RESERVATION"),
  
  TUTORIAL("TUTORIAL"),
  
  DEEPLINK("DEEPLINK"),
  
  START_LEVEL("START_LEVEL"),
  
  END_LEVEL("END_LEVEL"),
  
  LEVEL_ACHIEVED("LEVEL_ACHIEVED"),
  
  UNLOCK_ACHIEVEMENT("UNLOCK_ACHIEVEMENT"),
  
  CUSTOM1("CUSTOM1"),
  
  CUSTOM2("CUSTOM2"),
  
  CUSTOM3("CUSTOM3"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceCategory(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionTrackerServiceCategory fromValue(String value) {
    for (ConversionTrackerServiceCategory b : ConversionTrackerServiceCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


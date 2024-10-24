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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceButtonTextはボタンテキストを表します。&lt;br&gt; このフィールドは、dynamicDisplayAd、responsiveAd配下では省略可能となります。その際、dynamicDisplayAd配下では、ADD時のデフォルト設定値はFOR_MORE_INFOとなります。&lt;br&gt; また、responsiveGainFriendsAd配下では、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceButtonText displays the button text.&lt;br&gt; This field will be optional under dynamicDisplayAd and responsiveAd. In these cases, under dynamicAd, the default value in ADD operation will be FOR_MORE_INFO.&lt;br&gt; Under responsiveGainFriendsAd, although this field will be returned in the response,it will be ignored on input. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INSTALL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「インストール」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Install.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MORE_DETAIL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「詳しくはこちら」ボタンです。（デフォルト値です）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;More detail.&amp;#34; button.（Default）&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONFIRM_PROPERTY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「物件を見る」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Confirm property.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DOWNLOAD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「ダウンロード」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Download.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REGISTER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「ご登録はこちら」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Register here.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PURCHASE_NOW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「今すぐ購入」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Buy now.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REQUEST_INFO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「資料請求」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Request information.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RESERVE_NOW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「今すぐ予約」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Reserve now.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REGISTER_NOW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「今すぐ登録」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Register now.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EXPERIENCE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「体験する」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Experience.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RESERVE_HERE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「ご予約はこちら」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Reserve here.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APPLY_NOW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「今すぐ申込む」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Apply now.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FOR_MORE_INFO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「もっとみる」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;More information.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PURCHASE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「ご購入はこちら」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Buy here.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONTACT_US&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「お問い合わせ」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Contact us.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONFIRM_NOW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「今すぐチェック」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Check now.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APPLY_HERE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「お申込みはこちら」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Click here to apply.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GAIN_FRIENDS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「友だち追加」ボタンです。responsiveGainFriendsAdの場合のみ指定できます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Gain friends.&amp;#34; button. This field can only be specified for responsiveGainFriendsAd.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLAY_GAME&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「ゲームプレイ」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Play game.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;USE_APP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「アプリを利用」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Use app.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LISTEN_TO_MUSIC&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「音楽を聴く」ボタンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;Listen to music.&amp;#34; button.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupAdServiceButtonText {
  
  FOR_MORE_INFO("FOR_MORE_INFO"),
  
  CONFIRM_NOW("CONFIRM_NOW"),
  
  APPLY_HERE("APPLY_HERE"),
  
  PURCHASE("PURCHASE"),
  
  EXPERIENCE("EXPERIENCE"),
  
  CONFIRM_PROPERTY("CONFIRM_PROPERTY"),
  
  REQUEST_INFO("REQUEST_INFO"),
  
  DOWNLOAD("DOWNLOAD"),
  
  INSTALL("INSTALL"),
  
  MORE_DETAIL("MORE_DETAIL"),
  
  RESERVE_HERE("RESERVE_HERE"),
  
  REGISTER("REGISTER"),
  
  APPLY_NOW("APPLY_NOW"),
  
  PURCHASE_NOW("PURCHASE_NOW"),
  
  RESERVE_NOW("RESERVE_NOW"),
  
  REGISTER_NOW("REGISTER_NOW"),
  
  CONTACT_US("CONTACT_US"),
  
  GAIN_FRIENDS("GAIN_FRIENDS"),
  
  PLAY_GAME("PLAY_GAME"),
  
  USE_APP("USE_APP"),
  
  LISTEN_TO_MUSIC("LISTEN_TO_MUSIC"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceButtonText(String value) {
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
  public static AdGroupAdServiceButtonText fromValue(String value) {
    for (AdGroupAdServiceButtonText b : AdGroupAdServiceButtonText.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


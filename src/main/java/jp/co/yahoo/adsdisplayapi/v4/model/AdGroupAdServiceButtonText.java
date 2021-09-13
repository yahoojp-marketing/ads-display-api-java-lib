package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupAdServiceButtonTextはボタンテキストを表します。<br> このフィールドは、dynamicAd、responsiveImageAdおよびresponsiveVideoAd配下では省略可能となります。その際、dynamicAd配下では、ADD時のデフォルト設定値はFOR_MORE_INFOとなります。<br> また、staticFrameAd配下では、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupAdServiceButtonText displays the button text.<br> This field will be optional under dynamicAd, responsiveImageAd, and responsiveVideoAd. In these cases, under dynamicAd, the default value in ADD operation will be FOR_MORE_INFO.<br> Under staticFrameAd, although this field will be returned in the response,it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">INSTALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「インストール」ボタンです。</span><span lang=\"en\">&#34;Install.&#34; button.</span></dd>   <dt class=\"term__item\">MORE_DETAIL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「詳しくはこちら」ボタンです。（デフォルト値です）</span><span lang=\"en\">&#34;More detail.&#34; button.（Default）</span></dd>   <dt class=\"term__item\">CONFIRM_PROPERTY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「物件を見る」ボタンです。</span><span lang=\"en\">&#34;Confirm property.&#34; button.</span></dd>   <dt class=\"term__item\">DOWNLOAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「ダウンロード」ボタンです。</span><span lang=\"en\">&#34;Download.&#34; button.</span></dd>   <dt class=\"term__item\">REGISTER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「ご登録はこちら」ボタンです。</span><span lang=\"en\">&#34;Register here.&#34; button.</span></dd>   <dt class=\"term__item\">PURCHASE_NOW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「今すぐ購入」ボタンです。</span><span lang=\"en\">&#34;Buy now.&#34; button.</span></dd>   <dt class=\"term__item\">REQUEST_INFO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「資料請求」ボタンです。</span><span lang=\"en\">&#34;Request information.&#34; button.</span></dd>   <dt class=\"term__item\">RESERVE_NOW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「今すぐ予約」ボタンです。</span><span lang=\"en\">&#34;Reserve now.&#34; button.</span></dd>   <dt class=\"term__item\">REGISTER_NOW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「今すぐ登録」ボタンです。</span><span lang=\"en\">&#34;Register now.&#34; button.</span></dd>   <dt class=\"term__item\">EXPERIENCE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「体験する」ボタンです。</span><span lang=\"en\">&#34;Experience.&#34; button.</span></dd>   <dt class=\"term__item\">RESERVE_HERE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「ご予約はこちら」ボタンです。</span><span lang=\"en\">&#34;Reserve here.&#34; button.</span></dd>   <dt class=\"term__item\">APPLY_NOW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「今すぐ申込む」ボタンです。</span><span lang=\"en\">&#34;Apply now.&#34; button.</span></dd>   <dt class=\"term__item\">FOR_MORE_INFO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「もっとみる」ボタンです。</span><span lang=\"en\">&#34;More information.&#34; button.</span></dd>   <dt class=\"term__item\">PURCHASE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「ご購入はこちら」ボタンです。</span><span lang=\"en\">&#34;Buy here.&#34; button.</span></dd>   <dt class=\"term__item\">CONTACT_US</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「お問い合わせ」ボタンです。</span><span lang=\"en\">&#34;Contact us.&#34; button.</span></dd>   <dt class=\"term__item\">CONFIRM_NOW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「今すぐチェック」ボタンです。</span><span lang=\"en\">&#34;Check now.&#34; button.</span></dd>   <dt class=\"term__item\">APPLY_HERE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「お申込みはこちら」ボタンです。</span><span lang=\"en\">&#34;Click here to apply.&#34; button.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceAdTypeは、広告タイプを表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; なお、選択した配信先デバイスにより、指定可能な広告の文字数は異なる場合があります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceAdType describes the type of ad.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; In addition, the number of available characters of ad creatives vary with selected devices. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TEXT_SHORT_AD2&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「タイトル14文字、説明文19文字」のショートテキスト広告です。&lt;br&gt;モバイルの場合にご利用いただけます。&lt;br&gt;※現在、こちらの広告タイプでは入稿できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Short text ad is &amp;#34;title is 14 characters&amp;#34; and &amp;#34;description is 19 characters&amp;#34;.&lt;br&gt;It is available for Mobile.&lt;br&gt;∗Currently this ad type is not available for ad creation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RESPONSIVE_IMAGE_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;配信される広告表示枠の形に合わせて画像のサイズ変更およびトリミングが行われるレスポンシブ広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Responsive Ad which flexibly adjusts its image size and trimmed to the size of ad place.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;STATIC_FRAME_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;配信される広告表示枠の形に合わせて3種類のレイアウトが利用可能な広告枠サイズ固定広告です。&lt;br&gt;※現在、こちらの広告タイプでは入稿できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Static frame ad which flexibly adjusts to 3 layout types to the size of ad place.&lt;br&gt;*Currently this ad type is not available for ad creation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BANNER_VIDEO_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;動画で構成される広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad composed of video.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RESPONSIVE_VIDEO_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;入稿内容（テキスト、動画、ボタンなど）の構成要素を組み合わせ、多様なデバイスや広告掲載面に対応したクリエイティブを表示できる広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Video ad which displays a specified video on the ad place.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DYNAMIC_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ウェブサイトや表示するデバイスに合わせて、画像の大きさや商品の組み合わせなど、さまざまな形式で商品を表示する広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Dynamic ad which displays products in various formats, such as image size or product combination according to website and device to be displayed.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TEXT_LONG_AD1&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「タイトル15文字、説明文19文字-19文字」のテキスト広告です。PC、スマートフォン・タブレット端末の場合にご利用いただけます。（推奨）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Text ad is &amp;#34;title is 15 characters&amp;#34; and &amp;#34;description is 19 characters / 19 characters&amp;#34;.&lt;br&gt;It is available for PC, Smartphone and Tablet. (Recommended)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TEXT_SHORT_AD1&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「タイトル12文字、説明文12文字」のショートテキスト広告です。&lt;br&gt;モバイルの場合にご利用いただけます。&lt;br&gt;※現在、こちらの広告タイプでは入稿できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Short text ad is &amp;#34;title is 12 characters&amp;#34; and &amp;#34;description is 12 characters&amp;#34;.&lt;br&gt;It is available for Mobile.&lt;br&gt;∗Currently this ad type is not available for ad creation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BANNER_IMAGE_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;画像で構成される広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad composed of image.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;POS_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「説明文33文字」の掲載位置指定テキストです。&lt;br&gt;※現在、こちらの広告タイプでは入稿できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Positioning text is &amp;#34;description is 33 characters&amp;#34;.&lt;br&gt;*Currently this ad type is not available for ad creation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAROUSEL_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カルーセル広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Carousel ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupAdServiceAdType {
  
  TEXT_LONG_AD1("TEXT_LONG_AD1"),
  
  TEXT_SHORT_AD1("TEXT_SHORT_AD1"),
  
  TEXT_SHORT_AD2("TEXT_SHORT_AD2"),
  
  POS_AD("POS_AD"),
  
  RESPONSIVE_IMAGE_AD("RESPONSIVE_IMAGE_AD"),
  
  STATIC_FRAME_AD("STATIC_FRAME_AD"),
  
  RESPONSIVE_VIDEO_AD("RESPONSIVE_VIDEO_AD"),
  
  DYNAMIC_AD("DYNAMIC_AD"),
  
  BANNER_IMAGE_AD("BANNER_IMAGE_AD"),
  
  BANNER_VIDEO_AD("BANNER_VIDEO_AD"),
  
  CAROUSEL_AD("CAROUSEL_AD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceAdType(String value) {
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
  public static AdGroupAdServiceAdType fromValue(String value) {
    for (AdGroupAdServiceAdType b : AdGroupAdServiceAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


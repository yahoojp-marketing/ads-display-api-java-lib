package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupAdServiceAdTypeは、広告タイプを表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> なお、選択した配信先デバイスにより、指定可能な広告の文字数は異なる場合があります。 </div> <div lang=\"en\"> AdGroupAdServiceAdType describes the type of ad.<br> This field is required in ADD operation, and will be optional in SET operation.<br> In addition, the number of available characters of ad creatives vary with selected devices. </div> <dl class=term>   <dt class=\"term__item\">TEXT_SHORT_AD2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「タイトル14文字、説明文19文字」のショートテキスト広告です。<br>モバイルの場合にご利用いただけます。<br>※現在、こちらの広告タイプでは入稿できません。</span><span lang=\"en\">Short text ad is &#34;title is 14 characters&#34; and &#34;description is 19 characters&#34;.<br>It is available for Mobile.<br>∗Currently this ad type is not available for ad creation.</span></dd>   <dt class=\"term__item\">RESPONSIVE_IMAGE_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信される広告表示枠の形に合わせて画像のサイズ変更およびトリミングが行われるレスポンシブ広告です。</span><span lang=\"en\">Responsive Ad which flexibly adjusts its image size and trimmed to the size of ad place.</span></dd>   <dt class=\"term__item\">STATIC_FRAME_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信される広告表示枠の形に合わせて3種類のレイアウトが利用可能な広告枠サイズ固定広告です。</span><span lang=\"en\">Static frame ad which flexibly adjusts to 3 layout types to the size of ad place.</span></dd>   <dt class=\"term__item\">BANNER_VIDEO_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動画で構成される広告です。</span><span lang=\"en\">Ad composed of video.</span></dd>   <dt class=\"term__item\">RESPONSIVE_VIDEO_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入稿内容（テキスト、動画、ボタンなど）の構成要素を組み合わせ、多様なデバイスや広告掲載面に対応したクリエイティブを表示できる広告です。</span><span lang=\"en\">Video ad which displays a specified video on the ad place.</span></dd>   <dt class=\"term__item\">DYNAMIC_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブサイトや表示するデバイスに合わせて、画像の大きさや商品の組み合わせなど、さまざまな形式で商品を表示する広告です。</span><span lang=\"en\">Dynamic ad which displays products in various formats, such as image size or product combination according to website and device to be displayed.</span></dd>   <dt class=\"term__item\">TEXT_LONG_AD1</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「タイトル15文字、説明文19文字-19文字」のテキスト広告です。PC、スマートフォン・タブレット端末の場合にご利用いただけます。（推奨）</span><span lang=\"en\">Text ad is &#34;title is 15 characters&#34; and &#34;description is 19 characters / 19 characters&#34;.<br>It is available for PC, Smartphone and Tablet. (Recommended)</span></dd>   <dt class=\"term__item\">TEXT_LONG_AD2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「タイトル15文字、説明文33文字」のテキスト広告です。<br>PC、スマートフォン・タブレット端末の場合にご利用頂けます。</span><span lang=\"en\">Text ad is &#34;title is 15 characters&#34; and &#34;description is 33 characters&#34;.<br>It is available for PC, Smartphone and Tablet.</span></dd>   <dt class=\"term__item\">TEXT_SHORT_AD1</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「タイトル12文字、説明文12文字」のショートテキスト広告です。<br>モバイルの場合にご利用いただけます。<br>※現在、こちらの広告タイプでは入稿できません。</span><span lang=\"en\">Short text ad is &#34;title is 12 characters&#34; and &#34;description is 12 characters&#34;.<br>It is available for Mobile.<br>∗Currently this ad type is not available for ad creation.</span></dd>   <dt class=\"term__item\">BANNER_IMAGE_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">画像で構成される広告です。</span><span lang=\"en\">Ad composed of image.</span></dd>   <dt class=\"term__item\">POS_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「説明文33文字」の掲載位置指定テキストです。</span><span lang=\"en\">Positioning text is &#34;description is 33 characters&#34;.</span></dd>   <dt class=\"term__item\">CAROUSEL_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カルーセル広告です。こちらは現在指定することができません。</span><span lang=\"en\">Carousel ad. Currently, this cannot be specified.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceAdType {
  
  TEXT_LONG_AD1("TEXT_LONG_AD1"),
  
  TEXT_LONG_AD2("TEXT_LONG_AD2"),
  
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


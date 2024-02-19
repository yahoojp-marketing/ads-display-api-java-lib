/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceAdTypeは、広告タイプを表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceAdType describes the type of ad.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BANNER_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;バナー広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Banner ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAROUSEL_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カルーセル広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Carousel ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INSTREAM_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;インストリーム広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;In-stream ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BRANDPANEL_QUINTIE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ブランドパネル クインティ広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Brand Panel Quintuple ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BRANDPANEL_PANORAMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ブランドパネル パノラマ広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Brand Panel Panorama ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BRANDPANEL_PANORAMA_PANEL_SWITCH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ブランドパネル パノラマ パネルスイッチ広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Brand Panel Panorama Panel-switch ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_IMPACT_SQUARE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップインパクト スクエア広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Impact Square ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_IMPACT_QUINTIE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップインパクト クインティ広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Impact Quintuple ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_IMPACT_PANORAMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップインパクト パノラマ広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Impact Panorama ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_IMPACT_PANORAMA_SIDE_VISION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップインパクト パノラマ サイドビジョン広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Impact Panorama Side Vision ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_IMPACT_PANORAMA_SIDE_SWITCH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップインパクト パノラマ サイドスイッチ広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Impact Panorama Side Switch ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_IMPACT_THEATER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップインパクト シアター広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Impact Theater ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_IMPACT_PRIME_DISPLAY_DOUBLE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップインパクト プライムディスプレイ ダブル広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Impact Prime Display Double ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_IMPACT_PANORAMA_PANEL_SWITCH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップインパクト パノラマ サイドスイッチ広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Impact Panorama Side Switch ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_PAGE_TOPICS_PR&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トップページ トピックスPR広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top Page Topics PR ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum GuaranteedAdGroupAdServiceAdType {
  
  BANNER_AD("BANNER_AD"),
  
  CAROUSEL_AD("CAROUSEL_AD"),
  
  INSTREAM_AD("INSTREAM_AD"),
  
  BRANDPANEL_QUINTIE("BRANDPANEL_QUINTIE"),
  
  BRANDPANEL_PANORAMA("BRANDPANEL_PANORAMA"),
  
  BRANDPANEL_PANORAMA_PANEL_SWITCH("BRANDPANEL_PANORAMA_PANEL_SWITCH"),
  
  TOP_IMPACT_SQUARE("TOP_IMPACT_SQUARE"),
  
  TOP_IMPACT_QUINTIE("TOP_IMPACT_QUINTIE"),
  
  TOP_IMPACT_THEATER("TOP_IMPACT_THEATER"),
  
  TOP_IMPACT_PRIME_DISPLAY_DOUBLE("TOP_IMPACT_PRIME_DISPLAY_DOUBLE"),
  
  TOP_IMPACT_PANORAMA("TOP_IMPACT_PANORAMA"),
  
  TOP_IMPACT_PANORAMA_SIDE_VISION("TOP_IMPACT_PANORAMA_SIDE_VISION"),
  
  TOP_IMPACT_PANORAMA_SIDE_SWITCH("TOP_IMPACT_PANORAMA_SIDE_SWITCH"),
  
  TOP_IMPACT_PANORAMA_PANEL_SWITCH("TOP_IMPACT_PANORAMA_PANEL_SWITCH"),
  
  TOP_PAGE_TOPICS_PR("TOP_PAGE_TOPICS_PR"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedAdGroupAdServiceAdType(String value) {
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
  public static GuaranteedAdGroupAdServiceAdType fromValue(String value) {
    for (GuaranteedAdGroupAdServiceAdType b : GuaranteedAdGroupAdServiceAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


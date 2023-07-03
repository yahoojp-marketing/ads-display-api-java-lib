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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceCampaignBiddingStrategyTypeは、キャンペーン入札戦略タイプの設定を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceCampaignBiddingStrategyType serves setting of Campaign bid strategy type.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CONVERSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン数最大化&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize conversion&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CLICKS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クリック数最大化&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize clicks&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_VIDEO_VIEWS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ビュー数最大化&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize video views&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_VIEWABLE_IMPRESSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ビューアブルインプレッション数最大化&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize vimps&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;VCPM&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;最大入札価格指定（vCPM）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Max. bid value (vCPM)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CPC&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;最大入札価格指定（CPC）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Max. bid value (CPC)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CPV&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;最大入札価格指定（CPV）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Max. bid value(CPV)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupServiceCampaignBiddingStrategyType {
  
  MAXIMIZE_CONVERSIONS("MAXIMIZE_CONVERSIONS"),
  
  MAXIMIZE_CLICKS("MAXIMIZE_CLICKS"),
  
  MAXIMIZE_VIDEO_VIEWS("MAXIMIZE_VIDEO_VIEWS"),
  
  MAXIMIZE_VIEWABLE_IMPRESSIONS("MAXIMIZE_VIEWABLE_IMPRESSIONS"),
  
  VCPM("VCPM"),
  
  CPC("CPC"),
  
  CPV("CPV"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceCampaignBiddingStrategyType(String value) {
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
  public static AdGroupServiceCampaignBiddingStrategyType fromValue(String value) {
    for (AdGroupServiceCampaignBiddingStrategyType b : AdGroupServiceCampaignBiddingStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


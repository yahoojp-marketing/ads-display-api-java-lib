/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RecommendationServiceTypeは、最適化提案の種別です。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RecommendationServiceType is a type of Recommendations.&lt;br&gt; This field is required in requests. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DAILY_BUDGET_OVER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;1日の予算上限に達したキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that reached the daily budget.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IMPRESSION_SHARE_BUDGET_LOSS_OVER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;インプレッションシェア損失率（予算）が大きいキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that have a large lost impression share (budget).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BID_STRATEGY_TO_TARGET_CPA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（コンバージョン単価の目標値）に適しているキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that are suitable for using autobidding (target CPA).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SEARCH_KEYWORD_LIST_IDEA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;追加を推奨するサーチキーワードです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Recommended search keywords to add.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGNS_FOR_ADDING_ADS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;入稿していない画像サイズが存在するキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns with an image size that have not been submitted.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CONVERSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（コンバージョン数の最大化）への変更が推奨されるキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign that is recommended to change to Auto Bidding Type \&quot;Maximize Conversions\&quot;.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CLICKS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（クリック数の最大化）への変更が推奨されるキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign that is recommended to change to Auto Bidding type \&quot;Maximize Clicks\&quot;.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_VIDEO_VIEWS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（動画再生数の最大化）への変更が推奨されるキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign that is recommended to change to Auto Bidding type \&quot;Maximize video views\&quot;.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum RecommendationServiceType {
  
  DAILY_BUDGET_OVER("DAILY_BUDGET_OVER"),
  
  IMPRESSION_SHARE_BUDGET_LOSS_OVER("IMPRESSION_SHARE_BUDGET_LOSS_OVER"),
  
  BID_STRATEGY_TO_TARGET_CPA("BID_STRATEGY_TO_TARGET_CPA"),
  
  SEARCH_KEYWORD_LIST_IDEA("SEARCH_KEYWORD_LIST_IDEA"),
  
  CAMPAIGNS_FOR_ADDING_ADS("CAMPAIGNS_FOR_ADDING_ADS"),
  
  MAXIMIZE_CONVERSIONS("MAXIMIZE_CONVERSIONS"),
  
  MAXIMIZE_CLICKS("MAXIMIZE_CLICKS"),
  
  MAXIMIZE_VIDEO_VIEWS("MAXIMIZE_VIDEO_VIEWS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RecommendationServiceType(String value) {
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
  public static RecommendationServiceType fromValue(String value) {
    for (RecommendationServiceType b : RecommendationServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


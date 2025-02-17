/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RecommendationServiceTypeは、最適化提案の種別です。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RecommendationServiceType is a type of Recommendations.&lt;br&gt; This field is required in requests. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DAILY_BUDGET_OVER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;1日の予算上限に達したキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that reached the daily budget.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IMPRESSION_SHARE_BUDGET_LOSS_OVER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;インプレッションシェア損失率（予算）が大きいキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that have a large lost impression share (budget).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BID_STRATEGY_TO_TARGET_CPA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（コンバージョン単価の目標値）に適しているキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that are suitable for using autobidding (target CPA).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SEARCH_KEYWORD_LIST_IDEA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;追加を推奨するサーチキーワードです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Recommended search keywords to add.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CONVERSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（コンバージョン数の最大化）への変更が推奨されるキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign that is recommended to change to Auto Bidding Type \&quot;Maximize Conversions.\&quot;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CLICKS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（クリック数の最大化）への変更が推奨されるキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign that is recommended to change to Auto Bidding type \&quot;Maximize Clicks.\&quot;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_VIDEO_VIEWS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（動画再生数の最大化）への変更が推奨されるキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign that is recommended to change to Auto Bidding type \&quot;Maximize video views.\&quot;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_VIEWABLE_IMPRESSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札（ビューアブルインプレッション数の最大化）への変更が推奨されるキャンペーンです。※現在利用できません&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign that is recommended to change to Auto Bidding type \&quot;Maximize Vimps.\&quot; * Not Available.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ENHANCED_CPC&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;拡張クリック単価への変更が推奨されるキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign that is recommended to change to Auto Bidding type \&quot;Enhanced CPC.\&quot;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UPDATE_AD_CREATIVE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;画像・動画の更新が推奨される広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Update your images and videos ads.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DUPLICATE_TARGETING_SETTINGS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ターゲティング設定が重複している広告グループです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad groups with duplicate targeting settings.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;特定の広告タイプと画像サイズを組み合わせた広告が3～5つ以外の広告グループです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad groups that have other than 3-5 ads that combine a specific ad type and image size.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADGROUPS_FOR_ADDING_ADS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;入稿を推奨する画像サイズがある広告グループです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad groups with recommended image sizes.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DAILY_BUDGET_SMALL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;1日の予算が5,000円未満のキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns with less than 5,000 JPY daily budget.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INSUFFICIENT_TARGETING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ターゲットを絞り込みすぎているキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that too narrow down the targeting.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INSUFFICIENT_AD_SCHEDULE_TARGETING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;配信可能時間が6時間未満の曜日があるキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that have days of the week with less than six hours available for ad delivery.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INSUFFICIENT_CONVERSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン数が少ないキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that need to increase conversions.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INSUFFICIENT_CLICKS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クリック数が少ないキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that need to increase clicks.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INSUFFICIENT_VIDEO_VIEWS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;動画再生数が少ないキャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaigns that need to increase video views.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CREATE_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンの作成を推奨します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Creating campaigns is recommended.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CREATE_AD_GROUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループの作成を推奨します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Creating ad groups is recommended.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CREATE_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告の作成を推奨します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Creating ads is recommended.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CREATE_RESPONSIVE_DISPLAY_ADS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;レスポンシブディプレイ広告の作成を推奨します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Creating Responsive Ads for Display is recommended.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TURN_YOUR_ACCOUNT_ON&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アカウントの配信設定をオンにしましょう。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Turn your account on.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TURN_YOUR_AD_ON&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告の配信設定をオンにしましょう。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Turn your ad on.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INSUFFICIENT_ACCOUNT_BALANCE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アカウント残高が少なくなっています。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Your account balance is low.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum RecommendationServiceType {
  
  DAILY_BUDGET_OVER("DAILY_BUDGET_OVER"),
  
  IMPRESSION_SHARE_BUDGET_LOSS_OVER("IMPRESSION_SHARE_BUDGET_LOSS_OVER"),
  
  BID_STRATEGY_TO_TARGET_CPA("BID_STRATEGY_TO_TARGET_CPA"),
  
  SEARCH_KEYWORD_LIST_IDEA("SEARCH_KEYWORD_LIST_IDEA"),
  
  MAXIMIZE_CONVERSIONS("MAXIMIZE_CONVERSIONS"),
  
  MAXIMIZE_CLICKS("MAXIMIZE_CLICKS"),
  
  MAXIMIZE_VIDEO_VIEWS("MAXIMIZE_VIDEO_VIEWS"),
  
  MAXIMIZE_VIEWABLE_IMPRESSIONS("MAXIMIZE_VIEWABLE_IMPRESSIONS"),
  
  ENHANCED_CPC("ENHANCED_CPC"),
  
  UPDATE_AD_CREATIVE("UPDATE_AD_CREATIVE"),
  
  DUPLICATE_TARGETING_SETTINGS("DUPLICATE_TARGETING_SETTINGS"),
  
  NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE("NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE"),
  
  ADGROUPS_FOR_ADDING_ADS("ADGROUPS_FOR_ADDING_ADS"),
  
  DAILY_BUDGET_SMALL("DAILY_BUDGET_SMALL"),
  
  INSUFFICIENT_TARGETING("INSUFFICIENT_TARGETING"),
  
  INSUFFICIENT_AD_SCHEDULE_TARGETING("INSUFFICIENT_AD_SCHEDULE_TARGETING"),
  
  INSUFFICIENT_CONVERSIONS("INSUFFICIENT_CONVERSIONS"),
  
  INSUFFICIENT_CLICKS("INSUFFICIENT_CLICKS"),
  
  INSUFFICIENT_VIDEO_VIEWS("INSUFFICIENT_VIDEO_VIEWS"),
  
  CREATE_CAMPAIGN("CREATE_CAMPAIGN"),
  
  CREATE_AD_GROUP("CREATE_AD_GROUP"),
  
  CREATE_AD("CREATE_AD"),
  
  CREATE_RESPONSIVE_DISPLAY_ADS("CREATE_RESPONSIVE_DISPLAY_ADS"),
  
  TURN_YOUR_ACCOUNT_ON("TURN_YOUR_ACCOUNT_ON"),
  
  TURN_YOUR_AD_ON("TURN_YOUR_AD_ON"),
  
  INSUFFICIENT_ACCOUNT_BALANCE("INSUFFICIENT_ACCOUNT_BALANCE"),
  
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


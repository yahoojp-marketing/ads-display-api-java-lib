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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AbTestServiceStatusは、A/Bテストのステータスを表します。&lt;br&gt; このフィールドはリクエストの際には無視されます。&lt;br&gt; GET時のみレスポンスの際に返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; It shows AbTestServiceStatus status.&lt;br&gt; This field will be ignored on input.&lt;br&gt; This field will be returned in the GET response only. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PENDING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;開始前&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Planned&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PENDING_UNBALANCED_CAMPAIGN_BUDGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;開始前 予算が均等ではない&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Planned. Budget isn&#39;t even.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PENDING_DEACTIVATED_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;開始前 1つ以上のキャンペーンが削除されている&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Planned. One or more campaigns deleted.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PENDING_DUPLICATED_CAMPAIGNS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;開始前 2つのキャンペーンが配信中になっている&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Planned. Two campaigns running.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PENDING_PAUSED_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;開始前 1つ以上のキャンペーンが配信オフになっている&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Planned. One or more campaigns turned off.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PENDING_EXPIRED_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;開始前 テスト期間を2つのキャンペーンの配信期間がカバーしていない&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Planned. Test duration doesn&#39;t include two campaigns&#39; durations.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PENDING_DUPLICATED_CAMPAIGNS_EXPECTED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;開始前 2つのキャンペーンがどちらもテスト期間外に配信されるように設定されている&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Planned. Two campaigns won&#39;t run during the test.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACTIVE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;テスト中&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Live&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACTIVE_UNBALANCED_CAMPAIGN_BUDGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;テスト中 予算が均等ではない&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Live. Budget isn&#39;t even.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACTIVE_DEACTIVATED_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;テスト中 1つ以上のキャンペーンが削除されている&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Live. One or more campaigns deleted.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACTIVE_PAUSED_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;テスト中 1つ以上のキャンペーンが配信オフ&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Live. One or more campaigns turned off.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACTIVE_EXPIRED_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;テスト中 テスト期間を2つのキャンペーンの配信期間がカバーしていない&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Live. Test duration doesn&#39;t include two campaigns&#39; durations.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACTIVE_DUPLICATED_CAMPAIGNS_EXPECTED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;テスト中 テスト完了後に2つのキャンペーンがどちらもテスト期間外に配信されるように設定されている&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Live. Two campaigns will run after the test duration.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ENDED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;完了&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Completed&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ENDED_DUPLICATED_CAMPAIGNS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;完了 2つのキャンペーンが配信中になっている&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Completed. Two campaigns running.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ENDED_DUPLICATED_CAMPAIGNS_EXPECTED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;完了 今後2つのキャンペーンがどちらもテスト期間外に配信されるように設定されている&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Completed. Two campaigns won&#39;t run during the test.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AbTestServiceStatus {
  
  PENDING("PENDING"),
  
  PENDING_UNBALANCED_CAMPAIGN_BUDGET("PENDING_UNBALANCED_CAMPAIGN_BUDGET"),
  
  PENDING_DEACTIVATED_CAMPAIGN("PENDING_DEACTIVATED_CAMPAIGN"),
  
  PENDING_DEDUPE("PENDING_DEDUPE"),
  
  PENDING_PAUSED_CAMPAIGN("PENDING_PAUSED_CAMPAIGN"),
  
  PENDING_EXPIRED_CAMPAIGN("PENDING_EXPIRED_CAMPAIGN"),
  
  PENDING_DUPLICATED_CAMPAIGNS_EXPECTED("PENDING_DUPLICATED_CAMPAIGNS_EXPECTED"),
  
  ACTIVE("ACTIVE"),
  
  ACTIVE_UNBALANCED_CAMPAIGN_BUDGET("ACTIVE_UNBALANCED_CAMPAIGN_BUDGET"),
  
  ACTIVE_DEACTIVATED_CAMPAIGN("ACTIVE_DEACTIVATED_CAMPAIGN"),
  
  ACTIVE_PAUSED_CAMPAIGN("ACTIVE_PAUSED_CAMPAIGN"),
  
  ACTIVE_EXPIRED_CAMPAIGN("ACTIVE_EXPIRED_CAMPAIGN"),
  
  ACTIVE_DUPLICATED_CAMPAIGNS_EXPECTED("ACTIVE_DUPLICATED_CAMPAIGNS_EXPECTED"),
  
  ENDED("ENDED"),
  
  ENDED_DUPLICATED_CAMPAIGNS("ENDED_DUPLICATED_CAMPAIGNS"),
  
  ENDED_DUPLICATED_CAMPAIGNS_EXPECTED("ENDED_DUPLICATED_CAMPAIGNS_EXPECTED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AbTestServiceStatus(String value) {
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
  public static AbTestServiceStatus fromValue(String value) {
    for (AbTestServiceStatus b : AbTestServiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


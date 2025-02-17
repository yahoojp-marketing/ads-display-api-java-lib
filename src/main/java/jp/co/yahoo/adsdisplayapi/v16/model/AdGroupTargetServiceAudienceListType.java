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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリスト種別です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Type of audience list.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;COMBINATION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;組み合わせです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Combination.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SIMILARITY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;類似ユーザーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Similar User.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WEBSITE_VISITORS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ウェブサイト訪問ユーザーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Website visitor.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOMER_DATA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;顧客データです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Customer data.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;OFFERED_BY_YAHOO_JAPAN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ヤフー提供データです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Audience list (offered by Yahoo! JAPAN Ads) data.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP_USER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリユーザーデータです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;App users data.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YAHOO_JAPAN_AUDIENCE_DISCOVERY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;Yahoo! Audience Discoveryです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Yahoo! JAPAN Audience Discovery.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADVANCED_SEGMENTS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;高度なセグメントです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Advanced segments.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_ACTION_USERS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告アクションユーザーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad action users.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LINE_OA_FRIEND&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;LINE公式アカウントの友だちです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Friends of LINE Official Account.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LINE_OA_BLOCK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;LINE公式アカウントをブロック中の友だちです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Friends who blocked LINE Official Account.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BUSINESS_MANAGER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ビジネスマネージャーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Business manager.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AFFINITY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;興味関心です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Affinity.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IN_MARKET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;購買意向です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;In-market.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ATTRIBUTE_LIFE_EVENTS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;属性ライフイベントです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Attribute-life-events.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupTargetServiceAudienceListType {
  
  COMBINATION("COMBINATION"),
  
  SIMILARITY("SIMILARITY"),
  
  WEBSITE_VISITORS("WEBSITE_VISITORS"),
  
  CUSTOMER_DATA("CUSTOMER_DATA"),
  
  OFFERED_BY_YAHOO_JAPAN("OFFERED_BY_YAHOO_JAPAN"),
  
  APP_USER("APP_USER"),
  
  YAHOO_JAPAN_AUDIENCE_DISCOVERY("YAHOO_JAPAN_AUDIENCE_DISCOVERY"),
  
  ADVANCED_SEGMENTS("ADVANCED_SEGMENTS"),
  
  AD_ACTION_USERS("AD_ACTION_USERS"),
  
  LINE_OA_FRIEND("LINE_OA_FRIEND"),
  
  LINE_OA_BLOCK("LINE_OA_BLOCK"),
  
  BUSINESS_MANAGER("BUSINESS_MANAGER"),
  
  AFFINITY("AFFINITY"),
  
  IN_MARKET("IN_MARKET"),
  
  ATTRIBUTE_LIFE_EVENTS("ATTRIBUTE_LIFE_EVENTS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupTargetServiceAudienceListType(String value) {
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
  public static AdGroupTargetServiceAudienceListType fromValue(String value) {
    for (AdGroupTargetServiceAudienceListType b : AdGroupTargetServiceAudienceListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


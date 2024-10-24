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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceVideoViewRuleは、動画視聴の条件です。&lt;br&gt; ※AudienceListServiceAdActionTypeがVIDEO_VIEWの場合のみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceVideoViewRule display the rules of video view.&lt;br&gt; ∗This field can be specified only if AudienceListServiceAdActionType is VIDEO VIEW. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;START&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;再生開始&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Start&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLAYED_TO_25&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;25%以上再生&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Played to 25 %&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLAYED_TO_50&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;50%以上再生&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Played to 50 %&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLAYED_TO_75&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;75%以上再生&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Played to 75 %&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLAYED_TO_95&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;95%以上再生&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Played to 95 %&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;COMPLETE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;再生完了&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Complete&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLAYED_TO_3_SEC&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;3秒以上再生&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Played to 3 sec&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PLAYED_TO_10_SEC&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;10秒以上再生&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Played to 10 sec&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AudienceListServiceVideoViewRule {
  
  START("START"),
  
  PLAYED_TO_25("PLAYED_TO_25"),
  
  PLAYED_TO_50("PLAYED_TO_50"),
  
  PLAYED_TO_75("PLAYED_TO_75"),
  
  PLAYED_TO_95("PLAYED_TO_95"),
  
  COMPLETE("COMPLETE"),
  
  PLAYED_TO_3_SEC("PLAYED_TO_3_SEC"),
  
  PLAYED_TO_10_SEC("PLAYED_TO_10_SEC"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceVideoViewRule(String value) {
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
  public static AudienceListServiceVideoViewRule fromValue(String value) {
    for (AudienceListServiceVideoViewRule b : AudienceListServiceVideoViewRule.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


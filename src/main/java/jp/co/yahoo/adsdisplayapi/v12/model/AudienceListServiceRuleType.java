/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceRuleTypeは、ルールタイプのリストの種類を表示します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。&lt;br&gt; ※AudienceListTypeがAPP_USERの場合はLABEL、PAGE_TYPE、CATEGORY_ID、ITEM_ID、EVENT_TYPEのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceRuleType display the type of the rule. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; ∗If audienceListType is APP_USER, this field can be specified only LABEL, PAGE_TYPE,CATEGORY_ID, ITEM_ID, EVENT_TYPE. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;URLを利用したリスト設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;List setting using the URL.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LABEL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カスタムラベルを利用したリスト設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;List setting using the Custom label.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REFERER_URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;参照元URLを利用したリスト設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;List setting using the Referer URL.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAGE_TYPE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ページ種別を利用したリスト設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;List setting using the page type.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ITEM_ID&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;商品IDを利用したリスト設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;List setting using the Item ID.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ITEM_CATEGORY_ID&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アイテムカテゴリーを利用したリスト設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;List setting using the Item category.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EVENT_TYPE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;イベント種別を利用したリスト設定です。audienceListTypeがWEBSITE_VISITORSの場合は指定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;List setting using the event type. It cannot be specified if audienceListType is WEBSITE_VISITORS.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AudienceListServiceRuleType {
  
  URL("URL"),
  
  LABEL("LABEL"),
  
  REFERER_URL("REFERER_URL"),
  
  PAGE_TYPE("PAGE_TYPE"),
  
  ITEM_ID("ITEM_ID"),
  
  ITEM_CATEGORY_ID("ITEM_CATEGORY_ID"),
  
  EVENT_TYPE("EVENT_TYPE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceRuleType(String value) {
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
  public static AudienceListServiceRuleType fromValue(String value) {
    for (AudienceListServiceRuleType b : AudienceListServiceRuleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


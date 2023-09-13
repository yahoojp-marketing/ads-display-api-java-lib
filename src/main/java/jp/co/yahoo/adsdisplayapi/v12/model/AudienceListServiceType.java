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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceTypeは、オーディエンスリストの種別を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;br&gt; ただし、ADD時にDEFAULT_LISTおよびYAHOO_JAPAN_AUDIENCE_DISCOVERYを指定することはできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceType serves types of audience list. &lt;br&gt; This field is required in ADD and SET operation.&lt;br&gt; However, DEFAULT_LIST and YAHOO_JAPAN_AUDIENCE_DISCOVERY cannot be specified in ADD operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFAULT_LIST&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;デフォルトリストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Default List.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;COMBINATION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;組み合わせです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Combination.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SIMILARITY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;類似ユーザーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Similar User.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WEBSITE_VISITORS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ウェブサイト訪問ユーザーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Website visitor.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOMER_DATA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;顧客データです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Customer data.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP_USER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリユーザーデータです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;App users data.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YAHOO_JAPAN_AUDIENCE_DISCOVERY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;Yahoo! Audience Discoveryです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Yahoo! JAPAN Audience Discovery.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AudienceListServiceType {
  
  DEFAULT_LIST("DEFAULT_LIST"),
  
  COMBINATION("COMBINATION"),
  
  SIMILARITY("SIMILARITY"),
  
  WEBSITE_VISITORS("WEBSITE_VISITORS"),
  
  CUSTOMER_DATA("CUSTOMER_DATA"),
  
  APP_USER("APP_USER"),
  
  YAHOO_JAPAN_AUDIENCE_DISCOVERY("YAHOO_JAPAN_AUDIENCE_DISCOVERY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceType(String value) {
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
  public static AudienceListServiceType fromValue(String value) {
    for (AudienceListServiceType b : AudienceListServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 商品セットの条件に設定できる項目の種別です。&lt;br&gt; ADD時、このフィールドは必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; FeedSetServiceConditionType object describes the type of items available for condition of Item Set.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CATEGORY_ID&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カテゴリーID&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Category ID&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;STOCK_QUANTITY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;在庫数&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Stock quantity&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PRICE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;価格&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Price&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SALE_PRICE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;セール価格&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Sale price&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RATING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;評価&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Rating&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REVIEWS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;評価件数&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Number of reviews&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BADGE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;バッジ種別&lt;br&gt;FeedSetServiceConditionで設定可能な値:&lt;br&gt;&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044683?language&#x3D;ja\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;データフィードのファイルフォーマット&lt;/a&gt;の「商品リストファイルの入力項目」にある「Badge」で利用できる値のみ指定できます。&lt;br&gt;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Type of badge&lt;br&gt;Available values on FeedSetServiceCondition:&lt;br&gt;The values which is available for &amp;#34;Badge&amp;#34; in the &amp;#34;Data feed (item list)&amp;#34; part of the guideline page &amp;#34;&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044683?language&#x3D;en_US\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;Dynamic Ads for Display&lt;/a&gt;&amp;#34; can be specified.&lt;br&gt;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AGE_GROUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;年齢層&lt;br&gt;FeedSetServiceConditionで設定可能な値:&lt;br&gt;&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044683?language&#x3D;ja\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;データフィードのファイルフォーマット&lt;/a&gt;の「商品リストファイルの入力項目」にある「AgeGroup」で利用できる値のみ指定できます。&lt;br&gt;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Age group&lt;br&gt;Available values on FeedSetServiceCondition:&lt;br&gt;The values which is available for &amp;#34;AgeGroup&amp;#34; in the &amp;#34;Data feed (item list)&amp;#34; part of the guideline page &amp;#34;&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044683?language&#x3D;en_US\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;Dynamic Ads for Display&lt;/a&gt;&amp;#34; can be specified.&lt;br&gt;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AVAILABILITY_DATE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;入荷予定日&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Expected arrival date&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GENDER_GROUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;性別&lt;br&gt;FeedSetServiceConditionで設定可能な値:&lt;br&gt;&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044683?language&#x3D;ja\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;データフィードのファイルフォーマット&lt;/a&gt;の「商品リストファイルの入力項目」にある「GenderGroup」で利用できる値のみ指定できます。&lt;br&gt;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Gender group&lt;br&gt;Available values on FeedSetServiceCondition:&lt;br&gt;The values which is available for &amp;#34;GenderGroup&amp;#34; in the &amp;#34;Data feed (item list)&amp;#34; part of the guideline page &amp;#34;&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044683?language&#x3D;en_US\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;Dynamic Ads for Display&lt;/a&gt;&amp;#34; can be specified.&lt;br&gt;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GOOGLE_PRODUCT_CATEGORY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;Google商品カテゴリ&lt;br&gt;FeedSetServiceConditionで設定可能な値:&lt;br&gt;Google商品カテゴリで取得できるGoogle商品カテゴリのidのみ指定できます。&lt;br&gt;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Google product category&lt;br&gt;Available values on FeedSetServiceCondition:&lt;br&gt;Only Google product category ID that can be acquired in Google product category can be specified.&lt;br&gt;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LOCATION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;地域&lt;br&gt;DictionaryServiceGeographicLocationType.FEEDを指定して取得できる地域情報のcodeのみ指定できます。&lt;br&gt;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Location&lt;br&gt;Only the Location information code acquired by declaring DictionaryServiceGeographicLocationType.FEED can be specified.&lt;br&gt;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SALES_RANK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;売上順位&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Sales rank&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum FeedSetServiceConditionType {
  
  CATEGORY_ID("CATEGORY_ID"),
  
  STOCK_QUANTITY("STOCK_QUANTITY"),
  
  PRICE("PRICE"),
  
  SALE_PRICE("SALE_PRICE"),
  
  RATING("RATING"),
  
  REVIEWS("REVIEWS"),
  
  BADGE("BADGE"),
  
  AGE_GROUP("AGE_GROUP"),
  
  AVAILABILITY_DATE("AVAILABILITY_DATE"),
  
  GENDER_GROUP("GENDER_GROUP"),
  
  GOOGLE_PRODUCT_CATEGORY("GOOGLE_PRODUCT_CATEGORY"),
  
  LOCATION("LOCATION"),
  
  SALES_RANK("SALES_RANK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedSetServiceConditionType(String value) {
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
  public static FeedSetServiceConditionType fromValue(String value) {
    for (FeedSetServiceConditionType b : FeedSetServiceConditionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AccountManagementServicePrefectureCodeは、都道府県コードを表します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SET時に無視されます。&lt;br&gt; ※ADD時、client配下では必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AccountManagementServicePrefectureCode describes the code of prefectures.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET operation.&lt;br&gt; * Under &#39;client&#39;, this field will be required in ADD operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;HOKKAIDO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;北海道&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;HOKKAIDO&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AOMORI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;青森県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;AOMORI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IWATE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;岩手県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;IWATE&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MIYAGI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;宮城県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;MIYAGI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AKITA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;秋田県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;AKITA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YAMAGATA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;山形県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;YAMAGATA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FUKUSHIMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;福島県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;FUKUSHIMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IBARAKI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;茨城県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;IBARAKI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOCHIGI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;栃木県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;TOCHIGI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GUNMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;群馬県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;GUNMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SAITAMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;埼玉県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;SAITAMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CHIBA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;千葉県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;CHIBA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOKYO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;東京都&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;TOKYO&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;KANAGAWA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;神奈川県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;KANAGAWA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NIIGATA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;新潟県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;NIIGATA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOYAMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;富山県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;TOYAMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ISHIKAWA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;石川県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;ISHIKAWA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FUKUI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;福井県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;FUKUI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YAMANASHI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;山梨県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;YAMANASHI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NAGANO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;長野県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;NAGANO&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GIFU&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;岐阜県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;GIFU&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SHIZUOKA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;静岡県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;SHIZUOKA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AICHI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;愛知県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;AICHI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MIE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;三重県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;MIE&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SIGA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;滋賀県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;SIGA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;KYOTO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;京都府&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;KYOTO&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;OSAKA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;大阪府&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;OSAKA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;HYOGO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;兵庫県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;HYOGO&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NARA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;奈良県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;NARA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WAKAYAMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;和歌山県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;WAKAYAMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOTTORI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;鳥取県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;TOTTORI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SHIMANE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;島根県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;SHIMANE&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;OKAYAMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;岡山県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;OKAYAMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;HIROSHIMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広島県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;HIROSHIMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YAMAGUCHI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;山口県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;YAMAGUCHI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOKUSHIMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;徳島県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;TOKUSHIMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;KAGAWA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;香川県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;KAGAWA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EHIME&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;愛媛県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;EHIME&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;KOCHI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;高知県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;KOCHI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FUKUOKA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;福岡県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;FUKUOKA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SAGA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;佐賀県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;SAGA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NAGASAKI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;長崎県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;NAGASAKI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;KUMAMOTO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;熊本県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;KUMAMOTO&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;OITA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;大分県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;OITA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MIYAZAKI&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;宮崎県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;MIYAZAKI&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;KAGOSHIMA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;鹿児島県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;KAGOSHIMA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;OKINAWA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;沖縄県&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;OKINAWA&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NONE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未設定&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;NONE&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AccountManagementServicePrefectureCode {
  
  HOKKAIDO("HOKKAIDO"),
  
  AOMORI("AOMORI"),
  
  IWATE("IWATE"),
  
  MIYAGI("MIYAGI"),
  
  AKITA("AKITA"),
  
  YAMAGATA("YAMAGATA"),
  
  FUKUSHIMA("FUKUSHIMA"),
  
  IBARAKI("IBARAKI"),
  
  TOCHIGI("TOCHIGI"),
  
  GUNMA("GUNMA"),
  
  SAITAMA("SAITAMA"),
  
  CHIBA("CHIBA"),
  
  TOKYO("TOKYO"),
  
  KANAGAWA("KANAGAWA"),
  
  NIIGATA("NIIGATA"),
  
  TOYAMA("TOYAMA"),
  
  ISHIKAWA("ISHIKAWA"),
  
  FUKUI("FUKUI"),
  
  YAMANASHI("YAMANASHI"),
  
  NAGANO("NAGANO"),
  
  GIFU("GIFU"),
  
  SHIZUOKA("SHIZUOKA"),
  
  AICHI("AICHI"),
  
  MIE("MIE"),
  
  SIGA("SIGA"),
  
  KYOTO("KYOTO"),
  
  OSAKA("OSAKA"),
  
  HYOGO("HYOGO"),
  
  NARA("NARA"),
  
  WAKAYAMA("WAKAYAMA"),
  
  TOTTORI("TOTTORI"),
  
  SHIMANE("SHIMANE"),
  
  OKAYAMA("OKAYAMA"),
  
  HIROSHIMA("HIROSHIMA"),
  
  YAMAGUCHI("YAMAGUCHI"),
  
  TOKUSHIMA("TOKUSHIMA"),
  
  KAGAWA("KAGAWA"),
  
  EHIME("EHIME"),
  
  KOCHI("KOCHI"),
  
  FUKUOKA("FUKUOKA"),
  
  SAGA("SAGA"),
  
  NAGASAKI("NAGASAKI"),
  
  KUMAMOTO("KUMAMOTO"),
  
  OITA("OITA"),
  
  MIYAZAKI("MIYAZAKI"),
  
  KAGOSHIMA("KAGOSHIMA"),
  
  OKINAWA("OKINAWA"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServicePrefectureCode(String value) {
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
  public static AccountManagementServicePrefectureCode fromValue(String value) {
    for (AccountManagementServicePrefectureCode b : AccountManagementServicePrefectureCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


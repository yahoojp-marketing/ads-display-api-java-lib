/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   AudienceListServiceUploadUserListUploadTypeは、アップロードする方法の種類を表します。&lt;br&gt;   &lt;code&gt;MAIL_ADDRESS&lt;/code&gt;ではハッシュ化が必須となります。&lt;br&gt;   メールアドレスのハッシュ化の詳細は&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044507?language&#x3D;ja\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ヘルプ&lt;/a&gt;を参照してください。&lt;br&gt;   ヘルプに記載の電話番号はレスポンス時にMAIL_ADDRESSに含まれますが、このバージョンでアップロードしてもユーザーサイズは蓄積されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   AudienceListServiceUploadUserListUploadType displays kind of upload method.&lt;br&gt;   Hashing process is requied when AudienceListServiceUploadUserListUploadType is &lt;code&gt;MAIL_ADDRESS&lt;/code&gt;.&lt;br&gt;   More details for hashing of email are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044507?language&#x3D;en_US\&quot;&gt;Import data and create custom list&lt;/a&gt;.&lt;br&gt;   The phone number listed in the Help is included in the MAIL_ADDRESS in the response, but in this version, even if you upload, the user size will not accumulate. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IDFA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;iOS端末用広告識別子です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad identifier for iOS devices.&lt;/span&gt;&lt;/li&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AAID&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;Android端末用広告識別子です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad identifier for Android devices.&lt;/span&gt;&lt;/li&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAIL_ADDRESS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ハッシュ化メールアドレスです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Hashed email address.&lt;/span&gt;&lt;/li&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AudienceListServiceUploadUserListUploadType {
  
  IDFA("IDFA"),
  
  AAID("AAID"),
  
  MAIL_ADDRESS("MAIL_ADDRESS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceUploadUserListUploadType(String value) {
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
  public static AudienceListServiceUploadUserListUploadType fromValue(String value) {
    for (AudienceListServiceUploadUserListUploadType b : AudienceListServiceUploadUserListUploadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


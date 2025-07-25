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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   AudienceListServiceDataConnectionStoppedは、リストが連携停止中かどうかを示します。&lt;br&gt;   連携停止中の顧客データリストにはアップロードできません。&lt;br&gt;   以下は連携停止中の場合にリーチ数が0になります。&lt;br&gt;   - YADリスト&lt;br&gt;   - LINE公式アカウントの友だちリスト&lt;br&gt;   - LINE公式アカウントをブロック中の友だちリスト&lt;br&gt;   &lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   AudienceListServiceDataConnectionStopped shows whether the list is data connection stopped.&lt;br&gt;   You cannot upload to customer data lists with data connection stopped.&lt;br&gt;   The reach count will be 0 for the following lists when data connection is stopped:&lt;br&gt;   - YAD lists&lt;br&gt;   - LINE Official Account friends lists&lt;br&gt;   - LINE Official Account blocked friends lists&lt;br&gt;   &lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; &lt;hr&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;連携停止中です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Stopped&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;連携中です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;In progress&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AudienceListServiceDataConnectionStopped {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceDataConnectionStopped(String value) {
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
  public static AudienceListServiceDataConnectionStopped fromValue(String value) {
    for (AudienceListServiceDataConnectionStopped b : AudienceListServiceDataConnectionStopped.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceProcessStatusは、動画の処理状況です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServiceProcessStatus display the process status of videos.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PROCESSING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;処理中です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;It is in process.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FINISHED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;処理を完了しました。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The process  has been completed.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FAILED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;処理を失敗しました。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The process failed.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum VideoServiceProcessStatus {
  
  PROCESSING("PROCESSING"),
  
  FINISHED("FINISHED"),
  
  FAILED("FAILED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  VideoServiceProcessStatus(String value) {
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
  public static VideoServiceProcessStatus fromValue(String value) {
    for (VideoServiceProcessStatus b : VideoServiceProcessStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

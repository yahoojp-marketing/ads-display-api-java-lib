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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceJobStatusはアップロードジョブの状態を示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceListServiceJobStatus indicates the status of the upload job.&lt;/div&gt; &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   * ステータスが「RECEIVED」になった後、通常は数時間でユーザーリストの反映が完了します。&lt;br&gt;   * ステータスが「INVALID_FILE」の場合、ファイル内容やデータ数に問題がある、ファイルフォーマットが間違っている、あるいはファイルサイズが上限（1,073,741,824 byte）を超えています。詳細は&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044507?language&#x3D;ja\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ヘルプ&lt;/a&gt;を参照してください。&lt;br&gt;   * ステータスが「FAILED」の場合、ファイル内容以外に起因する問題でジョブが正常に完了しなかったことを意味します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   * The user list will usually be reflected within a few hours after the status becomes \&quot;RECEIVED.\&quot;&lt;br&gt;   * If the status is \&quot;INVALID_FILE\&quot;, there is a problem with the file contents or the number of data entries, the file format is incorrect, or the file size exceeds the upper limit (1,073,741,824 bytes). Please refer to the &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044507?language&#x3D;en_US\&quot;&gt;Import data and create custom list&lt;/a&gt; for more details.&lt;br&gt;   * If the status is \&quot;FAILED\&quot;, it means that the job did not complete successfully due to a problem other than the file contents. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RECEIVING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ取り込み中です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Data is being imported.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RECEIVED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ取り込み完了です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Importing data is completed.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;INVALID_FILE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ファイルフォーマットエラーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;File format error.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FAILED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ジョブが失敗しました。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Job failed.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AudienceListServiceJobStatus {
  
  RECEIVING("RECEIVING"),
  
  RECEIVED("RECEIVED"),
  
  INVALID_FILE("INVALID_FILE"),
  
  FAILED("FAILED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceJobStatus(String value) {
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
  public static AudienceListServiceJobStatus fromValue(String value) {
    for (AudienceListServiceJobStatus b : AudienceListServiceJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

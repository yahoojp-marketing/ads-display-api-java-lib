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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; EstimatedUserSizeServiceUnavailableKeywordは、利用不可キーワードかどうかを表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; オーディエンスリストに紐付けた後にキーワードの審査が行われるためEstimatedUserSizeServiceUnavailableKeywordとAudienceListServiceUnavailableKeywordで利用不可キーワードかどうかの結果が異なることがありますがEstimatedUserSizeServiceUnavailableKeywordはオーディエンスリスト作成前の参考として利用していただき、実際にオーディエンスリストに紐づいている判定結果についてはAudienceListServiceUnavailableKeywordをご参照ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; EstimatedUserSizeServiceUnavailableKeyword display whether the keyword is unavailable.&lt;br&gt; Although this field will be returned in the response, it will be ignored on request.&lt;br&gt; Refer to the review results of AudienceListServiceUnavailableKeyword for your audience list. The review results of EstimatedUserSizeServiceUnavailableKeyword may differ because we review your keywords after they are associated with audience lists. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;利用不可キーワードです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unavailable keyword.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;利用不可キーワードではありません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Not unavailable keyword.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum EstimatedUserSizeServiceUnavailableKeyword {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  EstimatedUserSizeServiceUnavailableKeyword(String value) {
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
  public static EstimatedUserSizeServiceUnavailableKeyword fromValue(String value) {
    for (EstimatedUserSizeServiceUnavailableKeyword b : EstimatedUserSizeServiceUnavailableKeyword.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


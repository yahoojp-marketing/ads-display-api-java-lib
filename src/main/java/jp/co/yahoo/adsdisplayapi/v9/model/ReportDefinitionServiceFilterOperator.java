/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceFilterOperatorオブジェクトは、フィルターで指定できる演算子を表します。&lt;br&gt; このフィールドは、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceFilterOperator object displays the operator to be specified by filter. &lt;br&gt; This field is required in ADD operation. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NOT_EQUALS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;≠&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;≠&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONTAINS_ANY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定したいずれかの値を含む（リスト項目専用）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Contains any of specified values (used for list only)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EQUALS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;&#x3D;&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;&#x3D;&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GREATER_THAN_EQUALS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;≧&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;≧&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LESS_THAN_EQUALS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;≦&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;≦&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GREATER_THAN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;＞&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;＞&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LESS_THAN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;＜&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;＜&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONTAINS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;部分一致&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;contains&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;いずれかに一致&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;matches any of&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONTAINS_ALL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定した全ての値を含む（リスト項目専用）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Contains all of specified values (used for list only)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NOT_IN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;いずれにも一致しない&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;matches none of&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ReportDefinitionServiceFilterOperator {
  
  EQUALS("EQUALS"),
  
  NOT_EQUALS("NOT_EQUALS"),
  
  GREATER_THAN("GREATER_THAN"),
  
  GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
  
  LESS_THAN("LESS_THAN"),
  
  LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
  
  CONTAINS("CONTAINS"),
  
  IN("IN"),
  
  CONTAINS_ALL("CONTAINS_ALL"),
  
  CONTAINS_ANY("CONTAINS_ANY"),
  
  NOT_IN("NOT_IN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceFilterOperator(String value) {
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
  public static ReportDefinitionServiceFilterOperator fromValue(String value) {
    for (ReportDefinitionServiceFilterOperator b : ReportDefinitionServiceFilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

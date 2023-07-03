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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v11.model.FeedSetServiceCompareOperator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; FeedSetServiceConditionオブジェクトは、商品セット情報のOR条件を保持します。&lt;br&gt; ADD時、このフィールドは必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; FeedSetServiceCondition object contains OR conditional retrieval of feedset information.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedSetServiceCondition.JSON_PROPERTY_COMPARE_OPERATOR,
  FeedSetServiceCondition.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedSetServiceCondition {
  public static final String JSON_PROPERTY_COMPARE_OPERATOR = "compareOperator";
  private FeedSetServiceCompareOperator compareOperator;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public FeedSetServiceCondition() {
  }

  public FeedSetServiceCondition compareOperator(FeedSetServiceCompareOperator compareOperator) {
    
    this.compareOperator = compareOperator;
    return this;
  }

   /**
   * Get compareOperator
   * @return compareOperator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARE_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedSetServiceCompareOperator getCompareOperator() {
    return compareOperator;
  }


  @JsonProperty(JSON_PROPERTY_COMPARE_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompareOperator(FeedSetServiceCompareOperator compareOperator) {
    this.compareOperator = compareOperator;
  }


  public FeedSetServiceCondition value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 値です。&lt;br&gt; ADD時、このフィールドは必須です。&lt;br&gt; 設定可能な値はFeedSetServiceConditionTypeをご参照ください。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Value.&lt;br&gt; This field is required in ADD operation.&lt;br&gt; Refer to FeedSetServiceConditionType for possible values. &lt;/div&gt; 
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedSetServiceCondition feedSetServiceCondition = (FeedSetServiceCondition) o;
    return Objects.equals(this.compareOperator, feedSetServiceCondition.compareOperator) &&
        Objects.equals(this.value, feedSetServiceCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareOperator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedSetServiceCondition {\n");
    sb.append("    compareOperator: ").append(toIndentedString(compareOperator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


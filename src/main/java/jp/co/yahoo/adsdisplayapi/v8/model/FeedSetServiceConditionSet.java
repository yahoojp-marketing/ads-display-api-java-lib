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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v8.model.FeedSetServiceCondition;
import jp.co.yahoo.adsdisplayapi.v8.model.FeedSetServiceConditionType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; FeedSetServiceConditionSetオブジェクトは、商品セット情報の条件を保持します。&lt;br&gt; ADD時、このフィールドは必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; FeedSetServiceConditionSet object contains conditions of Item Set information.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> FeedSetServiceConditionSetオブジェクトは、商品セット情報の条件を保持します。<br> ADD時、このフィールドは必須です。 </div> <div lang=\"en\"> FeedSetServiceConditionSet object contains conditions of Item Set information.<br> This field is required in ADD operation. </div> ")
@JsonPropertyOrder({
  FeedSetServiceConditionSet.JSON_PROPERTY_CONDITION_TYPE,
  FeedSetServiceConditionSet.JSON_PROPERTY_OR_CONDITIONS
})
@JsonTypeName("FeedSetServiceConditionSet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedSetServiceConditionSet {
  public static final String JSON_PROPERTY_CONDITION_TYPE = "conditionType";
  private FeedSetServiceConditionType conditionType;

  public static final String JSON_PROPERTY_OR_CONDITIONS = "orConditions";
  private List<FeedSetServiceCondition> orConditions = null;

  public FeedSetServiceConditionSet() { 
  }

  public FeedSetServiceConditionSet conditionType(FeedSetServiceConditionType conditionType) {
    
    this.conditionType = conditionType;
    return this;
  }

   /**
   * Get conditionType
   * @return conditionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONDITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedSetServiceConditionType getConditionType() {
    return conditionType;
  }


  @JsonProperty(JSON_PROPERTY_CONDITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditionType(FeedSetServiceConditionType conditionType) {
    this.conditionType = conditionType;
  }


  public FeedSetServiceConditionSet orConditions(List<FeedSetServiceCondition> orConditions) {
    
    this.orConditions = orConditions;
    return this;
  }

  public FeedSetServiceConditionSet addOrConditionsItem(FeedSetServiceCondition orConditionsItem) {
    if (this.orConditions == null) {
      this.orConditions = new ArrayList<>();
    }
    this.orConditions.add(orConditionsItem);
    return this;
  }

   /**
   * Get orConditions
   * @return orConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OR_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeedSetServiceCondition> getOrConditions() {
    return orConditions;
  }


  @JsonProperty(JSON_PROPERTY_OR_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrConditions(List<FeedSetServiceCondition> orConditions) {
    this.orConditions = orConditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedSetServiceConditionSet feedSetServiceConditionSet = (FeedSetServiceConditionSet) o;
    return Objects.equals(this.conditionType, feedSetServiceConditionSet.conditionType) &&
        Objects.equals(this.orConditions, feedSetServiceConditionSet.orConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, orConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedSetServiceConditionSet {\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    orConditions: ").append(toIndentedString(orConditions)).append("\n");
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


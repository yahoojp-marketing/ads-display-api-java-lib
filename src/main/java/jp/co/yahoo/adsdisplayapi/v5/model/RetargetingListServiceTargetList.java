/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceCombinationTargetList;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceCustomAudienceTargetList;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceRuleTargetList;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceSimilarityTargetList;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceTargetListType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceTargetListオブジェクトは、リターゲティングのターゲット種類とターゲットリストの情報を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceTargetList object displays the types of target and target list for site retargeting. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceTargetListオブジェクトは、リターゲティングのターゲット種類とターゲットリストの情報を表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> RetargetingListServiceTargetList object displays the types of target and target list for site retargeting. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
@JsonPropertyOrder({
  RetargetingListServiceTargetList.JSON_PROPERTY_COMBINATION_TARGET_LIST,
  RetargetingListServiceTargetList.JSON_PROPERTY_CUSTOM_AUDIENCE_TARGET_LIST,
  RetargetingListServiceTargetList.JSON_PROPERTY_RULE_TARGET_LIST,
  RetargetingListServiceTargetList.JSON_PROPERTY_SIMILARITY_TARGET_LIST,
  RetargetingListServiceTargetList.JSON_PROPERTY_TARGET_LIST_TYPE
})
@JsonTypeName("RetargetingListServiceTargetList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceTargetList {
  public static final String JSON_PROPERTY_COMBINATION_TARGET_LIST = "combinationTargetList";
  private RetargetingListServiceCombinationTargetList combinationTargetList;

  public static final String JSON_PROPERTY_CUSTOM_AUDIENCE_TARGET_LIST = "customAudienceTargetList";
  private RetargetingListServiceCustomAudienceTargetList customAudienceTargetList;

  public static final String JSON_PROPERTY_RULE_TARGET_LIST = "ruleTargetList";
  private RetargetingListServiceRuleTargetList ruleTargetList;

  public static final String JSON_PROPERTY_SIMILARITY_TARGET_LIST = "similarityTargetList";
  private RetargetingListServiceSimilarityTargetList similarityTargetList;

  public static final String JSON_PROPERTY_TARGET_LIST_TYPE = "targetListType";
  private RetargetingListServiceTargetListType targetListType;

  public RetargetingListServiceTargetList() { 
  }

  public RetargetingListServiceTargetList combinationTargetList(RetargetingListServiceCombinationTargetList combinationTargetList) {
    
    this.combinationTargetList = combinationTargetList;
    return this;
  }

   /**
   * Get combinationTargetList
   * @return combinationTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMBINATION_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceCombinationTargetList getCombinationTargetList() {
    return combinationTargetList;
  }


  @JsonProperty(JSON_PROPERTY_COMBINATION_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinationTargetList(RetargetingListServiceCombinationTargetList combinationTargetList) {
    this.combinationTargetList = combinationTargetList;
  }


  public RetargetingListServiceTargetList customAudienceTargetList(RetargetingListServiceCustomAudienceTargetList customAudienceTargetList) {
    
    this.customAudienceTargetList = customAudienceTargetList;
    return this;
  }

   /**
   * Get customAudienceTargetList
   * @return customAudienceTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_AUDIENCE_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceCustomAudienceTargetList getCustomAudienceTargetList() {
    return customAudienceTargetList;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_AUDIENCE_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomAudienceTargetList(RetargetingListServiceCustomAudienceTargetList customAudienceTargetList) {
    this.customAudienceTargetList = customAudienceTargetList;
  }


  public RetargetingListServiceTargetList ruleTargetList(RetargetingListServiceRuleTargetList ruleTargetList) {
    
    this.ruleTargetList = ruleTargetList;
    return this;
  }

   /**
   * Get ruleTargetList
   * @return ruleTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULE_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceRuleTargetList getRuleTargetList() {
    return ruleTargetList;
  }


  @JsonProperty(JSON_PROPERTY_RULE_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleTargetList(RetargetingListServiceRuleTargetList ruleTargetList) {
    this.ruleTargetList = ruleTargetList;
  }


  public RetargetingListServiceTargetList similarityTargetList(RetargetingListServiceSimilarityTargetList similarityTargetList) {
    
    this.similarityTargetList = similarityTargetList;
    return this;
  }

   /**
   * Get similarityTargetList
   * @return similarityTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIMILARITY_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceSimilarityTargetList getSimilarityTargetList() {
    return similarityTargetList;
  }


  @JsonProperty(JSON_PROPERTY_SIMILARITY_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimilarityTargetList(RetargetingListServiceSimilarityTargetList similarityTargetList) {
    this.similarityTargetList = similarityTargetList;
  }


  public RetargetingListServiceTargetList targetListType(RetargetingListServiceTargetListType targetListType) {
    
    this.targetListType = targetListType;
    return this;
  }

   /**
   * Get targetListType
   * @return targetListType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetargetingListServiceTargetListType getTargetListType() {
    return targetListType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetListType(RetargetingListServiceTargetListType targetListType) {
    this.targetListType = targetListType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceTargetList retargetingListServiceTargetList = (RetargetingListServiceTargetList) o;
    return Objects.equals(this.combinationTargetList, retargetingListServiceTargetList.combinationTargetList) &&
        Objects.equals(this.customAudienceTargetList, retargetingListServiceTargetList.customAudienceTargetList) &&
        Objects.equals(this.ruleTargetList, retargetingListServiceTargetList.ruleTargetList) &&
        Objects.equals(this.similarityTargetList, retargetingListServiceTargetList.similarityTargetList) &&
        Objects.equals(this.targetListType, retargetingListServiceTargetList.targetListType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinationTargetList, customAudienceTargetList, ruleTargetList, similarityTargetList, targetListType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceTargetList {\n");
    sb.append("    combinationTargetList: ").append(toIndentedString(combinationTargetList)).append("\n");
    sb.append("    customAudienceTargetList: ").append(toIndentedString(customAudienceTargetList)).append("\n");
    sb.append("    ruleTargetList: ").append(toIndentedString(ruleTargetList)).append("\n");
    sb.append("    similarityTargetList: ").append(toIndentedString(similarityTargetList)).append("\n");
    sb.append("    targetListType: ").append(toIndentedString(targetListType)).append("\n");
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


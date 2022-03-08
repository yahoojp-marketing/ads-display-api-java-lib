/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

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
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingListServiceLogicalOperator;
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingListServiceTargetListData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceCombinationオブジェクトは、ターゲットリストの組み合わせに関する情報を格納するコンテナです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceCombination object is a container for storing combination of target list information. &lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceCombinationオブジェクトは、ターゲットリストの組み合わせに関する情報を格納するコンテナです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> RetargetingListServiceCombination object is a container for storing combination of target list information. <br> This field is required in ADD and SET operation. </div> ")
@JsonPropertyOrder({
  RetargetingListServiceCombination.JSON_PROPERTY_LOGICAL_OPERATOR,
  RetargetingListServiceCombination.JSON_PROPERTY_TARGET_LISTS
})
@JsonTypeName("RetargetingListServiceCombination")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceCombination {
  public static final String JSON_PROPERTY_LOGICAL_OPERATOR = "logicalOperator";
  private RetargetingListServiceLogicalOperator logicalOperator;

  public static final String JSON_PROPERTY_TARGET_LISTS = "targetLists";
  private List<RetargetingListServiceTargetListData> targetLists = null;

  public RetargetingListServiceCombination() { 
  }

  public RetargetingListServiceCombination logicalOperator(RetargetingListServiceLogicalOperator logicalOperator) {
    
    this.logicalOperator = logicalOperator;
    return this;
  }

   /**
   * Get logicalOperator
   * @return logicalOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGICAL_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceLogicalOperator getLogicalOperator() {
    return logicalOperator;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogicalOperator(RetargetingListServiceLogicalOperator logicalOperator) {
    this.logicalOperator = logicalOperator;
  }


  public RetargetingListServiceCombination targetLists(List<RetargetingListServiceTargetListData> targetLists) {
    
    this.targetLists = targetLists;
    return this;
  }

  public RetargetingListServiceCombination addTargetListsItem(RetargetingListServiceTargetListData targetListsItem) {
    if (this.targetLists == null) {
      this.targetLists = new ArrayList<>();
    }
    this.targetLists.add(targetListsItem);
    return this;
  }

   /**
   * Get targetLists
   * @return targetLists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetargetingListServiceTargetListData> getTargetLists() {
    return targetLists;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetLists(List<RetargetingListServiceTargetListData> targetLists) {
    this.targetLists = targetLists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceCombination retargetingListServiceCombination = (RetargetingListServiceCombination) o;
    return Objects.equals(this.logicalOperator, retargetingListServiceCombination.logicalOperator) &&
        Objects.equals(this.targetLists, retargetingListServiceCombination.targetLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalOperator, targetLists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceCombination {\n");
    sb.append("    logicalOperator: ").append(toIndentedString(logicalOperator)).append("\n");
    sb.append("    targetLists: ").append(toIndentedString(targetLists)).append("\n");
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


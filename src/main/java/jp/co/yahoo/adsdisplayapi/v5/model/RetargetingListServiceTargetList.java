package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceCombinationTargetList;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceCustomAudienceTargetList;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceRuleTargetList;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceSimilarityTargetList;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceTargetListType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceTargetListオブジェクトは、リターゲティングのターゲット種類とターゲットリストの情報を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceTargetList object displays the types of target and target list for site retargeting. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceTargetListオブジェクトは、リターゲティングのターゲット種類とターゲットリストの情報を表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> RetargetingListServiceTargetList object displays the types of target and target list for site retargeting. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceTargetList   {
  @JsonProperty("combinationTargetList")
  private RetargetingListServiceCombinationTargetList combinationTargetList = null;

  @JsonProperty("customAudienceTargetList")
  private RetargetingListServiceCustomAudienceTargetList customAudienceTargetList = null;

  @JsonProperty("ruleTargetList")
  private RetargetingListServiceRuleTargetList ruleTargetList = null;

  @JsonProperty("similarityTargetList")
  private RetargetingListServiceSimilarityTargetList similarityTargetList = null;

  @JsonProperty("targetListType")
  private RetargetingListServiceTargetListType targetListType = null;

  public RetargetingListServiceTargetList combinationTargetList(RetargetingListServiceCombinationTargetList combinationTargetList) {
    this.combinationTargetList = combinationTargetList;
    return this;
  }

  /**
   * Get combinationTargetList
   * @return combinationTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceCombinationTargetList getCombinationTargetList() {
    return combinationTargetList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceCustomAudienceTargetList getCustomAudienceTargetList() {
    return customAudienceTargetList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceRuleTargetList getRuleTargetList() {
    return ruleTargetList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceSimilarityTargetList getSimilarityTargetList() {
    return similarityTargetList;
  }

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
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RetargetingListServiceTargetListType getTargetListType() {
    return targetListType;
  }

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


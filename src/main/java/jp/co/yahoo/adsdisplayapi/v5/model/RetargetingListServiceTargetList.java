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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceTargetListオブジェクトは、リターゲティングのターゲット種類とターゲットリストの情報を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceTargetList object displays the types of target and target list for site retargeting. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceTargetListオブジェクトは、リターゲティングのターゲット種類とターゲットリストの情報を表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> RetargetingListServiceTargetList object displays the types of target and target list for site retargeting. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")

public class RetargetingListServiceTargetList   {
  @JsonProperty("combinationTargetList")
  private JsonNullable<RetargetingListServiceCombinationTargetList> combinationTargetList = JsonNullable.undefined();

  @JsonProperty("customAudienceTargetList")
  private JsonNullable<RetargetingListServiceCustomAudienceTargetList> customAudienceTargetList = JsonNullable.undefined();

  @JsonProperty("ruleTargetList")
  private JsonNullable<RetargetingListServiceRuleTargetList> ruleTargetList = JsonNullable.undefined();

  @JsonProperty("similarityTargetList")
  private JsonNullable<RetargetingListServiceSimilarityTargetList> similarityTargetList = JsonNullable.undefined();

  @JsonProperty("targetListType")
  private JsonNullable<RetargetingListServiceTargetListType> targetListType = JsonNullable.undefined();

  public RetargetingListServiceTargetList combinationTargetList(RetargetingListServiceCombinationTargetList combinationTargetList) {
    this.combinationTargetList = JsonNullable.of(combinationTargetList);
    return this;
  }

  /**
   * Get combinationTargetList
   * @return combinationTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceCombinationTargetList> getCombinationTargetList() {
    return combinationTargetList;
  }

  public void setCombinationTargetList(JsonNullable<RetargetingListServiceCombinationTargetList> combinationTargetList) {
    this.combinationTargetList = combinationTargetList;
  }

  public RetargetingListServiceTargetList customAudienceTargetList(RetargetingListServiceCustomAudienceTargetList customAudienceTargetList) {
    this.customAudienceTargetList = JsonNullable.of(customAudienceTargetList);
    return this;
  }

  /**
   * Get customAudienceTargetList
   * @return customAudienceTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceCustomAudienceTargetList> getCustomAudienceTargetList() {
    return customAudienceTargetList;
  }

  public void setCustomAudienceTargetList(JsonNullable<RetargetingListServiceCustomAudienceTargetList> customAudienceTargetList) {
    this.customAudienceTargetList = customAudienceTargetList;
  }

  public RetargetingListServiceTargetList ruleTargetList(RetargetingListServiceRuleTargetList ruleTargetList) {
    this.ruleTargetList = JsonNullable.of(ruleTargetList);
    return this;
  }

  /**
   * Get ruleTargetList
   * @return ruleTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceRuleTargetList> getRuleTargetList() {
    return ruleTargetList;
  }

  public void setRuleTargetList(JsonNullable<RetargetingListServiceRuleTargetList> ruleTargetList) {
    this.ruleTargetList = ruleTargetList;
  }

  public RetargetingListServiceTargetList similarityTargetList(RetargetingListServiceSimilarityTargetList similarityTargetList) {
    this.similarityTargetList = JsonNullable.of(similarityTargetList);
    return this;
  }

  /**
   * Get similarityTargetList
   * @return similarityTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceSimilarityTargetList> getSimilarityTargetList() {
    return similarityTargetList;
  }

  public void setSimilarityTargetList(JsonNullable<RetargetingListServiceSimilarityTargetList> similarityTargetList) {
    this.similarityTargetList = similarityTargetList;
  }

  public RetargetingListServiceTargetList targetListType(RetargetingListServiceTargetListType targetListType) {
    this.targetListType = JsonNullable.of(targetListType);
    return this;
  }

  /**
   * Get targetListType
   * @return targetListType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<RetargetingListServiceTargetListType> getTargetListType() {
    return targetListType;
  }

  public void setTargetListType(JsonNullable<RetargetingListServiceTargetListType> targetListType) {
    this.targetListType = targetListType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


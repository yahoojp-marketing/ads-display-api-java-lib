package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceRuleCondition;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceRuleオブジェクトは、ターゲットリストに設定可能な条件を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceRule object displays the possible conditions for target list.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceRuleオブジェクトは、ターゲットリストに設定可能な条件を表します。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> RetargetingListServiceRule object displays the possible conditions for target list.<br> This field is required in ADD and SET operation. </div> ")

public class RetargetingListServiceRule   {
  @JsonProperty("ruleConditions")
  @Valid
  private JsonNullable<List<RetargetingListServiceRuleCondition>> ruleConditions = JsonNullable.undefined();

  public RetargetingListServiceRule ruleConditions(List<RetargetingListServiceRuleCondition> ruleConditions) {
    this.ruleConditions = JsonNullable.of(ruleConditions);
    return this;
  }

  public RetargetingListServiceRule addRuleConditionsItem(RetargetingListServiceRuleCondition ruleConditionsItem) {
    if (this.ruleConditions == null || !this.ruleConditions.isPresent()) {
      this.ruleConditions = JsonNullable.of(new ArrayList<>());
    }
    this.ruleConditions.get().add(ruleConditionsItem);
    return this;
  }

  /**
   * Get ruleConditions
   * @return ruleConditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<RetargetingListServiceRuleCondition>> getRuleConditions() {
    return ruleConditions;
  }

  public void setRuleConditions(JsonNullable<List<RetargetingListServiceRuleCondition>> ruleConditions) {
    this.ruleConditions = ruleConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRule retargetingListServiceRule = (RetargetingListServiceRule) o;
    return Objects.equals(this.ruleConditions, retargetingListServiceRule.ruleConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRule {\n");
    
    sb.append("    ruleConditions: ").append(toIndentedString(ruleConditions)).append("\n");
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


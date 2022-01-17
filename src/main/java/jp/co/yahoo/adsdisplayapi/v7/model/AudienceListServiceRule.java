package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceRuleCondition;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceRuleオブジェクトは、オーディエンスリストに設定可能な条件を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceRule object displays the possible conditions for audience list.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceRuleオブジェクトは、オーディエンスリストに設定可能な条件を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> AudienceListServiceRule object displays the possible conditions for audience list.<br> This field is optional in ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceRule   {
  @JsonProperty("ruleConditions")
  @Valid
  private List<AudienceListServiceRuleCondition> ruleConditions = null;

  public AudienceListServiceRule ruleConditions(List<AudienceListServiceRuleCondition> ruleConditions) {
    this.ruleConditions = ruleConditions;
    return this;
  }

  public AudienceListServiceRule addRuleConditionsItem(AudienceListServiceRuleCondition ruleConditionsItem) {
    if (this.ruleConditions == null) {
      this.ruleConditions = new ArrayList<>();
    }
    this.ruleConditions.add(ruleConditionsItem);
    return this;
  }

  /**
   * Get ruleConditions
   * @return ruleConditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AudienceListServiceRuleCondition> getRuleConditions() {
    return ruleConditions;
  }

  public void setRuleConditions(List<AudienceListServiceRuleCondition> ruleConditions) {
    this.ruleConditions = ruleConditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceRule audienceListServiceRule = (AudienceListServiceRule) o;
    return Objects.equals(this.ruleConditions, audienceListServiceRule.ruleConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceRule {\n");
    
    sb.append("    ruleConditions: ").append(toIndentedString(ruleConditions)).append("\n");
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


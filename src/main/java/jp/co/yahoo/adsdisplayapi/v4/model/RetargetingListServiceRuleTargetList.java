package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.RetargetingListServiceIsOpen;
import jp.co.yahoo.adsdisplayapi.v4.model.RetargetingListServiceIsPreset;
import jp.co.yahoo.adsdisplayapi.v4.model.RetargetingListServiceRule;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceRuleTargetListオブジェクトは、ルール設定のリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※targetListTypeがDEFAULT_LISTまたはRULEの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceRuleTargetList object displays the list of rule settings.&lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If targetListType is DEFAULT_LIST, this field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceRuleTargetListオブジェクトは、ルール設定のリストを表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※targetListTypeがDEFAULT_LISTまたはRULEの場合は、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> RetargetingListServiceRuleTargetList object displays the list of rule settings.<br> This field is optional in ADD and SET operation. <br> *If targetListType is DEFAULT_LIST, this field is required in ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceRuleTargetList   {
  @JsonProperty("isOpen")
  private RetargetingListServiceIsOpen isOpen = null;

  @JsonProperty("isPreset")
  private RetargetingListServiceIsPreset isPreset = null;

  @JsonProperty("reachPeriod")
  private Integer reachPeriod = null;

  @JsonProperty("retargetingTagId")
  private String retargetingTagId = null;

  @JsonProperty("rules")
  @Valid
  private List<RetargetingListServiceRule> rules = null;

  public RetargetingListServiceRuleTargetList isOpen(RetargetingListServiceIsOpen isOpen) {
    this.isOpen = isOpen;
    return this;
  }

  /**
   * Get isOpen
   * @return isOpen
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceIsOpen getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(RetargetingListServiceIsOpen isOpen) {
    this.isOpen = isOpen;
  }

  public RetargetingListServiceRuleTargetList isPreset(RetargetingListServiceIsPreset isPreset) {
    this.isPreset = isPreset;
    return this;
  }

  /**
   * Get isPreset
   * @return isPreset
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceIsPreset getIsPreset() {
    return isPreset;
  }

  public void setIsPreset(RetargetingListServiceIsPreset isPreset) {
    this.isPreset = isPreset;
  }

  public RetargetingListServiceRuleTargetList reachPeriod(Integer reachPeriod) {
    this.reachPeriod = reachPeriod;
    return this;
  }

  /**
   * <div lang=\"ja\"> リーチの蓄積期間（1日～540日）です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Cookies validation period. (1 - 540 days) <br> This field is required in ADD operation, and is optional in SET operation. </div> 
   * @return reachPeriod
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リーチの蓄積期間（1日～540日）です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Cookies validation period. (1 - 540 days) <br> This field is required in ADD operation, and is optional in SET operation. </div> ")


  public Integer getReachPeriod() {
    return reachPeriod;
  }

  public void setReachPeriod(Integer reachPeriod) {
    this.reachPeriod = reachPeriod;
  }

  public RetargetingListServiceRuleTargetList retargetingTagId(String retargetingTagId) {
    this.retargetingTagId = retargetingTagId;
    return this;
  }

  /**
   * <div lang=\"ja\"> リターゲティングタグIDです。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> ID of Retargeting Tag. <br> This field is required in ADD operation. </div> 
   * @return retargetingTagId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リターゲティングタグIDです。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> ID of Retargeting Tag. <br> This field is required in ADD operation. </div> ")


  public String getRetargetingTagId() {
    return retargetingTagId;
  }

  public void setRetargetingTagId(String retargetingTagId) {
    this.retargetingTagId = retargetingTagId;
  }

  public RetargetingListServiceRuleTargetList rules(List<RetargetingListServiceRule> rules) {
    this.rules = rules;
    return this;
  }

  public RetargetingListServiceRuleTargetList addRulesItem(RetargetingListServiceRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Get rules
   * @return rules
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RetargetingListServiceRule> getRules() {
    return rules;
  }

  public void setRules(List<RetargetingListServiceRule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRuleTargetList retargetingListServiceRuleTargetList = (RetargetingListServiceRuleTargetList) o;
    return Objects.equals(this.isOpen, retargetingListServiceRuleTargetList.isOpen) &&
        Objects.equals(this.isPreset, retargetingListServiceRuleTargetList.isPreset) &&
        Objects.equals(this.reachPeriod, retargetingListServiceRuleTargetList.reachPeriod) &&
        Objects.equals(this.retargetingTagId, retargetingListServiceRuleTargetList.retargetingTagId) &&
        Objects.equals(this.rules, retargetingListServiceRuleTargetList.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOpen, isPreset, reachPeriod, retargetingTagId, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRuleTargetList {\n");
    
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    isPreset: ").append(toIndentedString(isPreset)).append("\n");
    sb.append("    reachPeriod: ").append(toIndentedString(reachPeriod)).append("\n");
    sb.append("    retargetingTagId: ").append(toIndentedString(retargetingTagId)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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


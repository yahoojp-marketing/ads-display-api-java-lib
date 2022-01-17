package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceIsOpen;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceIsPreset;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceRule;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceWebsiteVisitorsAudienceListオブジェクトは、オーディエンスリスト（ウェブサイト訪問ユーザー）を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがDEFAULT_LISTまたはWEBSITE_VISITORSの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceWebsiteVisitorsAudienceList object describes the audience list (website visitor).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If audienceListType is DEFAULT_LIST or WEBSITE_VISITORS, this field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceWebsiteVisitorsAudienceListオブジェクトは、オーディエンスリスト（ウェブサイト訪問ユーザー）を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※audienceListTypeがDEFAULT_LISTまたはWEBSITE_VISITORSの場合は、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> AudienceListServiceWebsiteVisitorsAudienceList object describes the audience list (website visitor).<br> This field is optional in ADD and SET operation.<br> *If audienceListType is DEFAULT_LIST or WEBSITE_VISITORS, this field is required in ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceWebsiteVisitorsAudienceList   {
  @JsonProperty("isOpen")
  private AudienceListServiceIsOpen isOpen = null;

  @JsonProperty("isPreset")
  private AudienceListServiceIsPreset isPreset = null;

  @JsonProperty("reachPeriod")
  private Integer reachPeriod = null;

  @JsonProperty("retargetingTagId")
  private String retargetingTagId = null;

  @JsonProperty("rules")
  @Valid
  private List<AudienceListServiceRule> rules = null;

  public AudienceListServiceWebsiteVisitorsAudienceList isOpen(AudienceListServiceIsOpen isOpen) {
    this.isOpen = isOpen;
    return this;
  }

  /**
   * Get isOpen
   * @return isOpen
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceIsOpen getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(AudienceListServiceIsOpen isOpen) {
    this.isOpen = isOpen;
  }

  public AudienceListServiceWebsiteVisitorsAudienceList isPreset(AudienceListServiceIsPreset isPreset) {
    this.isPreset = isPreset;
    return this;
  }

  /**
   * Get isPreset
   * @return isPreset
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceIsPreset getIsPreset() {
    return isPreset;
  }

  public void setIsPreset(AudienceListServiceIsPreset isPreset) {
    this.isPreset = isPreset;
  }

  public AudienceListServiceWebsiteVisitorsAudienceList reachPeriod(Integer reachPeriod) {
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

  public AudienceListServiceWebsiteVisitorsAudienceList retargetingTagId(String retargetingTagId) {
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

  public AudienceListServiceWebsiteVisitorsAudienceList rules(List<AudienceListServiceRule> rules) {
    this.rules = rules;
    return this;
  }

  public AudienceListServiceWebsiteVisitorsAudienceList addRulesItem(AudienceListServiceRule rulesItem) {
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

  public List<AudienceListServiceRule> getRules() {
    return rules;
  }

  public void setRules(List<AudienceListServiceRule> rules) {
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
    AudienceListServiceWebsiteVisitorsAudienceList audienceListServiceWebsiteVisitorsAudienceList = (AudienceListServiceWebsiteVisitorsAudienceList) o;
    return Objects.equals(this.isOpen, audienceListServiceWebsiteVisitorsAudienceList.isOpen) &&
        Objects.equals(this.isPreset, audienceListServiceWebsiteVisitorsAudienceList.isPreset) &&
        Objects.equals(this.reachPeriod, audienceListServiceWebsiteVisitorsAudienceList.reachPeriod) &&
        Objects.equals(this.retargetingTagId, audienceListServiceWebsiteVisitorsAudienceList.retargetingTagId) &&
        Objects.equals(this.rules, audienceListServiceWebsiteVisitorsAudienceList.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOpen, isPreset, reachPeriod, retargetingTagId, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceWebsiteVisitorsAudienceList {\n");
    
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


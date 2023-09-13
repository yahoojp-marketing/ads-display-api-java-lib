/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

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
import jp.co.yahoo.adsdisplayapi.v12.model.AudienceListServiceIsOpen;
import jp.co.yahoo.adsdisplayapi.v12.model.AudienceListServiceIsPreset;
import jp.co.yahoo.adsdisplayapi.v12.model.AudienceListServiceRule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceRuleAudienceListオブジェクトは、ルール設定のリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがDEFAULT_LISTまたはRULEの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceRuleAudienceList object displays the list of rule settings.&lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If audienceListType is DEFAULT_LIST, this field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceRuleAudienceListオブジェクトは、ルール設定のリストを表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※audienceListTypeがDEFAULT_LISTまたはRULEの場合は、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> AudienceListServiceRuleAudienceList object displays the list of rule settings.<br> This field is optional in ADD and SET operation. <br> *If audienceListType is DEFAULT_LIST, this field is required in ADD and SET operation. </div> ")
@JsonPropertyOrder({
  AudienceListServiceRuleAudienceList.JSON_PROPERTY_IS_OPEN,
  AudienceListServiceRuleAudienceList.JSON_PROPERTY_IS_PRESET,
  AudienceListServiceRuleAudienceList.JSON_PROPERTY_REACH_PERIOD,
  AudienceListServiceRuleAudienceList.JSON_PROPERTY_RETARGETING_TAG_ID,
  AudienceListServiceRuleAudienceList.JSON_PROPERTY_RULES
})
@JsonTypeName("AudienceListServiceRuleAudienceList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceRuleAudienceList {
  public static final String JSON_PROPERTY_IS_OPEN = "isOpen";
  private AudienceListServiceIsOpen isOpen;

  public static final String JSON_PROPERTY_IS_PRESET = "isPreset";
  private AudienceListServiceIsPreset isPreset;

  public static final String JSON_PROPERTY_REACH_PERIOD = "reachPeriod";
  private Integer reachPeriod;

  public static final String JSON_PROPERTY_RETARGETING_TAG_ID = "retargetingTagId";
  private String retargetingTagId;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<AudienceListServiceRule> rules = null;

  public AudienceListServiceRuleAudienceList() { 
  }

  public AudienceListServiceRuleAudienceList isOpen(AudienceListServiceIsOpen isOpen) {
    
    this.isOpen = isOpen;
    return this;
  }

   /**
   * Get isOpen
   * @return isOpen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceIsOpen getIsOpen() {
    return isOpen;
  }


  @JsonProperty(JSON_PROPERTY_IS_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOpen(AudienceListServiceIsOpen isOpen) {
    this.isOpen = isOpen;
  }


  public AudienceListServiceRuleAudienceList isPreset(AudienceListServiceIsPreset isPreset) {
    
    this.isPreset = isPreset;
    return this;
  }

   /**
   * Get isPreset
   * @return isPreset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PRESET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceIsPreset getIsPreset() {
    return isPreset;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRESET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPreset(AudienceListServiceIsPreset isPreset) {
    this.isPreset = isPreset;
  }


  public AudienceListServiceRuleAudienceList reachPeriod(Integer reachPeriod) {
    
    this.reachPeriod = reachPeriod;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リーチの蓄積期間（1日～540日）です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Cookies validation period. (1 - 540 days) &lt;br&gt; This field is required in ADD operation, and is optional in SET operation. &lt;/div&gt; 
   * @return reachPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リーチの蓄積期間（1日～540日）です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\"> Cookies validation period. (1 - 540 days) <br> This field is required in ADD operation, and is optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_REACH_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReachPeriod() {
    return reachPeriod;
  }


  @JsonProperty(JSON_PROPERTY_REACH_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachPeriod(Integer reachPeriod) {
    this.reachPeriod = reachPeriod;
  }


  public AudienceListServiceRuleAudienceList retargetingTagId(String retargetingTagId) {
    
    this.retargetingTagId = retargetingTagId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リターゲティングタグIDです。&lt;br&gt; このフィールドは、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ID of retargeting tag. &lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
   * @return retargetingTagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リターゲティングタグIDです。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> ID of retargeting tag. <br> This field is required in ADD operation. </div> ")
  @JsonProperty(JSON_PROPERTY_RETARGETING_TAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRetargetingTagId() {
    return retargetingTagId;
  }


  @JsonProperty(JSON_PROPERTY_RETARGETING_TAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetargetingTagId(String retargetingTagId) {
    this.retargetingTagId = retargetingTagId;
  }


  public AudienceListServiceRuleAudienceList rules(List<AudienceListServiceRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public AudienceListServiceRuleAudienceList addRulesItem(AudienceListServiceRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AudienceListServiceRule> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    AudienceListServiceRuleAudienceList audienceListServiceRuleAudienceList = (AudienceListServiceRuleAudienceList) o;
    return Objects.equals(this.isOpen, audienceListServiceRuleAudienceList.isOpen) &&
        Objects.equals(this.isPreset, audienceListServiceRuleAudienceList.isPreset) &&
        Objects.equals(this.reachPeriod, audienceListServiceRuleAudienceList.reachPeriod) &&
        Objects.equals(this.retargetingTagId, audienceListServiceRuleAudienceList.retargetingTagId) &&
        Objects.equals(this.rules, audienceListServiceRuleAudienceList.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOpen, isPreset, reachPeriod, retargetingTagId, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceRuleAudienceList {\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceRuleCondition;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceRuleオブジェクトは、オーディエンスリストに設定可能な条件を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceRule object displays the possible conditions for audience list.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceRule.JSON_PROPERTY_RULE_CONDITIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceRule {
  public static final String JSON_PROPERTY_RULE_CONDITIONS = "ruleConditions";
  private List<AudienceListServiceRuleCondition> ruleConditions;

  public AudienceListServiceRule() {
  }

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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AudienceListServiceRuleCondition> getRuleConditions() {
    return ruleConditions;
  }


  @JsonProperty(JSON_PROPERTY_RULE_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


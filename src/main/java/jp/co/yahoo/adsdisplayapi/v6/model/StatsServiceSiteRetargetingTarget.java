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
import jp.co.yahoo.adsdisplayapi.v6.model.StatsServiceTargetListDeliverType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceSiteRetargetingTarget object holds configuration information of Site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。</div> <div lang=\"en\">StatsServiceSiteRetargetingTarget object holds configuration information of Site retargeting.</div> ")
@JsonPropertyOrder({
  StatsServiceSiteRetargetingTarget.JSON_PROPERTY_TARGET_LIST_DELIVER_TYPE,
  StatsServiceSiteRetargetingTarget.JSON_PROPERTY_TARGET_LIST_NAME
})
@JsonTypeName("StatsServiceSiteRetargetingTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceSiteRetargetingTarget {
  public static final String JSON_PROPERTY_TARGET_LIST_DELIVER_TYPE = "targetListDeliverType";
  private StatsServiceTargetListDeliverType targetListDeliverType;

  public static final String JSON_PROPERTY_TARGET_LIST_NAME = "targetListName";
  private String targetListName;

  public StatsServiceSiteRetargetingTarget() { 
  }

  public StatsServiceSiteRetargetingTarget targetListDeliverType(StatsServiceTargetListDeliverType targetListDeliverType) {
    
    this.targetListDeliverType = targetListDeliverType;
    return this;
  }

   /**
   * Get targetListDeliverType
   * @return targetListDeliverType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_DELIVER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceTargetListDeliverType getTargetListDeliverType() {
    return targetListDeliverType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_DELIVER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListDeliverType(StatsServiceTargetListDeliverType targetListDeliverType) {
    this.targetListDeliverType = targetListDeliverType;
  }


  public StatsServiceSiteRetargetingTarget targetListName(String targetListName) {
    
    this.targetListName = targetListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリスト名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target list name&lt;/div&gt; 
   * @return targetListName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリスト名</div> <div lang=\"en\">Target list name</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetListName() {
    return targetListName;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListName(String targetListName) {
    this.targetListName = targetListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceSiteRetargetingTarget statsServiceSiteRetargetingTarget = (StatsServiceSiteRetargetingTarget) o;
    return Objects.equals(this.targetListDeliverType, statsServiceSiteRetargetingTarget.targetListDeliverType) &&
        Objects.equals(this.targetListName, statsServiceSiteRetargetingTarget.targetListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListDeliverType, targetListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceSiteRetargetingTarget {\n");
    sb.append("    targetListDeliverType: ").append(toIndentedString(targetListDeliverType)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
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


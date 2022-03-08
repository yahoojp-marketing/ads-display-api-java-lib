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
import jp.co.yahoo.adsdisplayapi.v6.model.StatsServiceAge;
import jp.co.yahoo.adsdisplayapi.v6.model.StatsServiceEstimateFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAgeTargetオブジェクトは、年齢ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAgeTarget object holds configuration information of age targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAgeTargetオブジェクトは、年齢ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAgeTarget object holds configuration information of age targeting.</div> ")
@JsonPropertyOrder({
  StatsServiceAgeTarget.JSON_PROPERTY_AGE,
  StatsServiceAgeTarget.JSON_PROPERTY_ESTIMATE_FLG
})
@JsonTypeName("StatsServiceAgeTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceAgeTarget {
  public static final String JSON_PROPERTY_AGE = "age";
  private StatsServiceAge age;

  public static final String JSON_PROPERTY_ESTIMATE_FLG = "estimateFlg";
  private StatsServiceEstimateFlg estimateFlg;

  public StatsServiceAgeTarget() { 
  }

  public StatsServiceAgeTarget age(StatsServiceAge age) {
    
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceAge getAge() {
    return age;
  }


  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAge(StatsServiceAge age) {
    this.age = age;
  }


  public StatsServiceAgeTarget estimateFlg(StatsServiceEstimateFlg estimateFlg) {
    
    this.estimateFlg = estimateFlg;
    return this;
  }

   /**
   * Get estimateFlg
   * @return estimateFlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESTIMATE_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceEstimateFlg getEstimateFlg() {
    return estimateFlg;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATE_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimateFlg(StatsServiceEstimateFlg estimateFlg) {
    this.estimateFlg = estimateFlg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceAgeTarget statsServiceAgeTarget = (StatsServiceAgeTarget) o;
    return Objects.equals(this.age, statsServiceAgeTarget.age) &&
        Objects.equals(this.estimateFlg, statsServiceAgeTarget.estimateFlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, estimateFlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAgeTarget {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    estimateFlg: ").append(toIndentedString(estimateFlg)).append("\n");
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


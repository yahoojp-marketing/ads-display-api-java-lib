/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v10.model.StatsServiceEstimateFlg;
import jp.co.yahoo.adsdisplayapi.v10.model.StatsServiceGender;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceGenderTargetオブジェクトは、性別ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceGenderTarget object holds configuration information of gender targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServiceGenderTarget.JSON_PROPERTY_ESTIMATE_FLG,
  StatsServiceGenderTarget.JSON_PROPERTY_GENDER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceGenderTarget {
  public static final String JSON_PROPERTY_ESTIMATE_FLG = "estimateFlg";
  private StatsServiceEstimateFlg estimateFlg;

  public static final String JSON_PROPERTY_GENDER = "gender";
  private StatsServiceGender gender;

  public StatsServiceGenderTarget() {
  }

  public StatsServiceGenderTarget estimateFlg(StatsServiceEstimateFlg estimateFlg) {
    
    this.estimateFlg = estimateFlg;
    return this;
  }

   /**
   * Get estimateFlg
   * @return estimateFlg
  **/
  @jakarta.annotation.Nullable
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


  public StatsServiceGenderTarget gender(StatsServiceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceGender getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(StatsServiceGender gender) {
    this.gender = gender;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceGenderTarget statsServiceGenderTarget = (StatsServiceGenderTarget) o;
    return Objects.equals(this.estimateFlg, statsServiceGenderTarget.estimateFlg) &&
        Objects.equals(this.gender, statsServiceGenderTarget.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateFlg, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceGenderTarget {\n");
    sb.append("    estimateFlg: ").append(toIndentedString(estimateFlg)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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


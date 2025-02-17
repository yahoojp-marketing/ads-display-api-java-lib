/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v16.model.CampaignServiceOptimizerTrainingStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceOptimizerは、最適化制御を保持するオブジェクトです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceOptimizer retains optimization control.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceOptimizer.JSON_PROPERTY_OPTIMIZER_TRAINING_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceOptimizer {
  public static final String JSON_PROPERTY_OPTIMIZER_TRAINING_STATUS = "optimizerTrainingStatus";
  private CampaignServiceOptimizerTrainingStatus optimizerTrainingStatus;

  public CampaignServiceOptimizer() {
  }

  public CampaignServiceOptimizer optimizerTrainingStatus(CampaignServiceOptimizerTrainingStatus optimizerTrainingStatus) {
    
    this.optimizerTrainingStatus = optimizerTrainingStatus;
    return this;
  }

   /**
   * Get optimizerTrainingStatus
   * @return optimizerTrainingStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIMIZER_TRAINING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceOptimizerTrainingStatus getOptimizerTrainingStatus() {
    return optimizerTrainingStatus;
  }


  @JsonProperty(JSON_PROPERTY_OPTIMIZER_TRAINING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptimizerTrainingStatus(CampaignServiceOptimizerTrainingStatus optimizerTrainingStatus) {
    this.optimizerTrainingStatus = optimizerTrainingStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceOptimizer campaignServiceOptimizer = (CampaignServiceOptimizer) o;
    return Objects.equals(this.optimizerTrainingStatus, campaignServiceOptimizer.optimizerTrainingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimizerTrainingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceOptimizer {\n");
    sb.append("    optimizerTrainingStatus: ").append(toIndentedString(optimizerTrainingStatus)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceInsufficientAccountBalanceオブジェクトは、残高が少ないアカウントに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceInsufficientAccountBalance object describes information about recommendations for accounts with low account balances.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceInsufficientAccountBalance.JSON_PROPERTY_RECOMMENDATION_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceInsufficientAccountBalance {
  public static final String JSON_PROPERTY_RECOMMENDATION_ID = "recommendationId";
  private Long recommendationId;

  public RecommendationServiceInsufficientAccountBalance() {
  }

  public RecommendationServiceInsufficientAccountBalance recommendationId(Long recommendationId) {
    
    this.recommendationId = recommendationId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 最適化提案IDです。&lt;br&gt; optimizationScoreLiftがnullでない場合は、1つのキャンペーンに関する提案に共通の最適化提案IDが割り当てられます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommendation ID.&lt;br&gt; When optimizationScoreLift isn&#39;t null, the system will assign a common recommendation ID to the suggestion for the campaign. &lt;/div&gt; 
   * @return recommendationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRecommendationId() {
    return recommendationId;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceInsufficientAccountBalance recommendationServiceInsufficientAccountBalance = (RecommendationServiceInsufficientAccountBalance) o;
    return Objects.equals(this.recommendationId, recommendationServiceInsufficientAccountBalance.recommendationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceInsufficientAccountBalance {\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
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


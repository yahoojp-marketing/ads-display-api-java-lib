/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v11.model.AudienceListServiceData;
import jp.co.yahoo.adsdisplayapi.v11.model.AudienceListServiceLogicalOperator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceCombinationオブジェクトは、オーディエンスリストの組み合わせに関する情報を格納するコンテナです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceCombination object is a container for storing combination of audience list information. &lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceCombination.JSON_PROPERTY_LOGICAL_OPERATOR,
  AudienceListServiceCombination.JSON_PROPERTY_AUDIENCE_LISTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceCombination {
  public static final String JSON_PROPERTY_LOGICAL_OPERATOR = "logicalOperator";
  private AudienceListServiceLogicalOperator logicalOperator;

  public static final String JSON_PROPERTY_AUDIENCE_LISTS = "audienceLists";
  private List<AudienceListServiceData> audienceLists;

  public AudienceListServiceCombination() {
  }

  public AudienceListServiceCombination logicalOperator(AudienceListServiceLogicalOperator logicalOperator) {
    
    this.logicalOperator = logicalOperator;
    return this;
  }

   /**
   * Get logicalOperator
   * @return logicalOperator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGICAL_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceLogicalOperator getLogicalOperator() {
    return logicalOperator;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogicalOperator(AudienceListServiceLogicalOperator logicalOperator) {
    this.logicalOperator = logicalOperator;
  }


  public AudienceListServiceCombination audienceLists(List<AudienceListServiceData> audienceLists) {
    
    this.audienceLists = audienceLists;
    return this;
  }

  public AudienceListServiceCombination addAudienceListsItem(AudienceListServiceData audienceListsItem) {
    if (this.audienceLists == null) {
      this.audienceLists = new ArrayList<>();
    }
    this.audienceLists.add(audienceListsItem);
    return this;
  }

   /**
   * Get audienceLists
   * @return audienceLists
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AudienceListServiceData> getAudienceLists() {
    return audienceLists;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceLists(List<AudienceListServiceData> audienceLists) {
    this.audienceLists = audienceLists;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceCombination audienceListServiceCombination = (AudienceListServiceCombination) o;
    return Objects.equals(this.logicalOperator, audienceListServiceCombination.logicalOperator) &&
        Objects.equals(this.audienceLists, audienceListServiceCombination.audienceLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalOperator, audienceLists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceCombination {\n");
    sb.append("    logicalOperator: ").append(toIndentedString(logicalOperator)).append("\n");
    sb.append("    audienceLists: ").append(toIndentedString(audienceLists)).append("\n");
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


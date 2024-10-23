/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v15.model.AudienceListServiceAdvancedSegmentsKeyword;
import jp.co.yahoo.adsdisplayapi.v15.model.AudienceListServiceIsCurrentlyTotaling;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceAdvancedSegmentsAudienceListオブジェクトは、オーディエンスリスト（高度なセグメント）を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがADVANCED_SEGMENTSの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceAdvancedSegmentsAudienceList object describes the audience list (Advanced segments).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If audienceListType is ADVANCED_SEGMENTS, this field is required in ADD and SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceAdvancedSegmentsAudienceList.JSON_PROPERTY_KEYWORDS,
  AudienceListServiceAdvancedSegmentsAudienceList.JSON_PROPERTY_IS_CURRENTLY_TOTALING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceAdvancedSegmentsAudienceList {
  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<AudienceListServiceAdvancedSegmentsKeyword> keywords;

  public static final String JSON_PROPERTY_IS_CURRENTLY_TOTALING = "isCurrentlyTotaling";
  private AudienceListServiceIsCurrentlyTotaling isCurrentlyTotaling;

  public AudienceListServiceAdvancedSegmentsAudienceList() {
  }

  public AudienceListServiceAdvancedSegmentsAudienceList keywords(List<AudienceListServiceAdvancedSegmentsKeyword> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public AudienceListServiceAdvancedSegmentsAudienceList addKeywordsItem(AudienceListServiceAdvancedSegmentsKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AudienceListServiceAdvancedSegmentsKeyword> getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywords(List<AudienceListServiceAdvancedSegmentsKeyword> keywords) {
    this.keywords = keywords;
  }


  public AudienceListServiceAdvancedSegmentsAudienceList isCurrentlyTotaling(AudienceListServiceIsCurrentlyTotaling isCurrentlyTotaling) {
    
    this.isCurrentlyTotaling = isCurrentlyTotaling;
    return this;
  }

   /**
   * Get isCurrentlyTotaling
   * @return isCurrentlyTotaling
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CURRENTLY_TOTALING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceIsCurrentlyTotaling getIsCurrentlyTotaling() {
    return isCurrentlyTotaling;
  }


  @JsonProperty(JSON_PROPERTY_IS_CURRENTLY_TOTALING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCurrentlyTotaling(AudienceListServiceIsCurrentlyTotaling isCurrentlyTotaling) {
    this.isCurrentlyTotaling = isCurrentlyTotaling;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceAdvancedSegmentsAudienceList audienceListServiceAdvancedSegmentsAudienceList = (AudienceListServiceAdvancedSegmentsAudienceList) o;
    return Objects.equals(this.keywords, audienceListServiceAdvancedSegmentsAudienceList.keywords) &&
        Objects.equals(this.isCurrentlyTotaling, audienceListServiceAdvancedSegmentsAudienceList.isCurrentlyTotaling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, isCurrentlyTotaling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceAdvancedSegmentsAudienceList {\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    isCurrentlyTotaling: ").append(toIndentedString(isCurrentlyTotaling)).append("\n");
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


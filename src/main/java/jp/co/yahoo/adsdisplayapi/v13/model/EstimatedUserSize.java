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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v13.model.EstimatedUserSizeServiceKeywords;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;EstimatedUserSizeオブジェクトは、推定ユーザサイズを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;EstimatedUserSize object is a container for storing a estimated user size.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">EstimatedUserSizeオブジェクトは、推定ユーザサイズを格納するコンテナです。</div> <div lang=\"en\">EstimatedUserSize object is a container for storing a estimated user size.</div> ")
@JsonPropertyOrder({
  EstimatedUserSize.JSON_PROPERTY_ESTIMATED_USER_SIZE,
  EstimatedUserSize.JSON_PROPERTY_KEYWORDS
})
@JsonTypeName("EstimatedUserSize")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EstimatedUserSize {
  public static final String JSON_PROPERTY_ESTIMATED_USER_SIZE = "estimatedUserSize";
  private String estimatedUserSize;

  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<EstimatedUserSizeServiceKeywords> keywords = null;

  public EstimatedUserSize() { 
  }

  public EstimatedUserSize estimatedUserSize(String estimatedUserSize) {
    
    this.estimatedUserSize = estimatedUserSize;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キーワードから推定されるユーザサイズです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Estimated user size from keywords.&lt;br&gt; &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ZERO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;0&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;0&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LESS_THAN_10K&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;1万未満です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Less than 10,000.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BETWEEN_10K_TO_100K&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;1万以上、10万未満です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Between 10,000 to 100,000.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BETWEEN_100K_TO_500K&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;10万以上、50万未満です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Between 100,000 to 500,000.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BETWEEN_500K_TO_1M&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;50万以上、100万未満です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Between 500,000 to 1 million.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BETWEEN_1M_TO_5M&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;100万以上、500万未満です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Between 1 million to 5 million.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BETWEEN_5M_TO_10M&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;500万以上、1,000万未満です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Between 5 million to 10 million.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GREATER_THAN_10M&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;1,000万以上です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Greater than 10 million.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
   * @return estimatedUserSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キーワードから推定されるユーザサイズです。<br> </div> <div lang=\"en\"> Estimated user size from keywords.<br> </div> <dl class=term>   <dt class=\"term__item\">ZERO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">0</span><span lang=\"en\">0</span></dd>   <dt class=\"term__item\">LESS_THAN_10K</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1万未満です。</span><span lang=\"en\">Less than 10,000.</span></dd>   <dt class=\"term__item\">BETWEEN_10K_TO_100K</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1万以上、10万未満です。</span><span lang=\"en\">Between 10,000 to 100,000.</span></dd>   <dt class=\"term__item\">BETWEEN_100K_TO_500K</dt>   <dd class=\"term__desc\"><span lang=\"ja\">10万以上、50万未満です。</span><span lang=\"en\">Between 100,000 to 500,000.</span></dd>   <dt class=\"term__item\">BETWEEN_500K_TO_1M</dt>   <dd class=\"term__desc\"><span lang=\"ja\">50万以上、100万未満です。</span><span lang=\"en\">Between 500,000 to 1 million.</span></dd>   <dt class=\"term__item\">BETWEEN_1M_TO_5M</dt>   <dd class=\"term__desc\"><span lang=\"ja\">100万以上、500万未満です。</span><span lang=\"en\">Between 1 million to 5 million.</span></dd>   <dt class=\"term__item\">BETWEEN_5M_TO_10M</dt>   <dd class=\"term__desc\"><span lang=\"ja\">500万以上、1,000万未満です。</span><span lang=\"en\">Between 5 million to 10 million.</span></dd>   <dt class=\"term__item\">GREATER_THAN_10M</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1,000万以上です。</span><span lang=\"en\">Greater than 10 million.</span></dd> </dl> ")
  @JsonProperty(JSON_PROPERTY_ESTIMATED_USER_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEstimatedUserSize() {
    return estimatedUserSize;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_USER_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedUserSize(String estimatedUserSize) {
    this.estimatedUserSize = estimatedUserSize;
  }


  public EstimatedUserSize keywords(List<EstimatedUserSizeServiceKeywords> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public EstimatedUserSize addKeywordsItem(EstimatedUserSizeServiceKeywords keywordsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EstimatedUserSizeServiceKeywords> getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywords(List<EstimatedUserSizeServiceKeywords> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimatedUserSize estimatedUserSize = (EstimatedUserSize) o;
    return Objects.equals(this.estimatedUserSize, estimatedUserSize.estimatedUserSize) &&
        Objects.equals(this.keywords, estimatedUserSize.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedUserSize, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimatedUserSize {\n");
    sb.append("    estimatedUserSize: ").append(toIndentedString(estimatedUserSize)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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


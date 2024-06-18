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
import jp.co.yahoo.adsdisplayapi.v14.model.StatsServiceDeliverType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAudienceListTarget object holds configuration information of Audience list targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServiceAudienceListTarget.JSON_PROPERTY_DELIVER_TYPE,
  StatsServiceAudienceListTarget.JSON_PROPERTY_AUDIENCE_LIST_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceAudienceListTarget {
  public static final String JSON_PROPERTY_DELIVER_TYPE = "deliverType";
  private StatsServiceDeliverType deliverType;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_NAME = "audienceListName";
  private String audienceListName;

  public StatsServiceAudienceListTarget() {
  }

  public StatsServiceAudienceListTarget deliverType(StatsServiceDeliverType deliverType) {
    
    this.deliverType = deliverType;
    return this;
  }

   /**
   * Get deliverType
   * @return deliverType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceDeliverType getDeliverType() {
    return deliverType;
  }


  @JsonProperty(JSON_PROPERTY_DELIVER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliverType(StatsServiceDeliverType deliverType) {
    this.deliverType = deliverType;
  }


  public StatsServiceAudienceListTarget audienceListName(String audienceListName) {
    
    this.audienceListName = audienceListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスリスト名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Audience list name&lt;/div&gt; 
   * @return audienceListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudienceListName() {
    return audienceListName;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceAudienceListTarget statsServiceAudienceListTarget = (StatsServiceAudienceListTarget) o;
    return Objects.equals(this.deliverType, statsServiceAudienceListTarget.deliverType) &&
        Objects.equals(this.audienceListName, statsServiceAudienceListTarget.audienceListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverType, audienceListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAudienceListTarget {\n");
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
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


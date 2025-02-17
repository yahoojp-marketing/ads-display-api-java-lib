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
import jp.co.yahoo.adsdisplayapi.v16.model.AudienceListServiceSize;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリストのサイズの各リーチ数を保持するオブジェクトです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceSizeReaches object contains each reaches of audience list size. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceSizeReaches.JSON_PROPERTY_REACH,
  AudienceListServiceSizeReaches.JSON_PROPERTY_AUDIENCE_LIST_SIZE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceSizeReaches {
  public static final String JSON_PROPERTY_REACH = "reach";
  private Long reach;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_SIZE = "audienceListSize";
  private AudienceListServiceSize audienceListSize;

  public AudienceListServiceSizeReaches() {
  }

  public AudienceListServiceSizeReaches reach(Long reach) {
    
    this.reach = reach;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリストのサイズのリーチ数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reaches of audience list size. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return reach
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReach() {
    return reach;
  }


  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReach(Long reach) {
    this.reach = reach;
  }


  public AudienceListServiceSizeReaches audienceListSize(AudienceListServiceSize audienceListSize) {
    
    this.audienceListSize = audienceListSize;
    return this;
  }

   /**
   * Get audienceListSize
   * @return audienceListSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceSize getAudienceListSize() {
    return audienceListSize;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListSize(AudienceListServiceSize audienceListSize) {
    this.audienceListSize = audienceListSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceSizeReaches audienceListServiceSizeReaches = (AudienceListServiceSizeReaches) o;
    return Objects.equals(this.reach, audienceListServiceSizeReaches.reach) &&
        Objects.equals(this.audienceListSize, audienceListServiceSizeReaches.audienceListSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reach, audienceListSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceSizeReaches {\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    audienceListSize: ").append(toIndentedString(audienceListSize)).append("\n");
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


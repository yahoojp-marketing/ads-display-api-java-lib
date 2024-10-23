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
import jp.co.yahoo.adsdisplayapi.v14.model.PlacementUrlListServiceUrlActiveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; PlacementUrlListServiceUrlListオブジェクトは、URLを保持するオブジェクトです。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The objects to keep url.&lt;br&gt; This field is required in ADD operation, and is optional in SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  PlacementUrlListServiceUrlList.JSON_PROPERTY_PLACEMENT_URL,
  PlacementUrlListServiceUrlList.JSON_PROPERTY_URL_ACTIVE_FLG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlacementUrlListServiceUrlList {
  public static final String JSON_PROPERTY_PLACEMENT_URL = "placementUrl";
  private String placementUrl;

  public static final String JSON_PROPERTY_URL_ACTIVE_FLG = "urlActiveFlg";
  private PlacementUrlListServiceUrlActiveFlg urlActiveFlg;

  public PlacementUrlListServiceUrlList() {
  }

  public PlacementUrlListServiceUrlList placementUrl(String placementUrl) {
    
    this.placementUrl = placementUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; プレイスメントURLです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Url.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return placementUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlacementUrl() {
    return placementUrl;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementUrl(String placementUrl) {
    this.placementUrl = placementUrl;
  }


  public PlacementUrlListServiceUrlList urlActiveFlg(PlacementUrlListServiceUrlActiveFlg urlActiveFlg) {
    
    this.urlActiveFlg = urlActiveFlg;
    return this;
  }

   /**
   * Get urlActiveFlg
   * @return urlActiveFlg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_ACTIVE_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlacementUrlListServiceUrlActiveFlg getUrlActiveFlg() {
    return urlActiveFlg;
  }


  @JsonProperty(JSON_PROPERTY_URL_ACTIVE_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlActiveFlg(PlacementUrlListServiceUrlActiveFlg urlActiveFlg) {
    this.urlActiveFlg = urlActiveFlg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlListServiceUrlList placementUrlListServiceUrlList = (PlacementUrlListServiceUrlList) o;
    return Objects.equals(this.placementUrl, placementUrlListServiceUrlList.placementUrl) &&
        Objects.equals(this.urlActiveFlg, placementUrlListServiceUrlList.urlActiveFlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementUrl, urlActiveFlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlListServiceUrlList {\n");
    sb.append("    placementUrl: ").append(toIndentedString(placementUrl)).append("\n");
    sb.append("    urlActiveFlg: ").append(toIndentedString(urlActiveFlg)).append("\n");
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

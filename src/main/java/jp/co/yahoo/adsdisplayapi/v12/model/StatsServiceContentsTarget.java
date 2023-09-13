/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v12.model.StatsServiceDeliverType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; StatsServiceContentsTargetオブジェクトは、コンテンツターゲティングの設定情報を保持します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; StatsServiceContentsTarget object is a container for storing contents settings. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServiceContentsTarget.JSON_PROPERTY_DELIVER_TYPE,
  StatsServiceContentsTarget.JSON_PROPERTY_CONTENTS_KEYWORD_LIST_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceContentsTarget {
  public static final String JSON_PROPERTY_DELIVER_TYPE = "deliverType";
  private StatsServiceDeliverType deliverType;

  public static final String JSON_PROPERTY_CONTENTS_KEYWORD_LIST_NAME = "contentsKeywordListName";
  private String contentsKeywordListName;

  public StatsServiceContentsTarget() {
  }

  public StatsServiceContentsTarget deliverType(StatsServiceDeliverType deliverType) {
    
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


  public StatsServiceContentsTarget contentsKeywordListName(String contentsKeywordListName) {
    
    this.contentsKeywordListName = contentsKeywordListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンテンツキーワードリスト名です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Contents keyword list name. &lt;/div&gt; 
   * @return contentsKeywordListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentsKeywordListName() {
    return contentsKeywordListName;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsKeywordListName(String contentsKeywordListName) {
    this.contentsKeywordListName = contentsKeywordListName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceContentsTarget statsServiceContentsTarget = (StatsServiceContentsTarget) o;
    return Objects.equals(this.deliverType, statsServiceContentsTarget.deliverType) &&
        Objects.equals(this.contentsKeywordListName, statsServiceContentsTarget.contentsKeywordListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverType, contentsKeywordListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceContentsTarget {\n");
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
    sb.append("    contentsKeywordListName: ").append(toIndentedString(contentsKeywordListName)).append("\n");
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


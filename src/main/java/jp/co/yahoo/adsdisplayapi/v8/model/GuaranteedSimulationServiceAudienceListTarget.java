/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServiceAudienceListDeliverType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAUDIENCE_LIST_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceAudienceListTarget object is a container for storing audience list targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is AUDIENCE_LIST_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAUDIENCE_LIST_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAudienceListTarget object is a container for storing audience list targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is AUDIENCE_LIST_TARGET, this field is required. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceAudienceListTarget.JSON_PROPERTY_AUDIENCE_LIST_NAME,
  GuaranteedSimulationServiceAudienceListTarget.JSON_PROPERTY_DELIVER_TYPE
})
@JsonTypeName("GuaranteedSimulationServiceAudienceListTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceAudienceListTarget {
  public static final String JSON_PROPERTY_AUDIENCE_LIST_NAME = "audienceListName";
  private String audienceListName;

  public static final String JSON_PROPERTY_DELIVER_TYPE = "deliverType";
  private GuaranteedSimulationServiceAudienceListDeliverType deliverType;

  public GuaranteedSimulationServiceAudienceListTarget() { 
  }

  public GuaranteedSimulationServiceAudienceListTarget audienceListName(String audienceListName) {
    
    this.audienceListName = audienceListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスリスト名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience list name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return audienceListName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public GuaranteedSimulationServiceAudienceListTarget deliverType(GuaranteedSimulationServiceAudienceListDeliverType deliverType) {
    
    this.deliverType = deliverType;
    return this;
  }

   /**
   * Get deliverType
   * @return deliverType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceAudienceListDeliverType getDeliverType() {
    return deliverType;
  }


  @JsonProperty(JSON_PROPERTY_DELIVER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliverType(GuaranteedSimulationServiceAudienceListDeliverType deliverType) {
    this.deliverType = deliverType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceAudienceListTarget guaranteedSimulationServiceAudienceListTarget = (GuaranteedSimulationServiceAudienceListTarget) o;
    return Objects.equals(this.audienceListName, guaranteedSimulationServiceAudienceListTarget.audienceListName) &&
        Objects.equals(this.deliverType, guaranteedSimulationServiceAudienceListTarget.deliverType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListName, deliverType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAudienceListTarget {\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
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


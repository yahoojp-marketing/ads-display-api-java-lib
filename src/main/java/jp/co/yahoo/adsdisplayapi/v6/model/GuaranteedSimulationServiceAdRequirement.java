/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceAdType;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServicePackagePermissionType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceAdRequirementオブジェクトは、予約型の広告を構成する条件を表します。&lt;br&gt; ADD時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceAdRequirement object describes the conditions for composing the guaranteed ad.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceAdRequirementオブジェクトは、予約型の広告を構成する条件を表します。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAdRequirement object describes the conditions for composing the guaranteed ad.<br> This field is required in ADD operation. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceAdRequirement.JSON_PROPERTY_AD_TYPE,
  GuaranteedSimulationServiceAdRequirement.JSON_PROPERTY_MEDIA_AD_FORMAT,
  GuaranteedSimulationServiceAdRequirement.JSON_PROPERTY_ASPECT_RATIO,
  GuaranteedSimulationServiceAdRequirement.JSON_PROPERTY_AD_TYPE_PERMISSION
})
@JsonTypeName("GuaranteedSimulationServiceAdRequirement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceAdRequirement {
  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private GuaranteedSimulationServiceAdType adType;

  public static final String JSON_PROPERTY_MEDIA_AD_FORMAT = "mediaAdFormat";
  private String mediaAdFormat;

  public static final String JSON_PROPERTY_ASPECT_RATIO = "aspectRatio";
  private String aspectRatio;

  public static final String JSON_PROPERTY_AD_TYPE_PERMISSION = "adTypePermission";
  private GuaranteedSimulationServicePackagePermissionType adTypePermission;

  public GuaranteedSimulationServiceAdRequirement() { 
  }

  public GuaranteedSimulationServiceAdRequirement adType(GuaranteedSimulationServiceAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceAdType getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(GuaranteedSimulationServiceAdType adType) {
    this.adType = adType;
  }


  public GuaranteedSimulationServiceAdRequirement mediaAdFormat(String mediaAdFormat) {
    
    this.mediaAdFormat = mediaAdFormat;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; メディアのフォーマットです。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;br&gt; ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのadFormatフィールドをご確認ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media format.&lt;br&gt; In ADD operation, this field will be required.&lt;br&gt; *Refer to the adFormat field of DictionaryServiceMediaAdFormat which can be obtained via getMediaAdFormat in DictionaryService, to check the values that can be specified in this field. &lt;/div&gt; 
   * @return mediaAdFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアのフォーマットです。<br> ADD時、このフィールドは必須となります。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのadFormatフィールドをご確認ください。 </div> <div lang=\"en\"> Media format.<br> In ADD operation, this field will be required.<br> *Refer to the adFormat field of DictionaryServiceMediaAdFormat which can be obtained via getMediaAdFormat in DictionaryService, to check the values that can be specified in this field. </div> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaAdFormat() {
    return mediaAdFormat;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
  }


  public GuaranteedSimulationServiceAdRequirement aspectRatio(String aspectRatio) {
    
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アスペクト比の種類です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Aspect ratio type.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return aspectRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アスペクト比の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Aspect ratio type.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAspectRatio() {
    return aspectRatio;
  }


  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }


  public GuaranteedSimulationServiceAdRequirement adTypePermission(GuaranteedSimulationServicePackagePermissionType adTypePermission) {
    
    this.adTypePermission = adTypePermission;
    return this;
  }

   /**
   * Get adTypePermission
   * @return adTypePermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPE_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServicePackagePermissionType getAdTypePermission() {
    return adTypePermission;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdTypePermission(GuaranteedSimulationServicePackagePermissionType adTypePermission) {
    this.adTypePermission = adTypePermission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceAdRequirement guaranteedSimulationServiceAdRequirement = (GuaranteedSimulationServiceAdRequirement) o;
    return Objects.equals(this.adType, guaranteedSimulationServiceAdRequirement.adType) &&
        Objects.equals(this.mediaAdFormat, guaranteedSimulationServiceAdRequirement.mediaAdFormat) &&
        Objects.equals(this.aspectRatio, guaranteedSimulationServiceAdRequirement.aspectRatio) &&
        Objects.equals(this.adTypePermission, guaranteedSimulationServiceAdRequirement.adTypePermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, mediaAdFormat, aspectRatio, adTypePermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAdRequirement {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    mediaAdFormat: ").append(toIndentedString(mediaAdFormat)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    adTypePermission: ").append(toIndentedString(adTypePermission)).append("\n");
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


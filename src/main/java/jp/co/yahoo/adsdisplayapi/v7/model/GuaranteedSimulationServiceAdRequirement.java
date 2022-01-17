package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceAdType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServicePackagePermissionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceAdRequirementオブジェクトは、予約型の広告を構成する条件を表します。&lt;br&gt; ADD時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceAdRequirement object describes the conditions for composing the guaranteed ad.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceAdRequirementオブジェクトは、予約型の広告を構成する条件を表します。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAdRequirement object describes the conditions for composing the guaranteed ad.<br> This field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceAdRequirement   {
  @JsonProperty("adType")
  private GuaranteedSimulationServiceAdType adType = null;

  @JsonProperty("mediaAdFormat")
  private String mediaAdFormat = null;

  @JsonProperty("aspectRatio")
  private String aspectRatio = null;

  @JsonProperty("adTypePermission")
  private GuaranteedSimulationServicePackagePermissionType adTypePermission = null;

  public GuaranteedSimulationServiceAdRequirement adType(GuaranteedSimulationServiceAdType adType) {
    this.adType = adType;
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAdType getAdType() {
    return adType;
  }

  public void setAdType(GuaranteedSimulationServiceAdType adType) {
    this.adType = adType;
  }

  public GuaranteedSimulationServiceAdRequirement mediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアのフォーマットです。<br> ADD時、このフィールドは必須となります。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのadFormatフィールドをご確認ください。 </div> <div lang=\"en\"> Media format.<br> In ADD operation, this field will be required.<br> *Refer to the adFormat field of DictionaryServiceMediaAdFormat which can be obtained via getMediaAdFormat in DictionaryService, to check the values that can be specified in this field. </div> 
   * @return mediaAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアのフォーマットです。<br> ADD時、このフィールドは必須となります。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのadFormatフィールドをご確認ください。 </div> <div lang=\"en\"> Media format.<br> In ADD operation, this field will be required.<br> *Refer to the adFormat field of DictionaryServiceMediaAdFormat which can be obtained via getMediaAdFormat in DictionaryService, to check the values that can be specified in this field. </div> ")


  public String getMediaAdFormat() {
    return mediaAdFormat;
  }

  public void setMediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
  }

  public GuaranteedSimulationServiceAdRequirement aspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

  /**
   * <div lang=\"ja\"> アスペクト比の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Aspect ratio type.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return aspectRatio
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アスペクト比の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Aspect ratio type.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAspectRatio() {
    return aspectRatio;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackagePermissionType getAdTypePermission() {
    return adTypePermission;
  }

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


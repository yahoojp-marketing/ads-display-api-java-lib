package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedInventoryServiceAdType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceAdRequirementオブジェクトは、予約型の広告を構成する条件を表します。&lt;br&gt; ADD時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceAdRequirement object describes the conditions for composing the guaranteed ad.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceAdRequirementオブジェクトは、予約型の広告を構成する条件を表します。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> GuaranteedInventoryServiceAdRequirement object describes the conditions for composing the guaranteed ad.<br> This field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceAdRequirement   {
  @JsonProperty("adType")
  private GuaranteedInventoryServiceAdType adType = null;

  @JsonProperty("mediaAdFormat")
  private String mediaAdFormat = null;

  @JsonProperty("aspectRatio")
  private String aspectRatio = null;

  public GuaranteedInventoryServiceAdRequirement adType(GuaranteedInventoryServiceAdType adType) {
    this.adType = adType;
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceAdType getAdType() {
    return adType;
  }

  public void setAdType(GuaranteedInventoryServiceAdType adType) {
    this.adType = adType;
  }

  public GuaranteedInventoryServiceAdRequirement mediaAdFormat(String mediaAdFormat) {
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

  public GuaranteedInventoryServiceAdRequirement aspectRatio(String aspectRatio) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceAdRequirement guaranteedInventoryServiceAdRequirement = (GuaranteedInventoryServiceAdRequirement) o;
    return Objects.equals(this.adType, guaranteedInventoryServiceAdRequirement.adType) &&
        Objects.equals(this.mediaAdFormat, guaranteedInventoryServiceAdRequirement.mediaAdFormat) &&
        Objects.equals(this.aspectRatio, guaranteedInventoryServiceAdRequirement.aspectRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, mediaAdFormat, aspectRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceAdRequirement {\n");
    
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    mediaAdFormat: ").append(toIndentedString(mediaAdFormat)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
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


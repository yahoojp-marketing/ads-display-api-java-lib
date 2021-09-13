package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewServiceMaterialAdオブジェクトは、プレビュー素材（広告）の情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedPreviewServiceMaterialAd object holds information about the preview material (ad).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewServiceMaterialAdオブジェクトは、プレビュー素材（広告）の情報を保持します。</div> <div lang=\"en\">GuaranteedPreviewServiceMaterialAd object holds information about the preview material (ad).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedPreviewServiceMaterialAd   {
  @JsonProperty("adId")
  private Long adId = null;

  public GuaranteedPreviewServiceMaterialAd adId(Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告IDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad ID.<br> This field is required in requests. </div> 
   * @return adId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告IDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad ID.<br> This field is required in requests. </div> ")


  public Long getAdId() {
    return adId;
  }

  public void setAdId(Long adId) {
    this.adId = adId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedPreviewServiceMaterialAd guaranteedPreviewServiceMaterialAd = (GuaranteedPreviewServiceMaterialAd) o;
    return Objects.equals(this.adId, guaranteedPreviewServiceMaterialAd.adId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreviewServiceMaterialAd {\n");
    
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedPreviewServiceMaterial;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewオブジェクトは、予約型キャンペーンのプレビュー情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedPreview object is a container for storing preview of the guaranteed campaign information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewオブジェクトは、予約型キャンペーンのプレビュー情報を保持します。</div> <div lang=\"en\">The GuaranteedPreview object is a container for storing preview of the guaranteed campaign information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedPreview   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("material")
  private GuaranteedPreviewServiceMaterial material = null;

  @JsonProperty("previewUrl")
  private String previewUrl = null;

  public GuaranteedPreview accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedPreview material(GuaranteedPreviewServiceMaterial material) {
    this.material = material;
    return this;
  }

  /**
   * Get material
   * @return material
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedPreviewServiceMaterial getMaterial() {
    return material;
  }

  public void setMaterial(GuaranteedPreviewServiceMaterial material) {
    this.material = material;
  }

  public GuaranteedPreview previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> プレビューURLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Preview URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return previewUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> プレビューURLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Preview URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedPreview guaranteedPreview = (GuaranteedPreview) o;
    return Objects.equals(this.accountId, guaranteedPreview.accountId) &&
        Objects.equals(this.material, guaranteedPreview.material) &&
        Objects.equals(this.previewUrl, guaranteedPreview.previewUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, material, previewUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreview {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
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


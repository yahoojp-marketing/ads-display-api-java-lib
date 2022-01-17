package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedPreviewServiceMaterial;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewServiceSelectorオブジェクトは、getメソッドのプレビュー情報の取得条件を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedPreviewServiceSelector object holds acquisition conditions of preview information in the get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewServiceSelectorオブジェクトは、getメソッドのプレビュー情報の取得条件を保持します。</div> <div lang=\"en\">GuaranteedPreviewServiceSelector object holds acquisition conditions of preview information in the get method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedPreviewServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("material")
  private GuaranteedPreviewServiceMaterial material = null;

  public GuaranteedPreviewServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedPreviewServiceSelector material(GuaranteedPreviewServiceMaterial material) {
    this.material = material;
    return this;
  }

  /**
   * Get material
   * @return material
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GuaranteedPreviewServiceMaterial getMaterial() {
    return material;
  }

  public void setMaterial(GuaranteedPreviewServiceMaterial material) {
    this.material = material;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedPreviewServiceSelector guaranteedPreviewServiceSelector = (GuaranteedPreviewServiceSelector) o;
    return Objects.equals(this.accountId, guaranteedPreviewServiceSelector.accountId) &&
        Objects.equals(this.material, guaranteedPreviewServiceSelector.material);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, material);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreviewServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
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


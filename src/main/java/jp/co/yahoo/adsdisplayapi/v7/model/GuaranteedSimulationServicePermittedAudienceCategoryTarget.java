package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedAudienceCategoryTarget object contains information about audience category targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedAudienceCategoryTarget object contains information about audience category targeting settings.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePermittedAudienceCategoryTarget   {
  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("categoryFullNameEn")
  private String categoryFullNameEn = null;

  @JsonProperty("categoryFullNameJa")
  private String categoryFullNameJa = null;

  public GuaranteedSimulationServicePermittedAudienceCategoryTarget targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> ")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServicePermittedAudienceCategoryTarget categoryFullNameEn(String categoryFullNameEn) {
    this.categoryFullNameEn = categoryFullNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（英語）</div> <div lang=\"en\">Site category name (English)</div> 
   * @return categoryFullNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（英語）</div> <div lang=\"en\">Site category name (English)</div> ")


  public String getCategoryFullNameEn() {
    return categoryFullNameEn;
  }

  public void setCategoryFullNameEn(String categoryFullNameEn) {
    this.categoryFullNameEn = categoryFullNameEn;
  }

  public GuaranteedSimulationServicePermittedAudienceCategoryTarget categoryFullNameJa(String categoryFullNameJa) {
    this.categoryFullNameJa = categoryFullNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（日本語）</div> <div lang=\"en\">Interest category name (Japanese)</div> 
   * @return categoryFullNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（日本語）</div> <div lang=\"en\">Interest category name (Japanese)</div> ")


  public String getCategoryFullNameJa() {
    return categoryFullNameJa;
  }

  public void setCategoryFullNameJa(String categoryFullNameJa) {
    this.categoryFullNameJa = categoryFullNameJa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedAudienceCategoryTarget guaranteedSimulationServicePermittedAudienceCategoryTarget = (GuaranteedSimulationServicePermittedAudienceCategoryTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedAudienceCategoryTarget.targetId) &&
        Objects.equals(this.categoryFullNameEn, guaranteedSimulationServicePermittedAudienceCategoryTarget.categoryFullNameEn) &&
        Objects.equals(this.categoryFullNameJa, guaranteedSimulationServicePermittedAudienceCategoryTarget.categoryFullNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, categoryFullNameEn, categoryFullNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedAudienceCategoryTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    categoryFullNameEn: ").append(toIndentedString(categoryFullNameEn)).append("\n");
    sb.append("    categoryFullNameJa: ").append(toIndentedString(categoryFullNameJa)).append("\n");
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


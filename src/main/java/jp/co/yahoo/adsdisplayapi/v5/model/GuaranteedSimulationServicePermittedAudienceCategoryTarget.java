package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedAudienceCategoryTarget object contains information about audience category targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリーターゲティングの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedAudienceCategoryTarget object contains information about audience category targeting settings.</div> ")

public class GuaranteedSimulationServicePermittedAudienceCategoryTarget   {
  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("categoryFullNameEn")
  private JsonNullable<String> categoryFullNameEn = JsonNullable.undefined();

  @JsonProperty("categoryFullNameJa")
  private JsonNullable<String> categoryFullNameJa = JsonNullable.undefined();

  public GuaranteedSimulationServicePermittedAudienceCategoryTarget targetId(String targetId) {
    this.targetId = JsonNullable.of(targetId);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> ")


  public JsonNullable<String> getTargetId() {
    return targetId;
  }

  public void setTargetId(JsonNullable<String> targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServicePermittedAudienceCategoryTarget categoryFullNameEn(String categoryFullNameEn) {
    this.categoryFullNameEn = JsonNullable.of(categoryFullNameEn);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（英語）</div> <div lang=\"en\">Site category name (English)</div> 
   * @return categoryFullNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（英語）</div> <div lang=\"en\">Site category name (English)</div> ")


  public JsonNullable<String> getCategoryFullNameEn() {
    return categoryFullNameEn;
  }

  public void setCategoryFullNameEn(JsonNullable<String> categoryFullNameEn) {
    this.categoryFullNameEn = categoryFullNameEn;
  }

  public GuaranteedSimulationServicePermittedAudienceCategoryTarget categoryFullNameJa(String categoryFullNameJa) {
    this.categoryFullNameJa = JsonNullable.of(categoryFullNameJa);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（日本語）</div> <div lang=\"en\">Interest category name (Japanese)</div> 
   * @return categoryFullNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（日本語）</div> <div lang=\"en\">Interest category name (Japanese)</div> ")


  public JsonNullable<String> getCategoryFullNameJa() {
    return categoryFullNameJa;
  }

  public void setCategoryFullNameJa(JsonNullable<String> categoryFullNameJa) {
    this.categoryFullNameJa = categoryFullNameJa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


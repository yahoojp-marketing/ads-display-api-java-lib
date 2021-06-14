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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceAdCategoryオブジェクトは、広告カテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceAdCategory object contains ad category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceAdCategoryオブジェクトは、広告カテゴリー情報を格納するコンテナです。</div> <div lang=\"en\">GuaranteedSimulationServiceAdCategory object contains ad category information.</div> ")

public class GuaranteedSimulationServiceAdCategory   {
  @JsonProperty("adCategoryId")
  private JsonNullable<String> adCategoryId = JsonNullable.undefined();

  @JsonProperty("adCategoryName")
  private JsonNullable<String> adCategoryName = JsonNullable.undefined();

  @JsonProperty("parentCategoryId")
  private JsonNullable<String> parentCategoryId = JsonNullable.undefined();

  @JsonProperty("parentCategoryName")
  private JsonNullable<String> parentCategoryName = JsonNullable.undefined();

  public GuaranteedSimulationServiceAdCategory adCategoryId(String adCategoryId) {
    this.adCategoryId = JsonNullable.of(adCategoryId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告カテゴリーIDを表します。</div> <div lang=\"en\">Ad category ID.</div> 
   * @return adCategoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告カテゴリーIDを表します。</div> <div lang=\"en\">Ad category ID.</div> ")


  public JsonNullable<String> getAdCategoryId() {
    return adCategoryId;
  }

  public void setAdCategoryId(JsonNullable<String> adCategoryId) {
    this.adCategoryId = adCategoryId;
  }

  public GuaranteedSimulationServiceAdCategory adCategoryName(String adCategoryName) {
    this.adCategoryName = JsonNullable.of(adCategoryName);
    return this;
  }

  /**
   * <div lang=\"ja\">広告カテゴリー名を表します。</div> <div lang=\"en\">Ad category name.</div> 
   * @return adCategoryName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告カテゴリー名を表します。</div> <div lang=\"en\">Ad category name.</div> ")


  public JsonNullable<String> getAdCategoryName() {
    return adCategoryName;
  }

  public void setAdCategoryName(JsonNullable<String> adCategoryName) {
    this.adCategoryName = adCategoryName;
  }

  public GuaranteedSimulationServiceAdCategory parentCategoryId(String parentCategoryId) {
    this.parentCategoryId = JsonNullable.of(parentCategoryId);
    return this;
  }

  /**
   * <div lang=\"ja\">親カテゴリIDを表します。</div> <div lang=\"en\">Parent category ID.</div> 
   * @return parentCategoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">親カテゴリIDを表します。</div> <div lang=\"en\">Parent category ID.</div> ")


  public JsonNullable<String> getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(JsonNullable<String> parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  public GuaranteedSimulationServiceAdCategory parentCategoryName(String parentCategoryName) {
    this.parentCategoryName = JsonNullable.of(parentCategoryName);
    return this;
  }

  /**
   * <div lang=\"ja\">親カテゴリ名を表します。</div> <div lang=\"en\">Parent category name.</div> 
   * @return parentCategoryName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">親カテゴリ名を表します。</div> <div lang=\"en\">Parent category name.</div> ")


  public JsonNullable<String> getParentCategoryName() {
    return parentCategoryName;
  }

  public void setParentCategoryName(JsonNullable<String> parentCategoryName) {
    this.parentCategoryName = parentCategoryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceAdCategory guaranteedSimulationServiceAdCategory = (GuaranteedSimulationServiceAdCategory) o;
    return Objects.equals(this.adCategoryId, guaranteedSimulationServiceAdCategory.adCategoryId) &&
        Objects.equals(this.adCategoryName, guaranteedSimulationServiceAdCategory.adCategoryName) &&
        Objects.equals(this.parentCategoryId, guaranteedSimulationServiceAdCategory.parentCategoryId) &&
        Objects.equals(this.parentCategoryName, guaranteedSimulationServiceAdCategory.parentCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCategoryId, adCategoryName, parentCategoryId, parentCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAdCategory {\n");
    
    sb.append("    adCategoryId: ").append(toIndentedString(adCategoryId)).append("\n");
    sb.append("    adCategoryName: ").append(toIndentedString(adCategoryName)).append("\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
    sb.append("    parentCategoryName: ").append(toIndentedString(parentCategoryName)).append("\n");
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


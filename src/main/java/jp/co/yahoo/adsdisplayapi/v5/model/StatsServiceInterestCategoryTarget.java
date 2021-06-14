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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceInterestCategoryTargetオブジェクトは、インタレストカテゴリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceInterestCategoryTarget object holds configuration information of Interest category targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceInterestCategoryTargetオブジェクトは、インタレストカテゴリターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceInterestCategoryTarget object holds configuration information of Interest category targeting.</div> ")

public class StatsServiceInterestCategoryTarget   {
  @JsonProperty("categoryFullNameEn")
  private JsonNullable<String> categoryFullNameEn = JsonNullable.undefined();

  @JsonProperty("categoryFullNameJa")
  private JsonNullable<String> categoryFullNameJa = JsonNullable.undefined();

  public StatsServiceInterestCategoryTarget categoryFullNameEn(String categoryFullNameEn) {
    this.categoryFullNameEn = JsonNullable.of(categoryFullNameEn);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（英語）</div> <div lang=\"en\">Interest category name (English)</div> 
   * @return categoryFullNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（英語）</div> <div lang=\"en\">Interest category name (English)</div> ")


  public JsonNullable<String> getCategoryFullNameEn() {
    return categoryFullNameEn;
  }

  public void setCategoryFullNameEn(JsonNullable<String> categoryFullNameEn) {
    this.categoryFullNameEn = categoryFullNameEn;
  }

  public StatsServiceInterestCategoryTarget categoryFullNameJa(String categoryFullNameJa) {
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
    StatsServiceInterestCategoryTarget statsServiceInterestCategoryTarget = (StatsServiceInterestCategoryTarget) o;
    return Objects.equals(this.categoryFullNameEn, statsServiceInterestCategoryTarget.categoryFullNameEn) &&
        Objects.equals(this.categoryFullNameJa, statsServiceInterestCategoryTarget.categoryFullNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryFullNameEn, categoryFullNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceInterestCategoryTarget {\n");
    
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


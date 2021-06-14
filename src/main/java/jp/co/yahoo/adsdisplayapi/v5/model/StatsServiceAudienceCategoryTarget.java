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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAudienceCategoryTarget object contains configuration information of Audience Category targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAudienceCategoryTarget object contains configuration information of Audience Category targeting.</div> ")

public class StatsServiceAudienceCategoryTarget   {
  @JsonProperty("audienceCategoryType")
  private JsonNullable<String> audienceCategoryType = JsonNullable.undefined();

  @JsonProperty("categoryNameEn")
  private JsonNullable<String> categoryNameEn = JsonNullable.undefined();

  @JsonProperty("categoryNameJa")
  private JsonNullable<String> categoryNameJa = JsonNullable.undefined();

  public StatsServiceAudienceCategoryTarget audienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = JsonNullable.of(audienceCategoryType);
    return this;
  }

  /**
   * <div lang=\"ja\"> 提供されるカテゴリの種別を表します。<br> *返却される値の詳細については、DictionaryServiceで取得されるDictionaryServiceAudienceCategoryオブジェクトのaudienceCategoryTypeフィールドをご参照ください。 </div> <div lang=\"en\"> Audience category information.<br> *For details of the returned value, refer to the audienceCategoryType field of DictionaryServiceAudienceCategory object obtained via DictionaryService. </div> 
   * @return audienceCategoryType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 提供されるカテゴリの種別を表します。<br> *返却される値の詳細については、DictionaryServiceで取得されるDictionaryServiceAudienceCategoryオブジェクトのaudienceCategoryTypeフィールドをご参照ください。 </div> <div lang=\"en\"> Audience category information.<br> *For details of the returned value, refer to the audienceCategoryType field of DictionaryServiceAudienceCategory object obtained via DictionaryService. </div> ")


  public JsonNullable<String> getAudienceCategoryType() {
    return audienceCategoryType;
  }

  public void setAudienceCategoryType(JsonNullable<String> audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
  }

  public StatsServiceAudienceCategoryTarget categoryNameEn(String categoryNameEn) {
    this.categoryNameEn = JsonNullable.of(categoryNameEn);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（英語）です。</div> <div lang=\"en\">Category name (English)</div> 
   * @return categoryNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（英語）です。</div> <div lang=\"en\">Category name (English)</div> ")


  public JsonNullable<String> getCategoryNameEn() {
    return categoryNameEn;
  }

  public void setCategoryNameEn(JsonNullable<String> categoryNameEn) {
    this.categoryNameEn = categoryNameEn;
  }

  public StatsServiceAudienceCategoryTarget categoryNameJa(String categoryNameJa) {
    this.categoryNameJa = JsonNullable.of(categoryNameJa);
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（日本語）です。</div> <div lang=\"en\">Category name (Japanese)</div> 
   * @return categoryNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（日本語）です。</div> <div lang=\"en\">Category name (Japanese)</div> ")


  public JsonNullable<String> getCategoryNameJa() {
    return categoryNameJa;
  }

  public void setCategoryNameJa(JsonNullable<String> categoryNameJa) {
    this.categoryNameJa = categoryNameJa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceAudienceCategoryTarget statsServiceAudienceCategoryTarget = (StatsServiceAudienceCategoryTarget) o;
    return Objects.equals(this.audienceCategoryType, statsServiceAudienceCategoryTarget.audienceCategoryType) &&
        Objects.equals(this.categoryNameEn, statsServiceAudienceCategoryTarget.categoryNameEn) &&
        Objects.equals(this.categoryNameJa, statsServiceAudienceCategoryTarget.categoryNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceCategoryType, categoryNameEn, categoryNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAudienceCategoryTarget {\n");
    
    sb.append("    audienceCategoryType: ").append(toIndentedString(audienceCategoryType)).append("\n");
    sb.append("    categoryNameEn: ").append(toIndentedString(categoryNameEn)).append("\n");
    sb.append("    categoryNameJa: ").append(toIndentedString(categoryNameJa)).append("\n");
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


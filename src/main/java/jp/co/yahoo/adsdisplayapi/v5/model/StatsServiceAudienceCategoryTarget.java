package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAudienceCategoryTarget object contains configuration information of Audience Category targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAudienceCategoryTargetオブジェクトは、オーディエンスカテゴリターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAudienceCategoryTarget object contains configuration information of Audience Category targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceAudienceCategoryTarget   {
  @JsonProperty("audienceCategoryType")
  private String audienceCategoryType = null;

  @JsonProperty("categoryNameEn")
  private String categoryNameEn = null;

  @JsonProperty("categoryNameJa")
  private String categoryNameJa = null;

  public StatsServiceAudienceCategoryTarget audienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
    return this;
  }

  /**
   * <div lang=\"ja\"> 提供されるカテゴリの種別を表します。<br> *返却される値の詳細については、DictionaryServiceで取得されるDictionaryServiceAudienceCategoryオブジェクトのaudienceCategoryTypeフィールドをご参照ください。 </div> <div lang=\"en\"> Audience category information.<br> *For details of the returned value, refer to the audienceCategoryType field of DictionaryServiceAudienceCategory object obtained via DictionaryService. </div> 
   * @return audienceCategoryType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 提供されるカテゴリの種別を表します。<br> *返却される値の詳細については、DictionaryServiceで取得されるDictionaryServiceAudienceCategoryオブジェクトのaudienceCategoryTypeフィールドをご参照ください。 </div> <div lang=\"en\"> Audience category information.<br> *For details of the returned value, refer to the audienceCategoryType field of DictionaryServiceAudienceCategory object obtained via DictionaryService. </div> ")


  public String getAudienceCategoryType() {
    return audienceCategoryType;
  }

  public void setAudienceCategoryType(String audienceCategoryType) {
    this.audienceCategoryType = audienceCategoryType;
  }

  public StatsServiceAudienceCategoryTarget categoryNameEn(String categoryNameEn) {
    this.categoryNameEn = categoryNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（英語）です。</div> <div lang=\"en\">Category name (English)</div> 
   * @return categoryNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（英語）です。</div> <div lang=\"en\">Category name (English)</div> ")


  public String getCategoryNameEn() {
    return categoryNameEn;
  }

  public void setCategoryNameEn(String categoryNameEn) {
    this.categoryNameEn = categoryNameEn;
  }

  public StatsServiceAudienceCategoryTarget categoryNameJa(String categoryNameJa) {
    this.categoryNameJa = categoryNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\">カテゴリ名（日本語）です。</div> <div lang=\"en\">Category name (Japanese)</div> 
   * @return categoryNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カテゴリ名（日本語）です。</div> <div lang=\"en\">Category name (Japanese)</div> ")


  public String getCategoryNameJa() {
    return categoryNameJa;
  }

  public void setCategoryNameJa(String categoryNameJa) {
    this.categoryNameJa = categoryNameJa;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


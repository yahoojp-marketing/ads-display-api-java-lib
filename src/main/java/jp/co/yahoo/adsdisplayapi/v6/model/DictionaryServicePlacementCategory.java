package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; DictionaryServicePlacementCategoryオブジェクトは、駅情報を保持します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; DictionaryServicePlacementCategory object contains information about station.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> DictionaryServicePlacementCategoryオブジェクトは、駅情報を保持します。<br> </div> <div lang=\"en\"> DictionaryServicePlacementCategory object contains information about station.<br> </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServicePlacementCategory   {
  @JsonProperty("placementCategoryId")
  private Long placementCategoryId;

  @JsonProperty("placementCategoryNameJa")
  private String placementCategoryNameJa = null;

  @JsonProperty("placementCategoryNameEn")
  private String placementCategoryNameEn = null;

  public DictionaryServicePlacementCategory placementCategoryId(Long placementCategoryId) {
    this.placementCategoryId = placementCategoryId;
    return this;
  }

  /**
   * <div lang=\"ja\"> プレイスメントカテゴリーIDです。<br> </div> <div lang=\"en\"> Placement category ID.<br> </div> 
   * @return placementCategoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> プレイスメントカテゴリーIDです。<br> </div> <div lang=\"en\"> Placement category ID.<br> </div> ")


  public Long getPlacementCategoryId() {
    return placementCategoryId;
  }

  public void setPlacementCategoryId(Long placementCategoryId) {
    this.placementCategoryId = placementCategoryId;
  }

  public DictionaryServicePlacementCategory placementCategoryNameJa(String placementCategoryNameJa) {
    this.placementCategoryNameJa = placementCategoryNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\"> 駅名(日本語)です。<br> </div> <div lang=\"en\"> Station name(Ja)<br> </div> 
   * @return placementCategoryNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 駅名(日本語)です。<br> </div> <div lang=\"en\"> Station name(Ja)<br> </div> ")


  public String getPlacementCategoryNameJa() {
    return placementCategoryNameJa;
  }

  public void setPlacementCategoryNameJa(String placementCategoryNameJa) {
    this.placementCategoryNameJa = placementCategoryNameJa;
  }

  public DictionaryServicePlacementCategory placementCategoryNameEn(String placementCategoryNameEn) {
    this.placementCategoryNameEn = placementCategoryNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\"> 駅名(英語)です。<br> </div> <div lang=\"en\"> Station name(Eng)<br> </div> 
   * @return placementCategoryNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 駅名(英語)です。<br> </div> <div lang=\"en\"> Station name(Eng)<br> </div> ")


  public String getPlacementCategoryNameEn() {
    return placementCategoryNameEn;
  }

  public void setPlacementCategoryNameEn(String placementCategoryNameEn) {
    this.placementCategoryNameEn = placementCategoryNameEn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServicePlacementCategory dictionaryServicePlacementCategory = (DictionaryServicePlacementCategory) o;
    return Objects.equals(this.placementCategoryId, dictionaryServicePlacementCategory.placementCategoryId) &&
        Objects.equals(this.placementCategoryNameJa, dictionaryServicePlacementCategory.placementCategoryNameJa) &&
        Objects.equals(this.placementCategoryNameEn, dictionaryServicePlacementCategory.placementCategoryNameEn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryId, placementCategoryNameJa, placementCategoryNameEn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServicePlacementCategory {\n");
    
    sb.append("    placementCategoryId: ").append(toIndentedString(placementCategoryId)).append("\n");
    sb.append("    placementCategoryNameJa: ").append(toIndentedString(placementCategoryNameJa)).append("\n");
    sb.append("    placementCategoryNameEn: ").append(toIndentedString(placementCategoryNameEn)).append("\n");
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


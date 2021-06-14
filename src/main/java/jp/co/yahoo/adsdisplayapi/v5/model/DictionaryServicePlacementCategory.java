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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; DictionaryServicePlacementCategoryオブジェクトは、駅情報を保持します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; DictionaryServicePlacementCategory object contains information about station.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> DictionaryServicePlacementCategoryオブジェクトは、駅情報を保持します。<br> </div> <div lang=\"en\"> DictionaryServicePlacementCategory object contains information about station.<br> </div> ")

public class DictionaryServicePlacementCategory   {
  @JsonProperty("placementCategoryId")
  private Long placementCategoryId;

  @JsonProperty("placementCategoryNameJa")
  private JsonNullable<String> placementCategoryNameJa = JsonNullable.undefined();

  @JsonProperty("placementCategoryNameEn")
  private JsonNullable<String> placementCategoryNameEn = JsonNullable.undefined();

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
    this.placementCategoryNameJa = JsonNullable.of(placementCategoryNameJa);
    return this;
  }

  /**
   * <div lang=\"ja\"> 駅名(日本語)です。<br> </div> <div lang=\"en\"> Station name(Ja)<br> </div> 
   * @return placementCategoryNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 駅名(日本語)です。<br> </div> <div lang=\"en\"> Station name(Ja)<br> </div> ")


  public JsonNullable<String> getPlacementCategoryNameJa() {
    return placementCategoryNameJa;
  }

  public void setPlacementCategoryNameJa(JsonNullable<String> placementCategoryNameJa) {
    this.placementCategoryNameJa = placementCategoryNameJa;
  }

  public DictionaryServicePlacementCategory placementCategoryNameEn(String placementCategoryNameEn) {
    this.placementCategoryNameEn = JsonNullable.of(placementCategoryNameEn);
    return this;
  }

  /**
   * <div lang=\"ja\"> 駅名(英語)です。<br> </div> <div lang=\"en\"> Station name(Eng)<br> </div> 
   * @return placementCategoryNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 駅名(英語)です。<br> </div> <div lang=\"en\"> Station name(Eng)<br> </div> ")


  public JsonNullable<String> getPlacementCategoryNameEn() {
    return placementCategoryNameEn;
  }

  public void setPlacementCategoryNameEn(JsonNullable<String> placementCategoryNameEn) {
    this.placementCategoryNameEn = placementCategoryNameEn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


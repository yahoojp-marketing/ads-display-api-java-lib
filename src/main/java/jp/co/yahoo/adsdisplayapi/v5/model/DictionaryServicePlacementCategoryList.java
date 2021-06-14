package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServicePlacementCategory;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServicePlacementCategoryListオブジェクトは、駅情報のリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServicePlacementCategoryList object displays the list of station.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServicePlacementCategoryListオブジェクトは、駅情報のリストを表します。</div> <div lang=\"en\">DictionaryServicePlacementCategoryList object displays the list of station.</div> ")

public class DictionaryServicePlacementCategoryList   {
  @JsonProperty("placementCategoryListId")
  private Long placementCategoryListId;

  @JsonProperty("placementCategoryListName")
  private JsonNullable<String> placementCategoryListName = JsonNullable.undefined();

  @JsonProperty("placementCategories")
  @Valid
  private JsonNullable<List<DictionaryServicePlacementCategory>> placementCategories = JsonNullable.undefined();

  public DictionaryServicePlacementCategoryList placementCategoryListId(Long placementCategoryListId) {
    this.placementCategoryListId = placementCategoryListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> プレイスメントカテゴリーリストIDです。<br> </div> <div lang=\"en\"> Placement category list ID.<br> </div> 
   * @return placementCategoryListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> プレイスメントカテゴリーリストIDです。<br> </div> <div lang=\"en\"> Placement category list ID.<br> </div> ")


  public Long getPlacementCategoryListId() {
    return placementCategoryListId;
  }

  public void setPlacementCategoryListId(Long placementCategoryListId) {
    this.placementCategoryListId = placementCategoryListId;
  }

  public DictionaryServicePlacementCategoryList placementCategoryListName(String placementCategoryListName) {
    this.placementCategoryListName = JsonNullable.of(placementCategoryListName);
    return this;
  }

  /**
   * <div lang=\"ja\"> プライスメントカテゴリリスト名です。<br> </div> <div lang=\"en\"> Placement category list name.<br> </div> 
   * @return placementCategoryListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> プライスメントカテゴリリスト名です。<br> </div> <div lang=\"en\"> Placement category list name.<br> </div> ")


  public JsonNullable<String> getPlacementCategoryListName() {
    return placementCategoryListName;
  }

  public void setPlacementCategoryListName(JsonNullable<String> placementCategoryListName) {
    this.placementCategoryListName = placementCategoryListName;
  }

  public DictionaryServicePlacementCategoryList placementCategories(List<DictionaryServicePlacementCategory> placementCategories) {
    this.placementCategories = JsonNullable.of(placementCategories);
    return this;
  }

  public DictionaryServicePlacementCategoryList addPlacementCategoriesItem(DictionaryServicePlacementCategory placementCategoriesItem) {
    if (this.placementCategories == null || !this.placementCategories.isPresent()) {
      this.placementCategories = JsonNullable.of(new ArrayList<>());
    }
    this.placementCategories.get().add(placementCategoriesItem);
    return this;
  }

  /**
   * Get placementCategories
   * @return placementCategories
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<DictionaryServicePlacementCategory>> getPlacementCategories() {
    return placementCategories;
  }

  public void setPlacementCategories(JsonNullable<List<DictionaryServicePlacementCategory>> placementCategories) {
    this.placementCategories = placementCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServicePlacementCategoryList dictionaryServicePlacementCategoryList = (DictionaryServicePlacementCategoryList) o;
    return Objects.equals(this.placementCategoryListId, dictionaryServicePlacementCategoryList.placementCategoryListId) &&
        Objects.equals(this.placementCategoryListName, dictionaryServicePlacementCategoryList.placementCategoryListName) &&
        Objects.equals(this.placementCategories, dictionaryServicePlacementCategoryList.placementCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryListId, placementCategoryListName, placementCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServicePlacementCategoryList {\n");
    
    sb.append("    placementCategoryListId: ").append(toIndentedString(placementCategoryListId)).append("\n");
    sb.append("    placementCategoryListName: ").append(toIndentedString(placementCategoryListName)).append("\n");
    sb.append("    placementCategories: ").append(toIndentedString(placementCategories)).append("\n");
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


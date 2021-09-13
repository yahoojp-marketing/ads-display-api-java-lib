package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServicePlacementCategorySelectorオブジェクトは、駅情報を取得するプレイスメントカテゴリリストIDを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServicePlacementCategorySelector object describes placement category list ID that obtains station information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServicePlacementCategorySelectorオブジェクトは、駅情報を取得するプレイスメントカテゴリリストIDを表します。</div> <div lang=\"en\">DictionaryServicePlacementCategorySelector object describes placement category list ID that obtains station information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServicePlacementCategorySelector   {
  @JsonProperty("placementCategoryListIds")
  @Valid
  private List<Long> placementCategoryListIds = new ArrayList<>();

  public DictionaryServicePlacementCategorySelector placementCategoryListIds(List<Long> placementCategoryListIds) {
    this.placementCategoryListIds = placementCategoryListIds;
    return this;
  }

  public DictionaryServicePlacementCategorySelector addPlacementCategoryListIdsItem(Long placementCategoryListIdsItem) {
    if (this.placementCategoryListIds == null) {
      this.placementCategoryListIds = new ArrayList<>();
    }
    this.placementCategoryListIds.add(placementCategoryListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : プレイスメントカテゴリリストID</div> <div lang=\"en\">Search Condition: Placement category list ID</div> 
   * @return placementCategoryListIds
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件 : プレイスメントカテゴリリストID</div> <div lang=\"en\">Search Condition: Placement category list ID</div> ")
  @NotNull

@Size(min=1,max=1000) 
  public List<Long> getPlacementCategoryListIds() {
    return placementCategoryListIds;
  }

  public void setPlacementCategoryListIds(List<Long> placementCategoryListIds) {
    this.placementCategoryListIds = placementCategoryListIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServicePlacementCategorySelector dictionaryServicePlacementCategorySelector = (DictionaryServicePlacementCategorySelector) o;
    return Objects.equals(this.placementCategoryListIds, dictionaryServicePlacementCategorySelector.placementCategoryListIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementCategoryListIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServicePlacementCategorySelector {\n");
    
    sb.append("    placementCategoryListIds: ").append(toIndentedString(placementCategoryListIds)).append("\n");
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


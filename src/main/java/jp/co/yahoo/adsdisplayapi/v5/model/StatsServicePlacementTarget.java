package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServicePlacementUrlListType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServicePlacementTargetオブジェクトは、プレイスメントターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServicePlacementTarget object holds configuration information of placement targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServicePlacementTargetオブジェクトは、プレイスメントターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServicePlacementTarget object holds configuration information of placement targeting.</div> ")

public class StatsServicePlacementTarget   {
  @JsonProperty("placementUrlListName")
  private JsonNullable<String> placementUrlListName = JsonNullable.undefined();

  @JsonProperty("placementUrlListType")
  private JsonNullable<StatsServicePlacementUrlListType> placementUrlListType = JsonNullable.undefined();

  public StatsServicePlacementTarget placementUrlListName(String placementUrlListName) {
    this.placementUrlListName = JsonNullable.of(placementUrlListName);
    return this;
  }

  /**
   * <div lang=\"ja\">プレイスメントURLリスト名</div> <div lang=\"en\">Placement Url List Name</div> 
   * @return placementUrlListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">プレイスメントURLリスト名</div> <div lang=\"en\">Placement Url List Name</div> ")


  public JsonNullable<String> getPlacementUrlListName() {
    return placementUrlListName;
  }

  public void setPlacementUrlListName(JsonNullable<String> placementUrlListName) {
    this.placementUrlListName = placementUrlListName;
  }

  public StatsServicePlacementTarget placementUrlListType(StatsServicePlacementUrlListType placementUrlListType) {
    this.placementUrlListType = JsonNullable.of(placementUrlListType);
    return this;
  }

  /**
   * Get placementUrlListType
   * @return placementUrlListType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServicePlacementUrlListType> getPlacementUrlListType() {
    return placementUrlListType;
  }

  public void setPlacementUrlListType(JsonNullable<StatsServicePlacementUrlListType> placementUrlListType) {
    this.placementUrlListType = placementUrlListType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServicePlacementTarget statsServicePlacementTarget = (StatsServicePlacementTarget) o;
    return Objects.equals(this.placementUrlListName, statsServicePlacementTarget.placementUrlListName) &&
        Objects.equals(this.placementUrlListType, statsServicePlacementTarget.placementUrlListType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementUrlListName, placementUrlListType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServicePlacementTarget {\n");
    
    sb.append("    placementUrlListName: ").append(toIndentedString(placementUrlListName)).append("\n");
    sb.append("    placementUrlListType: ").append(toIndentedString(placementUrlListType)).append("\n");
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


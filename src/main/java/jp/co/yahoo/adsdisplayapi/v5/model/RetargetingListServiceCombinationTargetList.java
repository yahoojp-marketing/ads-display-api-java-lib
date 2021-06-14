package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceCombination;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceCombinationTargetListオブジェクトは、ターゲットリストの組み合わせ情報のリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※targetListTypeがCOMBINATIONの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceCombinationTargetList object is a container for storing list of combination of target list information. &lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If targetListType is COMBINATION, this field is required in  ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceCombinationTargetListオブジェクトは、ターゲットリストの組み合わせ情報のリストを表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※targetListTypeがCOMBINATIONの場合は、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> RetargetingListServiceCombinationTargetList object is a container for storing list of combination of target list information. <br> This field is optional in ADD and SET operation. <br> *If targetListType is COMBINATION, this field is required in  ADD and SET operation. </div> ")

public class RetargetingListServiceCombinationTargetList   {
  @JsonProperty("combinations")
  @Valid
  private JsonNullable<List<RetargetingListServiceCombination>> combinations = JsonNullable.undefined();

  public RetargetingListServiceCombinationTargetList combinations(List<RetargetingListServiceCombination> combinations) {
    this.combinations = JsonNullable.of(combinations);
    return this;
  }

  public RetargetingListServiceCombinationTargetList addCombinationsItem(RetargetingListServiceCombination combinationsItem) {
    if (this.combinations == null || !this.combinations.isPresent()) {
      this.combinations = JsonNullable.of(new ArrayList<>());
    }
    this.combinations.get().add(combinationsItem);
    return this;
  }

  /**
   * Get combinations
   * @return combinations
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<RetargetingListServiceCombination>> getCombinations() {
    return combinations;
  }

  public void setCombinations(JsonNullable<List<RetargetingListServiceCombination>> combinations) {
    this.combinations = combinations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceCombinationTargetList retargetingListServiceCombinationTargetList = (RetargetingListServiceCombinationTargetList) o;
    return Objects.equals(this.combinations, retargetingListServiceCombinationTargetList.combinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceCombinationTargetList {\n");
    
    sb.append("    combinations: ").append(toIndentedString(combinations)).append("\n");
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


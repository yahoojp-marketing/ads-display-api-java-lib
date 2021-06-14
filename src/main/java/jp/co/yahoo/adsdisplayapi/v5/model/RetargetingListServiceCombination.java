package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceLogicalOperator;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceTargetListData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceCombinationオブジェクトは、ターゲットリストの組み合わせに関する情報を格納するコンテナです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceCombination object is a container for storing combination of target list information. &lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceCombinationオブジェクトは、ターゲットリストの組み合わせに関する情報を格納するコンテナです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> RetargetingListServiceCombination object is a container for storing combination of target list information. <br> This field is required in ADD and SET operation. </div> ")

public class RetargetingListServiceCombination   {
  @JsonProperty("logicalOperator")
  private JsonNullable<RetargetingListServiceLogicalOperator> logicalOperator = JsonNullable.undefined();

  @JsonProperty("targetLists")
  @Valid
  private JsonNullable<List<RetargetingListServiceTargetListData>> targetLists = JsonNullable.undefined();

  public RetargetingListServiceCombination logicalOperator(RetargetingListServiceLogicalOperator logicalOperator) {
    this.logicalOperator = JsonNullable.of(logicalOperator);
    return this;
  }

  /**
   * Get logicalOperator
   * @return logicalOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceLogicalOperator> getLogicalOperator() {
    return logicalOperator;
  }

  public void setLogicalOperator(JsonNullable<RetargetingListServiceLogicalOperator> logicalOperator) {
    this.logicalOperator = logicalOperator;
  }

  public RetargetingListServiceCombination targetLists(List<RetargetingListServiceTargetListData> targetLists) {
    this.targetLists = JsonNullable.of(targetLists);
    return this;
  }

  public RetargetingListServiceCombination addTargetListsItem(RetargetingListServiceTargetListData targetListsItem) {
    if (this.targetLists == null || !this.targetLists.isPresent()) {
      this.targetLists = JsonNullable.of(new ArrayList<>());
    }
    this.targetLists.get().add(targetListsItem);
    return this;
  }

  /**
   * Get targetLists
   * @return targetLists
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<RetargetingListServiceTargetListData>> getTargetLists() {
    return targetLists;
  }

  public void setTargetLists(JsonNullable<List<RetargetingListServiceTargetListData>> targetLists) {
    this.targetLists = targetLists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceCombination retargetingListServiceCombination = (RetargetingListServiceCombination) o;
    return Objects.equals(this.logicalOperator, retargetingListServiceCombination.logicalOperator) &&
        Objects.equals(this.targetLists, retargetingListServiceCombination.targetLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalOperator, targetLists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceCombination {\n");
    
    sb.append("    logicalOperator: ").append(toIndentedString(logicalOperator)).append("\n");
    sb.append("    targetLists: ").append(toIndentedString(targetLists)).append("\n");
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


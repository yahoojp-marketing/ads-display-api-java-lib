package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingListServiceTargetListSize;
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingListServiceTargetListSizeReaches;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 類似ユーザーターゲットの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※targetListTypeがSIMILARITYの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceSimilarityTargetList object is a container for storing the information of Targeting information of users (similar).&lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If targetListType is SIMILARITY, this field is required in ADD and SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> 類似ユーザーターゲットの情報を保持するオブジェクトです。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※targetListTypeがSIMILARITYの場合は、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> RetargetingListServiceSimilarityTargetList object is a container for storing the information of Targeting information of users (similar).<br> This field is optional in ADD and SET operation. <br> *If targetListType is SIMILARITY, this field is required in ADD and SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceSimilarityTargetList   {
  @JsonProperty("targetListId")
  private Long targetListId = null;

  @JsonProperty("targetListSize")
  private RetargetingListServiceTargetListSize targetListSize = null;

  @JsonProperty("targetListSizeReaches")
  @Valid
  private List<RetargetingListServiceTargetListSizeReaches> targetListSizeReaches = null;

  public RetargetingListServiceSimilarityTargetList targetListId(Long targetListId) {
    this.targetListId = targetListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 類似ユーザーをリターゲティングするターゲットIDです。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。 </div> <div lang=\"en\"> Target ID for retargeting similar users. <br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation. </div> 
   * @return targetListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 類似ユーザーをリターゲティングするターゲットIDです。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。 </div> <div lang=\"en\"> Target ID for retargeting similar users. <br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation. </div> ")


  public Long getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }

  public RetargetingListServiceSimilarityTargetList targetListSize(RetargetingListServiceTargetListSize targetListSize) {
    this.targetListSize = targetListSize;
    return this;
  }

  /**
   * Get targetListSize
   * @return targetListSize
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceTargetListSize getTargetListSize() {
    return targetListSize;
  }

  public void setTargetListSize(RetargetingListServiceTargetListSize targetListSize) {
    this.targetListSize = targetListSize;
  }

  public RetargetingListServiceSimilarityTargetList targetListSizeReaches(List<RetargetingListServiceTargetListSizeReaches> targetListSizeReaches) {
    this.targetListSizeReaches = targetListSizeReaches;
    return this;
  }

  public RetargetingListServiceSimilarityTargetList addTargetListSizeReachesItem(RetargetingListServiceTargetListSizeReaches targetListSizeReachesItem) {
    if (this.targetListSizeReaches == null) {
      this.targetListSizeReaches = new ArrayList<>();
    }
    this.targetListSizeReaches.add(targetListSizeReachesItem);
    return this;
  }

  /**
   * Get targetListSizeReaches
   * @return targetListSizeReaches
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=10) 
  public List<RetargetingListServiceTargetListSizeReaches> getTargetListSizeReaches() {
    return targetListSizeReaches;
  }

  public void setTargetListSizeReaches(List<RetargetingListServiceTargetListSizeReaches> targetListSizeReaches) {
    this.targetListSizeReaches = targetListSizeReaches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceSimilarityTargetList retargetingListServiceSimilarityTargetList = (RetargetingListServiceSimilarityTargetList) o;
    return Objects.equals(this.targetListId, retargetingListServiceSimilarityTargetList.targetListId) &&
        Objects.equals(this.targetListSize, retargetingListServiceSimilarityTargetList.targetListSize) &&
        Objects.equals(this.targetListSizeReaches, retargetingListServiceSimilarityTargetList.targetListSizeReaches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListId, targetListSize, targetListSizeReaches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceSimilarityTargetList {\n");
    
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    targetListSize: ").append(toIndentedString(targetListSize)).append("\n");
    sb.append("    targetListSizeReaches: ").append(toIndentedString(targetListSizeReaches)).append("\n");
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

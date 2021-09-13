package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceTargetListDataオブジェクトは、ターゲットリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceTargetListData object displays the target list. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceTargetListDataオブジェクトは、ターゲットリストを表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> RetargetingListServiceTargetListData object displays the target list. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceTargetListData   {
  @JsonProperty("targetListId")
  private Long targetListId = null;

  @JsonProperty("targetListName")
  private String targetListName = null;

  public RetargetingListServiceTargetListData targetListId(Long targetListId) {
    this.targetListId = targetListId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットリストIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Target list ID.<br> This field is required in ADD and SET operation. </div> 
   * @return targetListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリストIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Target list ID.<br> This field is required in ADD and SET operation. </div> ")


  public Long getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }

  public RetargetingListServiceTargetListData targetListName(String targetListName) {
    this.targetListName = targetListName;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストの名前です。</div> <div lang=\"en\">Name of target list.</div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストの名前です。</div> <div lang=\"en\">Name of target list.</div> ")


  public String getTargetListName() {
    return targetListName;
  }

  public void setTargetListName(String targetListName) {
    this.targetListName = targetListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceTargetListData retargetingListServiceTargetListData = (RetargetingListServiceTargetListData) o;
    return Objects.equals(this.targetListId, retargetingListServiceTargetListData.targetListId) &&
        Objects.equals(this.targetListName, retargetingListServiceTargetListData.targetListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListId, targetListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceTargetListData {\n");
    
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
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


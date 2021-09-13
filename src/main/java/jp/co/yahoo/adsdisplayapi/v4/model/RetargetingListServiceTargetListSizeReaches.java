package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.RetargetingListServiceTargetListSize;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ターゲットリストのサイズの各リーチ数を保持するオブジェクトです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceTargetListSizeReaches object contains each reaches of target list size. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ターゲットリストのサイズの各リーチ数を保持するオブジェクトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> RetargetingListServiceTargetListSizeReaches object contains each reaches of target list size. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceTargetListSizeReaches   {
  @JsonProperty("reach")
  private Long reach = null;

  @JsonProperty("targetListSize")
  private RetargetingListServiceTargetListSize targetListSize = null;

  public RetargetingListServiceTargetListSizeReaches reach(Long reach) {
    this.reach = reach;
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットリストのサイズのリーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reaches of target list size. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリストのサイズのリーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reaches of target list size. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getReach() {
    return reach;
  }

  public void setReach(Long reach) {
    this.reach = reach;
  }

  public RetargetingListServiceTargetListSizeReaches targetListSize(RetargetingListServiceTargetListSize targetListSize) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceTargetListSizeReaches retargetingListServiceTargetListSizeReaches = (RetargetingListServiceTargetListSizeReaches) o;
    return Objects.equals(this.reach, retargetingListServiceTargetListSizeReaches.reach) &&
        Objects.equals(this.targetListSize, retargetingListServiceTargetListSizeReaches.targetListSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reach, targetListSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceTargetListSizeReaches {\n");
    
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    targetListSize: ").append(toIndentedString(targetListSize)).append("\n");
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


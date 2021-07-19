package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedSetServiceCondition;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedSetServiceConditionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; FeedSetServiceConditionSetオブジェクトは、商品セット情報の条件を保持します。&lt;br&gt; ADD時、このフィールドは必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; FeedSetServiceConditionSet object contains conditions of Item Set information.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> FeedSetServiceConditionSetオブジェクトは、商品セット情報の条件を保持します。<br> ADD時、このフィールドは必須です。 </div> <div lang=\"en\"> FeedSetServiceConditionSet object contains conditions of Item Set information.<br> This field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedSetServiceConditionSet   {
  @JsonProperty("conditionType")
  private FeedSetServiceConditionType conditionType = null;

  @JsonProperty("orConditions")
  @Valid
  private List<FeedSetServiceCondition> orConditions = null;

  public FeedSetServiceConditionSet conditionType(FeedSetServiceConditionType conditionType) {
    this.conditionType = conditionType;
    return this;
  }

  /**
   * Get conditionType
   * @return conditionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedSetServiceConditionType getConditionType() {
    return conditionType;
  }

  public void setConditionType(FeedSetServiceConditionType conditionType) {
    this.conditionType = conditionType;
  }

  public FeedSetServiceConditionSet orConditions(List<FeedSetServiceCondition> orConditions) {
    this.orConditions = orConditions;
    return this;
  }

  public FeedSetServiceConditionSet addOrConditionsItem(FeedSetServiceCondition orConditionsItem) {
    if (this.orConditions == null) {
      this.orConditions = new ArrayList<>();
    }
    this.orConditions.add(orConditionsItem);
    return this;
  }

  /**
   * Get orConditions
   * @return orConditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FeedSetServiceCondition> getOrConditions() {
    return orConditions;
  }

  public void setOrConditions(List<FeedSetServiceCondition> orConditions) {
    this.orConditions = orConditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedSetServiceConditionSet feedSetServiceConditionSet = (FeedSetServiceConditionSet) o;
    return Objects.equals(this.conditionType, feedSetServiceConditionSet.conditionType) &&
        Objects.equals(this.orConditions, feedSetServiceConditionSet.orConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, orConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedSetServiceConditionSet {\n");
    
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    orConditions: ").append(toIndentedString(orConditions)).append("\n");
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


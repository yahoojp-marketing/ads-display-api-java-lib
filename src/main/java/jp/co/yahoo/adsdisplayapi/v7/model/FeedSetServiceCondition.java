package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.FeedSetServiceCompareOperator;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; FeedSetServiceConditionオブジェクトは、商品セット情報のOR条件を保持します。&lt;br&gt; ADD時、このフィールドは必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; FeedSetServiceCondition object contains OR conditional retrieval of feedset information.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> FeedSetServiceConditionオブジェクトは、商品セット情報のOR条件を保持します。<br> ADD時、このフィールドは必須です。 </div> <div lang=\"en\"> FeedSetServiceCondition object contains OR conditional retrieval of feedset information.<br> This field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedSetServiceCondition   {
  @JsonProperty("compareOperator")
  private FeedSetServiceCompareOperator compareOperator = null;

  @JsonProperty("value")
  private String value = null;

  public FeedSetServiceCondition compareOperator(FeedSetServiceCompareOperator compareOperator) {
    this.compareOperator = compareOperator;
    return this;
  }

  /**
   * Get compareOperator
   * @return compareOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedSetServiceCompareOperator getCompareOperator() {
    return compareOperator;
  }

  public void setCompareOperator(FeedSetServiceCompareOperator compareOperator) {
    this.compareOperator = compareOperator;
  }

  public FeedSetServiceCondition value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <div lang=\"ja\"> 値です。<br> ADD時、このフィールドは必須です。<br> 設定可能な値はFeedSetServiceConditionTypeをご参照ください。<br> </div> <div lang=\"en\"> Value.<br> This field is required in ADD operation.<br> Refer to FeedSetServiceConditionType for possible values. </div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 値です。<br> ADD時、このフィールドは必須です。<br> 設定可能な値はFeedSetServiceConditionTypeをご参照ください。<br> </div> <div lang=\"en\"> Value.<br> This field is required in ADD operation.<br> Refer to FeedSetServiceConditionType for possible values. </div> ")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedSetServiceCondition feedSetServiceCondition = (FeedSetServiceCondition) o;
    return Objects.equals(this.compareOperator, feedSetServiceCondition.compareOperator) &&
        Objects.equals(this.value, feedSetServiceCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareOperator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedSetServiceCondition {\n");
    
    sb.append("    compareOperator: ").append(toIndentedString(compareOperator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


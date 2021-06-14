package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedSetServiceCompareOperator;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; FeedSetServiceConditionオブジェクトは、商品セット情報のOR条件を保持します。&lt;br&gt; ADD時、このフィールドは必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; FeedSetServiceCondition object contains OR conditional retrieval of feedset information.&lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> FeedSetServiceConditionオブジェクトは、商品セット情報のOR条件を保持します。<br> ADD時、このフィールドは必須です。 </div> <div lang=\"en\"> FeedSetServiceCondition object contains OR conditional retrieval of feedset information.<br> This field is required in ADD operation. </div> ")

public class FeedSetServiceCondition   {
  @JsonProperty("compareOperator")
  private JsonNullable<FeedSetServiceCompareOperator> compareOperator = JsonNullable.undefined();

  @JsonProperty("value")
  private JsonNullable<String> value = JsonNullable.undefined();

  public FeedSetServiceCondition compareOperator(FeedSetServiceCompareOperator compareOperator) {
    this.compareOperator = JsonNullable.of(compareOperator);
    return this;
  }

  /**
   * Get compareOperator
   * @return compareOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedSetServiceCompareOperator> getCompareOperator() {
    return compareOperator;
  }

  public void setCompareOperator(JsonNullable<FeedSetServiceCompareOperator> compareOperator) {
    this.compareOperator = compareOperator;
  }

  public FeedSetServiceCondition value(String value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * <div lang=\"ja\"> 値です。<br> ADD時、このフィールドは必須です。<br> 設定可能な値はFeedSetServiceConditionTypeをご参照ください。<br> </div> <div lang=\"en\"> Value.<br> This field is required in ADD operation.<br> Refer to FeedSetServiceConditionType for possible values. </div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 値です。<br> ADD時、このフィールドは必須です。<br> 設定可能な値はFeedSetServiceConditionTypeをご参照ください。<br> </div> <div lang=\"en\"> Value.<br> This field is required in ADD operation.<br> Refer to FeedSetServiceConditionType for possible values. </div> ")


  public JsonNullable<String> getValue() {
    return value;
  }

  public void setValue(JsonNullable<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


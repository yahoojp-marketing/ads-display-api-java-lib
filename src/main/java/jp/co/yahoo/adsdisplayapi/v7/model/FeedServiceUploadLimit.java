package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.FeedServiceControlType;
import jp.co.yahoo.adsdisplayapi.v7.model.FeedServiceSourceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServiceUploadLimitオブジェクトは、Feedファイルの制限情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServiceUploadLimit object contains feed file restriction information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedServiceUploadLimitオブジェクトは、Feedファイルの制限情報を保持します。</div> <div lang=\"en\">FeedServiceUploadLimit object contains feed file restriction information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedServiceUploadLimit   {
  @JsonProperty("sourceType")
  private FeedServiceSourceType sourceType = null;

  @JsonProperty("controlType")
  private FeedServiceControlType controlType = null;

  @JsonProperty("limitValue")
  private Integer limitValue = null;

  public FeedServiceUploadLimit sourceType(FeedServiceSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedServiceSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(FeedServiceSourceType sourceType) {
    this.sourceType = sourceType;
  }

  public FeedServiceUploadLimit controlType(FeedServiceControlType controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * Get controlType
   * @return controlType
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedServiceControlType getControlType() {
    return controlType;
  }

  public void setControlType(FeedServiceControlType controlType) {
    this.controlType = controlType;
  }

  public FeedServiceUploadLimit limitValue(Integer limitValue) {
    this.limitValue = limitValue;
    return this;
  }

  /**
   * <div lang=\"ja\">上限数です。</div> <div lang=\"en\">Number of limit.</div> 
   * @return limitValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">上限数です。</div> <div lang=\"en\">Number of limit.</div> ")


  public Integer getLimitValue() {
    return limitValue;
  }

  public void setLimitValue(Integer limitValue) {
    this.limitValue = limitValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedServiceUploadLimit feedServiceUploadLimit = (FeedServiceUploadLimit) o;
    return Objects.equals(this.sourceType, feedServiceUploadLimit.sourceType) &&
        Objects.equals(this.controlType, feedServiceUploadLimit.controlType) &&
        Objects.equals(this.limitValue, feedServiceUploadLimit.limitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, controlType, limitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedServiceUploadLimit {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    limitValue: ").append(toIndentedString(limitValue)).append("\n");
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

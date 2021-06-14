package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceLabelは、紐づけられているラベル情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceLabel object describes label information to be associated.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceLabelは、紐づけられているラベル情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupServiceLabel object describes label information to be associated.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")

public class AdGroupServiceLabel   {
  @JsonProperty("color")
  private JsonNullable<String> color = JsonNullable.undefined();

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("labelId")
  private JsonNullable<Long> labelId = JsonNullable.undefined();

  @JsonProperty("labelName")
  private JsonNullable<String> labelName = JsonNullable.undefined();

  public AdGroupServiceLabel color(String color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * <div lang=\"ja\"> カラーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return color
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カラーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getColor() {
    return color;
  }

  public void setColor(JsonNullable<String> color) {
    this.color = color;
  }

  public AdGroupServiceLabel description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public AdGroupServiceLabel labelId(Long labelId) {
    this.labelId = JsonNullable.of(labelId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベルIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupServiceLabel ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return labelId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベルIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupServiceLabel ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getLabelId() {
    return labelId;
  }

  public void setLabelId(JsonNullable<Long> labelId) {
    this.labelId = labelId;
  }

  public AdGroupServiceLabel labelName(String labelName) {
    this.labelName = JsonNullable.of(labelName);
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベル名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupServiceLabel Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return labelName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベル名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupServiceLabel Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getLabelName() {
    return labelName;
  }

  public void setLabelName(JsonNullable<String> labelName) {
    this.labelName = labelName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceLabel adGroupServiceLabel = (AdGroupServiceLabel) o;
    return Objects.equals(this.color, adGroupServiceLabel.color) &&
        Objects.equals(this.description, adGroupServiceLabel.description) &&
        Objects.equals(this.labelId, adGroupServiceLabel.labelId) &&
        Objects.equals(this.labelName, adGroupServiceLabel.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, description, labelId, labelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceLabel {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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


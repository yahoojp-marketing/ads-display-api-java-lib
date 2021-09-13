package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceLabelは、紐づけられているラベル情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceLabel object describes label information to be associated.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceLabelは、紐づけられているラベル情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceLabel object describes label information to be associated.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceLabel   {
  @JsonProperty("color")
  private String color = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("labelId")
  private Long labelId = null;

  @JsonProperty("labelName")
  private String labelName = null;

  public GuaranteedAdGroupAdServiceLabel color(String color) {
    this.color = color;
    return this;
  }

  /**
   * <div lang=\"ja\"> カラーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return color
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カラーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public GuaranteedAdGroupAdServiceLabel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GuaranteedAdGroupAdServiceLabel labelId(Long labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベルIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Label ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return labelId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベルIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Label ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getLabelId() {
    return labelId;
  }

  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }

  public GuaranteedAdGroupAdServiceLabel labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベル名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Label Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return labelName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベル名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Label Name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceLabel guaranteedAdGroupAdServiceLabel = (GuaranteedAdGroupAdServiceLabel) o;
    return Objects.equals(this.color, guaranteedAdGroupAdServiceLabel.color) &&
        Objects.equals(this.description, guaranteedAdGroupAdServiceLabel.description) &&
        Objects.equals(this.labelId, guaranteedAdGroupAdServiceLabel.labelId) &&
        Objects.equals(this.labelName, guaranteedAdGroupAdServiceLabel.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, description, labelId, labelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceLabel {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


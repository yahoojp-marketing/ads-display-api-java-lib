package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Labelオブジェクトは、ラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Label object describes label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Labelオブジェクトは、ラベルの情報を表します。</div> <div lang=\"en\">Label object describes label information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Label   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("labelId")
  private Long labelId = null;

  @JsonProperty("labelName")
  private String labelName = null;

  public Label accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Label color(String color) {
    this.color = color;
    return this;
  }

  /**
   * <div lang=\"ja\"> カラーです。<br> ADD時およびSET時、このフィールドは省略可能となります。ADD時のデフォルト設定値は#FFFFFFとなります。 </div> <div lang=\"en\"> Color.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be #FFFFFF. </div> 
   * @return color
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カラーです。<br> ADD時およびSET時、このフィールドは省略可能となります。ADD時のデフォルト設定値は#FFFFFFとなります。 </div> <div lang=\"en\"> Color.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be #FFFFFF. </div> ")


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Label description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文です。<br> ADD時およびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Description.<br> This field is optional in ADD and SET operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> ADD時およびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Description.<br> This field is optional in ADD and SET operation. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Label labelId(Long labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベルIDです。<br> SET時およびREMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> Label ID.<br> This field is required in SET and REMOVE operation. </div> 
   * @return labelId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベルIDです。<br> SET時およびREMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> Label ID.<br> This field is required in SET and REMOVE operation. </div> ")


  public Long getLabelId() {
    return labelId;
  }

  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }

  public Label labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベル名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Label Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return labelName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベル名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Label Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


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
    Label label = (Label) o;
    return Objects.equals(this.accountId, label.accountId) &&
        Objects.equals(this.color, label.color) &&
        Objects.equals(this.description, label.description) &&
        Objects.equals(this.labelId, label.labelId) &&
        Objects.equals(this.labelName, label.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, color, description, labelId, labelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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


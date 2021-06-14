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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Labelオブジェクトは、ラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Label object describes label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Labelオブジェクトは、ラベルの情報を表します。</div> <div lang=\"en\">Label object describes label information.</div> ")

public class Label   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("color")
  private JsonNullable<String> color = JsonNullable.undefined();

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("labelId")
  private JsonNullable<Long> labelId = JsonNullable.undefined();

  @JsonProperty("labelName")
  private JsonNullable<String> labelName = JsonNullable.undefined();

  public Label accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public Label color(String color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * <div lang=\"ja\"> カラーです。<br> ADD時およびSET時、このフィールドは省略可能となります。ADD時のデフォルト設定値は#FFFFFFとなります。 </div> <div lang=\"en\"> Color.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be #FFFFFF. </div> 
   * @return color
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カラーです。<br> ADD時およびSET時、このフィールドは省略可能となります。ADD時のデフォルト設定値は#FFFFFFとなります。 </div> <div lang=\"en\"> Color.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be #FFFFFF. </div> ")


  public JsonNullable<String> getColor() {
    return color;
  }

  public void setColor(JsonNullable<String> color) {
    this.color = color;
  }

  public Label description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文です。<br> ADD時およびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Description.<br> This field is optional in ADD and SET operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> ADD時およびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Description.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public Label labelId(Long labelId) {
    this.labelId = JsonNullable.of(labelId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベルIDです。<br> SET時およびREMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> Label ID.<br> This field is required in SET and REMOVE operation. </div> 
   * @return labelId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベルIDです。<br> SET時およびREMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> Label ID.<br> This field is required in SET and REMOVE operation. </div> ")


  public JsonNullable<Long> getLabelId() {
    return labelId;
  }

  public void setLabelId(JsonNullable<Long> labelId) {
    this.labelId = labelId;
  }

  public Label labelName(String labelName) {
    this.labelName = JsonNullable.of(labelName);
    return this;
  }

  /**
   * <div lang=\"ja\"> ラベル名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Label Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return labelName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ラベル名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Label Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


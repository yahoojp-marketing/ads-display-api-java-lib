package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceUploadUserListValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceUploadUserListReturnValueオブジェクトは、ユーザーリストのアップロード情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceUploadUserListReturnValue object describes upload information of the user list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceUploadUserListReturnValueオブジェクトは、ユーザーリストのアップロード情報を表します。</div> <div lang=\"en\">RetargetingListServiceUploadUserListReturnValue object describes upload information of the user list.</div> ")

public class RetargetingListServiceUploadUserListReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<RetargetingListServiceUploadUserListValue>> values = JsonNullable.undefined();

  public RetargetingListServiceUploadUserListReturnValue values(List<RetargetingListServiceUploadUserListValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public RetargetingListServiceUploadUserListReturnValue addValuesItem(RetargetingListServiceUploadUserListValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<RetargetingListServiceUploadUserListValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<RetargetingListServiceUploadUserListValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceUploadUserListReturnValue retargetingListServiceUploadUserListReturnValue = (RetargetingListServiceUploadUserListReturnValue) o;
    return Objects.equals(this.values, retargetingListServiceUploadUserListReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceUploadUserListReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


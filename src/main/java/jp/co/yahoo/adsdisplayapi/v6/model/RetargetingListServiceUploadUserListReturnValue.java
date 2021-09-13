package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingListServiceUploadUserListValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceUploadUserListReturnValueオブジェクトは、ユーザーリストのアップロード情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceUploadUserListReturnValue object describes upload information of the user list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceUploadUserListReturnValueオブジェクトは、ユーザーリストのアップロード情報を表します。</div> <div lang=\"en\">RetargetingListServiceUploadUserListReturnValue object describes upload information of the user list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceUploadUserListReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<RetargetingListServiceUploadUserListValue> values = null;

  public RetargetingListServiceUploadUserListReturnValue values(List<RetargetingListServiceUploadUserListValue> values) {
    this.values = values;
    return this;
  }

  public RetargetingListServiceUploadUserListReturnValue addValuesItem(RetargetingListServiceUploadUserListValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RetargetingListServiceUploadUserListValue> getValues() {
    return values;
  }

  public void setValues(List<RetargetingListServiceUploadUserListValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


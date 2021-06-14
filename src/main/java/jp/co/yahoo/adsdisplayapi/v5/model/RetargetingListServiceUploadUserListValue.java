package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceUploadUserListJob;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceUploadUserListValueオブジェクトは、取得されたユーザーリストのアップロード情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceUploadUserListValue object describes the upload information of the retrieved user list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceUploadUserListValueオブジェクトは、取得されたユーザーリストのアップロード情報を表します。</div> <div lang=\"en\">RetargetingListServiceUploadUserListValue object describes the upload information of the retrieved user list.</div> ")

public class RetargetingListServiceUploadUserListValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  @JsonProperty("uploadJob")
  private JsonNullable<RetargetingListServiceUploadUserListJob> uploadJob = JsonNullable.undefined();

  public RetargetingListServiceUploadUserListValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public RetargetingListServiceUploadUserListValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public RetargetingListServiceUploadUserListValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public RetargetingListServiceUploadUserListValue uploadJob(RetargetingListServiceUploadUserListJob uploadJob) {
    this.uploadJob = JsonNullable.of(uploadJob);
    return this;
  }

  /**
   * Get uploadJob
   * @return uploadJob
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceUploadUserListJob> getUploadJob() {
    return uploadJob;
  }

  public void setUploadJob(JsonNullable<RetargetingListServiceUploadUserListJob> uploadJob) {
    this.uploadJob = uploadJob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceUploadUserListValue retargetingListServiceUploadUserListValue = (RetargetingListServiceUploadUserListValue) o;
    return Objects.equals(this.errors, retargetingListServiceUploadUserListValue.errors) &&
        Objects.equals(this.operationSucceeded, retargetingListServiceUploadUserListValue.operationSucceeded) &&
        Objects.equals(this.uploadJob, retargetingListServiceUploadUserListValue.uploadJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, uploadJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceUploadUserListValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    uploadJob: ").append(toIndentedString(uploadJob)).append("\n");
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


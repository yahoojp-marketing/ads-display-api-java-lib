/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingListServiceUploadUserListJob;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceUploadUserListValueオブジェクトは、取得されたユーザーリストのアップロード情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceUploadUserListValue object describes the upload information of the retrieved user list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceUploadUserListValueオブジェクトは、取得されたユーザーリストのアップロード情報を表します。</div> <div lang=\"en\">RetargetingListServiceUploadUserListValue object describes the upload information of the retrieved user list.</div> ")
@JsonPropertyOrder({
  RetargetingListServiceUploadUserListValue.JSON_PROPERTY_ERRORS,
  RetargetingListServiceUploadUserListValue.JSON_PROPERTY_OPERATION_SUCCEEDED,
  RetargetingListServiceUploadUserListValue.JSON_PROPERTY_UPLOAD_JOB
})
@JsonTypeName("RetargetingListServiceUploadUserListValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceUploadUserListValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public static final String JSON_PROPERTY_UPLOAD_JOB = "uploadJob";
  private RetargetingListServiceUploadUserListJob uploadJob;

  public RetargetingListServiceUploadUserListValue() { 
  }

  public RetargetingListServiceUploadUserListValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public RetargetingListServiceUploadUserListValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public RetargetingListServiceUploadUserListValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")
  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  public RetargetingListServiceUploadUserListValue uploadJob(RetargetingListServiceUploadUserListJob uploadJob) {
    
    this.uploadJob = uploadJob;
    return this;
  }

   /**
   * Get uploadJob
   * @return uploadJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPLOAD_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceUploadUserListJob getUploadJob() {
    return uploadJob;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadJob(RetargetingListServiceUploadUserListJob uploadJob) {
    this.uploadJob = uploadJob;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


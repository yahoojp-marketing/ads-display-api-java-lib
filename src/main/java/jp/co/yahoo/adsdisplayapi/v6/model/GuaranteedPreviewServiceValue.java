package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedPreview;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewServiceValueオブジェクトは、操作結果を含む予約型キャンペーンのプレビュー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedPreviewServiceValue object is a container for storing the preview of guaranteed campaign information and operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewServiceValueオブジェクトは、操作結果を含む予約型キャンペーンのプレビュー情報を表します。</div> <div lang=\"en\">The GuaranteedPreviewServiceValue object is a container for storing the preview of guaranteed campaign information and operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedPreviewServiceValue   {
  @JsonProperty("guaranteedPreview")
  private GuaranteedPreview guaranteedPreview = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public GuaranteedPreviewServiceValue guaranteedPreview(GuaranteedPreview guaranteedPreview) {
    this.guaranteedPreview = guaranteedPreview;
    return this;
  }

  /**
   * Get guaranteedPreview
   * @return guaranteedPreview
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedPreview getGuaranteedPreview() {
    return guaranteedPreview;
  }

  public void setGuaranteedPreview(GuaranteedPreview guaranteedPreview) {
    this.guaranteedPreview = guaranteedPreview;
  }

  public GuaranteedPreviewServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GuaranteedPreviewServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> 
   * @return errors
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public GuaranteedPreviewServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedPreviewServiceValue guaranteedPreviewServiceValue = (GuaranteedPreviewServiceValue) o;
    return Objects.equals(this.guaranteedPreview, guaranteedPreviewServiceValue.guaranteedPreview) &&
        Objects.equals(this.errors, guaranteedPreviewServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, guaranteedPreviewServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guaranteedPreview, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreviewServiceValue {\n");
    
    sb.append("    guaranteedPreview: ").append(toIndentedString(guaranteedPreview)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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


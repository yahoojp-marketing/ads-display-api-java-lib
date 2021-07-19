package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceMediaAdFormat;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceMediaAdFormatValueオブジェクトは、getMediaAdFormatメソッドの実行結果（１Entity）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceMediaAdFormatValue object contains the results (1 Entity) for getMediaAdFormat method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceMediaAdFormatValueオブジェクトは、getMediaAdFormatメソッドの実行結果（１Entity）を保持します。</div> <div lang=\"en\">DictionaryServiceMediaAdFormatValue object contains the results (1 Entity) for getMediaAdFormat method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceMediaAdFormatValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("mediaAdFormat")
  @Valid
  private List<DictionaryServiceMediaAdFormat> mediaAdFormat = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public DictionaryServiceMediaAdFormatValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public DictionaryServiceMediaAdFormatValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public DictionaryServiceMediaAdFormatValue mediaAdFormat(List<DictionaryServiceMediaAdFormat> mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
    return this;
  }

  public DictionaryServiceMediaAdFormatValue addMediaAdFormatItem(DictionaryServiceMediaAdFormat mediaAdFormatItem) {
    if (this.mediaAdFormat == null) {
      this.mediaAdFormat = new ArrayList<>();
    }
    this.mediaAdFormat.add(mediaAdFormatItem);
    return this;
  }

  /**
   * Get mediaAdFormat
   * @return mediaAdFormat
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DictionaryServiceMediaAdFormat> getMediaAdFormat() {
    return mediaAdFormat;
  }

  public void setMediaAdFormat(List<DictionaryServiceMediaAdFormat> mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
  }

  public DictionaryServiceMediaAdFormatValue operationSucceeded(Boolean operationSucceeded) {
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
    DictionaryServiceMediaAdFormatValue dictionaryServiceMediaAdFormatValue = (DictionaryServiceMediaAdFormatValue) o;
    return Objects.equals(this.errors, dictionaryServiceMediaAdFormatValue.errors) &&
        Objects.equals(this.mediaAdFormat, dictionaryServiceMediaAdFormatValue.mediaAdFormat) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceMediaAdFormatValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, mediaAdFormat, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceMediaAdFormatValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    mediaAdFormat: ").append(toIndentedString(mediaAdFormat)).append("\n");
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


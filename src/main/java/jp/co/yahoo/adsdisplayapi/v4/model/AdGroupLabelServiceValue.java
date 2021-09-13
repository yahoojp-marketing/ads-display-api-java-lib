package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupLabel;
import jp.co.yahoo.adsdisplayapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupLabelServiceValueオブジェクトは、操作結果を含む広告グループラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupLabelServiceValue object describes ad group label information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupLabelServiceValueオブジェクトは、操作結果を含む広告グループラベルの情報を表します。</div> <div lang=\"en\">AdGroupLabelServiceValue object describes ad group label information including its operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupLabelServiceValue   {
  @JsonProperty("adGroupLabel")
  private AdGroupLabel adGroupLabel = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupLabelServiceValue adGroupLabel(AdGroupLabel adGroupLabel) {
    this.adGroupLabel = adGroupLabel;
    return this;
  }

  /**
   * Get adGroupLabel
   * @return adGroupLabel
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupLabel getAdGroupLabel() {
    return adGroupLabel;
  }

  public void setAdGroupLabel(AdGroupLabel adGroupLabel) {
    this.adGroupLabel = adGroupLabel;
  }

  public AdGroupLabelServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupLabelServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupLabelServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    AdGroupLabelServiceValue adGroupLabelServiceValue = (AdGroupLabelServiceValue) o;
    return Objects.equals(this.adGroupLabel, adGroupLabelServiceValue.adGroupLabel) &&
        Objects.equals(this.errors, adGroupLabelServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupLabelServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupLabel, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupLabelServiceValue {\n");
    
    sb.append("    adGroupLabel: ").append(toIndentedString(adGroupLabel)).append("\n");
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


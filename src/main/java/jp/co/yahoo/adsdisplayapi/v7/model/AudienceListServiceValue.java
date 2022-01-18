package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceList;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceValueオブジェクトは、取得されたオーディエンスリストの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The objects to keep the result of method’s execution(1 Entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AudienceListServiceValueオブジェクトは、取得されたオーディエンスリストの情報を表します。</div> <div lang=\"en\">The objects to keep the result of method’s execution(1 Entity).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("audienceList")
  private AudienceList audienceList = null;

  public AudienceListServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AudienceListServiceValue addErrorsItem(Error errorsItem) {
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

  public AudienceListServiceValue operationSucceeded(Boolean operationSucceeded) {
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

  public AudienceListServiceValue audienceList(AudienceList audienceList) {
    this.audienceList = audienceList;
    return this;
  }

  /**
   * Get audienceList
   * @return audienceList
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceList getAudienceList() {
    return audienceList;
  }

  public void setAudienceList(AudienceList audienceList) {
    this.audienceList = audienceList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceValue audienceListServiceValue = (AudienceListServiceValue) o;
    return Objects.equals(this.errors, audienceListServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, audienceListServiceValue.operationSucceeded) &&
        Objects.equals(this.audienceList, audienceListServiceValue.audienceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, audienceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    audienceList: ").append(toIndentedString(audienceList)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupServiceValueオブジェクトは、操作結果を含む予約型の広告グループの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedAdGroupServiceValue object is a container for storing guaranteed ad group information and operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupServiceValueオブジェクトは、操作結果を含む予約型の広告グループの情報を表します。</div> <div lang=\"en\">The GuaranteedAdGroupServiceValue object is a container for storing guaranteed ad group information and operation results.</div> ")

public class GuaranteedAdGroupServiceValue   {
  @JsonProperty("adGroup")
  private JsonNullable<GuaranteedAdGroup> adGroup = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public GuaranteedAdGroupServiceValue adGroup(GuaranteedAdGroup adGroup) {
    this.adGroup = JsonNullable.of(adGroup);
    return this;
  }

  /**
   * Get adGroup
   * @return adGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroup> getAdGroup() {
    return adGroup;
  }

  public void setAdGroup(JsonNullable<GuaranteedAdGroup> adGroup) {
    this.adGroup = adGroup;
  }

  public GuaranteedAdGroupServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public GuaranteedAdGroupServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> 
   * @return errors
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public GuaranteedAdGroupServiceValue operationSucceeded(Boolean operationSucceeded) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupServiceValue guaranteedAdGroupServiceValue = (GuaranteedAdGroupServiceValue) o;
    return Objects.equals(this.adGroup, guaranteedAdGroupServiceValue.adGroup) &&
        Objects.equals(this.errors, guaranteedAdGroupServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, guaranteedAdGroupServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroup, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupServiceValue {\n");
    
    sb.append("    adGroup: ").append(toIndentedString(adGroup)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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


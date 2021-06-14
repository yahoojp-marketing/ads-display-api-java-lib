package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceThirdPartyTrackingDomain;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceThirdPartyTrackingDomainValueオブジェクトは、getThirdPartyTrackingDomainメソッドの実行結果（１Entity）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceThirdPartyTrackingDomainValue object contains the result (1 Entity) of getThirdPartyTrackingDomain method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceThirdPartyTrackingDomainValueオブジェクトは、getThirdPartyTrackingDomainメソッドの実行結果（１Entity）を保持します。</div> <div lang=\"en\">DictionaryServiceThirdPartyTrackingDomainValue object contains the result (1 Entity) of getThirdPartyTrackingDomain method.</div> ")

public class DictionaryServiceThirdPartyTrackingDomainValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  @JsonProperty("thirdPartyTrackingDomain")
  @Valid
  private JsonNullable<List<DictionaryServiceThirdPartyTrackingDomain>> thirdPartyTrackingDomain = JsonNullable.undefined();

  public DictionaryServiceThirdPartyTrackingDomainValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public DictionaryServiceThirdPartyTrackingDomainValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceThirdPartyTrackingDomainValue operationSucceeded(Boolean operationSucceeded) {
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

  public DictionaryServiceThirdPartyTrackingDomainValue thirdPartyTrackingDomain(List<DictionaryServiceThirdPartyTrackingDomain> thirdPartyTrackingDomain) {
    this.thirdPartyTrackingDomain = JsonNullable.of(thirdPartyTrackingDomain);
    return this;
  }

  public DictionaryServiceThirdPartyTrackingDomainValue addThirdPartyTrackingDomainItem(DictionaryServiceThirdPartyTrackingDomain thirdPartyTrackingDomainItem) {
    if (this.thirdPartyTrackingDomain == null || !this.thirdPartyTrackingDomain.isPresent()) {
      this.thirdPartyTrackingDomain = JsonNullable.of(new ArrayList<>());
    }
    this.thirdPartyTrackingDomain.get().add(thirdPartyTrackingDomainItem);
    return this;
  }

  /**
   * Get thirdPartyTrackingDomain
   * @return thirdPartyTrackingDomain
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<DictionaryServiceThirdPartyTrackingDomain>> getThirdPartyTrackingDomain() {
    return thirdPartyTrackingDomain;
  }

  public void setThirdPartyTrackingDomain(JsonNullable<List<DictionaryServiceThirdPartyTrackingDomain>> thirdPartyTrackingDomain) {
    this.thirdPartyTrackingDomain = thirdPartyTrackingDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceThirdPartyTrackingDomainValue dictionaryServiceThirdPartyTrackingDomainValue = (DictionaryServiceThirdPartyTrackingDomainValue) o;
    return Objects.equals(this.errors, dictionaryServiceThirdPartyTrackingDomainValue.errors) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceThirdPartyTrackingDomainValue.operationSucceeded) &&
        Objects.equals(this.thirdPartyTrackingDomain, dictionaryServiceThirdPartyTrackingDomainValue.thirdPartyTrackingDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, thirdPartyTrackingDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceThirdPartyTrackingDomainValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    thirdPartyTrackingDomain: ").append(toIndentedString(thirdPartyTrackingDomain)).append("\n");
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


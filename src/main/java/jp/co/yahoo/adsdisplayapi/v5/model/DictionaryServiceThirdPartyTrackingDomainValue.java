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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceThirdPartyTrackingDomainValueオブジェクトは、getThirdPartyTrackingDomainメソッドの実行結果（１Entity）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceThirdPartyTrackingDomainValue object contains the result (1 Entity) of getThirdPartyTrackingDomain method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceThirdPartyTrackingDomainValueオブジェクトは、getThirdPartyTrackingDomainメソッドの実行結果（１Entity）を保持します。</div> <div lang=\"en\">DictionaryServiceThirdPartyTrackingDomainValue object contains the result (1 Entity) of getThirdPartyTrackingDomain method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceThirdPartyTrackingDomainValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("thirdPartyTrackingDomain")
  @Valid
  private List<DictionaryServiceThirdPartyTrackingDomain> thirdPartyTrackingDomain = null;

  public DictionaryServiceThirdPartyTrackingDomainValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public DictionaryServiceThirdPartyTrackingDomainValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceThirdPartyTrackingDomainValue operationSucceeded(Boolean operationSucceeded) {
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

  public DictionaryServiceThirdPartyTrackingDomainValue thirdPartyTrackingDomain(List<DictionaryServiceThirdPartyTrackingDomain> thirdPartyTrackingDomain) {
    this.thirdPartyTrackingDomain = thirdPartyTrackingDomain;
    return this;
  }

  public DictionaryServiceThirdPartyTrackingDomainValue addThirdPartyTrackingDomainItem(DictionaryServiceThirdPartyTrackingDomain thirdPartyTrackingDomainItem) {
    if (this.thirdPartyTrackingDomain == null) {
      this.thirdPartyTrackingDomain = new ArrayList<>();
    }
    this.thirdPartyTrackingDomain.add(thirdPartyTrackingDomainItem);
    return this;
  }

  /**
   * Get thirdPartyTrackingDomain
   * @return thirdPartyTrackingDomain
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DictionaryServiceThirdPartyTrackingDomain> getThirdPartyTrackingDomain() {
    return thirdPartyTrackingDomain;
  }

  public void setThirdPartyTrackingDomain(List<DictionaryServiceThirdPartyTrackingDomain> thirdPartyTrackingDomain) {
    this.thirdPartyTrackingDomain = thirdPartyTrackingDomain;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


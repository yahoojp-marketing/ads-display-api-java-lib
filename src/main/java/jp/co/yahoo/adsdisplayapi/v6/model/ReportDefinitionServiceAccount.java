package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.ReportDefinitionServiceProductType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceAccountオブジェクトはアカウントと、そのアカウントのプロダクトタイプを表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceAccount object describes account and its product type. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceAccountオブジェクトはアカウントと、そのアカウントのプロダクトタイプを表します。 </div> <div lang=\"en\"> ReportDefinitionServiceAccount object describes account and its product type. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceAccount   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("productType")
  private ReportDefinitionServiceProductType productType = null;

  public ReportDefinitionServiceAccount accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。 </div> <div lang=\"en\"> Account ID. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。 </div> <div lang=\"en\"> Account ID. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ReportDefinitionServiceAccount productType(ReportDefinitionServiceProductType productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceProductType getProductType() {
    return productType;
  }

  public void setProductType(ReportDefinitionServiceProductType productType) {
    this.productType = productType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceAccount reportDefinitionServiceAccount = (ReportDefinitionServiceAccount) o;
    return Objects.equals(this.accountId, reportDefinitionServiceAccount.accountId) &&
        Objects.equals(this.productType, reportDefinitionServiceAccount.productType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, productType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceAccount {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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


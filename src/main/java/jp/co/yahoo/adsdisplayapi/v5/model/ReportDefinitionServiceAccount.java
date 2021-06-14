package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceProductType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceAccountオブジェクトはアカウントと、そのアカウントのプロダクトタイプを表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceAccount object describes account and its product type. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceAccountオブジェクトはアカウントと、そのアカウントのプロダクトタイプを表します。 </div> <div lang=\"en\"> ReportDefinitionServiceAccount object describes account and its product type. </div> ")

public class ReportDefinitionServiceAccount   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("productType")
  private JsonNullable<ReportDefinitionServiceProductType> productType = JsonNullable.undefined();

  public ReportDefinitionServiceAccount accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。 </div> <div lang=\"en\"> Account ID. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。 </div> <div lang=\"en\"> Account ID. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public ReportDefinitionServiceAccount productType(ReportDefinitionServiceProductType productType) {
    this.productType = JsonNullable.of(productType);
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceProductType> getProductType() {
    return productType;
  }

  public void setProductType(JsonNullable<ReportDefinitionServiceProductType> productType) {
    this.productType = productType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


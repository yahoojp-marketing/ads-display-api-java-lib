package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.AccountAdProductServiceAdProduct;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountAdProductオブジェクトは、広告掲載方式を含むコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountAdProduct object is a container that includes the ad display method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountAdProductオブジェクトは、広告掲載方式を含むコンテナです。</div> <div lang=\"en\">AccountAdProduct object is a container that includes the ad display method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountAdProduct   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adProduct")
  @Valid
  private List<AccountAdProductServiceAdProduct> adProduct = null;

  public AccountAdProduct accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">AccountId.</div>
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">AccountId.</div>")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AccountAdProduct adProduct(List<AccountAdProductServiceAdProduct> adProduct) {
    this.adProduct = adProduct;
    return this;
  }

  public AccountAdProduct addAdProductItem(AccountAdProductServiceAdProduct adProductItem) {
    if (this.adProduct == null) {
      this.adProduct = new ArrayList<>();
    }
    this.adProduct.add(adProductItem);
    return this;
  }

  /**
   * Get adProduct
   * @return adProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountAdProductServiceAdProduct> getAdProduct() {
    return adProduct;
  }

  public void setAdProduct(List<AccountAdProductServiceAdProduct> adProduct) {
    this.adProduct = adProduct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAdProduct accountAdProduct = (AccountAdProduct) o;
    return Objects.equals(this.accountId, accountAdProduct.accountId) &&
        Objects.equals(this.adProduct, accountAdProduct.adProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAdProduct {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adProduct: ").append(toIndentedString(adProduct)).append("\n");
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


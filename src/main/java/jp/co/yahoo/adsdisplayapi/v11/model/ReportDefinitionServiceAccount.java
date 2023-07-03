/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v11.model.ReportDefinitionServiceProductType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceAccountオブジェクトはアカウントと、そのアカウントのプロダクトタイプを表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceAccount object describes account and its product type. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceAccount.JSON_PROPERTY_ACCOUNT_ID,
  ReportDefinitionServiceAccount.JSON_PROPERTY_PRODUCT_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceAccount {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_PRODUCT_TYPE = "productType";
  private ReportDefinitionServiceProductType productType;

  public ReportDefinitionServiceAccount() {
  }

  public ReportDefinitionServiceAccount accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID. &lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceProductType getProductType() {
    return productType;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


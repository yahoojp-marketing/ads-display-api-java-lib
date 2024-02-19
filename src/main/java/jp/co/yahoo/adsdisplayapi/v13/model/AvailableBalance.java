/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AvailableBalanceオブジェクトは、選択したアカウントの推定現金残高情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AvailableBalance object describes estimated cash balance information for the selected account.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AvailableBalanceオブジェクトは、選択したアカウントの推定現金残高情報を表します。</div> <div lang=\"en\">AvailableBalance object describes estimated cash balance information for the selected account.</div> ")
@JsonPropertyOrder({
  AvailableBalance.JSON_PROPERTY_ACCOUNT_ID,
  AvailableBalance.JSON_PROPERTY_AVAILABLE_BALANCE
})
@JsonTypeName("AvailableBalance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvailableBalance {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AVAILABLE_BALANCE = "availableBalance";
  private Long availableBalance;

  public AvailableBalance() { 
  }

  public AvailableBalance accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">The account ID.</div> ")
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


  public AvailableBalance availableBalance(Long availableBalance) {
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;推定現金残高です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Estimated cash balance.&lt;/div&gt; 
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">推定現金残高です。</div> <div lang=\"en\">Estimated cash balance.</div> ")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAvailableBalance() {
    return availableBalance;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableBalance(Long availableBalance) {
    this.availableBalance = availableBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableBalance availableBalance = (AvailableBalance) o;
    return Objects.equals(this.accountId, availableBalance.accountId) &&
        Objects.equals(this.availableBalance, availableBalance.availableBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, availableBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableBalance {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
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


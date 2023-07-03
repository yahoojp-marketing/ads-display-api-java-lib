/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v9.model.ReportDefinitionServiceAccount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceConversionPathAccountSettingオブジェクトは、コンバージョン経路の対象アカウント設定を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceConversionPathAccountSetting object describes account setting that is subject to the conversion path. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceConversionPathAccountSetting.JSON_PROPERTY_BASE_ACCOUNT,
  ReportDefinitionServiceConversionPathAccountSetting.JSON_PROPERTY_SUB_ACCOUNTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceConversionPathAccountSetting {
  public static final String JSON_PROPERTY_BASE_ACCOUNT = "baseAccount";
  private ReportDefinitionServiceAccount baseAccount;

  public static final String JSON_PROPERTY_SUB_ACCOUNTS = "subAccounts";
  private List<ReportDefinitionServiceAccount> subAccounts;

  public ReportDefinitionServiceConversionPathAccountSetting() {
  }

  public ReportDefinitionServiceConversionPathAccountSetting baseAccount(ReportDefinitionServiceAccount baseAccount) {
    
    this.baseAccount = baseAccount;
    return this;
  }

   /**
   * Get baseAccount
   * @return baseAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceAccount getBaseAccount() {
    return baseAccount;
  }


  @JsonProperty(JSON_PROPERTY_BASE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseAccount(ReportDefinitionServiceAccount baseAccount) {
    this.baseAccount = baseAccount;
  }


  public ReportDefinitionServiceConversionPathAccountSetting subAccounts(List<ReportDefinitionServiceAccount> subAccounts) {
    
    this.subAccounts = subAccounts;
    return this;
  }

  public ReportDefinitionServiceConversionPathAccountSetting addSubAccountsItem(ReportDefinitionServiceAccount subAccountsItem) {
    if (this.subAccounts == null) {
      this.subAccounts = new ArrayList<>();
    }
    this.subAccounts.add(subAccountsItem);
    return this;
  }

   /**
   * Get subAccounts
   * @return subAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDefinitionServiceAccount> getSubAccounts() {
    return subAccounts;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubAccounts(List<ReportDefinitionServiceAccount> subAccounts) {
    this.subAccounts = subAccounts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceConversionPathAccountSetting reportDefinitionServiceConversionPathAccountSetting = (ReportDefinitionServiceConversionPathAccountSetting) o;
    return Objects.equals(this.baseAccount, reportDefinitionServiceConversionPathAccountSetting.baseAccount) &&
        Objects.equals(this.subAccounts, reportDefinitionServiceConversionPathAccountSetting.subAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseAccount, subAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceConversionPathAccountSetting {\n");
    sb.append("    baseAccount: ").append(toIndentedString(baseAccount)).append("\n");
    sb.append("    subAccounts: ").append(toIndentedString(subAccounts)).append("\n");
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


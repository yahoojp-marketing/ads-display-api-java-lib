package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceAccount;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceConversionPathAccountSettingオブジェクトは、コンバージョン経路の対象アカウント設定を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceConversionPathAccountSetting object describes account setting that is subject to the conversion path. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceConversionPathAccountSettingオブジェクトは、コンバージョン経路の対象アカウント設定を表します。 </div> <div lang=\"en\"> ReportDefinitionServiceConversionPathAccountSetting object describes account setting that is subject to the conversion path. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceConversionPathAccountSetting   {
  @JsonProperty("baseAccount")
  private ReportDefinitionServiceAccount baseAccount = null;

  @JsonProperty("subAccounts")
  @Valid
  private List<ReportDefinitionServiceAccount> subAccounts = null;

  public ReportDefinitionServiceConversionPathAccountSetting baseAccount(ReportDefinitionServiceAccount baseAccount) {
    this.baseAccount = baseAccount;
    return this;
  }

  /**
   * Get baseAccount
   * @return baseAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceAccount getBaseAccount() {
    return baseAccount;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReportDefinitionServiceAccount> getSubAccounts() {
    return subAccounts;
  }

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


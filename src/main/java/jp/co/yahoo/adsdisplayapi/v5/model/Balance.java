package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Balanceオブジェクトは、選択したアカウントの未消化予算情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The Balance object is a container for storing balance information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Balanceオブジェクトは、選択したアカウントの未消化予算情報を表します。</div> <div lang=\"en\">The Balance object is a container for storing balance information.</div> ")

public class Balance   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("balance")
  private JsonNullable<Long> balance = JsonNullable.undefined();

  public Balance accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">The account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">The account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public Balance balance(Long balance) {
    this.balance = JsonNullable.of(balance);
    return this;
  }

  /**
   * <div lang=\"ja\">未消化予算です。</div> <div lang=\"en\">The balance.</div> 
   * @return balance
  */
  @ApiModelProperty(value = "<div lang=\"ja\">未消化予算です。</div> <div lang=\"en\">The balance.</div> ")


  public JsonNullable<Long> getBalance() {
    return balance;
  }

  public void setBalance(JsonNullable<Long> balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.accountId, balance.accountId) &&
        Objects.equals(this.balance, balance.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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


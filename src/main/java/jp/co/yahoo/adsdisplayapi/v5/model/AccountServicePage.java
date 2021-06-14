package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountServicePageオブジェクトは、取得されるアカウント情報に関するエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountServicePage object is a container for storing account information entry.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountServicePageオブジェクトは、取得されるアカウント情報に関するエントリーを表します。</div> <div lang=\"en\">The AccountServicePage object is a container for storing account information entry.</div> ")

public class AccountServicePage   {
  @JsonProperty("authorizationBusinessId")
  private JsonNullable<String> authorizationBusinessId = JsonNullable.undefined();

  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AccountServiceValue>> values = JsonNullable.undefined();

  public AccountServicePage authorizationBusinessId(String authorizationBusinessId) {
    this.authorizationBusinessId = JsonNullable.of(authorizationBusinessId);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリケーションによるYahoo!広告へのアクセスを認可したYahoo! JAPANビジネスIDです。</div> <div lang=\"en\">Yahoo! JAPAN Business ID that authorized access to Yahoo! JAPAN Ads via application.</div> 
   * @return authorizationBusinessId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションによるYahoo!広告へのアクセスを認可したYahoo! JAPANビジネスIDです。</div> <div lang=\"en\">Yahoo! JAPAN Business ID that authorized access to Yahoo! JAPAN Ads via application.</div> ")


  public JsonNullable<String> getAuthorizationBusinessId() {
    return authorizationBusinessId;
  }

  public void setAuthorizationBusinessId(JsonNullable<String> authorizationBusinessId) {
    this.authorizationBusinessId = authorizationBusinessId;
  }

  public AccountServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of items to be retrieved.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public AccountServicePage values(List<AccountServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AccountServicePage addValuesItem(AccountServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AccountServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<AccountServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountServicePage accountServicePage = (AccountServicePage) o;
    return Objects.equals(this.authorizationBusinessId, accountServicePage.authorizationBusinessId) &&
        Objects.equals(this.totalNumEntries, accountServicePage.totalNumEntries) &&
        Objects.equals(this.values, accountServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationBusinessId, totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountServicePage {\n");
    
    sb.append("    authorizationBusinessId: ").append(toIndentedString(authorizationBusinessId)).append("\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


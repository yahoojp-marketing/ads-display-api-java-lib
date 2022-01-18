package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingTagServiceOperationオブジェクトは、サイトリターゲティングのタグ処理の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingTagServiceOperation object is a detail of tag process of Site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingTagServiceOperationオブジェクトは、サイトリターゲティングのタグ処理の内容を表します。</div> <div lang=\"en\">RetargetingTagServiceOperation object is a detail of tag process of Site retargeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingTagServiceOperation   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  public RetargetingTagServiceOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingTagServiceOperation retargetingTagServiceOperation = (RetargetingTagServiceOperation) o;
    return Objects.equals(this.accountId, retargetingTagServiceOperation.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingTagServiceOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Video;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceOperationオブジェクトは、メソッドの操作対象を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServiceOperation object stores the operation target of method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">VideoServiceOperationオブジェクトは、メソッドの操作対象を保持します。</div> <div lang=\"en\">VideoServiceOperation object stores the operation target of method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VideoServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private List<Video> operand = new ArrayList<>();

  public VideoServiceOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> AccountID.<br> This field is required in SET and REMOVE operation. </div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> AccountID.<br> This field is required in SET and REMOVE operation. </div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public VideoServiceOperation operand(List<Video> operand) {
    this.operand = operand;
    return this;
  }

  public VideoServiceOperation addOperandItem(Video operandItem) {
    if (this.operand == null) {
      this.operand = new ArrayList<>();
    }
    this.operand.add(operandItem);
    return this;
  }

  /**
   * <div lang=\"ja\">このフィールドは、SETおよびREMOVE時に必須となります。</div> <div lang=\"en\">This field is required in SET and REMOVE operation.</div> 
   * @return operand
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">このフィールドは、SETおよびREMOVE時に必須となります。</div> <div lang=\"en\">This field is required in SET and REMOVE operation.</div> ")
  @NotNull

  @Valid
@Size(min=1,max=100) 
  public List<Video> getOperand() {
    return operand;
  }

  public void setOperand(List<Video> operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoServiceOperation videoServiceOperation = (VideoServiceOperation) o;
    return Objects.equals(this.accountId, videoServiceOperation.accountId) &&
        Objects.equals(this.operand, videoServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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


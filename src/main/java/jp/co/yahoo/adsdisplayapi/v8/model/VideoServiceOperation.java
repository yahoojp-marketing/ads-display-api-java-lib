/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v8.model.Video;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceOperationオブジェクトは、メソッドの操作対象を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServiceOperation object stores the operation target of method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">VideoServiceOperationオブジェクトは、メソッドの操作対象を保持します。</div> <div lang=\"en\">VideoServiceOperation object stores the operation target of method.</div> ")
@JsonPropertyOrder({
  VideoServiceOperation.JSON_PROPERTY_ACCOUNT_ID,
  VideoServiceOperation.JSON_PROPERTY_OPERAND
})
@JsonTypeName("VideoServiceOperation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoServiceOperation {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_OPERAND = "operand";
  private List<Video> operand = new ArrayList<>();

  public VideoServiceOperation() { 
  }

  public VideoServiceOperation accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AccountID.&lt;br&gt; This field is required in SET and REMOVE operation. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> AccountID.<br> This field is required in SET and REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public VideoServiceOperation operand(List<Video> operand) {
    
    this.operand = operand;
    return this;
  }

  public VideoServiceOperation addOperandItem(Video operandItem) {
    this.operand.add(operandItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;このフィールドは、SETおよびREMOVE時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field is required in SET and REMOVE operation.&lt;/div&gt; 
   * @return operand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">このフィールドは、SETおよびREMOVE時に必須となります。</div> <div lang=\"en\">This field is required in SET and REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Video> getOperand() {
    return operand;
  }


  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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


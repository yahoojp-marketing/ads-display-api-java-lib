package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.FeedFtpRequestServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpRequestServiceReturnValueオブジェクトは、操作結果を含む即時アップロードリクエスト情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpRequestServiceReturnValue object contains Upload (Upload now) request information including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedFtpRequestServiceReturnValueオブジェクトは、操作結果を含む即時アップロードリクエスト情報を保持します。</div> <div lang=\"en\">FeedFtpRequestServiceReturnValue object contains Upload (Upload now) request information including operation result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedFtpRequestServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<FeedFtpRequestServiceValue> values = null;

  public FeedFtpRequestServiceReturnValue values(List<FeedFtpRequestServiceValue> values) {
    this.values = values;
    return this;
  }

  public FeedFtpRequestServiceReturnValue addValuesItem(FeedFtpRequestServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FeedFtpRequestServiceValue> getValues() {
    return values;
  }

  public void setValues(List<FeedFtpRequestServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedFtpRequestServiceReturnValue feedFtpRequestServiceReturnValue = (FeedFtpRequestServiceReturnValue) o;
    return Objects.equals(this.values, feedFtpRequestServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpRequestServiceReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.ContentsKeywordListServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordListServiceReturnValueオブジェクトは、コンテンツキーワードリスト設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordListServiceReturnValue object displays the setting of contents keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordListServiceReturnValueオブジェクトは、コンテンツキーワードリスト設定を表します。</div> <div lang=\"en\">ContentsKeywordListServiceReturnValue object displays the setting of contents keyword list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContentsKeywordListServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<ContentsKeywordListServiceValue> values = null;

  public ContentsKeywordListServiceReturnValue values(List<ContentsKeywordListServiceValue> values) {
    this.values = values;
    return this;
  }

  public ContentsKeywordListServiceReturnValue addValuesItem(ContentsKeywordListServiceValue valuesItem) {
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

  public List<ContentsKeywordListServiceValue> getValues() {
    return values;
  }

  public void setValues(List<ContentsKeywordListServiceValue> values) {
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
    ContentsKeywordListServiceReturnValue contentsKeywordListServiceReturnValue = (ContentsKeywordListServiceReturnValue) o;
    return Objects.equals(this.values, contentsKeywordListServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordListServiceReturnValue {\n");
    
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


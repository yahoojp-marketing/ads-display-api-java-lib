package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceBiddingValueCpcRangeは、入札価格による検索対象範囲を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceBiddingValueCpcRange represents the search range by bid price.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceBiddingValueCpcRangeは、入札価格による検索対象範囲を表します。</div> <div lang=\"en\">AdGroupServiceBiddingValueCpcRange represents the search range by bid price.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceBiddingValueCpcRange   {
  @JsonProperty("min")
  private Long min = null;

  @JsonProperty("max")
  private Long max = null;

  public AdGroupServiceBiddingValueCpcRange min(Long min) {
    this.min = min;
    return this;
  }

  /**
   * <div lang=\"ja\">検索対象範囲の最小値です。</div> <div lang=\"en\">This is the minimum value of the search range.</div> 
   * @return min
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索対象範囲の最小値です。</div> <div lang=\"en\">This is the minimum value of the search range.</div> ")


  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }

  public AdGroupServiceBiddingValueCpcRange max(Long max) {
    this.max = max;
    return this;
  }

  /**
   * <div lang=\"ja\">検索対象範囲の最大値です。</div> <div lang=\"en\">This is the maximum value of the search range.</div> 
   * @return max
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索対象範囲の最大値です。</div> <div lang=\"en\">This is the maximum value of the search range.</div> ")


  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceBiddingValueCpcRange adGroupServiceBiddingValueCpcRange = (AdGroupServiceBiddingValueCpcRange) o;
    return Objects.equals(this.min, adGroupServiceBiddingValueCpcRange.min) &&
        Objects.equals(this.max, adGroupServiceBiddingValueCpcRange.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBiddingValueCpcRange {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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


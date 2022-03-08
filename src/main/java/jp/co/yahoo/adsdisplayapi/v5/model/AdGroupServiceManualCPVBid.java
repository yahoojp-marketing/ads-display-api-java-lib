/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceManualCPVBidオブジェクトは、広告グループの入札価格（CPV）を保持します。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、このフィールドは指定できません。&lt;br&gt; 詳細は、「&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan&#x3D;ja&amp;aid&#x3D;1281\&quot;&gt;広告グループの作成 - 広告グループの入札価格を入力&lt;/a&gt;」を参照してください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceManualCPVBid object stores the bid amount of ad group (CPV).&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, this field can not be set.&lt;br&gt; More details are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan&#x3D;en&amp;aid&#x3D;487\&quot;&gt;Create Ad Group - Enter the Bid amount of the Ad Group&lt;/a&gt;. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceManualCPVBidオブジェクトは、広告グループの入札価格（CPV）を保持します。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。<br> 詳細は、「<a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=ja&aid=1281\">広告グループの作成 - 広告グループの入札価格を入力</a>」を参照してください。 </div> <div lang=\"en\"> AdGroupServiceManualCPVBid object stores the bid amount of ad group (CPV).<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set.<br> More details are described on <a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=en&aid=487\">Create Ad Group - Enter the Bid amount of the Ad Group</a>. </div> ")
@JsonPropertyOrder({
  AdGroupServiceManualCPVBid.JSON_PROPERTY_MAX_CPV
})
@JsonTypeName("AdGroupServiceManualCPVBid")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceManualCPVBid {
  public static final String JSON_PROPERTY_MAX_CPV = "maxCpv";
  private Long maxCpv;

  public AdGroupServiceManualCPVBid() { 
  }

  public AdGroupServiceManualCPVBid maxCpv(Long maxCpv) {
    
    this.maxCpv = maxCpv;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 入札価格です。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、このフィールドは指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Bid amount.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, this field can not be set. &lt;/div&gt; 
   * @return maxCpv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 入札価格です。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> Bid amount.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> ")
  @JsonProperty(JSON_PROPERTY_MAX_CPV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxCpv() {
    return maxCpv;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CPV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCpv(Long maxCpv) {
    this.maxCpv = maxCpv;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceManualCPVBid adGroupServiceManualCPVBid = (AdGroupServiceManualCPVBid) o;
    return Objects.equals(this.maxCpv, adGroupServiceManualCPVBid.maxCpv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCpv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceManualCPVBid {\n");
    sb.append("    maxCpv: ").append(toIndentedString(maxCpv)).append("\n");
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


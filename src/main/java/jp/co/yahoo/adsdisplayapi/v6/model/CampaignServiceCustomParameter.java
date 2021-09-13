package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceCustomParameterは、カスタムパラメータの内容を表します。&lt;br&gt; ADD時およびSET時、このフィールドはcustomParameters配下では必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceCustomParameter displays the element of custom parameters.&lt;br&gt; Under customParameters, this field is required in ADD and SET operation.&lt;/div&gt;
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceCustomParameterは、カスタムパラメータの内容を表します。<br> ADD時およびSET時、このフィールドはcustomParameters配下では必須となります。</div> <div lang=\"en\">CampaignServiceCustomParameter displays the element of custom parameters.<br> Under customParameters, this field is required in ADD and SET operation.</div>")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceCustomParameter   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public CampaignServiceCustomParameter key(String key) {
    this.key = key;
    return this;
  }

  /**
   * <div lang=\"ja\">キーです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Key of parameter.<br> This field is required in any cases.</div> 
   * @return key
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Key of parameter.<br> This field is required in any cases.</div> ")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CampaignServiceCustomParameter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <div lang=\"ja\">値です。<br> このフィールドは、いずれの場合でも省略可能です。</div> <div lang=\"en\">Value of parameter.<br> This field is optional in any cases.</div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\">値です。<br> このフィールドは、いずれの場合でも省略可能です。</div> <div lang=\"en\">Value of parameter.<br> This field is optional in any cases.</div> ")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceCustomParameter campaignServiceCustomParameter = (CampaignServiceCustomParameter) o;
    return Objects.equals(this.key, campaignServiceCustomParameter.key) &&
        Objects.equals(this.value, campaignServiceCustomParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCustomParameter {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


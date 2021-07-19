package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceOsVersionTargetオブジェクトは、OSバージョンターゲティングの設定情報を保持します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceOsVersionTarget object is a container for storing OS version targeting settings.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceOsVersionTargetオブジェクトは、OSバージョンターゲティングの設定情報を保持します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupTargetServiceOsVersionTarget object is a container for storing OS version targeting settings.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceOsVersionTarget   {
  @JsonProperty("osVersion")
  private String osVersion = null;

  public AdGroupTargetServiceOsVersionTarget osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * <div lang=\"ja\">OSのバージョンです。</div> <div lang=\"en\">OS version.</div> 
   * @return osVersion
  */
  @ApiModelProperty(value = "<div lang=\"ja\">OSのバージョンです。</div> <div lang=\"en\">OS version.</div> ")


  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceOsVersionTarget adGroupTargetServiceOsVersionTarget = (AdGroupTargetServiceOsVersionTarget) o;
    return Objects.equals(this.osVersion, adGroupTargetServiceOsVersionTarget.osVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceOsVersionTarget {\n");
    
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
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


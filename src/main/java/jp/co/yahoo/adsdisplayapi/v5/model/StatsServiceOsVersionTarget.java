package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceOsVersionTargetオブジェクトは、OSバージョンターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceOsVersionTarget object holds configuration information of OS version targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceOsVersionTargetオブジェクトは、OSバージョンターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceOsVersionTarget object holds configuration information of OS version targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceOsVersionTarget   {
  @JsonProperty("osVersion")
  private String osVersion = null;

  public StatsServiceOsVersionTarget osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * <div lang=\"ja\">OSバージョン</div> <div lang=\"en\">OS Version</div> 
   * @return osVersion
  */
  @ApiModelProperty(value = "<div lang=\"ja\">OSバージョン</div> <div lang=\"en\">OS Version</div> ")


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
    StatsServiceOsVersionTarget statsServiceOsVersionTarget = (StatsServiceOsVersionTarget) o;
    return Objects.equals(this.osVersion, statsServiceOsVersionTarget.osVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceOsVersionTarget {\n");
    
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


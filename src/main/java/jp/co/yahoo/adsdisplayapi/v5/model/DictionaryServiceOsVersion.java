package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceDeviceOsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceOsVersionオブジェクトは、OSバージョンを保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceOsVersion object contains OS version.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceOsVersionオブジェクトは、OSバージョンを保持します。</div> <div lang=\"en\">DictionaryServiceOsVersion object contains OS version.</div> ")

public class DictionaryServiceOsVersion   {
  @JsonProperty("deviceOsType")
  private JsonNullable<DictionaryServiceDeviceOsType> deviceOsType = JsonNullable.undefined();

  @JsonProperty("version")
  private JsonNullable<String> version = JsonNullable.undefined();

  public DictionaryServiceOsVersion deviceOsType(DictionaryServiceDeviceOsType deviceOsType) {
    this.deviceOsType = JsonNullable.of(deviceOsType);
    return this;
  }

  /**
   * Get deviceOsType
   * @return deviceOsType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<DictionaryServiceDeviceOsType> getDeviceOsType() {
    return deviceOsType;
  }

  public void setDeviceOsType(JsonNullable<DictionaryServiceDeviceOsType> deviceOsType) {
    this.deviceOsType = deviceOsType;
  }

  public DictionaryServiceOsVersion version(String version) {
    this.version = JsonNullable.of(version);
    return this;
  }

  /**
   * <div lang=\"ja\">OSバージョンです。</div> <div lang=\"en\">OS Version</div> 
   * @return version
  */
  @ApiModelProperty(value = "<div lang=\"ja\">OSバージョンです。</div> <div lang=\"en\">OS Version</div> ")


  public JsonNullable<String> getVersion() {
    return version;
  }

  public void setVersion(JsonNullable<String> version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceOsVersion dictionaryServiceOsVersion = (DictionaryServiceOsVersion) o;
    return Objects.equals(this.deviceOsType, dictionaryServiceOsVersion.deviceOsType) &&
        Objects.equals(this.version, dictionaryServiceOsVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceOsType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceOsVersion {\n");
    
    sb.append("    deviceOsType: ").append(toIndentedString(deviceOsType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceDeviceOsType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceOsVersionSelectorオブジェクトは、getOsVersionメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceOsVersionSelector object contains a set of criteria (parameters) for getOsVersion method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceOsVersionSelectorオブジェクトは、getOsVersionメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">DictionaryServiceOsVersionSelector object contains a set of criteria (parameters) for getOsVersion method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceOsVersionSelector   {
  @JsonProperty("deviceOsType")
  private DictionaryServiceDeviceOsType deviceOsType = null;

  public DictionaryServiceOsVersionSelector deviceOsType(DictionaryServiceDeviceOsType deviceOsType) {
    this.deviceOsType = deviceOsType;
    return this;
  }

  /**
   * Get deviceOsType
   * @return deviceOsType
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServiceDeviceOsType getDeviceOsType() {
    return deviceOsType;
  }

  public void setDeviceOsType(DictionaryServiceDeviceOsType deviceOsType) {
    this.deviceOsType = deviceOsType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceOsVersionSelector dictionaryServiceOsVersionSelector = (DictionaryServiceOsVersionSelector) o;
    return Objects.equals(this.deviceOsType, dictionaryServiceOsVersionSelector.deviceOsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceOsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceOsVersionSelector {\n");
    
    sb.append("    deviceOsType: ").append(toIndentedString(deviceOsType)).append("\n");
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


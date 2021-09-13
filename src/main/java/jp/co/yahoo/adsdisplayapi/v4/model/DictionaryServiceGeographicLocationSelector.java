package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.DictionaryServiceGeographicLocationType;
import jp.co.yahoo.adsdisplayapi.v4.model.DictionaryServiceLang;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationSelectorオブジェクトは、取得する地域情報のリスト言語を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocationSelector object displays the language selection for retrieving geographic location list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationSelectorオブジェクトは、取得する地域情報のリスト言語を表します。</div> <div lang=\"en\">DictionaryServiceGeographicLocationSelector object displays the language selection for retrieving geographic location list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceGeographicLocationSelector   {
  @JsonProperty("geographicLocationType")
  private DictionaryServiceGeographicLocationType geographicLocationType = null;

  @JsonProperty("lang")
  private DictionaryServiceLang lang = null;

  public DictionaryServiceGeographicLocationSelector geographicLocationType(DictionaryServiceGeographicLocationType geographicLocationType) {
    this.geographicLocationType = geographicLocationType;
    return this;
  }

  /**
   * Get geographicLocationType
   * @return geographicLocationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServiceGeographicLocationType getGeographicLocationType() {
    return geographicLocationType;
  }

  public void setGeographicLocationType(DictionaryServiceGeographicLocationType geographicLocationType) {
    this.geographicLocationType = geographicLocationType;
  }

  public DictionaryServiceGeographicLocationSelector lang(DictionaryServiceLang lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DictionaryServiceLang getLang() {
    return lang;
  }

  public void setLang(DictionaryServiceLang lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceGeographicLocationSelector dictionaryServiceGeographicLocationSelector = (DictionaryServiceGeographicLocationSelector) o;
    return Objects.equals(this.geographicLocationType, dictionaryServiceGeographicLocationSelector.geographicLocationType) &&
        Objects.equals(this.lang, dictionaryServiceGeographicLocationSelector.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geographicLocationType, lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGeographicLocationSelector {\n");
    
    sb.append("    geographicLocationType: ").append(toIndentedString(geographicLocationType)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.DictionaryServiceLang;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceCategorySelectorオブジェクトは、取得するカテゴリー情報の言語を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceCategorySelector object displays the language of retrieved category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceCategorySelectorオブジェクトは、取得するカテゴリー情報の言語を表します。</div> <div lang=\"en\">DictionaryServiceCategorySelector object displays the language of retrieved category information.</div> ")

public class DictionaryServiceCategorySelector   {
  @JsonProperty("lang")
  private JsonNullable<DictionaryServiceLang> lang = JsonNullable.undefined();

  public DictionaryServiceCategorySelector lang(DictionaryServiceLang lang) {
    this.lang = JsonNullable.of(lang);
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<DictionaryServiceLang> getLang() {
    return lang;
  }

  public void setLang(JsonNullable<DictionaryServiceLang> lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceCategorySelector dictionaryServiceCategorySelector = (DictionaryServiceCategorySelector) o;
    return Objects.equals(this.lang, dictionaryServiceCategorySelector.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceCategorySelector {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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


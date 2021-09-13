package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.DictionaryServiceLang;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategorySelectorオブジェクトは、取得するGoogleProductCategoryの言語を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceFeedItemGoogleProductCategorySelector object indicates the language of an obtained Google Product Category.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceFeedItemGoogleProductCategorySelectorオブジェクトは、取得するGoogleProductCategoryの言語を表します。</div> <div lang=\"en\">DictionaryServiceFeedItemGoogleProductCategorySelector object indicates the language of an obtained Google Product Category.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceFeedItemGoogleProductCategorySelector   {
  @JsonProperty("lang")
  private DictionaryServiceLang lang = null;

  public DictionaryServiceFeedItemGoogleProductCategorySelector lang(DictionaryServiceLang lang) {
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
    DictionaryServiceFeedItemGoogleProductCategorySelector dictionaryServiceFeedItemGoogleProductCategorySelector = (DictionaryServiceFeedItemGoogleProductCategorySelector) o;
    return Objects.equals(this.lang, dictionaryServiceFeedItemGoogleProductCategorySelector.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceFeedItemGoogleProductCategorySelector {\n");
    
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


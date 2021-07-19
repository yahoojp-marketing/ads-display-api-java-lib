package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.PlacementUrlIdeaServiceAdFormatConditions;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The objects to keep get method search conditions (execution parameter).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持するオブジェクトです。</div> <div lang=\"en\">The objects to keep get method search conditions (execution parameter).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlacementUrlIdeaServiceSelector   {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("siteCategories")
  @Valid
  private List<String> siteCategories = null;

  @JsonProperty("adFormats")
  @Valid
  private List<PlacementUrlIdeaServiceAdFormatConditions> adFormats = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  public PlacementUrlIdeaServiceSelector keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <div lang=\"ja\"> 検索キーワードの配列です。<br> ・URLを検索するためのキーワードです。<br> ・部分一致です。<br> ・スペース区切りでAND検索です。<br> ・最大文字数250です。<br> ・スペース区切りでの単語数は最大10個です。 </div> <div lang=\"en\"> Array of Search keyword.<br> ・Keyword to search the URL<br> ・Broad match<br> ・Search all keywords (AND), separated by spaces<br> ・Maximum of 250 characters<br> ・Maximum of 10 spaces to separate the words </div> 
   * @return keyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索キーワードの配列です。<br> ・URLを検索するためのキーワードです。<br> ・部分一致です。<br> ・スペース区切りでAND検索です。<br> ・最大文字数250です。<br> ・スペース区切りでの単語数は最大10個です。 </div> <div lang=\"en\"> Array of Search keyword.<br> ・Keyword to search the URL<br> ・Broad match<br> ・Search all keywords (AND), separated by spaces<br> ・Maximum of 250 characters<br> ・Maximum of 10 spaces to separate the words </div> ")


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public PlacementUrlIdeaServiceSelector siteCategories(List<String> siteCategories) {
    this.siteCategories = siteCategories;
    return this;
  }

  public PlacementUrlIdeaServiceSelector addSiteCategoriesItem(String siteCategoriesItem) {
    if (this.siteCategories == null) {
      this.siteCategories = new ArrayList<>();
    }
    this.siteCategories.add(siteCategoriesItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> カテゴリの配列です。<br> ・URLのカテゴリです。<br> ・完全一致です。<br> ・複数指定でOR検索です。<br> ・TC-SC-xxxxxxで現される規定値です。<br> ・DicitonaryServiceから返ってくるTC-SC-xxxxxxをそのまま指定です。<br> ・最大50件です。 </div> <div lang=\"en\"> Array of categories.<br> ・Category of URL<br> ・Exact match<br> ・Search multiple specific keywords (OR)<br> ・From value: TC-SC-xxxxxx<br> ・Choose the TC-SC-xxxxxx value from DictionaryService<br> ・Maximum of 50 cases </div> 
   * @return siteCategories
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カテゴリの配列です。<br> ・URLのカテゴリです。<br> ・完全一致です。<br> ・複数指定でOR検索です。<br> ・TC-SC-xxxxxxで現される規定値です。<br> ・DicitonaryServiceから返ってくるTC-SC-xxxxxxをそのまま指定です。<br> ・最大50件です。 </div> <div lang=\"en\"> Array of categories.<br> ・Category of URL<br> ・Exact match<br> ・Search multiple specific keywords (OR)<br> ・From value: TC-SC-xxxxxx<br> ・Choose the TC-SC-xxxxxx value from DictionaryService<br> ・Maximum of 50 cases </div> ")

@Size(max=50) 
  public List<String> getSiteCategories() {
    return siteCategories;
  }

  public void setSiteCategories(List<String> siteCategories) {
    this.siteCategories = siteCategories;
  }

  public PlacementUrlIdeaServiceSelector adFormats(List<PlacementUrlIdeaServiceAdFormatConditions> adFormats) {
    this.adFormats = adFormats;
    return this;
  }

  public PlacementUrlIdeaServiceSelector addAdFormatsItem(PlacementUrlIdeaServiceAdFormatConditions adFormatsItem) {
    if (this.adFormats == null) {
      this.adFormats = new ArrayList<>();
    }
    this.adFormats.add(adFormatsItem);
    return this;
  }

  /**
   * Get adFormats
   * @return adFormats
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=15) 
  public List<PlacementUrlIdeaServiceAdFormatConditions> getAdFormats() {
    return adFormats;
  }

  public void setAdFormats(List<PlacementUrlIdeaServiceAdFormatConditions> adFormats) {
    this.adFormats = adFormats;
  }

  public PlacementUrlIdeaServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public PlacementUrlIdeaServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlIdeaServiceSelector placementUrlIdeaServiceSelector = (PlacementUrlIdeaServiceSelector) o;
    return Objects.equals(this.keyword, placementUrlIdeaServiceSelector.keyword) &&
        Objects.equals(this.siteCategories, placementUrlIdeaServiceSelector.siteCategories) &&
        Objects.equals(this.adFormats, placementUrlIdeaServiceSelector.adFormats) &&
        Objects.equals(this.startIndex, placementUrlIdeaServiceSelector.startIndex) &&
        Objects.equals(this.numberResults, placementUrlIdeaServiceSelector.numberResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, siteCategories, adFormats, startIndex, numberResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlIdeaServiceSelector {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    siteCategories: ").append(toIndentedString(siteCategories)).append("\n");
    sb.append("    adFormats: ").append(toIndentedString(adFormats)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
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


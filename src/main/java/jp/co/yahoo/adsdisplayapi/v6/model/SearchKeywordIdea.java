package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchKeywordIdeaServiceAvailabilityStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordIdeaオブジェクトは、サーチターゲティング対象キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordIdea object is keyword for search targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordIdeaオブジェクトは、サーチターゲティング対象キーワードです。</div> <div lang=\"en\">SearchKeywordIdea object is keyword for search targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchKeywordIdea   {
  @JsonProperty("desktopSearchVolume")
  private Long desktopSearchVolume = null;

  @JsonProperty("releaseDate")
  private String releaseDate = null;

  @JsonProperty("searchKeyword")
  private String searchKeyword = null;

  @JsonProperty("searchKeywordId")
  private Long searchKeywordId = null;

  @JsonProperty("smartPhoneSearchVolume")
  private Long smartPhoneSearchVolume = null;

  @JsonProperty("tabletSearchVolume")
  private Long tabletSearchVolume = null;

  @JsonProperty("closeDate")
  private String closeDate = null;

  @JsonProperty("availabilityStatus")
  private SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus = null;

  public SearchKeywordIdea desktopSearchVolume(Long desktopSearchVolume) {
    this.desktopSearchVolume = desktopSearchVolume;
    return this;
  }

  /**
   * <div lang=\"ja\"> PCでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on PC.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> 
   * @return desktopSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> PCでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on PC.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> ")


  public Long getDesktopSearchVolume() {
    return desktopSearchVolume;
  }

  public void setDesktopSearchVolume(Long desktopSearchVolume) {
    this.desktopSearchVolume = desktopSearchVolume;
  }

  public SearchKeywordIdea releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワード追加日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Additional date of keyword.<br> * Format: yyyyMMdd</div> 
   * @return releaseDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワード追加日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Additional date of keyword.<br> * Format: yyyyMMdd</div> ")


  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public SearchKeywordIdea searchKeyword(String searchKeyword) {
    this.searchKeyword = searchKeyword;
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワードです。</div> <div lang=\"en\">Search keyword.</div> 
   * @return searchKeyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワードです。</div> <div lang=\"en\">Search keyword.</div> ")


  public String getSearchKeyword() {
    return searchKeyword;
  }

  public void setSearchKeyword(String searchKeyword) {
    this.searchKeyword = searchKeyword;
  }

  public SearchKeywordIdea searchKeywordId(Long searchKeywordId) {
    this.searchKeywordId = searchKeywordId;
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワードIDです。</div> <div lang=\"en\">Search keyword ID.</div> 
   * @return searchKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワードIDです。</div> <div lang=\"en\">Search keyword ID.</div> ")


  public Long getSearchKeywordId() {
    return searchKeywordId;
  }

  public void setSearchKeywordId(Long searchKeywordId) {
    this.searchKeywordId = searchKeywordId;
  }

  public SearchKeywordIdea smartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
    return this;
  }

  /**
   * <div lang=\"ja\"> スマートフォンでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on Smartphone.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> 
   * @return smartPhoneSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> スマートフォンでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on Smartphone.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> ")


  public Long getSmartPhoneSearchVolume() {
    return smartPhoneSearchVolume;
  }

  public void setSmartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
  }

  public SearchKeywordIdea tabletSearchVolume(Long tabletSearchVolume) {
    this.tabletSearchVolume = tabletSearchVolume;
    return this;
  }

  /**
   * <div lang=\"ja\"> タブレットでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on Tablet.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> 
   * @return tabletSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> タブレットでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on Tablet.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> ")


  public Long getTabletSearchVolume() {
    return tabletSearchVolume;
  }

  public void setTabletSearchVolume(Long tabletSearchVolume) {
    this.tabletSearchVolume = tabletSearchVolume;
  }

  public SearchKeywordIdea closeDate(String closeDate) {
    this.closeDate = closeDate;
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワード停止日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Stop date of keyword.<br> * Format: yyyyMMdd</div> 
   * @return closeDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワード停止日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Stop date of keyword.<br> * Format: yyyyMMdd</div> ")


  public String getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
  }

  public SearchKeywordIdea availabilityStatus(SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
    return this;
  }

  /**
   * Get availabilityStatus
   * @return availabilityStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordIdeaServiceAvailabilityStatus getAvailabilityStatus() {
    return availabilityStatus;
  }

  public void setAvailabilityStatus(SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordIdea searchKeywordIdea = (SearchKeywordIdea) o;
    return Objects.equals(this.desktopSearchVolume, searchKeywordIdea.desktopSearchVolume) &&
        Objects.equals(this.releaseDate, searchKeywordIdea.releaseDate) &&
        Objects.equals(this.searchKeyword, searchKeywordIdea.searchKeyword) &&
        Objects.equals(this.searchKeywordId, searchKeywordIdea.searchKeywordId) &&
        Objects.equals(this.smartPhoneSearchVolume, searchKeywordIdea.smartPhoneSearchVolume) &&
        Objects.equals(this.tabletSearchVolume, searchKeywordIdea.tabletSearchVolume) &&
        Objects.equals(this.closeDate, searchKeywordIdea.closeDate) &&
        Objects.equals(this.availabilityStatus, searchKeywordIdea.availabilityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktopSearchVolume, releaseDate, searchKeyword, searchKeywordId, smartPhoneSearchVolume, tabletSearchVolume, closeDate, availabilityStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordIdea {\n");
    
    sb.append("    desktopSearchVolume: ").append(toIndentedString(desktopSearchVolume)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
    sb.append("    searchKeywordId: ").append(toIndentedString(searchKeywordId)).append("\n");
    sb.append("    smartPhoneSearchVolume: ").append(toIndentedString(smartPhoneSearchVolume)).append("\n");
    sb.append("    tabletSearchVolume: ").append(toIndentedString(tabletSearchVolume)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    availabilityStatus: ").append(toIndentedString(availabilityStatus)).append("\n");
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


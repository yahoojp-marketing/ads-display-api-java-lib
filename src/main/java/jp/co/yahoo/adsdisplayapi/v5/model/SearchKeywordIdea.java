package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordIdeaServiceAvailabilityStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordIdeaオブジェクトは、サーチターゲティング対象キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordIdea object is keyword for search targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordIdeaオブジェクトは、サーチターゲティング対象キーワードです。</div> <div lang=\"en\">SearchKeywordIdea object is keyword for search targeting.</div> ")

public class SearchKeywordIdea   {
  @JsonProperty("desktopSearchVolume")
  private JsonNullable<Long> desktopSearchVolume = JsonNullable.undefined();

  @JsonProperty("releaseDate")
  private JsonNullable<String> releaseDate = JsonNullable.undefined();

  @JsonProperty("searchKeyword")
  private JsonNullable<String> searchKeyword = JsonNullable.undefined();

  @JsonProperty("searchKeywordId")
  private JsonNullable<Long> searchKeywordId = JsonNullable.undefined();

  @JsonProperty("smartPhoneSearchVolume")
  private JsonNullable<Long> smartPhoneSearchVolume = JsonNullable.undefined();

  @JsonProperty("tabletSearchVolume")
  private JsonNullable<Long> tabletSearchVolume = JsonNullable.undefined();

  @JsonProperty("closeDate")
  private JsonNullable<String> closeDate = JsonNullable.undefined();

  @JsonProperty("availabilityStatus")
  private JsonNullable<SearchKeywordIdeaServiceAvailabilityStatus> availabilityStatus = JsonNullable.undefined();

  public SearchKeywordIdea desktopSearchVolume(Long desktopSearchVolume) {
    this.desktopSearchVolume = JsonNullable.of(desktopSearchVolume);
    return this;
  }

  /**
   * <div lang=\"ja\"> PCでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on PC.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> 
   * @return desktopSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> PCでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on PC.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> ")


  public JsonNullable<Long> getDesktopSearchVolume() {
    return desktopSearchVolume;
  }

  public void setDesktopSearchVolume(JsonNullable<Long> desktopSearchVolume) {
    this.desktopSearchVolume = desktopSearchVolume;
  }

  public SearchKeywordIdea releaseDate(String releaseDate) {
    this.releaseDate = JsonNullable.of(releaseDate);
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワード追加日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Additional date of keyword.<br> * Format: yyyyMMdd</div> 
   * @return releaseDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワード追加日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Additional date of keyword.<br> * Format: yyyyMMdd</div> ")


  public JsonNullable<String> getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(JsonNullable<String> releaseDate) {
    this.releaseDate = releaseDate;
  }

  public SearchKeywordIdea searchKeyword(String searchKeyword) {
    this.searchKeyword = JsonNullable.of(searchKeyword);
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワードです。</div> <div lang=\"en\">Search keyword.</div> 
   * @return searchKeyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワードです。</div> <div lang=\"en\">Search keyword.</div> ")


  public JsonNullable<String> getSearchKeyword() {
    return searchKeyword;
  }

  public void setSearchKeyword(JsonNullable<String> searchKeyword) {
    this.searchKeyword = searchKeyword;
  }

  public SearchKeywordIdea searchKeywordId(Long searchKeywordId) {
    this.searchKeywordId = JsonNullable.of(searchKeywordId);
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワードIDです。</div> <div lang=\"en\">Search keyword ID.</div> 
   * @return searchKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワードIDです。</div> <div lang=\"en\">Search keyword ID.</div> ")


  public JsonNullable<Long> getSearchKeywordId() {
    return searchKeywordId;
  }

  public void setSearchKeywordId(JsonNullable<Long> searchKeywordId) {
    this.searchKeywordId = searchKeywordId;
  }

  public SearchKeywordIdea smartPhoneSearchVolume(Long smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = JsonNullable.of(smartPhoneSearchVolume);
    return this;
  }

  /**
   * <div lang=\"ja\"> スマートフォンでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on Smartphone.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> 
   * @return smartPhoneSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> スマートフォンでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on Smartphone.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> ")


  public JsonNullable<Long> getSmartPhoneSearchVolume() {
    return smartPhoneSearchVolume;
  }

  public void setSmartPhoneSearchVolume(JsonNullable<Long> smartPhoneSearchVolume) {
    this.smartPhoneSearchVolume = smartPhoneSearchVolume;
  }

  public SearchKeywordIdea tabletSearchVolume(Long tabletSearchVolume) {
    this.tabletSearchVolume = JsonNullable.of(tabletSearchVolume);
    return this;
  }

  /**
   * <div lang=\"ja\"> タブレットでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on Tablet.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> 
   * @return tabletSearchVolume
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> タブレットでのリーチ数です。<br> ※1000件未満の場合は<br> 0が取得されます。<br> ※サーチキーワードの停止日以降はnullが返却されます。 </div> <div lang=\"en\"> Reach numbers on Tablet.<br> *If it is less than 1000 times, the value &#34;0&#34; will be responded.<br> *After the stop date of search keyword, null will be returned. </div> ")


  public JsonNullable<Long> getTabletSearchVolume() {
    return tabletSearchVolume;
  }

  public void setTabletSearchVolume(JsonNullable<Long> tabletSearchVolume) {
    this.tabletSearchVolume = tabletSearchVolume;
  }

  public SearchKeywordIdea closeDate(String closeDate) {
    this.closeDate = JsonNullable.of(closeDate);
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワード停止日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Stop date of keyword.<br> * Format: yyyyMMdd</div> 
   * @return closeDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワード停止日です。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\"> Stop date of keyword.<br> * Format: yyyyMMdd</div> ")


  public JsonNullable<String> getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(JsonNullable<String> closeDate) {
    this.closeDate = closeDate;
  }

  public SearchKeywordIdea availabilityStatus(SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus) {
    this.availabilityStatus = JsonNullable.of(availabilityStatus);
    return this;
  }

  /**
   * Get availabilityStatus
   * @return availabilityStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchKeywordIdeaServiceAvailabilityStatus> getAvailabilityStatus() {
    return availabilityStatus;
  }

  public void setAvailabilityStatus(JsonNullable<SearchKeywordIdeaServiceAvailabilityStatus> availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


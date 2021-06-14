package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.PlacementUrlIdeaServiceAdFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;An object that holds the placement Url information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。</div> <div lang=\"en\">An object that holds the placement Url information.</div> ")

public class PlacementUrlIdea   {
  @JsonProperty("keyword")
  private JsonNullable<String> keyword = JsonNullable.undefined();

  @JsonProperty("siteCategory")
  @Valid
  private JsonNullable<List<String>> siteCategory = JsonNullable.undefined();

  @JsonProperty("searchUrl")
  private JsonNullable<String> searchUrl = JsonNullable.undefined();

  @JsonProperty("adFormat")
  @Valid
  private JsonNullable<List<PlacementUrlIdeaServiceAdFormat>> adFormat = JsonNullable.undefined();

  @JsonProperty("desktopReaches")
  private JsonNullable<Long> desktopReaches = JsonNullable.undefined();

  @JsonProperty("desktopAdRequests")
  private JsonNullable<Long> desktopAdRequests = JsonNullable.undefined();

  @JsonProperty("smartPhoneReaches")
  private JsonNullable<Long> smartPhoneReaches = JsonNullable.undefined();

  @JsonProperty("smartPhoneAdRequests")
  private JsonNullable<Long> smartPhoneAdRequests = JsonNullable.undefined();

  @JsonProperty("tabletReaches")
  private JsonNullable<Long> tabletReaches = JsonNullable.undefined();

  @JsonProperty("tabletAdRequests")
  private JsonNullable<Long> tabletAdRequests = JsonNullable.undefined();

  public PlacementUrlIdea keyword(String keyword) {
    this.keyword = JsonNullable.of(keyword);
    return this;
  }

  /**
   * <div lang=\"ja\">検索キーワードです。</div> <div lang=\"en\">Search Keyword</div> 
   * @return keyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索キーワードです。</div> <div lang=\"en\">Search Keyword</div> ")


  public JsonNullable<String> getKeyword() {
    return keyword;
  }

  public void setKeyword(JsonNullable<String> keyword) {
    this.keyword = keyword;
  }

  public PlacementUrlIdea siteCategory(List<String> siteCategory) {
    this.siteCategory = JsonNullable.of(siteCategory);
    return this;
  }

  public PlacementUrlIdea addSiteCategoryItem(String siteCategoryItem) {
    if (this.siteCategory == null || !this.siteCategory.isPresent()) {
      this.siteCategory = JsonNullable.of(new ArrayList<>());
    }
    this.siteCategory.get().add(siteCategoryItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索カテゴリです。</div> <div lang=\"en\">Search Category</div> 
   * @return siteCategory
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索カテゴリです。</div> <div lang=\"en\">Search Category</div> ")


  public JsonNullable<List<String>> getSiteCategory() {
    return siteCategory;
  }

  public void setSiteCategory(JsonNullable<List<String>> siteCategory) {
    this.siteCategory = siteCategory;
  }

  public PlacementUrlIdea searchUrl(String searchUrl) {
    this.searchUrl = JsonNullable.of(searchUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 取得URLです。<br> 不明なURLの場合　UNKNOWN_URLが入ります。 </div> <div lang=\"en\">URL</div> 
   * @return searchUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 取得URLです。<br> 不明なURLの場合　UNKNOWN_URLが入ります。 </div> <div lang=\"en\">URL</div> ")


  public JsonNullable<String> getSearchUrl() {
    return searchUrl;
  }

  public void setSearchUrl(JsonNullable<String> searchUrl) {
    this.searchUrl = searchUrl;
  }

  public PlacementUrlIdea adFormat(List<PlacementUrlIdeaServiceAdFormat> adFormat) {
    this.adFormat = JsonNullable.of(adFormat);
    return this;
  }

  public PlacementUrlIdea addAdFormatItem(PlacementUrlIdeaServiceAdFormat adFormatItem) {
    if (this.adFormat == null || !this.adFormat.isPresent()) {
      this.adFormat = JsonNullable.of(new ArrayList<>());
    }
    this.adFormat.get().add(adFormatItem);
    return this;
  }

  /**
   * Get adFormat
   * @return adFormat
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<PlacementUrlIdeaServiceAdFormat>> getAdFormat() {
    return adFormat;
  }

  public void setAdFormat(JsonNullable<List<PlacementUrlIdeaServiceAdFormat>> adFormat) {
    this.adFormat = adFormat;
  }

  public PlacementUrlIdea desktopReaches(Long desktopReaches) {
    this.desktopReaches = JsonNullable.of(desktopReaches);
    return this;
  }

  /**
   * <div lang=\"ja\"> PC でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of PC(1000 In the case of 0)</div> 
   * @return desktopReaches
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> PC でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of PC(1000 In the case of 0)</div> ")


  public JsonNullable<Long> getDesktopReaches() {
    return desktopReaches;
  }

  public void setDesktopReaches(JsonNullable<Long> desktopReaches) {
    this.desktopReaches = desktopReaches;
  }

  public PlacementUrlIdea desktopAdRequests(Long desktopAdRequests) {
    this.desktopAdRequests = JsonNullable.of(desktopAdRequests);
    return this;
  }

  /**
   * <div lang=\"ja\"> PC でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of PC(1000 In the case of 0)</div> 
   * @return desktopAdRequests
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> PC でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of PC(1000 In the case of 0)</div> ")


  public JsonNullable<Long> getDesktopAdRequests() {
    return desktopAdRequests;
  }

  public void setDesktopAdRequests(JsonNullable<Long> desktopAdRequests) {
    this.desktopAdRequests = desktopAdRequests;
  }

  public PlacementUrlIdea smartPhoneReaches(Long smartPhoneReaches) {
    this.smartPhoneReaches = JsonNullable.of(smartPhoneReaches);
    return this;
  }

  /**
   * <div lang=\"ja\"> SmartPhone でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of SmartPhone (1000 In the case of 0)</div> 
   * @return smartPhoneReaches
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SmartPhone でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of SmartPhone (1000 In the case of 0)</div> ")


  public JsonNullable<Long> getSmartPhoneReaches() {
    return smartPhoneReaches;
  }

  public void setSmartPhoneReaches(JsonNullable<Long> smartPhoneReaches) {
    this.smartPhoneReaches = smartPhoneReaches;
  }

  public PlacementUrlIdea smartPhoneAdRequests(Long smartPhoneAdRequests) {
    this.smartPhoneAdRequests = JsonNullable.of(smartPhoneAdRequests);
    return this;
  }

  /**
   * <div lang=\"ja\"> SmartPhone でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of SmartPhone(1000 In the case of 0)</div> 
   * @return smartPhoneAdRequests
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SmartPhone でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of SmartPhone(1000 In the case of 0)</div> ")


  public JsonNullable<Long> getSmartPhoneAdRequests() {
    return smartPhoneAdRequests;
  }

  public void setSmartPhoneAdRequests(JsonNullable<Long> smartPhoneAdRequests) {
    this.smartPhoneAdRequests = smartPhoneAdRequests;
  }

  public PlacementUrlIdea tabletReaches(Long tabletReaches) {
    this.tabletReaches = JsonNullable.of(tabletReaches);
    return this;
  }

  /**
   * <div lang=\"ja\"> Tablet でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Tablet(1000 In the case of 0)</div> 
   * @return tabletReaches
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Tablet でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Tablet(1000 In the case of 0)</div> ")


  public JsonNullable<Long> getTabletReaches() {
    return tabletReaches;
  }

  public void setTabletReaches(JsonNullable<Long> tabletReaches) {
    this.tabletReaches = tabletReaches;
  }

  public PlacementUrlIdea tabletAdRequests(Long tabletAdRequests) {
    this.tabletAdRequests = JsonNullable.of(tabletAdRequests);
    return this;
  }

  /**
   * <div lang=\"ja\"> TabletでのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of Tablet (1000 In the case of 0)</div> 
   * @return tabletAdRequests
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> TabletでのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of Tablet (1000 In the case of 0)</div> ")


  public JsonNullable<Long> getTabletAdRequests() {
    return tabletAdRequests;
  }

  public void setTabletAdRequests(JsonNullable<Long> tabletAdRequests) {
    this.tabletAdRequests = tabletAdRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlIdea placementUrlIdea = (PlacementUrlIdea) o;
    return Objects.equals(this.keyword, placementUrlIdea.keyword) &&
        Objects.equals(this.siteCategory, placementUrlIdea.siteCategory) &&
        Objects.equals(this.searchUrl, placementUrlIdea.searchUrl) &&
        Objects.equals(this.adFormat, placementUrlIdea.adFormat) &&
        Objects.equals(this.desktopReaches, placementUrlIdea.desktopReaches) &&
        Objects.equals(this.desktopAdRequests, placementUrlIdea.desktopAdRequests) &&
        Objects.equals(this.smartPhoneReaches, placementUrlIdea.smartPhoneReaches) &&
        Objects.equals(this.smartPhoneAdRequests, placementUrlIdea.smartPhoneAdRequests) &&
        Objects.equals(this.tabletReaches, placementUrlIdea.tabletReaches) &&
        Objects.equals(this.tabletAdRequests, placementUrlIdea.tabletAdRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, siteCategory, searchUrl, adFormat, desktopReaches, desktopAdRequests, smartPhoneReaches, smartPhoneAdRequests, tabletReaches, tabletAdRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlIdea {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    siteCategory: ").append(toIndentedString(siteCategory)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    adFormat: ").append(toIndentedString(adFormat)).append("\n");
    sb.append("    desktopReaches: ").append(toIndentedString(desktopReaches)).append("\n");
    sb.append("    desktopAdRequests: ").append(toIndentedString(desktopAdRequests)).append("\n");
    sb.append("    smartPhoneReaches: ").append(toIndentedString(smartPhoneReaches)).append("\n");
    sb.append("    smartPhoneAdRequests: ").append(toIndentedString(smartPhoneAdRequests)).append("\n");
    sb.append("    tabletReaches: ").append(toIndentedString(tabletReaches)).append("\n");
    sb.append("    tabletAdRequests: ").append(toIndentedString(tabletAdRequests)).append("\n");
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


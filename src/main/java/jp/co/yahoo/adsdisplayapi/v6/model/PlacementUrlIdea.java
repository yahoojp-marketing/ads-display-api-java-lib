package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.PlacementUrlIdeaServiceAdFormat;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;An object that holds the placement Url information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaオブジェクトは、プレイスメントUrl情報を保持するオブジェクトです。</div> <div lang=\"en\">An object that holds the placement Url information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlacementUrlIdea   {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("siteCategory")
  @Valid
  private List<String> siteCategory = null;

  @JsonProperty("searchUrl")
  private String searchUrl = null;

  @JsonProperty("adFormat")
  @Valid
  private List<PlacementUrlIdeaServiceAdFormat> adFormat = null;

  @JsonProperty("desktopReaches")
  private Long desktopReaches = null;

  @JsonProperty("desktopAdRequests")
  private Long desktopAdRequests = null;

  @JsonProperty("smartPhoneReaches")
  private Long smartPhoneReaches = null;

  @JsonProperty("smartPhoneAdRequests")
  private Long smartPhoneAdRequests = null;

  @JsonProperty("tabletReaches")
  private Long tabletReaches = null;

  @JsonProperty("tabletAdRequests")
  private Long tabletAdRequests = null;

  public PlacementUrlIdea keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <div lang=\"ja\">検索キーワードです。</div> <div lang=\"en\">Search Keyword</div> 
   * @return keyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索キーワードです。</div> <div lang=\"en\">Search Keyword</div> ")


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public PlacementUrlIdea siteCategory(List<String> siteCategory) {
    this.siteCategory = siteCategory;
    return this;
  }

  public PlacementUrlIdea addSiteCategoryItem(String siteCategoryItem) {
    if (this.siteCategory == null) {
      this.siteCategory = new ArrayList<>();
    }
    this.siteCategory.add(siteCategoryItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索カテゴリです。</div> <div lang=\"en\">Search Category</div> 
   * @return siteCategory
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索カテゴリです。</div> <div lang=\"en\">Search Category</div> ")


  public List<String> getSiteCategory() {
    return siteCategory;
  }

  public void setSiteCategory(List<String> siteCategory) {
    this.siteCategory = siteCategory;
  }

  public PlacementUrlIdea searchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> 取得URLです。<br> 不明なURLの場合　UNKNOWN_URLが入ります。 </div> <div lang=\"en\">URL</div> 
   * @return searchUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 取得URLです。<br> 不明なURLの場合　UNKNOWN_URLが入ります。 </div> <div lang=\"en\">URL</div> ")


  public String getSearchUrl() {
    return searchUrl;
  }

  public void setSearchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
  }

  public PlacementUrlIdea adFormat(List<PlacementUrlIdeaServiceAdFormat> adFormat) {
    this.adFormat = adFormat;
    return this;
  }

  public PlacementUrlIdea addAdFormatItem(PlacementUrlIdeaServiceAdFormat adFormatItem) {
    if (this.adFormat == null) {
      this.adFormat = new ArrayList<>();
    }
    this.adFormat.add(adFormatItem);
    return this;
  }

  /**
   * Get adFormat
   * @return adFormat
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PlacementUrlIdeaServiceAdFormat> getAdFormat() {
    return adFormat;
  }

  public void setAdFormat(List<PlacementUrlIdeaServiceAdFormat> adFormat) {
    this.adFormat = adFormat;
  }

  public PlacementUrlIdea desktopReaches(Long desktopReaches) {
    this.desktopReaches = desktopReaches;
    return this;
  }

  /**
   * <div lang=\"ja\"> PC でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of PC(1000 In the case of 0)</div> 
   * @return desktopReaches
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> PC でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of PC(1000 In the case of 0)</div> ")


  public Long getDesktopReaches() {
    return desktopReaches;
  }

  public void setDesktopReaches(Long desktopReaches) {
    this.desktopReaches = desktopReaches;
  }

  public PlacementUrlIdea desktopAdRequests(Long desktopAdRequests) {
    this.desktopAdRequests = desktopAdRequests;
    return this;
  }

  /**
   * <div lang=\"ja\"> PC でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of PC(1000 In the case of 0)</div> 
   * @return desktopAdRequests
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> PC でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of PC(1000 In the case of 0)</div> ")


  public Long getDesktopAdRequests() {
    return desktopAdRequests;
  }

  public void setDesktopAdRequests(Long desktopAdRequests) {
    this.desktopAdRequests = desktopAdRequests;
  }

  public PlacementUrlIdea smartPhoneReaches(Long smartPhoneReaches) {
    this.smartPhoneReaches = smartPhoneReaches;
    return this;
  }

  /**
   * <div lang=\"ja\"> SmartPhone でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of SmartPhone (1000 In the case of 0)</div> 
   * @return smartPhoneReaches
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SmartPhone でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Reach Number of SmartPhone (1000 In the case of 0)</div> ")


  public Long getSmartPhoneReaches() {
    return smartPhoneReaches;
  }

  public void setSmartPhoneReaches(Long smartPhoneReaches) {
    this.smartPhoneReaches = smartPhoneReaches;
  }

  public PlacementUrlIdea smartPhoneAdRequests(Long smartPhoneAdRequests) {
    this.smartPhoneAdRequests = smartPhoneAdRequests;
    return this;
  }

  /**
   * <div lang=\"ja\"> SmartPhone でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of SmartPhone(1000 In the case of 0)</div> 
   * @return smartPhoneAdRequests
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SmartPhone でのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of SmartPhone(1000 In the case of 0)</div> ")


  public Long getSmartPhoneAdRequests() {
    return smartPhoneAdRequests;
  }

  public void setSmartPhoneAdRequests(Long smartPhoneAdRequests) {
    this.smartPhoneAdRequests = smartPhoneAdRequests;
  }

  public PlacementUrlIdea tabletReaches(Long tabletReaches) {
    this.tabletReaches = tabletReaches;
    return this;
  }

  /**
   * <div lang=\"ja\"> Tablet でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Tablet(1000 In the case of 0)</div> 
   * @return tabletReaches
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Tablet でのリーチ数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">Tablet(1000 In the case of 0)</div> ")


  public Long getTabletReaches() {
    return tabletReaches;
  }

  public void setTabletReaches(Long tabletReaches) {
    this.tabletReaches = tabletReaches;
  }

  public PlacementUrlIdea tabletAdRequests(Long tabletAdRequests) {
    this.tabletAdRequests = tabletAdRequests;
    return this;
  }

  /**
   * <div lang=\"ja\"> TabletでのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of Tablet (1000 In the case of 0)</div> 
   * @return tabletAdRequests
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> TabletでのADリクエスト数です。<br> ・1000未満の時は0が取得されます。 </div> <div lang=\"en\">AD Number of Tablet (1000 In the case of 0)</div> ")


  public Long getTabletAdRequests() {
    return tabletAdRequests;
  }

  public void setTabletAdRequests(Long tabletAdRequests) {
    this.tabletAdRequests = tabletAdRequests;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


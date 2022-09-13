/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v9.model.SearchLiftServiceKeyword;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchLiftオブジェクトは、サーチリフトの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchLift object describes information about the search lift.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchLiftオブジェクトは、サーチリフトの情報を表します。</div> <div lang=\"en\">SearchLift object describes information about the search lift.</div> ")
@JsonPropertyOrder({
  SearchLift.JSON_PROPERTY_ACCOUNT_ID,
  SearchLift.JSON_PROPERTY_CAMPAIGN_ID,
  SearchLift.JSON_PROPERTY_SEARCH_LIFT_ID,
  SearchLift.JSON_PROPERTY_KEYWORDS
})
@JsonTypeName("SearchLift")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchLift {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_SEARCH_LIFT_ID = "searchLiftId";
  private Long searchLiftId;

  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<SearchLiftServiceKeyword> keywords = null;

  public SearchLift() { 
  }

  public SearchLift accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID. </div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public SearchLift campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID. &lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID. </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public SearchLift searchLiftId(Long searchLiftId) {
    
    this.searchLiftId = searchLiftId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サーチリフト調査IDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchLift ID. &lt;/div&gt; 
   * @return searchLiftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サーチリフト調査IDです。</div> <div lang=\"en\">SearchLift ID. </div> ")
  @JsonProperty(JSON_PROPERTY_SEARCH_LIFT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSearchLiftId() {
    return searchLiftId;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_LIFT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchLiftId(Long searchLiftId) {
    this.searchLiftId = searchLiftId;
  }


  public SearchLift keywords(List<SearchLiftServiceKeyword> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public SearchLift addKeywordsItem(SearchLiftServiceKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SearchLiftServiceKeyword> getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywords(List<SearchLiftServiceKeyword> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchLift searchLift = (SearchLift) o;
    return Objects.equals(this.accountId, searchLift.accountId) &&
        Objects.equals(this.campaignId, searchLift.campaignId) &&
        Objects.equals(this.searchLiftId, searchLift.searchLiftId) &&
        Objects.equals(this.keywords, searchLift.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, searchLiftId, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchLift {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    searchLiftId: ").append(toIndentedString(searchLiftId)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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


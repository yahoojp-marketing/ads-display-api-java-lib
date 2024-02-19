/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceAdvancedSegmentsAudienceList;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceAppUserAudienceList;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceCombinationAudienceList;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceCustomerDataAudienceList;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceSimilarityAudienceList;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceType;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceWebsiteVisitorsAudienceList;
import jp.co.yahoo.adsdisplayapi.v13.model.AudienceListServiceYahooJapanAudienceDiscoveryAudienceList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceContentオブジェクトは、オーディエンスリストの詳細情報を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceContent object describes detailed information of audience list.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceContent.JSON_PROPERTY_COMBINATION_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_SIMILARITY_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_WEBSITE_VISITORS_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_CUSTOMER_DATA_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_APP_USER_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_YAHOO_JAPAN_AUDIENCE_DISCOVERY_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_ADVANCED_SEGMENTS_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_AUDIENCE_LIST_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceContent {
  public static final String JSON_PROPERTY_COMBINATION_AUDIENCE_LIST = "combinationAudienceList";
  private AudienceListServiceCombinationAudienceList combinationAudienceList;

  public static final String JSON_PROPERTY_SIMILARITY_AUDIENCE_LIST = "similarityAudienceList";
  private AudienceListServiceSimilarityAudienceList similarityAudienceList;

  public static final String JSON_PROPERTY_WEBSITE_VISITORS_AUDIENCE_LIST = "websiteVisitorsAudienceList";
  private AudienceListServiceWebsiteVisitorsAudienceList websiteVisitorsAudienceList;

  public static final String JSON_PROPERTY_CUSTOMER_DATA_AUDIENCE_LIST = "customerDataAudienceList";
  private AudienceListServiceCustomerDataAudienceList customerDataAudienceList;

  public static final String JSON_PROPERTY_APP_USER_AUDIENCE_LIST = "appUserAudienceList";
  private AudienceListServiceAppUserAudienceList appUserAudienceList;

  public static final String JSON_PROPERTY_YAHOO_JAPAN_AUDIENCE_DISCOVERY_AUDIENCE_LIST = "yahooJapanAudienceDiscoveryAudienceList";
  private AudienceListServiceYahooJapanAudienceDiscoveryAudienceList yahooJapanAudienceDiscoveryAudienceList;

  public static final String JSON_PROPERTY_ADVANCED_SEGMENTS_AUDIENCE_LIST = "advancedSegmentsAudienceList";
  private AudienceListServiceAdvancedSegmentsAudienceList advancedSegmentsAudienceList;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_TYPE = "audienceListType";
  private AudienceListServiceType audienceListType;

  public AudienceListServiceContent() {
  }

  public AudienceListServiceContent combinationAudienceList(AudienceListServiceCombinationAudienceList combinationAudienceList) {
    
    this.combinationAudienceList = combinationAudienceList;
    return this;
  }

   /**
   * Get combinationAudienceList
   * @return combinationAudienceList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMBINATION_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceCombinationAudienceList getCombinationAudienceList() {
    return combinationAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_COMBINATION_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinationAudienceList(AudienceListServiceCombinationAudienceList combinationAudienceList) {
    this.combinationAudienceList = combinationAudienceList;
  }


  public AudienceListServiceContent similarityAudienceList(AudienceListServiceSimilarityAudienceList similarityAudienceList) {
    
    this.similarityAudienceList = similarityAudienceList;
    return this;
  }

   /**
   * Get similarityAudienceList
   * @return similarityAudienceList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMILARITY_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceSimilarityAudienceList getSimilarityAudienceList() {
    return similarityAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_SIMILARITY_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimilarityAudienceList(AudienceListServiceSimilarityAudienceList similarityAudienceList) {
    this.similarityAudienceList = similarityAudienceList;
  }


  public AudienceListServiceContent websiteVisitorsAudienceList(AudienceListServiceWebsiteVisitorsAudienceList websiteVisitorsAudienceList) {
    
    this.websiteVisitorsAudienceList = websiteVisitorsAudienceList;
    return this;
  }

   /**
   * Get websiteVisitorsAudienceList
   * @return websiteVisitorsAudienceList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE_VISITORS_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceWebsiteVisitorsAudienceList getWebsiteVisitorsAudienceList() {
    return websiteVisitorsAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE_VISITORS_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsiteVisitorsAudienceList(AudienceListServiceWebsiteVisitorsAudienceList websiteVisitorsAudienceList) {
    this.websiteVisitorsAudienceList = websiteVisitorsAudienceList;
  }


  public AudienceListServiceContent customerDataAudienceList(AudienceListServiceCustomerDataAudienceList customerDataAudienceList) {
    
    this.customerDataAudienceList = customerDataAudienceList;
    return this;
  }

   /**
   * Get customerDataAudienceList
   * @return customerDataAudienceList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_DATA_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceCustomerDataAudienceList getCustomerDataAudienceList() {
    return customerDataAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_DATA_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerDataAudienceList(AudienceListServiceCustomerDataAudienceList customerDataAudienceList) {
    this.customerDataAudienceList = customerDataAudienceList;
  }


  public AudienceListServiceContent appUserAudienceList(AudienceListServiceAppUserAudienceList appUserAudienceList) {
    
    this.appUserAudienceList = appUserAudienceList;
    return this;
  }

   /**
   * Get appUserAudienceList
   * @return appUserAudienceList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_USER_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceAppUserAudienceList getAppUserAudienceList() {
    return appUserAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_APP_USER_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppUserAudienceList(AudienceListServiceAppUserAudienceList appUserAudienceList) {
    this.appUserAudienceList = appUserAudienceList;
  }


  public AudienceListServiceContent yahooJapanAudienceDiscoveryAudienceList(AudienceListServiceYahooJapanAudienceDiscoveryAudienceList yahooJapanAudienceDiscoveryAudienceList) {
    
    this.yahooJapanAudienceDiscoveryAudienceList = yahooJapanAudienceDiscoveryAudienceList;
    return this;
  }

   /**
   * Get yahooJapanAudienceDiscoveryAudienceList
   * @return yahooJapanAudienceDiscoveryAudienceList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YAHOO_JAPAN_AUDIENCE_DISCOVERY_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceYahooJapanAudienceDiscoveryAudienceList getYahooJapanAudienceDiscoveryAudienceList() {
    return yahooJapanAudienceDiscoveryAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_YAHOO_JAPAN_AUDIENCE_DISCOVERY_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYahooJapanAudienceDiscoveryAudienceList(AudienceListServiceYahooJapanAudienceDiscoveryAudienceList yahooJapanAudienceDiscoveryAudienceList) {
    this.yahooJapanAudienceDiscoveryAudienceList = yahooJapanAudienceDiscoveryAudienceList;
  }


  public AudienceListServiceContent advancedSegmentsAudienceList(AudienceListServiceAdvancedSegmentsAudienceList advancedSegmentsAudienceList) {
    
    this.advancedSegmentsAudienceList = advancedSegmentsAudienceList;
    return this;
  }

   /**
   * Get advancedSegmentsAudienceList
   * @return advancedSegmentsAudienceList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADVANCED_SEGMENTS_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceAdvancedSegmentsAudienceList getAdvancedSegmentsAudienceList() {
    return advancedSegmentsAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_ADVANCED_SEGMENTS_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdvancedSegmentsAudienceList(AudienceListServiceAdvancedSegmentsAudienceList advancedSegmentsAudienceList) {
    this.advancedSegmentsAudienceList = advancedSegmentsAudienceList;
  }


  public AudienceListServiceContent audienceListType(AudienceListServiceType audienceListType) {
    
    this.audienceListType = audienceListType;
    return this;
  }

   /**
   * Get audienceListType
   * @return audienceListType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceType getAudienceListType() {
    return audienceListType;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListType(AudienceListServiceType audienceListType) {
    this.audienceListType = audienceListType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceContent audienceListServiceContent = (AudienceListServiceContent) o;
    return Objects.equals(this.combinationAudienceList, audienceListServiceContent.combinationAudienceList) &&
        Objects.equals(this.similarityAudienceList, audienceListServiceContent.similarityAudienceList) &&
        Objects.equals(this.websiteVisitorsAudienceList, audienceListServiceContent.websiteVisitorsAudienceList) &&
        Objects.equals(this.customerDataAudienceList, audienceListServiceContent.customerDataAudienceList) &&
        Objects.equals(this.appUserAudienceList, audienceListServiceContent.appUserAudienceList) &&
        Objects.equals(this.yahooJapanAudienceDiscoveryAudienceList, audienceListServiceContent.yahooJapanAudienceDiscoveryAudienceList) &&
        Objects.equals(this.advancedSegmentsAudienceList, audienceListServiceContent.advancedSegmentsAudienceList) &&
        Objects.equals(this.audienceListType, audienceListServiceContent.audienceListType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinationAudienceList, similarityAudienceList, websiteVisitorsAudienceList, customerDataAudienceList, appUserAudienceList, yahooJapanAudienceDiscoveryAudienceList, advancedSegmentsAudienceList, audienceListType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceContent {\n");
    sb.append("    combinationAudienceList: ").append(toIndentedString(combinationAudienceList)).append("\n");
    sb.append("    similarityAudienceList: ").append(toIndentedString(similarityAudienceList)).append("\n");
    sb.append("    websiteVisitorsAudienceList: ").append(toIndentedString(websiteVisitorsAudienceList)).append("\n");
    sb.append("    customerDataAudienceList: ").append(toIndentedString(customerDataAudienceList)).append("\n");
    sb.append("    appUserAudienceList: ").append(toIndentedString(appUserAudienceList)).append("\n");
    sb.append("    yahooJapanAudienceDiscoveryAudienceList: ").append(toIndentedString(yahooJapanAudienceDiscoveryAudienceList)).append("\n");
    sb.append("    advancedSegmentsAudienceList: ").append(toIndentedString(advancedSegmentsAudienceList)).append("\n");
    sb.append("    audienceListType: ").append(toIndentedString(audienceListType)).append("\n");
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


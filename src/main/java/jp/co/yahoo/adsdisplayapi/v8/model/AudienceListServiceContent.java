/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v8.model.AudienceListServiceCombinationAudienceList;
import jp.co.yahoo.adsdisplayapi.v8.model.AudienceListServiceCustomAudienceList;
import jp.co.yahoo.adsdisplayapi.v8.model.AudienceListServiceCustomerDataAudienceList;
import jp.co.yahoo.adsdisplayapi.v8.model.AudienceListServiceRuleAudienceList;
import jp.co.yahoo.adsdisplayapi.v8.model.AudienceListServiceSimilarityAudienceList;
import jp.co.yahoo.adsdisplayapi.v8.model.AudienceListServiceType;
import jp.co.yahoo.adsdisplayapi.v8.model.AudienceListServiceWebsiteVisitorsAudienceList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceContentオブジェクトは、オーディエンスリストの詳細情報を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceContent object describes detailed information of audience list.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceContentオブジェクトは、オーディエンスリストの詳細情報を表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> AudienceListServiceContent object describes detailed information of audience list.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
@JsonPropertyOrder({
  AudienceListServiceContent.JSON_PROPERTY_COMBINATION_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_CUSTOM_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_RULE_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_SIMILARITY_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_WEBSITE_VISITORS_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_CUSTOMER_DATA_AUDIENCE_LIST,
  AudienceListServiceContent.JSON_PROPERTY_AUDIENCE_LIST_TYPE
})
@JsonTypeName("AudienceListServiceContent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceContent {
  public static final String JSON_PROPERTY_COMBINATION_AUDIENCE_LIST = "combinationAudienceList";
  private AudienceListServiceCombinationAudienceList combinationAudienceList;

  public static final String JSON_PROPERTY_CUSTOM_AUDIENCE_LIST = "customAudienceList";
  private AudienceListServiceCustomAudienceList customAudienceList;

  public static final String JSON_PROPERTY_RULE_AUDIENCE_LIST = "ruleAudienceList";
  private AudienceListServiceRuleAudienceList ruleAudienceList;

  public static final String JSON_PROPERTY_SIMILARITY_AUDIENCE_LIST = "similarityAudienceList";
  private AudienceListServiceSimilarityAudienceList similarityAudienceList;

  public static final String JSON_PROPERTY_WEBSITE_VISITORS_AUDIENCE_LIST = "websiteVisitorsAudienceList";
  private AudienceListServiceWebsiteVisitorsAudienceList websiteVisitorsAudienceList;

  public static final String JSON_PROPERTY_CUSTOMER_DATA_AUDIENCE_LIST = "customerDataAudienceList";
  private AudienceListServiceCustomerDataAudienceList customerDataAudienceList;

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public AudienceListServiceContent customAudienceList(AudienceListServiceCustomAudienceList customAudienceList) {
    
    this.customAudienceList = customAudienceList;
    return this;
  }

   /**
   * Get customAudienceList
   * @return customAudienceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceCustomAudienceList getCustomAudienceList() {
    return customAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomAudienceList(AudienceListServiceCustomAudienceList customAudienceList) {
    this.customAudienceList = customAudienceList;
  }


  public AudienceListServiceContent ruleAudienceList(AudienceListServiceRuleAudienceList ruleAudienceList) {
    
    this.ruleAudienceList = ruleAudienceList;
    return this;
  }

   /**
   * Get ruleAudienceList
   * @return ruleAudienceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULE_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceRuleAudienceList getRuleAudienceList() {
    return ruleAudienceList;
  }


  @JsonProperty(JSON_PROPERTY_RULE_AUDIENCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleAudienceList(AudienceListServiceRuleAudienceList ruleAudienceList) {
    this.ruleAudienceList = ruleAudienceList;
  }


  public AudienceListServiceContent similarityAudienceList(AudienceListServiceSimilarityAudienceList similarityAudienceList) {
    
    this.similarityAudienceList = similarityAudienceList;
    return this;
  }

   /**
   * Get similarityAudienceList
   * @return similarityAudienceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public AudienceListServiceContent audienceListType(AudienceListServiceType audienceListType) {
    
    this.audienceListType = audienceListType;
    return this;
  }

   /**
   * Get audienceListType
   * @return audienceListType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AudienceListServiceType getAudienceListType() {
    return audienceListType;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
        Objects.equals(this.customAudienceList, audienceListServiceContent.customAudienceList) &&
        Objects.equals(this.ruleAudienceList, audienceListServiceContent.ruleAudienceList) &&
        Objects.equals(this.similarityAudienceList, audienceListServiceContent.similarityAudienceList) &&
        Objects.equals(this.websiteVisitorsAudienceList, audienceListServiceContent.websiteVisitorsAudienceList) &&
        Objects.equals(this.customerDataAudienceList, audienceListServiceContent.customerDataAudienceList) &&
        Objects.equals(this.audienceListType, audienceListServiceContent.audienceListType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinationAudienceList, customAudienceList, ruleAudienceList, similarityAudienceList, websiteVisitorsAudienceList, customerDataAudienceList, audienceListType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceContent {\n");
    sb.append("    combinationAudienceList: ").append(toIndentedString(combinationAudienceList)).append("\n");
    sb.append("    customAudienceList: ").append(toIndentedString(customAudienceList)).append("\n");
    sb.append("    ruleAudienceList: ").append(toIndentedString(ruleAudienceList)).append("\n");
    sb.append("    similarityAudienceList: ").append(toIndentedString(similarityAudienceList)).append("\n");
    sb.append("    websiteVisitorsAudienceList: ").append(toIndentedString(websiteVisitorsAudienceList)).append("\n");
    sb.append("    customerDataAudienceList: ").append(toIndentedString(customerDataAudienceList)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceCombinationAudienceList;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceCustomAudienceList;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceCustomerDataAudienceList;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceRuleAudienceList;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceSimilarityAudienceList;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceType;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceWebsiteVisitorsAudienceList;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceContentオブジェクトは、オーディエンスリストの詳細情報を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceContent object describes detailed information of audience list.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AudienceListServiceContentオブジェクトは、オーディエンスリストの詳細情報を表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> AudienceListServiceContent object describes detailed information of audience list.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceContent   {
  @JsonProperty("combinationAudienceList")
  private AudienceListServiceCombinationAudienceList combinationAudienceList = null;

  @JsonProperty("customAudienceList")
  private AudienceListServiceCustomAudienceList customAudienceList = null;

  @JsonProperty("ruleAudienceList")
  private AudienceListServiceRuleAudienceList ruleAudienceList = null;

  @JsonProperty("similarityAudienceList")
  private AudienceListServiceSimilarityAudienceList similarityAudienceList = null;

  @JsonProperty("websiteVisitorsAudienceList")
  private AudienceListServiceWebsiteVisitorsAudienceList websiteVisitorsAudienceList = null;

  @JsonProperty("customerDataAudienceList")
  private AudienceListServiceCustomerDataAudienceList customerDataAudienceList = null;

  @JsonProperty("audienceListType")
  private AudienceListServiceType audienceListType = null;

  public AudienceListServiceContent combinationAudienceList(AudienceListServiceCombinationAudienceList combinationAudienceList) {
    this.combinationAudienceList = combinationAudienceList;
    return this;
  }

  /**
   * Get combinationAudienceList
   * @return combinationAudienceList
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceCombinationAudienceList getCombinationAudienceList() {
    return combinationAudienceList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceCustomAudienceList getCustomAudienceList() {
    return customAudienceList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceRuleAudienceList getRuleAudienceList() {
    return ruleAudienceList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceSimilarityAudienceList getSimilarityAudienceList() {
    return similarityAudienceList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceWebsiteVisitorsAudienceList getWebsiteVisitorsAudienceList() {
    return websiteVisitorsAudienceList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceCustomerDataAudienceList getCustomerDataAudienceList() {
    return customerDataAudienceList;
  }

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
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AudienceListServiceType getAudienceListType() {
    return audienceListType;
  }

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


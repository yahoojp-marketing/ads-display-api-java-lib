package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMigrateToYdaCampaignオブジェクトは、ディスプレイ広告（運用型）形式への変換が必要なキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMigrateToYdaCampaign object describes the detailed information of Recommendations about campaigns that are required to convert to Display Ads (Auction).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMigrateToYdaCampaignオブジェクトは、ディスプレイ広告（運用型）形式への変換が必要なキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceMigrateToYdaCampaign object describes the detailed information of Recommendations about campaigns that are required to convert to Display Ads (Auction).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceMigrateToYdaCampaign   {
  @JsonProperty("recommendationId")
  private Long recommendationId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("campaignUserStatus")
  private String campaignUserStatus = null;

  @JsonProperty("stardDate")
  private String stardDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  public RecommendationServiceMigrateToYdaCampaign recommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> 
   * @return recommendationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> ")


  public Long getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
  }

  public RecommendationServiceMigrateToYdaCampaign campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public RecommendationServiceMigrateToYdaCampaign campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public RecommendationServiceMigrateToYdaCampaign campaignUserStatus(String campaignUserStatus) {
    this.campaignUserStatus = campaignUserStatus;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン配信設定です。 </div> <div lang=\"en\"> Campaign delivery setting. </div> 
   * @return campaignUserStatus
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン配信設定です。 </div> <div lang=\"en\"> Campaign delivery setting. </div> ")


  public String getCampaignUserStatus() {
    return campaignUserStatus;
  }

  public void setCampaignUserStatus(String campaignUserStatus) {
    this.campaignUserStatus = campaignUserStatus;
  }

  public RecommendationServiceMigrateToYdaCampaign stardDate(String stardDate) {
    this.stardDate = stardDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン配信開始日です。<br>※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Start date of campaign delivery.<br>* Format: yyyyMMdd </div> 
   * @return stardDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン配信開始日です。<br>※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Start date of campaign delivery.<br>* Format: yyyyMMdd </div> ")


  public String getStardDate() {
    return stardDate;
  }

  public void setStardDate(String stardDate) {
    this.stardDate = stardDate;
  }

  public RecommendationServiceMigrateToYdaCampaign endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン配信終了日です。<br>※フォーマット：yyyyMMdd </div> <div lang=\"en\"> End date of campaign delivery.<br>* Format: yyyyMMdd </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン配信終了日です。<br>※フォーマット：yyyyMMdd </div> <div lang=\"en\"> End date of campaign delivery.<br>* Format: yyyyMMdd </div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMigrateToYdaCampaign recommendationServiceMigrateToYdaCampaign = (RecommendationServiceMigrateToYdaCampaign) o;
    return Objects.equals(this.recommendationId, recommendationServiceMigrateToYdaCampaign.recommendationId) &&
        Objects.equals(this.campaignId, recommendationServiceMigrateToYdaCampaign.campaignId) &&
        Objects.equals(this.campaignName, recommendationServiceMigrateToYdaCampaign.campaignName) &&
        Objects.equals(this.campaignUserStatus, recommendationServiceMigrateToYdaCampaign.campaignUserStatus) &&
        Objects.equals(this.stardDate, recommendationServiceMigrateToYdaCampaign.stardDate) &&
        Objects.equals(this.endDate, recommendationServiceMigrateToYdaCampaign.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, campaignUserStatus, stardDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMigrateToYdaCampaign {\n");
    
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignUserStatus: ").append(toIndentedString(campaignUserStatus)).append("\n");
    sb.append("    stardDate: ").append(toIndentedString(stardDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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


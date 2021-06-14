package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMigrateToYdaCampaignオブジェクトは、ディスプレイ広告（運用型）形式への変換が必要なキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMigrateToYdaCampaign object describes the detailed information of Recommendations about campaigns that are required to convert to Display Ads (Auction).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMigrateToYdaCampaignオブジェクトは、ディスプレイ広告（運用型）形式への変換が必要なキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceMigrateToYdaCampaign object describes the detailed information of Recommendations about campaigns that are required to convert to Display Ads (Auction).</div> ")

public class RecommendationServiceMigrateToYdaCampaign   {
  @JsonProperty("recommendationId")
  private JsonNullable<Long> recommendationId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("campaignUserStatus")
  private JsonNullable<String> campaignUserStatus = JsonNullable.undefined();

  @JsonProperty("stardDate")
  private JsonNullable<String> stardDate = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  public RecommendationServiceMigrateToYdaCampaign recommendationId(Long recommendationId) {
    this.recommendationId = JsonNullable.of(recommendationId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> 
   * @return recommendationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> ")


  public JsonNullable<Long> getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(JsonNullable<Long> recommendationId) {
    this.recommendationId = recommendationId;
  }

  public RecommendationServiceMigrateToYdaCampaign campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public RecommendationServiceMigrateToYdaCampaign campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public RecommendationServiceMigrateToYdaCampaign campaignUserStatus(String campaignUserStatus) {
    this.campaignUserStatus = JsonNullable.of(campaignUserStatus);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン配信設定です。 </div> <div lang=\"en\"> Campaign delivery setting. </div> 
   * @return campaignUserStatus
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン配信設定です。 </div> <div lang=\"en\"> Campaign delivery setting. </div> ")


  public JsonNullable<String> getCampaignUserStatus() {
    return campaignUserStatus;
  }

  public void setCampaignUserStatus(JsonNullable<String> campaignUserStatus) {
    this.campaignUserStatus = campaignUserStatus;
  }

  public RecommendationServiceMigrateToYdaCampaign stardDate(String stardDate) {
    this.stardDate = JsonNullable.of(stardDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン配信開始日です。<br>※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Start date of campaign delivery.<br>* Format: yyyyMMdd </div> 
   * @return stardDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン配信開始日です。<br>※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Start date of campaign delivery.<br>* Format: yyyyMMdd </div> ")


  public JsonNullable<String> getStardDate() {
    return stardDate;
  }

  public void setStardDate(JsonNullable<String> stardDate) {
    this.stardDate = stardDate;
  }

  public RecommendationServiceMigrateToYdaCampaign endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン配信終了日です。<br>※フォーマット：yyyyMMdd </div> <div lang=\"en\"> End date of campaign delivery.<br>* Format: yyyyMMdd </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン配信終了日です。<br>※フォーマット：yyyyMMdd </div> <div lang=\"en\"> End date of campaign delivery.<br>* Format: yyyyMMdd </div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


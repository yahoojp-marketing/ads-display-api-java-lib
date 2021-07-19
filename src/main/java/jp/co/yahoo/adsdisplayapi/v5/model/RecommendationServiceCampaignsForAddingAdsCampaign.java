package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCampaignsForAddingAdsCampaignオブジェクトは、入稿していない画像サイズが存在するキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCampaignsForAddingAdsCampaign object describes detailed information about Recommendations for the campaign with an image size that have not been submitted.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceCampaignsForAddingAdsCampaignオブジェクトは、入稿していない画像サイズが存在するキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceCampaignsForAddingAdsCampaign object describes detailed information about Recommendations for the campaign with an image size that have not been submitted.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceCampaignsForAddingAdsCampaign   {
  @JsonProperty("recommendationId")
  private Long recommendationId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("recommendationMediaAdFormat")
  @Valid
  private List<String> recommendationMediaAdFormat = null;

  public RecommendationServiceCampaignsForAddingAdsCampaign recommendationId(Long recommendationId) {
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

  public RecommendationServiceCampaignsForAddingAdsCampaign campaignId(Long campaignId) {
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

  public RecommendationServiceCampaignsForAddingAdsCampaign campaignName(String campaignName) {
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

  public RecommendationServiceCampaignsForAddingAdsCampaign recommendationMediaAdFormat(List<String> recommendationMediaAdFormat) {
    this.recommendationMediaAdFormat = recommendationMediaAdFormat;
    return this;
  }

  public RecommendationServiceCampaignsForAddingAdsCampaign addRecommendationMediaAdFormatItem(String recommendationMediaAdFormatItem) {
    if (this.recommendationMediaAdFormat == null) {
      this.recommendationMediaAdFormat = new ArrayList<>();
    }
    this.recommendationMediaAdFormat.add(recommendationMediaAdFormatItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するメディアフォーマットです。<br> フォーマットの詳細はDictionaryService/getMediaAdFormatのmediaAdFormatフィールドで確認できます。 </div> <div lang=\"en\"> Recommended media ad format.<br> The format details can be found in mediaAdFormat field of DictionaryService/getMediaAdFormat operation. </div> 
   * @return recommendationMediaAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するメディアフォーマットです。<br> フォーマットの詳細はDictionaryService/getMediaAdFormatのmediaAdFormatフィールドで確認できます。 </div> <div lang=\"en\"> Recommended media ad format.<br> The format details can be found in mediaAdFormat field of DictionaryService/getMediaAdFormat operation. </div> ")


  public List<String> getRecommendationMediaAdFormat() {
    return recommendationMediaAdFormat;
  }

  public void setRecommendationMediaAdFormat(List<String> recommendationMediaAdFormat) {
    this.recommendationMediaAdFormat = recommendationMediaAdFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceCampaignsForAddingAdsCampaign recommendationServiceCampaignsForAddingAdsCampaign = (RecommendationServiceCampaignsForAddingAdsCampaign) o;
    return Objects.equals(this.recommendationId, recommendationServiceCampaignsForAddingAdsCampaign.recommendationId) &&
        Objects.equals(this.campaignId, recommendationServiceCampaignsForAddingAdsCampaign.campaignId) &&
        Objects.equals(this.campaignName, recommendationServiceCampaignsForAddingAdsCampaign.campaignName) &&
        Objects.equals(this.recommendationMediaAdFormat, recommendationServiceCampaignsForAddingAdsCampaign.recommendationMediaAdFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, recommendationMediaAdFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceCampaignsForAddingAdsCampaign {\n");
    
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    recommendationMediaAdFormat: ").append(toIndentedString(recommendationMediaAdFormat)).append("\n");
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


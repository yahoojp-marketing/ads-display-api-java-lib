package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCampaignsForAddingAdsCampaignオブジェクトは、入稿していない画像サイズが存在するキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCampaignsForAddingAdsCampaign object describes detailed information about Recommendations for the campaign with an image size that have not been submitted.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceCampaignsForAddingAdsCampaignオブジェクトは、入稿していない画像サイズが存在するキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceCampaignsForAddingAdsCampaign object describes detailed information about Recommendations for the campaign with an image size that have not been submitted.</div> ")

public class RecommendationServiceCampaignsForAddingAdsCampaign   {
  @JsonProperty("recommendationId")
  private JsonNullable<Long> recommendationId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("recommendationMediaAdFormat")
  @Valid
  private JsonNullable<List<String>> recommendationMediaAdFormat = JsonNullable.undefined();

  public RecommendationServiceCampaignsForAddingAdsCampaign recommendationId(Long recommendationId) {
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

  public RecommendationServiceCampaignsForAddingAdsCampaign campaignId(Long campaignId) {
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

  public RecommendationServiceCampaignsForAddingAdsCampaign campaignName(String campaignName) {
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

  public RecommendationServiceCampaignsForAddingAdsCampaign recommendationMediaAdFormat(List<String> recommendationMediaAdFormat) {
    this.recommendationMediaAdFormat = JsonNullable.of(recommendationMediaAdFormat);
    return this;
  }

  public RecommendationServiceCampaignsForAddingAdsCampaign addRecommendationMediaAdFormatItem(String recommendationMediaAdFormatItem) {
    if (this.recommendationMediaAdFormat == null || !this.recommendationMediaAdFormat.isPresent()) {
      this.recommendationMediaAdFormat = JsonNullable.of(new ArrayList<>());
    }
    this.recommendationMediaAdFormat.get().add(recommendationMediaAdFormatItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するメディアフォーマットです。<br> フォーマットの詳細はDictionaryService/getMediaAdFormatのmediaAdFormatフィールドで確認できます。 </div> <div lang=\"en\"> Recommended media ad format.<br> The format details can be found in mediaAdFormat field of DictionaryService/getMediaAdFormat operation. </div> 
   * @return recommendationMediaAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するメディアフォーマットです。<br> フォーマットの詳細はDictionaryService/getMediaAdFormatのmediaAdFormatフィールドで確認できます。 </div> <div lang=\"en\"> Recommended media ad format.<br> The format details can be found in mediaAdFormat field of DictionaryService/getMediaAdFormat operation. </div> ")


  public JsonNullable<List<String>> getRecommendationMediaAdFormat() {
    return recommendationMediaAdFormat;
  }

  public void setRecommendationMediaAdFormat(JsonNullable<List<String>> recommendationMediaAdFormat) {
    this.recommendationMediaAdFormat = recommendationMediaAdFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


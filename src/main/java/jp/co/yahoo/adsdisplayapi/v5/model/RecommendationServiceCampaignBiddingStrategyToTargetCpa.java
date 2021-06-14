package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCampaignBiddingStrategyToTargetCpaオブジェクトは、自動入札（コンバージョン単価の目標値）に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCampaignBiddingStrategyToTargetCpa objects describes recommendation information about the campaign that is suitable for using autobidding (target CPA).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceCampaignBiddingStrategyToTargetCpaオブジェクトは、自動入札（コンバージョン単価の目標値）に適しているキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceCampaignBiddingStrategyToTargetCpa objects describes recommendation information about the campaign that is suitable for using autobidding (target CPA).</div> ")

public class RecommendationServiceCampaignBiddingStrategyToTargetCpa   {
  @JsonProperty("campaignBiddingStrategyToTargetCpaCampaignList")
  @Valid
  private JsonNullable<List<RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign>> campaignBiddingStrategyToTargetCpaCampaignList = JsonNullable.undefined();

  public RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpaCampaignList(List<RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign> campaignBiddingStrategyToTargetCpaCampaignList) {
    this.campaignBiddingStrategyToTargetCpaCampaignList = JsonNullable.of(campaignBiddingStrategyToTargetCpaCampaignList);
    return this;
  }

  public RecommendationServiceCampaignBiddingStrategyToTargetCpa addCampaignBiddingStrategyToTargetCpaCampaignListItem(RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign campaignBiddingStrategyToTargetCpaCampaignListItem) {
    if (this.campaignBiddingStrategyToTargetCpaCampaignList == null || !this.campaignBiddingStrategyToTargetCpaCampaignList.isPresent()) {
      this.campaignBiddingStrategyToTargetCpaCampaignList = JsonNullable.of(new ArrayList<>());
    }
    this.campaignBiddingStrategyToTargetCpaCampaignList.get().add(campaignBiddingStrategyToTargetCpaCampaignListItem);
    return this;
  }

  /**
   * Get campaignBiddingStrategyToTargetCpaCampaignList
   * @return campaignBiddingStrategyToTargetCpaCampaignList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign>> getCampaignBiddingStrategyToTargetCpaCampaignList() {
    return campaignBiddingStrategyToTargetCpaCampaignList;
  }

  public void setCampaignBiddingStrategyToTargetCpaCampaignList(JsonNullable<List<RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign>> campaignBiddingStrategyToTargetCpaCampaignList) {
    this.campaignBiddingStrategyToTargetCpaCampaignList = campaignBiddingStrategyToTargetCpaCampaignList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceCampaignBiddingStrategyToTargetCpa recommendationServiceCampaignBiddingStrategyToTargetCpa = (RecommendationServiceCampaignBiddingStrategyToTargetCpa) o;
    return Objects.equals(this.campaignBiddingStrategyToTargetCpaCampaignList, recommendationServiceCampaignBiddingStrategyToTargetCpa.campaignBiddingStrategyToTargetCpaCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyToTargetCpaCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceCampaignBiddingStrategyToTargetCpa {\n");
    
    sb.append("    campaignBiddingStrategyToTargetCpaCampaignList: ").append(toIndentedString(campaignBiddingStrategyToTargetCpaCampaignList)).append("\n");
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


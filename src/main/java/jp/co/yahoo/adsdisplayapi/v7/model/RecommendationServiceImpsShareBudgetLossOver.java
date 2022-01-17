package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceImpsShareBudgetLossOverCampaign;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceImpsShareBudgetLossOverオブジェクトは、インプレッションシェア損失率（予算）が大きいキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceImpsShareBudgetLossOver object describes the Recommendations information of campaigns that have a large lost impression share (budget).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceImpsShareBudgetLossOverオブジェクトは、インプレッションシェア損失率（予算）が大きいキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceImpsShareBudgetLossOver object describes the Recommendations information of campaigns that have a large lost impression share (budget).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceImpsShareBudgetLossOver   {
  @JsonProperty("impsShareBudgetLossOverCampaignList")
  @Valid
  private List<RecommendationServiceImpsShareBudgetLossOverCampaign> impsShareBudgetLossOverCampaignList = null;

  public RecommendationServiceImpsShareBudgetLossOver impsShareBudgetLossOverCampaignList(List<RecommendationServiceImpsShareBudgetLossOverCampaign> impsShareBudgetLossOverCampaignList) {
    this.impsShareBudgetLossOverCampaignList = impsShareBudgetLossOverCampaignList;
    return this;
  }

  public RecommendationServiceImpsShareBudgetLossOver addImpsShareBudgetLossOverCampaignListItem(RecommendationServiceImpsShareBudgetLossOverCampaign impsShareBudgetLossOverCampaignListItem) {
    if (this.impsShareBudgetLossOverCampaignList == null) {
      this.impsShareBudgetLossOverCampaignList = new ArrayList<>();
    }
    this.impsShareBudgetLossOverCampaignList.add(impsShareBudgetLossOverCampaignListItem);
    return this;
  }

  /**
   * Get impsShareBudgetLossOverCampaignList
   * @return impsShareBudgetLossOverCampaignList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RecommendationServiceImpsShareBudgetLossOverCampaign> getImpsShareBudgetLossOverCampaignList() {
    return impsShareBudgetLossOverCampaignList;
  }

  public void setImpsShareBudgetLossOverCampaignList(List<RecommendationServiceImpsShareBudgetLossOverCampaign> impsShareBudgetLossOverCampaignList) {
    this.impsShareBudgetLossOverCampaignList = impsShareBudgetLossOverCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceImpsShareBudgetLossOver recommendationServiceImpsShareBudgetLossOver = (RecommendationServiceImpsShareBudgetLossOver) o;
    return Objects.equals(this.impsShareBudgetLossOverCampaignList, recommendationServiceImpsShareBudgetLossOver.impsShareBudgetLossOverCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impsShareBudgetLossOverCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceImpsShareBudgetLossOver {\n");
    
    sb.append("    impsShareBudgetLossOverCampaignList: ").append(toIndentedString(impsShareBudgetLossOverCampaignList)).append("\n");
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


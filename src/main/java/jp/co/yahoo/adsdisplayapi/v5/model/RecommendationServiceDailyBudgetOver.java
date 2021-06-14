package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceDailyBudgetOverCampaign;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceDailyBudgetOverオブジェクトは、1日の予算上限に達したキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceDailyBudgetOver object describes recommendation information about campaigns that reached the daily budget.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceDailyBudgetOverオブジェクトは、1日の予算上限に達したキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceDailyBudgetOver object describes recommendation information about campaigns that reached the daily budget.</div> ")

public class RecommendationServiceDailyBudgetOver   {
  @JsonProperty("dailyBudgetOverCampaignList")
  @Valid
  private JsonNullable<List<RecommendationServiceDailyBudgetOverCampaign>> dailyBudgetOverCampaignList = JsonNullable.undefined();

  public RecommendationServiceDailyBudgetOver dailyBudgetOverCampaignList(List<RecommendationServiceDailyBudgetOverCampaign> dailyBudgetOverCampaignList) {
    this.dailyBudgetOverCampaignList = JsonNullable.of(dailyBudgetOverCampaignList);
    return this;
  }

  public RecommendationServiceDailyBudgetOver addDailyBudgetOverCampaignListItem(RecommendationServiceDailyBudgetOverCampaign dailyBudgetOverCampaignListItem) {
    if (this.dailyBudgetOverCampaignList == null || !this.dailyBudgetOverCampaignList.isPresent()) {
      this.dailyBudgetOverCampaignList = JsonNullable.of(new ArrayList<>());
    }
    this.dailyBudgetOverCampaignList.get().add(dailyBudgetOverCampaignListItem);
    return this;
  }

  /**
   * Get dailyBudgetOverCampaignList
   * @return dailyBudgetOverCampaignList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<RecommendationServiceDailyBudgetOverCampaign>> getDailyBudgetOverCampaignList() {
    return dailyBudgetOverCampaignList;
  }

  public void setDailyBudgetOverCampaignList(JsonNullable<List<RecommendationServiceDailyBudgetOverCampaign>> dailyBudgetOverCampaignList) {
    this.dailyBudgetOverCampaignList = dailyBudgetOverCampaignList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceDailyBudgetOver recommendationServiceDailyBudgetOver = (RecommendationServiceDailyBudgetOver) o;
    return Objects.equals(this.dailyBudgetOverCampaignList, recommendationServiceDailyBudgetOver.dailyBudgetOverCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyBudgetOverCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceDailyBudgetOver {\n");
    
    sb.append("    dailyBudgetOverCampaignList: ").append(toIndentedString(dailyBudgetOverCampaignList)).append("\n");
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


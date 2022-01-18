package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceMaximizeClicksCampaign;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMaximizeClicksオブジェクトは、自動入札（クリック数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMaximizeClicks objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize Clicks).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMaximizeClicksオブジェクトは、自動入札（クリック数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceMaximizeClicks objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize Clicks).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceMaximizeClicks   {
  @JsonProperty("maximizeClicksCampaignList")
  @Valid
  private List<RecommendationServiceMaximizeClicksCampaign> maximizeClicksCampaignList = null;

  public RecommendationServiceMaximizeClicks maximizeClicksCampaignList(List<RecommendationServiceMaximizeClicksCampaign> maximizeClicksCampaignList) {
    this.maximizeClicksCampaignList = maximizeClicksCampaignList;
    return this;
  }

  public RecommendationServiceMaximizeClicks addMaximizeClicksCampaignListItem(RecommendationServiceMaximizeClicksCampaign maximizeClicksCampaignListItem) {
    if (this.maximizeClicksCampaignList == null) {
      this.maximizeClicksCampaignList = new ArrayList<>();
    }
    this.maximizeClicksCampaignList.add(maximizeClicksCampaignListItem);
    return this;
  }

  /**
   * Get maximizeClicksCampaignList
   * @return maximizeClicksCampaignList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RecommendationServiceMaximizeClicksCampaign> getMaximizeClicksCampaignList() {
    return maximizeClicksCampaignList;
  }

  public void setMaximizeClicksCampaignList(List<RecommendationServiceMaximizeClicksCampaign> maximizeClicksCampaignList) {
    this.maximizeClicksCampaignList = maximizeClicksCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMaximizeClicks recommendationServiceMaximizeClicks = (RecommendationServiceMaximizeClicks) o;
    return Objects.equals(this.maximizeClicksCampaignList, recommendationServiceMaximizeClicks.maximizeClicksCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximizeClicksCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMaximizeClicks {\n");
    
    sb.append("    maximizeClicksCampaignList: ").append(toIndentedString(maximizeClicksCampaignList)).append("\n");
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


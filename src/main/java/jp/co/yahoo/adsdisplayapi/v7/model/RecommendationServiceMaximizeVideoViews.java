package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceMaximizeVideoViewsCampaign;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMaximizeVideoViewsオブジェクトは、自動入札（動画再生数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMaximizeVideoViews objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize video views).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMaximizeVideoViewsオブジェクトは、自動入札（動画再生数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceMaximizeVideoViews objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize video views).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceMaximizeVideoViews   {
  @JsonProperty("maximizeVideoViewsCampaignList")
  @Valid
  private List<RecommendationServiceMaximizeVideoViewsCampaign> maximizeVideoViewsCampaignList = null;

  public RecommendationServiceMaximizeVideoViews maximizeVideoViewsCampaignList(List<RecommendationServiceMaximizeVideoViewsCampaign> maximizeVideoViewsCampaignList) {
    this.maximizeVideoViewsCampaignList = maximizeVideoViewsCampaignList;
    return this;
  }

  public RecommendationServiceMaximizeVideoViews addMaximizeVideoViewsCampaignListItem(RecommendationServiceMaximizeVideoViewsCampaign maximizeVideoViewsCampaignListItem) {
    if (this.maximizeVideoViewsCampaignList == null) {
      this.maximizeVideoViewsCampaignList = new ArrayList<>();
    }
    this.maximizeVideoViewsCampaignList.add(maximizeVideoViewsCampaignListItem);
    return this;
  }

  /**
   * Get maximizeVideoViewsCampaignList
   * @return maximizeVideoViewsCampaignList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RecommendationServiceMaximizeVideoViewsCampaign> getMaximizeVideoViewsCampaignList() {
    return maximizeVideoViewsCampaignList;
  }

  public void setMaximizeVideoViewsCampaignList(List<RecommendationServiceMaximizeVideoViewsCampaign> maximizeVideoViewsCampaignList) {
    this.maximizeVideoViewsCampaignList = maximizeVideoViewsCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMaximizeVideoViews recommendationServiceMaximizeVideoViews = (RecommendationServiceMaximizeVideoViews) o;
    return Objects.equals(this.maximizeVideoViewsCampaignList, recommendationServiceMaximizeVideoViews.maximizeVideoViewsCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximizeVideoViewsCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMaximizeVideoViews {\n");
    
    sb.append("    maximizeVideoViewsCampaignList: ").append(toIndentedString(maximizeVideoViewsCampaignList)).append("\n");
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


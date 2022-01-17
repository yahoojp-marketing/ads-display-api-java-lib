package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceMaximizeConversionsCampaign;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMaximizeConversionsオブジェクトは、自動入札（コンバージョン数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMaximizeConversions objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize Conversions).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMaximizeConversionsオブジェクトは、自動入札（コンバージョン数の最大化）に適しているキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceMaximizeConversions objects describes recommendation information about the campaign that is suitable for using autobidding (Maximize Conversions).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceMaximizeConversions   {
  @JsonProperty("maximizeConversionsCampaignList")
  @Valid
  private List<RecommendationServiceMaximizeConversionsCampaign> maximizeConversionsCampaignList = null;

  public RecommendationServiceMaximizeConversions maximizeConversionsCampaignList(List<RecommendationServiceMaximizeConversionsCampaign> maximizeConversionsCampaignList) {
    this.maximizeConversionsCampaignList = maximizeConversionsCampaignList;
    return this;
  }

  public RecommendationServiceMaximizeConversions addMaximizeConversionsCampaignListItem(RecommendationServiceMaximizeConversionsCampaign maximizeConversionsCampaignListItem) {
    if (this.maximizeConversionsCampaignList == null) {
      this.maximizeConversionsCampaignList = new ArrayList<>();
    }
    this.maximizeConversionsCampaignList.add(maximizeConversionsCampaignListItem);
    return this;
  }

  /**
   * Get maximizeConversionsCampaignList
   * @return maximizeConversionsCampaignList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RecommendationServiceMaximizeConversionsCampaign> getMaximizeConversionsCampaignList() {
    return maximizeConversionsCampaignList;
  }

  public void setMaximizeConversionsCampaignList(List<RecommendationServiceMaximizeConversionsCampaign> maximizeConversionsCampaignList) {
    this.maximizeConversionsCampaignList = maximizeConversionsCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMaximizeConversions recommendationServiceMaximizeConversions = (RecommendationServiceMaximizeConversions) o;
    return Objects.equals(this.maximizeConversionsCampaignList, recommendationServiceMaximizeConversions.maximizeConversionsCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximizeConversionsCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMaximizeConversions {\n");
    
    sb.append("    maximizeConversionsCampaignList: ").append(toIndentedString(maximizeConversionsCampaignList)).append("\n");
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


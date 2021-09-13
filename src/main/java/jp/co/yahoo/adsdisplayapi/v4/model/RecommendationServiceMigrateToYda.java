package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.RecommendationServiceMigrateToYdaCampaign;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMigrateToYdaオブジェクトは、ディスプレイ広告（運用型）形式への変換が必要なキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMigrateToYda object describes the Recommendations information of campaigns that are required to convert to Display Ads (Auction).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMigrateToYdaオブジェクトは、ディスプレイ広告（運用型）形式への変換が必要なキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceMigrateToYda object describes the Recommendations information of campaigns that are required to convert to Display Ads (Auction).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceMigrateToYda   {
  @JsonProperty("migrateToYdaCampaignList")
  @Valid
  private List<RecommendationServiceMigrateToYdaCampaign> migrateToYdaCampaignList = null;

  public RecommendationServiceMigrateToYda migrateToYdaCampaignList(List<RecommendationServiceMigrateToYdaCampaign> migrateToYdaCampaignList) {
    this.migrateToYdaCampaignList = migrateToYdaCampaignList;
    return this;
  }

  public RecommendationServiceMigrateToYda addMigrateToYdaCampaignListItem(RecommendationServiceMigrateToYdaCampaign migrateToYdaCampaignListItem) {
    if (this.migrateToYdaCampaignList == null) {
      this.migrateToYdaCampaignList = new ArrayList<>();
    }
    this.migrateToYdaCampaignList.add(migrateToYdaCampaignListItem);
    return this;
  }

  /**
   * Get migrateToYdaCampaignList
   * @return migrateToYdaCampaignList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RecommendationServiceMigrateToYdaCampaign> getMigrateToYdaCampaignList() {
    return migrateToYdaCampaignList;
  }

  public void setMigrateToYdaCampaignList(List<RecommendationServiceMigrateToYdaCampaign> migrateToYdaCampaignList) {
    this.migrateToYdaCampaignList = migrateToYdaCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMigrateToYda recommendationServiceMigrateToYda = (RecommendationServiceMigrateToYda) o;
    return Objects.equals(this.migrateToYdaCampaignList, recommendationServiceMigrateToYda.migrateToYdaCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrateToYdaCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMigrateToYda {\n");
    
    sb.append("    migrateToYdaCampaignList: ").append(toIndentedString(migrateToYdaCampaignList)).append("\n");
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


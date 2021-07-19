package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceCampaignsForAddingAdsCampaign;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCampaignsForAddingAdsオブジェクトは、入稿していない画像サイズが存在するキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCampaignsForAddingAds object describes information about Recommendations for the campaign with an image size that have not been submitted.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceCampaignsForAddingAdsオブジェクトは、入稿していない画像サイズが存在するキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceCampaignsForAddingAds object describes information about Recommendations for the campaign with an image size that have not been submitted.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceCampaignsForAddingAds   {
  @JsonProperty("campaignsForAddingAdsList")
  @Valid
  private List<RecommendationServiceCampaignsForAddingAdsCampaign> campaignsForAddingAdsList = null;

  public RecommendationServiceCampaignsForAddingAds campaignsForAddingAdsList(List<RecommendationServiceCampaignsForAddingAdsCampaign> campaignsForAddingAdsList) {
    this.campaignsForAddingAdsList = campaignsForAddingAdsList;
    return this;
  }

  public RecommendationServiceCampaignsForAddingAds addCampaignsForAddingAdsListItem(RecommendationServiceCampaignsForAddingAdsCampaign campaignsForAddingAdsListItem) {
    if (this.campaignsForAddingAdsList == null) {
      this.campaignsForAddingAdsList = new ArrayList<>();
    }
    this.campaignsForAddingAdsList.add(campaignsForAddingAdsListItem);
    return this;
  }

  /**
   * Get campaignsForAddingAdsList
   * @return campaignsForAddingAdsList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RecommendationServiceCampaignsForAddingAdsCampaign> getCampaignsForAddingAdsList() {
    return campaignsForAddingAdsList;
  }

  public void setCampaignsForAddingAdsList(List<RecommendationServiceCampaignsForAddingAdsCampaign> campaignsForAddingAdsList) {
    this.campaignsForAddingAdsList = campaignsForAddingAdsList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceCampaignsForAddingAds recommendationServiceCampaignsForAddingAds = (RecommendationServiceCampaignsForAddingAds) o;
    return Objects.equals(this.campaignsForAddingAdsList, recommendationServiceCampaignsForAddingAds.campaignsForAddingAdsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignsForAddingAdsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceCampaignsForAddingAds {\n");
    
    sb.append("    campaignsForAddingAdsList: ").append(toIndentedString(campaignsForAddingAdsList)).append("\n");
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


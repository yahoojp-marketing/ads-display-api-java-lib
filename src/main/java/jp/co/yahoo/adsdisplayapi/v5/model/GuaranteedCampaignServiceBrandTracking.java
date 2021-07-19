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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceBrandTrackingは、ブランド効果測定レポートの設定情報を保持します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceBrandTracking holds the setting information of brand tracking report.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServiceBrandTrackingは、ブランド効果測定レポートの設定情報を保持します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedCampaignServiceBrandTracking holds the setting information of brand tracking report.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedCampaignServiceBrandTracking   {
  @JsonProperty("audienceCategoryIds1")
  @Valid
  private List<String> audienceCategoryIds1 = null;

  @JsonProperty("audienceCategoryIds2")
  @Valid
  private List<String> audienceCategoryIds2 = null;

  @JsonProperty("businessCategoryIds")
  @Valid
  private List<String> businessCategoryIds = null;

  public GuaranteedCampaignServiceBrandTracking audienceCategoryIds1(List<String> audienceCategoryIds1) {
    this.audienceCategoryIds1 = audienceCategoryIds1;
    return this;
  }

  public GuaranteedCampaignServiceBrandTracking addAudienceCategoryIds1Item(String audienceCategoryIds1Item) {
    if (this.audienceCategoryIds1 == null) {
      this.audienceCategoryIds1 = new ArrayList<>();
    }
    this.audienceCategoryIds1.add(audienceCategoryIds1Item);
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスカテゴリIDグループ1です。<br> レポート作成時、ここで指定されたカテゴリーに対して強い興味関心を持つ層を対象に集計します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience Category ID group 1.<br> When creating a report, aggregation will be executed for the group with a strong interest in the category specified in this field.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return audienceCategoryIds1
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスカテゴリIDグループ1です。<br> レポート作成時、ここで指定されたカテゴリーに対して強い興味関心を持つ層を対象に集計します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience Category ID group 1.<br> When creating a report, aggregation will be executed for the group with a strong interest in the category specified in this field.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")

@Size(max=100) 
  public List<String> getAudienceCategoryIds1() {
    return audienceCategoryIds1;
  }

  public void setAudienceCategoryIds1(List<String> audienceCategoryIds1) {
    this.audienceCategoryIds1 = audienceCategoryIds1;
  }

  public GuaranteedCampaignServiceBrandTracking audienceCategoryIds2(List<String> audienceCategoryIds2) {
    this.audienceCategoryIds2 = audienceCategoryIds2;
    return this;
  }

  public GuaranteedCampaignServiceBrandTracking addAudienceCategoryIds2Item(String audienceCategoryIds2Item) {
    if (this.audienceCategoryIds2 == null) {
      this.audienceCategoryIds2 = new ArrayList<>();
    }
    this.audienceCategoryIds2.add(audienceCategoryIds2Item);
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスカテゴリIDグループ2です。<br> レポート作成時、ここで指定されたカテゴリーに対して少し興味関心を持つ層を対象に集計します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience Category ID group 2.<br> When creating a report, aggregation will be executed for the group with a small interest in the category specified in this field.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return audienceCategoryIds2
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスカテゴリIDグループ2です。<br> レポート作成時、ここで指定されたカテゴリーに対して少し興味関心を持つ層を対象に集計します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience Category ID group 2.<br> When creating a report, aggregation will be executed for the group with a small interest in the category specified in this field.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")

@Size(max=100) 
  public List<String> getAudienceCategoryIds2() {
    return audienceCategoryIds2;
  }

  public void setAudienceCategoryIds2(List<String> audienceCategoryIds2) {
    this.audienceCategoryIds2 = audienceCategoryIds2;
  }

  public GuaranteedCampaignServiceBrandTracking businessCategoryIds(List<String> businessCategoryIds) {
    this.businessCategoryIds = businessCategoryIds;
    return this;
  }

  public GuaranteedCampaignServiceBrandTracking addBusinessCategoryIdsItem(String businessCategoryIdsItem) {
    if (this.businessCategoryIds == null) {
      this.businessCategoryIds = new ArrayList<>();
    }
    this.businessCategoryIds.add(businessCategoryIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> ビジネスカテゴリIDグループです。<br> アンケート対象になる広告・商材の業種の種別を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※返却される値は、DictionaryServiceのgetBusinessCategoryで取得されるDictionaryServiceBusinessCategoryのbusinessCategoryIdフィールドをご確認ください。 </div> <div lang=\"en\"> Business Category ID group.<br> This describes the type of ads/products which is a subject of the survey.  <br> Although this field will be returned in the response, it will be ignored on input.<br> *Refer to the businessCategoryId field of DictionaryServiceBusinessCategory which can be obtained via getBusinessCategory in DictionaryService, to check the values to be returned in this field. </div> 
   * @return businessCategoryIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビジネスカテゴリIDグループです。<br> アンケート対象になる広告・商材の業種の種別を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※返却される値は、DictionaryServiceのgetBusinessCategoryで取得されるDictionaryServiceBusinessCategoryのbusinessCategoryIdフィールドをご確認ください。 </div> <div lang=\"en\"> Business Category ID group.<br> This describes the type of ads/products which is a subject of the survey.  <br> Although this field will be returned in the response, it will be ignored on input.<br> *Refer to the businessCategoryId field of DictionaryServiceBusinessCategory which can be obtained via getBusinessCategory in DictionaryService, to check the values to be returned in this field. </div> ")


  public List<String> getBusinessCategoryIds() {
    return businessCategoryIds;
  }

  public void setBusinessCategoryIds(List<String> businessCategoryIds) {
    this.businessCategoryIds = businessCategoryIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceBrandTracking guaranteedCampaignServiceBrandTracking = (GuaranteedCampaignServiceBrandTracking) o;
    return Objects.equals(this.audienceCategoryIds1, guaranteedCampaignServiceBrandTracking.audienceCategoryIds1) &&
        Objects.equals(this.audienceCategoryIds2, guaranteedCampaignServiceBrandTracking.audienceCategoryIds2) &&
        Objects.equals(this.businessCategoryIds, guaranteedCampaignServiceBrandTracking.businessCategoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceCategoryIds1, audienceCategoryIds2, businessCategoryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceBrandTracking {\n");
    
    sb.append("    audienceCategoryIds1: ").append(toIndentedString(audienceCategoryIds1)).append("\n");
    sb.append("    audienceCategoryIds2: ").append(toIndentedString(audienceCategoryIds2)).append("\n");
    sb.append("    businessCategoryIds: ").append(toIndentedString(businessCategoryIds)).append("\n");
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


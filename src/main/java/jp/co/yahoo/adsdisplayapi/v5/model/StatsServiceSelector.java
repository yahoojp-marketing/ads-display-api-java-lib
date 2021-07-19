package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServicePeriodCustomDate;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceStatsPeriod;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceTargetType;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceSelector object is a container that includes the search conditions (execution parameters) of get methods.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">StatsServiceSelector object is a container that includes the search conditions (execution parameters) of get methods.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("adGroupIds")
  @Valid
  private List<Long> adGroupIds = null;

  @JsonProperty("adIds")
  @Valid
  private List<Long> adIds = null;

  @JsonProperty("mediaIds")
  @Valid
  private List<Long> mediaIds = null;

  @JsonProperty("statsPeriod")
  private StatsServiceStatsPeriod statsPeriod = null;

  @JsonProperty("periodCustomDate")
  private StatsServicePeriodCustomDate periodCustomDate = null;

  @JsonProperty("targetTypes")
  @Valid
  private List<StatsServiceTargetType> targetTypes = null;

  @JsonProperty("type")
  private StatsServiceType type = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  public StatsServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public StatsServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public StatsServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンID<br> typeで「CAMPAIGN」または「ADGROUP」または「AD」または「TARGET」を指定した場合のみ有効です。 </div> <div lang=\"en\"> Campaign ID.<br> Available only when &#34;CAMPAIGN&#34; or &#34;ADGROUP&#34; or &#34;AD&#34; or &#34;TARGET&#34; is specified for type. </div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンID<br> typeで「CAMPAIGN」または「ADGROUP」または「AD」または「TARGET」を指定した場合のみ有効です。 </div> <div lang=\"en\"> Campaign ID.<br> Available only when &#34;CAMPAIGN&#34; or &#34;ADGROUP&#34; or &#34;AD&#34; or &#34;TARGET&#34; is specified for type. </div> ")

@Size(max=500) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public StatsServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public StatsServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループID<br> typeで「ADGROUP」または「AD」または「TARGET」を指定した場合のみ有効です。 </div> <div lang=\"en\"> Ad group ID.<br> Available only when &#34;ADGROUP&#34; or &#34;AD&#34; or &#34;TARGET&#34; is specified for type. </div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループID<br> typeで「ADGROUP」または「AD」または「TARGET」を指定した場合のみ有効です。 </div> <div lang=\"en\"> Ad group ID.<br> Available only when &#34;ADGROUP&#34; or &#34;AD&#34; or &#34;TARGET&#34; is specified for type. </div> ")

@Size(max=500) 
  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public StatsServiceSelector adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public StatsServiceSelector addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告ID<br> typeで「AD」を指定した場合のみ有効です。 </div> <div lang=\"en\"> Ad ID.<br> Available only when &#34;AD&#34; is specified for type. </div> 
   * @return adIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告ID<br> typeで「AD」を指定した場合のみ有効です。 </div> <div lang=\"en\"> Ad ID.<br> Available only when &#34;AD&#34; is specified for type. </div> ")

@Size(max=500) 
  public List<Long> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }

  public StatsServiceSelector mediaIds(List<Long> mediaIds) {
    this.mediaIds = mediaIds;
    return this;
  }

  public StatsServiceSelector addMediaIdsItem(Long mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 画像ID<br> typeで「MEDIA」を指定した場合のみ有効です。 </div> <div lang=\"en\"> Media ID.<br> Available only when &#34;MEDIA&#34; is specified for type. </div> 
   * @return mediaIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 画像ID<br> typeで「MEDIA」を指定した場合のみ有効です。 </div> <div lang=\"en\"> Media ID.<br> Available only when &#34;MEDIA&#34; is specified for type. </div> ")

@Size(max=500) 
  public List<Long> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(List<Long> mediaIds) {
    this.mediaIds = mediaIds;
  }

  public StatsServiceSelector statsPeriod(StatsServiceStatsPeriod statsPeriod) {
    this.statsPeriod = statsPeriod;
    return this;
  }

  /**
   * Get statsPeriod
   * @return statsPeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceStatsPeriod getStatsPeriod() {
    return statsPeriod;
  }

  public void setStatsPeriod(StatsServiceStatsPeriod statsPeriod) {
    this.statsPeriod = statsPeriod;
  }

  public StatsServiceSelector periodCustomDate(StatsServicePeriodCustomDate periodCustomDate) {
    this.periodCustomDate = periodCustomDate;
    return this;
  }

  /**
   * Get periodCustomDate
   * @return periodCustomDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServicePeriodCustomDate getPeriodCustomDate() {
    return periodCustomDate;
  }

  public void setPeriodCustomDate(StatsServicePeriodCustomDate periodCustomDate) {
    this.periodCustomDate = periodCustomDate;
  }

  public StatsServiceSelector targetTypes(List<StatsServiceTargetType> targetTypes) {
    this.targetTypes = targetTypes;
    return this;
  }

  public StatsServiceSelector addTargetTypesItem(StatsServiceTargetType targetTypesItem) {
    if (this.targetTypes == null) {
      this.targetTypes = new ArrayList<>();
    }
    this.targetTypes.add(targetTypesItem);
    return this;
  }

  /**
   * Get targetTypes
   * @return targetTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public List<StatsServiceTargetType> getTargetTypes() {
    return targetTypes;
  }

  public void setTargetTypes(List<StatsServiceTargetType> targetTypes) {
    this.targetTypes = targetTypes;
  }

  public StatsServiceSelector type(StatsServiceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceType getType() {
    return type;
  }

  public void setType(StatsServiceType type) {
    this.type = type;
  }

  public StatsServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public StatsServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceSelector statsServiceSelector = (StatsServiceSelector) o;
    return Objects.equals(this.accountId, statsServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, statsServiceSelector.campaignIds) &&
        Objects.equals(this.adGroupIds, statsServiceSelector.adGroupIds) &&
        Objects.equals(this.adIds, statsServiceSelector.adIds) &&
        Objects.equals(this.mediaIds, statsServiceSelector.mediaIds) &&
        Objects.equals(this.statsPeriod, statsServiceSelector.statsPeriod) &&
        Objects.equals(this.periodCustomDate, statsServiceSelector.periodCustomDate) &&
        Objects.equals(this.targetTypes, statsServiceSelector.targetTypes) &&
        Objects.equals(this.type, statsServiceSelector.type) &&
        Objects.equals(this.startIndex, statsServiceSelector.startIndex) &&
        Objects.equals(this.numberResults, statsServiceSelector.numberResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, adGroupIds, adIds, mediaIds, statsPeriod, periodCustomDate, targetTypes, type, startIndex, numberResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    statsPeriod: ").append(toIndentedString(statsPeriod)).append("\n");
    sb.append("    periodCustomDate: ").append(toIndentedString(periodCustomDate)).append("\n");
    sb.append("    targetTypes: ").append(toIndentedString(targetTypes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
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


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupAdServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedAdGroupAdServiceSelector object is a container for storing a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupAdServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The GuaranteedAdGroupAdServiceSelector object is a container for storing a set of criteria (parameters) for get method.</div> ")

public class GuaranteedAdGroupAdServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("adGroupIds")
  @Valid
  private JsonNullable<List<Long>> adGroupIds = JsonNullable.undefined();

  @JsonProperty("adGroupAdIds")
  @Valid
  private JsonNullable<List<Long>> adGroupAdIds = JsonNullable.undefined();

  @JsonProperty("containsLabelIdFlg")
  private JsonNullable<Boolean> containsLabelIdFlg = JsonNullable.undefined();

  @JsonProperty("labelIds")
  @Valid
  private JsonNullable<List<Long>> labelIds = JsonNullable.undefined();

  @JsonProperty("mediaIds")
  @Valid
  private JsonNullable<List<Long>> mediaIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public GuaranteedAdGroupAdServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedAdGroupAdServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : キャンペーンID</div> <div lang=\"en\">Search Condition: Campaign ID</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : キャンペーンID</div> <div lang=\"en\">Search Condition: Campaign ID</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public GuaranteedAdGroupAdServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = JsonNullable.of(adGroupIds);
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null || !this.adGroupIds.isPresent()) {
      this.adGroupIds = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupIds.get().add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : 広告グループID</div> <div lang=\"en\">Search Condition: Ad group ID</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 広告グループID</div> <div lang=\"en\">Search Condition: Ad group ID</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(JsonNullable<List<Long>> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public GuaranteedAdGroupAdServiceSelector adGroupAdIds(List<Long> adGroupAdIds) {
    this.adGroupAdIds = JsonNullable.of(adGroupAdIds);
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addAdGroupAdIdsItem(Long adGroupAdIdsItem) {
    if (this.adGroupAdIds == null || !this.adGroupAdIds.isPresent()) {
      this.adGroupAdIds = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupAdIds.get().add(adGroupAdIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : 広告ID</div> <div lang=\"en\">Search Condition: Ad ID</div> 
   * @return adGroupAdIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 広告ID</div> <div lang=\"en\">Search Condition: Ad ID</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getAdGroupAdIds() {
    return adGroupAdIds;
  }

  public void setAdGroupAdIds(JsonNullable<List<Long>> adGroupAdIds) {
    this.adGroupAdIds = adGroupAdIds;
  }

  public GuaranteedAdGroupAdServiceSelector containsLabelIdFlg(Boolean containsLabelIdFlg) {
    this.containsLabelIdFlg = JsonNullable.of(containsLabelIdFlg);
    return this;
  }

  /**
   * <div lang=\"ja\">ラベルID取得フラグ</div> <div lang=\"en\">Flag of contains label ID.</div> 
   * @return containsLabelIdFlg
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルID取得フラグ</div> <div lang=\"en\">Flag of contains label ID.</div> ")


  public JsonNullable<Boolean> getContainsLabelIdFlg() {
    return containsLabelIdFlg;
  }

  public void setContainsLabelIdFlg(JsonNullable<Boolean> containsLabelIdFlg) {
    this.containsLabelIdFlg = containsLabelIdFlg;
  }

  public GuaranteedAdGroupAdServiceSelector labelIds(List<Long> labelIds) {
    this.labelIds = JsonNullable.of(labelIds);
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null || !this.labelIds.isPresent()) {
      this.labelIds = JsonNullable.of(new ArrayList<>());
    }
    this.labelIds.get().add(labelIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : ラベルID</div> <div lang=\"en\">Search Condition: Label ID</div> 
   * @return labelIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : ラベルID</div> <div lang=\"en\">Search Condition: Label ID</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getLabelIds() {
    return labelIds;
  }

  public void setLabelIds(JsonNullable<List<Long>> labelIds) {
    this.labelIds = labelIds;
  }

  public GuaranteedAdGroupAdServiceSelector mediaIds(List<Long> mediaIds) {
    this.mediaIds = JsonNullable.of(mediaIds);
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addMediaIdsItem(Long mediaIdsItem) {
    if (this.mediaIds == null || !this.mediaIds.isPresent()) {
      this.mediaIds = JsonNullable.of(new ArrayList<>());
    }
    this.mediaIds.get().add(mediaIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : 画像ID</div> <div lang=\"en\">Search Condition: Media ID</div> 
   * @return mediaIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 画像ID</div> <div lang=\"en\">Search Condition: Media ID</div> ")


  public JsonNullable<List<Long>> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(JsonNullable<List<Long>> mediaIds) {
    this.mediaIds = mediaIds;
  }

  public GuaranteedAdGroupAdServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
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
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public GuaranteedAdGroupAdServiceSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceSelector guaranteedAdGroupAdServiceSelector = (GuaranteedAdGroupAdServiceSelector) o;
    return Objects.equals(this.accountId, guaranteedAdGroupAdServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, guaranteedAdGroupAdServiceSelector.campaignIds) &&
        Objects.equals(this.adGroupIds, guaranteedAdGroupAdServiceSelector.adGroupIds) &&
        Objects.equals(this.adGroupAdIds, guaranteedAdGroupAdServiceSelector.adGroupAdIds) &&
        Objects.equals(this.containsLabelIdFlg, guaranteedAdGroupAdServiceSelector.containsLabelIdFlg) &&
        Objects.equals(this.labelIds, guaranteedAdGroupAdServiceSelector.labelIds) &&
        Objects.equals(this.mediaIds, guaranteedAdGroupAdServiceSelector.mediaIds) &&
        Objects.equals(this.numberResults, guaranteedAdGroupAdServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, guaranteedAdGroupAdServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, adGroupIds, adGroupAdIds, containsLabelIdFlg, labelIds, mediaIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    adGroupAdIds: ").append(toIndentedString(adGroupAdIds)).append("\n");
    sb.append("    containsLabelIdFlg: ").append(toIndentedString(containsLabelIdFlg)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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


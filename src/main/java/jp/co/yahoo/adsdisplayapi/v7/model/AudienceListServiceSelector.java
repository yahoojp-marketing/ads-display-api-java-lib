package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceSharingStatusFilterType;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceSelectorオブジェクトは、オーディエンスリストを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceListServiceSelector object specifies audience list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AudienceListServiceSelectorオブジェクトは、オーディエンスリストを指定します。</div> <div lang=\"en\">AudienceListServiceSelector object specifies audience list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("audienceListIds")
  @Valid
  private List<Long> audienceListIds = null;

  @JsonProperty("audienceListTypes")
  @Valid
  private List<AudienceListServiceType> audienceListTypes = null;

  @JsonProperty("sharingStatusFilterType")
  private AudienceListServiceSharingStatusFilterType sharingStatusFilterType = null;

  public AudienceListServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AudienceListServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(1000) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public AudienceListServiceSelector startIndex(Integer startIndex) {
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

  public AudienceListServiceSelector audienceListIds(List<Long> audienceListIds) {
    this.audienceListIds = audienceListIds;
    return this;
  }

  public AudienceListServiceSelector addAudienceListIdsItem(Long audienceListIdsItem) {
    if (this.audienceListIds == null) {
      this.audienceListIds = new ArrayList<>();
    }
    this.audienceListIds.add(audienceListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">オーディエンスリストIDです。</div> <div lang=\"en\">Audience List ID.</div> 
   * @return audienceListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">オーディエンスリストIDです。</div> <div lang=\"en\">Audience List ID.</div> ")

@Size(max=1000) 
  public List<Long> getAudienceListIds() {
    return audienceListIds;
  }

  public void setAudienceListIds(List<Long> audienceListIds) {
    this.audienceListIds = audienceListIds;
  }

  public AudienceListServiceSelector audienceListTypes(List<AudienceListServiceType> audienceListTypes) {
    this.audienceListTypes = audienceListTypes;
    return this;
  }

  public AudienceListServiceSelector addAudienceListTypesItem(AudienceListServiceType audienceListTypesItem) {
    if (this.audienceListTypes == null) {
      this.audienceListTypes = new ArrayList<>();
    }
    this.audienceListTypes.add(audienceListTypesItem);
    return this;
  }

  /**
   * Get audienceListTypes
   * @return audienceListTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<AudienceListServiceType> getAudienceListTypes() {
    return audienceListTypes;
  }

  public void setAudienceListTypes(List<AudienceListServiceType> audienceListTypes) {
    this.audienceListTypes = audienceListTypes;
  }

  public AudienceListServiceSelector sharingStatusFilterType(AudienceListServiceSharingStatusFilterType sharingStatusFilterType) {
    this.sharingStatusFilterType = sharingStatusFilterType;
    return this;
  }

  /**
   * Get sharingStatusFilterType
   * @return sharingStatusFilterType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceSharingStatusFilterType getSharingStatusFilterType() {
    return sharingStatusFilterType;
  }

  public void setSharingStatusFilterType(AudienceListServiceSharingStatusFilterType sharingStatusFilterType) {
    this.sharingStatusFilterType = sharingStatusFilterType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceSelector audienceListServiceSelector = (AudienceListServiceSelector) o;
    return Objects.equals(this.accountId, audienceListServiceSelector.accountId) &&
        Objects.equals(this.numberResults, audienceListServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, audienceListServiceSelector.startIndex) &&
        Objects.equals(this.audienceListIds, audienceListServiceSelector.audienceListIds) &&
        Objects.equals(this.audienceListTypes, audienceListServiceSelector.audienceListTypes) &&
        Objects.equals(this.sharingStatusFilterType, audienceListServiceSelector.sharingStatusFilterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, numberResults, startIndex, audienceListIds, audienceListTypes, sharingStatusFilterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    audienceListIds: ").append(toIndentedString(audienceListIds)).append("\n");
    sb.append("    audienceListTypes: ").append(toIndentedString(audienceListTypes)).append("\n");
    sb.append("    sharingStatusFilterType: ").append(toIndentedString(sharingStatusFilterType)).append("\n");
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


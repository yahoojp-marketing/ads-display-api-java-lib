package jp.co.yahoo.adsdisplayapi.v6.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionGroupServiceSelector object contains a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionGroupServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">ConversionGroupServiceSelector object contains a set of criteria (parameters) for get method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionGroupServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("conversionGroupIds")
  @Valid
  private List<Long> conversionGroupIds = null;

  @JsonProperty("conversionGroupName")
  private String conversionGroupName = null;

  @JsonProperty("conversionTrackerIds")
  @Valid
  private List<Long> conversionTrackerIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public ConversionGroupServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ConversionGroupServiceSelector conversionGroupIds(List<Long> conversionGroupIds) {
    this.conversionGroupIds = conversionGroupIds;
    return this;
  }

  public ConversionGroupServiceSelector addConversionGroupIdsItem(Long conversionGroupIdsItem) {
    if (this.conversionGroupIds == null) {
      this.conversionGroupIds = new ArrayList<>();
    }
    this.conversionGroupIds.add(conversionGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョングループのID。</div> <div lang=\"en\">Conversion Group ID.</div> 
   * @return conversionGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョングループのID。</div> <div lang=\"en\">Conversion Group ID.</div> ")

@Size(max=1000) 
  public List<Long> getConversionGroupIds() {
    return conversionGroupIds;
  }

  public void setConversionGroupIds(List<Long> conversionGroupIds) {
    this.conversionGroupIds = conversionGroupIds;
  }

  public ConversionGroupServiceSelector conversionGroupName(String conversionGroupName) {
    this.conversionGroupName = conversionGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョングループ名。</div> <div lang=\"en\">Conversion Group Name.</div> 
   * @return conversionGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョングループ名。</div> <div lang=\"en\">Conversion Group Name.</div> ")


  public String getConversionGroupName() {
    return conversionGroupName;
  }

  public void setConversionGroupName(String conversionGroupName) {
    this.conversionGroupName = conversionGroupName;
  }

  public ConversionGroupServiceSelector conversionTrackerIds(List<Long> conversionTrackerIds) {
    this.conversionTrackerIds = conversionTrackerIds;
    return this;
  }

  public ConversionGroupServiceSelector addConversionTrackerIdsItem(Long conversionTrackerIdsItem) {
    if (this.conversionTrackerIds == null) {
      this.conversionTrackerIds = new ArrayList<>();
    }
    this.conversionTrackerIds.add(conversionTrackerIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョントラッカーのID。</div> <div lang=\"en\">Conversion Tracker ID.</div> 
   * @return conversionTrackerIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーのID。</div> <div lang=\"en\">Conversion Tracker ID.</div> ")

@Size(max=1000) 
  public List<Long> getConversionTrackerIds() {
    return conversionTrackerIds;
  }

  public void setConversionTrackerIds(List<Long> conversionTrackerIds) {
    this.conversionTrackerIds = conversionTrackerIds;
  }

  public ConversionGroupServiceSelector numberResults(Integer numberResults) {
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

  public ConversionGroupServiceSelector startIndex(Integer startIndex) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionGroupServiceSelector conversionGroupServiceSelector = (ConversionGroupServiceSelector) o;
    return Objects.equals(this.accountId, conversionGroupServiceSelector.accountId) &&
        Objects.equals(this.conversionGroupIds, conversionGroupServiceSelector.conversionGroupIds) &&
        Objects.equals(this.conversionGroupName, conversionGroupServiceSelector.conversionGroupName) &&
        Objects.equals(this.conversionTrackerIds, conversionGroupServiceSelector.conversionTrackerIds) &&
        Objects.equals(this.numberResults, conversionGroupServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, conversionGroupServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, conversionGroupIds, conversionGroupName, conversionTrackerIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionGroupServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    conversionGroupIds: ").append(toIndentedString(conversionGroupIds)).append("\n");
    sb.append("    conversionGroupName: ").append(toIndentedString(conversionGroupName)).append("\n");
    sb.append("    conversionTrackerIds: ").append(toIndentedString(conversionTrackerIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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


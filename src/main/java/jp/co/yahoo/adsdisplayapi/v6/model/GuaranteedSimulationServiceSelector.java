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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedSimulationServiceSelector object is a container for storing a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The GuaranteedSimulationServiceSelector object is a container for storing a set of criteria (parameters) for get method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("guaranteedSimulationIds")
  @Valid
  private List<Long> guaranteedSimulationIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public GuaranteedSimulationServiceSelector accountId(Long accountId) {
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

  public GuaranteedSimulationServiceSelector guaranteedSimulationIds(List<Long> guaranteedSimulationIds) {
    this.guaranteedSimulationIds = guaranteedSimulationIds;
    return this;
  }

  public GuaranteedSimulationServiceSelector addGuaranteedSimulationIdsItem(Long guaranteedSimulationIdsItem) {
    if (this.guaranteedSimulationIds == null) {
      this.guaranteedSimulationIds = new ArrayList<>();
    }
    this.guaranteedSimulationIds.add(guaranteedSimulationIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : シミュレーションID</div> <div lang=\"en\">Search Condition: Simulation ID</div> 
   * @return guaranteedSimulationIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : シミュレーションID</div> <div lang=\"en\">Search Condition: Simulation ID</div> ")

@Size(max=10) 
  public List<Long> getGuaranteedSimulationIds() {
    return guaranteedSimulationIds;
  }

  public void setGuaranteedSimulationIds(List<Long> guaranteedSimulationIds) {
    this.guaranteedSimulationIds = guaranteedSimulationIds;
  }

  public GuaranteedSimulationServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 10
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(10) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public GuaranteedSimulationServiceSelector startIndex(Integer startIndex) {
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
    GuaranteedSimulationServiceSelector guaranteedSimulationServiceSelector = (GuaranteedSimulationServiceSelector) o;
    return Objects.equals(this.accountId, guaranteedSimulationServiceSelector.accountId) &&
        Objects.equals(this.guaranteedSimulationIds, guaranteedSimulationServiceSelector.guaranteedSimulationIds) &&
        Objects.equals(this.numberResults, guaranteedSimulationServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, guaranteedSimulationServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, guaranteedSimulationIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    guaranteedSimulationIds: ").append(toIndentedString(guaranteedSimulationIds)).append("\n");
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


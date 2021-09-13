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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedInventoryServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedInventoryServiceSelector object is a container for storing a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedInventoryServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The GuaranteedInventoryServiceSelector object is a container for storing a set of criteria (parameters) for get method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("inventoryJobIds")
  @Valid
  private List<Long> inventoryJobIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public GuaranteedInventoryServiceSelector accountId(Long accountId) {
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

  public GuaranteedInventoryServiceSelector inventoryJobIds(List<Long> inventoryJobIds) {
    this.inventoryJobIds = inventoryJobIds;
    return this;
  }

  public GuaranteedInventoryServiceSelector addInventoryJobIdsItem(Long inventoryJobIdsItem) {
    if (this.inventoryJobIds == null) {
      this.inventoryJobIds = new ArrayList<>();
    }
    this.inventoryJobIds.add(inventoryJobIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : 在庫確認ジョブID</div> <div lang=\"en\">Search Condition: Inventory check job ID</div> 
   * @return inventoryJobIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 在庫確認ジョブID</div> <div lang=\"en\">Search Condition: Inventory check job ID</div> ")

@Size(max=10) 
  public List<Long> getInventoryJobIds() {
    return inventoryJobIds;
  }

  public void setInventoryJobIds(List<Long> inventoryJobIds) {
    this.inventoryJobIds = inventoryJobIds;
  }

  public GuaranteedInventoryServiceSelector numberResults(Integer numberResults) {
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

  public GuaranteedInventoryServiceSelector startIndex(Integer startIndex) {
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
    GuaranteedInventoryServiceSelector guaranteedInventoryServiceSelector = (GuaranteedInventoryServiceSelector) o;
    return Objects.equals(this.accountId, guaranteedInventoryServiceSelector.accountId) &&
        Objects.equals(this.inventoryJobIds, guaranteedInventoryServiceSelector.inventoryJobIds) &&
        Objects.equals(this.numberResults, guaranteedInventoryServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, guaranteedInventoryServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, inventoryJobIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    inventoryJobIds: ").append(toIndentedString(inventoryJobIds)).append("\n");
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


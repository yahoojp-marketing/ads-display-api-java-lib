package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.DictionaryServicePlacementCategoryList;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServicePlacementCategoryValueオブジェクトは、駅情報のリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServicePlacementCategoryValue object displays the list of station.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServicePlacementCategoryValueオブジェクトは、駅情報のリストを表します。</div> <div lang=\"en\">DictionaryServicePlacementCategoryValue object displays the list of station.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServicePlacementCategoryValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("placementCategoryList")
  private DictionaryServicePlacementCategoryList placementCategoryList = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public DictionaryServicePlacementCategoryValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public DictionaryServicePlacementCategoryValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public DictionaryServicePlacementCategoryValue placementCategoryList(DictionaryServicePlacementCategoryList placementCategoryList) {
    this.placementCategoryList = placementCategoryList;
    return this;
  }

  /**
   * Get placementCategoryList
   * @return placementCategoryList
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServicePlacementCategoryList getPlacementCategoryList() {
    return placementCategoryList;
  }

  public void setPlacementCategoryList(DictionaryServicePlacementCategoryList placementCategoryList) {
    this.placementCategoryList = placementCategoryList;
  }

  public DictionaryServicePlacementCategoryValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServicePlacementCategoryValue dictionaryServicePlacementCategoryValue = (DictionaryServicePlacementCategoryValue) o;
    return Objects.equals(this.errors, dictionaryServicePlacementCategoryValue.errors) &&
        Objects.equals(this.placementCategoryList, dictionaryServicePlacementCategoryValue.placementCategoryList) &&
        Objects.equals(this.operationSucceeded, dictionaryServicePlacementCategoryValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, placementCategoryList, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServicePlacementCategoryValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    placementCategoryList: ").append(toIndentedString(placementCategoryList)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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


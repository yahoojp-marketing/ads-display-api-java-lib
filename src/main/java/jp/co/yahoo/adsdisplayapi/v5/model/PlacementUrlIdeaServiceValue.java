package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.PlacementUrlIdea;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaServiceValueオブジェクトは、メソッドの実行結果（１Entity）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The objects to keep execution result of method (1 Entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaServiceValueオブジェクトは、メソッドの実行結果（１Entity）を保持するオブジェクトです。</div> <div lang=\"en\">The objects to keep execution result of method (1 Entity).</div> ")

public class PlacementUrlIdeaServiceValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  @JsonProperty("placementUrlIdea")
  private JsonNullable<PlacementUrlIdea> placementUrlIdea = JsonNullable.undefined();

  public PlacementUrlIdeaServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public PlacementUrlIdeaServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public PlacementUrlIdeaServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public PlacementUrlIdeaServiceValue placementUrlIdea(PlacementUrlIdea placementUrlIdea) {
    this.placementUrlIdea = JsonNullable.of(placementUrlIdea);
    return this;
  }

  /**
   * Get placementUrlIdea
   * @return placementUrlIdea
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<PlacementUrlIdea> getPlacementUrlIdea() {
    return placementUrlIdea;
  }

  public void setPlacementUrlIdea(JsonNullable<PlacementUrlIdea> placementUrlIdea) {
    this.placementUrlIdea = placementUrlIdea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlIdeaServiceValue placementUrlIdeaServiceValue = (PlacementUrlIdeaServiceValue) o;
    return Objects.equals(this.errors, placementUrlIdeaServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, placementUrlIdeaServiceValue.operationSucceeded) &&
        Objects.equals(this.placementUrlIdea, placementUrlIdeaServiceValue.placementUrlIdea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, placementUrlIdea);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlIdeaServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    placementUrlIdea: ").append(toIndentedString(placementUrlIdea)).append("\n");
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


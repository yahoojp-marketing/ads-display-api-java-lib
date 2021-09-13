package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServicePredictionResult;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServicePredictionオブジェクトは、GuaranteedSimulationオブジェクトで定義された条件に基づく配信シミュレーションの予測結果を表します。&lt;br&gt; - results: 予約確定前の配信シミュレーションの予測結果のデータセットです。&lt;br&gt; - requestedConditionResult: 指定された条件（sov, reach, vImps, lifetimeBudget）に関連する予約確定前の配信シミュレーションの予測結果です。&lt;br&gt; - reservedConditionResult: 指定された条件（sov, reach, vImps, lifetimeBudget）に関連する予約確定後の配信シミュレーションの予測結果です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServicePrediction object describes the prediction result of the delivery simulation based on conditions defined in GuaranteedSimulation object.&lt;br&gt; - results: Prediction result data set of the delivery simulation before reservation is confirmed.&lt;br&gt; - requestedConditionResult: Prediction result of the delivery simulation before reservation is confirmed that is related to the specified conditions (sov, reach, vImps, lifetimeBudget).&lt;br&gt; - reservedConditionResult: Prediction result of the delivery simulation after reservation is confirmed that is related to the specified conditions (sov, reach, vImps, lifetimeBudget). &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServicePredictionオブジェクトは、GuaranteedSimulationオブジェクトで定義された条件に基づく配信シミュレーションの予測結果を表します。<br> - results: 予約確定前の配信シミュレーションの予測結果のデータセットです。<br> - requestedConditionResult: 指定された条件（sov, reach, vImps, lifetimeBudget）に関連する予約確定前の配信シミュレーションの予測結果です。<br> - reservedConditionResult: 指定された条件（sov, reach, vImps, lifetimeBudget）に関連する予約確定後の配信シミュレーションの予測結果です。 </div> <div lang=\"en\"> GuaranteedSimulationServicePrediction object describes the prediction result of the delivery simulation based on conditions defined in GuaranteedSimulation object.<br> - results: Prediction result data set of the delivery simulation before reservation is confirmed.<br> - requestedConditionResult: Prediction result of the delivery simulation before reservation is confirmed that is related to the specified conditions (sov, reach, vImps, lifetimeBudget).<br> - reservedConditionResult: Prediction result of the delivery simulation after reservation is confirmed that is related to the specified conditions (sov, reach, vImps, lifetimeBudget). </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePrediction   {
  @JsonProperty("results")
  @Valid
  private List<GuaranteedSimulationServicePredictionResult> results = null;

  @JsonProperty("requestedConditionResult")
  private GuaranteedSimulationServicePredictionResult requestedConditionResult = null;

  @JsonProperty("reservedConditionResult")
  private GuaranteedSimulationServicePredictionResult reservedConditionResult = null;

  public GuaranteedSimulationServicePrediction results(List<GuaranteedSimulationServicePredictionResult> results) {
    this.results = results;
    return this;
  }

  public GuaranteedSimulationServicePrediction addResultsItem(GuaranteedSimulationServicePredictionResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServicePredictionResult> getResults() {
    return results;
  }

  public void setResults(List<GuaranteedSimulationServicePredictionResult> results) {
    this.results = results;
  }

  public GuaranteedSimulationServicePrediction requestedConditionResult(GuaranteedSimulationServicePredictionResult requestedConditionResult) {
    this.requestedConditionResult = requestedConditionResult;
    return this;
  }

  /**
   * Get requestedConditionResult
   * @return requestedConditionResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePredictionResult getRequestedConditionResult() {
    return requestedConditionResult;
  }

  public void setRequestedConditionResult(GuaranteedSimulationServicePredictionResult requestedConditionResult) {
    this.requestedConditionResult = requestedConditionResult;
  }

  public GuaranteedSimulationServicePrediction reservedConditionResult(GuaranteedSimulationServicePredictionResult reservedConditionResult) {
    this.reservedConditionResult = reservedConditionResult;
    return this;
  }

  /**
   * Get reservedConditionResult
   * @return reservedConditionResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePredictionResult getReservedConditionResult() {
    return reservedConditionResult;
  }

  public void setReservedConditionResult(GuaranteedSimulationServicePredictionResult reservedConditionResult) {
    this.reservedConditionResult = reservedConditionResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePrediction guaranteedSimulationServicePrediction = (GuaranteedSimulationServicePrediction) o;
    return Objects.equals(this.results, guaranteedSimulationServicePrediction.results) &&
        Objects.equals(this.requestedConditionResult, guaranteedSimulationServicePrediction.requestedConditionResult) &&
        Objects.equals(this.reservedConditionResult, guaranteedSimulationServicePrediction.reservedConditionResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, requestedConditionResult, reservedConditionResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePrediction {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    requestedConditionResult: ").append(toIndentedString(requestedConditionResult)).append("\n");
    sb.append("    reservedConditionResult: ").append(toIndentedString(reservedConditionResult)).append("\n");
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


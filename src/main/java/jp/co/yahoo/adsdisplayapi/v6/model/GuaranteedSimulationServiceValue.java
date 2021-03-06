/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceValueオブジェクトは、操作結果を含む予約型キャンペーンの配信シミュレーション情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceValue object describes information about the guaranteed campaign delivery simulation including the operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceValueオブジェクトは、操作結果を含む予約型キャンペーンの配信シミュレーション情報を表します。</div> <div lang=\"en\">GuaranteedSimulationServiceValue object describes information about the guaranteed campaign delivery simulation including the operation result.</div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceValue.JSON_PROPERTY_GUARANTEED_SIMULATION,
  GuaranteedSimulationServiceValue.JSON_PROPERTY_ERRORS,
  GuaranteedSimulationServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("GuaranteedSimulationServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceValue {
  public static final String JSON_PROPERTY_GUARANTEED_SIMULATION = "guaranteedSimulation";
  private GuaranteedSimulation guaranteedSimulation;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public GuaranteedSimulationServiceValue() { 
  }

  public GuaranteedSimulationServiceValue guaranteedSimulation(GuaranteedSimulation guaranteedSimulation) {
    
    this.guaranteedSimulation = guaranteedSimulation;
    return this;
  }

   /**
   * Get guaranteedSimulation
   * @return guaranteedSimulation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GUARANTEED_SIMULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulation getGuaranteedSimulation() {
    return guaranteedSimulation;
  }


  @JsonProperty(JSON_PROPERTY_GUARANTEED_SIMULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuaranteedSimulation(GuaranteedSimulation guaranteedSimulation) {
    this.guaranteedSimulation = guaranteedSimulation;
  }


  public GuaranteedSimulationServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public GuaranteedSimulationServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;エラー内容です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Error content.&lt;/div&gt; 
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public GuaranteedSimulationServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")
  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    GuaranteedSimulationServiceValue guaranteedSimulationServiceValue = (GuaranteedSimulationServiceValue) o;
    return Objects.equals(this.guaranteedSimulation, guaranteedSimulationServiceValue.guaranteedSimulation) &&
        Objects.equals(this.errors, guaranteedSimulationServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, guaranteedSimulationServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guaranteedSimulation, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceValue {\n");
    sb.append("    guaranteedSimulation: ").append(toIndentedString(guaranteedSimulation)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


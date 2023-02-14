/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

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
import jp.co.yahoo.adsdisplayapi.v10.model.Error;
import jp.co.yahoo.adsdisplayapi.v10.model.PlacementUrlIdea;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaServiceValueオブジェクトは、メソッドの実行結果（１Entity）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The objects to keep execution result of method (1 Entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaServiceValueオブジェクトは、メソッドの実行結果（１Entity）を保持するオブジェクトです。</div> <div lang=\"en\">The objects to keep execution result of method (1 Entity).</div> ")
@JsonPropertyOrder({
  PlacementUrlIdeaServiceValue.JSON_PROPERTY_ERRORS,
  PlacementUrlIdeaServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED,
  PlacementUrlIdeaServiceValue.JSON_PROPERTY_PLACEMENT_URL_IDEA
})
@JsonTypeName("PlacementUrlIdeaServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlacementUrlIdeaServiceValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public static final String JSON_PROPERTY_PLACEMENT_URL_IDEA = "placementUrlIdea";
  private PlacementUrlIdea placementUrlIdea;

  public PlacementUrlIdeaServiceValue() { 
  }

  public PlacementUrlIdeaServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public PlacementUrlIdeaServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public PlacementUrlIdeaServiceValue operationSucceeded(Boolean operationSucceeded) {
    
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


  public PlacementUrlIdeaServiceValue placementUrlIdea(PlacementUrlIdea placementUrlIdea) {
    
    this.placementUrlIdea = placementUrlIdea;
    return this;
  }

   /**
   * Get placementUrlIdea
   * @return placementUrlIdea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL_IDEA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlacementUrlIdea getPlacementUrlIdea() {
    return placementUrlIdea;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_URL_IDEA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlacementUrlIdea(PlacementUrlIdea placementUrlIdea) {
    this.placementUrlIdea = placementUrlIdea;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


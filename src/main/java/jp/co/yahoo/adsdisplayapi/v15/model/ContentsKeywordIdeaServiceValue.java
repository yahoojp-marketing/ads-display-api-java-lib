/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v15.model.ContentsKeywordIdea;
import jp.co.yahoo.adsdisplayapi.v15.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordIdeaServiceValueオブジェクトは、コンテンツターゲティング対象キーワードを含むコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordIdeaServiceValue object is a container that includes keyword for contents targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ContentsKeywordIdeaServiceValue.JSON_PROPERTY_ERRORS,
  ContentsKeywordIdeaServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED,
  ContentsKeywordIdeaServiceValue.JSON_PROPERTY_CONTENTS_KEYWORD_IDEA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentsKeywordIdeaServiceValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public static final String JSON_PROPERTY_CONTENTS_KEYWORD_IDEA = "contentsKeywordIdea";
  private ContentsKeywordIdea contentsKeywordIdea;

  public ContentsKeywordIdeaServiceValue() {
  }

  public ContentsKeywordIdeaServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public ContentsKeywordIdeaServiceValue addErrorsItem(Error errorsItem) {
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
  @jakarta.annotation.Nullable
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


  public ContentsKeywordIdeaServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @jakarta.annotation.Nullable
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


  public ContentsKeywordIdeaServiceValue contentsKeywordIdea(ContentsKeywordIdea contentsKeywordIdea) {
    
    this.contentsKeywordIdea = contentsKeywordIdea;
    return this;
  }

   /**
   * Get contentsKeywordIdea
   * @return contentsKeywordIdea
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_IDEA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentsKeywordIdea getContentsKeywordIdea() {
    return contentsKeywordIdea;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS_KEYWORD_IDEA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentsKeywordIdea(ContentsKeywordIdea contentsKeywordIdea) {
    this.contentsKeywordIdea = contentsKeywordIdea;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsKeywordIdeaServiceValue contentsKeywordIdeaServiceValue = (ContentsKeywordIdeaServiceValue) o;
    return Objects.equals(this.errors, contentsKeywordIdeaServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, contentsKeywordIdeaServiceValue.operationSucceeded) &&
        Objects.equals(this.contentsKeywordIdea, contentsKeywordIdeaServiceValue.contentsKeywordIdea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, contentsKeywordIdea);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordIdeaServiceValue {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    contentsKeywordIdea: ").append(toIndentedString(contentsKeywordIdea)).append("\n");
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


/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v13.model.CampaignLabel;
import jp.co.yahoo.adsdisplayapi.v13.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignLabelServiceValueオブジェクトは、操作結果を含むキャンペーンラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignLabelServiceValue object describes campaign label information including its operation results.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignLabelServiceValue.JSON_PROPERTY_CAMPAIGN_LABEL,
  CampaignLabelServiceValue.JSON_PROPERTY_ERRORS,
  CampaignLabelServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignLabelServiceValue {
  public static final String JSON_PROPERTY_CAMPAIGN_LABEL = "campaignLabel";
  private CampaignLabel campaignLabel;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public CampaignLabelServiceValue() {
  }

  public CampaignLabelServiceValue campaignLabel(CampaignLabel campaignLabel) {
    
    this.campaignLabel = campaignLabel;
    return this;
  }

   /**
   * Get campaignLabel
   * @return campaignLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignLabel getCampaignLabel() {
    return campaignLabel;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignLabel(CampaignLabel campaignLabel) {
    this.campaignLabel = campaignLabel;
  }


  public CampaignLabelServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignLabelServiceValue addErrorsItem(Error errorsItem) {
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


  public CampaignLabelServiceValue operationSucceeded(Boolean operationSucceeded) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignLabelServiceValue campaignLabelServiceValue = (CampaignLabelServiceValue) o;
    return Objects.equals(this.campaignLabel, campaignLabelServiceValue.campaignLabel) &&
        Objects.equals(this.errors, campaignLabelServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignLabelServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignLabel, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignLabelServiceValue {\n");
    sb.append("    campaignLabel: ").append(toIndentedString(campaignLabel)).append("\n");
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


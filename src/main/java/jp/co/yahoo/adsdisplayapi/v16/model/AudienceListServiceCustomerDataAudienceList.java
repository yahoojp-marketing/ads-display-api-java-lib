/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceCustomerDataAudienceListオブジェクトは、オーディエンスリスト（顧客データ）を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがCUSTOMER_DATAの場合は、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceCustomerDataAudienceList object describes audience list (customer data). This field is optional in ADD and SET operation. &lt;br&gt; *If audienceListType is CUSTOMER_DATA, this field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceCustomerDataAudienceList.JSON_PROPERTY_CUSTOM_AUDIENCE_ID,
  AudienceListServiceCustomerDataAudienceList.JSON_PROPERTY_DATA_DURATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceCustomerDataAudienceList {
  public static final String JSON_PROPERTY_CUSTOM_AUDIENCE_ID = "customAudienceId";
  private String customAudienceId;

  public static final String JSON_PROPERTY_DATA_DURATION = "dataDuration";
  private Integer dataDuration;

  public AudienceListServiceCustomerDataAudienceList() {
  }

  public AudienceListServiceCustomerDataAudienceList customAudienceId(String customAudienceId) {
    
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カスタムオーディエンスID（サイトリターゲティングID）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Custom audience ID (site retargeting ID).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return customAudienceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_AUDIENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomAudienceId() {
    return customAudienceId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_AUDIENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
  }


  public AudienceListServiceCustomerDataAudienceList dataDuration(Integer dataDuration) {
    
    this.dataDuration = dataDuration;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 行動履歴の保持期間です（1日～60日）。&lt;br&gt; このフィールドは、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Duration of user data configured from DMP (1-60days). &lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
   * @return dataDuration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDataDuration() {
    return dataDuration;
  }


  @JsonProperty(JSON_PROPERTY_DATA_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataDuration(Integer dataDuration) {
    this.dataDuration = dataDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceCustomerDataAudienceList audienceListServiceCustomerDataAudienceList = (AudienceListServiceCustomerDataAudienceList) o;
    return Objects.equals(this.customAudienceId, audienceListServiceCustomerDataAudienceList.customAudienceId) &&
        Objects.equals(this.dataDuration, audienceListServiceCustomerDataAudienceList.dataDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAudienceId, dataDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceCustomerDataAudienceList {\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    dataDuration: ").append(toIndentedString(dataDuration)).append("\n");
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


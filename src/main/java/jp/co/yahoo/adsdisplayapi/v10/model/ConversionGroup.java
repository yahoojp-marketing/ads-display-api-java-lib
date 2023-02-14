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
import jp.co.yahoo.adsdisplayapi.v10.model.ConversionGroupServiceConversion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupオブジェクトは、コンバージョングループ情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionGroup object shows ConversionGroup information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionGroupオブジェクトは、コンバージョングループ情報を表します。</div> <div lang=\"en\">ConversionGroup object shows ConversionGroup information.</div> ")
@JsonPropertyOrder({
  ConversionGroup.JSON_PROPERTY_ACCOUNT_ID,
  ConversionGroup.JSON_PROPERTY_CONVERSION_GROUP_ID,
  ConversionGroup.JSON_PROPERTY_CONVERSION_GROUP_NAME,
  ConversionGroup.JSON_PROPERTY_CONVERSIONS
})
@JsonTypeName("ConversionGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionGroup {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CONVERSION_GROUP_ID = "conversionGroupId";
  private Long conversionGroupId;

  public static final String JSON_PROPERTY_CONVERSION_GROUP_NAME = "conversionGroupName";
  private String conversionGroupName;

  public static final String JSON_PROPERTY_CONVERSIONS = "conversions";
  private List<ConversionGroupServiceConversion> conversions = null;

  public ConversionGroup() { 
  }

  public ConversionGroup accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ConversionGroup conversionGroupId(Long conversionGroupId) {
    
    this.conversionGroupId = conversionGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョングループIDです。&lt;br&gt; このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversion Tracker ID.&lt;br&gt; This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. &lt;/div&gt; 
   * @return conversionGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョングループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionGroupId() {
    return conversionGroupId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionGroupId(Long conversionGroupId) {
    this.conversionGroupId = conversionGroupId;
  }


  public ConversionGroup conversionGroupName(String conversionGroupName) {
    
    this.conversionGroupName = conversionGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョングループ名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversion Group Name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return conversionGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョングループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Group Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversionGroupName() {
    return conversionGroupName;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionGroupName(String conversionGroupName) {
    this.conversionGroupName = conversionGroupName;
  }


  public ConversionGroup conversions(List<ConversionGroupServiceConversion> conversions) {
    
    this.conversions = conversions;
    return this;
  }

  public ConversionGroup addConversionsItem(ConversionGroupServiceConversion conversionsItem) {
    if (this.conversions == null) {
      this.conversions = new ArrayList<>();
    }
    this.conversions.add(conversionsItem);
    return this;
  }

   /**
   * Get conversions
   * @return conversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionGroupServiceConversion> getConversions() {
    return conversions;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversions(List<ConversionGroupServiceConversion> conversions) {
    this.conversions = conversions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionGroup conversionGroup = (ConversionGroup) o;
    return Objects.equals(this.accountId, conversionGroup.accountId) &&
        Objects.equals(this.conversionGroupId, conversionGroup.conversionGroupId) &&
        Objects.equals(this.conversionGroupName, conversionGroup.conversionGroupName) &&
        Objects.equals(this.conversions, conversionGroup.conversions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, conversionGroupId, conversionGroupName, conversions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionGroup {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    conversionGroupId: ").append(toIndentedString(conversionGroupId)).append("\n");
    sb.append("    conversionGroupName: ").append(toIndentedString(conversionGroupName)).append("\n");
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
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


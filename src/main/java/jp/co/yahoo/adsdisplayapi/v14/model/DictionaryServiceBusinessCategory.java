/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceBusinessCategoryオブジェクトは、ビジネスカテゴリー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceBusinessCategory object contains ad category information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  DictionaryServiceBusinessCategory.JSON_PROPERTY_BUSINESS_CATEGORY_ID,
  DictionaryServiceBusinessCategory.JSON_PROPERTY_BUSINESS_CATEGORY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceBusinessCategory {
  public static final String JSON_PROPERTY_BUSINESS_CATEGORY_ID = "businessCategoryId";
  private String businessCategoryId;

  public static final String JSON_PROPERTY_BUSINESS_CATEGORY_NAME = "businessCategoryName";
  private String businessCategoryName;

  public DictionaryServiceBusinessCategory() {
  }

  public DictionaryServiceBusinessCategory businessCategoryId(String businessCategoryId) {
    
    this.businessCategoryId = businessCategoryId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビジネスカテゴリIDを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Business category ID.&lt;/div&gt; 
   * @return businessCategoryId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessCategoryId() {
    return businessCategoryId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessCategoryId(String businessCategoryId) {
    this.businessCategoryId = businessCategoryId;
  }


  public DictionaryServiceBusinessCategory businessCategoryName(String businessCategoryName) {
    
    this.businessCategoryName = businessCategoryName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビジネスカテゴリ名を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Business category name.&lt;/div&gt; 
   * @return businessCategoryName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessCategoryName() {
    return businessCategoryName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessCategoryName(String businessCategoryName) {
    this.businessCategoryName = businessCategoryName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceBusinessCategory dictionaryServiceBusinessCategory = (DictionaryServiceBusinessCategory) o;
    return Objects.equals(this.businessCategoryId, dictionaryServiceBusinessCategory.businessCategoryId) &&
        Objects.equals(this.businessCategoryName, dictionaryServiceBusinessCategory.businessCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessCategoryId, businessCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceBusinessCategory {\n");
    sb.append("    businessCategoryId: ").append(toIndentedString(businessCategoryId)).append("\n");
    sb.append("    businessCategoryName: ").append(toIndentedString(businessCategoryName)).append("\n");
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


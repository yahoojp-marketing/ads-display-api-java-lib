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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceBrandTrackingは、ブランド効果測定レポートの設定情報を保持します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceBrandTracking holds the setting information of brand tracking report.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  GuaranteedCampaignServiceBrandTracking.JSON_PROPERTY_AUDIENCE_CATEGORY_IDS1,
  GuaranteedCampaignServiceBrandTracking.JSON_PROPERTY_AUDIENCE_CATEGORY_IDS2,
  GuaranteedCampaignServiceBrandTracking.JSON_PROPERTY_BUSINESS_CATEGORY_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedCampaignServiceBrandTracking {
  public static final String JSON_PROPERTY_AUDIENCE_CATEGORY_IDS1 = "audienceCategoryIds1";
  private List<String> audienceCategoryIds1;

  public static final String JSON_PROPERTY_AUDIENCE_CATEGORY_IDS2 = "audienceCategoryIds2";
  private List<String> audienceCategoryIds2;

  public static final String JSON_PROPERTY_BUSINESS_CATEGORY_IDS = "businessCategoryIds";
  private List<String> businessCategoryIds;

  public GuaranteedCampaignServiceBrandTracking() {
  }

  public GuaranteedCampaignServiceBrandTracking audienceCategoryIds1(List<String> audienceCategoryIds1) {
    
    this.audienceCategoryIds1 = audienceCategoryIds1;
    return this;
  }

  public GuaranteedCampaignServiceBrandTracking addAudienceCategoryIds1Item(String audienceCategoryIds1Item) {
    if (this.audienceCategoryIds1 == null) {
      this.audienceCategoryIds1 = new ArrayList<>();
    }
    this.audienceCategoryIds1.add(audienceCategoryIds1Item);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスカテゴリIDグループ1です。&lt;br&gt; レポート作成時、ここで指定されたカテゴリーに対して強い興味関心を持つ層を対象に集計します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience category ID group 1.&lt;br&gt; When creating a report, aggregation will be executed for the group with a strong interest in the category specified in this field.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return audienceCategoryIds1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_CATEGORY_IDS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAudienceCategoryIds1() {
    return audienceCategoryIds1;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_CATEGORY_IDS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceCategoryIds1(List<String> audienceCategoryIds1) {
    this.audienceCategoryIds1 = audienceCategoryIds1;
  }


  public GuaranteedCampaignServiceBrandTracking audienceCategoryIds2(List<String> audienceCategoryIds2) {
    
    this.audienceCategoryIds2 = audienceCategoryIds2;
    return this;
  }

  public GuaranteedCampaignServiceBrandTracking addAudienceCategoryIds2Item(String audienceCategoryIds2Item) {
    if (this.audienceCategoryIds2 == null) {
      this.audienceCategoryIds2 = new ArrayList<>();
    }
    this.audienceCategoryIds2.add(audienceCategoryIds2Item);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; オーディエンスカテゴリIDグループ2です。&lt;br&gt; レポート作成時、ここで指定されたカテゴリーに対して少し興味関心を持つ層を対象に集計します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Audience category ID group 2.&lt;br&gt; When creating a report, aggregation will be executed for the group with a small interest in the category specified in this field.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return audienceCategoryIds2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_CATEGORY_IDS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAudienceCategoryIds2() {
    return audienceCategoryIds2;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_CATEGORY_IDS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceCategoryIds2(List<String> audienceCategoryIds2) {
    this.audienceCategoryIds2 = audienceCategoryIds2;
  }


  public GuaranteedCampaignServiceBrandTracking businessCategoryIds(List<String> businessCategoryIds) {
    
    this.businessCategoryIds = businessCategoryIds;
    return this;
  }

  public GuaranteedCampaignServiceBrandTracking addBusinessCategoryIdsItem(String businessCategoryIdsItem) {
    if (this.businessCategoryIds == null) {
      this.businessCategoryIds = new ArrayList<>();
    }
    this.businessCategoryIds.add(businessCategoryIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ビジネスカテゴリIDグループです。&lt;br&gt; アンケート対象になる広告・商材の業種の種別を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※返却される値は、DictionaryServiceのgetBusinessCategoryで取得されるDictionaryServiceBusinessCategoryのbusinessCategoryIdフィールドをご確認ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Business category ID group.&lt;br&gt; This describes the type of ads/products which is a subject of the survey.  &lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; *Refer to the businessCategoryId field of DictionaryServiceBusinessCategory which can be obtained via getBusinessCategory in DictionaryService, to check the values to be returned in this field. &lt;/div&gt; 
   * @return businessCategoryIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_CATEGORY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBusinessCategoryIds() {
    return businessCategoryIds;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CATEGORY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessCategoryIds(List<String> businessCategoryIds) {
    this.businessCategoryIds = businessCategoryIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceBrandTracking guaranteedCampaignServiceBrandTracking = (GuaranteedCampaignServiceBrandTracking) o;
    return Objects.equals(this.audienceCategoryIds1, guaranteedCampaignServiceBrandTracking.audienceCategoryIds1) &&
        Objects.equals(this.audienceCategoryIds2, guaranteedCampaignServiceBrandTracking.audienceCategoryIds2) &&
        Objects.equals(this.businessCategoryIds, guaranteedCampaignServiceBrandTracking.businessCategoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceCategoryIds1, audienceCategoryIds2, businessCategoryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceBrandTracking {\n");
    sb.append("    audienceCategoryIds1: ").append(toIndentedString(audienceCategoryIds1)).append("\n");
    sb.append("    audienceCategoryIds2: ").append(toIndentedString(audienceCategoryIds2)).append("\n");
    sb.append("    businessCategoryIds: ").append(toIndentedString(businessCategoryIds)).append("\n");
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


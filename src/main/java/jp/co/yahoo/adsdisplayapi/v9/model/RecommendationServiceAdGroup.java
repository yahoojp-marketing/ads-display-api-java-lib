/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceAdGroupオブジェクトは、広告グループの詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceAdGroup objects describes ad group information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceAdGroupオブジェクトは、広告グループの詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceAdGroup objects describes ad group information.</div> ")
@JsonPropertyOrder({
  RecommendationServiceAdGroup.JSON_PROPERTY_AD_GROUP_ID,
  RecommendationServiceAdGroup.JSON_PROPERTY_AD_GROUP_NAME,
  RecommendationServiceAdGroup.JSON_PROPERTY_MEDIA_AD_FORMAT,
  RecommendationServiceAdGroup.JSON_PROPERTY_AD_COUNT
})
@JsonTypeName("RecommendationServiceAdGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceAdGroup {
  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_MEDIA_AD_FORMAT = "mediaAdFormat";
  private String mediaAdFormat;

  public static final String JSON_PROPERTY_AD_COUNT = "adCount";
  private Long adCount;

  public RecommendationServiceAdGroup() { 
  }

  public RecommendationServiceAdGroup adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループIDです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group ID. &lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。 </div> <div lang=\"en\"> Ad group ID. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupId() {
    return adGroupId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public RecommendationServiceAdGroup adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ名です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group name. &lt;/div&gt; 
   * @return adGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。 </div> <div lang=\"en\"> Ad group name. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdGroupName() {
    return adGroupName;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }


  public RecommendationServiceAdGroup mediaAdFormat(String mediaAdFormat) {
    
    this.mediaAdFormat = mediaAdFormat;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 画像フォーマットの種類です。&lt;br&gt; このフィールドは、 typeがNOT_OPTIMAL_AD_COUNT_PER_MEDIA_AD_FORMAT, ADGROUPS_FOR_ADDING_ADSの場合のみ返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The type of image format.&lt;br&gt; This field is returned when the type is NOT_OPTIMAL_AD_COUNT_PER_MEDIA_AD_FORMAT, ADGROUPS_FOR_ADDING_ADS. &lt;/div&gt; 
   * @return mediaAdFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 画像フォーマットの種類です。<br> このフィールドは、 typeがNOT_OPTIMAL_AD_COUNT_PER_MEDIA_AD_FORMAT, ADGROUPS_FOR_ADDING_ADSの場合のみ返却されます。 </div> <div lang=\"en\"> The type of image format.<br> This field is returned when the type is NOT_OPTIMAL_AD_COUNT_PER_MEDIA_AD_FORMAT, ADGROUPS_FOR_ADDING_ADS. </div> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaAdFormat() {
    return mediaAdFormat;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
  }


  public RecommendationServiceAdGroup adCount(Long adCount) {
    
    this.adCount = adCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 対象メディアフォーマットを利用している広告数です。&lt;br&gt; このフィールドは、 typeがNOT_OPTIMAL_AD_COUNT_PER_MEDIA_AD_FORMATの場合のみ返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The number of ads that use this media format.&lt;br&gt; This field is returned when the type is NOT_OPTIMAL_AD_COUNT_PER_MEDIA_AD_FORMAT. &lt;/div&gt; 
   * @return adCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 対象メディアフォーマットを利用している広告数です。<br> このフィールドは、 typeがNOT_OPTIMAL_AD_COUNT_PER_MEDIA_AD_FORMATの場合のみ返却されます。 </div> <div lang=\"en\"> The number of ads that use this media format.<br> This field is returned when the type is NOT_OPTIMAL_AD_COUNT_PER_MEDIA_AD_FORMAT. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdCount() {
    return adCount;
  }


  @JsonProperty(JSON_PROPERTY_AD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdCount(Long adCount) {
    this.adCount = adCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceAdGroup recommendationServiceAdGroup = (RecommendationServiceAdGroup) o;
    return Objects.equals(this.adGroupId, recommendationServiceAdGroup.adGroupId) &&
        Objects.equals(this.adGroupName, recommendationServiceAdGroup.adGroupName) &&
        Objects.equals(this.mediaAdFormat, recommendationServiceAdGroup.mediaAdFormat) &&
        Objects.equals(this.adCount, recommendationServiceAdGroup.adCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, adGroupName, mediaAdFormat, adCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceAdGroup {\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    mediaAdFormat: ").append(toIndentedString(mediaAdFormat)).append("\n");
    sb.append("    adCount: ").append(toIndentedString(adCount)).append("\n");
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


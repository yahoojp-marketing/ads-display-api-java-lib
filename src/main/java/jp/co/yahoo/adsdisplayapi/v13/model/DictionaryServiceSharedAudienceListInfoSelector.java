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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v13.model.DictionaryServiceSharedAudienceListType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceSharedAudienceListInfoSelectorオブジェクトは、共通オーディエンスリストを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceSharedAudienceListInfoSelector object specifies shared audience list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceSharedAudienceListInfoSelectorオブジェクトは、共通オーディエンスリストを指定します。</div> <div lang=\"en\">DictionaryServiceSharedAudienceListInfoSelector object specifies shared audience list.</div> ")
@JsonPropertyOrder({
  DictionaryServiceSharedAudienceListInfoSelector.JSON_PROPERTY_AUDIENCE_LIST_IDS,
  DictionaryServiceSharedAudienceListInfoSelector.JSON_PROPERTY_AUDIENCE_LIST_TYPES,
  DictionaryServiceSharedAudienceListInfoSelector.JSON_PROPERTY_NUMBER_RESULTS,
  DictionaryServiceSharedAudienceListInfoSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("DictionaryServiceSharedAudienceListInfoSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceSharedAudienceListInfoSelector {
  public static final String JSON_PROPERTY_AUDIENCE_LIST_IDS = "audienceListIds";
  private List<Long> audienceListIds = null;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_TYPES = "audienceListTypes";
  private List<DictionaryServiceSharedAudienceListType> audienceListTypes = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 1000;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public DictionaryServiceSharedAudienceListInfoSelector() { 
  }

  public DictionaryServiceSharedAudienceListInfoSelector audienceListIds(List<Long> audienceListIds) {
    
    this.audienceListIds = audienceListIds;
    return this;
  }

  public DictionaryServiceSharedAudienceListInfoSelector addAudienceListIdsItem(Long audienceListIdsItem) {
    if (this.audienceListIds == null) {
      this.audienceListIds = new ArrayList<>();
    }
    this.audienceListIds.add(audienceListIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスリストIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Audience list ID.&lt;/div&gt; 
   * @return audienceListIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">オーディエンスリストIDです。</div> <div lang=\"en\">Audience list ID.</div> ")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAudienceListIds() {
    return audienceListIds;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListIds(List<Long> audienceListIds) {
    this.audienceListIds = audienceListIds;
  }


  public DictionaryServiceSharedAudienceListInfoSelector audienceListTypes(List<DictionaryServiceSharedAudienceListType> audienceListTypes) {
    
    this.audienceListTypes = audienceListTypes;
    return this;
  }

  public DictionaryServiceSharedAudienceListInfoSelector addAudienceListTypesItem(DictionaryServiceSharedAudienceListType audienceListTypesItem) {
    if (this.audienceListTypes == null) {
      this.audienceListTypes = new ArrayList<>();
    }
    this.audienceListTypes.add(audienceListTypesItem);
    return this;
  }

   /**
   * Get audienceListTypes
   * @return audienceListTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DictionaryServiceSharedAudienceListType> getAudienceListTypes() {
    return audienceListTypes;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListTypes(List<DictionaryServiceSharedAudienceListType> audienceListTypes) {
    this.audienceListTypes = audienceListTypes;
  }


  public DictionaryServiceSharedAudienceListInfoSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public DictionaryServiceSharedAudienceListInfoSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 0.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。</div> <div lang=\"en\">The position within the result set where retrieval begins. This field must be greater than or equal to 0.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceSharedAudienceListInfoSelector dictionaryServiceSharedAudienceListInfoSelector = (DictionaryServiceSharedAudienceListInfoSelector) o;
    return Objects.equals(this.audienceListIds, dictionaryServiceSharedAudienceListInfoSelector.audienceListIds) &&
        Objects.equals(this.audienceListTypes, dictionaryServiceSharedAudienceListInfoSelector.audienceListTypes) &&
        Objects.equals(this.numberResults, dictionaryServiceSharedAudienceListInfoSelector.numberResults) &&
        Objects.equals(this.startIndex, dictionaryServiceSharedAudienceListInfoSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListIds, audienceListTypes, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceSharedAudienceListInfoSelector {\n");
    sb.append("    audienceListIds: ").append(toIndentedString(audienceListIds)).append("\n");
    sb.append("    audienceListTypes: ").append(toIndentedString(audienceListTypes)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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


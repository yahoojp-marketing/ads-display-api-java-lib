/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v17.model.AudienceListServiceCombination;
import jp.co.yahoo.adsdisplayapi.v17.model.AudienceListServiceContainDataConnectionStopped;
import jp.co.yahoo.adsdisplayapi.v17.model.AudienceListServiceContainUnavailableAdActionUserListFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceCombinationAudienceListオブジェクトは、オーディエンスリストの組み合わせ情報のリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがCOMBINATIONの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceCombinationAudienceList object is a container for storing list of combination of audience list information. &lt;br&gt; This field is optional in ADD and SET operation. &lt;br&gt; *If audienceListType is COMBINATION, this field is required in  ADD and SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceCombinationAudienceList.JSON_PROPERTY_COMBINATIONS,
  AudienceListServiceCombinationAudienceList.JSON_PROPERTY_CONTAIN_UNAVAILABLE_AD_ACTION_USER_LIST_FLG,
  AudienceListServiceCombinationAudienceList.JSON_PROPERTY_CONTAIN_DATA_CONNECTION_STOPPED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceCombinationAudienceList {
  public static final String JSON_PROPERTY_COMBINATIONS = "combinations";
  private List<AudienceListServiceCombination> combinations;

  public static final String JSON_PROPERTY_CONTAIN_UNAVAILABLE_AD_ACTION_USER_LIST_FLG = "containUnavailableAdActionUserListFlg";
  private AudienceListServiceContainUnavailableAdActionUserListFlg containUnavailableAdActionUserListFlg;

  public static final String JSON_PROPERTY_CONTAIN_DATA_CONNECTION_STOPPED = "containDataConnectionStopped";
  private AudienceListServiceContainDataConnectionStopped containDataConnectionStopped;

  public AudienceListServiceCombinationAudienceList() {
  }

  public AudienceListServiceCombinationAudienceList combinations(List<AudienceListServiceCombination> combinations) {
    
    this.combinations = combinations;
    return this;
  }

  public AudienceListServiceCombinationAudienceList addCombinationsItem(AudienceListServiceCombination combinationsItem) {
    if (this.combinations == null) {
      this.combinations = new ArrayList<>();
    }
    this.combinations.add(combinationsItem);
    return this;
  }

   /**
   * Get combinations
   * @return combinations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMBINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AudienceListServiceCombination> getCombinations() {
    return combinations;
  }


  @JsonProperty(JSON_PROPERTY_COMBINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinations(List<AudienceListServiceCombination> combinations) {
    this.combinations = combinations;
  }


  public AudienceListServiceCombinationAudienceList containUnavailableAdActionUserListFlg(AudienceListServiceContainUnavailableAdActionUserListFlg containUnavailableAdActionUserListFlg) {
    
    this.containUnavailableAdActionUserListFlg = containUnavailableAdActionUserListFlg;
    return this;
  }

   /**
   * Get containUnavailableAdActionUserListFlg
   * @return containUnavailableAdActionUserListFlg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAIN_UNAVAILABLE_AD_ACTION_USER_LIST_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceContainUnavailableAdActionUserListFlg getContainUnavailableAdActionUserListFlg() {
    return containUnavailableAdActionUserListFlg;
  }


  @JsonProperty(JSON_PROPERTY_CONTAIN_UNAVAILABLE_AD_ACTION_USER_LIST_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainUnavailableAdActionUserListFlg(AudienceListServiceContainUnavailableAdActionUserListFlg containUnavailableAdActionUserListFlg) {
    this.containUnavailableAdActionUserListFlg = containUnavailableAdActionUserListFlg;
  }


  public AudienceListServiceCombinationAudienceList containDataConnectionStopped(AudienceListServiceContainDataConnectionStopped containDataConnectionStopped) {
    
    this.containDataConnectionStopped = containDataConnectionStopped;
    return this;
  }

   /**
   * Get containDataConnectionStopped
   * @return containDataConnectionStopped
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAIN_DATA_CONNECTION_STOPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceContainDataConnectionStopped getContainDataConnectionStopped() {
    return containDataConnectionStopped;
  }


  @JsonProperty(JSON_PROPERTY_CONTAIN_DATA_CONNECTION_STOPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainDataConnectionStopped(AudienceListServiceContainDataConnectionStopped containDataConnectionStopped) {
    this.containDataConnectionStopped = containDataConnectionStopped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceCombinationAudienceList audienceListServiceCombinationAudienceList = (AudienceListServiceCombinationAudienceList) o;
    return Objects.equals(this.combinations, audienceListServiceCombinationAudienceList.combinations) &&
        Objects.equals(this.containUnavailableAdActionUserListFlg, audienceListServiceCombinationAudienceList.containUnavailableAdActionUserListFlg) &&
        Objects.equals(this.containDataConnectionStopped, audienceListServiceCombinationAudienceList.containDataConnectionStopped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinations, containUnavailableAdActionUserListFlg, containDataConnectionStopped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceCombinationAudienceList {\n");
    sb.append("    combinations: ").append(toIndentedString(combinations)).append("\n");
    sb.append("    containUnavailableAdActionUserListFlg: ").append(toIndentedString(containUnavailableAdActionUserListFlg)).append("\n");
    sb.append("    containDataConnectionStopped: ").append(toIndentedString(containDataConnectionStopped)).append("\n");
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


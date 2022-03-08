/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

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
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceFrequencyLevel;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceFrequencyTimeUnit;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServicePackagePermissionType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackagePermittedViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackagePermittedViewableFrequencyCap object describes viewable frequency restriction.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackagePermittedViewableFrequencyCapは、ビューアブルフリークエンシー制御を表します。</div> <div lang=\"en\">GuaranteedSimulationServicePackagePermittedViewableFrequencyCap object describes viewable frequency restriction.</div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePackagePermittedViewableFrequencyCap.JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP_PERMISSION,
  GuaranteedSimulationServicePackagePermittedViewableFrequencyCap.JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP_LEVELS,
  GuaranteedSimulationServicePackagePermittedViewableFrequencyCap.JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_TIME_UNITS,
  GuaranteedSimulationServicePackagePermittedViewableFrequencyCap.JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_IMPRESSION_MIN,
  GuaranteedSimulationServicePackagePermittedViewableFrequencyCap.JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_IMPRESSION_MAX
})
@JsonTypeName("GuaranteedSimulationServicePackagePermittedViewableFrequencyCap")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePackagePermittedViewableFrequencyCap {
  public static final String JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP_PERMISSION = "viewableFrequencyCapPermission";
  private GuaranteedSimulationServicePackagePermissionType viewableFrequencyCapPermission;

  public static final String JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP_LEVELS = "viewableFrequencyCapLevels";
  private List<GuaranteedSimulationServiceFrequencyLevel> viewableFrequencyCapLevels = null;

  public static final String JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_TIME_UNITS = "permittedViewableFrequencyCapTimeUnits";
  private List<GuaranteedSimulationServiceFrequencyTimeUnit> permittedViewableFrequencyCapTimeUnits = null;

  public static final String JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_IMPRESSION_MIN = "permittedViewableFrequencyCapImpressionMin";
  private Long permittedViewableFrequencyCapImpressionMin;

  public static final String JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_IMPRESSION_MAX = "permittedViewableFrequencyCapImpressionMax";
  private Long permittedViewableFrequencyCapImpressionMax;

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap() { 
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap viewableFrequencyCapPermission(GuaranteedSimulationServicePackagePermissionType viewableFrequencyCapPermission) {
    
    this.viewableFrequencyCapPermission = viewableFrequencyCapPermission;
    return this;
  }

   /**
   * Get viewableFrequencyCapPermission
   * @return viewableFrequencyCapPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServicePackagePermissionType getViewableFrequencyCapPermission() {
    return viewableFrequencyCapPermission;
  }


  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewableFrequencyCapPermission(GuaranteedSimulationServicePackagePermissionType viewableFrequencyCapPermission) {
    this.viewableFrequencyCapPermission = viewableFrequencyCapPermission;
  }


  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap viewableFrequencyCapLevels(List<GuaranteedSimulationServiceFrequencyLevel> viewableFrequencyCapLevels) {
    
    this.viewableFrequencyCapLevels = viewableFrequencyCapLevels;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap addViewableFrequencyCapLevelsItem(GuaranteedSimulationServiceFrequencyLevel viewableFrequencyCapLevelsItem) {
    if (this.viewableFrequencyCapLevels == null) {
      this.viewableFrequencyCapLevels = new ArrayList<>();
    }
    this.viewableFrequencyCapLevels.add(viewableFrequencyCapLevelsItem);
    return this;
  }

   /**
   * Get viewableFrequencyCapLevels
   * @return viewableFrequencyCapLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedSimulationServiceFrequencyLevel> getViewableFrequencyCapLevels() {
    return viewableFrequencyCapLevels;
  }


  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewableFrequencyCapLevels(List<GuaranteedSimulationServiceFrequencyLevel> viewableFrequencyCapLevels) {
    this.viewableFrequencyCapLevels = viewableFrequencyCapLevels;
  }


  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap permittedViewableFrequencyCapTimeUnits(List<GuaranteedSimulationServiceFrequencyTimeUnit> permittedViewableFrequencyCapTimeUnits) {
    
    this.permittedViewableFrequencyCapTimeUnits = permittedViewableFrequencyCapTimeUnits;
    return this;
  }

  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap addPermittedViewableFrequencyCapTimeUnitsItem(GuaranteedSimulationServiceFrequencyTimeUnit permittedViewableFrequencyCapTimeUnitsItem) {
    if (this.permittedViewableFrequencyCapTimeUnits == null) {
      this.permittedViewableFrequencyCapTimeUnits = new ArrayList<>();
    }
    this.permittedViewableFrequencyCapTimeUnits.add(permittedViewableFrequencyCapTimeUnitsItem);
    return this;
  }

   /**
   * Get permittedViewableFrequencyCapTimeUnits
   * @return permittedViewableFrequencyCapTimeUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_TIME_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedSimulationServiceFrequencyTimeUnit> getPermittedViewableFrequencyCapTimeUnits() {
    return permittedViewableFrequencyCapTimeUnits;
  }


  @JsonProperty(JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_TIME_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermittedViewableFrequencyCapTimeUnits(List<GuaranteedSimulationServiceFrequencyTimeUnit> permittedViewableFrequencyCapTimeUnits) {
    this.permittedViewableFrequencyCapTimeUnits = permittedViewableFrequencyCapTimeUnits;
  }


  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap permittedViewableFrequencyCapImpressionMin(Long permittedViewableFrequencyCapImpressionMin) {
    
    this.permittedViewableFrequencyCapImpressionMin = permittedViewableFrequencyCapImpressionMin;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビューアブルフリークエンシーキャップ表示回数（最小）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Display count of viewable frequency cap (minimum).&lt;/div&gt; 
   * @return permittedViewableFrequencyCapImpressionMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルフリークエンシーキャップ表示回数（最小）です。</div> <div lang=\"en\">Display count of viewable frequency cap (minimum).</div> ")
  @JsonProperty(JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_IMPRESSION_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPermittedViewableFrequencyCapImpressionMin() {
    return permittedViewableFrequencyCapImpressionMin;
  }


  @JsonProperty(JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_IMPRESSION_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermittedViewableFrequencyCapImpressionMin(Long permittedViewableFrequencyCapImpressionMin) {
    this.permittedViewableFrequencyCapImpressionMin = permittedViewableFrequencyCapImpressionMin;
  }


  public GuaranteedSimulationServicePackagePermittedViewableFrequencyCap permittedViewableFrequencyCapImpressionMax(Long permittedViewableFrequencyCapImpressionMax) {
    
    this.permittedViewableFrequencyCapImpressionMax = permittedViewableFrequencyCapImpressionMax;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビューアブルフリークエンシーキャップ表示回数（最大）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Display count of viewable frequency cap (maximum).&lt;/div&gt; 
   * @return permittedViewableFrequencyCapImpressionMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルフリークエンシーキャップ表示回数（最大）です。</div> <div lang=\"en\">Display count of viewable frequency cap (maximum).</div> ")
  @JsonProperty(JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_IMPRESSION_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPermittedViewableFrequencyCapImpressionMax() {
    return permittedViewableFrequencyCapImpressionMax;
  }


  @JsonProperty(JSON_PROPERTY_PERMITTED_VIEWABLE_FREQUENCY_CAP_IMPRESSION_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermittedViewableFrequencyCapImpressionMax(Long permittedViewableFrequencyCapImpressionMax) {
    this.permittedViewableFrequencyCapImpressionMax = permittedViewableFrequencyCapImpressionMax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePackagePermittedViewableFrequencyCap guaranteedSimulationServicePackagePermittedViewableFrequencyCap = (GuaranteedSimulationServicePackagePermittedViewableFrequencyCap) o;
    return Objects.equals(this.viewableFrequencyCapPermission, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.viewableFrequencyCapPermission) &&
        Objects.equals(this.viewableFrequencyCapLevels, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.viewableFrequencyCapLevels) &&
        Objects.equals(this.permittedViewableFrequencyCapTimeUnits, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.permittedViewableFrequencyCapTimeUnits) &&
        Objects.equals(this.permittedViewableFrequencyCapImpressionMin, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.permittedViewableFrequencyCapImpressionMin) &&
        Objects.equals(this.permittedViewableFrequencyCapImpressionMax, guaranteedSimulationServicePackagePermittedViewableFrequencyCap.permittedViewableFrequencyCapImpressionMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewableFrequencyCapPermission, viewableFrequencyCapLevels, permittedViewableFrequencyCapTimeUnits, permittedViewableFrequencyCapImpressionMin, permittedViewableFrequencyCapImpressionMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackagePermittedViewableFrequencyCap {\n");
    sb.append("    viewableFrequencyCapPermission: ").append(toIndentedString(viewableFrequencyCapPermission)).append("\n");
    sb.append("    viewableFrequencyCapLevels: ").append(toIndentedString(viewableFrequencyCapLevels)).append("\n");
    sb.append("    permittedViewableFrequencyCapTimeUnits: ").append(toIndentedString(permittedViewableFrequencyCapTimeUnits)).append("\n");
    sb.append("    permittedViewableFrequencyCapImpressionMin: ").append(toIndentedString(permittedViewableFrequencyCapImpressionMin)).append("\n");
    sb.append("    permittedViewableFrequencyCapImpressionMax: ").append(toIndentedString(permittedViewableFrequencyCapImpressionMax)).append("\n");
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


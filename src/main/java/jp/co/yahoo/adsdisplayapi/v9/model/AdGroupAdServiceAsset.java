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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceDescriptionAsset;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceHeadlineAsset;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceMediaAsset;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceAssetオブジェクトは、レスポンシブディスプレイ広告の情報を表します。&lt;br&gt; 詳細は&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan&#x3D;ja&amp;aid&#x3D;51344\&quot; target&#x3D;\&quot;_blank\&quot;&gt;レスポンシブ（画像）&lt;/a&gt;を参照してください。&lt;br&gt; このフィールドは、省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceAsset object describes the Responsive Display Ad information.&lt;br&gt; More details are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan&#x3D;en&amp;aid&#x3D;28655\&quot;&gt;Responsive（Image）&lt;/a&gt;.&lt;br&gt; This field is optional.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceAsset.JSON_PROPERTY_MEDIA_ASSETS,
  AdGroupAdServiceAsset.JSON_PROPERTY_HEADLINE_ASSETS,
  AdGroupAdServiceAsset.JSON_PROPERTY_DESCRIPTION_ASSETS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceAsset {
  public static final String JSON_PROPERTY_MEDIA_ASSETS = "mediaAssets";
  private List<AdGroupAdServiceMediaAsset> mediaAssets;

  public static final String JSON_PROPERTY_HEADLINE_ASSETS = "headlineAssets";
  private List<AdGroupAdServiceHeadlineAsset> headlineAssets;

  public static final String JSON_PROPERTY_DESCRIPTION_ASSETS = "descriptionAssets";
  private List<AdGroupAdServiceDescriptionAsset> descriptionAssets;

  public AdGroupAdServiceAsset() {
  }

  public AdGroupAdServiceAsset mediaAssets(List<AdGroupAdServiceMediaAsset> mediaAssets) {
    
    this.mediaAssets = mediaAssets;
    return this;
  }

  public AdGroupAdServiceAsset addMediaAssetsItem(AdGroupAdServiceMediaAsset mediaAssetsItem) {
    if (this.mediaAssets == null) {
      this.mediaAssets = new ArrayList<>();
    }
    this.mediaAssets.add(mediaAssetsItem);
    return this;
  }

   /**
   * Get mediaAssets
   * @return mediaAssets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceMediaAsset> getMediaAssets() {
    return mediaAssets;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaAssets(List<AdGroupAdServiceMediaAsset> mediaAssets) {
    this.mediaAssets = mediaAssets;
  }


  public AdGroupAdServiceAsset headlineAssets(List<AdGroupAdServiceHeadlineAsset> headlineAssets) {
    
    this.headlineAssets = headlineAssets;
    return this;
  }

  public AdGroupAdServiceAsset addHeadlineAssetsItem(AdGroupAdServiceHeadlineAsset headlineAssetsItem) {
    if (this.headlineAssets == null) {
      this.headlineAssets = new ArrayList<>();
    }
    this.headlineAssets.add(headlineAssetsItem);
    return this;
  }

   /**
   * Get headlineAssets
   * @return headlineAssets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADLINE_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceHeadlineAsset> getHeadlineAssets() {
    return headlineAssets;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadlineAssets(List<AdGroupAdServiceHeadlineAsset> headlineAssets) {
    this.headlineAssets = headlineAssets;
  }


  public AdGroupAdServiceAsset descriptionAssets(List<AdGroupAdServiceDescriptionAsset> descriptionAssets) {
    
    this.descriptionAssets = descriptionAssets;
    return this;
  }

  public AdGroupAdServiceAsset addDescriptionAssetsItem(AdGroupAdServiceDescriptionAsset descriptionAssetsItem) {
    if (this.descriptionAssets == null) {
      this.descriptionAssets = new ArrayList<>();
    }
    this.descriptionAssets.add(descriptionAssetsItem);
    return this;
  }

   /**
   * Get descriptionAssets
   * @return descriptionAssets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceDescriptionAsset> getDescriptionAssets() {
    return descriptionAssets;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescriptionAssets(List<AdGroupAdServiceDescriptionAsset> descriptionAssets) {
    this.descriptionAssets = descriptionAssets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceAsset adGroupAdServiceAsset = (AdGroupAdServiceAsset) o;
    return Objects.equals(this.mediaAssets, adGroupAdServiceAsset.mediaAssets) &&
        Objects.equals(this.headlineAssets, adGroupAdServiceAsset.headlineAssets) &&
        Objects.equals(this.descriptionAssets, adGroupAdServiceAsset.descriptionAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaAssets, headlineAssets, descriptionAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAsset {\n");
    sb.append("    mediaAssets: ").append(toIndentedString(mediaAssets)).append("\n");
    sb.append("    headlineAssets: ").append(toIndentedString(headlineAssets)).append("\n");
    sb.append("    descriptionAssets: ").append(toIndentedString(descriptionAssets)).append("\n");
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


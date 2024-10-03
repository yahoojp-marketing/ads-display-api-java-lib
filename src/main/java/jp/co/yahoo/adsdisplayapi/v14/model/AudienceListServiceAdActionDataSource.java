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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v14.model.AudienceListServiceEntity;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceAdActionDataSourceオブジェクトは、広告アクションデータソースを表します。&lt;br&gt; このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceAdActionDataSource object describes ad action data source.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET and REMOVE operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceAdActionDataSource.JSON_PROPERTY_ENTITY,
  AudienceListServiceAdActionDataSource.JSON_PROPERTY_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceAdActionDataSource {
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private AudienceListServiceEntity entity;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids;

  public AudienceListServiceAdActionDataSource() {
  }

  public AudienceListServiceAdActionDataSource entity(AudienceListServiceEntity entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceEntity getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(AudienceListServiceEntity entity) {
    this.entity = entity;
  }


  public AudienceListServiceAdActionDataSource ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public AudienceListServiceAdActionDataSource addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告アクションデータソースのIdです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Id of ad action data source.&lt;/div&gt; 
   * @return ids
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceAdActionDataSource audienceListServiceAdActionDataSource = (AudienceListServiceAdActionDataSource) o;
    return Objects.equals(this.entity, audienceListServiceAdActionDataSource.entity) &&
        Objects.equals(this.ids, audienceListServiceAdActionDataSource.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceAdActionDataSource {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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


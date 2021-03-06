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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; RetargetingListServiceTargetListDataオブジェクトは、ターゲットリストを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; RetargetingListServiceTargetListData object displays the target list. &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> RetargetingListServiceTargetListDataオブジェクトは、ターゲットリストを表します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> RetargetingListServiceTargetListData object displays the target list. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
@JsonPropertyOrder({
  RetargetingListServiceTargetListData.JSON_PROPERTY_TARGET_LIST_ID,
  RetargetingListServiceTargetListData.JSON_PROPERTY_TARGET_LIST_NAME
})
@JsonTypeName("RetargetingListServiceTargetListData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceTargetListData {
  public static final String JSON_PROPERTY_TARGET_LIST_ID = "targetListId";
  private Long targetListId;

  public static final String JSON_PROPERTY_TARGET_LIST_NAME = "targetListName";
  private String targetListName;

  public RetargetingListServiceTargetListData() { 
  }

  public RetargetingListServiceTargetListData targetListId(Long targetListId) {
    
    this.targetListId = targetListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ターゲットリストIDです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target list ID.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return targetListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリストIDです。<br> このフィールドは、ADDおよびSET時に必須となります。 </div> <div lang=\"en\"> Target list ID.<br> This field is required in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetListId() {
    return targetListId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }


  public RetargetingListServiceTargetListData targetListName(String targetListName) {
    
    this.targetListName = targetListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストの名前です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of target list.&lt;/div&gt; 
   * @return targetListName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストの名前です。</div> <div lang=\"en\">Name of target list.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetListName() {
    return targetListName;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListName(String targetListName) {
    this.targetListName = targetListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceTargetListData retargetingListServiceTargetListData = (RetargetingListServiceTargetListData) o;
    return Objects.equals(this.targetListId, retargetingListServiceTargetListData.targetListId) &&
        Objects.equals(this.targetListName, retargetingListServiceTargetListData.targetListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListId, targetListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceTargetListData {\n");
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
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


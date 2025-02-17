/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v16.model.AudienceListServiceIsZeroOrCurrentlyTotaling;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AudienceListServiceLineOaFriendAudienceListオブジェクトは、オーディエンスリスト（LINE公式アカウントの友だち）を表します。&lt;br&gt; このリストを作成するにはビジネスマネージャー・LINE公式アカウントとの接続が必要です。詳しくは&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000052782?language&#x3D;ja\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ヘルプ&lt;/a&gt;をご確認ください。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※audienceListTypeがLINE_OA_FRIENDの場合は、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AudienceListServiceLineOaFriendAudienceList object describes the audience list (Friends of LINE Official Account).&lt;br&gt; To create this list, it is necessary to link the Business Manager and the LINE Official Account. For more details, please refer to &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000052782?language&#x3D;en_US\&quot; target&#x3D;\&quot;_blank\&quot;&gt;the help documentation&lt;/a&gt;.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If audienceListType is LINE_OA_FRIEND, this field is required in ADD and SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AudienceListServiceLineOaFriendAudienceList.JSON_PROPERTY_IS_ZERO_OR_CURRENTLY_TOTALING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceLineOaFriendAudienceList {
  public static final String JSON_PROPERTY_IS_ZERO_OR_CURRENTLY_TOTALING = "isZeroOrCurrentlyTotaling";
  private AudienceListServiceIsZeroOrCurrentlyTotaling isZeroOrCurrentlyTotaling;

  public AudienceListServiceLineOaFriendAudienceList() {
  }

  public AudienceListServiceLineOaFriendAudienceList isZeroOrCurrentlyTotaling(AudienceListServiceIsZeroOrCurrentlyTotaling isZeroOrCurrentlyTotaling) {
    
    this.isZeroOrCurrentlyTotaling = isZeroOrCurrentlyTotaling;
    return this;
  }

   /**
   * Get isZeroOrCurrentlyTotaling
   * @return isZeroOrCurrentlyTotaling
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ZERO_OR_CURRENTLY_TOTALING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceIsZeroOrCurrentlyTotaling getIsZeroOrCurrentlyTotaling() {
    return isZeroOrCurrentlyTotaling;
  }


  @JsonProperty(JSON_PROPERTY_IS_ZERO_OR_CURRENTLY_TOTALING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsZeroOrCurrentlyTotaling(AudienceListServiceIsZeroOrCurrentlyTotaling isZeroOrCurrentlyTotaling) {
    this.isZeroOrCurrentlyTotaling = isZeroOrCurrentlyTotaling;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceLineOaFriendAudienceList audienceListServiceLineOaFriendAudienceList = (AudienceListServiceLineOaFriendAudienceList) o;
    return Objects.equals(this.isZeroOrCurrentlyTotaling, audienceListServiceLineOaFriendAudienceList.isZeroOrCurrentlyTotaling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isZeroOrCurrentlyTotaling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceLineOaFriendAudienceList {\n");
    sb.append("    isZeroOrCurrentlyTotaling: ").append(toIndentedString(isZeroOrCurrentlyTotaling)).append("\n");
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


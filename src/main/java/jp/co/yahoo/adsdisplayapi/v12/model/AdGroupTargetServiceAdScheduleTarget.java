/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v12.model.AdGroupTargetServiceDayOfWeek;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceAdScheduleTargetオブジェクトは、時間帯ターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAD_SCHEDULE_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; *If targetType is AD_SCHEDULE_TARGET, this field is required. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupTargetServiceAdScheduleTarget.JSON_PROPERTY_DAY_OF_WEEK,
  AdGroupTargetServiceAdScheduleTarget.JSON_PROPERTY_END_HOUR,
  AdGroupTargetServiceAdScheduleTarget.JSON_PROPERTY_START_HOUR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServiceAdScheduleTarget {
  public static final String JSON_PROPERTY_DAY_OF_WEEK = "dayOfWeek";
  private AdGroupTargetServiceDayOfWeek dayOfWeek;

  public static final String JSON_PROPERTY_END_HOUR = "endHour";
  private Integer endHour;

  public static final String JSON_PROPERTY_START_HOUR = "startHour";
  private Integer startHour;

  public AdGroupTargetServiceAdScheduleTarget() {
  }

  public AdGroupTargetServiceAdScheduleTarget dayOfWeek(AdGroupTargetServiceDayOfWeek dayOfWeek) {
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfWeek(AdGroupTargetServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public AdGroupTargetServiceAdScheduleTarget endHour(Integer endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 終了時間（時のみ）です。&lt;br&gt; このフィールドは、ADD時は必須となり、REPLACE時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End time (hour only).&lt;br&gt; This field is required in ADD operation, and will be optional in REPLACE operation. &lt;/div&gt; 
   * @return endHour
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndHour() {
    return endHour;
  }


  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }


  public AdGroupTargetServiceAdScheduleTarget startHour(Integer startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 開始時間（時のみ）です。&lt;br&gt; このフィールドは、ADD時は必須となり、REPLACE時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start time (hour only).&lt;br&gt; This field is required in ADD operation, and will be optional in REPLACE operation. &lt;/div&gt; 
   * @return startHour
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartHour() {
    return startHour;
  }


  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceAdScheduleTarget adGroupTargetServiceAdScheduleTarget = (AdGroupTargetServiceAdScheduleTarget) o;
    return Objects.equals(this.dayOfWeek, adGroupTargetServiceAdScheduleTarget.dayOfWeek) &&
        Objects.equals(this.endHour, adGroupTargetServiceAdScheduleTarget.endHour) &&
        Objects.equals(this.startHour, adGroupTargetServiceAdScheduleTarget.startHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, endHour, startHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceAdScheduleTarget {\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
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


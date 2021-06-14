package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">StatsServiceTargetTypeは、ターゲティングの種別を表します。</div> <div lang=\"en\">StatsServiceTargetType stands for types of target.</div> <dl class=term>   <dt class=\"term__item\">AD_SCHEDULE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">時間帯ターゲティング</span><span lang=\"en\">Days of Week/Hour Targeting</span></dd>   <dt class=\"term__item\">GEO_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">地域ターゲティング</span><span lang=\"en\">Geographic Targeting</span></dd>   <dt class=\"term__item\">AGE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">年齢ターゲティング</span><span lang=\"en\">Age Targeting</span></dd>   <dt class=\"term__item\">GENDER_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">性別ターゲティング</span><span lang=\"en\">Gender Targeting</span></dd>   <dt class=\"term__item\">INTEREST_CATEGORY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">インタレストカテゴリターゲティング</span><span lang=\"en\">Interest Category Targeting</span></dd>   <dt class=\"term__item\">SITE_CATEGORY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトカテゴリターゲティング</span><span lang=\"en\">Site Category Targeting</span></dd>   <dt class=\"term__item\">SITE_RETARGETING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲティング</span><span lang=\"en\">Site Retargeting</span></dd>   <dt class=\"term__item\">SEARCH_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サーチターゲティング</span><span lang=\"en\">Search Targeting</span></dd>   <dt class=\"term__item\">PLACEMENT_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントターゲティング</span><span lang=\"en\">Placement Targeting</span></dd>   <dt class=\"term__item\">DEVICE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">デバイスターゲティング</span><span lang=\"en\">Device Targeting</span></dd>   <dt class=\"term__item\">CARRIER_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャリアターゲティング</span><span lang=\"en\">Carrier Targeting</span></dd>   <dt class=\"term__item\">AUDIENCE_CATEGORY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オーディエンスカテゴリーターゲティング</span><span lang=\"en\">Audience Category Targeting</span></dd>   <dt class=\"term__item\">PLACEMENT_CATEGORY_DETAIL_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントカテゴリ詳細ターゲティング</span><span lang=\"en\">Placement Category Detail Targeting</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum StatsServiceTargetType {
  
  AD_SCHEDULE_TARGET("AD_SCHEDULE_TARGET"),
  
  GEO_TARGET("GEO_TARGET"),
  
  AGE_TARGET("AGE_TARGET"),
  
  GENDER_TARGET("GENDER_TARGET"),
  
  INTEREST_CATEGORY("INTEREST_CATEGORY"),
  
  SITE_CATEGORY("SITE_CATEGORY"),
  
  SITE_RETARGETING("SITE_RETARGETING"),
  
  SEARCH_TARGET("SEARCH_TARGET"),
  
  PLACEMENT_TARGET("PLACEMENT_TARGET"),
  
  DEVICE_TARGET("DEVICE_TARGET"),
  
  CARRIER_TARGET("CARRIER_TARGET"),
  
  AUDIENCE_CATEGORY("AUDIENCE_CATEGORY"),
  
  PLACEMENT_CATEGORY_DETAIL_TARGET("PLACEMENT_CATEGORY_DETAIL_TARGET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  StatsServiceTargetType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StatsServiceTargetType fromValue(String value) {
    for (StatsServiceTargetType b : StatsServiceTargetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


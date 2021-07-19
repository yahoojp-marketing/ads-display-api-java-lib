package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupTargetServiceTargetTypeは、ターゲティングの種別を表します。<br> このフィールドは、リクエストの場合は必須です。<br> ※PLACEMENT_CATEGORY_TARGET, PLACEMENT_CATEGORY_DETAIL_TARGETは予約型広告専用のターゲティングの種別となります。 </div> <div lang=\"en\"> AdGroupTargetServiceTargetType serves types of targets.<br> This field is required in requests.<br> *PLACEMENT_CATEGORY_TARGET are target type exclusive for Guaranteed ads. </div> <dl class=term>   <dt class=\"term__item\">AD_SCHEDULE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">曜日・時間帯ターゲティング</span><span lang=\"en\">Day of Week / Hours Targeting</span></dd>   <dt class=\"term__item\">GEO_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">地域ターゲティング</span><span lang=\"en\">Geographic Targeting</span></dd>   <dt class=\"term__item\">AGE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">年齢ターゲティング</span><span lang=\"en\">Age Targeting</span></dd>   <dt class=\"term__item\">GENDER_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">性別ターゲティング</span><span lang=\"en\">Gender Targeting</span></dd>   <dt class=\"term__item\">INTEREST_CATEGORY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">インタレストカテゴリーターゲティング</span><span lang=\"en\">Interest Category Targeting</span></dd>   <dt class=\"term__item\">SITE_CATEGORY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトカテゴリーターゲティング</span><span lang=\"en\">Site Category Targeting</span></dd>   <dt class=\"term__item\">SITE_RETARGETING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲティング</span><span lang=\"en\">Site Retargeting</span></dd>   <dt class=\"term__item\">SEARCH_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サーチターゲティング</span><span lang=\"en\">Search Targeting</span></dd>   <dt class=\"term__item\">PLACEMENT_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントターゲティング</span><span lang=\"en\">Placement Targeting</span></dd>   <dt class=\"term__item\">DEVICE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">デバイスターゲティング</span><span lang=\"en\">Device Targeting</span></dd>   <dt class=\"term__item\">CARRIER_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャリアターゲティング</span><span lang=\"en\">Carrier Targeting</span></dd>   <dt class=\"term__item\">APP_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブ/アプリターゲティング</span><span lang=\"en\">Web/App Targeting</span></dd>   <dt class=\"term__item\">OS_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">OSターゲティング</span><span lang=\"en\">OS Targeting</span></dd>   <dt class=\"term__item\">OS_VERSION_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">OSバージョンターゲティング</span><span lang=\"en\">OS Version Targeting</span></dd>   <dt class=\"term__item\">AUDIENCE_CATEGORY_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オーディエンスカテゴリターゲティング</span><span lang=\"en\">Audience Category Targeting</span></dd>   <dt class=\"term__item\">POSITION_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ポジションターゲティング</span><span lang=\"en\">Position Targeting</span></dd>   <dt class=\"term__item\">PLACEMENT_CATEGORY_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントカテゴリターゲティング</span><span lang=\"en\">Placement Category Targeting</span></dd>   <dt class=\"term__item\">PLACEMENT_CATEGORY_DETAIL_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントカテゴリ詳細ターゲティング</span><span lang=\"en\">Placement Category Detail Targeting</span></dd>   <dt class=\"term__item\">CONTENTS_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンテンツターゲティング ※現在利用できません</span><span lang=\"en\">Contents Targeting * Not Available.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupTargetServiceTargetType {
  
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
  
  APP_TARGET("APP_TARGET"),
  
  OS_TARGET("OS_TARGET"),
  
  OS_VERSION_TARGET("OS_VERSION_TARGET"),
  
  AUDIENCE_CATEGORY_TARGET("AUDIENCE_CATEGORY_TARGET"),
  
  POSITION_TARGET("POSITION_TARGET"),
  
  PLACEMENT_CATEGORY_TARGET("PLACEMENT_CATEGORY_TARGET"),
  
  PLACEMENT_CATEGORY_DETAIL_TARGET("PLACEMENT_CATEGORY_DETAIL_TARGET"),
  
  CONTENTS_TARGET("CONTENTS_TARGET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupTargetServiceTargetType(String value) {
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
  public static AdGroupTargetServiceTargetType fromValue(String value) {
    for (AdGroupTargetServiceTargetType b : AdGroupTargetServiceTargetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

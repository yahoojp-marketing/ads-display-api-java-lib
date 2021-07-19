package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedInventoryServiceTargetTypeは、ターゲティングの種別を表します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceTargetType serves types of targets.<br> This field is required in requests. </div> <dl class=term>   <dt class=\"term__item\">AD_SCHEDULE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">曜日・時間帯ターゲティング</span><span lang=\"en\">Day of Week / Hours Targeting</span></dd>   <dt class=\"term__item\">GEO_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">地域ターゲティング</span><span lang=\"en\">Geographic Targeting</span></dd>   <dt class=\"term__item\">AGE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">年齢ターゲティング</span><span lang=\"en\">Age Targeting</span></dd>   <dt class=\"term__item\">GENDER_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">性別ターゲティング</span><span lang=\"en\">Gender Targeting</span></dd>   <dt class=\"term__item\">DEVICE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">デバイスターゲティング</span><span lang=\"en\">Device Targeting</span></dd>   <dt class=\"term__item\">APP_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブ/アプリターゲティング</span><span lang=\"en\">Web/App Targeting</span></dd>   <dt class=\"term__item\">OS_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">OSターゲティング</span><span lang=\"en\">OS Targeting</span></dd>   <dt class=\"term__item\">AUDIENCE_CATEGORY_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オーディエンスカテゴリターゲティング</span><span lang=\"en\">Audience Category Targeting</span></dd>   <dt class=\"term__item\">PLACEMENT_CATEGORY_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントカテゴリターゲティング</span><span lang=\"en\">Placement Category Targeting</span></dd>   <dt class=\"term__item\">PLACEMENT_CATEGORY_DETAIL_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントカテゴリ詳細ターゲティング</span><span lang=\"en\">Placement Category Detail Targeting</span></dd>   <dt class=\"term__item\">POSITION_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ポジションターゲティング</span><span lang=\"en\">Position Targeting</span></dd>   <dt class=\"term__item\">SITE_RETARGETING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲティング</span><span lang=\"en\">Site Retargeting</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceTargetType {
  
  AD_SCHEDULE_TARGET("AD_SCHEDULE_TARGET"),
  
  GEO_TARGET("GEO_TARGET"),
  
  AGE_TARGET("AGE_TARGET"),
  
  GENDER_TARGET("GENDER_TARGET"),
  
  DEVICE_TARGET("DEVICE_TARGET"),
  
  APP_TARGET("APP_TARGET"),
  
  OS_TARGET("OS_TARGET"),
  
  AUDIENCE_CATEGORY_TARGET("AUDIENCE_CATEGORY_TARGET"),
  
  PLACEMENT_CATEGORY_TARGET("PLACEMENT_CATEGORY_TARGET"),
  
  PLACEMENT_CATEGORY_DETAIL_TARGET("PLACEMENT_CATEGORY_DETAIL_TARGET"),
  
  POSITION_TARGET("POSITION_TARGET"),
  
  SITE_RETARGETING("SITE_RETARGETING"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceTargetType(String value) {
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
  public static GuaranteedInventoryServiceTargetType fromValue(String value) {
    for (GuaranteedInventoryServiceTargetType b : GuaranteedInventoryServiceTargetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">StatsServiceTypeは、統計情報の種別を表します。</div> <div lang=\"en\">StatsServiceType displays the stats information type.</div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンの統計情報です。</span><span lang=\"en\">Campaign stats information.</span></dd>   <dt class=\"term__item\">ADGROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループの統計情報です。</span><span lang=\"en\">Ad group stats information.</span></dd>   <dt class=\"term__item\">AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告の統計情報です。</span><span lang=\"en\">Ad stats information.</span></dd>   <dt class=\"term__item\">IMAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">画像の統計情報です。</span><span lang=\"en\">Image stats information.</span></dd>   <dt class=\"term__item\">VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動画の統計情報です。</span><span lang=\"en\">Video stats information.</span></dd>   <dt class=\"term__item\">TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲティングの統計情報です。</span><span lang=\"en\">Targeting stats information.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum StatsServiceType {
  
  CAMPAIGN("CAMPAIGN"),
  
  ADGROUP("ADGROUP"),
  
  AD("AD"),
  
  IMAGE("IMAGE"),
  
  VIDEO("VIDEO"),
  
  TARGET("TARGET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  StatsServiceType(String value) {
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
  public static StatsServiceType fromValue(String value) {
    for (StatsServiceType b : StatsServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


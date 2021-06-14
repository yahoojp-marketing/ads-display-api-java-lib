package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">StatsServiceTargetSettingは、ターゲット設定の有効/無効を表します。</div> <div lang=\"en\">StatsServiceTargetSetting displays the setting information of target.</div> <dl class=term>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">有効（すべて）</span><span lang=\"en\">None（All）</span></dd>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">有効</span><span lang=\"en\">Active</span></dd>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">無効</span><span lang=\"en\">Paused</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum StatsServiceTargetSetting {
  
  NONE("NONE"),
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  StatsServiceTargetSetting(String value) {
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
  public static StatsServiceTargetSetting fromValue(String value) {
    for (StatsServiceTargetSetting b : StatsServiceTargetSetting.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


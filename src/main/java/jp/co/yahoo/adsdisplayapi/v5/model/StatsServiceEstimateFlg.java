package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">StatsServiceEstimateFlgは、拡張配信の設定有無を表します。</div> <div lang=\"en\">StatsServiceEstimateFlg stands for extended delivery settings.</div> <dl class=term>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定した性別または年齢のユーザーに配信します。</span><span lang=\"en\">Deliver to users with specified gender or age.</span></dd>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定した性別または年齢と推定されるユーザーに配信します。</span><span lang=\"en\">Deliver to users who can be estimated with specified gender or ages.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum StatsServiceEstimateFlg {
  
  PAUSED("PAUSED"),
  
  ACTIVE("ACTIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  StatsServiceEstimateFlg(String value) {
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
  public static StatsServiceEstimateFlg fromValue(String value) {
    for (StatsServiceEstimateFlg b : StatsServiceEstimateFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


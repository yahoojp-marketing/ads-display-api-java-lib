package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">StatsServicePlacementUrlListTypeは、プレイスメントURLリストの種別を表します。</div> <div lang=\"en\">StatsServicePlacementUrlListType stands for the type of Placement URL list.</div> <dl class=term>   <dt class=\"term__item\">WHITE_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ホワイトリスト</span><span lang=\"en\">White list.</span></dd>   <dt class=\"term__item\">BLACK_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ブラックリスト</span><span lang=\"en\">Black list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum StatsServicePlacementUrlListType {
  
  WHITE_LIST("WHITE_LIST"),
  
  BLACK_LIST("BLACK_LIST"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  StatsServicePlacementUrlListType(String value) {
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
  public static StatsServicePlacementUrlListType fromValue(String value) {
    for (StatsServicePlacementUrlListType b : StatsServicePlacementUrlListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">StatsServiceGenderは、性別を表します。</div> <div lang=\"en\">StatsServiceGender stands for the gender.</div> <dl class=term>   <dt class=\"term__item\">ST_MALE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">男性</span><span lang=\"en\">Male</span></dd>   <dt class=\"term__item\">ST_FEMALE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">女性</span><span lang=\"en\">Female</span></dd>   <dt class=\"term__item\">ST_UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">性別不明</span><span lang=\"en\">Unknown</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum StatsServiceGender {
  
  ST_MALE("ST_MALE"),
  
  ST_FEMALE("ST_FEMALE"),
  
  ST_UNKNOWN("ST_UNKNOWN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  StatsServiceGender(String value) {
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
  public static StatsServiceGender fromValue(String value) {
    for (StatsServiceGender b : StatsServiceGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


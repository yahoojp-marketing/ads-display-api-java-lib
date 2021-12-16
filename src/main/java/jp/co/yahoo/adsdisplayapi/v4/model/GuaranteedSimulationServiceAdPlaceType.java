package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedSimulationServiceAdPlaceTypeは、広告の掲載面を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAdPlaceType describes the ad placements.<br> This field is optional in ADD and SET operation. </div> <dl class=term>   <dt class=\"term__item\">YAHOO_JAPAN_TOP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「Yahoo! JAPANトップページ」です。</span><span lang=\"en\">Top page of \"Yahoo! Japan\".</span></dd>   <dt class=\"term__item\">YAHOO_JAPAN_ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「Yahoo! JAPAN全て」です。</span><span lang=\"en\">All of \"Yahoo! Japan\".</span></dd>   <dt class=\"term__item\">YAHOO_JAPAN_EXCLUSION_OF_TOP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「Yahoo! JAPANトップページ以外」です。</span><span lang=\"en\">All of \"Yahoo! Japan\" except the top page.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceAdPlaceType {
  
  YAHOO_JAPAN_TOP("YAHOO_JAPAN_TOP"),
  
  YAHOO_JAPAN_ALL("YAHOO_JAPAN_ALL"),
  
  YAHOO_JAPAN_EXCLUSION_OF_TOP("YAHOO_JAPAN_EXCLUSION_OF_TOP"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceAdPlaceType(String value) {
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
  public static GuaranteedSimulationServiceAdPlaceType fromValue(String value) {
    for (GuaranteedSimulationServiceAdPlaceType b : GuaranteedSimulationServiceAdPlaceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


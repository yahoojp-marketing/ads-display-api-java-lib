package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedSimulationServiceAgeは、年代を表します。</div> <div lang=\"en\">GuaranteedSimulationServiceAge displays ages.</div> <dl class=term>   <dt class=\"term__item\">GT_RANGE13_14</dt>   <dd class=\"term__desc\"><span lang=\"ja\">13歳から14歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 13 to 14. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE15_17</dt>   <dd class=\"term__desc\"><span lang=\"ja\">15歳から17歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 15 to 17. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE18_19</dt>   <dd class=\"term__desc\"><span lang=\"ja\">18歳から19歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 18 to 19. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE20_21</dt>   <dd class=\"term__desc\"><span lang=\"ja\">20歳から21歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 20 to 21. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE22_29</dt>   <dd class=\"term__desc\"><span lang=\"ja\">22歳から29歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 22 to 29. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE30_39</dt>   <dd class=\"term__desc\"><span lang=\"ja\">30歳から39歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 30 to 39. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE40_49</dt>   <dd class=\"term__desc\"><span lang=\"ja\">40歳から49歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 40 to 49. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE50_59</dt>   <dd class=\"term__desc\"><span lang=\"ja\">50歳から59歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 50 to 59. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE60_69</dt>   <dd class=\"term__desc\"><span lang=\"ja\">60歳から69歳です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">From 60 to 69. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE70_UL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">70歳以上です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">70 and up. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">年齢不明です。旧形式の年齢区分のため非推奨です。</span><span lang=\"en\">GuaranteedSimulationServiceAge unknown. Not recommended for this is the former format of age classification.</span></dd>   <dt class=\"term__item\">GT_RANGE15_19</dt>   <dd class=\"term__desc\"><span lang=\"ja\">15歳から19歳です。</span><span lang=\"en\">From 15 to 19.</span></dd>   <dt class=\"term__item\">GT_RANGE20_24</dt>   <dd class=\"term__desc\"><span lang=\"ja\">20歳から24歳です。</span><span lang=\"en\">From 20 to 24.</span></dd>   <dt class=\"term__item\">GT_RANGE25_29</dt>   <dd class=\"term__desc\"><span lang=\"ja\">25歳から29歳です。</span><span lang=\"en\">From 25 to 29.</span></dd>   <dt class=\"term__item\">GT_RANGE30_34</dt>   <dd class=\"term__desc\"><span lang=\"ja\">30歳から34歳です。</span><span lang=\"en\">From 30 to 34.</span></dd>   <dt class=\"term__item\">GT_RANGE35_39</dt>   <dd class=\"term__desc\"><span lang=\"ja\">35歳から39歳です。</span><span lang=\"en\">From 35 to 39.</span></dd>   <dt class=\"term__item\">GT_RANGE40_44</dt>   <dd class=\"term__desc\"><span lang=\"ja\">40歳から44歳です。</span><span lang=\"en\">From 40 to 44.</span></dd>   <dt class=\"term__item\">GT_RANGE45_49</dt>   <dd class=\"term__desc\"><span lang=\"ja\">45歳から49歳です。</span><span lang=\"en\">From 45 to 49.</span></dd>   <dt class=\"term__item\">GT_RANGE50_54</dt>   <dd class=\"term__desc\"><span lang=\"ja\">50歳から54歳です。</span><span lang=\"en\">From 50 to 54.</span></dd>   <dt class=\"term__item\">GT_RANGE55_59</dt>   <dd class=\"term__desc\"><span lang=\"ja\">55歳から59歳です。</span><span lang=\"en\">From 55 to 59.</span></dd>   <dt class=\"term__item\">GT_RANGE60_64</dt>   <dd class=\"term__desc\"><span lang=\"ja\">60歳から64歳です。</span><span lang=\"en\">From 60 to 64.</span></dd>   <dt class=\"term__item\">GT_RANGE65_69</dt>   <dd class=\"term__desc\"><span lang=\"ja\">65歳から69歳です。</span><span lang=\"en\">From 65 to 69.</span></dd>   <dt class=\"term__item\">GT_RANGE70_UL2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">70歳以上です。</span><span lang=\"en\">70 and up.</span></dd>   <dt class=\"term__item\">GT_UNKNOWN2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">年齢不明です。</span><span lang=\"en\">GuaranteedSimulationServiceAge unknown.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceAge {
  
  GT_RANGE13_14("GT_RANGE13_14"),
  
  GT_RANGE15_17("GT_RANGE15_17"),
  
  GT_RANGE18_19("GT_RANGE18_19"),
  
  GT_RANGE20_21("GT_RANGE20_21"),
  
  GT_RANGE22_29("GT_RANGE22_29"),
  
  GT_RANGE30_39("GT_RANGE30_39"),
  
  GT_RANGE40_49("GT_RANGE40_49"),
  
  GT_RANGE50_59("GT_RANGE50_59"),
  
  GT_RANGE60_69("GT_RANGE60_69"),
  
  GT_RANGE70_UL("GT_RANGE70_UL"),
  
  GT_UNKNOWN("GT_UNKNOWN"),
  
  GT_RANGE15_19("GT_RANGE15_19"),
  
  GT_RANGE20_24("GT_RANGE20_24"),
  
  GT_RANGE25_29("GT_RANGE25_29"),
  
  GT_RANGE30_34("GT_RANGE30_34"),
  
  GT_RANGE35_39("GT_RANGE35_39"),
  
  GT_RANGE40_44("GT_RANGE40_44"),
  
  GT_RANGE45_49("GT_RANGE45_49"),
  
  GT_RANGE50_54("GT_RANGE50_54"),
  
  GT_RANGE55_59("GT_RANGE55_59"),
  
  GT_RANGE60_64("GT_RANGE60_64"),
  
  GT_RANGE65_69("GT_RANGE65_69"),
  
  GT_RANGE70_UL2("GT_RANGE70_UL2"),
  
  GT_UNKNOWN2("GT_UNKNOWN2"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceAge(String value) {
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
  public static GuaranteedSimulationServiceAge fromValue(String value) {
    for (GuaranteedSimulationServiceAge b : GuaranteedSimulationServiceAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


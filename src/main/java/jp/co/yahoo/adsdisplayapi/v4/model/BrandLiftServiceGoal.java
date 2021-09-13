package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> BrandLiftServiceGoalは、調査目的を表します。 </div> <div lang=\"en\"> BrandLiftServiceGoal describes the survey goal. </div> <dl class=term>   <dt class=\"term__item\">AD_RECALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告想起です。</span><span lang=\"en\">Ads recall.</span></dd>   <dt class=\"term__item\">BRAND_AWARENESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ブランド認知です。</span><span lang=\"en\">Brand awareness.</span></dd>   <dt class=\"term__item\">MESSAGE_ASSOCIATION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">メッセージ連想です。</span><span lang=\"en\">Message association.</span></dd>   <dt class=\"term__item\">PURCHASE_INTENTION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">購入意向です。</span><span lang=\"en\">Purchase intention.</span></dd>   <dt class=\"term__item\">FAVOR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">好意度です。</span><span lang=\"en\">Favorableness.</span></dd>   <dt class=\"term__item\">COMPARISON</dt>   <dd class=\"term__desc\"><span lang=\"ja\">比較検討です。</span><span lang=\"en\">Comparative consideration.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum BrandLiftServiceGoal {
  
  AD_RECALL("AD_RECALL"),
  
  BRAND_AWARENESS("BRAND_AWARENESS"),
  
  MESSAGE_ASSOCIATION("MESSAGE_ASSOCIATION"),
  
  PURCHASE_INTENTION("PURCHASE_INTENTION"),
  
  FAVOR("FAVOR"),
  
  COMPARISON("COMPARISON"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BrandLiftServiceGoal(String value) {
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
  public static BrandLiftServiceGoal fromValue(String value) {
    for (BrandLiftServiceGoal b : BrandLiftServiceGoal.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


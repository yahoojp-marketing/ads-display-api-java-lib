package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceCategoryは、トラッキング対象のコンバージョントラッカー情報のカテゴリーです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> ConversionTrackerServiceCategory is a category for ConversionTracker.<br> This field is required in ADD operation, and will be optional in SET operation. </div> <dl class=term>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未設定です。</span><span lang=\"en\">None</span></dd>   <dt class=\"term__item\">DEFAULT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">その他です。</span><span lang=\"en\">Other</span></dd>   <dt class=\"term__item\">PAGE_VIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">主要なページの閲覧です。</span><span lang=\"en\">Main page view</span></dd>   <dt class=\"term__item\">PURCHASE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">購入販売です。</span><span lang=\"en\">Purchase / Sales</span></dd>   <dt class=\"term__item\">SIGNUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">契約です。</span><span lang=\"en\">Sign up</span></dd>   <dt class=\"term__item\">LEAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">販売促進です。</span><span lang=\"en\">Sales promotion</span></dd>   <dt class=\"term__item\">DOWNLOAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ダウンロードです。</span><span lang=\"en\">Download</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceCategory {
  
  NONE("NONE"),
  
  DEFAULT("DEFAULT"),
  
  PAGE_VIEW("PAGE_VIEW"),
  
  PURCHASE("PURCHASE"),
  
  SIGNUP("SIGNUP"),
  
  LEAD("LEAD"),
  
  DOWNLOAD("DOWNLOAD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceCategory(String value) {
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
  public static ConversionTrackerServiceCategory fromValue(String value) {
    for (ConversionTrackerServiceCategory b : ConversionTrackerServiceCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


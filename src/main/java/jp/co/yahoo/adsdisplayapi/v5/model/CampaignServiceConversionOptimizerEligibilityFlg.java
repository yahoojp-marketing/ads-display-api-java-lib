package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> CampaignServiceConversionOptimizerEligibilityFlgは、コンバージョン最適化機能が使用可能であるか表示します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> CampaignServiceConversionOptimizerEligibilityFlg serves  if conversion optimization is valid.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">ENABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン最適化機能は使用可能です。</span><span lang=\"en\">Can use the Conversion Optimization functions.</span></dd>   <dt class=\"term__item\">DISABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン最適化機能は使用できません。</span><span lang=\"en\">Cannot use the Conversion Optimization functions.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceConversionOptimizerEligibilityFlg {
  
  ENABLE("ENABLE"),
  
  DISABLE("DISABLE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceConversionOptimizerEligibilityFlg(String value) {
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
  public static CampaignServiceConversionOptimizerEligibilityFlg fromValue(String value) {
    for (CampaignServiceConversionOptimizerEligibilityFlg b : CampaignServiceConversionOptimizerEligibilityFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


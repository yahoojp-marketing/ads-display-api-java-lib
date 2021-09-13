package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> キャンペーン入札戦略タイプです。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> CampaignServiceCampaignBiddingStrategyType describes setting of campaign bid strategy type.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">AUTO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札</span><span lang=\"en\">Auto bidding</span></dd>   <dt class=\"term__item\">MAX_VCPM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大入札価格指定（vCPM）</span><span lang=\"en\">Max. bid value (vCPM)</span></dd>   <dt class=\"term__item\">MAX_CPC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大入札価格指定（CPC）</span><span lang=\"en\">Max. bid value (CPC)</span></dd>   <dt class=\"term__item\">MAX_CPV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大入札価格指定（CPV）</span><span lang=\"en\">Max. bid value(CPV)</span></dd>   <dt class=\"term__item\">TARGET_CPA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">目標単価指定（CPA）</span><span lang=\"en\">Target cost specification (CPA)</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入札戦略指定なし</span><span lang=\"en\">No Setting of bid strategy</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceCampaignBiddingStrategyType {
  
  AUTO("AUTO"),
  
  MAX_VCPM("MAX_VCPM"),
  
  MAX_CPC("MAX_CPC"),
  
  MAX_CPV("MAX_CPV"),
  
  TARGET_CPA("TARGET_CPA"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceCampaignBiddingStrategyType(String value) {
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
  public static CampaignServiceCampaignBiddingStrategyType fromValue(String value) {
    for (CampaignServiceCampaignBiddingStrategyType b : CampaignServiceCampaignBiddingStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


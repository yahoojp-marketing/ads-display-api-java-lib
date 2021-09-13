package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> キャンペーン入札戦略タイプです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedInventoryServiceCampaignBiddingStrategyType describes setting of campaign bid strategy type.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">MAX_VCPM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大入札価格指定（vCPM）です。</span><span lang=\"en\">Max. bid value (vCPM)</span></dd>   <dt class=\"term__item\">SOV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">SOV割合指定です。</span><span lang=\"en\">Specified SOV rate.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceCampaignBiddingStrategyType {
  
  MAX_VCPM("MAX_VCPM"),
  
  SOV("SOV"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceCampaignBiddingStrategyType(String value) {
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
  public static GuaranteedInventoryServiceCampaignBiddingStrategyType fromValue(String value) {
    for (GuaranteedInventoryServiceCampaignBiddingStrategyType b : GuaranteedInventoryServiceCampaignBiddingStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


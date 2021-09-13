package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupServiceCampaignBiddingStrategyTypeは、キャンペーン入札戦略タイプの設定を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※目的なしのキャンペーンの場合はNONE固定となります。 </div> <div lang=\"en\"> AdGroupServiceCampaignBiddingStrategyType serves setting of Campaign bid strategy type.<br> Although this field will be returned in the response, it will be ignored on input.<br> *For campaigns with no campaignGoal, it is set to \"NONE\". </div> <dl class=term>   <dt class=\"term__item\">AUTO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札</span><span lang=\"en\">Auto bidding</span></dd>   <dt class=\"term__item\">MAXIMIZE_CONVERSIONS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン数最大化</span><span lang=\"en\">Maximize conversion</span></dd>   <dt class=\"term__item\">MAXIMIZE_CLICKS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">クリック数最大化</span><span lang=\"en\">Maximize clicks</span></dd>   <dt class=\"term__item\">MAXIMIZE_VIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ビュー数最大化</span><span lang=\"en\">Maximize video views</span></dd>   <dt class=\"term__item\">MAXIMIZE_VIEABLEIMPRESSIONS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ビューアブルインプレッション数最大化</span><span lang=\"en\">Maximize vimps</span></dd>   <dt class=\"term__item\">MAX_VCPM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大入札価格指定（vCPM）</span><span lang=\"en\">Max. bid value (vCPM)</span></dd>   <dt class=\"term__item\">MAX_CPC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大入札価格指定（CPC）</span><span lang=\"en\">Max. bid value (CPC)</span></dd>   <dt class=\"term__item\">MAX_CPV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最大入札価格指定（CPV）</span><span lang=\"en\">Max. bid value(CPV)</span></dd>   <dt class=\"term__item\">TARGET_CPA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">目標単価指定（CPA）</span><span lang=\"en\">Target cost specification (CPA)</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入札戦略指定なし</span><span lang=\"en\">No Setting of bid strategy</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceCampaignBiddingStrategyType {
  
  AUTO("AUTO"),
  
  MAXIMIZE_CONVERSIONS("MAXIMIZE_CONVERSIONS"),
  
  MAXIMIZE_CLICKS("MAXIMIZE_CLICKS"),
  
  MAXIMIZE_VIEW("MAXIMIZE_VIEW"),
  
  MAXIMIZE_VIEABLEIMPRESSIONS("MAXIMIZE_VIEABLEIMPRESSIONS"),
  
  MAX_VCPM("MAX_VCPM"),
  
  MAX_CPC("MAX_CPC"),
  
  MAX_CPV("MAX_CPV"),
  
  TARGET_CPA("TARGET_CPA"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceCampaignBiddingStrategyType(String value) {
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
  public static AdGroupServiceCampaignBiddingStrategyType fromValue(String value) {
    for (AdGroupServiceCampaignBiddingStrategyType b : AdGroupServiceCampaignBiddingStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


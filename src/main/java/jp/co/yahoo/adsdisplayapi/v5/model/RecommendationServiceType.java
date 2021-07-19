package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> RecommendationServiceTypeは、最適化提案の種別です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> RecommendationServiceType is a type of Recommendations.<br> This field is required in requests. </div> <dl class=term>   <dt class=\"term__item\">DAILY_BUDGET_OVER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1日の予算上限に達したキャンペーンです。</span><span lang=\"en\">Campaigns that reached the daily budget.</span></dd>   <dt class=\"term__item\">IMPRESSION_SHARE_BUDGET_LOSS_OVER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">インプレッションシェア損失率（予算）が大きいキャンペーンです。</span><span lang=\"en\">Campaigns that have a large lost impression share (budget).</span></dd>   <dt class=\"term__item\">BID_STRATEGY_TO_TARGET_CPA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札（コンバージョン単価の目標値）に適しているキャンペーンです。</span><span lang=\"en\">Campaigns that are suitable for using autobidding (target CPA).</span></dd>   <dt class=\"term__item\">MIGRATE_TO_YDA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ディスプレイ広告（運用型）形式への変換が必要なキャンペーンです。</span><span lang=\"en\">Campaigns that are required to convert to Display Ads (Auction).</span></dd>   <dt class=\"term__item\">SEARCH_KEYWORD_LIST_IDEA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">追加を推奨するサーチキーワードです。</span><span lang=\"en\">Recommended search keywords to add.</span></dd>   <dt class=\"term__item\">CAMPAIGNS_FOR_ADDING_ADS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入稿していない画像サイズが存在するキャンペーンです。</span><span lang=\"en\">Campaigns with an image size that have not been submitted.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RecommendationServiceType {
  
  DAILY_BUDGET_OVER("DAILY_BUDGET_OVER"),
  
  IMPRESSION_SHARE_BUDGET_LOSS_OVER("IMPRESSION_SHARE_BUDGET_LOSS_OVER"),
  
  BID_STRATEGY_TO_TARGET_CPA("BID_STRATEGY_TO_TARGET_CPA"),
  
  MIGRATE_TO_YDA("MIGRATE_TO_YDA"),
  
  SEARCH_KEYWORD_LIST_IDEA("SEARCH_KEYWORD_LIST_IDEA"),
  
  CAMPAIGNS_FOR_ADDING_ADS("CAMPAIGNS_FOR_ADDING_ADS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RecommendationServiceType(String value) {
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
  public static RecommendationServiceType fromValue(String value) {
    for (RecommendationServiceType b : RecommendationServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


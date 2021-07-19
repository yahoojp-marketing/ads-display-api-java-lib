package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceCampaignGoalFilterTypeは、キャンペーン目的の有無でキャンペーンをフィルタリングするための設定です。</div> <div lang=\"en\">AdGroupAdServiceCampaignGoalFilterType is a setting for filtering campaigns \"with campaignGoal\" or \"with no campaignGoal\".</div> <dl class=term>   <dt class=\"term__item\">NON_GOAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">目的なしキャンペーンのみ取得</span><span lang=\"en\">Only campaigns with no campaignGoal</span></dd>   <dt class=\"term__item\">GOAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">目的ありキャンペーンのみ取得</span><span lang=\"en\">Only campaigns with campaignGoal</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全てのキャンペーンを取得（DEFAULT）</span><span lang=\"en\">ALL campaigns（Default）</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceCampaignGoalFilterType {
  
  ALL("ALL"),
  
  NON_GOAL("NON_GOAL"),
  
  GOAL("GOAL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceCampaignGoalFilterType(String value) {
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
  public static AdGroupAdServiceCampaignGoalFilterType fromValue(String value) {
    for (AdGroupAdServiceCampaignGoalFilterType b : AdGroupAdServiceCampaignGoalFilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


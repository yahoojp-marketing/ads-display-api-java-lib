package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> CampaignServiceGoalFilterTypeは、キャンペーン目的の有無でキャンペーンをフィルタリングするための設定です。<br> ※Campaign.campaignGoalがNONEの場合は「目的なし」、NONE以外の場合は「目的あり」と定義します。 </div> <div lang=\"en\"> CampaignServiceGoalFilterType is a setting for filtering campaigns &#34;with campaignGoal&#34; or &#34;with no campaignGoal&#34;. </div> <dl class=term>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全てのキャンペーンを取得（DEFAULT）</span><span lang=\"en\">All campaigns (Default)</span></dd>   <dt class=\"term__item\">NON_GOAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">目的なしキャンペーンのみ取得</span><span lang=\"en\">Only campaigns with no campaignGoal</span></dd>   <dt class=\"term__item\">GOAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">目的ありキャンペーンのみ取得</span><span lang=\"en\">Only campaigns with campaignGoal</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceGoalFilterType {
  
  ALL("ALL"),
  
  NON_GOAL("NON_GOAL"),
  
  GOAL("GOAL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceGoalFilterType(String value) {
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
  public static CampaignServiceGoalFilterType fromValue(String value) {
    for (CampaignServiceGoalFilterType b : CampaignServiceGoalFilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


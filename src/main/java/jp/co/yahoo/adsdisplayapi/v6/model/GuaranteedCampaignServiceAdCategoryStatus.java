package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedCampaignServiceAdCategoryStatusは、予約型のキャンペーンの広告カテゴリーステータスを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedCampaignServiceAdCategoryStatus describes the ad category status of a guaranteed campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">ADDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告カテゴリーを設定済みです。</span><span lang=\"en\">Ad Category is already specified.</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告カテゴリーの設定はありません。</span><span lang=\"en\">Ad Category is not specified.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedCampaignServiceAdCategoryStatus {
  
  ADDED("ADDED"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedCampaignServiceAdCategoryStatus(String value) {
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
  public static GuaranteedCampaignServiceAdCategoryStatus fromValue(String value) {
    for (GuaranteedCampaignServiceAdCategoryStatus b : GuaranteedCampaignServiceAdCategoryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


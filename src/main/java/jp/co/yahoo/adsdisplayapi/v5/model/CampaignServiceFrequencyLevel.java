package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> CampaignServiceFrequencyLevelは、フリークエンシー制限単位を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Frequency setting level.<br> This field is optional in ADD and SET operation. </div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーン単位でのフリークエンシー設定です。</span><span lang=\"en\">Frequency Setting per Campaign</span></dd>   <dt class=\"term__item\">AD_GROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループ単位でのフリークエンシー設定です。</span><span lang=\"en\">Frequency Setting per Ad Group</span></dd>   <dt class=\"term__item\">AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告単位でのフリークエンシー設定です。</span><span lang=\"en\">Frequency Setting per Ad</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceFrequencyLevel {
  
  CAMPAIGN("CAMPAIGN"),
  
  AD_GROUP("AD_GROUP"),
  
  AD("AD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceFrequencyLevel(String value) {
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
  public static CampaignServiceFrequencyLevel fromValue(String value) {
    for (CampaignServiceFrequencyLevel b : CampaignServiceFrequencyLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


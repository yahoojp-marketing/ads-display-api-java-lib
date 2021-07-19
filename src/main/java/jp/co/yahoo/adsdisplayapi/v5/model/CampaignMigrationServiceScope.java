package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignMigrationServiceScopeはマイグレーションの対象となるキャンペーンの範囲を示します。</div> <div lang=\"en\">CampaignMigrationServiceScope indicates the campaign scope to be migrated.</div> <dl class=term>   <dt class=\"term__item\">SINGLE_ACCOUNT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">単一アカウント</span><span lang=\"en\">Single account</span></dd>   <dt class=\"term__item\">ALL_ACCOUNT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全アカウント</span><span lang=\"en\">All accounts</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignMigrationServiceScope {
  
  SINGLE_ACCOUNT("SINGLE_ACCOUNT"),
  
  ALL_ACCOUNT("ALL_ACCOUNT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignMigrationServiceScope(String value) {
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
  public static CampaignMigrationServiceScope fromValue(String value) {
    for (CampaignMigrationServiceScope b : CampaignMigrationServiceScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


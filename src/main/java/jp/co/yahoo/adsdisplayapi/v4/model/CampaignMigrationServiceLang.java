package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignMigrationServiceLangはマイグレーション処理の言語を示します。</div> <div lang=\"en\">CampaignMigrationServiceLang indicates language of the migration process.</div> <dl class=term>   <dt class=\"term__item\">JA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日本語です。</span><span lang=\"en\">Japanese</span></dd>   <dt class=\"term__item\">EN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">英語です。</span><span lang=\"en\">English</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignMigrationServiceLang {
  
  JA("JA"),
  
  EN("EN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignMigrationServiceLang(String value) {
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
  public static CampaignMigrationServiceLang fromValue(String value) {
    for (CampaignMigrationServiceLang b : CampaignMigrationServiceLang.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


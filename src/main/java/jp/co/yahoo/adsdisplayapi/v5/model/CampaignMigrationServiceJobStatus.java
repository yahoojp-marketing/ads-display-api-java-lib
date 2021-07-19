package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignMigrationServiceJobStatusはマイグレーションジョブの状態を示します。</div> <div lang=\"en\">CampaignMigrationServiceJobStatus object indicates migration job status.</div> <dl class=term>   <dt class=\"term__item\">NOT_STARTED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未処理</span><span lang=\"en\">Unprocessed</span></dd>   <dt class=\"term__item\">IN_PROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理中</span><span lang=\"en\">In progress</span></dd>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">正常終了</span><span lang=\"en\">Completed</span></dd>   <dt class=\"term__item\">FILE_FORMAT_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルフォーマットエラー</span><span lang=\"en\">File format error</span></dd>   <dt class=\"term__item\">INVALID_CSV_VALUE_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">異常なCSVの値</span><span lang=\"en\">Abnormal CSV value</span></dd>   <dt class=\"term__item\">UNKNOWN_CSV_FIELD_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知のCSVフィールドエラー</span><span lang=\"en\">Unknown CSV field error</span></dd>   <dt class=\"term__item\">SYSTEM_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">システムエラー</span><span lang=\"en\">System error</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignMigrationServiceJobStatus {
  
  NOT_STARTED("NOT_STARTED"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  COMPLETED("COMPLETED"),
  
  FILE_FORMAT_ERROR("FILE_FORMAT_ERROR"),
  
  INVALID_CSV_VALUE_ERROR("INVALID_CSV_VALUE_ERROR"),
  
  UNKNOWN_CSV_FIELD_ERROR("UNKNOWN_CSV_FIELD_ERROR"),
  
  SYSTEM_ERROR("SYSTEM_ERROR"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignMigrationServiceJobStatus(String value) {
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
  public static CampaignMigrationServiceJobStatus fromValue(String value) {
    for (CampaignMigrationServiceJobStatus b : CampaignMigrationServiceJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


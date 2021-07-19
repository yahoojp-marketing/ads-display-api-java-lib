package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AuditLogServiceUpdateSourceは、ダウンロード対象のデータに対して更新を行ったツールの種別を表します。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> AuditLogServiceUpdateSource serves update tool type of the download data.<br> This field is optional in requests. </div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN_MANAGEMENT_TOOL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告管理ツールからの履歴です。</span><span lang=\"en\">Campaign Management Tool</span></dd>   <dt class=\"term__item\">API</dt>   <dd class=\"term__desc\"><span lang=\"ja\">APIからの履歴です。</span><span lang=\"en\">API</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべての操作者からの履歴です。</span><span lang=\"en\">Operated　by all of operators.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AuditLogServiceUpdateSource {
  
  CAMPAIGN_MANAGEMENT_TOOL("CAMPAIGN_MANAGEMENT_TOOL"),
  
  API("API"),
  
  ALL("ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AuditLogServiceUpdateSource(String value) {
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
  public static AuditLogServiceUpdateSource fromValue(String value) {
    for (AuditLogServiceUpdateSource b : AuditLogServiceUpdateSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


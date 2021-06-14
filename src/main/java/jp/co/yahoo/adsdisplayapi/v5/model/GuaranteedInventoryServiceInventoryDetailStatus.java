package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedInventoryServiceInventoryDetailStatusは、在庫確認の実行ステータスの詳細を表します。</div> <div lang=\"en\">GuaranteedInventoryServiceInventoryDetailStatus describes the execution status details of inventory check.</div> <dl class=term>   <dt class=\"term__item\">WAIT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未処理です。</span><span lang=\"en\">Not yet processed.</span></dd>   <dt class=\"term__item\">SUCCEEDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完了しています。</span><span lang=\"en\">Completed.</span></dd>   <dt class=\"term__item\">FAILED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">失敗しています。</span><span lang=\"en\">Failed.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceInventoryDetailStatus {
  
  WAIT("WAIT"),
  
  SUCCEEDED("SUCCEEDED"),
  
  FAILED("FAILED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceInventoryDetailStatus(String value) {
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
  public static GuaranteedInventoryServiceInventoryDetailStatus fromValue(String value) {
    for (GuaranteedInventoryServiceInventoryDetailStatus b : GuaranteedInventoryServiceInventoryDetailStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


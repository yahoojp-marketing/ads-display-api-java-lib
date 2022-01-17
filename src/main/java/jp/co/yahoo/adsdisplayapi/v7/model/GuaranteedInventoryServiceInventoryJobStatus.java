package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedInventoryServiceInventoryJobStatusは、在庫確認ジョブの実行ステータスを表します。</div> <div lang=\"en\">GuaranteedInventoryServiceInventoryJobStatus describes the execution status of inventory check job.</div> <dl class=term>   <dt class=\"term__item\">PROCESSING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ジョブが処理中です。</span><span lang=\"en\">Job is in process. </span></dd>   <dt class=\"term__item\">SUCCEEDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ジョブが完了しています。</span><span lang=\"en\">Job completed.</span></dd>   <dt class=\"term__item\">FAILED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ジョブが失敗して終了しています。</span><span lang=\"en\">Job failed. </span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceInventoryJobStatus {
  
  PROCESSING("PROCESSING"),
  
  SUCCEEDED("SUCCEEDED"),
  
  FAILED("FAILED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceInventoryJobStatus(String value) {
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
  public static GuaranteedInventoryServiceInventoryJobStatus fromValue(String value) {
    for (GuaranteedInventoryServiceInventoryJobStatus b : GuaranteedInventoryServiceInventoryJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


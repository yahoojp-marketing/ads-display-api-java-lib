package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceJobStatusはアップロードジョブの状態を示します。</div> <div lang=\"en\">RetargetingListServiceJobStatus indicates the status of the upload job.</div> <div lang=\"ja\">   * ステータスが「RECEIVED」になった後、通常は数時間でユーザーリストの反映が完了します。<br>   * ステータスが「INVALID_FILE」の場合、ファイル内容に問題がある、ファイルフォーマットが間違っている、あるいはファイルサイズが上限（1,073,741,824 byte）を超えています。<br>   * ステータスが「FAILED」の場合、ファイル内容以外に起因する問題でジョブが正常に完了しなかったことを意味します。 </div> <div lang=\"en\">   * The user list will usually be reflected within a few hours after the status becomes \"RECEIVED\".<br>   * If the status is \"INVALID_FILE\", there is a problem with the file contents, the file format is incorrect, or the file size exceeds the upper limit (1,073,741,824 bytes).<br>   * If the status is \"FAILED\", it means that the job did not complete successfully due to a problem other than the file contents. </div> <dl class=term>   <dt class=\"term__item\">RECEIVING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ取り込み中です。</span><span lang=\"en\">Data is being imported.</span></dd>   <dt class=\"term__item\">RECEIVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ取り込み完了です。</span><span lang=\"en\">Importing data is completed.</span></dd>   <dt class=\"term__item\">INVALID_FILE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルフォーマットエラーです。</span><span lang=\"en\">File format error.</span></dd>   <dt class=\"term__item\">FAILED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ジョブが失敗しました。</span><span lang=\"en\">Job failed.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum RetargetingListServiceJobStatus {
  
  RECEIVING("RECEIVING"),
  
  RECEIVED("RECEIVED"),
  
  INVALID_FILE("INVALID_FILE"),
  
  FAILED("FAILED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceJobStatus(String value) {
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
  public static RetargetingListServiceJobStatus fromValue(String value) {
    for (RetargetingListServiceJobStatus b : RetargetingListServiceJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


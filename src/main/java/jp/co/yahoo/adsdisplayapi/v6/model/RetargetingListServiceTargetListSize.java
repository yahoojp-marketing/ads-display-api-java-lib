package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> RetargetingListServiceTargetListSizeは、類似ターゲットリストのサイズを表します。<br> similarityTargetList配下では、ADD時およびSET時に省略可能となり、REMOVE時に無視されます。<br> ※ADD時のデフォルト設定値はRATE_10となります。<br> targetListSizeReaches配下では、このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> RetargetingListServiceTargetListSize serves target list size of similarity target list. <br> Under similaritytargetList, this field is optional in ADD and SET operation, and will be ignored in REMOVE operation. <br> *The default value in ADD operation will be RATE_10. <br> Under targetListSizeReaches, although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">RATE_1</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.1</span><span lang=\"en\">Similarity: Threshold 0.1</span></dd>   <dt class=\"term__item\">RATE_2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.2</span><span lang=\"en\">Similarity: Threshold 0.2</span></dd>   <dt class=\"term__item\">RATE_3</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.3</span><span lang=\"en\">Similarity: Threshold 0.3</span></dd>   <dt class=\"term__item\">RATE_4</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.4</span><span lang=\"en\">Similarity: Threshold 0.4</span></dd>   <dt class=\"term__item\">RATE_5</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.5</span><span lang=\"en\">Similarity: Threshold 0.5</span></dd>   <dt class=\"term__item\">RATE_6</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.6</span><span lang=\"en\">Similarity: Threshold 0.6</span></dd>   <dt class=\"term__item\">RATE_7</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.7</span><span lang=\"en\">Similarity: Threshold 0.7</span></dd>   <dt class=\"term__item\">RATE_8</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.8</span><span lang=\"en\">Similarity: Threshold 0.8</span></dd>   <dt class=\"term__item\">RATE_9</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値0.9</span><span lang=\"en\">Similarity: Threshold 0.9</span></dd>   <dt class=\"term__item\">RATE_10</dt>   <dd class=\"term__desc\"><span lang=\"ja\">類似度：閾値1.0</span><span lang=\"en\">Similarity: Threshold 1.0</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceTargetListSize {
  
  RATE_1("RATE_1"),
  
  RATE_2("RATE_2"),
  
  RATE_3("RATE_3"),
  
  RATE_4("RATE_4"),
  
  RATE_5("RATE_5"),
  
  RATE_6("RATE_6"),
  
  RATE_7("RATE_7"),
  
  RATE_8("RATE_8"),
  
  RATE_9("RATE_9"),
  
  RATE_10("RATE_10"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceTargetListSize(String value) {
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
  public static RetargetingListServiceTargetListSize fromValue(String value) {
    for (RetargetingListServiceTargetListSize b : RetargetingListServiceTargetListSize.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


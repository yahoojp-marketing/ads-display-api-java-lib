package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> RetargetingListServiceRuleTypeは、ルールタイプのリストの種類を表示します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> RetargetingListServiceRuleType display the type of the rule. <br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation. </div> <dl class=term>   <dt class=\"term__item\">URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">URLを利用したリスト設定</span><span lang=\"en\">List setting using the URL.</span></dd>   <dt class=\"term__item\">LABEL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムラベルを利用したリスト設定</span><span lang=\"en\">List setting using the Custom label.</span></dd>   <dt class=\"term__item\">REFERER_URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リファラURLを利用したリスト設定</span><span lang=\"en\">List setting using the Referer URL.</span></dd>   <dt class=\"term__item\">PAGE_TYPE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ページ種別を利用したリスト設定</span><span lang=\"en\">List setting using the page type.</span></dd>   <dt class=\"term__item\">ITEM_ID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アイテムIDを利用したリスト設定</span><span lang=\"en\">List setting using the Item ID.</span></dd>   <dt class=\"term__item\">ITEM_CATEGORY_ID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アイテムカテゴリーを利用したリスト設定</span><span lang=\"en\">List setting using the Item category.</span></dd>   <dt class=\"term__item\">EVENT_TYPE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">イベント種別を利用したリスト設定</span><span lang=\"en\">List setting using the event type.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceRuleType {
  
  URL("URL"),
  
  LABEL("LABEL"),
  
  REFERER_URL("REFERER_URL"),
  
  PAGE_TYPE("PAGE_TYPE"),
  
  ITEM_ID("ITEM_ID"),
  
  ITEM_CATEGORY_ID("ITEM_CATEGORY_ID"),
  
  EVENT_TYPE("EVENT_TYPE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceRuleType(String value) {
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
  public static RetargetingListServiceRuleType fromValue(String value) {
    for (RetargetingListServiceRuleType b : RetargetingListServiceRuleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


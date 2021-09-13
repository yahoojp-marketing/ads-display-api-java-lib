package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedSimulationServiceUnreservableReasonは、予約ができない理由を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedSimulationServiceUnreservableReason describes the reason why reservation is not possible.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">NOT_ENOUGH_DELIVERY_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信対象が少なすぎます。</span><span lang=\"en\">Not enough delivery targets.</span></dd>   <dt class=\"term__item\">OUT_OF_STOCK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信在庫がありません。</span><span lang=\"en\">No delivery stock.</span></dd>   <dt class=\"term__item\">OUT_OF_STOCK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1日のSOV予約上限に達しています。</span><span lang=\"en\">Number of SOV exceeded the daily limit./span></dd>   <dt class=\"term__item\">OUT_OF_STOCK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1週間のSOV予約上限に達しています。</span><span lang=\"en\">Number of SOV exceeded the weekly limit.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceUnreservableReason {
  
  NOT_ENOUGH_DELIVERY_TARGET("NOT_ENOUGH_DELIVERY_TARGET"),
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  OVER_SOV_DAILY_LIMIT("OVER_SOV_DAILY_LIMIT"),
  
  OVER_SOV_WEEKLY_LIMIT("OVER_SOV_WEEKLY_LIMIT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceUnreservableReason(String value) {
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
  public static GuaranteedSimulationServiceUnreservableReason fromValue(String value) {
    for (GuaranteedSimulationServiceUnreservableReason b : GuaranteedSimulationServiceUnreservableReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


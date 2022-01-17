package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedInventoryServiceReservationStatusは、予約型キャンペーンの予約可否ステータスを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedInventoryServiceReservationStatus describes the reservation availability status of guaranteed campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">RESERVABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約可能です。</span><span lang=\"en\">Can be reserved.</span></dd>   <dt class=\"term__item\">UNRESERVABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約不可能です。</span><span lang=\"en\">Cannot be reserved.</span></dd>   <dt class=\"term__item\">RESERVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約済みです。</span><span lang=\"en\">Reserved.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceReservationStatus {
  
  RESERVABLE("RESERVABLE"),
  
  UNRESERVABLE("UNRESERVABLE"),
  
  RESERVED("RESERVED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceReservationStatus(String value) {
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
  public static GuaranteedInventoryServiceReservationStatus fromValue(String value) {
    for (GuaranteedInventoryServiceReservationStatus b : GuaranteedInventoryServiceReservationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


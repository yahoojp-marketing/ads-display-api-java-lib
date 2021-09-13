package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountServiceDeliveryStatusは、アカウントの配信状況を表します。<br> SET時、このフィールドは省略可能となります。<br> MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。 </div> <div lang=\"en\"> AccountServiceDeliveryStatus serves the account delivery status.<br> This field is optional in SET operation.<br> If isManagerAccount is \"TRUE\", this field will not be returned and will be ignored on request. </div> <dl class=term>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オンラインです。</span><span lang=\"en\">Online</span></dd>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オフラインです。</span><span lang=\"en\">Offline</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountServiceDeliveryStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceDeliveryStatus(String value) {
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
  public static AccountServiceDeliveryStatus fromValue(String value) {
    for (AccountServiceDeliveryStatus b : AccountServiceDeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AudienceListServiceDeliveryStatusは、アカウントの配信状況を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AudienceListServiceDeliveryStatus serves the account delivery status.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オンラインです。</span><span lang=\"en\">Online</span></dd>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オフラインです。</span><span lang=\"en\">Offline</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AudienceListServiceDeliveryStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AudienceListServiceDeliveryStatus(String value) {
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
  public static AudienceListServiceDeliveryStatus fromValue(String value) {
    for (AudienceListServiceDeliveryStatus b : AudienceListServiceDeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


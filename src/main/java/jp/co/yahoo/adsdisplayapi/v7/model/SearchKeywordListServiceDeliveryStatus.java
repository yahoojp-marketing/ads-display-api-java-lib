package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">SearchKeywordListServiceDeliveryStatusは、アカウントの配信状況を表します。</div> <div lang=\"en\">SearchKeywordListServiceDeliveryStatus serves the account delivery status.</div> <dl class=term>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オフラインです。</span><span lang=\"en\">Offline</span></dd>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オンラインです。</span><span lang=\"en\">Online</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SearchKeywordListServiceDeliveryStatus {
  
  PAUSED("PAUSED"),
  
  ACTIVE("ACTIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordListServiceDeliveryStatus(String value) {
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
  public static SearchKeywordListServiceDeliveryStatus fromValue(String value) {
    for (SearchKeywordListServiceDeliveryStatus b : SearchKeywordListServiceDeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AccountLinkServiceAccountStatusは、アカウントの登録状況を表します。</div> <div lang=\"en\">AccountLinkServiceAccountStatus displays the account registration status.</div> <dl class=term>   <dt class=\"term__item\">INPROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中です。</span><span lang=\"en\">Under review.</span></dd>   <dt class=\"term__item\">WAIT_DECIDE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">確定待ちです。</span><span lang=\"en\">Waiting to be confirmed.</span></dd>   <dt class=\"term__item\">SUSPENDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス停止です。</span><span lang=\"en\">The account service is paused.</span></dd>   <dt class=\"term__item\">SERVING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス中です。</span><span lang=\"en\">The account is active.</span></dd>   <dt class=\"term__item\">ENDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス終了です。</span><span lang=\"en\">The account service has been ended.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountLinkServiceAccountStatus {
  
  INPROGRESS("INPROGRESS"),
  
  WAIT_DECIDE("WAIT_DECIDE"),
  
  SUSPENDED("SUSPENDED"),
  
  SERVING("SERVING"),
  
  ENDED("ENDED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountLinkServiceAccountStatus(String value) {
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
  public static AccountLinkServiceAccountStatus fromValue(String value) {
    for (AccountLinkServiceAccountStatus b : AccountLinkServiceAccountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


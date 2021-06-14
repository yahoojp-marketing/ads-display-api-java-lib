package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AccountServiceStatusは、アカウントの登録状況を表します。<br> MCCアカウントの場合、このフィールドは<code>SERVING</code>になります。</div> <div lang=\"en\">AccountServiceStatus displays the account registration status.<br> If isManagerAccount is \"TRUE\", this field will be <code>SERVING</code>.</div> <dl class=term>   <dt class=\"term__item\">INPROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">登録待ち。</span><span lang=\"en\">Under the registration process.</span></dd>   <dt class=\"term__item\">WAIT_DECIDE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">確定待ち。</span><span lang=\"en\">Waiting to be confirmed.</span></dd>   <dt class=\"term__item\">SUSPENDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス停止。</span><span lang=\"en\">The account service is paused.</span></dd>   <dt class=\"term__item\">SERVING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス中。</span><span lang=\"en\">The account is active.</span></dd>   <dt class=\"term__item\">ENDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス終了。</span><span lang=\"en\">The account service has been ended.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountServiceStatus {
  
  INPROGRESS("INPROGRESS"),
  
  WAIT_DECIDE("WAIT_DECIDE"),
  
  SUSPENDED("SUSPENDED"),
  
  SERVING("SERVING"),
  
  ENDED("ENDED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceStatus(String value) {
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
  public static AccountServiceStatus fromValue(String value) {
    for (AccountServiceStatus b : AccountServiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


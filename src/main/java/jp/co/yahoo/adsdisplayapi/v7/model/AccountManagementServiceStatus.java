package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountManagementServiceStatusオブジェクトは、アカウントの契約状況を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AccountManagementServiceStatus object describes contract status of account.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">INPROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中です。</span><span lang=\"en\">Under review.</span></dd>   <dt class=\"term__item\">WAIT_DECIDE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">確定待ちです。</span><span lang=\"en\">Waiting confirmation.</span></dd>   <dt class=\"term__item\">SUSPENDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス停止中です。</span><span lang=\"en\">The account service is not active.</span></dd>   <dt class=\"term__item\">SERVING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス中です。</span><span lang=\"en\">The account is active.</span></dd>   <dt class=\"term__item\">ENDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービス終了です。</span><span lang=\"en\">The account service has ended.</span></dd>   <dt class=\"term__item\">CANCELED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">解約済みです。</span><span lang=\"en\">The account service has been canceled.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum AccountManagementServiceStatus {
  
  INPROGRESS("INPROGRESS"),
  
  WAIT_DECIDE("WAIT_DECIDE"),
  
  SUSPENDED("SUSPENDED"),
  
  SERVING("SERVING"),
  
  ENDED("ENDED"),
  
  CANCELED("CANCELED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceStatus(String value) {
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
  public static AccountManagementServiceStatus fromValue(String value) {
    for (AccountManagementServiceStatus b : AccountManagementServiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


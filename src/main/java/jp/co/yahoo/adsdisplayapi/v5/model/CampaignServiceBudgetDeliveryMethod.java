package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> CampaignServiceBudgetDeliveryMethodは、配信方法を表します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※目的ありの場合、ADDおよびSET時に設定不可となります。 </div> <div lang=\"en\"> CampaignServiceBudgetDeliveryMethod serves delivery method of budget.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. <br> *For campaigns with campaign goal, this field cannot be set in ADD and SET operation. </div> <dl class=term>   <dt class=\"term__item\">STANDARD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1日の中で均等に広告を表示します。</span><span lang=\"en\">The budget server will throttle serving evenly across the entire time period.</span></dd>   <dt class=\"term__item\">ACCELERATED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">できるだけ早く広告を配信します。</span><span lang=\"en\">The budget server will not throttle serving, and ads will serve as fast as possible.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceBudgetDeliveryMethod {
  
  STANDARD("STANDARD"),
  
  ACCELERATED("ACCELERATED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceBudgetDeliveryMethod(String value) {
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
  public static CampaignServiceBudgetDeliveryMethod fromValue(String value) {
    for (CampaignServiceBudgetDeliveryMethod b : CampaignServiceBudgetDeliveryMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> CampaignServiceDeviceOsTypeは、配信先デバイスのOSの種類を表します。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> CampaignServiceDeviceOsType serves OS types for devices to be posted on.<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation. <br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">ANDROID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Android向けに配信されます。</span><span lang=\"en\">Deliver to Android.</span></dd>   <dt class=\"term__item\">IOS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">iOS向けに配信されます。</span><span lang=\"en\">Deliver to iOS.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceDeviceOsType {
  
  ANDROID("ANDROID"),
  
  IOS("IOS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceDeviceOsType(String value) {
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
  public static CampaignServiceDeviceOsType fromValue(String value) {
    for (CampaignServiceDeviceOsType b : CampaignServiceDeviceOsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


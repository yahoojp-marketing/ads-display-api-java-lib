package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> CampaignServiceTypeは、キャンペーンタイプを表します。<br> このフィールドは、ADD時は指定できず、SET・REMOVE時は無視されます。<br> 目的ありの場合、設定値はSTANDARDに固定されます。 </div> <div lang=\"en\"> CampaignServiceType serves type of campaign.<br> This field is not allowed in ADD operation, and will be ignored in SET and REMOVE operation. <br> For campaigns with campaign goal, it is set to STANDARD. </div> <dl class=term>   <dt class=\"term__item\">STANDARD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">標準キャンペーン</span><span lang=\"en\">Standard campaign</span></dd>   <dt class=\"term__item\">APP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリインストール広告キャンペーン</span><span lang=\"en\">App Install Ads campaign</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceType {
  
  STANDARD("STANDARD"),
  
  APP("APP"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceType(String value) {
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
  public static CampaignServiceType fromValue(String value) {
    for (CampaignServiceType b : CampaignServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


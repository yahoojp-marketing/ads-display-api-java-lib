package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupServiceDeviceAppTypeは、配信先のアプリケーション種別を表します。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> AdGroupServiceDeviceAppType serves application types for devices.<br> This field is optional in ADD and SET operation. </div> <dl class=term>   <dt class=\"term__item\">APP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリ向けに配信されます。</span><span lang=\"en\">Deliver to apps.</span></dd>   <dt class=\"term__item\">WEB</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブサイト向けに配信されます。</span><span lang=\"en\">Deliver to the Web.</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべてに配信されます。<br>※AdGroupServiceのみ設定可能</span><span lang=\"en\">Deliver to all devices.<br>*Setting NONE is only available for AdGroupService.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceDeviceAppType {
  
  APP("APP"),
  
  WEB("WEB"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceDeviceAppType(String value) {
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
  public static AdGroupServiceDeviceAppType fromValue(String value) {
    for (AdGroupServiceDeviceAppType b : AdGroupServiceDeviceAppType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


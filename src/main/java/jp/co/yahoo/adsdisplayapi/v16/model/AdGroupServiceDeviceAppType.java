/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceDeviceAppTypeは、配信先のアプリケーション種別を表します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; deviceTypeがDESKTOPまたはWAP_MOBILEの場合は、deviceAppTypeを指定することはできません。&lt;br&gt; deviceTypeがNONEの場合は、deviceAppTypeまたはdeviceOsTypeのいずれかを指定する必要があります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceDeviceAppType serves application types for devices.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; If deviceType is DESKTOP or WAP_MOBILE, deviceAppType cannot be specified.&lt;br&gt; If deviceType is NONE, deviceAppType or deviceOsType must be specified. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリ向けに配信されます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Deliver to apps.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WEB&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ウェブサイト向けに配信されます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Deliver to the Web.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NONE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;すべてに配信されます。&lt;br&gt;※AdGroupServiceのみ設定可能&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Deliver to all devices.&lt;br&gt;*Setting NONE is only available for AdGroupService.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
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


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupServiceDeviceTypeは、配信先デバイスの種類を表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、NONEとDESKTOPを指定することはできません。 </div> <div lang=\"en\"> AdGroupServiceDeviceType displays types of devices to be posted on.<br> This field is required in ADD operation, and will be optional in SET operation.<br> If campaignGoal is APP_PROMOTION, \"NONE\" and \"DESKTOP\" cannot be specified. </div> <dl class=term>   <dt class=\"term__item\">DESKTOP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">PC</span><span lang=\"en\">PC</span></dd>   <dt class=\"term__item\">WAP_MOBILE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">従来型携帯電話（フィーチャーフォン）</span><span lang=\"en\">Contemporary mobile phones (Feature Phone)</span></dd>   <dt class=\"term__item\">SMARTPHONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォン</span><span lang=\"en\">Smartphones</span></dd>   <dt class=\"term__item\">TABLET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タブレット</span><span lang=\"en\">Tablet device</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべてのデバイスに配信<br>※AdGroupServiceのみ設定可能</span><span lang=\"en\">Deliver to all usable devices.<br>*Setting NONE is only available for AdGroupService.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceDeviceType {
  
  DESKTOP("DESKTOP"),
  
  WAP_MOBILE("WAP_MOBILE"),
  
  SMARTPHONE("SMARTPHONE"),
  
  TABLET("TABLET"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceDeviceType(String value) {
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
  public static AdGroupServiceDeviceType fromValue(String value) {
    for (AdGroupServiceDeviceType b : AdGroupServiceDeviceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


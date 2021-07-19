package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> PlacementUrlListServiceUrlActiveFlgは、プレイスメントURLアクティブフラグを表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。 </div> <div lang=\"en\"> Placement Url Active Flag.<br> This field is optional in ADD and SET operation. </div> <dl class=term>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントターゲティングURL有効</span><span lang=\"en\">Active</span></dd>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">プレイスメントターゲティングURL無効</span><span lang=\"en\">Paused</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PlacementUrlListServiceUrlActiveFlg {
  
  PAUSED("PAUSED"),
  
  ACTIVE("ACTIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PlacementUrlListServiceUrlActiveFlg(String value) {
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
  public static PlacementUrlListServiceUrlActiveFlg fromValue(String value) {
    for (PlacementUrlListServiceUrlActiveFlg b : PlacementUrlListServiceUrlActiveFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedSimulationServiceActionAfterVideoAdTapは、動画広告をタップした後の動作を表します。<br> 指定されていない場合は動作指定不可となります。<br> *ADD時、NONEは指定できません。 </div> <div lang=\"en\"> GuaranteedSimulationServiceActionAfterVideoAdTap describes what happens after a video ad is tapped.<br> If this object is not specified, it is not possible to specify the action after a video ad is tapped.<br> * NONE cannot be specified in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">任意指定が可能です。</span><span lang=\"en\">Optional specification of the action is possible.</span></dd>   <dt class=\"term__item\">FOR_VIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動画をフルスクリーンで再生します。</span><span lang=\"en\">Play the video in full screen.</span></dd>   <dt class=\"term__item\">FOR_CLICK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ランディングページを表示します。</span><span lang=\"en\">Display the landing page.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceActionAfterVideoAdTap {
  
  NONE("NONE"),
  
  FOR_VIEW("FOR_VIEW"),
  
  FOR_CLICK("FOR_CLICK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceActionAfterVideoAdTap(String value) {
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
  public static GuaranteedSimulationServiceActionAfterVideoAdTap fromValue(String value) {
    for (GuaranteedSimulationServiceActionAfterVideoAdTap b : GuaranteedSimulationServiceActionAfterVideoAdTap.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


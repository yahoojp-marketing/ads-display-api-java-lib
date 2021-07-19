package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedInventoryServiceActionAfterVideoAdTapは、動画広告をタップした後の動作を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedInventoryServiceActionAfterVideoAdTap describes what happens after a video ad is tapped.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">任意指定が可能です。</span><span lang=\"en\">Optional specification of the action is possible.</span></dd>   <dt class=\"term__item\">FOR_VIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動画をフルスクリーンで再生します。</span><span lang=\"en\">Play the video in full screen.</span></dd>   <dt class=\"term__item\">FOR_CLICK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ランディングページを表示します。</span><span lang=\"en\">Display the landing page.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceActionAfterVideoAdTap {
  
  NONE("NONE"),
  
  FOR_VIEW("FOR_VIEW"),
  
  FOR_CLICK("FOR_CLICK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceActionAfterVideoAdTap(String value) {
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
  public static GuaranteedInventoryServiceActionAfterVideoAdTap fromValue(String value) {
    for (GuaranteedInventoryServiceActionAfterVideoAdTap b : GuaranteedInventoryServiceActionAfterVideoAdTap.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

